/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * The Finalizable mixin determines whether a resource version or a
 * change set is still undergoing change (OPEN) or has reached its
 * final state (FINAL). 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class Finalizable extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the state of the inheriting resource
     */
    private edu.mayo.cts2.framework.model.core.types.FinalizableState _state = edu.mayo.cts2.framework.model.core.types.FinalizableState.fromValue("FINAL");


      //----------------/
     //- Constructors -/
    //----------------/

    public Finalizable() {
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

        if (obj instanceof Finalizable) {

            Finalizable temp = (Finalizable)obj;
            if (this._state != null) {
                if (temp._state == null) return false;
                return this._state.equals(temp._state);
            } else return temp._state == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'state'. The field 'state' has
     * the following description: the state of the inheriting
     * resource
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
        if (_state != null) {
           result = 37 * result + _state.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Sets the value of field 'state'. The field 'state' has the
     * following description: the state of the inheriting resource
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
