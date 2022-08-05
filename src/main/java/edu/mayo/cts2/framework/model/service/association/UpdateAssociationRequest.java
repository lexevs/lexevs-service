/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.association;

/**
 * Class UpdateAssociationRequest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateAssociationRequest extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedAssociationQualifiers.
     */
    private UpdatedAssociationQualifiers _updatedAssociationQualifiers;

    /**
     * Field _updatedTargets.
     */
    private UpdatedTargets _updatedTargets;

    /**
     * Field _updatedDerivation.
     */
    private UpdatedDerivation _updatedDerivation;

    /**
     * Field _updatedDerivationReasoningAlgorithm.
     */
    private UpdatedDerivationReasoningAlgorithm _updatedDerivationReasoningAlgorithm;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateAssociationRequest() {
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

        if (obj instanceof UpdateAssociationRequest) {

            UpdateAssociationRequest temp = (UpdateAssociationRequest)obj;
            if (this._updatedAssociationQualifiers != null) {
                if (temp._updatedAssociationQualifiers == null) return false;
                if (!this._updatedAssociationQualifiers.equals(temp._updatedAssociationQualifiers)) 
                    return false;
            } else if (temp._updatedAssociationQualifiers != null)
                return false;
            if (this._updatedTargets != null) {
                if (temp._updatedTargets == null) return false;
                if (!this._updatedTargets.equals(temp._updatedTargets)) 
                    return false;
            } else if (temp._updatedTargets != null)
                return false;
            if (this._updatedDerivation != null) {
                if (temp._updatedDerivation == null) return false;
                if (!this._updatedDerivation.equals(temp._updatedDerivation)) 
                    return false;
            } else if (temp._updatedDerivation != null)
                return false;
            if (this._updatedDerivationReasoningAlgorithm != null) {
                if (temp._updatedDerivationReasoningAlgorithm == null) return false;
                return this._updatedDerivationReasoningAlgorithm.equals(temp._updatedDerivationReasoningAlgorithm);
            } else return temp._updatedDerivationReasoningAlgorithm == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedAssociationQualifiers'.
     * 
     * @return the value of field 'UpdatedAssociationQualifiers'.
     */
    public UpdatedAssociationQualifiers getUpdatedAssociationQualifiers(
    ) {
        return this._updatedAssociationQualifiers;
    }

    /**
     * Returns the value of field 'updatedDerivation'.
     * 
     * @return the value of field 'UpdatedDerivation'.
     */
    public UpdatedDerivation getUpdatedDerivation(
    ) {
        return this._updatedDerivation;
    }

    /**
     * Returns the value of field
     * 'updatedDerivationReasoningAlgorithm'.
     * 
     * @return the value of field
     * 'UpdatedDerivationReasoningAlgorithm'.
     */
    public UpdatedDerivationReasoningAlgorithm getUpdatedDerivationReasoningAlgorithm(
    ) {
        return this._updatedDerivationReasoningAlgorithm;
    }

    /**
     * Returns the value of field 'updatedTargets'.
     * 
     * @return the value of field 'UpdatedTargets'.
     */
    public UpdatedTargets getUpdatedTargets(
    ) {
        return this._updatedTargets;
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
        if (_updatedAssociationQualifiers != null) {
           result = 37 * result + _updatedAssociationQualifiers.hashCode();
        }
        if (_updatedTargets != null) {
           result = 37 * result + _updatedTargets.hashCode();
        }
        if (_updatedDerivation != null) {
           result = 37 * result + _updatedDerivation.hashCode();
        }
        if (_updatedDerivationReasoningAlgorithm != null) {
           result = 37 * result + _updatedDerivationReasoningAlgorithm.hashCode();
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
     * Sets the value of field 'updatedAssociationQualifiers'.
     * 
     * @param updatedAssociationQualifiers the value of field
     * 'updatedAssociationQualifiers'.
     */
    public void setUpdatedAssociationQualifiers(
            final UpdatedAssociationQualifiers updatedAssociationQualifiers) {
        this._updatedAssociationQualifiers = updatedAssociationQualifiers;
    }

    /**
     * Sets the value of field 'updatedDerivation'.
     * 
     * @param updatedDerivation the value of field
     * 'updatedDerivation'.
     */
    public void setUpdatedDerivation(
            final UpdatedDerivation updatedDerivation) {
        this._updatedDerivation = updatedDerivation;
    }

    /**
     * Sets the value of field
     * 'updatedDerivationReasoningAlgorithm'.
     * 
     * @param updatedDerivationReasoningAlgorithm the value of
     * field 'updatedDerivationReasoningAlgorithm'.
     */
    public void setUpdatedDerivationReasoningAlgorithm(
            final UpdatedDerivationReasoningAlgorithm updatedDerivationReasoningAlgorithm) {
        this._updatedDerivationReasoningAlgorithm = updatedDerivationReasoningAlgorithm;
    }

    /**
     * Sets the value of field 'updatedTargets'.
     * 
     * @param updatedTargets the value of field 'updatedTargets'.
     */
    public void setUpdatedTargets(
            final UpdatedTargets updatedTargets) {
        this._updatedTargets = updatedTargets;
    }

    /**
     * Method unmarshalUpdateAssociationRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.association.UpdateAssociationRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
