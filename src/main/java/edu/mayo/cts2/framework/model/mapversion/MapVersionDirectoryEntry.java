/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.mapversion;

import edu.mayo.cts2.framework.model.core.VersionTagReference;
import java.util.Collections;

/**
 * A synopsis of a MapVersion along with information about how to
 * access the complete resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapVersionDirectoryEntry extends edu.mayo.cts2.framework.model.core.ResourceVersionDescriptionDirectoryEntry 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a name that uniquely identifies the map version within the
     * context of the service
     */
    private String _mapVersionName;

    /**
     * a reference to the map that this is a version of
     */
    private edu.mayo.cts2.framework.model.core.MapReference _versionOf;

    /**
     * a reference to a version tag assigned to this entry by the
     * implementing service
     */
    private java.util.List<VersionTagReference> _versionTagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapVersionDirectoryEntry() {
        super();
        this._versionTagList = new java.util.ArrayList<VersionTagReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vVersionTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVersionTag(
            final VersionTagReference vVersionTag)
    throws IndexOutOfBoundsException {
        this._versionTagList.add(vVersionTag);
    }

    /**
     * 
     * 
     * @param index
     * @param vVersionTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVersionTag(
            final int index,
            final VersionTagReference vVersionTag)
    throws IndexOutOfBoundsException {
        this._versionTagList.add(index, vVersionTag);
    }

    /**
     * Method enumerateVersionTag.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends VersionTagReference> enumerateVersionTag(
    ) {
        return Collections.enumeration(this._versionTagList);
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

        if (obj instanceof MapVersionDirectoryEntry) {

            MapVersionDirectoryEntry temp = (MapVersionDirectoryEntry)obj;
            if (this._mapVersionName != null) {
                if (temp._mapVersionName == null) return false;
                if (!this._mapVersionName.equals(temp._mapVersionName)) 
                    return false;
            } else if (temp._mapVersionName != null)
                return false;
            if (this._versionOf != null) {
                if (temp._versionOf == null) return false;
                if (!this._versionOf.equals(temp._versionOf)) 
                    return false;
            } else if (temp._versionOf != null)
                return false;
            if (this._versionTagList != null) {
                if (temp._versionTagList == null) return false;
                return this._versionTagList.equals(temp._versionTagList);
            } else return temp._versionTagList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'mapVersionName'. The field
     * 'mapVersionName' has the following description: a name that
     * uniquely identifies the map version within the context of
     * the service
     * 
     * @return the value of field 'MapVersionName'.
     */
    public String getMapVersionName(
    ) {
        return this._mapVersionName;
    }

    /**
     * Returns the value of field 'versionOf'. The field
     * 'versionOf' has the following description: a reference to
     * the map that this is a version of
     * 
     * @return the value of field 'VersionOf'.
     */
    public edu.mayo.cts2.framework.model.core.MapReference getVersionOf(
    ) {
        return this._versionOf;
    }

    /**
     * Method getVersionTag.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.VersionTagReference at
     * the given index
     */
    public VersionTagReference getVersionTag(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._versionTagList.size()) {
            throw new IndexOutOfBoundsException("getVersionTag: Index value '" + index + "' not in range [0.." + (this._versionTagList.size() - 1) + "]");
        }

        return _versionTagList.get(index);
    }

    /**
     * Method getVersionTag.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public VersionTagReference[] getVersionTag(
    ) {
        VersionTagReference[] array = new VersionTagReference[0];
        return this._versionTagList.toArray(array);
    }

    /**
     * Method getVersionTagAsReference.Returns a reference to
     * '_versionTagList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<VersionTagReference> getVersionTagAsReference(
    ) {
        return this._versionTagList;
    }

    /**
     * Method getVersionTagCount.
     * 
     * @return the size of this collection
     */
    public int getVersionTagCount(
    ) {
        return this._versionTagList.size();
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
        if (_mapVersionName != null) {
           result = 37 * result + _mapVersionName.hashCode();
        }
        if (_versionOf != null) {
           result = 37 * result + _versionOf.hashCode();
        }
        if (_versionTagList != null) {
           result = 37 * result + _versionTagList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateVersionTag.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends VersionTagReference> iterateVersionTag(
    ) {
        return this._versionTagList.iterator();
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
    public void removeAllVersionTag(
    ) {
        this._versionTagList.clear();
    }

    /**
     * Method removeVersionTag.
     * 
     * @param vVersionTag
     * @return true if the object was removed from the collection.
     */
    public boolean removeVersionTag(
            final VersionTagReference vVersionTag) {
        return _versionTagList.remove(vVersionTag);
    }

    /**
     * Method removeVersionTagAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public VersionTagReference removeVersionTagAt(
            final int index) {
        VersionTagReference obj = this._versionTagList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'mapVersionName'. The field
     * 'mapVersionName' has the following description: a name that
     * uniquely identifies the map version within the context of
     * the service
     * 
     * @param mapVersionName the value of field 'mapVersionName'.
     */
    public void setMapVersionName(
            final String mapVersionName) {
        this._mapVersionName = mapVersionName;
    }

    /**
     * Sets the value of field 'versionOf'. The field 'versionOf'
     * has the following description: a reference to the map that
     * this is a version of
     * 
     * @param versionOf the value of field 'versionOf'.
     */
    public void setVersionOf(
            final edu.mayo.cts2.framework.model.core.MapReference versionOf) {
        this._versionOf = versionOf;
    }

    /**
     * 
     * 
     * @param index
     * @param vVersionTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setVersionTag(
            final int index,
            final VersionTagReference vVersionTag)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._versionTagList.size()) {
            throw new IndexOutOfBoundsException("setVersionTag: Index value '" + index + "' not in range [0.." + (this._versionTagList.size() - 1) + "]");
        }

        this._versionTagList.set(index, vVersionTag);
    }

    /**
     * 
     * 
     * @param vVersionTagArray
     */
    public void setVersionTag(
            final VersionTagReference[] vVersionTagArray) {
        //-- copy array
        _versionTagList.clear();

        Collections.addAll(this._versionTagList, vVersionTagArray);
    }

    /**
     * Sets the value of '_versionTagList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vVersionTagList the Vector to copy.
     */
    public void setVersionTag(
            final java.util.List<VersionTagReference> vVersionTagList) {
        // copy vector
        this._versionTagList.clear();

        this._versionTagList.addAll(vVersionTagList);
    }

    /**
     * Sets the value of '_versionTagList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param versionTagList the Vector to set.
     */
    public void setVersionTagAsReference(
            final java.util.List<VersionTagReference> versionTagList) {
        this._versionTagList = versionTagList;
    }

    /**
     * Method unmarshalMapVersionDirectoryEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.mapversion.MapVersionDirectoryEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
