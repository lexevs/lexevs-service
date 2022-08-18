/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * The combination of a URI and an optional ScopedEntityName and an
 * optional designation for a resource. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class URIAndEntityName extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a URI that uniquely references the target entity
     */
    private String _uri;

    /**
     * a URI that resolves to the full EntityDescription
     * represented by this resource
     */
    private String _href;

    /**
     * an identifier that references a unique namespace URI within
     * the context of the service
     */
    private String _namespace;

    /**
     * the local entity name within the context of the namespace.
     * What is chosen for the entity name is service specific
     */
    private String _name;

    /**
     * a designation considered appropriate for the entity in the
     * specific context of use
     */
    private String _designation;


      //----------------/
     //- Constructors -/
    //----------------/

    public URIAndEntityName() {
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

        if (obj instanceof URIAndEntityName) {

            URIAndEntityName temp = (URIAndEntityName)obj;
            if (this._uri != null) {
                if (temp._uri == null) return false;
                if (!this._uri.equals(temp._uri)) 
                    return false;
            } else if (temp._uri != null)
                return false;
            if (this._href != null) {
                if (temp._href == null) return false;
                if (!this._href.equals(temp._href)) 
                    return false;
            } else if (temp._href != null)
                return false;
            if (this._namespace != null) {
                if (temp._namespace == null) return false;
                if (!this._namespace.equals(temp._namespace)) 
                    return false;
            } else if (temp._namespace != null)
                return false;
            if (this._name != null) {
                if (temp._name == null) return false;
                if (!this._name.equals(temp._name)) 
                    return false;
            } else if (temp._name != null)
                return false;
            if (this._designation != null) {
                if (temp._designation == null) return false;
                return this._designation.equals(temp._designation);
            } else return temp._designation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'designation'. The field
     * 'designation' has the following description: a designation
     * considered appropriate for the entity in the specific
     * context of use
     * 
     * @return the value of field 'Designation'.
     */
    public String getDesignation(
    ) {
        return this._designation;
    }

    /**
     * Returns the value of field 'href'. The field 'href' has the
     * following description: a URI that resolves to the full
     * EntityDescription represented by this resource
     * 
     * @return the value of field 'Href'.
     */
    public String getHref(
    ) {
        return this._href;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: the local entity name within the
     * context of the namespace. What is chosen for the entity name
     * is service specific
     * 
     * @return the value of field 'Name'.
     */
    public String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'namespace'. The field
     * 'namespace' has the following description: an identifier
     * that references a unique namespace URI within the context of
     * the service
     * 
     * @return the value of field 'Namespace'.
     */
    public String getNamespace(
    ) {
        return this._namespace;
    }

    /**
     * Returns the value of field 'uri'. The field 'uri' has the
     * following description: a URI that uniquely references the
     * target entity
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
        if (_uri != null) {
           result = 37 * result + _uri.hashCode();
        }
        if (_href != null) {
           result = 37 * result + _href.hashCode();
        }
        if (_namespace != null) {
           result = 37 * result + _namespace.hashCode();
        }
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_designation != null) {
           result = 37 * result + _designation.hashCode();
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
     * Sets the value of field 'designation'. The field
     * 'designation' has the following description: a designation
     * considered appropriate for the entity in the specific
     * context of use
     * 
     * @param designation the value of field 'designation'.
     */
    public void setDesignation(
            final String designation) {
        this._designation = designation;
    }

    /**
     * Sets the value of field 'href'. The field 'href' has the
     * following description: a URI that resolves to the full
     * EntityDescription represented by this resource
     * 
     * @param href the value of field 'href'.
     */
    public void setHref(
            final String href) {
        this._href = href;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: the local entity name within the
     * context of the namespace. What is chosen for the entity name
     * is service specific
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'namespace'. The field 'namespace'
     * has the following description: an identifier that references
     * a unique namespace URI within the context of the service
     * 
     * @param namespace the value of field 'namespace'.
     */
    public void setNamespace(
            final String namespace) {
        this._namespace = namespace;
    }

    /**
     * Sets the value of field 'uri'. The field 'uri' has the
     * following description: a URI that uniquely references the
     * target entity
     * 
     * @param uri the value of field 'uri'.
     */
    public void setUri(
            final String uri) {
        this._uri = uri;
    }

    /**
     * Method unmarshalURIAndEntityName.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.URIAndEntityName
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
