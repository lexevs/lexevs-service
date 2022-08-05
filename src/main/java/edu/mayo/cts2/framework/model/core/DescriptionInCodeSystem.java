/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * A reference to specific version of a code system that contains
 * assertions about a given entity, including the namespace and
 * name by which the entity is referenced, an optional designation
 * appropriate to the
 *  given usage context and an optional RenderingURI that
 * references the full EntityDescription contained in the specific
 * code system version.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class DescriptionInCodeSystem extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a RenderingURI that, if followed, will provide a full CTS2
     *  EntityDescription derived from the corresponding code
     * system version
     */
    private String _href;

    /**
     * If present, identifies the role that the code system plays
     * in the description
     *  of the entity. If absent, the role is unknown.
     */
    private edu.mayo.cts2.framework.model.core.types.CodeSystemRole _codeSystemRole;

    /**
     * a reference to the code system version that describes the
     * entity
     */
    private CodeSystemVersionReference _describingCodeSystemVersion;

    /**
     * a contextually appropriate designation for the entity
     * derived from the \\ describingCodeSystemVersion
     */
    private String _designation;


      //----------------/
     //- Constructors -/
    //----------------/

    public DescriptionInCodeSystem() {
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

        if (obj instanceof DescriptionInCodeSystem) {

            DescriptionInCodeSystem temp = (DescriptionInCodeSystem)obj;
            if (this._href != null) {
                if (temp._href == null) return false;
                if (!this._href.equals(temp._href)) 
                    return false;
            } else if (temp._href != null)
                return false;
            if (this._codeSystemRole != null) {
                if (temp._codeSystemRole == null) return false;
                if (!this._codeSystemRole.equals(temp._codeSystemRole)) 
                    return false;
            } else if (temp._codeSystemRole != null)
                return false;
            if (this._describingCodeSystemVersion != null) {
                if (temp._describingCodeSystemVersion == null) return false;
                if (!this._describingCodeSystemVersion.equals(temp._describingCodeSystemVersion)) 
                    return false;
            } else if (temp._describingCodeSystemVersion != null)
                return false;
            if (this._designation != null) {
                if (temp._designation == null) return false;
                return this._designation.equals(temp._designation);
            } else return temp._designation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystemRole'. The field
     * 'codeSystemRole' has the following description: If present,
     * identifies the role that the code system plays in the
     * description
     *  of the entity. If absent, the role is unknown.
     * 
     * @return the value of field 'CodeSystemRole'.
     */
    public edu.mayo.cts2.framework.model.core.types.CodeSystemRole getCodeSystemRole(
    ) {
        return this._codeSystemRole;
    }

    /**
     * Returns the value of field 'describingCodeSystemVersion'.
     * The field 'describingCodeSystemVersion' has the following
     * description: a reference to the code system version that
     * describes the entity
     * 
     * @return the value of field 'DescribingCodeSystemVersion'.
     */
    public CodeSystemVersionReference getDescribingCodeSystemVersion(
    ) {
        return this._describingCodeSystemVersion;
    }

    /**
     * Returns the value of field 'designation'. The field
     * 'designation' has the following description: a contextually
     * appropriate designation for the entity derived from the \\
     * describingCodeSystemVersion
     * 
     * @return the value of field 'Designation'.
     */
    public String getDesignation(
    ) {
        return this._designation;
    }

    /**
     * Returns the value of field 'href'. The field 'href' has the
     * following description: a RenderingURI that, if followed,
     * will provide a full CTS2
     *  EntityDescription derived from the corresponding code
     * system version
     * 
     * @return the value of field 'Href'.
     */
    public String getHref(
    ) {
        return this._href;
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
        if (_href != null) {
           result = 37 * result + _href.hashCode();
        }
        if (_codeSystemRole != null) {
           result = 37 * result + _codeSystemRole.hashCode();
        }
        if (_describingCodeSystemVersion != null) {
           result = 37 * result + _describingCodeSystemVersion.hashCode();
        }
        if (_designation != null) {
           result = 37 * result + _designation.hashCode();
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
     * Sets the value of field 'codeSystemRole'. The field
     * 'codeSystemRole' has the following description: If present,
     * identifies the role that the code system plays in the
     * description
     *  of the entity. If absent, the role is unknown.
     * 
     * @param codeSystemRole the value of field 'codeSystemRole'.
     */
    public void setCodeSystemRole(
            final edu.mayo.cts2.framework.model.core.types.CodeSystemRole codeSystemRole) {
        this._codeSystemRole = codeSystemRole;
    }

    /**
     * Sets the value of field 'describingCodeSystemVersion'. The
     * field 'describingCodeSystemVersion' has the following
     * description: a reference to the code system version that
     * describes the entity
     * 
     * @param describingCodeSystemVersion the value of field
     * 'describingCodeSystemVersion'.
     */
    public void setDescribingCodeSystemVersion(
            final CodeSystemVersionReference describingCodeSystemVersion) {
        this._describingCodeSystemVersion = describingCodeSystemVersion;
    }

    /**
     * Sets the value of field 'designation'. The field
     * 'designation' has the following description: a contextually
     * appropriate designation for the entity derived from the \\
     * describingCodeSystemVersion
     * 
     * @param designation the value of field 'designation'.
     */
    public void setDesignation(
            final String designation) {
        this._designation = designation;
    }

    /**
     * Sets the value of field 'href'. The field 'href' has the
     * following description: a RenderingURI that, if followed,
     * will provide a full CTS2
     *  EntityDescription derived from the corresponding code
     * system version
     * 
     * @param href the value of field 'href'.
     */
    public void setHref(
            final String href) {
        this._href = href;
    }

    /**
     * Method unmarshalDescriptionInCodeSystem.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.DescriptionInCodeSystem
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
