/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * A summary of a resource version.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ResourceVersionDescriptionDirectoryEntry extends ResourceDescriptionDirectoryEntry
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a URI that identifies the specific version, language and
     * notation of the about resource. This URI needs to be
     * constructed in such a way that, if necessary, it will be
     *  possible to differentiate resource versions that were
     * loaded from different document syntaxes. As an example, if
     * an image of the wine ontology was loaded from a resource
     * whtat was in
     *  Manchester Syntax, it should be given a different URI than
     * the image loaded from the RDF/XML syntax. The reasoning
     * behind this is, even in cases where different syntaxes are
     * 100%
     *  compatible the transformation into the CTS2 model may not
     * be identical.
     */
    private String _documentURI;

    /**
     * a label or identifier that was assigned to this version by
     * its publisher
     */
    private String _officialResourceVersionId;

    /**
     * information about the source, format, release date, version
     * identifier, etc. of a specific version of an abstract resourc
     */
    private java.util.Date _officialReleaseDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResourceVersionDescriptionDirectoryEntry() {
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

        if (obj instanceof ResourceVersionDescriptionDirectoryEntry) {

            ResourceVersionDescriptionDirectoryEntry temp = (ResourceVersionDescriptionDirectoryEntry)obj;
            if (this._documentURI != null) {
                if (temp._documentURI == null) return false;
                if (!this._documentURI.equals(temp._documentURI)) 
                    return false;
            } else if (temp._documentURI != null)
                return false;
            if (this._officialResourceVersionId != null) {
                if (temp._officialResourceVersionId == null) return false;
                if (!this._officialResourceVersionId.equals(temp._officialResourceVersionId)) 
                    return false;
            } else if (temp._officialResourceVersionId != null)
                return false;
            if (this._officialReleaseDate != null) {
                if (temp._officialReleaseDate == null) return false;
                return this._officialReleaseDate.equals(temp._officialReleaseDate);
            } else return temp._officialReleaseDate == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'documentURI'. The field
     * 'documentURI' has the following description: a URI that
     * identifies the specific version, language and notation of
     * the about resource. This URI needs to be constructed in such
     * a way that, if necessary, it will be
     *  possible to differentiate resource versions that were
     * loaded from different document syntaxes. As an example, if
     * an image of the wine ontology was loaded from a resource
     * whtat was in
     *  Manchester Syntax, it should be given a different URI than
     * the image loaded from the RDF/XML syntax. The reasoning
     * behind this is, even in cases where different syntaxes are
     * 100%
     *  compatible the transformation into the CTS2 model may not
     * be identical.
     * 
     * @return the value of field 'DocumentURI'.
     */
    public String getDocumentURI(
    ) {
        return this._documentURI;
    }

    /**
     * Returns the value of field 'officialReleaseDate'. The field
     * 'officialReleaseDate' has the following description:
     * information about the source, format, release date, version
     * identifier, etc. of a specific version of an abstract
     * resource
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
     * description: a label or identifier that was assigned to this
     * version by its publisher
     * 
     * @return the value of field 'OfficialResourceVersionId'.
     */
    public String getOfficialResourceVersionId(
    ) {
        return this._officialResourceVersionId;
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
        if (_officialResourceVersionId != null) {
           result = 37 * result + _officialResourceVersionId.hashCode();
        }
        if (_officialReleaseDate != null) {
           result = 37 * result + _officialReleaseDate.hashCode();
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
     * Sets the value of field 'documentURI'. The field
     * 'documentURI' has the following description: a URI that
     * identifies the specific version, language and notation of
     * the about resource. This URI needs to be constructed in such
     * a way that, if necessary, it will be
     *  possible to differentiate resource versions that were
     * loaded from different document syntaxes. As an example, if
     * an image of the wine ontology was loaded from a resource
     * whtat was in
     *  Manchester Syntax, it should be given a different URI than
     * the image loaded from the RDF/XML syntax. The reasoning
     * behind this is, even in cases where different syntaxes are
     * 100%
     *  compatible the transformation into the CTS2 model may not
     * be identical.
     * 
     * @param documentURI the value of field 'documentURI'.
     */
    public void setDocumentURI(
            final String documentURI) {
        this._documentURI = documentURI;
    }

    /**
     * Sets the value of field 'officialReleaseDate'. The field
     * 'officialReleaseDate' has the following description:
     * information about the source, format, release date, version
     * identifier, etc. of a specific version of an abstract
     * resource
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
     * description: a label or identifier that was assigned to this
     * version by its publisher
     * 
     * @param officialResourceVersionId the value of field
     * 'officialResourceVersionId'.
     */
    public void setOfficialResourceVersionId(
            final String officialResourceVersionId) {
        this._officialResourceVersionId = officialResourceVersionId;
    }

    /**
     * Method unmarshalResourceVersionDescriptionDirectoryEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.ResourceVersionDescriptionDirectoryEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
