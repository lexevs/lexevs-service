/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.EntityReference;
import java.util.Collections;

/**
 * Class UpdatedResourceTypes.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedResourceTypes extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resourceTypeList.
     */
    private java.util.List<EntityReference> _resourceTypeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedResourceTypes() {
        super();
        this._resourceTypeList = new java.util.ArrayList<EntityReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vResourceType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceType(
            final EntityReference vResourceType)
    throws IndexOutOfBoundsException {
        this._resourceTypeList.add(vResourceType);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceType(
            final int index,
            final EntityReference vResourceType)
    throws IndexOutOfBoundsException {
        this._resourceTypeList.add(index, vResourceType);
    }

    /**
     * Method enumerateResourceType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends EntityReference> enumerateResourceType(
    ) {
        return Collections.enumeration(this._resourceTypeList);
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

        if (obj instanceof UpdatedResourceTypes) {

            UpdatedResourceTypes temp = (UpdatedResourceTypes)obj;
            if (this._resourceTypeList != null) {
                if (temp._resourceTypeList == null) return false;
                return this._resourceTypeList.equals(temp._resourceTypeList);
            } else return temp._resourceTypeList == null;
        }
        return false;
    }

    /**
     * Method getResourceType.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.EntityReference at the
     * given index
     */
    public EntityReference getResourceType(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceTypeList.size()) {
            throw new IndexOutOfBoundsException("getResourceType: Index value '" + index + "' not in range [0.." + (this._resourceTypeList.size() - 1) + "]");
        }

        return _resourceTypeList.get(index);
    }

    /**
     * Method getResourceType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public EntityReference[] getResourceType(
    ) {
        EntityReference[] array = new EntityReference[0];
        return this._resourceTypeList.toArray(array);
    }

    /**
     * Method getResourceTypeAsReference.Returns a reference to
     * '_resourceTypeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<EntityReference> getResourceTypeAsReference(
    ) {
        return this._resourceTypeList;
    }

    /**
     * Method getResourceTypeCount.
     * 
     * @return the size of this collection
     */
    public int getResourceTypeCount(
    ) {
        return this._resourceTypeList.size();
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
        if (_resourceTypeList != null) {
           result = 37 * result + _resourceTypeList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateResourceType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends EntityReference> iterateResourceType(
    ) {
        return this._resourceTypeList.iterator();
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
    public void removeAllResourceType(
    ) {
        this._resourceTypeList.clear();
    }

    /**
     * Method removeResourceType.
     * 
     * @param vResourceType
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceType(
            final EntityReference vResourceType) {
        return _resourceTypeList.remove(vResourceType);
    }

    /**
     * Method removeResourceTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public EntityReference removeResourceTypeAt(
            final int index) {
        EntityReference obj = this._resourceTypeList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceType(
            final int index,
            final EntityReference vResourceType)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceTypeList.size()) {
            throw new IndexOutOfBoundsException("setResourceType: Index value '" + index + "' not in range [0.." + (this._resourceTypeList.size() - 1) + "]");
        }

        this._resourceTypeList.set(index, vResourceType);
    }

    /**
     * 
     * 
     * @param vResourceTypeArray
     */
    public void setResourceType(
            final EntityReference[] vResourceTypeArray) {
        //-- copy array
        _resourceTypeList.clear();

        Collections.addAll(this._resourceTypeList, vResourceTypeArray);
    }

    /**
     * Sets the value of '_resourceTypeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vResourceTypeList the Vector to copy.
     */
    public void setResourceType(
            final java.util.List<EntityReference> vResourceTypeList) {
        // copy vector
        this._resourceTypeList.clear();

        this._resourceTypeList.addAll(vResourceTypeList);
    }

    /**
     * Sets the value of '_resourceTypeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param resourceTypeList the Vector to set.
     */
    public void setResourceTypeAsReference(
            final java.util.List<EntityReference> resourceTypeList) {
        this._resourceTypeList = resourceTypeList;
    }

    /**
     * Method unmarshalUpdatedResourceTypes.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedResourceTypes
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
