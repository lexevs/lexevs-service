/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapversion;

/**
 * Class CreateMapVersionRequest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CreateMapVersionRequest extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _documentURI.
     */
    private String _documentURI;

    /**
     * Field _mapVersionName.
     */
    private String _mapVersionName;

    /**
     * Field _fromCodeSystemVersion.
     */
    private edu.mayo.cts2.framework.model.service.core.NameOrURI _fromCodeSystemVersion;

    /**
     * Field _fromValueSetDefinition.
     */
    private edu.mayo.cts2.framework.model.service.core.NameOrURI _fromValueSetDefinition;

    /**
     * Field _toCodeSystemVersion.
     */
    private edu.mayo.cts2.framework.model.service.core.NameOrURI _toCodeSystemVersion;

    /**
     * Field _toValueSetDefinition.
     */
    private edu.mayo.cts2.framework.model.service.core.NameOrURI _toValueSetDefinition;

    /**
     * Field _useCodeSystemVersions.
     */
    private edu.mayo.cts2.framework.model.service.core.NameOrURIList _useCodeSystemVersions;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreateMapVersionRequest() {
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

        if (obj instanceof CreateMapVersionRequest) {

            CreateMapVersionRequest temp = (CreateMapVersionRequest)obj;
            if (this._documentURI != null) {
                if (temp._documentURI == null) return false;
                if (!this._documentURI.equals(temp._documentURI)) 
                    return false;
            } else if (temp._documentURI != null)
                return false;
            if (this._mapVersionName != null) {
                if (temp._mapVersionName == null) return false;
                if (!this._mapVersionName.equals(temp._mapVersionName)) 
                    return false;
            } else if (temp._mapVersionName != null)
                return false;
            if (this._fromCodeSystemVersion != null) {
                if (temp._fromCodeSystemVersion == null) return false;
                if (!this._fromCodeSystemVersion.equals(temp._fromCodeSystemVersion)) 
                    return false;
            } else if (temp._fromCodeSystemVersion != null)
                return false;
            if (this._fromValueSetDefinition != null) {
                if (temp._fromValueSetDefinition == null) return false;
                if (!this._fromValueSetDefinition.equals(temp._fromValueSetDefinition)) 
                    return false;
            } else if (temp._fromValueSetDefinition != null)
                return false;
            if (this._toCodeSystemVersion != null) {
                if (temp._toCodeSystemVersion == null) return false;
                if (!this._toCodeSystemVersion.equals(temp._toCodeSystemVersion)) 
                    return false;
            } else if (temp._toCodeSystemVersion != null)
                return false;
            if (this._toValueSetDefinition != null) {
                if (temp._toValueSetDefinition == null) return false;
                if (!this._toValueSetDefinition.equals(temp._toValueSetDefinition)) 
                    return false;
            } else if (temp._toValueSetDefinition != null)
                return false;
            if (this._useCodeSystemVersions != null) {
                if (temp._useCodeSystemVersions == null) return false;
                return this._useCodeSystemVersions.equals(temp._useCodeSystemVersions);
            } else return temp._useCodeSystemVersions == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'documentURI'.
     * 
     * @return the value of field 'DocumentURI'.
     */
    public String getDocumentURI(
    ) {
        return this._documentURI;
    }

    /**
     * Returns the value of field 'fromCodeSystemVersion'.
     * 
     * @return the value of field 'FromCodeSystemVersion'.
     */
    public edu.mayo.cts2.framework.model.service.core.NameOrURI getFromCodeSystemVersion(
    ) {
        return this._fromCodeSystemVersion;
    }

    /**
     * Returns the value of field 'fromValueSetDefinition'.
     * 
     * @return the value of field 'FromValueSetDefinition'.
     */
    public edu.mayo.cts2.framework.model.service.core.NameOrURI getFromValueSetDefinition(
    ) {
        return this._fromValueSetDefinition;
    }

    /**
     * Returns the value of field 'mapVersionName'.
     * 
     * @return the value of field 'MapVersionName'.
     */
    public String getMapVersionName(
    ) {
        return this._mapVersionName;
    }

    /**
     * Returns the value of field 'toCodeSystemVersion'.
     * 
     * @return the value of field 'ToCodeSystemVersion'.
     */
    public edu.mayo.cts2.framework.model.service.core.NameOrURI getToCodeSystemVersion(
    ) {
        return this._toCodeSystemVersion;
    }

    /**
     * Returns the value of field 'toValueSetDefinition'.
     * 
     * @return the value of field 'ToValueSetDefinition'.
     */
    public edu.mayo.cts2.framework.model.service.core.NameOrURI getToValueSetDefinition(
    ) {
        return this._toValueSetDefinition;
    }

    /**
     * Returns the value of field 'useCodeSystemVersions'.
     * 
     * @return the value of field 'UseCodeSystemVersions'.
     */
    public edu.mayo.cts2.framework.model.service.core.NameOrURIList getUseCodeSystemVersions(
    ) {
        return this._useCodeSystemVersions;
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
        if (_documentURI != null) {
           result = 37 * result + _documentURI.hashCode();
        }
        if (_mapVersionName != null) {
           result = 37 * result + _mapVersionName.hashCode();
        }
        if (_fromCodeSystemVersion != null) {
           result = 37 * result + _fromCodeSystemVersion.hashCode();
        }
        if (_fromValueSetDefinition != null) {
           result = 37 * result + _fromValueSetDefinition.hashCode();
        }
        if (_toCodeSystemVersion != null) {
           result = 37 * result + _toCodeSystemVersion.hashCode();
        }
        if (_toValueSetDefinition != null) {
           result = 37 * result + _toValueSetDefinition.hashCode();
        }
        if (_useCodeSystemVersions != null) {
           result = 37 * result + _useCodeSystemVersions.hashCode();
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
     * Sets the value of field 'documentURI'.
     * 
     * @param documentURI the value of field 'documentURI'.
     */
    public void setDocumentURI(
            final String documentURI) {
        this._documentURI = documentURI;
    }

    /**
     * Sets the value of field 'fromCodeSystemVersion'.
     * 
     * @param fromCodeSystemVersion the value of field
     * 'fromCodeSystemVersion'.
     */
    public void setFromCodeSystemVersion(
            final edu.mayo.cts2.framework.model.service.core.NameOrURI fromCodeSystemVersion) {
        this._fromCodeSystemVersion = fromCodeSystemVersion;
    }

    /**
     * Sets the value of field 'fromValueSetDefinition'.
     * 
     * @param fromValueSetDefinition the value of field
     * 'fromValueSetDefinition'.
     */
    public void setFromValueSetDefinition(
            final edu.mayo.cts2.framework.model.service.core.NameOrURI fromValueSetDefinition) {
        this._fromValueSetDefinition = fromValueSetDefinition;
    }

    /**
     * Sets the value of field 'mapVersionName'.
     * 
     * @param mapVersionName the value of field 'mapVersionName'.
     */
    public void setMapVersionName(
            final String mapVersionName) {
        this._mapVersionName = mapVersionName;
    }

    /**
     * Sets the value of field 'toCodeSystemVersion'.
     * 
     * @param toCodeSystemVersion the value of field
     * 'toCodeSystemVersion'.
     */
    public void setToCodeSystemVersion(
            final edu.mayo.cts2.framework.model.service.core.NameOrURI toCodeSystemVersion) {
        this._toCodeSystemVersion = toCodeSystemVersion;
    }

    /**
     * Sets the value of field 'toValueSetDefinition'.
     * 
     * @param toValueSetDefinition the value of field
     * 'toValueSetDefinition'.
     */
    public void setToValueSetDefinition(
            final edu.mayo.cts2.framework.model.service.core.NameOrURI toValueSetDefinition) {
        this._toValueSetDefinition = toValueSetDefinition;
    }

    /**
     * Sets the value of field 'useCodeSystemVersions'.
     * 
     * @param useCodeSystemVersions the value of field
     * 'useCodeSystemVersions'.
     */
    public void setUseCodeSystemVersions(
            final edu.mayo.cts2.framework.model.service.core.NameOrURIList useCodeSystemVersions) {
        this._useCodeSystemVersions = useCodeSystemVersions;
    }

    /**
     * Method unmarshalCreateMapVersionRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapversion.CreateMapVersionRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
