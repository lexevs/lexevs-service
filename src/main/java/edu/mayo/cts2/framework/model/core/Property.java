/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

import java.util.Collections;

/**
 * A tag/value pair that does not have a corresponding model
 * attribute. Property represent any statement about a resource
 * (e.g. CodeSystem, Entity, etc.) that does not have a
 * corresponding attribute in the
 *  CTS2 model. As an example, the NCI Thesaurus uses a tag named
 * BioCarta_ID (C43677) to associate appropriate thesaurus entities
 * with Bio Carta pathway references. This would be represented by
 * a property,
 *  whose predicate is the URI for C436777 and the value is the
 * actual id.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Property extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a link to the original statement from which this Property is
     * derived. Will only be present in CTS2 implementations that
     * support the Statement profile.
     */
    private String _correspondingStatement;

    /**
     * the name and URI of the property predicate
     */
    private PredicateReference _predicate;

    /**
     * the target(s) of the property. Note that this can only
     * represent the literal format of the property. The details
     * about the original property will be found in the
     * correspondingStatement if the
     *  CTS2 implementation supports the Statement profile.
     */
    private java.util.List<StatementTarget> _valueList;

    /**
     * an assertion whose subject is the assertion in the property
     * instead of the property subject
     */
    private java.util.List<Property> _propertyQualifierList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Property() {
        super();
        this._valueList = new java.util.ArrayList<StatementTarget>();
        this._propertyQualifierList = new java.util.ArrayList<Property>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPropertyQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPropertyQualifier(
            final Property vPropertyQualifier)
    throws IndexOutOfBoundsException {
        this._propertyQualifierList.add(vPropertyQualifier);
    }

    /**
     * 
     * 
     * @param index
     * @param vPropertyQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPropertyQualifier(
            final int index,
            final Property vPropertyQualifier)
    throws IndexOutOfBoundsException {
        this._propertyQualifierList.add(index, vPropertyQualifier);
    }

    /**
     * 
     * 
     * @param vValue
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValue(
            final StatementTarget vValue)
    throws IndexOutOfBoundsException {
        this._valueList.add(vValue);
    }

    /**
     * 
     * 
     * @param index
     * @param vValue
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValue(
            final int index,
            final StatementTarget vValue)
    throws IndexOutOfBoundsException {
        this._valueList.add(index, vValue);
    }

    /**
     * Method enumeratePropertyQualifier.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Property> enumeratePropertyQualifier(
    ) {
        return Collections.enumeration(this._propertyQualifierList);
    }

    /**
     * Method enumerateValue.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends StatementTarget> enumerateValue(
    ) {
        return Collections.enumeration(this._valueList);
    }

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

        if (obj instanceof Property) {

            Property temp = (Property)obj;
            if (this._correspondingStatement != null) {
                if (temp._correspondingStatement == null) return false;
                if (!this._correspondingStatement.equals(temp._correspondingStatement)) 
                    return false;
            } else if (temp._correspondingStatement != null)
                return false;
            if (this._predicate != null) {
                if (temp._predicate == null) return false;
                if (!this._predicate.equals(temp._predicate)) 
                    return false;
            } else if (temp._predicate != null)
                return false;
            if (this._valueList != null) {
                if (temp._valueList == null) return false;
                if (!this._valueList.equals(temp._valueList)) 
                    return false;
            } else if (temp._valueList != null)
                return false;
            if (this._propertyQualifierList != null) {
                if (temp._propertyQualifierList == null) return false;
                return this._propertyQualifierList.equals(temp._propertyQualifierList);
            } else return temp._propertyQualifierList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'correspondingStatement'. The
     * field 'correspondingStatement' has the following
     * description: a link to the original statement from which
     * this Property is derived. Will only be present in CTS2
     * implementations that support the Statement profile.
     * 
     * @return the value of field 'CorrespondingStatement'.
     */
    public String getCorrespondingStatement(
    ) {
        return this._correspondingStatement;
    }

    /**
     * Returns the value of field 'predicate'. The field
     * 'predicate' has the following description: the name and URI
     * of the property predicate
     * 
     * @return the value of field 'Predicate'.
     */
    public PredicateReference getPredicate(
    ) {
        return this._predicate;
    }

    /**
     * Method getPropertyQualifier.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Property at the given inde
     */
    public Property getPropertyQualifier(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyQualifierList.size()) {
            throw new IndexOutOfBoundsException("getPropertyQualifier: Index value '" + index + "' not in range [0.." + (this._propertyQualifierList.size() - 1) + "]");
        }

        return _propertyQualifierList.get(index);
    }

    /**
     * Method getPropertyQualifier.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Property[] getPropertyQualifier(
    ) {
        Property[] array = new Property[0];
        return this._propertyQualifierList.toArray(array);
    }

    /**
     * Method getPropertyQualifierAsReference.Returns a reference
     * to '_propertyQualifierList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Property> getPropertyQualifierAsReference(
    ) {
        return this._propertyQualifierList;
    }

    /**
     * Method getPropertyQualifierCount.
     * 
     * @return the size of this collection
     */
    public int getPropertyQualifierCount(
    ) {
        return this._propertyQualifierList.size();
    }

    /**
     * Method getValue.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.StatementTarget at the
     * given index
     */
    public StatementTarget getValue(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valueList.size()) {
            throw new IndexOutOfBoundsException("getValue: Index value '" + index + "' not in range [0.." + (this._valueList.size() - 1) + "]");
        }

        return _valueList.get(index);
    }

    /**
     * Method getValue.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public StatementTarget[] getValue(
    ) {
        StatementTarget[] array = new StatementTarget[0];
        return this._valueList.toArray(array);
    }

    /**
     * Method getValueAsReference.Returns a reference to
     * '_valueList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<StatementTarget> getValueAsReference(
    ) {
        return this._valueList;
    }

    /**
     * Method getValueCount.
     * 
     * @return the size of this collection
     */
    public int getValueCount(
    ) {
        return this._valueList.size();
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
        if (_correspondingStatement != null) {
           result = 37 * result + _correspondingStatement.hashCode();
        }
        if (_predicate != null) {
           result = 37 * result + _predicate.hashCode();
        }
        if (_valueList != null) {
           result = 37 * result + _valueList.hashCode();
        }
        if (_propertyQualifierList != null) {
           result = 37 * result + _propertyQualifierList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iteratePropertyQualifier.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Property> iteratePropertyQualifier(
    ) {
        return this._propertyQualifierList.iterator();
    }

    /**
     * Method iterateValue.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends StatementTarget> iterateValue(
    ) {
        return this._valueList.iterator();
    }

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
     */
    public void removeAllPropertyQualifier(
    ) {
        this._propertyQualifierList.clear();
    }

    /**
     */
    public void removeAllValue(
    ) {
        this._valueList.clear();
    }

    /**
     * Method removePropertyQualifier.
     * 
     * @param vPropertyQualifier
     * @return true if the object was removed from the collection.
     */
    public boolean removePropertyQualifier(
            final Property vPropertyQualifier) {
        return _propertyQualifierList.remove(vPropertyQualifier);
    }

    /**
     * Method removePropertyQualifierAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Property removePropertyQualifierAt(
            final int index) {
        Property obj = this._propertyQualifierList.remove(index);
        return obj;
    }

    /**
     * Method removeValue.
     * 
     * @param vValue
     * @return true if the object was removed from the collection.
     */
    public boolean removeValue(
            final StatementTarget vValue) {
        return _valueList.remove(vValue);
    }

    /**
     * Method removeValueAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public StatementTarget removeValueAt(
            final int index) {
        StatementTarget obj = this._valueList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'correspondingStatement'. The field
     * 'correspondingStatement' has the following description: a
     * link to the original statement from which this Property is
     * derived. Will only be present in CTS2 implementations that
     * support the Statement profile.
     * 
     * @param correspondingStatement the value of field
     * 'correspondingStatement'.
     */
    public void setCorrespondingStatement(
            final String correspondingStatement) {
        this._correspondingStatement = correspondingStatement;
    }

    /**
     * Sets the value of field 'predicate'. The field 'predicate'
     * has the following description: the name and URI of the
     * property predicate
     * 
     * @param predicate the value of field 'predicate'.
     */
    public void setPredicate(
            final PredicateReference predicate) {
        this._predicate = predicate;
    }

    /**
     * 
     * 
     * @param index
     * @param vPropertyQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPropertyQualifier(
            final int index,
            final Property vPropertyQualifier)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyQualifierList.size()) {
            throw new IndexOutOfBoundsException("setPropertyQualifier: Index value '" + index + "' not in range [0.." + (this._propertyQualifierList.size() - 1) + "]");
        }

        this._propertyQualifierList.set(index, vPropertyQualifier);
    }

    /**
     * 
     * 
     * @param vPropertyQualifierArray
     */
    public void setPropertyQualifier(
            final Property[] vPropertyQualifierArray) {
        //-- copy array
        _propertyQualifierList.clear();

        Collections.addAll(this._propertyQualifierList, vPropertyQualifierArray);
    }

    /**
     * Sets the value of '_propertyQualifierList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vPropertyQualifierList the Vector to copy.
     */
    public void setPropertyQualifier(
            final java.util.List<Property> vPropertyQualifierList) {
        // copy vector
        this._propertyQualifierList.clear();

        this._propertyQualifierList.addAll(vPropertyQualifierList);
    }

    /**
     * Sets the value of '_propertyQualifierList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertyQualifierList the Vector to set.
     */
    public void setPropertyQualifierAsReference(
            final java.util.List<Property> propertyQualifierList) {
        this._propertyQualifierList = propertyQualifierList;
    }

    /**
     * 
     * 
     * @param index
     * @param vValue
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setValue(
            final int index,
            final StatementTarget vValue)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valueList.size()) {
            throw new IndexOutOfBoundsException("setValue: Index value '" + index + "' not in range [0.." + (this._valueList.size() - 1) + "]");
        }

        this._valueList.set(index, vValue);
    }

    /**
     * 
     * 
     * @param vValueArray
     */
    public void setValue(
            final StatementTarget[] vValueArray) {
        //-- copy array
        _valueList.clear();

        Collections.addAll(this._valueList, vValueArray);
    }

    /**
     * Sets the value of '_valueList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vValueList the Vector to copy.
     */
    public void setValue(
            final java.util.List<StatementTarget> vValueList) {
        // copy vector
        this._valueList.clear();

        this._valueList.addAll(vValueList);
    }

    /**
     * Sets the value of '_valueList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param valueList the Vector to set.
     */
    public void setValueAsReference(
            final java.util.List<StatementTarget> valueList) {
        this._valueList = valueList;
    }

    /**
     * Method unmarshalProperty.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.Property
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
