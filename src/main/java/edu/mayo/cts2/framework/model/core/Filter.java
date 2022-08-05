/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

import java.util.Collections;

/**
 * A collection of one or more filters. The result of applying a
 * Filter component is the intersection of the sets of qualifying
 * elements. As an example, a filter having two components - one
 * which
 *  says that the rights attribute must exist and a second that
 * says that the text "SNOMED" must appear in the synopsis would
 * return all resources having BOTH a rights attribute and "SNOMED"
 * in the
 *  description.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Filter extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _componentList.
     */
    private java.util.List<FilterComponent> _componentList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Filter() {
        super();
        this._componentList = new java.util.ArrayList<FilterComponent>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vComponent
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComponent(
            final FilterComponent vComponent)
    throws IndexOutOfBoundsException {
        this._componentList.add(vComponent);
    }

    /**
     * 
     * 
     * @param index
     * @param vComponent
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComponent(
            final int index,
            final FilterComponent vComponent)
    throws IndexOutOfBoundsException {
        this._componentList.add(index, vComponent);
    }

    /**
     * Method enumerateComponent.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends FilterComponent> enumerateComponent(
    ) {
        return Collections.enumeration(this._componentList);
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

        if (obj instanceof Filter) {

            Filter temp = (Filter)obj;
            if (this._componentList != null) {
                if (temp._componentList == null) return false;
                return this._componentList.equals(temp._componentList);
            } else return temp._componentList == null;
        }
        return false;
    }

    /**
     * Method getComponent.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.FilterComponent at the
     * given index
     */
    public FilterComponent getComponent(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._componentList.size()) {
            throw new IndexOutOfBoundsException("getComponent: Index value '" + index + "' not in range [0.." + (this._componentList.size() - 1) + "]");
        }

        return _componentList.get(index);
    }

    /**
     * Method getComponent.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public FilterComponent[] getComponent(
    ) {
        FilterComponent[] array = new FilterComponent[0];
        return this._componentList.toArray(array);
    }

    /**
     * Method getComponentAsReference.Returns a reference to
     * '_componentList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<FilterComponent> getComponentAsReference(
    ) {
        return this._componentList;
    }

    /**
     * Method getComponentCount.
     * 
     * @return the size of this collection
     */
    public int getComponentCount(
    ) {
        return this._componentList.size();
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
        if (_componentList != null) {
           result = 37 * result + _componentList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateComponent.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends FilterComponent> iterateComponent(
    ) {
        return this._componentList.iterator();
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
    public void removeAllComponent(
    ) {
        this._componentList.clear();
    }

    /**
     * Method removeComponent.
     * 
     * @param vComponent
     * @return true if the object was removed from the collection.
     */
    public boolean removeComponent(
            final FilterComponent vComponent) {
        return _componentList.remove(vComponent);
    }

    /**
     * Method removeComponentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public FilterComponent removeComponentAt(
            final int index) {
        FilterComponent obj = this._componentList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vComponent
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setComponent(
            final int index,
            final FilterComponent vComponent)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._componentList.size()) {
            throw new IndexOutOfBoundsException("setComponent: Index value '" + index + "' not in range [0.." + (this._componentList.size() - 1) + "]");
        }

        this._componentList.set(index, vComponent);
    }

    /**
     * 
     * 
     * @param vComponentArray
     */
    public void setComponent(
            final FilterComponent[] vComponentArray) {
        //-- copy array
        _componentList.clear();

        Collections.addAll(this._componentList, vComponentArray);
    }

    /**
     * Sets the value of '_componentList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vComponentList the Vector to copy.
     */
    public void setComponent(
            final java.util.List<FilterComponent> vComponentList) {
        // copy vector
        this._componentList.clear();

        this._componentList.addAll(vComponentList);
    }

    /**
     * Sets the value of '_componentList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param componentList the Vector to set.
     */
    public void setComponentAsReference(
            final java.util.List<FilterComponent> componentList) {
        this._componentList = componentList;
    }

    /**
     * Method unmarshalFilter.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.Filter
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
