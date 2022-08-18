package edu.mayo.cts2.framework.configuration;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;


import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.util.ClassUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import edu.mayo.cts2.framework.model.core.Changeable;
import edu.mayo.cts2.framework.model.core.ChangeableElementGroup;
import edu.mayo.cts2.framework.model.core.TsAnyType;
import edu.mayo.cts2.framework.model.entity.EntityDescription;
import edu.mayo.cts2.framework.model.updates.ChangeableResource;

@Configuration
public class WebApplicationConfig implements WebMvcConfigurer  {
	

	private static final String MODEL_PACKAGE = "edu.mayo.cts2.framework.model";

    private static final String LIST_SUFFIX = "List";
    private static final String CHOICE_VALUE = "_choiceValue";

    private static final String ISO_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm'Z'";

	
	
    public void configureMessageConverters(
            List<HttpMessageConverter<?>> converters) {
            StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
            stringConverter.setWriteAcceptCharset(false);
            stringConverter.setSupportedMediaTypes(Collections
                .singletonList(MediaType.TEXT_PLAIN));
            converters.add(stringConverter);
            converters.add(new ByteArrayHttpMessageConverter());
            converters.add(new SourceHttpMessageConverter<>());
            GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
            gsonHttpMessageConverter.setGson(gson());
            gsonHttpMessageConverter.setSupportedMediaTypes(Arrays
                .asList(MediaType.APPLICATION_JSON));
            converters.removeIf(itm -> itm.getSupportedMediaTypes().contains(MediaType.APPLICATION_JSON));
            converters.add(gsonHttpMessageConverter);
        }
    
    
	@Bean
	public Gson gson() {

			GsonBuilder gson = new GsonBuilder();

	        gson.setDateFormat(ISO_DATE_FORMAT);
			
			gson.setExclusionStrategies(new ExclusionStrategy(){

				@Override
				public boolean shouldSkipField(FieldAttributes f) {
					return f.getName().equals(CHOICE_VALUE);
				}

				@Override
				public boolean shouldSkipClass(Class<?> clazz) {
					return false;
				}
				
			});
			
			gson.registerTypeAdapter(List.class, new EmptyCollectionSerializer());
			gson.registerTypeAdapter(TsAnyType.class, new TsAnyTypeSerializer());
	        gson.registerTypeAdapter(Date.class, new DateTypeAdapter());
	        gson.registerTypeAdapterFactory(new ChangeableTypeAdapterFactory());
	        gson.registerTypeAdapterFactory(new ChangeableResourceTypeAdapterFactory());
			
			gson.setFieldNamingStrategy(new FieldNamingStrategy(){

				@Override
				public String translateName(Field field) {
					String fieldName = field.getName();
					
					char[] array = fieldName.toCharArray();

					if(array[0] == '_'){
						array = ArrayUtils.remove(array, 0);
					}

	                String name = new String(array);
	                if(name.endsWith(LIST_SUFFIX)){
	                    name = StringUtils.removeEnd(name, LIST_SUFFIX);
	                }
					
					return name;
				}
				
			});
		
			return gson.create();
	}
	

	public static class EmptyCollectionSerializer implements JsonSerializer<List<?>> {

		/* (non-Javadoc)
		 * @see com.google.gson.JsonSerializer#serialize(java.lang.Object, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
		 */

		public JsonElement serialize(List<?> collection, Type typeOfSrc,
				JsonSerializationContext context) {
			if(CollectionUtils.isNotEmpty(collection)){
				return context.serialize(collection);
			} else {
				return null;
			}
		}

	}
	
	

	protected void setChoiceValue(Object obj) {
		try {
			for (Field f : obj.getClass().getDeclaredFields()) {
				f.setAccessible(true);
				Object fieldValue = f.get(obj);
				if (fieldValue != null && !ClassUtils.isPrimitiveOrWrapper(fieldValue.getClass())) {
					Field choiceValue = obj.getClass().getDeclaredField(CHOICE_VALUE);
					choiceValue.setAccessible(true);
					choiceValue.set(obj, fieldValue);
					break;
				}
			}
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
	
	/**
	 * The Class TsAnyTypeSerializer.
	 *
	 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
	 */
	public static class TsAnyTypeSerializer 
		implements JsonSerializer<TsAnyType>, JsonDeserializer<TsAnyType> {

		/* (non-Javadoc)
		 * @see com.google.gson.JsonSerializer#serialize(java.lang.Object, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
		 */

		public JsonElement serialize(TsAnyType tsAnyType, Type typeOfSrc,
				JsonSerializationContext context) {
			if(tsAnyType == null || tsAnyType.getContent() == null){
				return null;
			}
			
			return new JsonPrimitive(tsAnyType.getContent());
		}

		/* (non-Javadoc)
		 * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
		 */

		public TsAnyType deserialize(JsonElement json, Type typeOfT,
				JsonDeserializationContext context) throws JsonParseException {
			if(json == null){
				return null;
			}
			
			if(! json.isJsonPrimitive()){
				throw new IllegalStateException("TsAnytype is not a JSON Primitive.");
			}
			
			if(json.getAsJsonPrimitive().getAsString() == null){
				return null;
			} else {
				TsAnyType tsAnyType = new TsAnyType();
				tsAnyType.setContent(json.getAsJsonPrimitive().getAsString());
				
				return tsAnyType;
			}
		}

	}

    private class ChangeableTypeAdapterFactory implements TypeAdapterFactory {

        public TypeAdapter create(final Gson gson, TypeToken type) {
            final TypeAdapter<Object> delegate = gson.getDelegateAdapter(this, type);
            return new TypeAdapter<Object>() {
                public void write(JsonWriter out, Object value) throws IOException {
                    if(value instanceof Changeable){
                        Changeable changeable = (Changeable)value;
                        ChangeableElementGroup changeableElementGroup = changeable.getChangeableElementGroup();

                        JsonElement changeableJson;

                        if(changeableElementGroup != null){
                            changeable.setChangeableElementGroup(null);

                            changeableJson = delegate.toJsonTree(changeable);

                            JsonObject changeableElementGroupJson = gson.toJsonTree(changeableElementGroup).getAsJsonObject();

                            for(Entry<String, JsonElement> entry : changeableElementGroupJson.entrySet()){
                                changeableJson.getAsJsonObject().add(entry.getKey(),entry.getValue());
                            }
                        } else {
                            changeableJson = delegate.toJsonTree(changeable);
                        }

                        gson.toJson(changeableJson, out);
                    } else {
                        delegate.write(out, value);
                    }
                }
                public Object read(JsonReader in) throws IOException {
                    JsonParser jsonParser = new JsonParser();
                    JsonElement jsonElement = jsonParser.parse(in);

                    Object obj = delegate.fromJsonTree(jsonElement);
                    if(obj instanceof Changeable){
                        ChangeableElementGroup changeableElementGroup =
                            gson.fromJson(jsonElement, ChangeableElementGroup.class);
                        ((Changeable) obj).setChangeableElementGroup(changeableElementGroup);
                    }

                    return obj;
                }
            };
        }
    }


    private class ChangeableResourceTypeAdapterFactory implements TypeAdapterFactory {

        public TypeAdapter create(Gson gson, TypeToken type) {
            final TypeAdapter<Object> delegate = gson.getDelegateAdapter(this, type);
            return new TypeAdapter<Object>() {
                public void write(JsonWriter out, Object value) throws IOException {
                    delegate.write(out, value);
                }
                public Object read(JsonReader in) throws IOException {
                    Object obj = delegate.read(in);

                    if (obj instanceof EntityDescription ||
                            obj instanceof ChangeableResource) {
                        setChoiceValue(obj);
                    }

                    return obj;
                }
            };
        }
    }

    private static class DateTypeAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {
        private DateTimeFormatter formatter = ISODateTimeFormat.dateTime();

        @Override public synchronized JsonElement serialize(Date date, Type type,
                                                            JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(formatter.print(date.getTime()));
        }

        @Override public synchronized Date deserialize(JsonElement jsonElement, Type type,
                                                       JsonDeserializationContext jsonDeserializationContext) {
            return formatter.parseDateTime(jsonElement.getAsString()).toDate();
        }
    }
    
    

}
