/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * a reference to a specific version of code system and, if known,
 * the code system which it is a version of
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodeSystemVersionReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _version.
     */
    private NameAndMeaningReference _version;

    /**
     * A reference to the code system that the version is a version
     * of. Must be present if this information is known to the CTS2
     * service implementation.
     */
    private CodeSystemReference _codeSystem;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodeSystemVersionReference() {
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

        if (obj instanceof CodeSystemVersionReference) {

            CodeSystemVersionReference temp = (CodeSystemVersionReference)obj;
            if (this._version != null) {
                if (temp._version == null) return false;
                if (!this._version.equals(temp._version)) 
                    return false;
            } else if (temp._version != null)
                return false;
            if (this._codeSystem != null) {
                if (temp._codeSystem == null) return false;
                return this._codeSystem.equals(temp._codeSystem);
            } else return temp._codeSystem == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystem'. The field
     * 'codeSystem' has the following description: A reference to
     * the code system that the version is a version of. Must be
     * present if this information is known to the CTS2 service
     * implementation.
     * 
     * @return the value of field 'CodeSystem'.
     */
    public CodeSystemReference getCodeSystem(
    ) {
        return this._codeSystem;
    }

    /**
     * Returns the value of field 'version'.
     * 
     * @return the value of field 'Version'.
     */
    public NameAndMeaningReference getVersion(
    ) {
        return this._version;
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
        if (_version != null) {
           result = 37 * result + _version.hashCode();
        }
        if (_codeSystem != null) {
           result = 37 * result + _codeSystem.hashCode();
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
     * system that the version is a version of. Must be present if
     * this information is known to the CTS2 service
     * implementation.
     * 
     * @param codeSystem the value of field 'codeSystem'.
     */
    public void setCodeSystem(
            final CodeSystemReference codeSystem) {
        this._codeSystem = codeSystem;
    }

    /**
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(
            final NameAndMeaningReference version) {
        this._version = version;
    }

    /**
     * Method unmarshalCodeSystemVersionReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.CodeSystemVersionReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
