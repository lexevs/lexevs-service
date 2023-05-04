/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * Class UpdateChangeSetMetadataRequest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateChangeSetMetadataRequest extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedState.
     */
    private UpdatedState _updatedState;

    /**
     * Field _updatedCreator.
     */
    private UpdatedCreator _updatedCreator;

    /**
     * Field _updatedChangeInstructions.
     */
    private UpdatedChangeInstructions _updatedChangeInstructions;

    /**
     * Field _updatedOfficialEffectiveDate.
     */
    private UpdatedOfficialEffectiveDate _updatedOfficialEffectiveDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateChangeSetMetadataRequest() {
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

        if (obj instanceof UpdateChangeSetMetadataRequest) {

            UpdateChangeSetMetadataRequest temp = (UpdateChangeSetMetadataRequest)obj;
            if (this._updatedState != null) {
                if (temp._updatedState == null) return false;
                if (!this._updatedState.equals(temp._updatedState)) 
                    return false;
            } else if (temp._updatedState != null)
                return false;
            if (this._updatedCreator != null) {
                if (temp._updatedCreator == null) return false;
                if (!this._updatedCreator.equals(temp._updatedCreator)) 
                    return false;
            } else if (temp._updatedCreator != null)
                return false;
            if (this._updatedChangeInstructions != null) {
                if (temp._updatedChangeInstructions == null) return false;
                if (!this._updatedChangeInstructions.equals(temp._updatedChangeInstructions)) 
                    return false;
            } else if (temp._updatedChangeInstructions != null)
                return false;
            if (this._updatedOfficialEffectiveDate != null) {
                if (temp._updatedOfficialEffectiveDate == null) return false;
                return this._updatedOfficialEffectiveDate.equals(temp._updatedOfficialEffectiveDate);
            } else return temp._updatedOfficialEffectiveDate == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedChangeInstructions'.
     * 
     * @return the value of field 'UpdatedChangeInstructions'.
     */
    public UpdatedChangeInstructions getUpdatedChangeInstructions(
    ) {
        return this._updatedChangeInstructions;
    }

    /**
     * Returns the value of field 'updatedCreator'.
     * 
     * @return the value of field 'UpdatedCreator'.
     */
    public UpdatedCreator getUpdatedCreator(
    ) {
        return this._updatedCreator;
    }

    /**
     * Returns the value of field 'updatedOfficialEffectiveDate'.
     * 
     * @return the value of field 'UpdatedOfficialEffectiveDate'.
     */
    public UpdatedOfficialEffectiveDate getUpdatedOfficialEffectiveDate(
    ) {
        return this._updatedOfficialEffectiveDate;
    }

    /**
     * Returns the value of field 'updatedState'.
     * 
     * @return the value of field 'UpdatedState'.
     */
    public UpdatedState getUpdatedState(
    ) {
        return this._updatedState;
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
        if (_updatedState != null) {
           result = 37 * result + _updatedState.hashCode();
        }
        if (_updatedCreator != null) {
           result = 37 * result + _updatedCreator.hashCode();
        }
        if (_updatedChangeInstructions != null) {
           result = 37 * result + _updatedChangeInstructions.hashCode();
        }
        if (_updatedOfficialEffectiveDate != null) {
           result = 37 * result + _updatedOfficialEffectiveDate.hashCode();
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
     * Sets the value of field 'updatedChangeInstructions'.
     * 
     * @param updatedChangeInstructions the value of field
     * 'updatedChangeInstructions'.
     */
    public void setUpdatedChangeInstructions(
            final UpdatedChangeInstructions updatedChangeInstructions) {
        this._updatedChangeInstructions = updatedChangeInstructions;
    }

    /**
     * Sets the value of field 'updatedCreator'.
     * 
     * @param updatedCreator the value of field 'updatedCreator'.
     */
    public void setUpdatedCreator(
            final UpdatedCreator updatedCreator) {
        this._updatedCreator = updatedCreator;
    }

    /**
     * Sets the value of field 'updatedOfficialEffectiveDate'.
     * 
     * @param updatedOfficialEffectiveDate the value of field
     * 'updatedOfficialEffectiveDate'.
     */
    public void setUpdatedOfficialEffectiveDate(
            final UpdatedOfficialEffectiveDate updatedOfficialEffectiveDate) {
        this._updatedOfficialEffectiveDate = updatedOfficialEffectiveDate;
    }

    /**
     * Sets the value of field 'updatedState'.
     * 
     * @param updatedState the value of field 'updatedState'.
     */
    public void setUpdatedState(
            final UpdatedState updatedState) {
        this._updatedState = updatedState;
    }

    /**
     * Method unmarshalUpdateChangeSetMetadataRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdateChangeSetMetadataRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
