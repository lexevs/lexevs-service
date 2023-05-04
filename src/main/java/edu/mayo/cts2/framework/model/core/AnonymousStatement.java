/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

import java.util.Collections;

/**
 * A statement lacking a named subject. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AnonymousStatement extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the predicate of the anonymous statement
     */
    private PredicateReference _predicate;

    /**
     * the target of the anonymous statement
     */
    private java.util.List<StatementTarget> _targetList;

    /**
     * assertions whose subject is the anonymous statement 
     */
    private java.util.List<Property> _statmentQualifierList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AnonymousStatement() {
        super();
        this._targetList = new java.util.ArrayList<StatementTarget>();
        this._statmentQualifierList = new java.util.ArrayList<Property>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vStatmentQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStatmentQualifier(
            final Property vStatmentQualifier)
    throws IndexOutOfBoundsException {
        this._statmentQualifierList.add(vStatmentQualifier);
    }

    /**
     * 
     * 
     * @param index
     * @param vStatmentQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStatmentQualifier(
            final int index,
            final Property vStatmentQualifier)
    throws IndexOutOfBoundsException {
        this._statmentQualifierList.add(index, vStatmentQualifier);
    }

    /**
     * 
     * 
     * @param vTarget
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final StatementTarget vTarget)
    throws IndexOutOfBoundsException {
        this._targetList.add(vTarget);
    }

    /**
     * 
     * 
     * @param index
     * @param vTarget
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final int index,
            final StatementTarget vTarget)
    throws IndexOutOfBoundsException {
        this._targetList.add(index, vTarget);
    }

    /**
     * Method enumerateStatmentQualifier.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Property> enumerateStatmentQualifier(
    ) {
        return Collections.enumeration(this._statmentQualifierList);
    }

    /**
     * Method enumerateTarget.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends StatementTarget> enumerateTarget(
    ) {
        return Collections.enumeration(this._targetList);
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

        if (obj instanceof AnonymousStatement) {

            AnonymousStatement temp = (AnonymousStatement)obj;
            if (this._predicate != null) {
                if (temp._predicate == null) return false;
                if (!this._predicate.equals(temp._predicate)) 
                    return false;
            } else if (temp._predicate != null)
                return false;
            if (this._targetList != null) {
                if (temp._targetList == null) return false;
                if (!this._targetList.equals(temp._targetList)) 
                    return false;
            } else if (temp._targetList != null)
                return false;
            if (this._statmentQualifierList != null) {
                if (temp._statmentQualifierList == null) return false;
                return this._statmentQualifierList.equals(temp._statmentQualifierList);
            } else return temp._statmentQualifierList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'predicate'. The field
     * 'predicate' has the following description: the predicate of
     * the anonymous statement
     * 
     * @return the value of field 'Predicate'.
     */
    public PredicateReference getPredicate(
    ) {
        return this._predicate;
    }

    /**
     * Method getStatmentQualifier.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Property at the given inde
     */
    public Property getStatmentQualifier(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._statmentQualifierList.size()) {
            throw new IndexOutOfBoundsException("getStatmentQualifier: Index value '" + index + "' not in range [0.." + (this._statmentQualifierList.size() - 1) + "]");
        }

        return _statmentQualifierList.get(index);
    }

    /**
     * Method getStatmentQualifier.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Property[] getStatmentQualifier(
    ) {
        Property[] array = new Property[0];
        return this._statmentQualifierList.toArray(array);
    }

    /**
     * Method getStatmentQualifierAsReference.Returns a reference
     * to '_statmentQualifierList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Property> getStatmentQualifierAsReference(
    ) {
        return this._statmentQualifierList;
    }

    /**
     * Method getStatmentQualifierCount.
     * 
     * @return the size of this collection
     */
    public int getStatmentQualifierCount(
    ) {
        return this._statmentQualifierList.size();
    }

    /**
     * Method getTarget.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.StatementTarget at the
     * given index
     */
    public StatementTarget getTarget(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("getTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }

        return _targetList.get(index);
    }

    /**
     * Method getTarget.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public StatementTarget[] getTarget(
    ) {
        StatementTarget[] array = new StatementTarget[0];
        return this._targetList.toArray(array);
    }

    /**
     * Method getTargetAsReference.Returns a reference to
     * '_targetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<StatementTarget> getTargetAsReference(
    ) {
        return this._targetList;
    }

    /**
     * Method getTargetCount.
     * 
     * @return the size of this collection
     */
    public int getTargetCount(
    ) {
        return this._targetList.size();
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
        if (_predicate != null) {
           result = 37 * result + _predicate.hashCode();
        }
        if (_targetList != null) {
           result = 37 * result + _targetList.hashCode();
        }
        if (_statmentQualifierList != null) {
           result = 37 * result + _statmentQualifierList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateStatmentQualifier.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Property> iterateStatmentQualifier(
    ) {
        return this._statmentQualifierList.iterator();
    }

    /**
     * Method iterateTarget.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends StatementTarget> iterateTarget(
    ) {
        return this._targetList.iterator();
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
    public void removeAllStatmentQualifier(
    ) {
        this._statmentQualifierList.clear();
    }

    /**
     */
    public void removeAllTarget(
    ) {
        this._targetList.clear();
    }

    /**
     * Method removeStatmentQualifier.
     * 
     * @param vStatmentQualifier
     * @return true if the object was removed from the collection.
     */
    public boolean removeStatmentQualifier(
            final Property vStatmentQualifier) {
        return _statmentQualifierList.remove(vStatmentQualifier);
    }

    /**
     * Method removeStatmentQualifierAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Property removeStatmentQualifierAt(
            final int index) {
        Property obj = this._statmentQualifierList.remove(index);
        return obj;
    }

    /**
     * Method removeTarget.
     * 
     * @param vTarget
     * @return true if the object was removed from the collection.
     */
    public boolean removeTarget(
            final StatementTarget vTarget) {
        return _targetList.remove(vTarget);
    }

    /**
     * Method removeTargetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public StatementTarget removeTargetAt(
            final int index) {
        StatementTarget obj = this._targetList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'predicate'. The field 'predicate'
     * has the following description: the predicate of the
     * anonymous statement
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
     * @param vStatmentQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStatmentQualifier(
            final int index,
            final Property vStatmentQualifier)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._statmentQualifierList.size()) {
            throw new IndexOutOfBoundsException("setStatmentQualifier: Index value '" + index + "' not in range [0.." + (this._statmentQualifierList.size() - 1) + "]");
        }

        this._statmentQualifierList.set(index, vStatmentQualifier);
    }

    /**
     * 
     * 
     * @param vStatmentQualifierArray
     */
    public void setStatmentQualifier(
            final Property[] vStatmentQualifierArray) {
        //-- copy array
        _statmentQualifierList.clear();

        Collections.addAll(this._statmentQualifierList, vStatmentQualifierArray);
    }

    /**
     * Sets the value of '_statmentQualifierList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vStatmentQualifierList the Vector to copy.
     */
    public void setStatmentQualifier(
            final java.util.List<Property> vStatmentQualifierList) {
        // copy vector
        this._statmentQualifierList.clear();

        this._statmentQualifierList.addAll(vStatmentQualifierList);
    }

    /**
     * Sets the value of '_statmentQualifierList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param statmentQualifierList the Vector to set.
     */
    public void setStatmentQualifierAsReference(
            final java.util.List<Property> statmentQualifierList) {
        this._statmentQualifierList = statmentQualifierList;
    }

    /**
     * 
     * 
     * @param index
     * @param vTarget
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTarget(
            final int index,
            final StatementTarget vTarget)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("setTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }

        this._targetList.set(index, vTarget);
    }

    /**
     * 
     * 
     * @param vTargetArray
     */
    public void setTarget(
            final StatementTarget[] vTargetArray) {
        //-- copy array
        _targetList.clear();

        Collections.addAll(this._targetList, vTargetArray);
    }

    /**
     * Sets the value of '_targetList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vTargetList the Vector to copy.
     */
    public void setTarget(
            final java.util.List<StatementTarget> vTargetList) {
        // copy vector
        this._targetList.clear();

        this._targetList.addAll(vTargetList);
    }

    /**
     * Sets the value of '_targetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param targetList the Vector to set.
     */
    public void setTargetAsReference(
            final java.util.List<StatementTarget> targetList) {
        this._targetList = targetList;
    }

    /**
     * Method unmarshalAnonymousStatement.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.AnonymousStatement
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
