/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity;

import edu.mayo.cts2.framework.model.entity.types.ObjectPropertyDirectionality;
import edu.mayo.cts2.framework.model.entity.types.Transitivity;

/**
 * the description of a "semantic" predicate. "Object properties
 * connect pairs of individuals."
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ObjectPropertyDescription extends PredicateDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an indicator that states whether the object property is
     * unidirectional (i.e. requires an inverse to be explicitly
     * declared) or is bidirectional.
     */
    private ObjectPropertyDirectionality _directed;

    /**
     * transitivity characteristics of the property. If not
     * supplied, transitivity characteristics are either unknown or
     * not applicable (i.e. $domain \cup range = \emptyset$)
     */
    private Transitivity _transitivity;


      //----------------/
     //- Constructors -/
    //----------------/

    public ObjectPropertyDescription() {
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

        if (obj instanceof ObjectPropertyDescription) {

            ObjectPropertyDescription temp = (ObjectPropertyDescription)obj;
            if (this._directed != null) {
                if (temp._directed == null) return false;
                if (!this._directed.equals(temp._directed)) 
                    return false;
            } else if (temp._directed != null)
                return false;
            if (this._transitivity != null) {
                if (temp._transitivity == null) return false;
                return this._transitivity.equals(temp._transitivity);
            } else return temp._transitivity == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'directed'. The field 'directed'
     * has the following description: an indicator that states
     * whether the object property is unidirectional (i.e. requires
     * an inverse to be explicitly declared) or is bidirectional.
     * 
     * @return the value of field 'Directed'.
     */
    public ObjectPropertyDirectionality getDirected(
    ) {
        return this._directed;
    }

    /**
     * Returns the value of field 'transitivity'. The field
     * 'transitivity' has the following description: transitivity
     * characteristics of the property. If not supplied,
     * transitivity characteristics are either unknown or not
     * applicable (i.e. $domain \cup range = \emptyset$)
     * 
     * @return the value of field 'Transitivity'.
     */
    public Transitivity getTransitivity(
    ) {
        return this._transitivity;
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
        if (_directed != null) {
           result = 37 * result + _directed.hashCode();
        }
        if (_transitivity != null) {
           result = 37 * result + _transitivity.hashCode();
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
     * Sets the value of field 'directed'. The field 'directed' has
     * the following description: an indicator that states whether
     * the object property is unidirectional (i.e. requires an
     * inverse to be explicitly declared) or is bidirectional.
     * 
     * @param directed the value of field 'directed'.
     */
    public void setDirected(
            final ObjectPropertyDirectionality directed) {
        this._directed = directed;
    }

    /**
     * Sets the value of field 'transitivity'. The field
     * 'transitivity' has the following description: transitivity
     * characteristics of the property. If not supplied,
     * transitivity characteristics are either unknown or not
     * applicable (i.e. $domain \cup range = \emptyset$)
     * 
     * @param transitivity the value of field 'transitivity'.
     */
    public void setTransitivity(
            final Transitivity transitivity) {
        this._transitivity = transitivity;
    }

    /**
     * Method unmarshalObjectPropertyDescription.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.entity.ObjectPropertyDescriptio
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
