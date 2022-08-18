/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.entitydescription;

import edu.mayo.cts2.framework.model.core.CodeSystemReference;
import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import edu.mayo.cts2.framework.model.core.VersionTagReference;
import edu.mayo.cts2.framework.model.service.core.BaseQueryService;
import java.util.Collections;

/**
 * Class EntityDescriptionQueryService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EntityDescriptionQueryService extends BaseQueryService
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _entities.
     */
    private String _entities;

    /**
     * Field _knownCodeSystemList.
     */
    private java.util.List<CodeSystemReference> _knownCodeSystemList;

    /**
     * Field _knownCodeSystemVersionList.
     */
    private java.util.List<CodeSystemVersionReference> _knownCodeSystemVersionList;

    /**
     * Field _supportedVersionTagList.
     */
    private java.util.List<VersionTagReference> _supportedVersionTagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityDescriptionQueryService() {
        super();
        this._knownCodeSystemList = new java.util.ArrayList<CodeSystemReference>();
        this._knownCodeSystemVersionList = new java.util.ArrayList<CodeSystemVersionReference>();
        this._supportedVersionTagList = new java.util.ArrayList<VersionTagReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vKnownCodeSystem
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownCodeSystem(
            final CodeSystemReference vKnownCodeSystem)
    throws IndexOutOfBoundsException {
        this._knownCodeSystemList.add(vKnownCodeSystem);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownCodeSystem
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownCodeSystem(
            final int index,
            final CodeSystemReference vKnownCodeSystem)
    throws IndexOutOfBoundsException {
        this._knownCodeSystemList.add(index, vKnownCodeSystem);
    }

    /**
     * 
     * 
     * @param vKnownCodeSystemVersion
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownCodeSystemVersion(
            final CodeSystemVersionReference vKnownCodeSystemVersion)
    throws IndexOutOfBoundsException {
        this._knownCodeSystemVersionList.add(vKnownCodeSystemVersion);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownCodeSystemVersion
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownCodeSystemVersion(
            final int index,
            final CodeSystemVersionReference vKnownCodeSystemVersion)
    throws IndexOutOfBoundsException {
        this._knownCodeSystemVersionList.add(index, vKnownCodeSystemVersion);
    }

    /**
     * 
     * 
     * @param vSupportedVersionTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedVersionTag(
            final VersionTagReference vSupportedVersionTag)
    throws IndexOutOfBoundsException {
        this._supportedVersionTagList.add(vSupportedVersionTag);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedVersionTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedVersionTag(
            final int index,
            final VersionTagReference vSupportedVersionTag)
    throws IndexOutOfBoundsException {
        this._supportedVersionTagList.add(index, vSupportedVersionTag);
    }

    /**
     * Method enumerateKnownCodeSystem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends CodeSystemReference> enumerateKnownCodeSystem(
    ) {
        return Collections.enumeration(this._knownCodeSystemList);
    }

    /**
     * Method enumerateKnownCodeSystemVersion.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends CodeSystemVersionReference> enumerateKnownCodeSystemVersion(
    ) {
        return Collections.enumeration(this._knownCodeSystemVersionList);
    }

    /**
     * Method enumerateSupportedVersionTag.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends VersionTagReference> enumerateSupportedVersionTag(
    ) {
        return Collections.enumeration(this._supportedVersionTagList);
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

        if (obj instanceof EntityDescriptionQueryService) {

            EntityDescriptionQueryService temp = (EntityDescriptionQueryService)obj;
            if (this._entities != null) {
                if (temp._entities == null) return false;
                if (!this._entities.equals(temp._entities)) 
                    return false;
            } else if (temp._entities != null)
                return false;
            if (this._knownCodeSystemList != null) {
                if (temp._knownCodeSystemList == null) return false;
                if (!this._knownCodeSystemList.equals(temp._knownCodeSystemList)) 
                    return false;
            } else if (temp._knownCodeSystemList != null)
                return false;
            if (this._knownCodeSystemVersionList != null) {
                if (temp._knownCodeSystemVersionList == null) return false;
                if (!this._knownCodeSystemVersionList.equals(temp._knownCodeSystemVersionList)) 
                    return false;
            } else if (temp._knownCodeSystemVersionList != null)
                return false;
            if (this._supportedVersionTagList != null) {
                if (temp._supportedVersionTagList == null) return false;
                return this._supportedVersionTagList.equals(temp._supportedVersionTagList);
            } else return temp._supportedVersionTagList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'entities'.
     * 
     * @return the value of field 'Entities'.
     */
    public String getEntities(
    ) {
        return this._entities;
    }

    /**
     * Method getKnownCodeSystem.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.CodeSystemReference at
     * the given index
     */
    public CodeSystemReference getKnownCodeSystem(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownCodeSystemList.size()) {
            throw new IndexOutOfBoundsException("getKnownCodeSystem: Index value '" + index + "' not in range [0.." + (this._knownCodeSystemList.size() - 1) + "]");
        }

        return _knownCodeSystemList.get(index);
    }

    /**
     * Method getKnownCodeSystem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public CodeSystemReference[] getKnownCodeSystem(
    ) {
        CodeSystemReference[] array = new CodeSystemReference[0];
        return this._knownCodeSystemList.toArray(array);
    }

    /**
     * Method getKnownCodeSystemAsReference.Returns a reference to
     * '_knownCodeSystemList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<CodeSystemReference> getKnownCodeSystemAsReference(
    ) {
        return this._knownCodeSystemList;
    }

    /**
     * Method getKnownCodeSystemCount.
     * 
     * @return the size of this collection
     */
    public int getKnownCodeSystemCount(
    ) {
        return this._knownCodeSystemList.size();
    }

    /**
     * Method getKnownCodeSystemVersion.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.CodeSystemVersionReference
     * at the given index
     */
    public CodeSystemVersionReference getKnownCodeSystemVersion(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownCodeSystemVersionList.size()) {
            throw new IndexOutOfBoundsException("getKnownCodeSystemVersion: Index value '" + index + "' not in range [0.." + (this._knownCodeSystemVersionList.size() - 1) + "]");
        }

        return _knownCodeSystemVersionList.get(index);
    }

    /**
     * Method getKnownCodeSystemVersion.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public CodeSystemVersionReference[] getKnownCodeSystemVersion(
    ) {
        CodeSystemVersionReference[] array = new CodeSystemVersionReference[0];
        return this._knownCodeSystemVersionList.toArray(array);
    }

    /**
     * Method getKnownCodeSystemVersionAsReference.Returns a
     * reference to '_knownCodeSystemVersionList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<CodeSystemVersionReference> getKnownCodeSystemVersionAsReference(
    ) {
        return this._knownCodeSystemVersionList;
    }

    /**
     * Method getKnownCodeSystemVersionCount.
     * 
     * @return the size of this collection
     */
    public int getKnownCodeSystemVersionCount(
    ) {
        return this._knownCodeSystemVersionList.size();
    }

    /**
     * Method getSupportedVersionTag.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.VersionTagReference at
     * the given index
     */
    public VersionTagReference getSupportedVersionTag(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedVersionTagList.size()) {
            throw new IndexOutOfBoundsException("getSupportedVersionTag: Index value '" + index + "' not in range [0.." + (this._supportedVersionTagList.size() - 1) + "]");
        }

        return _supportedVersionTagList.get(index);
    }

    /**
     * Method getSupportedVersionTag.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public VersionTagReference[] getSupportedVersionTag(
    ) {
        VersionTagReference[] array = new VersionTagReference[0];
        return this._supportedVersionTagList.toArray(array);
    }

    /**
     * Method getSupportedVersionTagAsReference.Returns a reference
     * to '_supportedVersionTagList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<VersionTagReference> getSupportedVersionTagAsReference(
    ) {
        return this._supportedVersionTagList;
    }

    /**
     * Method getSupportedVersionTagCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedVersionTagCount(
    ) {
        return this._supportedVersionTagList.size();
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
        if (_entities != null) {
           result = 37 * result + _entities.hashCode();
        }
        if (_knownCodeSystemList != null) {
           result = 37 * result + _knownCodeSystemList.hashCode();
        }
        if (_knownCodeSystemVersionList != null) {
           result = 37 * result + _knownCodeSystemVersionList.hashCode();
        }
        if (_supportedVersionTagList != null) {
           result = 37 * result + _supportedVersionTagList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateKnownCodeSystem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends CodeSystemReference> iterateKnownCodeSystem(
    ) {
        return this._knownCodeSystemList.iterator();
    }

    /**
     * Method iterateKnownCodeSystemVersion.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends CodeSystemVersionReference> iterateKnownCodeSystemVersion(
    ) {
        return this._knownCodeSystemVersionList.iterator();
    }

    /**
     * Method iterateSupportedVersionTag.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends VersionTagReference> iterateSupportedVersionTag(
    ) {
        return this._supportedVersionTagList.iterator();
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
    public void removeAllKnownCodeSystem(
    ) {
        this._knownCodeSystemList.clear();
    }

    /**
     */
    public void removeAllKnownCodeSystemVersion(
    ) {
        this._knownCodeSystemVersionList.clear();
    }

    /**
     */
    public void removeAllSupportedVersionTag(
    ) {
        this._supportedVersionTagList.clear();
    }

    /**
     * Method removeKnownCodeSystem.
     * 
     * @param vKnownCodeSystem
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownCodeSystem(
            final CodeSystemReference vKnownCodeSystem) {
        return _knownCodeSystemList.remove(vKnownCodeSystem);
    }

    /**
     * Method removeKnownCodeSystemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public CodeSystemReference removeKnownCodeSystemAt(
            final int index) {
        CodeSystemReference obj = this._knownCodeSystemList.remove(index);
        return obj;
    }

    /**
     * Method removeKnownCodeSystemVersion.
     * 
     * @param vKnownCodeSystemVersion
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownCodeSystemVersion(
            final CodeSystemVersionReference vKnownCodeSystemVersion) {
        return _knownCodeSystemVersionList.remove(vKnownCodeSystemVersion);
    }

    /**
     * Method removeKnownCodeSystemVersionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public CodeSystemVersionReference removeKnownCodeSystemVersionAt(
            final int index) {
        CodeSystemVersionReference obj = this._knownCodeSystemVersionList.remove(index);
        return obj;
    }

    /**
     * Method removeSupportedVersionTag.
     * 
     * @param vSupportedVersionTag
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedVersionTag(
            final VersionTagReference vSupportedVersionTag) {
        return _supportedVersionTagList.remove(vSupportedVersionTag);
    }

    /**
     * Method removeSupportedVersionTagAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public VersionTagReference removeSupportedVersionTagAt(
            final int index) {
        VersionTagReference obj = this._supportedVersionTagList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'entities'.
     * 
     * @param entities the value of field 'entities'.
     */
    public void setEntities(
            final String entities) {
        this._entities = entities;
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownCodeSystem
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownCodeSystem(
            final int index,
            final CodeSystemReference vKnownCodeSystem)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownCodeSystemList.size()) {
            throw new IndexOutOfBoundsException("setKnownCodeSystem: Index value '" + index + "' not in range [0.." + (this._knownCodeSystemList.size() - 1) + "]");
        }

        this._knownCodeSystemList.set(index, vKnownCodeSystem);
    }

    /**
     * 
     * 
     * @param vKnownCodeSystemArray
     */
    public void setKnownCodeSystem(
            final CodeSystemReference[] vKnownCodeSystemArray) {
        //-- copy array
        _knownCodeSystemList.clear();

        Collections.addAll(this._knownCodeSystemList, vKnownCodeSystemArray);
    }

    /**
     * Sets the value of '_knownCodeSystemList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vKnownCodeSystemList the Vector to copy.
     */
    public void setKnownCodeSystem(
            final java.util.List<CodeSystemReference> vKnownCodeSystemList) {
        // copy vector
        this._knownCodeSystemList.clear();

        this._knownCodeSystemList.addAll(vKnownCodeSystemList);
    }

    /**
     * Sets the value of '_knownCodeSystemList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownCodeSystemList the Vector to set.
     */
    public void setKnownCodeSystemAsReference(
            final java.util.List<CodeSystemReference> knownCodeSystemList) {
        this._knownCodeSystemList = knownCodeSystemList;
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownCodeSystemVersion
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownCodeSystemVersion(
            final int index,
            final CodeSystemVersionReference vKnownCodeSystemVersion)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownCodeSystemVersionList.size()) {
            throw new IndexOutOfBoundsException("setKnownCodeSystemVersion: Index value '" + index + "' not in range [0.." + (this._knownCodeSystemVersionList.size() - 1) + "]");
        }

        this._knownCodeSystemVersionList.set(index, vKnownCodeSystemVersion);
    }

    /**
     * 
     * 
     * @param vKnownCodeSystemVersionArray
     */
    public void setKnownCodeSystemVersion(
            final CodeSystemVersionReference[] vKnownCodeSystemVersionArray) {
        //-- copy array
        _knownCodeSystemVersionList.clear();

        Collections.addAll(this._knownCodeSystemVersionList, vKnownCodeSystemVersionArray);
    }

    /**
     * Sets the value of '_knownCodeSystemVersionList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vKnownCodeSystemVersionList the Vector to copy.
     */
    public void setKnownCodeSystemVersion(
            final java.util.List<CodeSystemVersionReference> vKnownCodeSystemVersionList) {
        // copy vector
        this._knownCodeSystemVersionList.clear();

        this._knownCodeSystemVersionList.addAll(vKnownCodeSystemVersionList);
    }

    /**
     * Sets the value of '_knownCodeSystemVersionList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownCodeSystemVersionList the Vector to set.
     */
    public void setKnownCodeSystemVersionAsReference(
            final java.util.List<CodeSystemVersionReference> knownCodeSystemVersionList) {
        this._knownCodeSystemVersionList = knownCodeSystemVersionList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedVersionTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedVersionTag(
            final int index,
            final VersionTagReference vSupportedVersionTag)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedVersionTagList.size()) {
            throw new IndexOutOfBoundsException("setSupportedVersionTag: Index value '" + index + "' not in range [0.." + (this._supportedVersionTagList.size() - 1) + "]");
        }

        this._supportedVersionTagList.set(index, vSupportedVersionTag);
    }

    /**
     * 
     * 
     * @param vSupportedVersionTagArray
     */
    public void setSupportedVersionTag(
            final VersionTagReference[] vSupportedVersionTagArray) {
        //-- copy array
        _supportedVersionTagList.clear();

        Collections.addAll(this._supportedVersionTagList, vSupportedVersionTagArray);
    }

    /**
     * Sets the value of '_supportedVersionTagList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedVersionTagList the Vector to copy.
     */
    public void setSupportedVersionTag(
            final java.util.List<VersionTagReference> vSupportedVersionTagList) {
        // copy vector
        this._supportedVersionTagList.clear();

        this._supportedVersionTagList.addAll(vSupportedVersionTagList);
    }

    /**
     * Sets the value of '_supportedVersionTagList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedVersionTagList the Vector to set.
     */
    public void setSupportedVersionTagAsReference(
            final java.util.List<VersionTagReference> supportedVersionTagList) {
        this._supportedVersionTagList = supportedVersionTagList;
    }

    /**
     * Method unmarshalEntityDescriptionQueryService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.entitydescription.EntityDescriptionQueryService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
