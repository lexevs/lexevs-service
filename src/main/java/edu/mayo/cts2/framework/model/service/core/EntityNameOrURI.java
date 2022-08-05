/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * A reference to a class, property or individual that is described
 * in some Code System. EntityNameOrURI may either reference an
 * entity that is known locally to the service or an entity that is
 * described elsewhere. If the entity is known to the service, it
 * is possible to use the entityName variant, but note that neither
 * scopingNamespace nor the entityName are guaranteed to be the
 * same in different CTS2 implementations. The
 *  entityName variant is intended for use in human/browser
 * interactions and should not be hard-coded into data tables or
 * applications.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EntityNameOrURI extends AbstractEntityNameToString
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A combination of a namespace identifier and a local name
     * that, together, uniquely references an entity known to the
     * service
     */
    private edu.mayo.cts2.framework.model.core.ScopedEntityName _entityName;

    /**
     * An ExternalURI that references a class, property or individua
     */
    private String _uri;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityNameOrURI() {
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

        if (obj instanceof EntityNameOrURI) {

            EntityNameOrURI temp = (EntityNameOrURI)obj;
            if (this._entityName != null) {
                if (temp._entityName == null) return false;
                if (!this._entityName.equals(temp._entityName)) 
                    return false;
            } else if (temp._entityName != null)
                return false;
            if (this._uri != null) {
                if (temp._uri == null) return false;
                return this._uri.equals(temp._uri);
            } else return temp._uri == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'entityName'. The field
     * 'entityName' has the following description: A combination of
     * a namespace identifier and a local name that, together,
     * uniquely references an entity known to the service
     * 
     * @return the value of field 'EntityName'.
     */
    public edu.mayo.cts2.framework.model.core.ScopedEntityName getEntityName(
    ) {
        return this._entityName;
    }

    /**
     * Returns the value of field 'uri'. The field 'uri' has the
     * following description: An ExternalURI that references a
     * class, property or individual
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
        if (_entityName != null) {
           result = 37 * result + _entityName.hashCode();
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
     * Sets the value of field 'entityName'. The field 'entityName'
     * has the following description: A combination of a namespace
     * identifier and a local name that, together, uniquely
     * references an entity known to the service
     * 
     * @param entityName the value of field 'entityName'.
     */
    public void setEntityName(
            final edu.mayo.cts2.framework.model.core.ScopedEntityName entityName) {
        this._entityName = entityName;
    }

    /**
     * Sets the value of field 'uri'. The field 'uri' has the
     * following description: An ExternalURI that references a
     * class, property or individual
     * 
     * @param uri the value of field 'uri'.
     */
    public void setUri(
            final String uri) {
        this._uri = uri;
    }

    /**
     * Method unmarshalEntityNameOrURI.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.EntityNameOrURI
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
