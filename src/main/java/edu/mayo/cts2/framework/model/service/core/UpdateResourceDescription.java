/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class UpdateResourceDescription extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedFormalName.
     */
    private String _updatedFormalName;

    /**
     * Field _updatedAdditionalDocumentation.
     */
    private UpdatedAdditionalDocumentation _updatedAdditionalDocumentation;

    /**
     * Field _updatedKeywords.
     */
    private UpdatedKeywords _updatedKeywords;

    /**
     * Field _updatedSources.
     */
    private UpdatedSources _updatedSources;

    /**
     * Field _updatedNotes.
     */
    private UpdatedNotes _updatedNotes;

    /**
     * Field _updatedProperties.
     */
    private UpdatedProperties _updatedProperties;

    /**
     * Field _updatedResourceSynopsis.
     */
    private UpdatedResourceSynopsis _updatedResourceSynopsis;

    /**
     * Field _updatedResourceTypes.
     */
    private UpdatedResourceTypes _updatedResourceTypes;

    /**
     * Field _updatedRights.
     */
    private UpdatedRights _updatedRights;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateResourceDescription() {
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

        if (obj instanceof UpdateResourceDescription) {

            UpdateResourceDescription temp = (UpdateResourceDescription)obj;
            if (this._updatedFormalName != null) {
                if (temp._updatedFormalName == null) return false;
                if (!this._updatedFormalName.equals(temp._updatedFormalName)) 
                    return false;
            } else if (temp._updatedFormalName != null)
                return false;
            if (this._updatedAdditionalDocumentation != null) {
                if (temp._updatedAdditionalDocumentation == null) return false;
                if (!this._updatedAdditionalDocumentation.equals(temp._updatedAdditionalDocumentation)) 
                    return false;
            } else if (temp._updatedAdditionalDocumentation != null)
                return false;
            if (this._updatedKeywords != null) {
                if (temp._updatedKeywords == null) return false;
                if (!this._updatedKeywords.equals(temp._updatedKeywords)) 
                    return false;
            } else if (temp._updatedKeywords != null)
                return false;
            if (this._updatedSources != null) {
                if (temp._updatedSources == null) return false;
                if (!this._updatedSources.equals(temp._updatedSources)) 
                    return false;
            } else if (temp._updatedSources != null)
                return false;
            if (this._updatedNotes != null) {
                if (temp._updatedNotes == null) return false;
                if (!this._updatedNotes.equals(temp._updatedNotes)) 
                    return false;
            } else if (temp._updatedNotes != null)
                return false;
            if (this._updatedProperties != null) {
                if (temp._updatedProperties == null) return false;
                if (!this._updatedProperties.equals(temp._updatedProperties)) 
                    return false;
            } else if (temp._updatedProperties != null)
                return false;
            if (this._updatedResourceSynopsis != null) {
                if (temp._updatedResourceSynopsis == null) return false;
                if (!this._updatedResourceSynopsis.equals(temp._updatedResourceSynopsis)) 
                    return false;
            } else if (temp._updatedResourceSynopsis != null)
                return false;
            if (this._updatedResourceTypes != null) {
                if (temp._updatedResourceTypes == null) return false;
                if (!this._updatedResourceTypes.equals(temp._updatedResourceTypes)) 
                    return false;
            } else if (temp._updatedResourceTypes != null)
                return false;
            if (this._updatedRights != null) {
                if (temp._updatedRights == null) return false;
                return this._updatedRights.equals(temp._updatedRights);
            } else return temp._updatedRights == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedAdditionalDocumentation'.
     * 
     * @return the value of field 'UpdatedAdditionalDocumentation'.
     */
    public UpdatedAdditionalDocumentation getUpdatedAdditionalDocumentation(
    ) {
        return this._updatedAdditionalDocumentation;
    }

    /**
     * Returns the value of field 'updatedFormalName'.
     * 
     * @return the value of field 'UpdatedFormalName'.
     */
    public String getUpdatedFormalName(
    ) {
        return this._updatedFormalName;
    }

    /**
     * Returns the value of field 'updatedKeywords'.
     * 
     * @return the value of field 'UpdatedKeywords'.
     */
    public UpdatedKeywords getUpdatedKeywords(
    ) {
        return this._updatedKeywords;
    }

    /**
     * Returns the value of field 'updatedNotes'.
     * 
     * @return the value of field 'UpdatedNotes'.
     */
    public UpdatedNotes getUpdatedNotes(
    ) {
        return this._updatedNotes;
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
     * Returns the value of field 'updatedResourceSynopsis'.
     * 
     * @return the value of field 'UpdatedResourceSynopsis'.
     */
    public UpdatedResourceSynopsis getUpdatedResourceSynopsis(
    ) {
        return this._updatedResourceSynopsis;
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
     * Returns the value of field 'updatedRights'.
     * 
     * @return the value of field 'UpdatedRights'.
     */
    public UpdatedRights getUpdatedRights(
    ) {
        return this._updatedRights;
    }

    /**
     * Returns the value of field 'updatedSources'.
     * 
     * @return the value of field 'UpdatedSources'.
     */
    public UpdatedSources getUpdatedSources(
    ) {
        return this._updatedSources;
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
        if (_updatedFormalName != null) {
           result = 37 * result + _updatedFormalName.hashCode();
        }
        if (_updatedAdditionalDocumentation != null) {
           result = 37 * result + _updatedAdditionalDocumentation.hashCode();
        }
        if (_updatedKeywords != null) {
           result = 37 * result + _updatedKeywords.hashCode();
        }
        if (_updatedSources != null) {
           result = 37 * result + _updatedSources.hashCode();
        }
        if (_updatedNotes != null) {
           result = 37 * result + _updatedNotes.hashCode();
        }
        if (_updatedProperties != null) {
           result = 37 * result + _updatedProperties.hashCode();
        }
        if (_updatedResourceSynopsis != null) {
           result = 37 * result + _updatedResourceSynopsis.hashCode();
        }
        if (_updatedResourceTypes != null) {
           result = 37 * result + _updatedResourceTypes.hashCode();
        }
        if (_updatedRights != null) {
           result = 37 * result + _updatedRights.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Sets the value of field 'updatedAdditionalDocumentation'.
     * 
     * @param updatedAdditionalDocumentation the value of field
     * 'updatedAdditionalDocumentation'.
     */
    public void setUpdatedAdditionalDocumentation(
            final UpdatedAdditionalDocumentation updatedAdditionalDocumentation) {
        this._updatedAdditionalDocumentation = updatedAdditionalDocumentation;
    }

    /**
     * Sets the value of field 'updatedFormalName'.
     * 
     * @param updatedFormalName the value of field
     * 'updatedFormalName'.
     */
    public void setUpdatedFormalName(
            final String updatedFormalName) {
        this._updatedFormalName = updatedFormalName;
    }

    /**
     * Sets the value of field 'updatedKeywords'.
     * 
     * @param updatedKeywords the value of field 'updatedKeywords'.
     */
    public void setUpdatedKeywords(
            final UpdatedKeywords updatedKeywords) {
        this._updatedKeywords = updatedKeywords;
    }

    /**
     * Sets the value of field 'updatedNotes'.
     * 
     * @param updatedNotes the value of field 'updatedNotes'.
     */
    public void setUpdatedNotes(
            final UpdatedNotes updatedNotes) {
        this._updatedNotes = updatedNotes;
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
     * Sets the value of field 'updatedResourceSynopsis'.
     * 
     * @param updatedResourceSynopsis the value of field
     * 'updatedResourceSynopsis'.
     */
    public void setUpdatedResourceSynopsis(
            final UpdatedResourceSynopsis updatedResourceSynopsis) {
        this._updatedResourceSynopsis = updatedResourceSynopsis;
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
     * Sets the value of field 'updatedRights'.
     * 
     * @param updatedRights the value of field 'updatedRights'.
     */
    public void setUpdatedRights(
            final UpdatedRights updatedRights) {
        this._updatedRights = updatedRights;
    }

    /**
     * Sets the value of field 'updatedSources'.
     * 
     * @param updatedSources the value of field 'updatedSources'.
     */
    public void setUpdatedSources(
            final UpdatedSources updatedSources) {
        this._updatedSources = updatedSources;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
