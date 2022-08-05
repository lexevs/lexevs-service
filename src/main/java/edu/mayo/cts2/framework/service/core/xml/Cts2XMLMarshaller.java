package edu.mayo.cts2.framework.service.core.xml;

import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class Cts2XMLMarshaller {
    @Autowired
    private static Jaxb2Marshaller marshaller;

    public static String marshalToXml(Object obj, Class sourceClass) {

        marshaller.setContextPath(sourceClass.getPackage().getName());

        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);

        marshaller.marshal(obj, result);

        return writer.toString();
    }

    public static <T> T unmarshalFromXML(final InputStream xml){
        return (T) marshaller.unmarshal(new StreamSource(xml));
    }
}
