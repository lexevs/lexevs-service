/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * The combination of a namespace identifier and a local name.
 * Scoped entity names are not portable - they only work within the
 * context of a single service instance, as different services may
 * assign different
 *  namespace identifiers to the same namespace and different
 * services may make different choices of the appropriate local
 * identifier to use to represent an entity. As an example, one
 * service may choose to use the entity code
 *  while a second may use another designation that is known to be
 * unique.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ScopedEntityName extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

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


      //----------------/
     //- Constructors -/
    //----------------/

    public ScopedEntityName() {
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

        if (obj instanceof ScopedEntityName) {

            ScopedEntityName temp = (ScopedEntityName)obj;
            if (this._namespace != null) {
                if (temp._namespace == null) return false;
                if (!this._namespace.equals(temp._namespace)) 
                    return false;
            } else if (temp._namespace != null)
                return false;
            if (this._name != null) {
                if (temp._name == null) return false;
                return this._name.equals(temp._name);
            } else return temp._name == null;
        }
        return false;
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
        if (_namespace != null) {
           result = 37 * result + _namespace.hashCode();
        }
        if (_name != null) {
           result = 37 * result + _name.hashCode();
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
     * Method unmarshalScopedEntityName.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.ScopedEntityName
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
