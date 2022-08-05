/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystem;

import edu.mayo.cts2.framework.model.service.core.UpdateAbstractResourceDescription;

/**
 * Class UpdateCodeSystemCatalogEntry.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateCodeSystemCatalogEntry extends UpdateAbstractResourceDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedCodeSystemCatagory.
     */
    private UpdatedCodeSystemCatagory _updatedCodeSystemCatagory;

    /**
     * Field _updatedDesignedForOntologyTasks.
     */
    private UpdatedDesignedForOntologyTasks _updatedDesignedForOntologyTasks;

    /**
     * Field _updatedHasOntologyLanguage.
     */
    private UpdatedHasOntologyLanguage _updatedHasOntologyLanguage;

    /**
     * Field _updatedOntologyDomains.
     */
    private UpdatedOntologyDomains _updatedOntologyDomains;

    /**
     * Field _updatedOntologyType.
     */
    private UpdatedOntologyType _updatedOntologyType;

    /**
     * Field _updatedUsedOntologyEngineeringTools.
     */
    private UpdatedUsedOntologyEngineeringTools _updatedUsedOntologyEngineeringTools;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateCodeSystemCatalogEntry() {
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

        if (obj instanceof UpdateCodeSystemCatalogEntry) {

            UpdateCodeSystemCatalogEntry temp = (UpdateCodeSystemCatalogEntry)obj;
            if (this._updatedCodeSystemCatagory != null) {
                if (temp._updatedCodeSystemCatagory == null) return false;
                if (!this._updatedCodeSystemCatagory.equals(temp._updatedCodeSystemCatagory)) 
                    return false;
            } else if (temp._updatedCodeSystemCatagory != null)
                return false;
            if (this._updatedDesignedForOntologyTasks != null) {
                if (temp._updatedDesignedForOntologyTasks == null) return false;
                if (!this._updatedDesignedForOntologyTasks.equals(temp._updatedDesignedForOntologyTasks)) 
                    return false;
            } else if (temp._updatedDesignedForOntologyTasks != null)
                return false;
            if (this._updatedHasOntologyLanguage != null) {
                if (temp._updatedHasOntologyLanguage == null) return false;
                if (!this._updatedHasOntologyLanguage.equals(temp._updatedHasOntologyLanguage)) 
                    return false;
            } else if (temp._updatedHasOntologyLanguage != null)
                return false;
            if (this._updatedOntologyDomains != null) {
                if (temp._updatedOntologyDomains == null) return false;
                if (!this._updatedOntologyDomains.equals(temp._updatedOntologyDomains)) 
                    return false;
            } else if (temp._updatedOntologyDomains != null)
                return false;
            if (this._updatedOntologyType != null) {
                if (temp._updatedOntologyType == null) return false;
                if (!this._updatedOntologyType.equals(temp._updatedOntologyType)) 
                    return false;
            } else if (temp._updatedOntologyType != null)
                return false;
            if (this._updatedUsedOntologyEngineeringTools != null) {
                if (temp._updatedUsedOntologyEngineeringTools == null) return false;
                return this._updatedUsedOntologyEngineeringTools.equals(temp._updatedUsedOntologyEngineeringTools);
            } else return temp._updatedUsedOntologyEngineeringTools == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedCodeSystemCatagory'.
     * 
     * @return the value of field 'UpdatedCodeSystemCatagory'.
     */
    public UpdatedCodeSystemCatagory getUpdatedCodeSystemCatagory(
    ) {
        return this._updatedCodeSystemCatagory;
    }

    /**
     * Returns the value of field
     * 'updatedDesignedForOntologyTasks'.
     * 
     * @return the value of field 'UpdatedDesignedForOntologyTasks'.
     */
    public UpdatedDesignedForOntologyTasks getUpdatedDesignedForOntologyTasks(
    ) {
        return this._updatedDesignedForOntologyTasks;
    }

    /**
     * Returns the value of field 'updatedHasOntologyLanguage'.
     * 
     * @return the value of field 'UpdatedHasOntologyLanguage'.
     */
    public UpdatedHasOntologyLanguage getUpdatedHasOntologyLanguage(
    ) {
        return this._updatedHasOntologyLanguage;
    }

    /**
     * Returns the value of field 'updatedOntologyDomains'.
     * 
     * @return the value of field 'UpdatedOntologyDomains'.
     */
    public UpdatedOntologyDomains getUpdatedOntologyDomains(
    ) {
        return this._updatedOntologyDomains;
    }

    /**
     * Returns the value of field 'updatedOntologyType'.
     * 
     * @return the value of field 'UpdatedOntologyType'.
     */
    public UpdatedOntologyType getUpdatedOntologyType(
    ) {
        return this._updatedOntologyType;
    }

    /**
     * Returns the value of field
     * 'updatedUsedOntologyEngineeringTools'.
     * 
     * @return the value of field
     * 'UpdatedUsedOntologyEngineeringTools'.
     */
    public UpdatedUsedOntologyEngineeringTools getUpdatedUsedOntologyEngineeringTools(
    ) {
        return this._updatedUsedOntologyEngineeringTools;
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
        if (_updatedCodeSystemCatagory != null) {
           result = 37 * result + _updatedCodeSystemCatagory.hashCode();
        }
        if (_updatedDesignedForOntologyTasks != null) {
           result = 37 * result + _updatedDesignedForOntologyTasks.hashCode();
        }
        if (_updatedHasOntologyLanguage != null) {
           result = 37 * result + _updatedHasOntologyLanguage.hashCode();
        }
        if (_updatedOntologyDomains != null) {
           result = 37 * result + _updatedOntologyDomains.hashCode();
        }
        if (_updatedOntologyType != null) {
           result = 37 * result + _updatedOntologyType.hashCode();
        }
        if (_updatedUsedOntologyEngineeringTools != null) {
           result = 37 * result + _updatedUsedOntologyEngineeringTools.hashCode();
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
     * Sets the value of field 'updatedCodeSystemCatagory'.
     * 
     * @param updatedCodeSystemCatagory the value of field
     * 'updatedCodeSystemCatagory'.
     */
    public void setUpdatedCodeSystemCatagory(
            final UpdatedCodeSystemCatagory updatedCodeSystemCatagory) {
        this._updatedCodeSystemCatagory = updatedCodeSystemCatagory;
    }

    /**
     * Sets the value of field 'updatedDesignedForOntologyTasks'.
     * 
     * @param updatedDesignedForOntologyTasks the value of field
     * 'updatedDesignedForOntologyTasks'.
     */
    public void setUpdatedDesignedForOntologyTasks(
            final UpdatedDesignedForOntologyTasks updatedDesignedForOntologyTasks) {
        this._updatedDesignedForOntologyTasks = updatedDesignedForOntologyTasks;
    }

    /**
     * Sets the value of field 'updatedHasOntologyLanguage'.
     * 
     * @param updatedHasOntologyLanguage the value of field
     * 'updatedHasOntologyLanguage'.
     */
    public void setUpdatedHasOntologyLanguage(
            final UpdatedHasOntologyLanguage updatedHasOntologyLanguage) {
        this._updatedHasOntologyLanguage = updatedHasOntologyLanguage;
    }

    /**
     * Sets the value of field 'updatedOntologyDomains'.
     * 
     * @param updatedOntologyDomains the value of field
     * 'updatedOntologyDomains'.
     */
    public void setUpdatedOntologyDomains(
            final UpdatedOntologyDomains updatedOntologyDomains) {
        this._updatedOntologyDomains = updatedOntologyDomains;
    }

    /**
     * Sets the value of field 'updatedOntologyType'.
     * 
     * @param updatedOntologyType the value of field
     * 'updatedOntologyType'.
     */
    public void setUpdatedOntologyType(
            final UpdatedOntologyType updatedOntologyType) {
        this._updatedOntologyType = updatedOntologyType;
    }

    /**
     * Sets the value of field
     * 'updatedUsedOntologyEngineeringTools'.
     * 
     * @param updatedUsedOntologyEngineeringTools the value of
     * field 'updatedUsedOntologyEngineeringTools'.
     */
    public void setUpdatedUsedOntologyEngineeringTools(
            final UpdatedUsedOntologyEngineeringTools updatedUsedOntologyEngineeringTools) {
        this._updatedUsedOntologyEngineeringTools = updatedUsedOntologyEngineeringTools;
    }

    /**
     * Method unmarshalUpdateCodeSystemCatalogEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystem.UpdateCodeSystemCatalogEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
