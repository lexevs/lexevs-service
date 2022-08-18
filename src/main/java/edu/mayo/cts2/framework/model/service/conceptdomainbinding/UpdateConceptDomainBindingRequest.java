/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.conceptdomainbinding;

/**
 * Class UpdateConceptDomainBindingRequest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateConceptDomainBindingRequest extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedBoundValueSetDefinition.
     */
    private UpdatedBoundValueSetDefinition _updatedBoundValueSetDefinition;

    /**
     * Field _updatedUseCodeSystemVersion.
     */
    private UpdatedUseCodeSystemVersion _updatedUseCodeSystemVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateConceptDomainBindingRequest() {
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

        if (obj instanceof UpdateConceptDomainBindingRequest) {

            UpdateConceptDomainBindingRequest temp = (UpdateConceptDomainBindingRequest)obj;
            if (this._updatedBoundValueSetDefinition != null) {
                if (temp._updatedBoundValueSetDefinition == null) return false;
                if (!this._updatedBoundValueSetDefinition.equals(temp._updatedBoundValueSetDefinition)) 
                    return false;
            } else if (temp._updatedBoundValueSetDefinition != null)
                return false;
            if (this._updatedUseCodeSystemVersion != null) {
                if (temp._updatedUseCodeSystemVersion == null) return false;
                return this._updatedUseCodeSystemVersion.equals(temp._updatedUseCodeSystemVersion);
            } else return temp._updatedUseCodeSystemVersion == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedBoundValueSetDefinition'.
     * 
     * @return the value of field 'UpdatedBoundValueSetDefinition'.
     */
    public UpdatedBoundValueSetDefinition getUpdatedBoundValueSetDefinition(
    ) {
        return this._updatedBoundValueSetDefinition;
    }

    /**
     * Returns the value of field 'updatedUseCodeSystemVersion'.
     * 
     * @return the value of field 'UpdatedUseCodeSystemVersion'.
     */
    public UpdatedUseCodeSystemVersion getUpdatedUseCodeSystemVersion(
    ) {
        return this._updatedUseCodeSystemVersion;
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
        if (_updatedBoundValueSetDefinition != null) {
           result = 37 * result + _updatedBoundValueSetDefinition.hashCode();
        }
        if (_updatedUseCodeSystemVersion != null) {
           result = 37 * result + _updatedUseCodeSystemVersion.hashCode();
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
     * Sets the value of field 'updatedBoundValueSetDefinition'.
     * 
     * @param updatedBoundValueSetDefinition the value of field
     * 'updatedBoundValueSetDefinition'.
     */
    public void setUpdatedBoundValueSetDefinition(
            final UpdatedBoundValueSetDefinition updatedBoundValueSetDefinition) {
        this._updatedBoundValueSetDefinition = updatedBoundValueSetDefinition;
    }

    /**
     * Sets the value of field 'updatedUseCodeSystemVersion'.
     * 
     * @param updatedUseCodeSystemVersion the value of field
     * 'updatedUseCodeSystemVersion'.
     */
    public void setUpdatedUseCodeSystemVersion(
            final UpdatedUseCodeSystemVersion updatedUseCodeSystemVersion) {
        this._updatedUseCodeSystemVersion = updatedUseCodeSystemVersion;
    }

    /**
     * Method unmarshalUpdateConceptDomainBindingRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.conceptdomainbinding.UpdateConceptDomainBindingRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
