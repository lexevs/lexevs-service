/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapversion;

import edu.mayo.cts2.framework.model.service.core.UpdateResourceVersionDescription;

/**
 * Class UpdateMapVersionRequest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateMapVersionRequest extends UpdateResourceVersionDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedUseCodeSystemVersions.
     */
    private UpdatedUseCodeSystemVersions _updatedUseCodeSystemVersions;

    /**
     * Field _updatedApplicableContexts.
     */
    private UpdatedApplicableContexts _updatedApplicableContexts;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateMapVersionRequest() {
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

        if (obj instanceof UpdateMapVersionRequest) {

            UpdateMapVersionRequest temp = (UpdateMapVersionRequest)obj;
            if (this._updatedUseCodeSystemVersions != null) {
                if (temp._updatedUseCodeSystemVersions == null) return false;
                if (!this._updatedUseCodeSystemVersions.equals(temp._updatedUseCodeSystemVersions)) 
                    return false;
            } else if (temp._updatedUseCodeSystemVersions != null)
                return false;
            if (this._updatedApplicableContexts != null) {
                if (temp._updatedApplicableContexts == null) return false;
                return this._updatedApplicableContexts.equals(temp._updatedApplicableContexts);
            } else return temp._updatedApplicableContexts == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedApplicableContexts'.
     * 
     * @return the value of field 'UpdatedApplicableContexts'.
     */
    public UpdatedApplicableContexts getUpdatedApplicableContexts(
    ) {
        return this._updatedApplicableContexts;
    }

    /**
     * Returns the value of field 'updatedUseCodeSystemVersions'.
     * 
     * @return the value of field 'UpdatedUseCodeSystemVersions'.
     */
    public UpdatedUseCodeSystemVersions getUpdatedUseCodeSystemVersions(
    ) {
        return this._updatedUseCodeSystemVersions;
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
        if (_updatedUseCodeSystemVersions != null) {
           result = 37 * result + _updatedUseCodeSystemVersions.hashCode();
        }
        if (_updatedApplicableContexts != null) {
           result = 37 * result + _updatedApplicableContexts.hashCode();
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
     * Sets the value of field 'updatedApplicableContexts'.
     * 
     * @param updatedApplicableContexts the value of field
     * 'updatedApplicableContexts'.
     */
    public void setUpdatedApplicableContexts(
            final UpdatedApplicableContexts updatedApplicableContexts) {
        this._updatedApplicableContexts = updatedApplicableContexts;
    }

    /**
     * Sets the value of field 'updatedUseCodeSystemVersions'.
     * 
     * @param updatedUseCodeSystemVersions the value of field
     * 'updatedUseCodeSystemVersions'.
     */
    public void setUpdatedUseCodeSystemVersions(
            final UpdatedUseCodeSystemVersions updatedUseCodeSystemVersions) {
        this._updatedUseCodeSystemVersions = updatedUseCodeSystemVersions;
    }

    /**
     * Method unmarshalUpdateMapVersionRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapversion.UpdateMapVersionRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
