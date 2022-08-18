/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity;

/**
 * An EntityDescription as returned from a service
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EntityDescriptionMsg extends edu.mayo.cts2.framework.model.core.Message 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A choice of the possible types of entity description
     */
    private EntityDescription _entityDescription;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityDescriptionMsg() {
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

        if (obj instanceof EntityDescriptionMsg) {

            EntityDescriptionMsg temp = (EntityDescriptionMsg)obj;
            if (this._entityDescription != null) {
                if (temp._entityDescription == null) return false;
                return this._entityDescription.equals(temp._entityDescription);
            } else return temp._entityDescription == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'entityDescription'. The field
     * 'entityDescription' has the following description: A choice
     * of the possible types of entity description
     * 
     * @return the value of field 'EntityDescription'.
     */
    public EntityDescription getEntityDescription(
    ) {
        return this._entityDescription;
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
        if (_entityDescription != null) {
           result = 37 * result + _entityDescription.hashCode();
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
     * Sets the value of field 'entityDescription'. The field
     * 'entityDescription' has the following description: A choice
     * of the possible types of entity description
     * 
     * @param entityDescription the value of field
     * 'entityDescription'.
     */
    public void setEntityDescription(
            final EntityDescription entityDescription) {
        this._entityDescription = entityDescription;
    }

    /**
     * Method unmarshalEntityDescriptionMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.entity.EntityDescriptionMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
