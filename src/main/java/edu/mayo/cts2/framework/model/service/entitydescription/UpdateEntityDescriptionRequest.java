/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.entitydescription;

/**
 * Class UpdateEntityDescriptionRequest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateEntityDescriptionRequest extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedAlternateEntityIds.
     */
    private UpdatedAlternateEntityIds _updatedAlternateEntityIds;

    /**
     * Field _updatedDefinitions.
     */
    private UpdatedDefinitions _updatedDefinitions;

    /**
     * Field _updatedDesignations.
     */
    private UpdatedDesignations _updatedDesignations;

    /**
     * Field _updatedComments.
     */
    private UpdatedComments _updatedComments;

    /**
     * Field _updatedParents.
     */
    private UpdatedParents _updatedParents;

    /**
     * Field _updatedProperties.
     */
    private UpdatedProperties _updatedProperties;

    /**
     * Field _updatedResourceTypes.
     */
    private UpdatedResourceTypes _updatedResourceTypes;

    /**
     * Field _updatedCodeSystemRole.
     */
    private UpdatedCodeSystemRole _updatedCodeSystemRole;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateEntityDescriptionRequest() {
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

        if (obj instanceof UpdateEntityDescriptionRequest) {

            UpdateEntityDescriptionRequest temp = (UpdateEntityDescriptionRequest)obj;
            if (this._updatedAlternateEntityIds != null) {
                if (temp._updatedAlternateEntityIds == null) return false;
                if (!this._updatedAlternateEntityIds.equals(temp._updatedAlternateEntityIds)) 
                    return false;
            } else if (temp._updatedAlternateEntityIds != null)
                return false;
            if (this._updatedDefinitions != null) {
                if (temp._updatedDefinitions == null) return false;
                if (!this._updatedDefinitions.equals(temp._updatedDefinitions)) 
                    return false;
            } else if (temp._updatedDefinitions != null)
                return false;
            if (this._updatedDesignations != null) {
                if (temp._updatedDesignations == null) return false;
                if (!this._updatedDesignations.equals(temp._updatedDesignations)) 
                    return false;
            } else if (temp._updatedDesignations != null)
                return false;
            if (this._updatedComments != null) {
                if (temp._updatedComments == null) return false;
                if (!this._updatedComments.equals(temp._updatedComments)) 
                    return false;
            } else if (temp._updatedComments != null)
                return false;
            if (this._updatedParents != null) {
                if (temp._updatedParents == null) return false;
                if (!this._updatedParents.equals(temp._updatedParents)) 
                    return false;
            } else if (temp._updatedParents != null)
                return false;
            if (this._updatedProperties != null) {
                if (temp._updatedProperties == null) return false;
                if (!this._updatedProperties.equals(temp._updatedProperties)) 
                    return false;
            } else if (temp._updatedProperties != null)
                return false;
            if (this._updatedResourceTypes != null) {
                if (temp._updatedResourceTypes == null) return false;
                if (!this._updatedResourceTypes.equals(temp._updatedResourceTypes)) 
                    return false;
            } else if (temp._updatedResourceTypes != null)
                return false;
            if (this._updatedCodeSystemRole != null) {
                if (temp._updatedCodeSystemRole == null) return false;
                return this._updatedCodeSystemRole.equals(temp._updatedCodeSystemRole);
            } else return temp._updatedCodeSystemRole == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedAlternateEntityIds'.
     * 
     * @return the value of field 'UpdatedAlternateEntityIds'.
     */
    public UpdatedAlternateEntityIds getUpdatedAlternateEntityIds(
    ) {
        return this._updatedAlternateEntityIds;
    }

    /**
     * Returns the value of field 'updatedCodeSystemRole'.
     * 
     * @return the value of field 'UpdatedCodeSystemRole'.
     */
    public UpdatedCodeSystemRole getUpdatedCodeSystemRole(
    ) {
        return this._updatedCodeSystemRole;
    }

    /**
     * Returns the value of field 'updatedComments'.
     * 
     * @return the value of field 'UpdatedComments'.
     */
    public UpdatedComments getUpdatedComments(
    ) {
        return this._updatedComments;
    }

    /**
     * Returns the value of field 'updatedDefinitions'.
     * 
     * @return the value of field 'UpdatedDefinitions'.
     */
    public UpdatedDefinitions getUpdatedDefinitions(
    ) {
        return this._updatedDefinitions;
    }

    /**
     * Returns the value of field 'updatedDesignations'.
     * 
     * @return the value of field 'UpdatedDesignations'.
     */
    public UpdatedDesignations getUpdatedDesignations(
    ) {
        return this._updatedDesignations;
    }

    /**
     * Returns the value of field 'updatedParents'.
     * 
     * @return the value of field 'UpdatedParents'.
     */
    public UpdatedParents getUpdatedParents(
    ) {
        return this._updatedParents;
    }

    /**
     * Returns the value of field 'updatedProperties'.
     * 
     * @return the value of field 'UpdatedProperties'.
     */
    public UpdatedProperties getUpdatedProperties(
    ) {
        return this._updatedProperties;
    }

    /**
     * Returns the value of field 'updatedResourceTypes'.
     * 
     * @return the value of field 'UpdatedResourceTypes'.
     */
    public UpdatedResourceTypes getUpdatedResourceTypes(
    ) {
        return this._updatedResourceTypes;
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
        if (_updatedAlternateEntityIds != null) {
           result = 37 * result + _updatedAlternateEntityIds.hashCode();
        }
        if (_updatedDefinitions != null) {
           result = 37 * result + _updatedDefinitions.hashCode();
        }
        if (_updatedDesignations != null) {
           result = 37 * result + _updatedDesignations.hashCode();
        }
        if (_updatedComments != null) {
           result = 37 * result + _updatedComments.hashCode();
        }
        if (_updatedParents != null) {
           result = 37 * result + _updatedParents.hashCode();
        }
        if (_updatedProperties != null) {
           result = 37 * result + _updatedProperties.hashCode();
        }
        if (_updatedResourceTypes != null) {
           result = 37 * result + _updatedResourceTypes.hashCode();
        }
        if (_updatedCodeSystemRole != null) {
           result = 37 * result + _updatedCodeSystemRole.hashCode();
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
     * Sets the value of field 'updatedAlternateEntityIds'.
     * 
     * @param updatedAlternateEntityIds the value of field
     * 'updatedAlternateEntityIds'.
     */
    public void setUpdatedAlternateEntityIds(
            final UpdatedAlternateEntityIds updatedAlternateEntityIds) {
        this._updatedAlternateEntityIds = updatedAlternateEntityIds;
    }

    /**
     * Sets the value of field 'updatedCodeSystemRole'.
     * 
     * @param updatedCodeSystemRole the value of field
     * 'updatedCodeSystemRole'.
     */
    public void setUpdatedCodeSystemRole(
            final UpdatedCodeSystemRole updatedCodeSystemRole) {
        this._updatedCodeSystemRole = updatedCodeSystemRole;
    }

    /**
     * Sets the value of field 'updatedComments'.
     * 
     * @param updatedComments the value of field 'updatedComments'.
     */
    public void setUpdatedComments(
            final UpdatedComments updatedComments) {
        this._updatedComments = updatedComments;
    }

    /**
     * Sets the value of field 'updatedDefinitions'.
     * 
     * @param updatedDefinitions the value of field
     * 'updatedDefinitions'.
     */
    public void setUpdatedDefinitions(
            final UpdatedDefinitions updatedDefinitions) {
        this._updatedDefinitions = updatedDefinitions;
    }

    /**
     * Sets the value of field 'updatedDesignations'.
     * 
     * @param updatedDesignations the value of field
     * 'updatedDesignations'.
     */
    public void setUpdatedDesignations(
            final UpdatedDesignations updatedDesignations) {
        this._updatedDesignations = updatedDesignations;
    }

    /**
     * Sets the value of field 'updatedParents'.
     * 
     * @param updatedParents the value of field 'updatedParents'.
     */
    public void setUpdatedParents(
            final UpdatedParents updatedParents) {
        this._updatedParents = updatedParents;
    }

    /**
     * Sets the value of field 'updatedProperties'.
     * 
     * @param updatedProperties the value of field
     * 'updatedProperties'.
     */
    public void setUpdatedProperties(
            final UpdatedProperties updatedProperties) {
        this._updatedProperties = updatedProperties;
    }

    /**
     * Sets the value of field 'updatedResourceTypes'.
     * 
     * @param updatedResourceTypes the value of field
     * 'updatedResourceTypes'.
     */
    public void setUpdatedResourceTypes(
            final UpdatedResourceTypes updatedResourceTypes) {
        this._updatedResourceTypes = updatedResourceTypes;
    }

    /**
     * Method unmarshalUpdateEntityDescriptionRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.entitydescription.UpdateEntityDescriptionRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
