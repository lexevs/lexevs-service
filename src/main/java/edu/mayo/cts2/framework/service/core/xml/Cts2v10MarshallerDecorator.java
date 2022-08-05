package edu.mayo.cts2.framework.service.core.xml;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.XmlMappingException;

/**
 */
public class Cts2v10MarshallerDecorator implements Cts2Marshaller {

    private static final String CTS211to10_XSL = "CTS211to10.xsl";

    private Cts2Marshaller delegate;

    public Cts2v10MarshallerDecorator(Cts2Marshaller delegate) {
        super();
        this.delegate = delegate;
    }


//    public Properties getBuilderProperties() {
//        return this.delegate.getBuilderProperties();
//    }
//
//
//    public Properties getNamespaceLocationProperties() {
//        return this.delegate.getNamespaceLocationProperties();
//    }
//
//
//    public Properties getNamespaceMappingProperties() {
//        return this.delegate.getNamespaceMappingProperties();
//    }


    public boolean supports(Class<?> clazz) {
        return this.delegate.supports(clazz);
    }


    public Object unmarshal(Source source) throws IOException, XmlMappingException {
        throw new UnsupportedOperationException("Cannot Unmarshal CTS2 1.0 XML yet.");
    }


    public void marshal(Object graph, Result result) throws IOException, XmlMappingException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setURIResolver(new URIResolver(){


            public Source resolve(String href, String base)
                    throws TransformerException {
                try {
                    return new StreamSource(new ClassPathResource(href).getInputStream());
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            }
        });

        Transformer transformer ;
        try {
            transformer = transformerFactory.newTransformer(
                new StreamSource(new ClassPathResource(CTS211to10_XSL).getInputStream()));
        } catch (TransformerConfigurationException e) {
            throw new IllegalStateException(e);
        }

        StringWriter writer = new StringWriter();
        StreamResult superResult = new StreamResult(writer);

        this.delegate.marshal(graph, superResult);

        try {
            transformer.transform(new StreamSource(IOUtils.toInputStream(writer.toString(), "UTF-8")), result);
        } catch (TransformerException e) {
            throw new IOException(e);
        }
    }
}
