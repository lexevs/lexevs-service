/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.association;

import edu.mayo.cts2.framework.model.core.Property;
import java.util.Collections;

/**
 * Class UpdatedAssociationQualifiers.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedAssociationQualifiers extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _associationQualifierList.
     */
    private java.util.List<Property> _associationQualifierList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedAssociationQualifiers() {
        super();
        this._associationQualifierList = new java.util.ArrayList<Property>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssociationQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationQualifier(
            final Property vAssociationQualifier)
    throws IndexOutOfBoundsException {
        this._associationQualifierList.add(vAssociationQualifier);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationQualifier(
            final int index,
            final Property vAssociationQualifier)
    throws IndexOutOfBoundsException {
        this._associationQualifierList.add(index, vAssociationQualifier);
    }

    /**
     * Method enumerateAssociationQualifier.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Property> enumerateAssociationQualifier(
    ) {
        return Collections.enumeration(this._associationQualifierList);
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

        if (obj instanceof UpdatedAssociationQualifiers) {

            UpdatedAssociationQualifiers temp = (UpdatedAssociationQualifiers)obj;
            if (this._associationQualifierList != null) {
                if (temp._associationQualifierList == null) return false;
                return this._associationQualifierList.equals(temp._associationQualifierList);
            } else return temp._associationQualifierList == null;
        }
        return false;
    }

    /**
     * Method getAssociationQualifier.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Property at the given inde
     */
    public Property getAssociationQualifier(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationQualifierList.size()) {
            throw new IndexOutOfBoundsException("getAssociationQualifier: Index value '" + index + "' not in range [0.." + (this._associationQualifierList.size() - 1) + "]");
        }

        return _associationQualifierList.get(index);
    }

    /**
     * Method getAssociationQualifier.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Property[] getAssociationQualifier(
    ) {
        Property[] array = new Property[0];
        return this._associationQualifierList.toArray(array);
    }

    /**
     * Method getAssociationQualifierAsReference.Returns a
     * reference to '_associationQualifierList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Property> getAssociationQualifierAsReference(
    ) {
        return this._associationQualifierList;
    }

    /**
     * Method getAssociationQualifierCount.
     * 
     * @return the size of this collection
     */
    public int getAssociationQualifierCount(
    ) {
        return this._associationQualifierList.size();
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
        if (_associationQualifierList != null) {
           result = 37 * result + _associationQualifierList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateAssociationQualifier.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Property> iterateAssociationQualifier(
    ) {
        return this._associationQualifierList.iterator();
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
    public void removeAllAssociationQualifier(
    ) {
        this._associationQualifierList.clear();
    }

    /**
     * Method removeAssociationQualifier.
     * 
     * @param vAssociationQualifier
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssociationQualifier(
            final Property vAssociationQualifier) {
        return _associationQualifierList.remove(vAssociationQualifier);
    }

    /**
     * Method removeAssociationQualifierAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Property removeAssociationQualifierAt(
            final int index) {
        Property obj = this._associationQualifierList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssociationQualifier(
            final int index,
            final Property vAssociationQualifier)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationQualifierList.size()) {
            throw new IndexOutOfBoundsException("setAssociationQualifier: Index value '" + index + "' not in range [0.." + (this._associationQualifierList.size() - 1) + "]");
        }

        this._associationQualifierList.set(index, vAssociationQualifier);
    }

    /**
     * 
     * 
     * @param vAssociationQualifierArray
     */
    public void setAssociationQualifier(
            final Property[] vAssociationQualifierArray) {
        //-- copy array
        _associationQualifierList.clear();

        Collections.addAll(this._associationQualifierList, vAssociationQualifierArray);
    }

    /**
     * Sets the value of '_associationQualifierList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vAssociationQualifierList the Vector to copy.
     */
    public void setAssociationQualifier(
            final java.util.List<Property> vAssociationQualifierList) {
        // copy vector
        this._associationQualifierList.clear();

        this._associationQualifierList.addAll(vAssociationQualifierList);
    }

    /**
     * Sets the value of '_associationQualifierList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param associationQualifierList the Vector to set.
     */
    public void setAssociationQualifierAsReference(
            final java.util.List<Property> associationQualifierList) {
        this._associationQualifierList = associationQualifierList;
    }

    /**
     * Method unmarshalUpdatedAssociationQualifiers.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.association.UpdatedAssociationQualifiers
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
