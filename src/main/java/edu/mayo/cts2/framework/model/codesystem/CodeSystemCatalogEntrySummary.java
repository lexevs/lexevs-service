/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.codesystem;

/**
 * A synopsis of a CodeSystem along with information about how to
 * access the complete resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodeSystemCatalogEntrySummary extends edu.mayo.cts2.framework.model.core.AbstractResourceDescriptionDirectoryEntry 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the local identifier that uniquely identifies the code
     * system within the context of the implementing service. Note
     * that the about URI is the globally unique identifier.
     */
    private String _codeSystemName;

    /**
     * a directory URI that resolves to an ordered list of code
     * system versions associated with this code system. versions
     * may only be present if the service supports the
     * CodeSystemVersion
     *  Query profile.
     */
    private String _versions;

    /**
     * a reference to the code system version marked as CURRENT in
     * the service instance.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemVersionReference _currentVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodeSystemCatalogEntrySummary() {
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

        if (obj instanceof CodeSystemCatalogEntrySummary) {

            CodeSystemCatalogEntrySummary temp = (CodeSystemCatalogEntrySummary)obj;
            if (this._codeSystemName != null) {
                if (temp._codeSystemName == null) return false;
                if (!this._codeSystemName.equals(temp._codeSystemName)) 
                    return false;
            } else if (temp._codeSystemName != null)
                return false;
            if (this._versions != null) {
                if (temp._versions == null) return false;
                if (!this._versions.equals(temp._versions)) 
                    return false;
            } else if (temp._versions != null)
                return false;
            if (this._currentVersion != null) {
                if (temp._currentVersion == null) return false;
                return this._currentVersion.equals(temp._currentVersion);
            } else return temp._currentVersion == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystemName'. The field
     * 'codeSystemName' has the following description: the local
     * identifier that uniquely identifies the code system within
     * the context of the implementing service. Note that the about
     * URI is the globally unique identifier.
     * 
     * @return the value of field 'CodeSystemName'.
     */
    public String getCodeSystemName(
    ) {
        return this._codeSystemName;
    }

    /**
     * Returns the value of field 'currentVersion'. The field
     * 'currentVersion' has the following description: a reference
     * to the code system version marked as CURRENT in the service
     * instance.
     * 
     * @return the value of field 'CurrentVersion'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference getCurrentVersion(
    ) {
        return this._currentVersion;
    }

    /**
     * Returns the value of field 'versions'. The field 'versions'
     * has the following description: a directory URI that resolves
     * to an ordered list of code system versions associated with
     * this code system. versions may only be present if the
     * service supports the CodeSystemVersion
     *  Query profile.
     * 
     * @return the value of field 'Versions'.
     */
    public String getVersions(
    ) {
        return this._versions;
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
        if (_codeSystemName != null) {
           result = 37 * result + _codeSystemName.hashCode();
        }
        if (_versions != null) {
           result = 37 * result + _versions.hashCode();
        }
        if (_currentVersion != null) {
           result = 37 * result + _currentVersion.hashCode();
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
     * Sets the value of field 'codeSystemName'. The field
     * 'codeSystemName' has the following description: the local
     * identifier that uniquely identifies the code system within
     * the context of the implementing service. Note that the about
     * URI is the globally unique identifier.
     * 
     * @param codeSystemName the value of field 'codeSystemName'.
     */
    public void setCodeSystemName(
            final String codeSystemName) {
        this._codeSystemName = codeSystemName;
    }

    /**
     * Sets the value of field 'currentVersion'. The field
     * 'currentVersion' has the following description: a reference
     * to the code system version marked as CURRENT in the service
     * instance.
     * 
     * @param currentVersion the value of field 'currentVersion'.
     */
    public void setCurrentVersion(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference currentVersion) {
        this._currentVersion = currentVersion;
    }

    /**
     * Sets the value of field 'versions'. The field 'versions' has
     * the following description: a directory URI that resolves to
     * an ordered list of code system versions associated with this
     * code system. versions may only be present if the service
     * supports the CodeSystemVersion
     *  Query profile.
     * 
     * @param versions the value of field 'versions'.
     */
    public void setVersions(
            final String versions) {
        this._versions = versions;
    }

    /**
     * Method unmarshalCodeSystemCatalogEntrySummary.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.codesystem.CodeSystemCatalogEntrySummary
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
