/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * a reference to a set of rules for constructing a value set along
 * with the corresponding value set if known
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetDefinitionReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _valueSetDefinition.
     */
    private NameAndMeaningReference _valueSetDefinition;

    /**
     * A reference to the corresponding value set. Must be present
     * if known to the implementing CTS2 service
     */
    private ValueSetReference _valueSet;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetDefinitionReference() {
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

        if (obj instanceof ValueSetDefinitionReference) {

            ValueSetDefinitionReference temp = (ValueSetDefinitionReference)obj;
            if (this._valueSetDefinition != null) {
                if (temp._valueSetDefinition == null) return false;
                if (!this._valueSetDefinition.equals(temp._valueSetDefinition)) 
                    return false;
            } else if (temp._valueSetDefinition != null)
                return false;
            if (this._valueSet != null) {
                if (temp._valueSet == null) return false;
                return this._valueSet.equals(temp._valueSet);
            } else return temp._valueSet == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'valueSet'. The field 'valueSet'
     * has the following description: A reference to the
     * corresponding value set. Must be present if known to the
     * implementing CTS2 service
     * 
     * @return the value of field 'ValueSet'.
     */
    public ValueSetReference getValueSet(
    ) {
        return this._valueSet;
    }

    /**
     * Returns the value of field 'valueSetDefinition'.
     * 
     * @return the value of field 'ValueSetDefinition'.
     */
    public NameAndMeaningReference getValueSetDefinition(
    ) {
        return this._valueSetDefinition;
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
        if (_valueSetDefinition != null) {
           result = 37 * result + _valueSetDefinition.hashCode();
        }
        if (_valueSet != null) {
           result = 37 * result + _valueSet.hashCode();
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
     * Sets the value of field 'valueSet'. The field 'valueSet' has
     * the following description: A reference to the corresponding
     * value set. Must be present if known to the implementing CTS2
     * service
     * 
     * @param valueSet the value of field 'valueSet'.
     */
    public void setValueSet(
            final ValueSetReference valueSet) {
        this._valueSet = valueSet;
    }

    /**
     * Sets the value of field 'valueSetDefinition'.
     * 
     * @param valueSetDefinition the value of field
     * 'valueSetDefinition'.
     */
    public void setValueSetDefinition(
            final NameAndMeaningReference valueSetDefinition) {
        this._valueSetDefinition = valueSetDefinition;
    }

    /**
     * Method unmarshalValueSetDefinitionReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.ValueSetDefinitionReferenc
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
