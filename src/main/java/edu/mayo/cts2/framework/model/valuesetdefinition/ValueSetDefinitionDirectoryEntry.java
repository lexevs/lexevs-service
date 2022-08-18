/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

import edu.mayo.cts2.framework.model.core.VersionTagReference;
import java.util.Collections;

/**
 * A synopsis of a ValueSetDefinition along with information about
 * how to access the complete resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetDefinitionDirectoryEntry extends edu.mayo.cts2.framework.model.core.ResourceVersionDescriptionDirectoryEntry 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the value set that this definition applies to
     */
    private edu.mayo.cts2.framework.model.core.ValueSetReference _definedValueSet;

    /**
     * a version tag assigned to this entry by the service instance
     */
    private java.util.List<VersionTagReference> _versionTagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetDefinitionDirectoryEntry() {
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

        if (obj instanceof ValueSetDefinitionDirectoryEntry) {

            ValueSetDefinitionDirectoryEntry temp = (ValueSetDefinitionDirectoryEntry)obj;
            if (this._definedValueSet != null) {
                if (temp._definedValueSet == null) return false;
                if (!this._definedValueSet.equals(temp._definedValueSet)) 
                    return false;
            } else if (temp._definedValueSet != null)
                return false;
            if (this._versionTagList != null) {
                if (temp._versionTagList == null) return false;
                return this._versionTagList.equals(temp._versionTagList);
            } else return temp._versionTagList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'definedValueSet'. The field
     * 'definedValueSet' has the following description: the value
     * set that this definition applies to
     * 
     * @return the value of field 'DefinedValueSet'.
     */
    public edu.mayo.cts2.framework.model.core.ValueSetReference getDefinedValueSet(
    ) {
        return this._definedValueSet;
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
        if (_definedValueSet != null) {
           result = 37 * result + _definedValueSet.hashCode();
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
     * Sets the value of field 'definedValueSet'. The field
     * 'definedValueSet' has the following description: the value
     * set that this definition applies to
     * 
     * @param definedValueSet the value of field 'definedValueSet'.
     */
    public void setDefinedValueSet(
            final edu.mayo.cts2.framework.model.core.ValueSetReference definedValueSet) {
        this._definedValueSet = definedValueSet;
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
     * Method unmarshalValueSetDefinitionDirectoryEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.ValueSetDefinitionDirectoryEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
