/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * The language and syntax of an expression in an ontology.
 * Language identifies the expression semantics (e.g. OWL 2.0, RDF,
 * SNOMED Compositional Expression, etc) and syntax identifies how
 * it is represnted (e.g.
 *  XML, text/plain, xml/rdf, manchester syntax, etc)
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class OntologyLanguageAndSyntax extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The formal language (semantics) of the expression.
     */
    private OntologyLanguageReference _ontologyLanguage;

    /**
     * The syntax of the expression.
     */
    private OntologySyntaxReference _ontologySyntax;


      //----------------/
     //- Constructors -/
    //----------------/

    public OntologyLanguageAndSyntax() {
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

        if (obj instanceof OntologyLanguageAndSyntax) {

            OntologyLanguageAndSyntax temp = (OntologyLanguageAndSyntax)obj;
            if (this._ontologyLanguage != null) {
                if (temp._ontologyLanguage == null) return false;
                if (!this._ontologyLanguage.equals(temp._ontologyLanguage)) 
                    return false;
            } else if (temp._ontologyLanguage != null)
                return false;
            if (this._ontologySyntax != null) {
                if (temp._ontologySyntax == null) return false;
                return this._ontologySyntax.equals(temp._ontologySyntax);
            } else return temp._ontologySyntax == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'ontologyLanguage'. The field
     * 'ontologyLanguage' has the following description: The formal
     * language (semantics) of the expression.
     * 
     * @return the value of field 'OntologyLanguage'.
     */
    public OntologyLanguageReference getOntologyLanguage(
    ) {
        return this._ontologyLanguage;
    }

    /**
     * Returns the value of field 'ontologySyntax'. The field
     * 'ontologySyntax' has the following description: The syntax
     * of the expression.
     * 
     * @return the value of field 'OntologySyntax'.
     */
    public OntologySyntaxReference getOntologySyntax(
    ) {
        return this._ontologySyntax;
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
        if (_ontologyLanguage != null) {
           result = 37 * result + _ontologyLanguage.hashCode();
        }
        if (_ontologySyntax != null) {
           result = 37 * result + _ontologySyntax.hashCode();
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
     * Sets the value of field 'ontologyLanguage'. The field
     * 'ontologyLanguage' has the following description: The formal
     * language (semantics) of the expression.
     * 
     * @param ontologyLanguage the value of field 'ontologyLanguage'
     */
    public void setOntologyLanguage(
            final OntologyLanguageReference ontologyLanguage) {
        this._ontologyLanguage = ontologyLanguage;
    }

    /**
     * Sets the value of field 'ontologySyntax'. The field
     * 'ontologySyntax' has the following description: The syntax
     * of the expression.
     * 
     * @param ontologySyntax the value of field 'ontologySyntax'.
     */
    public void setOntologySyntax(
            final OntologySyntaxReference ontologySyntax) {
        this._ontologySyntax = ontologySyntax;
    }

    /**
     * Method unmarshalOntologyLanguageAndSyntax.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.OntologyLanguageAndSyntax
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
