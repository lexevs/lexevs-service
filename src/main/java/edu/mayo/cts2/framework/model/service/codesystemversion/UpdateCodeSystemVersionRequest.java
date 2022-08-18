/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystemversion;

/**
 * Class UpdateCodeSystemVersionRequest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateCodeSystemVersionRequest extends edu.mayo.cts2.framework.model.service.core.UpdateResourceVersionDescription 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedDefaultLanguage.
     */
    private UpdatedDefaultLanguage _updatedDefaultLanguage;

    /**
     * Field _updatedImports.
     */
    private UpdatedImports _updatedImports;

    /**
     * Field _updatedUtilizes.
     */
    private UpdatedUtilizes _updatedUtilizes;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateCodeSystemVersionRequest() {
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

        if (obj instanceof UpdateCodeSystemVersionRequest) {

            UpdateCodeSystemVersionRequest temp = (UpdateCodeSystemVersionRequest)obj;
            if (this._updatedDefaultLanguage != null) {
                if (temp._updatedDefaultLanguage == null) return false;
                if (!this._updatedDefaultLanguage.equals(temp._updatedDefaultLanguage)) 
                    return false;
            } else if (temp._updatedDefaultLanguage != null)
                return false;
            if (this._updatedImports != null) {
                if (temp._updatedImports == null) return false;
                if (!this._updatedImports.equals(temp._updatedImports)) 
                    return false;
            } else if (temp._updatedImports != null)
                return false;
            if (this._updatedUtilizes != null) {
                if (temp._updatedUtilizes == null) return false;
                return this._updatedUtilizes.equals(temp._updatedUtilizes);
            } else return temp._updatedUtilizes == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedDefaultLanguage'.
     * 
     * @return the value of field 'UpdatedDefaultLanguage'.
     */
    public UpdatedDefaultLanguage getUpdatedDefaultLanguage(
    ) {
        return this._updatedDefaultLanguage;
    }

    /**
     * Returns the value of field 'updatedImports'.
     * 
     * @return the value of field 'UpdatedImports'.
     */
    public UpdatedImports getUpdatedImports(
    ) {
        return this._updatedImports;
    }

    /**
     * Returns the value of field 'updatedUtilizes'.
     * 
     * @return the value of field 'UpdatedUtilizes'.
     */
    public UpdatedUtilizes getUpdatedUtilizes(
    ) {
        return this._updatedUtilizes;
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
        if (_updatedDefaultLanguage != null) {
           result = 37 * result + _updatedDefaultLanguage.hashCode();
        }
        if (_updatedImports != null) {
           result = 37 * result + _updatedImports.hashCode();
        }
        if (_updatedUtilizes != null) {
           result = 37 * result + _updatedUtilizes.hashCode();
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
     * Sets the value of field 'updatedDefaultLanguage'.
     * 
     * @param updatedDefaultLanguage the value of field
     * 'updatedDefaultLanguage'.
     */
    public void setUpdatedDefaultLanguage(
            final UpdatedDefaultLanguage updatedDefaultLanguage) {
        this._updatedDefaultLanguage = updatedDefaultLanguage;
    }

    /**
     * Sets the value of field 'updatedImports'.
     * 
     * @param updatedImports the value of field 'updatedImports'.
     */
    public void setUpdatedImports(
            final UpdatedImports updatedImports) {
        this._updatedImports = updatedImports;
    }

    /**
     * Sets the value of field 'updatedUtilizes'.
     * 
     * @param updatedUtilizes the value of field 'updatedUtilizes'.
     */
    public void setUpdatedUtilizes(
            final UpdatedUtilizes updatedUtilizes) {
        this._updatedUtilizes = updatedUtilizes;
    }

    /**
     * Method unmarshalUpdateCodeSystemVersionRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystemversion.UpdateCodeSystemVersionRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
