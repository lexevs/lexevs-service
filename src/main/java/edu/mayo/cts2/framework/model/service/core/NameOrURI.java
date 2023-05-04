/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * Carries either a local identifier (name) or a URI (uri) that
 * references a resource in the service. NameOrURI is only used as
 * an input parameter and its type is always defined by the usage
 * context. Note that service calls that use the name option may
 * not be portable across implementations, as there is no guarantee
 * that any two CTS2 service implementations will use the same
 * local identifiers for the same
 *  resources.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class NameOrURI extends AbstractNameToString
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a LocalIdentifier that references a unique resource within
     * the context of the service implementation and type of
     * resource being accessed
     */
    private String _name;

    /**
     * an ExternalURI that references a unique resource within the
     * context of the resource type
     */
    private String _uri;


      //----------------/
     //- Constructors -/
    //----------------/

    public NameOrURI() {
        super();
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

        if (obj instanceof NameOrURI) {

            NameOrURI temp = (NameOrURI)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                if (!this._name.equals(temp._name)) 
                    return false;
            } else if (temp._name != null)
                return false;
            if (this._uri != null) {
                if (temp._uri == null) return false;
                return this._uri.equals(temp._uri);
            } else return temp._uri == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: a LocalIdentifier that references a
     * unique resource within the context of the service
     * implementation and type of resource being accessed
     * 
     * @return the value of field 'Name'.
     */
    public String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'uri'. The field 'uri' has the
     * following description: an ExternalURI that references a
     * unique resource within the context of the resource type
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_uri != null) {
           result = 37 * result + _uri.hashCode();
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
     * Sets the value of field 'name'. The field 'name' has the
     * following description: a LocalIdentifier that references a
     * unique resource within the context of the service
     * implementation and type of resource being accessed
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'uri'. The field 'uri' has the
     * following description: an ExternalURI that references a
     * unique resource within the context of the resource type
     * 
     * @param uri the value of field 'uri'.
     */
    public void setUri(
            final String uri) {
        this._uri = uri;
    }

    /**
     * Method unmarshalNameOrURI.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.NameOrURI
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
