/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

import edu.mayo.cts2.framework.model.core.URIAndEntityName;
import java.util.Collections;

/**
 * a list of specific entity references that are to be included in
 * the definition. When specified in this form, the service must
 * include all entities in this list whether they are known to the
 * service or not, and
 *  whether they are currently ACTIVE or not.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SpecificEntityList extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the namespace / name or URI of an entity to be included
     */
    private java.util.List<URIAndEntityName> _referencedEntityList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SpecificEntityList() {
        super();
        this._referencedEntityList = new java.util.ArrayList<URIAndEntityName>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vReferencedEntity
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReferencedEntity(
            final URIAndEntityName vReferencedEntity)
    throws IndexOutOfBoundsException {
        this._referencedEntityList.add(vReferencedEntity);
    }

    /**
     * 
     * 
     * @param index
     * @param vReferencedEntity
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReferencedEntity(
            final int index,
            final URIAndEntityName vReferencedEntity)
    throws IndexOutOfBoundsException {
        this._referencedEntityList.add(index, vReferencedEntity);
    }

    /**
     * Method enumerateReferencedEntity.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends URIAndEntityName> enumerateReferencedEntity(
    ) {
        return Collections.enumeration(this._referencedEntityList);
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

        if (obj instanceof SpecificEntityList) {

            SpecificEntityList temp = (SpecificEntityList)obj;
            if (this._referencedEntityList != null) {
                if (temp._referencedEntityList == null) return false;
                return this._referencedEntityList.equals(temp._referencedEntityList);
            } else return temp._referencedEntityList == null;
        }
        return false;
    }

    /**
     * Method getReferencedEntity.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.URIAndEntityName at the
     * given index
     */
    public URIAndEntityName getReferencedEntity(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._referencedEntityList.size()) {
            throw new IndexOutOfBoundsException("getReferencedEntity: Index value '" + index + "' not in range [0.." + (this._referencedEntityList.size() - 1) + "]");
        }

        return _referencedEntityList.get(index);
    }

    /**
     * Method getReferencedEntity.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public URIAndEntityName[] getReferencedEntity(
    ) {
        URIAndEntityName[] array = new URIAndEntityName[0];
        return this._referencedEntityList.toArray(array);
    }

    /**
     * Method getReferencedEntityAsReference.Returns a reference to
     * '_referencedEntityList'. No type checking is performed on
     * any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<URIAndEntityName> getReferencedEntityAsReference(
    ) {
        return this._referencedEntityList;
    }

    /**
     * Method getReferencedEntityCount.
     * 
     * @return the size of this collection
     */
    public int getReferencedEntityCount(
    ) {
        return this._referencedEntityList.size();
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
        if (_referencedEntityList != null) {
           result = 37 * result + _referencedEntityList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateReferencedEntity.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends URIAndEntityName> iterateReferencedEntity(
    ) {
        return this._referencedEntityList.iterator();
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
    public void removeAllReferencedEntity(
    ) {
        this._referencedEntityList.clear();
    }

    /**
     * Method removeReferencedEntity.
     * 
     * @param vReferencedEntity
     * @return true if the object was removed from the collection.
     */
    public boolean removeReferencedEntity(
            final URIAndEntityName vReferencedEntity) {
        return _referencedEntityList.remove(vReferencedEntity);
    }

    /**
     * Method removeReferencedEntityAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public URIAndEntityName removeReferencedEntityAt(
            final int index) {
        URIAndEntityName obj = this._referencedEntityList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vReferencedEntity
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setReferencedEntity(
            final int index,
            final URIAndEntityName vReferencedEntity)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._referencedEntityList.size()) {
            throw new IndexOutOfBoundsException("setReferencedEntity: Index value '" + index + "' not in range [0.." + (this._referencedEntityList.size() - 1) + "]");
        }

        this._referencedEntityList.set(index, vReferencedEntity);
    }

    /**
     * 
     * 
     * @param vReferencedEntityArray
     */
    public void setReferencedEntity(
            final URIAndEntityName[] vReferencedEntityArray) {
        //-- copy array
        _referencedEntityList.clear();

        Collections.addAll(this._referencedEntityList, vReferencedEntityArray);
    }

    /**
     * Sets the value of '_referencedEntityList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vReferencedEntityList the Vector to copy.
     */
    public void setReferencedEntity(
            final java.util.List<URIAndEntityName> vReferencedEntityList) {
        // copy vector
        this._referencedEntityList.clear();

        this._referencedEntityList.addAll(vReferencedEntityList);
    }

    /**
     * Sets the value of '_referencedEntityList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param referencedEntityList the Vector to set.
     */
    public void setReferencedEntityAsReference(
            final java.util.List<URIAndEntityName> referencedEntityList) {
        this._referencedEntityList = referencedEntityList;
    }

    /**
     * Method unmarshalSpecificEntityList.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.SpecificEntityList
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
