/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.entitydescription;

import edu.mayo.cts2.framework.model.service.core.EntityNameOrURI;
import java.util.Collections;

/**
 * Class UpdatedParents.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedParents extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _parentList.
     */
    private java.util.List<EntityNameOrURI> _parentList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedParents() {
        super();
        this._parentList = new java.util.ArrayList<EntityNameOrURI>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vParent
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParent(
            final EntityNameOrURI vParent)
    throws IndexOutOfBoundsException {
        this._parentList.add(vParent);
    }

    /**
     * 
     * 
     * @param index
     * @param vParent
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParent(
            final int index,
            final EntityNameOrURI vParent)
    throws IndexOutOfBoundsException {
        this._parentList.add(index, vParent);
    }

    /**
     * Method enumerateParent.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends EntityNameOrURI> enumerateParent(
    ) {
        return Collections.enumeration(this._parentList);
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

        if (obj instanceof UpdatedParents) {

            UpdatedParents temp = (UpdatedParents)obj;
            if (this._parentList != null) {
                if (temp._parentList == null) return false;
                return this._parentList.equals(temp._parentList);
            } else return temp._parentList == null;
        }
        return false;
    }

    /**
     * Method getParent.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.service.core.EntityNameOrURI
     * at the given index
     */
    public EntityNameOrURI getParent(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parentList.size()) {
            throw new IndexOutOfBoundsException("getParent: Index value '" + index + "' not in range [0.." + (this._parentList.size() - 1) + "]");
        }

        return _parentList.get(index);
    }

    /**
     * Method getParent.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public EntityNameOrURI[] getParent(
    ) {
        EntityNameOrURI[] array = new EntityNameOrURI[0];
        return this._parentList.toArray(array);
    }

    /**
     * Method getParentAsReference.Returns a reference to
     * '_parentList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<EntityNameOrURI> getParentAsReference(
    ) {
        return this._parentList;
    }

    /**
     * Method getParentCount.
     * 
     * @return the size of this collection
     */
    public int getParentCount(
    ) {
        return this._parentList.size();
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
        if (_parentList != null) {
           result = 37 * result + _parentList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateParent.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends EntityNameOrURI> iterateParent(
    ) {
        return this._parentList.iterator();
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
    public void removeAllParent(
    ) {
        this._parentList.clear();
    }

    /**
     * Method removeParent.
     * 
     * @param vParent
     * @return true if the object was removed from the collection.
     */
    public boolean removeParent(
            final EntityNameOrURI vParent) {
        return _parentList.remove(vParent);
    }

    /**
     * Method removeParentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public EntityNameOrURI removeParentAt(
            final int index) {
        EntityNameOrURI obj = this._parentList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vParent
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParent(
            final int index,
            final EntityNameOrURI vParent)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parentList.size()) {
            throw new IndexOutOfBoundsException("setParent: Index value '" + index + "' not in range [0.." + (this._parentList.size() - 1) + "]");
        }

        this._parentList.set(index, vParent);
    }

    /**
     * 
     * 
     * @param vParentArray
     */
    public void setParent(
            final EntityNameOrURI[] vParentArray) {
        //-- copy array
        _parentList.clear();

        Collections.addAll(this._parentList, vParentArray);
    }

    /**
     * Sets the value of '_parentList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vParentList the Vector to copy.
     */
    public void setParent(
            final java.util.List<EntityNameOrURI> vParentList) {
        // copy vector
        this._parentList.clear();

        this._parentList.addAll(vParentList);
    }

    /**
     * Sets the value of '_parentList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param parentList the Vector to set.
     */
    public void setParentAsReference(
            final java.util.List<EntityNameOrURI> parentList) {
        this._parentList = parentList;
    }

    /**
     * Method unmarshalUpdatedParents.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.entitydescription.UpdatedParents
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
