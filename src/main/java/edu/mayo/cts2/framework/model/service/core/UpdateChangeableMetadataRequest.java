/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * Class UpdateChangeableMetadataRequest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateChangeableMetadataRequest extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedStatus.
     */
    private UpdatedStatus _updatedStatus;

    /**
     * Field _updatedEntryState.
     */
    private UpdatedEntryState _updatedEntryState;

    /**
     * Field _updatedEffectiveDate.
     */
    private UpdatedEffectiveDate _updatedEffectiveDate;

    /**
     * Field _updatedChangeNotes.
     */
    private UpdatedChangeNotes _updatedChangeNotes;

    /**
     * Field _updatedChangeSource.
     */
    private UpdatedChangeSource _updatedChangeSource;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateChangeableMetadataRequest() {
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

        if (obj instanceof UpdateChangeableMetadataRequest) {

            UpdateChangeableMetadataRequest temp = (UpdateChangeableMetadataRequest)obj;
            if (this._updatedStatus != null) {
                if (temp._updatedStatus == null) return false;
                if (!this._updatedStatus.equals(temp._updatedStatus)) 
                    return false;
            } else if (temp._updatedStatus != null)
                return false;
            if (this._updatedEntryState != null) {
                if (temp._updatedEntryState == null) return false;
                if (!this._updatedEntryState.equals(temp._updatedEntryState)) 
                    return false;
            } else if (temp._updatedEntryState != null)
                return false;
            if (this._updatedEffectiveDate != null) {
                if (temp._updatedEffectiveDate == null) return false;
                if (!this._updatedEffectiveDate.equals(temp._updatedEffectiveDate)) 
                    return false;
            } else if (temp._updatedEffectiveDate != null)
                return false;
            if (this._updatedChangeNotes != null) {
                if (temp._updatedChangeNotes == null) return false;
                if (!this._updatedChangeNotes.equals(temp._updatedChangeNotes)) 
                    return false;
            } else if (temp._updatedChangeNotes != null)
                return false;
            if (this._updatedChangeSource != null) {
                if (temp._updatedChangeSource == null) return false;
                return this._updatedChangeSource.equals(temp._updatedChangeSource);
            } else return temp._updatedChangeSource == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedChangeNotes'.
     * 
     * @return the value of field 'UpdatedChangeNotes'.
     */
    public UpdatedChangeNotes getUpdatedChangeNotes(
    ) {
        return this._updatedChangeNotes;
    }

    /**
     * Returns the value of field 'updatedChangeSource'.
     * 
     * @return the value of field 'UpdatedChangeSource'.
     */
    public UpdatedChangeSource getUpdatedChangeSource(
    ) {
        return this._updatedChangeSource;
    }

    /**
     * Returns the value of field 'updatedEffectiveDate'.
     * 
     * @return the value of field 'UpdatedEffectiveDate'.
     */
    public UpdatedEffectiveDate getUpdatedEffectiveDate(
    ) {
        return this._updatedEffectiveDate;
    }

    /**
     * Returns the value of field 'updatedEntryState'.
     * 
     * @return the value of field 'UpdatedEntryState'.
     */
    public UpdatedEntryState getUpdatedEntryState(
    ) {
        return this._updatedEntryState;
    }

    /**
     * Returns the value of field 'updatedStatus'.
     * 
     * @return the value of field 'UpdatedStatus'.
     */
    public UpdatedStatus getUpdatedStatus(
    ) {
        return this._updatedStatus;
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
        if (_updatedStatus != null) {
           result = 37 * result + _updatedStatus.hashCode();
        }
        if (_updatedEntryState != null) {
           result = 37 * result + _updatedEntryState.hashCode();
        }
        if (_updatedEffectiveDate != null) {
           result = 37 * result + _updatedEffectiveDate.hashCode();
        }
        if (_updatedChangeNotes != null) {
           result = 37 * result + _updatedChangeNotes.hashCode();
        }
        if (_updatedChangeSource != null) {
           result = 37 * result + _updatedChangeSource.hashCode();
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
     * Sets the value of field 'updatedChangeNotes'.
     * 
     * @param updatedChangeNotes the value of field
     * 'updatedChangeNotes'.
     */
    public void setUpdatedChangeNotes(
            final UpdatedChangeNotes updatedChangeNotes) {
        this._updatedChangeNotes = updatedChangeNotes;
    }

    /**
     * Sets the value of field 'updatedChangeSource'.
     * 
     * @param updatedChangeSource the value of field
     * 'updatedChangeSource'.
     */
    public void setUpdatedChangeSource(
            final UpdatedChangeSource updatedChangeSource) {
        this._updatedChangeSource = updatedChangeSource;
    }

    /**
     * Sets the value of field 'updatedEffectiveDate'.
     * 
     * @param updatedEffectiveDate the value of field
     * 'updatedEffectiveDate'.
     */
    public void setUpdatedEffectiveDate(
            final UpdatedEffectiveDate updatedEffectiveDate) {
        this._updatedEffectiveDate = updatedEffectiveDate;
    }

    /**
     * Sets the value of field 'updatedEntryState'.
     * 
     * @param updatedEntryState the value of field
     * 'updatedEntryState'.
     */
    public void setUpdatedEntryState(
            final UpdatedEntryState updatedEntryState) {
        this._updatedEntryState = updatedEntryState;
    }

    /**
     * Sets the value of field 'updatedStatus'.
     * 
     * @param updatedStatus the value of field 'updatedStatus'.
     */
    public void setUpdatedStatus(
            final UpdatedStatus updatedStatus) {
        this._updatedStatus = updatedStatus;
    }

    /**
     * Method unmarshalUpdateChangeableMetadataRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdateChangeableMetadataRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
