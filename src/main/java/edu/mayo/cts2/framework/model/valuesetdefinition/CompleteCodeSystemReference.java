/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

/**
 * An entry that, when resolved, returns all of the active entity
 * references in a given code system. This includes all entity
 * references that appear as the source of one or more statements
 * in the code system,
 *  whether the assertions are made directly by a version of the
 * code system or indirectly by a version of a different code
 * system that is imported. Note that targets are not included to
 * prevent codes from rdf, rdfs, owl, etc
 *  being included in this resolution set.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CompleteCodeSystemReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A reference to the code system whose codes are to be included
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemReference _codeSystem;

    /**
     * A reference to the specific version of the code system to
     * include. If not supplied, the specific version of the code
     * system is determined in the resolution call itself.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemVersionReference _codeSystemVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public CompleteCodeSystemReference() {
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

        if (obj instanceof CompleteCodeSystemReference) {

            CompleteCodeSystemReference temp = (CompleteCodeSystemReference)obj;
            if (this._codeSystem != null) {
                if (temp._codeSystem == null) return false;
                if (!this._codeSystem.equals(temp._codeSystem)) 
                    return false;
            } else if (temp._codeSystem != null)
                return false;
            if (this._codeSystemVersion != null) {
                if (temp._codeSystemVersion == null) return false;
                return this._codeSystemVersion.equals(temp._codeSystemVersion);
            } else return temp._codeSystemVersion == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystem'. The field
     * 'codeSystem' has the following description: A reference to
     * the code system whose codes are to be included.
     * 
     * @return the value of field 'CodeSystem'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemReference getCodeSystem(
    ) {
        return this._codeSystem;
    }

    /**
     * Returns the value of field 'codeSystemVersion'. The field
     * 'codeSystemVersion' has the following description: A
     * reference to the specific version of the code system to
     * include. If not supplied, the specific version of the code
     * system is determined in the resolution call itself.
     * 
     * @return the value of field 'CodeSystemVersion'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference getCodeSystemVersion(
    ) {
        return this._codeSystemVersion;
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
        if (_codeSystem != null) {
           result = 37 * result + _codeSystem.hashCode();
        }
        if (_codeSystemVersion != null) {
           result = 37 * result + _codeSystemVersion.hashCode();
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
     * Sets the value of field 'codeSystem'. The field 'codeSystem'
     * has the following description: A reference to the code
     * system whose codes are to be included.
     * 
     * @param codeSystem the value of field 'codeSystem'.
     */
    public void setCodeSystem(
            final edu.mayo.cts2.framework.model.core.CodeSystemReference codeSystem) {
        this._codeSystem = codeSystem;
    }

    /**
     * Sets the value of field 'codeSystemVersion'. The field
     * 'codeSystemVersion' has the following description: A
     * reference to the specific version of the code system to
     * include. If not supplied, the specific version of the code
     * system is determined in the resolution call itself.
     * 
     * @param codeSystemVersion the value of field
     * 'codeSystemVersion'.
     */
    public void setCodeSystemVersion(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference codeSystemVersion) {
        this._codeSystemVersion = codeSystemVersion;
    }

    /**
     * Method unmarshalCompleteCodeSystemReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.CompleteCodeSystemReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
