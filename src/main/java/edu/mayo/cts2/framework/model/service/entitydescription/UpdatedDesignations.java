/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.entitydescription;

import edu.mayo.cts2.framework.model.entity.Designation;
import java.util.Collections;

/**
 * Class UpdatedDesignations.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedDesignations extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _designationList.
     */
    private java.util.List<Designation> _designationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedDesignations() {
        super();
        this._designationList = new java.util.ArrayList<Designation>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDesignation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDesignation(
            final Designation vDesignation)
    throws IndexOutOfBoundsException {
        this._designationList.add(vDesignation);
    }

    /**
     * 
     * 
     * @param index
     * @param vDesignation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDesignation(
            final int index,
            final Designation vDesignation)
    throws IndexOutOfBoundsException {
        this._designationList.add(index, vDesignation);
    }

    /**
     * Method enumerateDesignation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Designation> enumerateDesignation(
    ) {
        return Collections.enumeration(this._designationList);
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

        if (obj instanceof UpdatedDesignations) {

            UpdatedDesignations temp = (UpdatedDesignations)obj;
            if (this._designationList != null) {
                if (temp._designationList == null) return false;
                return this._designationList.equals(temp._designationList);
            } else return temp._designationList == null;
        }
        return false;
    }

    /**
     * Method getDesignation.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.entity.Designation at the
     * given index
     */
    public Designation getDesignation(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._designationList.size()) {
            throw new IndexOutOfBoundsException("getDesignation: Index value '" + index + "' not in range [0.." + (this._designationList.size() - 1) + "]");
        }

        return _designationList.get(index);
    }

    /**
     * Method getDesignation.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Designation[] getDesignation(
    ) {
        Designation[] array = new Designation[0];
        return this._designationList.toArray(array);
    }

    /**
     * Method getDesignationAsReference.Returns a reference to
     * '_designationList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Designation> getDesignationAsReference(
    ) {
        return this._designationList;
    }

    /**
     * Method getDesignationCount.
     * 
     * @return the size of this collection
     */
    public int getDesignationCount(
    ) {
        return this._designationList.size();
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
        if (_designationList != null) {
           result = 37 * result + _designationList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateDesignation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Designation> iterateDesignation(
    ) {
        return this._designationList.iterator();
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
    public void removeAllDesignation(
    ) {
        this._designationList.clear();
    }

    /**
     * Method removeDesignation.
     * 
     * @param vDesignation
     * @return true if the object was removed from the collection.
     */
    public boolean removeDesignation(
            final Designation vDesignation) {
        return _designationList.remove(vDesignation);
    }

    /**
     * Method removeDesignationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Designation removeDesignationAt(
            final int index) {
        Designation obj = this._designationList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDesignation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDesignation(
            final int index,
            final Designation vDesignation)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._designationList.size()) {
            throw new IndexOutOfBoundsException("setDesignation: Index value '" + index + "' not in range [0.." + (this._designationList.size() - 1) + "]");
        }

        this._designationList.set(index, vDesignation);
    }

    /**
     * 
     * 
     * @param vDesignationArray
     */
    public void setDesignation(
            final Designation[] vDesignationArray) {
        //-- copy array
        _designationList.clear();

        Collections.addAll(this._designationList, vDesignationArray);
    }

    /**
     * Sets the value of '_designationList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vDesignationList the Vector to copy.
     */
    public void setDesignation(
            final java.util.List<Designation> vDesignationList) {
        // copy vector
        this._designationList.clear();

        this._designationList.addAll(vDesignationList);
    }

    /**
     * Sets the value of '_designationList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param designationList the Vector to set.
     */
    public void setDesignationAsReference(
            final java.util.List<Designation> designationList) {
        this._designationList = designationList;
    }

    /**
     * Method unmarshalUpdatedDesignations.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.entitydescription.UpdatedDesignations
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
