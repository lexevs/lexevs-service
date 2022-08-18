/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.types.FinalizableState;

/**
 * The set of attributes that can be changed whenever an instance
 * of a ResourceVersionDescription is updated.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateResourceVersionDescription extends UpdateResourceDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedState.
     */
    private FinalizableState _updatedState;

    /**
     * Field _updatedOfficialActivationDate.
     */
    private java.util.Date _updatedOfficialActivationDate;

    /**
     * Field _updatedOfficialReleaseDate.
     */
    private java.util.Date _updatedOfficialReleaseDate;

    /**
     * Field _updatedOfficialResourceVersionId.
     */
    private java.util.Date _updatedOfficialResourceVersionId;

    /**
     * Field _updatedPredecessor.
     */
    private UpdatedPredecessor _updatedPredecessor;

    /**
     * Field _updatedSourceAndNotation.
     */
    private UpdatedSourceAndNotation _updatedSourceAndNotation;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateResourceVersionDescription() {
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

        if (obj instanceof UpdateResourceVersionDescription) {

            UpdateResourceVersionDescription temp = (UpdateResourceVersionDescription)obj;
            if (this._updatedState != null) {
                if (temp._updatedState == null) return false;
                if (!this._updatedState.equals(temp._updatedState)) 
                    return false;
            } else if (temp._updatedState != null)
                return false;
            if (this._updatedOfficialActivationDate != null) {
                if (temp._updatedOfficialActivationDate == null) return false;
                if (!this._updatedOfficialActivationDate.equals(temp._updatedOfficialActivationDate)) 
                    return false;
            } else if (temp._updatedOfficialActivationDate != null)
                return false;
            if (this._updatedOfficialReleaseDate != null) {
                if (temp._updatedOfficialReleaseDate == null) return false;
                if (!this._updatedOfficialReleaseDate.equals(temp._updatedOfficialReleaseDate)) 
                    return false;
            } else if (temp._updatedOfficialReleaseDate != null)
                return false;
            if (this._updatedOfficialResourceVersionId != null) {
                if (temp._updatedOfficialResourceVersionId == null) return false;
                if (!this._updatedOfficialResourceVersionId.equals(temp._updatedOfficialResourceVersionId)) 
                    return false;
            } else if (temp._updatedOfficialResourceVersionId != null)
                return false;
            if (this._updatedPredecessor != null) {
                if (temp._updatedPredecessor == null) return false;
                if (!this._updatedPredecessor.equals(temp._updatedPredecessor)) 
                    return false;
            } else if (temp._updatedPredecessor != null)
                return false;
            if (this._updatedSourceAndNotation != null) {
                if (temp._updatedSourceAndNotation == null) return false;
                return this._updatedSourceAndNotation.equals(temp._updatedSourceAndNotation);
            } else return temp._updatedSourceAndNotation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedOfficialActivationDate'.
     * 
     * @return the value of field 'UpdatedOfficialActivationDate'.
     */
    public java.util.Date getUpdatedOfficialActivationDate(
    ) {
        return this._updatedOfficialActivationDate;
    }

    /**
     * Returns the value of field 'updatedOfficialReleaseDate'.
     * 
     * @return the value of field 'UpdatedOfficialReleaseDate'.
     */
    public java.util.Date getUpdatedOfficialReleaseDate(
    ) {
        return this._updatedOfficialReleaseDate;
    }

    /**
     * Returns the value of field
     * 'updatedOfficialResourceVersionId'.
     * 
     * @return the value of field 'UpdatedOfficialResourceVersionId'
     */
    public java.util.Date getUpdatedOfficialResourceVersionId(
    ) {
        return this._updatedOfficialResourceVersionId;
    }

    /**
     * Returns the value of field 'updatedPredecessor'.
     * 
     * @return the value of field 'UpdatedPredecessor'.
     */
    public UpdatedPredecessor getUpdatedPredecessor(
    ) {
        return this._updatedPredecessor;
    }

    /**
     * Returns the value of field 'updatedSourceAndNotation'.
     * 
     * @return the value of field 'UpdatedSourceAndNotation'.
     */
    public UpdatedSourceAndNotation getUpdatedSourceAndNotation(
    ) {
        return this._updatedSourceAndNotation;
    }

    /**
     * Returns the value of field 'updatedState'.
     * 
     * @return the value of field 'UpdatedState'.
     */
    public FinalizableState getUpdatedState(
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
        if (_updatedOfficialActivationDate != null) {
           result = 37 * result + _updatedOfficialActivationDate.hashCode();
        }
        if (_updatedOfficialReleaseDate != null) {
           result = 37 * result + _updatedOfficialReleaseDate.hashCode();
        }
        if (_updatedOfficialResourceVersionId != null) {
           result = 37 * result + _updatedOfficialResourceVersionId.hashCode();
        }
        if (_updatedPredecessor != null) {
           result = 37 * result + _updatedPredecessor.hashCode();
        }
        if (_updatedSourceAndNotation != null) {
           result = 37 * result + _updatedSourceAndNotation.hashCode();
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
     * Sets the value of field 'updatedOfficialActivationDate'.
     * 
     * @param updatedOfficialActivationDate the value of field
     * 'updatedOfficialActivationDate'.
     */
    public void setUpdatedOfficialActivationDate(
            final java.util.Date updatedOfficialActivationDate) {
        this._updatedOfficialActivationDate = updatedOfficialActivationDate;
    }

    /**
     * Sets the value of field 'updatedOfficialReleaseDate'.
     * 
     * @param updatedOfficialReleaseDate the value of field
     * 'updatedOfficialReleaseDate'.
     */
    public void setUpdatedOfficialReleaseDate(
            final java.util.Date updatedOfficialReleaseDate) {
        this._updatedOfficialReleaseDate = updatedOfficialReleaseDate;
    }

    /**
     * Sets the value of field 'updatedOfficialResourceVersionId'.
     * 
     * @param updatedOfficialResourceVersionId the value of field
     * 'updatedOfficialResourceVersionId'.
     */
    public void setUpdatedOfficialResourceVersionId(
            final java.util.Date updatedOfficialResourceVersionId) {
        this._updatedOfficialResourceVersionId = updatedOfficialResourceVersionId;
    }

    /**
     * Sets the value of field 'updatedPredecessor'.
     * 
     * @param updatedPredecessor the value of field
     * 'updatedPredecessor'.
     */
    public void setUpdatedPredecessor(
            final UpdatedPredecessor updatedPredecessor) {
        this._updatedPredecessor = updatedPredecessor;
    }

    /**
     * Sets the value of field 'updatedSourceAndNotation'.
     * 
     * @param updatedSourceAndNotation the value of field
     * 'updatedSourceAndNotation'.
     */
    public void setUpdatedSourceAndNotation(
            final UpdatedSourceAndNotation updatedSourceAndNotation) {
        this._updatedSourceAndNotation = updatedSourceAndNotation;
    }

    /**
     * Sets the value of field 'updatedState'.
     * 
     * @param updatedState the value of field 'updatedState'.
     */
    public void setUpdatedState(
            final FinalizableState updatedState) {
        this._updatedState = updatedState;
    }

    /**
     * Method unmarshalUpdateResourceVersionDescription.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdateResourceVersionDescription
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
