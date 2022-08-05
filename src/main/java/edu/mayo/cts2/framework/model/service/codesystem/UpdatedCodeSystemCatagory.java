/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystem;

import edu.mayo.cts2.framework.model.core.CodeSystemCategoryReference;

/**
 * Class UpdatedCodeSystemCatagory.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedCodeSystemCatagory extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codeSystemCatagory.
     */
    private CodeSystemCategoryReference _codeSystemCatagory;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedCodeSystemCatagory() {
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

        if (obj instanceof UpdatedCodeSystemCatagory) {

            UpdatedCodeSystemCatagory temp = (UpdatedCodeSystemCatagory)obj;
            if (this._codeSystemCatagory != null) {
                if (temp._codeSystemCatagory == null) return false;
                return this._codeSystemCatagory.equals(temp._codeSystemCatagory);
            } else return temp._codeSystemCatagory == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystemCatagory'.
     * 
     * @return the value of field 'CodeSystemCatagory'.
     */
    public CodeSystemCategoryReference getCodeSystemCatagory(
    ) {
        return this._codeSystemCatagory;
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
        if (_codeSystemCatagory != null) {
           result = 37 * result + _codeSystemCatagory.hashCode();
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
     * Sets the value of field 'codeSystemCatagory'.
     * 
     * @param codeSystemCatagory the value of field
     * 'codeSystemCatagory'.
     */
    public void setCodeSystemCatagory(
            final CodeSystemCategoryReference codeSystemCatagory) {
        this._codeSystemCatagory = codeSystemCatagory;
    }

    /**
     * Method unmarshalUpdatedCodeSystemCatagory.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystem.UpdatedCodeSystemCatagory
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
