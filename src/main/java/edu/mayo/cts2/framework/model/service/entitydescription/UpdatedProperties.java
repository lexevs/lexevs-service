/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.entitydescription;

import edu.mayo.cts2.framework.model.core.Property;
import java.util.Collections;

/**
 * Class UpdatedProperties.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedProperties extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _propertyList.
     */
    private java.util.List<Property> _propertyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedProperties() {
        super();
        this._propertyList = new java.util.ArrayList<Property>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vProperty
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final Property vProperty)
    throws IndexOutOfBoundsException {
        this._propertyList.add(vProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final int index,
            final Property vProperty)
    throws IndexOutOfBoundsException {
        this._propertyList.add(index, vProperty);
    }

    /**
     * Method enumerateProperty.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Property> enumerateProperty(
    ) {
        return Collections.enumeration(this._propertyList);
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

        if (obj instanceof UpdatedProperties) {

            UpdatedProperties temp = (UpdatedProperties)obj;
            if (this._propertyList != null) {
                if (temp._propertyList == null) return false;
                return this._propertyList.equals(temp._propertyList);
            } else return temp._propertyList == null;
        }
        return false;
    }

    /**
     * Method getProperty.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Property at the given inde
     */
    public Property getProperty(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("getProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }

        return _propertyList.get(index);
    }

    /**
     * Method getProperty.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Property[] getProperty(
    ) {
        Property[] array = new Property[0];
        return this._propertyList.toArray(array);
    }

    /**
     * Method getPropertyAsReference.Returns a reference to
     * '_propertyList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Property> getPropertyAsReference(
    ) {
        return this._propertyList;
    }

    /**
     * Method getPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getPropertyCount(
    ) {
        return this._propertyList.size();
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
        if (_propertyList != null) {
           result = 37 * result + _propertyList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateProperty.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Property> iterateProperty(
    ) {
        return this._propertyList.iterator();
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
    public void removeAllProperty(
    ) {
        this._propertyList.clear();
    }

    /**
     * Method removeProperty.
     * 
     * @param vProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeProperty(
            final Property vProperty) {
        return _propertyList.remove(vProperty);
    }

    /**
     * Method removePropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Property removePropertyAt(
            final int index) {
        Property obj = this._propertyList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProperty(
            final int index,
            final Property vProperty)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("setProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }

        this._propertyList.set(index, vProperty);
    }

    /**
     * 
     * 
     * @param vPropertyArray
     */
    public void setProperty(
            final Property[] vPropertyArray) {
        //-- copy array
        _propertyList.clear();

        Collections.addAll(this._propertyList, vPropertyArray);
    }

    /**
     * Sets the value of '_propertyList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPropertyList the Vector to copy.
     */
    public void setProperty(
            final java.util.List<Property> vPropertyList) {
        // copy vector
        this._propertyList.clear();

        this._propertyList.addAll(vPropertyList);
    }

    /**
     * Sets the value of '_propertyList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertyList the Vector to set.
     */
    public void setPropertyAsReference(
            final java.util.List<Property> propertyList) {
        this._propertyList = propertyList;
    }

    /**
     * Method unmarshalUpdatedProperties.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.entitydescription.UpdatedProperties
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
