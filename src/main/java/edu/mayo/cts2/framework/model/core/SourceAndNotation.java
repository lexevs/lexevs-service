/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * A description of the source from which the
 * ResourceVersionDescription was derived. When possible,
 * SourceAndNotation should include a reference to the actual
 * source document from which it was
 *  derived. As an example, if the resource was derived from the
 * W3C Wine Ontology, the URI
 * http://www.w3.org/TR/2003/CR-owl-guide-20030818/wine would
 * unambiguously name the document. In the cases, however, when a
 * definitive
 *  source document is not available, a textual description should
 * be provided, instead, in sourceAndNotationDescription. Where
 * possible, the ontology language and ontology syntax should also
 * be provided. In the case of
 *  the Wine Ontology above, the ontology language would be
 * http://www.w3.org/2002/07/owl# (OWL) and the syntax would be
 * application/rdf+xml.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SourceAndNotation extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a textual description of where the specified resource
     * version was derived from. This parameter must be supplied if
     * a reasonable PersistentURI for the source document is not
     *  available.
     */
    private String _sourceAndNotationDescription;

    /**
     * a persistent URI that references the document from which the
     * resource version was derived. This URI may be resolvable to
     * a digital resource or may be the name of a book, publication
     * or other external
     *  document.
     */
    private String _sourceDocument;

    /**
     * the formal language, if any, that the source for the
     * resource version is expressed in. Examples include Common
     * Logic, OWL, OWL-DL, CLAML,
     *  etc.
     */
    private OntologyLanguageReference _sourceLanguage;

    /**
     * the syntax of the source of the resource version, if known.
     * Examples might include rdf/xml, Turtle, Manchester Syntax,
     * CSV, etc.
     */
    private OntologySyntaxReference _sourceDocumentSyntax;


      //----------------/
     //- Constructors -/
    //----------------/

    public SourceAndNotation() {
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

        if (obj instanceof SourceAndNotation) {

            SourceAndNotation temp = (SourceAndNotation)obj;
            if (this._sourceAndNotationDescription != null) {
                if (temp._sourceAndNotationDescription == null) return false;
                if (!this._sourceAndNotationDescription.equals(temp._sourceAndNotationDescription)) 
                    return false;
            } else if (temp._sourceAndNotationDescription != null)
                return false;
            if (this._sourceDocument != null) {
                if (temp._sourceDocument == null) return false;
                if (!this._sourceDocument.equals(temp._sourceDocument)) 
                    return false;
            } else if (temp._sourceDocument != null)
                return false;
            if (this._sourceLanguage != null) {
                if (temp._sourceLanguage == null) return false;
                if (!this._sourceLanguage.equals(temp._sourceLanguage)) 
                    return false;
            } else if (temp._sourceLanguage != null)
                return false;
            if (this._sourceDocumentSyntax != null) {
                if (temp._sourceDocumentSyntax == null) return false;
                return this._sourceDocumentSyntax.equals(temp._sourceDocumentSyntax);
            } else return temp._sourceDocumentSyntax == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'sourceAndNotationDescription'.
     * The field 'sourceAndNotationDescription' has the following
     * description: a textual description of where the specified
     * resource version was derived from. This parameter must be
     * supplied if a reasonable PersistentURI for the source
     * document is not
     *  available.
     * 
     * @return the value of field 'SourceAndNotationDescription'.
     */
    public String getSourceAndNotationDescription(
    ) {
        return this._sourceAndNotationDescription;
    }

    /**
     * Returns the value of field 'sourceDocument'. The field
     * 'sourceDocument' has the following description: a persistent
     * URI that references the document from which the resource
     * version was derived. This URI may be resolvable to a digital
     * resource or may be the name of a book, publication or other
     * external
     *  document.
     * 
     * @return the value of field 'SourceDocument'.
     */
    public String getSourceDocument(
    ) {
        return this._sourceDocument;
    }

    /**
     * Returns the value of field 'sourceDocumentSyntax'. The field
     * 'sourceDocumentSyntax' has the following description: the
     * syntax of the source of the resource version, if known.
     * Examples might include rdf/xml, Turtle, Manchester Syntax,
     * CSV, etc.
     * 
     * @return the value of field 'SourceDocumentSyntax'.
     */
    public OntologySyntaxReference getSourceDocumentSyntax(
    ) {
        return this._sourceDocumentSyntax;
    }

    /**
     * Returns the value of field 'sourceLanguage'. The field
     * 'sourceLanguage' has the following description: the formal
     * language, if any, that the source for the resource version
     * is expressed in. Examples include Common Logic, OWL, OWL-DL,
     * CLAML,
     *  etc.
     * 
     * @return the value of field 'SourceLanguage'.
     */
    public OntologyLanguageReference getSourceLanguage(
    ) {
        return this._sourceLanguage;
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
        if (_sourceAndNotationDescription != null) {
           result = 37 * result + _sourceAndNotationDescription.hashCode();
        }
        if (_sourceDocument != null) {
           result = 37 * result + _sourceDocument.hashCode();
        }
        if (_sourceLanguage != null) {
           result = 37 * result + _sourceLanguage.hashCode();
        }
        if (_sourceDocumentSyntax != null) {
           result = 37 * result + _sourceDocumentSyntax.hashCode();
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
     * Sets the value of field 'sourceAndNotationDescription'. The
     * field 'sourceAndNotationDescription' has the following
     * description: a textual description of where the specified
     * resource version was derived from. This parameter must be
     * supplied if a reasonable PersistentURI for the source
     * document is not
     *  available.
     * 
     * @param sourceAndNotationDescription the value of field
     * 'sourceAndNotationDescription'.
     */
    public void setSourceAndNotationDescription(
            final String sourceAndNotationDescription) {
        this._sourceAndNotationDescription = sourceAndNotationDescription;
    }

    /**
     * Sets the value of field 'sourceDocument'. The field
     * 'sourceDocument' has the following description: a persistent
     * URI that references the document from which the resource
     * version was derived. This URI may be resolvable to a digital
     * resource or may be the name of a book, publication or other
     * external
     *  document.
     * 
     * @param sourceDocument the value of field 'sourceDocument'.
     */
    public void setSourceDocument(
            final String sourceDocument) {
        this._sourceDocument = sourceDocument;
    }

    /**
     * Sets the value of field 'sourceDocumentSyntax'. The field
     * 'sourceDocumentSyntax' has the following description: the
     * syntax of the source of the resource version, if known.
     * Examples might include rdf/xml, Turtle, Manchester Syntax,
     * CSV, etc.
     * 
     * @param sourceDocumentSyntax the value of field
     * 'sourceDocumentSyntax'.
     */
    public void setSourceDocumentSyntax(
            final OntologySyntaxReference sourceDocumentSyntax) {
        this._sourceDocumentSyntax = sourceDocumentSyntax;
    }

    /**
     * Sets the value of field 'sourceLanguage'. The field
     * 'sourceLanguage' has the following description: the formal
     * language, if any, that the source for the resource version
     * is expressed in. Examples include Common Logic, OWL, OWL-DL,
     * CLAML,
     *  etc.
     * 
     * @param sourceLanguage the value of field 'sourceLanguage'.
     */
    public void setSourceLanguage(
            final OntologyLanguageReference sourceLanguage) {
        this._sourceLanguage = sourceLanguage;
    }

    /**
     * Method unmarshalSourceAndNotation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.SourceAndNotation
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
