/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity;

/**
 * A PredicateDescription that describes a predicate used for
 * "lexical" annotation of an entity or other resource. Annotation
 * properties are "semantically weak" (see below) in the sense that
 * they are not
 *  inherited through subclass associations."For annotations
 * properties note that annotations are not 'semantic-free' under
 * the OWL 2 RDF-Based Semantics. Just like every other triple or
 * set of triples occurring in an RDF graph,
 *  an annotation is assigned a truth value by any given OWL 2
 * RDF-Based interpretation. Hence, although annotations are meant
 * to be 'semantically weak', i.e., their formal meaning does not
 * significantly exceed that originating
 *  from the RDF Semantics specification, adding an annotation may
 * still change the meaning of an ontology."
 *  http://www.w3.org/TR/2009/REC-owl2-rdf-based-semantics-20091027/#Introduction_.28Informative.29
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AnnotationPropertyDescription extends PredicateDescription
implements java.io.Serializable
{


      //----------------/
     //- Constructors -/
    //----------------/

    public AnnotationPropertyDescription() {
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

        return obj instanceof AnnotationPropertyDescription;
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

        return result;
    }

}
