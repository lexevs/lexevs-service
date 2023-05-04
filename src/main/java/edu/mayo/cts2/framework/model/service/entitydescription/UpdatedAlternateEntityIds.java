/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.entitydescription;

import edu.mayo.cts2.framework.model.core.ScopedEntityName;
import java.util.Collections;

/**
 * Class UpdatedAlternateEntityIds.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedAlternateEntityIds extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _alternateEntityIdList.
     */
    private java.util.List<ScopedEntityName> _alternateEntityIdList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedAlternateEntityIds() {
        super();
        this._alternateEntityIdList = new java.util.ArrayList<ScopedEntityName>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAlternateEntityId
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateEntityId(
            final ScopedEntityName vAlternateEntityId)
    throws IndexOutOfBoundsException {
        this._alternateEntityIdList.add(vAlternateEntityId);
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateEntityId
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateEntityId(
            final int index,
            final ScopedEntityName vAlternateEntityId)
    throws IndexOutOfBoundsException {
        this._alternateEntityIdList.add(index, vAlternateEntityId);
    }

    /**
     * Method enumerateAlternateEntityId.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ScopedEntityName> enumerateAlternateEntityId(
    ) {
        return Collections.enumeration(this._alternateEntityIdList);
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

        if (obj instanceof UpdatedAlternateEntityIds) {

            UpdatedAlternateEntityIds temp = (UpdatedAlternateEntityIds)obj;
            if (this._alternateEntityIdList != null) {
                if (temp._alternateEntityIdList == null) return false;
                return this._alternateEntityIdList.equals(temp._alternateEntityIdList);
            } else return temp._alternateEntityIdList == null;
        }
        return false;
    }

    /**
     * Method getAlternateEntityId.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.ScopedEntityName at the
     * given index
     */
    public ScopedEntityName getAlternateEntityId(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateEntityIdList.size()) {
            throw new IndexOutOfBoundsException("getAlternateEntityId: Index value '" + index + "' not in range [0.." + (this._alternateEntityIdList.size() - 1) + "]");
        }

        return _alternateEntityIdList.get(index);
    }

    /**
     * Method getAlternateEntityId.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ScopedEntityName[] getAlternateEntityId(
    ) {
        ScopedEntityName[] array = new ScopedEntityName[0];
        return this._alternateEntityIdList.toArray(array);
    }

    /**
     * Method getAlternateEntityIdAsReference.Returns a reference
     * to '_alternateEntityIdList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ScopedEntityName> getAlternateEntityIdAsReference(
    ) {
        return this._alternateEntityIdList;
    }

    /**
     * Method getAlternateEntityIdCount.
     * 
     * @return the size of this collection
     */
    public int getAlternateEntityIdCount(
    ) {
        return this._alternateEntityIdList.size();
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
        if (_alternateEntityIdList != null) {
           result = 37 * result + _alternateEntityIdList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateAlternateEntityId.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ScopedEntityName> iterateAlternateEntityId(
    ) {
        return this._alternateEntityIdList.iterator();
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
    public void removeAllAlternateEntityId(
    ) {
        this._alternateEntityIdList.clear();
    }

    /**
     * Method removeAlternateEntityId.
     * 
     * @param vAlternateEntityId
     * @return true if the object was removed from the collection.
     */
    public boolean removeAlternateEntityId(
            final ScopedEntityName vAlternateEntityId) {
        return _alternateEntityIdList.remove(vAlternateEntityId);
    }

    /**
     * Method removeAlternateEntityIdAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ScopedEntityName removeAlternateEntityIdAt(
            final int index) {
        ScopedEntityName obj = this._alternateEntityIdList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateEntityId
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAlternateEntityId(
            final int index,
            final ScopedEntityName vAlternateEntityId)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateEntityIdList.size()) {
            throw new IndexOutOfBoundsException("setAlternateEntityId: Index value '" + index + "' not in range [0.." + (this._alternateEntityIdList.size() - 1) + "]");
        }

        this._alternateEntityIdList.set(index, vAlternateEntityId);
    }

    /**
     * 
     * 
     * @param vAlternateEntityIdArray
     */
    public void setAlternateEntityId(
            final ScopedEntityName[] vAlternateEntityIdArray) {
        //-- copy array
        _alternateEntityIdList.clear();

        Collections.addAll(this._alternateEntityIdList, vAlternateEntityIdArray);
    }

    /**
     * Sets the value of '_alternateEntityIdList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vAlternateEntityIdList the Vector to copy.
     */
    public void setAlternateEntityId(
            final java.util.List<ScopedEntityName> vAlternateEntityIdList) {
        // copy vector
        this._alternateEntityIdList.clear();

        this._alternateEntityIdList.addAll(vAlternateEntityIdList);
    }

    /**
     * Sets the value of '_alternateEntityIdList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param alternateEntityIdList the Vector to set.
     */
    public void setAlternateEntityIdAsReference(
            final java.util.List<ScopedEntityName> alternateEntityIdList) {
        this._alternateEntityIdList = alternateEntityIdList;
    }

    /**
     * Method unmarshalUpdatedAlternateEntityIds.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.entitydescription.UpdatedAlternateEntityIds
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
