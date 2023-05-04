/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * An expression in a given ontology language and syntax that
 * describes or defines an entity. Examples might include
 * descriptions of entities in Manchester OWL Syntax, RDF, SNOMED
 * Concept Expression,
 *  etc.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EntityExpression extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the ontology language and syntax of the expression
     */
    private OntologyLanguageAndSyntax _ontologyLanguageAndSyntax;

    /**
     * the actual expression
     */
    private OpaqueData _expression;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityExpression() {
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

        if (obj instanceof EntityExpression) {

            EntityExpression temp = (EntityExpression)obj;
            if (this._ontologyLanguageAndSyntax != null) {
                if (temp._ontologyLanguageAndSyntax == null) return false;
                if (!this._ontologyLanguageAndSyntax.equals(temp._ontologyLanguageAndSyntax)) 
                    return false;
            } else if (temp._ontologyLanguageAndSyntax != null)
                return false;
            if (this._expression != null) {
                if (temp._expression == null) return false;
                return this._expression.equals(temp._expression);
            } else return temp._expression == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'expression'. The field
     * 'expression' has the following description: the actual
     * expression
     * 
     * @return the value of field 'Expression'.
     */
    public OpaqueData getExpression(
    ) {
        return this._expression;
    }

    /**
     * Returns the value of field 'ontologyLanguageAndSyntax'. The
     * field 'ontologyLanguageAndSyntax' has the following
     * description: the ontology language and syntax of the
     * expression
     * 
     * @return the value of field 'OntologyLanguageAndSyntax'.
     */
    public OntologyLanguageAndSyntax getOntologyLanguageAndSyntax(
    ) {
        return this._ontologyLanguageAndSyntax;
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
        if (_ontologyLanguageAndSyntax != null) {
           result = 37 * result + _ontologyLanguageAndSyntax.hashCode();
        }
        if (_expression != null) {
           result = 37 * result + _expression.hashCode();
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
     * Sets the value of field 'expression'. The field 'expression'
     * has the following description: the actual expression
     * 
     * @param expression the value of field 'expression'.
     */
    public void setExpression(
            final OpaqueData expression) {
        this._expression = expression;
    }

    /**
     * Sets the value of field 'ontologyLanguageAndSyntax'. The
     * field 'ontologyLanguageAndSyntax' has the following
     * description: the ontology language and syntax of the
     * expression
     * 
     * @param ontologyLanguageAndSyntax the value of field
     * 'ontologyLanguageAndSyntax'.
     */
    public void setOntologyLanguageAndSyntax(
            final OntologyLanguageAndSyntax ontologyLanguageAndSyntax) {
        this._ontologyLanguageAndSyntax = ontologyLanguageAndSyntax;
    }

    /**
     * Method unmarshalEntityExpression.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.EntityExpression
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
