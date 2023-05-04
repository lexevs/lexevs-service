/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * information about the source, format, release date, version
 * identifier, etc. of a specific version of an abstract resource
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ResourceVersionDescription extends ResourceDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a URI that identifies the specific version, language and
     * notation of the about resource. This URI needs to be
     * constructed in such a way that, if necessary, it will be
     * possible to
     *  differentiate resource versions that were loaded from
     * different document syntaxes. As an example, if an image of a
     * the wine ontology was loaded from a resource that was in
     * Manchester Syntax, it should be given a
     *  different URI than the image loaded from the RDF/XML
     * syntax. The reasoning behind this is, even in cases where
     * different syntaxes are 100% compatible the transformation
     * into the CTS2 model may not be
     *  identical.
     */
    private String _documentURI;

    /**
     * Field _state.
     */
    private edu.mayo.cts2.framework.model.core.types.FinalizableState _state = edu.mayo.cts2.framework.model.core.types.FinalizableState.fromValue("FINAL");

    /**
     * a description of where the (or a) source of the version may
     * be found, what format and language it is available in, etc. 
     */
    private SourceAndNotation _sourceAndNotation;

    /**
     * a reference to the name and URI version of the resource from
     * which this current version is derived - the version of the
     * resource that immediately preceded it
     */
    private NameAndMeaningReference _predecessor;

    /**
     * an official label or identifier that was assigned to this
     * version by its publisher
     */
    private String _officialResourceVersionId;

    /**
     * the date that this version of the resource officially became
     * available
     */
    private java.util.Date _officialReleaseDate;

    /**
     * the date that this version of the resource is stated by its
     * publishers to go into effect
     */
    private java.util.Date _officialActivationDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResourceVersionDescription() {
        super();
        setState(edu.mayo.cts2.framework.model.core.types.FinalizableState.fromValue("FINAL"));
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

        if (obj instanceof ResourceVersionDescription) {

            ResourceVersionDescription temp = (ResourceVersionDescription)obj;
            if (this._documentURI != null) {
                if (temp._documentURI == null) return false;
                if (!this._documentURI.equals(temp._documentURI)) 
                    return false;
            } else if (temp._documentURI != null)
                return false;
            if (this._state != null) {
                if (temp._state == null) return false;
                if (!this._state.equals(temp._state)) 
                    return false;
            } else if (temp._state != null)
                return false;
            if (this._sourceAndNotation != null) {
                if (temp._sourceAndNotation == null) return false;
                if (!this._sourceAndNotation.equals(temp._sourceAndNotation)) 
                    return false;
            } else if (temp._sourceAndNotation != null)
                return false;
            if (this._predecessor != null) {
                if (temp._predecessor == null) return false;
                if (!this._predecessor.equals(temp._predecessor)) 
                    return false;
            } else if (temp._predecessor != null)
                return false;
            if (this._officialResourceVersionId != null) {
                if (temp._officialResourceVersionId == null) return false;
                if (!this._officialResourceVersionId.equals(temp._officialResourceVersionId)) 
                    return false;
            } else if (temp._officialResourceVersionId != null)
                return false;
            if (this._officialReleaseDate != null) {
                if (temp._officialReleaseDate == null) return false;
                if (!this._officialReleaseDate.equals(temp._officialReleaseDate)) 
                    return false;
            } else if (temp._officialReleaseDate != null)
                return false;
            if (this._officialActivationDate != null) {
                if (temp._officialActivationDate == null) return false;
                return this._officialActivationDate.equals(temp._officialActivationDate);
            } else return temp._officialActivationDate == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'documentURI'. The field
     * 'documentURI' has the following description: a URI that
     * identifies the specific version, language and notation of
     * the about resource. This URI needs to be constructed in such
     * a way that, if necessary, it will be possible to
     *  differentiate resource versions that were loaded from
     * different document syntaxes. As an example, if an image of a
     * the wine ontology was loaded from a resource that was in
     * Manchester Syntax, it should be given a
     *  different URI than the image loaded from the RDF/XML
     * syntax. The reasoning behind this is, even in cases where
     * different syntaxes are 100% compatible the transformation
     * into the CTS2 model may not be
     *  identical.
     * 
     * @return the value of field 'DocumentURI'.
     */
    public String getDocumentURI(
    ) {
        return this._documentURI;
    }

    /**
     * Returns the value of field 'officialActivationDate'. The
     * field 'officialActivationDate' has the following
     * description: the date that this version of the resource is
     * stated by its publishers to go into effect
     * 
     * @return the value of field 'OfficialActivationDate'.
     */
    public java.util.Date getOfficialActivationDate(
    ) {
        return this._officialActivationDate;
    }

    /**
     * Returns the value of field 'officialReleaseDate'. The field
     * 'officialReleaseDate' has the following description: the
     * date that this version of the resource officially became
     * available
     * 
     * @return the value of field 'OfficialReleaseDate'.
     */
    public java.util.Date getOfficialReleaseDate(
    ) {
        return this._officialReleaseDate;
    }

    /**
     * Returns the value of field 'officialResourceVersionId'. The
     * field 'officialResourceVersionId' has the following
     * description: an official label or identifier that was
     * assigned to this version by its publisher
     * 
     * @return the value of field 'OfficialResourceVersionId'.
     */
    public String getOfficialResourceVersionId(
    ) {
        return this._officialResourceVersionId;
    }

    /**
     * Returns the value of field 'predecessor'. The field
     * 'predecessor' has the following description: a reference to
     * the name and URI version of the resource from which this
     * current version is derived - the version of the resource
     * that immediately preceded it
     * 
     * @return the value of field 'Predecessor'.
     */
    public NameAndMeaningReference getPredecessor(
    ) {
        return this._predecessor;
    }

    /**
     * Returns the value of field 'sourceAndNotation'. The field
     * 'sourceAndNotation' has the following description: a
     * description of where the (or a) source of the version may be
     * found, what format and language it is available in, etc. 
     * 
     * @return the value of field 'SourceAndNotation'.
     */
    public SourceAndNotation getSourceAndNotation(
    ) {
        return this._sourceAndNotation;
    }

    /**
     * Returns the value of field 'state'.
     * 
     * @return the value of field 'State'.
     */
    public edu.mayo.cts2.framework.model.core.types.FinalizableState getState(
    ) {
        return this._state;
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
        if (_state != null) {
           result = 37 * result + _state.hashCode();
        }
        if (_sourceAndNotation != null) {
           result = 37 * result + _sourceAndNotation.hashCode();
        }
        if (_predecessor != null) {
           result = 37 * result + _predecessor.hashCode();
        }
        if (_officialResourceVersionId != null) {
           result = 37 * result + _officialResourceVersionId.hashCode();
        }
        if (_officialReleaseDate != null) {
           result = 37 * result + _officialReleaseDate.hashCode();
        }
        if (_officialActivationDate != null) {
           result = 37 * result + _officialActivationDate.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Sets the value of field 'documentURI'. The field
     * 'documentURI' has the following description: a URI that
     * identifies the specific version, language and notation of
     * the about resource. This URI needs to be constructed in such
     * a way that, if necessary, it will be possible to
     *  differentiate resource versions that were loaded from
     * different document syntaxes. As an example, if an image of a
     * the wine ontology was loaded from a resource that was in
     * Manchester Syntax, it should be given a
     *  different URI than the image loaded from the RDF/XML
     * syntax. The reasoning behind this is, even in cases where
     * different syntaxes are 100% compatible the transformation
     * into the CTS2 model may not be
     *  identical.
     * 
     * @param documentURI the value of field 'documentURI'.
     */
    public void setDocumentURI(
            final String documentURI) {
        this._documentURI = documentURI;
    }

    /**
     * Sets the value of field 'officialActivationDate'. The field
     * 'officialActivationDate' has the following description: the
     * date that this version of the resource is stated by its
     * publishers to go into effect
     * 
     * @param officialActivationDate the value of field
     * 'officialActivationDate'.
     */
    public void setOfficialActivationDate(
            final java.util.Date officialActivationDate) {
        this._officialActivationDate = officialActivationDate;
    }

    /**
     * Sets the value of field 'officialReleaseDate'. The field
     * 'officialReleaseDate' has the following description: the
     * date that this version of the resource officially became
     * available
     * 
     * @param officialReleaseDate the value of field
     * 'officialReleaseDate'.
     */
    public void setOfficialReleaseDate(
            final java.util.Date officialReleaseDate) {
        this._officialReleaseDate = officialReleaseDate;
    }

    /**
     * Sets the value of field 'officialResourceVersionId'. The
     * field 'officialResourceVersionId' has the following
     * description: an official label or identifier that was
     * assigned to this version by its publisher
     * 
     * @param officialResourceVersionId the value of field
     * 'officialResourceVersionId'.
     */
    public void setOfficialResourceVersionId(
            final String officialResourceVersionId) {
        this._officialResourceVersionId = officialResourceVersionId;
    }

    /**
     * Sets the value of field 'predecessor'. The field
     * 'predecessor' has the following description: a reference to
     * the name and URI version of the resource from which this
     * current version is derived - the version of the resource
     * that immediately preceded it
     * 
     * @param predecessor the value of field 'predecessor'.
     */
    public void setPredecessor(
            final NameAndMeaningReference predecessor) {
        this._predecessor = predecessor;
    }

    /**
     * Sets the value of field 'sourceAndNotation'. The field
     * 'sourceAndNotation' has the following description: a
     * description of where the (or a) source of the version may be
     * found, what format and language it is available in, etc. 
     * 
     * @param sourceAndNotation the value of field
     * 'sourceAndNotation'.
     */
    public void setSourceAndNotation(
            final SourceAndNotation sourceAndNotation) {
        this._sourceAndNotation = sourceAndNotation;
    }

    /**
     * Sets the value of field 'state'.
     * 
     * @param state the value of field 'state'.
     */
    public void setState(
            final edu.mayo.cts2.framework.model.core.types.FinalizableState state) {
        this._state = state;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
