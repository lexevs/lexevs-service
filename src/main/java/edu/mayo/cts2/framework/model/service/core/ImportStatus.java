/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ImportStatus extends ProcessStatus
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _metadata.
     */
    private String _metadata;

    /**
     * Field _source.
     */
    private String _source;

    /**
     * Field _loadedURI.
     */
    private String _loadedURI;

    /**
     * The CTS2 URI(s) of the resulting resources
     */
    private edu.mayo.cts2.framework.model.service.core.types.SyncOrAsync _synchronicity;

    /**
     * Field _numElementsImported.
     */
    private String _numElementsImported;

    /**
     * Field _languageAndSyntax.
     */
    private edu.mayo.cts2.framework.model.core.OntologyLanguageAndSyntax _languageAndSyntax;

    /**
     * Field _validation.
     */
    private edu.mayo.cts2.framework.model.service.core.types.ValidationLevel _validation;


      //----------------/
     //- Constructors -/
    //----------------/

    public ImportStatus() {
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

        if (obj instanceof ImportStatus) {

            ImportStatus temp = (ImportStatus)obj;
            if (this._metadata != null) {
                if (temp._metadata == null) return false;
                if (!this._metadata.equals(temp._metadata)) 
                    return false;
            } else if (temp._metadata != null)
                return false;
            if (this._source != null) {
                if (temp._source == null) return false;
                if (!this._source.equals(temp._source)) 
                    return false;
            } else if (temp._source != null)
                return false;
            if (this._loadedURI != null) {
                if (temp._loadedURI == null) return false;
                if (!this._loadedURI.equals(temp._loadedURI)) 
                    return false;
            } else if (temp._loadedURI != null)
                return false;
            if (this._synchronicity != null) {
                if (temp._synchronicity == null) return false;
                if (!this._synchronicity.equals(temp._synchronicity)) 
                    return false;
            } else if (temp._synchronicity != null)
                return false;
            if (this._numElementsImported != null) {
                if (temp._numElementsImported == null) return false;
                if (!this._numElementsImported.equals(temp._numElementsImported)) 
                    return false;
            } else if (temp._numElementsImported != null)
                return false;
            if (this._languageAndSyntax != null) {
                if (temp._languageAndSyntax == null) return false;
                if (!this._languageAndSyntax.equals(temp._languageAndSyntax)) 
                    return false;
            } else if (temp._languageAndSyntax != null)
                return false;
            if (this._validation != null) {
                if (temp._validation == null) return false;
                return this._validation.equals(temp._validation);
            } else return temp._validation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'languageAndSyntax'.
     * 
     * @return the value of field 'LanguageAndSyntax'.
     */
    public edu.mayo.cts2.framework.model.core.OntologyLanguageAndSyntax getLanguageAndSyntax(
    ) {
        return this._languageAndSyntax;
    }

    /**
     * Returns the value of field 'loadedURI'.
     * 
     * @return the value of field 'LoadedURI'.
     */
    public String getLoadedURI(
    ) {
        return this._loadedURI;
    }

    /**
     * Returns the value of field 'metadata'.
     * 
     * @return the value of field 'Metadata'.
     */
    public String getMetadata(
    ) {
        return this._metadata;
    }

    /**
     * Returns the value of field 'numElementsImported'.
     * 
     * @return the value of field 'NumElementsImported'.
     */
    public String getNumElementsImported(
    ) {
        return this._numElementsImported;
    }

    /**
     * Returns the value of field 'source'.
     * 
     * @return the value of field 'Source'.
     */
    public String getSource(
    ) {
        return this._source;
    }

    /**
     * Returns the value of field 'synchronicity'. The field
     * 'synchronicity' has the following description: The CTS2
     * URI(s) of the resulting resources
     * 
     * @return the value of field 'Synchronicity'.
     */
    public edu.mayo.cts2.framework.model.service.core.types.SyncOrAsync getSynchronicity(
    ) {
        return this._synchronicity;
    }

    /**
     * Returns the value of field 'validation'.
     * 
     * @return the value of field 'Validation'.
     */
    public edu.mayo.cts2.framework.model.service.core.types.ValidationLevel getValidation(
    ) {
        return this._validation;
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
        if (_metadata != null) {
           result = 37 * result + _metadata.hashCode();
        }
        if (_source != null) {
           result = 37 * result + _source.hashCode();
        }
        if (_loadedURI != null) {
           result = 37 * result + _loadedURI.hashCode();
        }
        if (_synchronicity != null) {
           result = 37 * result + _synchronicity.hashCode();
        }
        if (_numElementsImported != null) {
           result = 37 * result + _numElementsImported.hashCode();
        }
        if (_languageAndSyntax != null) {
           result = 37 * result + _languageAndSyntax.hashCode();
        }
        if (_validation != null) {
           result = 37 * result + _validation.hashCode();
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
     * Sets the value of field 'languageAndSyntax'.
     * 
     * @param languageAndSyntax the value of field
     * 'languageAndSyntax'.
     */
    public void setLanguageAndSyntax(
            final edu.mayo.cts2.framework.model.core.OntologyLanguageAndSyntax languageAndSyntax) {
        this._languageAndSyntax = languageAndSyntax;
    }

    /**
     * Sets the value of field 'loadedURI'.
     * 
     * @param loadedURI the value of field 'loadedURI'.
     */
    public void setLoadedURI(
            final String loadedURI) {
        this._loadedURI = loadedURI;
    }

    /**
     * Sets the value of field 'metadata'.
     * 
     * @param metadata the value of field 'metadata'.
     */
    public void setMetadata(
            final String metadata) {
        this._metadata = metadata;
    }

    /**
     * Sets the value of field 'numElementsImported'.
     * 
     * @param numElementsImported the value of field
     * 'numElementsImported'.
     */
    public void setNumElementsImported(
            final String numElementsImported) {
        this._numElementsImported = numElementsImported;
    }

    /**
     * Sets the value of field 'source'.
     * 
     * @param source the value of field 'source'.
     */
    public void setSource(
            final String source) {
        this._source = source;
    }

    /**
     * Sets the value of field 'synchronicity'. The field
     * 'synchronicity' has the following description: The CTS2
     * URI(s) of the resulting resources
     * 
     * @param synchronicity the value of field 'synchronicity'.
     */
    public void setSynchronicity(
            final edu.mayo.cts2.framework.model.service.core.types.SyncOrAsync synchronicity) {
        this._synchronicity = synchronicity;
    }

    /**
     * Sets the value of field 'validation'.
     * 
     * @param validation the value of field 'validation'.
     */
    public void setValidation(
            final edu.mayo.cts2.framework.model.service.core.types.ValidationLevel validation) {
        this._validation = validation;
    }

    /**
     * Method unmarshalImportStatus.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.ImportStatus
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
