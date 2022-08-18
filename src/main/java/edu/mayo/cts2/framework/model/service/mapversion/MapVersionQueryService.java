/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapversion;

import edu.mayo.cts2.framework.model.core.CodeSystemReference;
import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference;
import edu.mayo.cts2.framework.model.core.ValueSetReference;
import edu.mayo.cts2.framework.model.core.VersionTagReference;
import java.util.Collections;

/**
 * Class MapVersionQueryService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapVersionQueryService extends edu.mayo.cts2.framework.model.service.core.BaseQueryService 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mapVersions.
     */
    private String _mapVersions;

    /**
     * Field _knownCodeSystemList.
     */
    private java.util.List<CodeSystemReference> _knownCodeSystemList;

    /**
     * Field _knownCodeSystemVersionList.
     */
    private java.util.List<CodeSystemVersionReference> _knownCodeSystemVersionList;

    /**
     * Field _knownValueSetList.
     */
    private java.util.List<ValueSetReference> _knownValueSetList;

    /**
     * Field _knownValueSetDefinitionList.
     */
    private java.util.List<ValueSetDefinitionReference> _knownValueSetDefinitionList;

    /**
     * Field _supportedTagList.
     */
    private java.util.List<VersionTagReference> _supportedTagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapVersionQueryService() {
        super();
        this._knownCodeSystemList = new java.util.ArrayList<CodeSystemReference>();
        this._knownCodeSystemVersionList = new java.util.ArrayList<CodeSystemVersionReference>();
        this._knownValueSetList = new java.util.ArrayList<ValueSetReference>();
        this._knownValueSetDefinitionList = new java.util.ArrayList<ValueSetDefinitionReference>();
        this._supportedTagList = new java.util.ArrayList<VersionTagReference>();
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
     * @param vKnownValueSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownValueSet(
            final ValueSetReference vKnownValueSet)
    throws IndexOutOfBoundsException {
        this._knownValueSetList.add(vKnownValueSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownValueSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownValueSet(
            final int index,
            final ValueSetReference vKnownValueSet)
    throws IndexOutOfBoundsException {
        this._knownValueSetList.add(index, vKnownValueSet);
    }

    /**
     * 
     * 
     * @param vKnownValueSetDefinition
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownValueSetDefinition(
            final ValueSetDefinitionReference vKnownValueSetDefinition)
    throws IndexOutOfBoundsException {
        this._knownValueSetDefinitionList.add(vKnownValueSetDefinition);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownValueSetDefinition
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownValueSetDefinition(
            final int index,
            final ValueSetDefinitionReference vKnownValueSetDefinition)
    throws IndexOutOfBoundsException {
        this._knownValueSetDefinitionList.add(index, vKnownValueSetDefinition);
    }

    /**
     * 
     * 
     * @param vSupportedTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedTag(
            final VersionTagReference vSupportedTag)
    throws IndexOutOfBoundsException {
        this._supportedTagList.add(vSupportedTag);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedTag(
            final int index,
            final VersionTagReference vSupportedTag)
    throws IndexOutOfBoundsException {
        this._supportedTagList.add(index, vSupportedTag);
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
     * Method enumerateKnownValueSet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ValueSetReference> enumerateKnownValueSet(
    ) {
        return Collections.enumeration(this._knownValueSetList);
    }

    /**
     * Method enumerateKnownValueSetDefinition.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ValueSetDefinitionReference> enumerateKnownValueSetDefinition(
    ) {
        return Collections.enumeration(this._knownValueSetDefinitionList);
    }

    /**
     * Method enumerateSupportedTag.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends VersionTagReference> enumerateSupportedTag(
    ) {
        return Collections.enumeration(this._supportedTagList);
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

        if (obj instanceof MapVersionQueryService) {

            MapVersionQueryService temp = (MapVersionQueryService)obj;
            if (this._mapVersions != null) {
                if (temp._mapVersions == null) return false;
                if (!this._mapVersions.equals(temp._mapVersions)) 
                    return false;
            } else if (temp._mapVersions != null)
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
            if (this._knownValueSetList != null) {
                if (temp._knownValueSetList == null) return false;
                if (!this._knownValueSetList.equals(temp._knownValueSetList)) 
                    return false;
            } else if (temp._knownValueSetList != null)
                return false;
            if (this._knownValueSetDefinitionList != null) {
                if (temp._knownValueSetDefinitionList == null) return false;
                if (!this._knownValueSetDefinitionList.equals(temp._knownValueSetDefinitionList)) 
                    return false;
            } else if (temp._knownValueSetDefinitionList != null)
                return false;
            if (this._supportedTagList != null) {
                if (temp._supportedTagList == null) return false;
                return this._supportedTagList.equals(temp._supportedTagList);
            } else return temp._supportedTagList == null;
        }
        return false;
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
     * Method getKnownValueSet.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.ValueSetReference at the
     * given index
     */
    public ValueSetReference getKnownValueSet(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownValueSetList.size()) {
            throw new IndexOutOfBoundsException("getKnownValueSet: Index value '" + index + "' not in range [0.." + (this._knownValueSetList.size() - 1) + "]");
        }

        return _knownValueSetList.get(index);
    }

    /**
     * Method getKnownValueSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ValueSetReference[] getKnownValueSet(
    ) {
        ValueSetReference[] array = new ValueSetReference[0];
        return this._knownValueSetList.toArray(array);
    }

    /**
     * Method getKnownValueSetAsReference.Returns a reference to
     * '_knownValueSetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ValueSetReference> getKnownValueSetAsReference(
    ) {
        return this._knownValueSetList;
    }

    /**
     * Method getKnownValueSetCount.
     * 
     * @return the size of this collection
     */
    public int getKnownValueSetCount(
    ) {
        return this._knownValueSetList.size();
    }

    /**
     * Method getKnownValueSetDefinition.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference
     * at the given index
     */
    public ValueSetDefinitionReference getKnownValueSetDefinition(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownValueSetDefinitionList.size()) {
            throw new IndexOutOfBoundsException("getKnownValueSetDefinition: Index value '" + index + "' not in range [0.." + (this._knownValueSetDefinitionList.size() - 1) + "]");
        }

        return _knownValueSetDefinitionList.get(index);
    }

    /**
     * Method getKnownValueSetDefinition.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ValueSetDefinitionReference[] getKnownValueSetDefinition(
    ) {
        ValueSetDefinitionReference[] array = new ValueSetDefinitionReference[0];
        return this._knownValueSetDefinitionList.toArray(array);
    }

    /**
     * Method getKnownValueSetDefinitionAsReference.Returns a
     * reference to '_knownValueSetDefinitionList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ValueSetDefinitionReference> getKnownValueSetDefinitionAsReference(
    ) {
        return this._knownValueSetDefinitionList;
    }

    /**
     * Method getKnownValueSetDefinitionCount.
     * 
     * @return the size of this collection
     */
    public int getKnownValueSetDefinitionCount(
    ) {
        return this._knownValueSetDefinitionList.size();
    }

    /**
     * Returns the value of field 'mapVersions'.
     * 
     * @return the value of field 'MapVersions'.
     */
    public String getMapVersions(
    ) {
        return this._mapVersions;
    }

    /**
     * Method getSupportedTag.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.VersionTagReference at
     * the given index
     */
    public VersionTagReference getSupportedTag(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedTagList.size()) {
            throw new IndexOutOfBoundsException("getSupportedTag: Index value '" + index + "' not in range [0.." + (this._supportedTagList.size() - 1) + "]");
        }

        return _supportedTagList.get(index);
    }

    /**
     * Method getSupportedTag.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public VersionTagReference[] getSupportedTag(
    ) {
        VersionTagReference[] array = new VersionTagReference[0];
        return this._supportedTagList.toArray(array);
    }

    /**
     * Method getSupportedTagAsReference.Returns a reference to
     * '_supportedTagList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<VersionTagReference> getSupportedTagAsReference(
    ) {
        return this._supportedTagList;
    }

    /**
     * Method getSupportedTagCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedTagCount(
    ) {
        return this._supportedTagList.size();
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
        if (_mapVersions != null) {
           result = 37 * result + _mapVersions.hashCode();
        }
        if (_knownCodeSystemList != null) {
           result = 37 * result + _knownCodeSystemList.hashCode();
        }
        if (_knownCodeSystemVersionList != null) {
           result = 37 * result + _knownCodeSystemVersionList.hashCode();
        }
        if (_knownValueSetList != null) {
           result = 37 * result + _knownValueSetList.hashCode();
        }
        if (_knownValueSetDefinitionList != null) {
           result = 37 * result + _knownValueSetDefinitionList.hashCode();
        }
        if (_supportedTagList != null) {
           result = 37 * result + _supportedTagList.hashCode();
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
     * Method iterateKnownValueSet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ValueSetReference> iterateKnownValueSet(
    ) {
        return this._knownValueSetList.iterator();
    }

    /**
     * Method iterateKnownValueSetDefinition.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ValueSetDefinitionReference> iterateKnownValueSetDefinition(
    ) {
        return this._knownValueSetDefinitionList.iterator();
    }

    /**
     * Method iterateSupportedTag.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends VersionTagReference> iterateSupportedTag(
    ) {
        return this._supportedTagList.iterator();
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
    public void removeAllKnownValueSet(
    ) {
        this._knownValueSetList.clear();
    }

    /**
     */
    public void removeAllKnownValueSetDefinition(
    ) {
        this._knownValueSetDefinitionList.clear();
    }

    /**
     */
    public void removeAllSupportedTag(
    ) {
        this._supportedTagList.clear();
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
     * Method removeKnownValueSet.
     * 
     * @param vKnownValueSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownValueSet(
            final ValueSetReference vKnownValueSet) {
        return _knownValueSetList.remove(vKnownValueSet);
    }

    /**
     * Method removeKnownValueSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ValueSetReference removeKnownValueSetAt(
            final int index) {
        ValueSetReference obj = this._knownValueSetList.remove(index);
        return obj;
    }

    /**
     * Method removeKnownValueSetDefinition.
     * 
     * @param vKnownValueSetDefinition
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownValueSetDefinition(
            final ValueSetDefinitionReference vKnownValueSetDefinition) {
        return _knownValueSetDefinitionList.remove(vKnownValueSetDefinition);
    }

    /**
     * Method removeKnownValueSetDefinitionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ValueSetDefinitionReference removeKnownValueSetDefinitionAt(
            final int index) {
        ValueSetDefinitionReference obj = this._knownValueSetDefinitionList.remove(index);
        return obj;
    }

    /**
     * Method removeSupportedTag.
     * 
     * @param vSupportedTag
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedTag(
            final VersionTagReference vSupportedTag) {
        return _supportedTagList.remove(vSupportedTag);
    }

    /**
     * Method removeSupportedTagAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public VersionTagReference removeSupportedTagAt(
            final int index) {
        VersionTagReference obj = this._supportedTagList.remove(index);
        return obj;
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
     * @param vKnownValueSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownValueSet(
            final int index,
            final ValueSetReference vKnownValueSet)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownValueSetList.size()) {
            throw new IndexOutOfBoundsException("setKnownValueSet: Index value '" + index + "' not in range [0.." + (this._knownValueSetList.size() - 1) + "]");
        }

        this._knownValueSetList.set(index, vKnownValueSet);
    }

    /**
     * 
     * 
     * @param vKnownValueSetArray
     */
    public void setKnownValueSet(
            final ValueSetReference[] vKnownValueSetArray) {
        //-- copy array
        _knownValueSetList.clear();

        Collections.addAll(this._knownValueSetList, vKnownValueSetArray);
    }

    /**
     * Sets the value of '_knownValueSetList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vKnownValueSetList the Vector to copy.
     */
    public void setKnownValueSet(
            final java.util.List<ValueSetReference> vKnownValueSetList) {
        // copy vector
        this._knownValueSetList.clear();

        this._knownValueSetList.addAll(vKnownValueSetList);
    }

    /**
     * Sets the value of '_knownValueSetList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownValueSetList the Vector to set.
     */
    public void setKnownValueSetAsReference(
            final java.util.List<ValueSetReference> knownValueSetList) {
        this._knownValueSetList = knownValueSetList;
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownValueSetDefinition
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownValueSetDefinition(
            final int index,
            final ValueSetDefinitionReference vKnownValueSetDefinition)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownValueSetDefinitionList.size()) {
            throw new IndexOutOfBoundsException("setKnownValueSetDefinition: Index value '" + index + "' not in range [0.." + (this._knownValueSetDefinitionList.size() - 1) + "]");
        }

        this._knownValueSetDefinitionList.set(index, vKnownValueSetDefinition);
    }

    /**
     * 
     * 
     * @param vKnownValueSetDefinitionArray
     */
    public void setKnownValueSetDefinition(
            final ValueSetDefinitionReference[] vKnownValueSetDefinitionArray) {
        //-- copy array
        _knownValueSetDefinitionList.clear();

        Collections.addAll(this._knownValueSetDefinitionList, vKnownValueSetDefinitionArray);
    }

    /**
     * Sets the value of '_knownValueSetDefinitionList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vKnownValueSetDefinitionList the Vector to copy.
     */
    public void setKnownValueSetDefinition(
            final java.util.List<ValueSetDefinitionReference> vKnownValueSetDefinitionList) {
        // copy vector
        this._knownValueSetDefinitionList.clear();

        this._knownValueSetDefinitionList.addAll(vKnownValueSetDefinitionList);
    }

    /**
     * Sets the value of '_knownValueSetDefinitionList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownValueSetDefinitionList the Vector to set.
     */
    public void setKnownValueSetDefinitionAsReference(
            final java.util.List<ValueSetDefinitionReference> knownValueSetDefinitionList) {
        this._knownValueSetDefinitionList = knownValueSetDefinitionList;
    }

    /**
     * Sets the value of field 'mapVersions'.
     * 
     * @param mapVersions the value of field 'mapVersions'.
     */
    public void setMapVersions(
            final String mapVersions) {
        this._mapVersions = mapVersions;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedTag(
            final int index,
            final VersionTagReference vSupportedTag)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedTagList.size()) {
            throw new IndexOutOfBoundsException("setSupportedTag: Index value '" + index + "' not in range [0.." + (this._supportedTagList.size() - 1) + "]");
        }

        this._supportedTagList.set(index, vSupportedTag);
    }

    /**
     * 
     * 
     * @param vSupportedTagArray
     */
    public void setSupportedTag(
            final VersionTagReference[] vSupportedTagArray) {
        //-- copy array
        _supportedTagList.clear();

        Collections.addAll(this._supportedTagList, vSupportedTagArray);
    }

    /**
     * Sets the value of '_supportedTagList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedTagList the Vector to copy.
     */
    public void setSupportedTag(
            final java.util.List<VersionTagReference> vSupportedTagList) {
        // copy vector
        this._supportedTagList.clear();

        this._supportedTagList.addAll(vSupportedTagList);
    }

    /**
     * Sets the value of '_supportedTagList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedTagList the Vector to set.
     */
    public void setSupportedTagAsReference(
            final java.util.List<VersionTagReference> supportedTagList) {
        this._supportedTagList = supportedTagList;
    }

    /**
     * Method unmarshalMapVersionQueryService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapversion.MapVersionQueryService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
