/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.entitydescription;

/**
 * Class UpdatedCodeSystemRole.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedCodeSystemRole extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codeSystemRole.
     */
    private edu.mayo.cts2.framework.model.core.types.CodeSystemRole _codeSystemRole;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedCodeSystemRole() {
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

        if (obj instanceof UpdatedCodeSystemRole) {

            UpdatedCodeSystemRole temp = (UpdatedCodeSystemRole)obj;
            if (this._codeSystemRole != null) {
                if (temp._codeSystemRole == null) return false;
                return this._codeSystemRole.equals(temp._codeSystemRole);
            } else return temp._codeSystemRole == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystemRole'.
     * 
     * @return the value of field 'CodeSystemRole'.
     */
    public edu.mayo.cts2.framework.model.core.types.CodeSystemRole getCodeSystemRole(
    ) {
        return this._codeSystemRole;
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
        if (_codeSystemRole != null) {
           result = 37 * result + _codeSystemRole.hashCode();
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
     * Sets the value of field 'codeSystemRole'.
     * 
     * @param codeSystemRole the value of field 'codeSystemRole'.
     */
    public void setCodeSystemRole(
            final edu.mayo.cts2.framework.model.core.types.CodeSystemRole codeSystemRole) {
        this._codeSystemRole = codeSystemRole;
    }

    /**
     * Method unmarshalUpdatedCodeSystemRole.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.entitydescription.UpdatedCodeSystemRole
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
