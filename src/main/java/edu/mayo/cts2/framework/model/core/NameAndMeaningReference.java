/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * A NameAndMeaningReference consists of a local identifier that
 * references a unique meaning within the context of a given domain
 * in a CTS2 service instance and a globally unique URI that
 *  identifies the intended meaning of the identifier. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class NameAndMeaningReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    protected String _content = null;

    /**
     * an ExternalURI that references the meaning of a name.
     * Meaning is optional only because the meaning of some of the
     * elements have not been fully specified in some legacy
     *  terminology resources. If meaning is not supplied, the
     * intent of a reference cannot be shared among services or
     * between other resources.
     */
    private String _uri;

    /**
     * a RenderingURI that, when dereferenced, results in a CTS2
     * compliant representation of the meaning of the given
     * NameAndMeaningReference. This must be present if the
     *  implementing CTS2 service is aware of a CTS2 resource that
     * carries the definition. 
     */
    private String _href;


      //----------------/
     //- Constructors -/
    //----------------/

    public NameAndMeaningReference() {
        super();
        setContent("");
    }

    public NameAndMeaningReference(final String defaultValue) {
        try {
            setContent(defaultValue);
         } catch(Exception e) {
            throw new RuntimeException("Unable to cast default value for simple content!");
         } 
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Overrides the java.lang.Object.equals method.
     * 
     * @param obj
     * @return true if the objects are equal.
     */
    @Override()
    public boolean equals(
            final Object obj) {
        if ( this == obj )
            return true;

        if (!super.equals(obj))
            return false;

        if (obj instanceof NameAndMeaningReference) {

            NameAndMeaningReference temp = (NameAndMeaningReference)obj;
            if (this._content != null) {
                if (temp._content == null) return false;
                if (!this._content.equals(temp._content)) 
                    return false;
            } else if (temp._content != null)
                return false;
            if (this._uri != null) {
                if (temp._uri == null) return false;
                if (!this._uri.equals(temp._uri)) 
                    return false;
            } else if (temp._uri != null)
                return false;
            if (this._href != null) {
                if (temp._href == null) return false;
                return this._href.equals(temp._href);
            } else return temp._href == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'Content'.
     */
    public String getContent(
    ) {
        return this._content;
    }

    /**
     * Returns the value of field 'href'. The field 'href' has the
     * following description: a RenderingURI that, when
     * dereferenced, results in a CTS2 compliant representation of
     * the meaning of the given NameAndMeaningReference. This must
     * be present if the
     *  implementing CTS2 service is aware of a CTS2 resource that
     * carries the definition. 
     * 
     * @return the value of field 'Href'.
     */
    public String getHref(
    ) {
        return this._href;
    }

    /**
     * Returns the value of field 'uri'. The field 'uri' has the
     * following description: an ExternalURI that references the
     * meaning of a name. Meaning is optional only because the
     * meaning of some of the elements have not been fully
     * specified in some legacy
     *  terminology resources. If meaning is not supplied, the
     * intent of a reference cannot be shared among services or
     * between other resources.
     * 
     * @return the value of field 'Uri'.
     */
    public String getUri(
    ) {
        return this._uri;
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     * 
     * @return a hash code value for the object.
     */
    public int hashCode(
    ) {
        int result = super.hashCode();

        long tmp;
        if (_content != null) {
           result = 37 * result + _content.hashCode();
        }
        if (_uri != null) {
           result = 37 * result + _uri.hashCode();
        }
        if (_href != null) {
           result = 37 * result + _href.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */

    /**
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(
            final String content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'href'. The field 'href' has the
     * following description: a RenderingURI that, when
     * dereferenced, results in a CTS2 compliant representation of
     * the meaning of the given NameAndMeaningReference. This must
     * be present if the
     *  implementing CTS2 service is aware of a CTS2 resource that
     * carries the definition. 
     * 
     * @param href the value of field 'href'.
     */
    public void setHref(
            final String href) {
        this._href = href;
    }

    /**
     * Sets the value of field 'uri'. The field 'uri' has the
     * following description: an ExternalURI that references the
     * meaning of a name. Meaning is optional only because the
     * meaning of some of the elements have not been fully
     * specified in some legacy
     *  terminology resources. If meaning is not supplied, the
     * intent of a reference cannot be shared among services or
     * between other resources.
     * 
     * @param uri the value of field 'uri'.
     */
    public void setUri(
            final String uri) {
        this._uri = uri;
    }

    /**
     * Method unmarshalNameAndMeaningReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.NameAndMeaningReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
