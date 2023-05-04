/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * Class UpdatedOfficialEffectiveDate.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedOfficialEffectiveDate extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _officialEffectiveDate.
     */
    private java.util.Date _officialEffectiveDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedOfficialEffectiveDate() {
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

        if (obj instanceof UpdatedOfficialEffectiveDate) {

            UpdatedOfficialEffectiveDate temp = (UpdatedOfficialEffectiveDate)obj;
            if (this._officialEffectiveDate != null) {
                if (temp._officialEffectiveDate == null) return false;
                return this._officialEffectiveDate.equals(temp._officialEffectiveDate);
            } else return temp._officialEffectiveDate == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'officialEffectiveDate'.
     * 
     * @return the value of field 'OfficialEffectiveDate'.
     */
    public java.util.Date getOfficialEffectiveDate(
    ) {
        return this._officialEffectiveDate;
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
        if (_officialEffectiveDate != null) {
           result = 37 * result + _officialEffectiveDate.hashCode();
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
     * Sets the value of field 'officialEffectiveDate'.
     * 
     * @param officialEffectiveDate the value of field
     * 'officialEffectiveDate'.
     */
    public void setOfficialEffectiveDate(
            final java.util.Date officialEffectiveDate) {
        this._officialEffectiveDate = officialEffectiveDate;
    }

    /**
     * Method unmarshalUpdatedOfficialEffectiveDate.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedOfficialEffectiveDate
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
