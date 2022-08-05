/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * A reference to a CTS2 model element. ComponentReference may
 * reference a model attribute, a Property or a special element
 * such as match strength.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ComponentReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private Object _choiceValue;

    /**
     * a reference to an attribute in a CTS2 model such as
     * formalName, designation, etc.
     */
    private String _attributeReference;

    /**
     * a reference to a model Property. The reference target
     * carries the URI and, optionally, namespace and name of the
     * property predicate. 
     */
    private URIAndEntityName _propertyReference;

    /**
     * the target of the reference is a special element such as the
     * match strength of a search
     */
    private String _specialReference;


      //----------------/
     //- Constructors -/
    //----------------/

    public ComponentReference() {
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

        if (obj instanceof ComponentReference) {

            ComponentReference temp = (ComponentReference)obj;
            if (this._choiceValue != null) {
                if (temp._choiceValue == null) return false;
                if (!this._choiceValue.equals(temp._choiceValue)) 
                    return false;
            } else if (temp._choiceValue != null)
                return false;
            if (this._attributeReference != null) {
                if (temp._attributeReference == null) return false;
                if (!this._attributeReference.equals(temp._attributeReference)) 
                    return false;
            } else if (temp._attributeReference != null)
                return false;
            if (this._propertyReference != null) {
                if (temp._propertyReference == null) return false;
                if (!this._propertyReference.equals(temp._propertyReference)) 
                    return false;
            } else if (temp._propertyReference != null)
                return false;
            if (this._specialReference != null) {
                if (temp._specialReference == null) return false;
                return this._specialReference.equals(temp._specialReference);
            } else return temp._specialReference == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'attributeReference'. The field
     * 'attributeReference' has the following description: a
     * reference to an attribute in a CTS2 model such as
     * formalName, designation, etc.
     * 
     * @return the value of field 'AttributeReference'.
     */
    public String getAttributeReference(
    ) {
        return this._attributeReference;
    }

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'propertyReference'. The field
     * 'propertyReference' has the following description: a
     * reference to a model Property. The reference target carries
     * the URI and, optionally, namespace and name of the property
     * predicate. 
     * 
     * @return the value of field 'PropertyReference'.
     */
    public URIAndEntityName getPropertyReference(
    ) {
        return this._propertyReference;
    }

    /**
     * Returns the value of field 'specialReference'. The field
     * 'specialReference' has the following description: the target
     * of the reference is a special element such as the match
     * strength of a search
     * 
     * @return the value of field 'SpecialReference'.
     */
    public String getSpecialReference(
    ) {
        return this._specialReference;
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
        if (_choiceValue != null) {
           result = 37 * result + _choiceValue.hashCode();
        }
        if (_attributeReference != null) {
           result = 37 * result + _attributeReference.hashCode();
        }
        if (_propertyReference != null) {
           result = 37 * result + _propertyReference.hashCode();
        }
        if (_specialReference != null) {
           result = 37 * result + _specialReference.hashCode();
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
     * Sets the value of field 'attributeReference'. The field
     * 'attributeReference' has the following description: a
     * reference to an attribute in a CTS2 model such as
     * formalName, designation, etc.
     * 
     * @param attributeReference the value of field
     * 'attributeReference'.
     */
    public void setAttributeReference(
            final String attributeReference) {
        this._attributeReference = attributeReference;
        this._choiceValue = attributeReference;
    }

    /**
     * Sets the value of field 'propertyReference'. The field
     * 'propertyReference' has the following description: a
     * reference to a model Property. The reference target carries
     * the URI and, optionally, namespace and name of the property
     * predicate. 
     * 
     * @param propertyReference the value of field
     * 'propertyReference'.
     */
    public void setPropertyReference(
            final URIAndEntityName propertyReference) {
        this._propertyReference = propertyReference;
        this._choiceValue = propertyReference;
    }

    /**
     * Sets the value of field 'specialReference'. The field
     * 'specialReference' has the following description: the target
     * of the reference is a special element such as the match
     * strength of a search
     * 
     * @param specialReference the value of field 'specialReference'
     */
    public void setSpecialReference(
            final String specialReference) {
        this._specialReference = specialReference;
        this._choiceValue = specialReference;
    }

    /**
     * Method unmarshalComponentReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.ComponentReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
