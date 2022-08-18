/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity;

/**
 * PredicateDescription covers the spectrum of entities deemed
 * "Role" in description logic, "Relation" in predicate logic,
 * "Property" in RDF and OWL, and "Association" in Ontylog DL. It
 * describes the nature
 *  and the purpose of the role, not the individual elements.Note
 * that section 2.4.2.11 of the HL7 SFM calls for an attribute
 * called "associationKind". While we are not absolutely certain
 * what this was intended to represent, we
 *  believe that its intent is probably subsumed under the various
 * individual types as well as the transitivity attribute.
 * forwardName and reverseName are called for in the SFM. The way
 * that they are represented in
 *  this model lacks the ability to represent them in a
 * multi-lingual environment which may cause difficulties down the
 * line. Service implementers who are concerned about this aspect
 * are encouraged to extend the service to allow
 *  forward and reverse Name to be returned in the language
 * appropriate to the service viewer.The directed attribute is
 * actually more of a characteristic of the type of logic being
 * used than the individual properties, but
 *  returning it as an attribute of a property seems sufficient.The
 * HL7 SFM ruleSetId construct is not supported in this
 * specification.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PredicateDescription extends NamedEntityDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name assigned to the predicate when applied in the
     * source to target direction. The primary purpose of this
     * attribute is to provide some notion of "directional"
     * semantics, as predicates named
     *  "part" or "broader term" often lack sufficient information
     * to understand where the whole or broader component goes.
     * Implementers will note that, as opposed to official
     * designations, forwardName and
     *  reverseName are not keyed by language. Implementers are
     * encouraged to develop designations and use the forwardName
     * and reverseName tags if a richer model is
     *  desired.
     */
    private String _forwardName;

    /**
     * the name assigned to the predicate when applied in the
     * target to source direction. The primary purpose of this
     * attribute is to provide some notion of "directional"
     * semantics, as predicates named
     *  "part" or "broader term" often lack sufficient information
     * to understand where the whole or broader component goes. 
     */
    private String _reverseName;


      //----------------/
     //- Constructors -/
    //----------------/

    public PredicateDescription() {
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

        if (obj instanceof PredicateDescription) {

            PredicateDescription temp = (PredicateDescription)obj;
            if (this._forwardName != null) {
                if (temp._forwardName == null) return false;
                if (!this._forwardName.equals(temp._forwardName)) 
                    return false;
            } else if (temp._forwardName != null)
                return false;
            if (this._reverseName != null) {
                if (temp._reverseName == null) return false;
                return this._reverseName.equals(temp._reverseName);
            } else return temp._reverseName == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'forwardName'. The field
     * 'forwardName' has the following description: the name
     * assigned to the predicate when applied in the source to
     * target direction. The primary purpose of this attribute is
     * to provide some notion of "directional" semantics, as
     * predicates named
     *  "part" or "broader term" often lack sufficient information
     * to understand where the whole or broader component goes.
     * Implementers will note that, as opposed to official
     * designations, forwardName and
     *  reverseName are not keyed by language. Implementers are
     * encouraged to develop designations and use the forwardName
     * and reverseName tags if a richer model is
     *  desired.
     * 
     * @return the value of field 'ForwardName'.
     */
    public String getForwardName(
    ) {
        return this._forwardName;
    }

    /**
     * Returns the value of field 'reverseName'. The field
     * 'reverseName' has the following description: the name
     * assigned to the predicate when applied in the target to
     * source direction. The primary purpose of this attribute is
     * to provide some notion of "directional" semantics, as
     * predicates named
     *  "part" or "broader term" often lack sufficient information
     * to understand where the whole or broader component goes. 
     * 
     * @return the value of field 'ReverseName'.
     */
    public String getReverseName(
    ) {
        return this._reverseName;
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
        if (_forwardName != null) {
           result = 37 * result + _forwardName.hashCode();
        }
        if (_reverseName != null) {
           result = 37 * result + _reverseName.hashCode();
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
     * Sets the value of field 'forwardName'. The field
     * 'forwardName' has the following description: the name
     * assigned to the predicate when applied in the source to
     * target direction. The primary purpose of this attribute is
     * to provide some notion of "directional" semantics, as
     * predicates named
     *  "part" or "broader term" often lack sufficient information
     * to understand where the whole or broader component goes.
     * Implementers will note that, as opposed to official
     * designations, forwardName and
     *  reverseName are not keyed by language. Implementers are
     * encouraged to develop designations and use the forwardName
     * and reverseName tags if a richer model is
     *  desired.
     * 
     * @param forwardName the value of field 'forwardName'.
     */
    public void setForwardName(
            final String forwardName) {
        this._forwardName = forwardName;
    }

    /**
     * Sets the value of field 'reverseName'. The field
     * 'reverseName' has the following description: the name
     * assigned to the predicate when applied in the target to
     * source direction. The primary purpose of this attribute is
     * to provide some notion of "directional" semantics, as
     * predicates named
     *  "part" or "broader term" often lack sufficient information
     * to understand where the whole or broader component goes. 
     * 
     * @param reverseName the value of field 'reverseName'.
     */
    public void setReverseName(
            final String reverseName) {
        this._reverseName = reverseName;
    }

    /**
     * Method unmarshalPredicateDescription.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.entity.PredicateDescription
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
