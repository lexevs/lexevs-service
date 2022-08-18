/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.conceptdomain;

import edu.mayo.cts2.framework.model.core.EntityReference;

/**
 * Class UpdatedDefiningEntity.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedDefiningEntity extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _definingEntity.
     */
    private EntityReference _definingEntity;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedDefiningEntity() {
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

        if (obj instanceof UpdatedDefiningEntity) {

            UpdatedDefiningEntity temp = (UpdatedDefiningEntity)obj;
            if (this._definingEntity != null) {
                if (temp._definingEntity == null) return false;
                return this._definingEntity.equals(temp._definingEntity);
            } else return temp._definingEntity == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'definingEntity'.
     * 
     * @return the value of field 'DefiningEntity'.
     */
    public EntityReference getDefiningEntity(
    ) {
        return this._definingEntity;
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
        if (_definingEntity != null) {
           result = 37 * result + _definingEntity.hashCode();
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
     * Sets the value of field 'definingEntity'.
     * 
     * @param definingEntity the value of field 'definingEntity'.
     */
    public void setDefiningEntity(
            final EntityReference definingEntity) {
        this._definingEntity = definingEntity;
    }

    /**
     * Method unmarshalUpdatedDefiningEntity.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.conceptdomain.UpdatedDefiningEntity
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
