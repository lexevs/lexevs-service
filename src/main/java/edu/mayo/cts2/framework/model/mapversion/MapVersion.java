/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.mapversion;

import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import edu.mayo.cts2.framework.model.core.ContextReference;
import edu.mayo.cts2.framework.model.core.VersionTagReference;
import java.util.Collections;

/**
 * A specific version of a Map. MapVersion is bound to specific
 * code system versions and/or value set versions and references a
 * set of mapping entries (mapSet) that, if the resource is FINAL,
 *  are fixed with respect to this version.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapVersion extends edu.mayo.cts2.framework.model.core.ResourceVersionDescription 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a local identifier that uniquely names this version within
     * the context of the CTS2 service implementation
     */
    private String _mapVersionName;

    /**
     * a reference to the Map resource that this is a version of
     */
    private edu.mayo.cts2.framework.model.core.MapReference _versionOf;

    /**
     * the specific value set definition that was used to resolve
     * the from entities in this map
     */
    private edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference _fromValueSetDefinition;

    /**
     * the specific code system version that provided the from
     * entities in this map
     */
    private CodeSystemVersionReference _fromCodeSystemVersion;

    /**
     * the specific value set definition that was used to resolve
     * the to entities in this map
     */
    private edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference _toValueSetDefinition;

    /**
     * the specific code system version that provided the to
     * entities in this map
     */
    private CodeSystemVersionReference _toCodeSystemVersion;

    /**
     * a list of code system versions that should be used in the
     * resolution of \\ fromValueSetDefinition and/or
     * toValueSetDefinition. If present, this states that, for
     * these code systems,
     *  these specific versions are to be used.
     */
    private java.util.List<CodeSystemVersionReference> _useCodeSystemVersionList;

    /**
     * references to the realm, context or other external factor
     * that determines the applicability of this particular map
     * version
     */
    private java.util.List<ContextReference> _applicableContextList;

    /**
     * a version tag assigned to this MapVersion instance by the
     * implementing service
     */
    private java.util.List<VersionTagReference> _versionTagList;

    /**
     * a DirectoryURI that resolves to the set of MapEntries that
     * are contained in this MapVersion.
     */
    private String _entries;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapVersion() {
        super();
        this._useCodeSystemVersionList = new java.util.ArrayList<CodeSystemVersionReference>();
        this._applicableContextList = new java.util.ArrayList<ContextReference>();
        this._versionTagList = new java.util.ArrayList<VersionTagReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vApplicableContext
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addApplicableContext(
            final ContextReference vApplicableContext)
    throws IndexOutOfBoundsException {
        this._applicableContextList.add(vApplicableContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vApplicableContext
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addApplicableContext(
            final int index,
            final ContextReference vApplicableContext)
    throws IndexOutOfBoundsException {
        this._applicableContextList.add(index, vApplicableContext);
    }

    /**
     * 
     * 
     * @param vUseCodeSystemVersion
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUseCodeSystemVersion(
            final CodeSystemVersionReference vUseCodeSystemVersion)
    throws IndexOutOfBoundsException {
        this._useCodeSystemVersionList.add(vUseCodeSystemVersion);
    }

    /**
     * 
     * 
     * @param index
     * @param vUseCodeSystemVersion
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUseCodeSystemVersion(
            final int index,
            final CodeSystemVersionReference vUseCodeSystemVersion)
    throws IndexOutOfBoundsException {
        this._useCodeSystemVersionList.add(index, vUseCodeSystemVersion);
    }

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
     * Method enumerateApplicableContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ContextReference> enumerateApplicableContext(
    ) {
        return Collections.enumeration(this._applicableContextList);
    }

    /**
     * Method enumerateUseCodeSystemVersion.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends CodeSystemVersionReference> enumerateUseCodeSystemVersion(
    ) {
        return Collections.enumeration(this._useCodeSystemVersionList);
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

        if (obj instanceof MapVersion) {

            MapVersion temp = (MapVersion)obj;
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
            if (this._fromValueSetDefinition != null) {
                if (temp._fromValueSetDefinition == null) return false;
                if (!this._fromValueSetDefinition.equals(temp._fromValueSetDefinition)) 
                    return false;
            } else if (temp._fromValueSetDefinition != null)
                return false;
            if (this._fromCodeSystemVersion != null) {
                if (temp._fromCodeSystemVersion == null) return false;
                if (!this._fromCodeSystemVersion.equals(temp._fromCodeSystemVersion)) 
                    return false;
            } else if (temp._fromCodeSystemVersion != null)
                return false;
            if (this._toValueSetDefinition != null) {
                if (temp._toValueSetDefinition == null) return false;
                if (!this._toValueSetDefinition.equals(temp._toValueSetDefinition)) 
                    return false;
            } else if (temp._toValueSetDefinition != null)
                return false;
            if (this._toCodeSystemVersion != null) {
                if (temp._toCodeSystemVersion == null) return false;
                if (!this._toCodeSystemVersion.equals(temp._toCodeSystemVersion)) 
                    return false;
            } else if (temp._toCodeSystemVersion != null)
                return false;
            if (this._useCodeSystemVersionList != null) {
                if (temp._useCodeSystemVersionList == null) return false;
                if (!this._useCodeSystemVersionList.equals(temp._useCodeSystemVersionList)) 
                    return false;
            } else if (temp._useCodeSystemVersionList != null)
                return false;
            if (this._applicableContextList != null) {
                if (temp._applicableContextList == null) return false;
                if (!this._applicableContextList.equals(temp._applicableContextList)) 
                    return false;
            } else if (temp._applicableContextList != null)
                return false;
            if (this._versionTagList != null) {
                if (temp._versionTagList == null) return false;
                if (!this._versionTagList.equals(temp._versionTagList)) 
                    return false;
            } else if (temp._versionTagList != null)
                return false;
            if (this._entries != null) {
                if (temp._entries == null) return false;
                return this._entries.equals(temp._entries);
            } else return temp._entries == null;
        }
        return false;
    }

    /**
     * Method getApplicableContext.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.ContextReference at the
     * given index
     */
    public ContextReference getApplicableContext(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._applicableContextList.size()) {
            throw new IndexOutOfBoundsException("getApplicableContext: Index value '" + index + "' not in range [0.." + (this._applicableContextList.size() - 1) + "]");
        }

        return _applicableContextList.get(index);
    }

    /**
     * Method getApplicableContext.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ContextReference[] getApplicableContext(
    ) {
        ContextReference[] array = new ContextReference[0];
        return this._applicableContextList.toArray(array);
    }

    /**
     * Method getApplicableContextAsReference.Returns a reference
     * to '_applicableContextList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ContextReference> getApplicableContextAsReference(
    ) {
        return this._applicableContextList;
    }

    /**
     * Method getApplicableContextCount.
     * 
     * @return the size of this collection
     */
    public int getApplicableContextCount(
    ) {
        return this._applicableContextList.size();
    }

    /**
     * Returns the value of field 'entries'. The field 'entries'
     * has the following description: a DirectoryURI that resolves
     * to the set of MapEntries that are contained in this
     * MapVersion.
     * 
     * @return the value of field 'Entries'.
     */
    public String getEntries(
    ) {
        return this._entries;
    }

    /**
     * Returns the value of field 'fromCodeSystemVersion'. The
     * field 'fromCodeSystemVersion' has the following description:
     * the specific code system version that provided the from
     * entities in this map
     * 
     * @return the value of field 'FromCodeSystemVersion'.
     */
    public CodeSystemVersionReference getFromCodeSystemVersion(
    ) {
        return this._fromCodeSystemVersion;
    }

    /**
     * Returns the value of field 'fromValueSetDefinition'. The
     * field 'fromValueSetDefinition' has the following
     * description: the specific value set definition that was used
     * to resolve the from entities in this map
     * 
     * @return the value of field 'FromValueSetDefinition'.
     */
    public edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference getFromValueSetDefinition(
    ) {
        return this._fromValueSetDefinition;
    }

    /**
     * Returns the value of field 'mapVersionName'. The field
     * 'mapVersionName' has the following description: a local
     * identifier that uniquely names this version within the
     * context of the CTS2 service implementation
     * 
     * @return the value of field 'MapVersionName'.
     */
    public String getMapVersionName(
    ) {
        return this._mapVersionName;
    }

    /**
     * Returns the value of field 'toCodeSystemVersion'. The field
     * 'toCodeSystemVersion' has the following description: the
     * specific code system version that provided the to entities
     * in this map
     * 
     * @return the value of field 'ToCodeSystemVersion'.
     */
    public CodeSystemVersionReference getToCodeSystemVersion(
    ) {
        return this._toCodeSystemVersion;
    }

    /**
     * Returns the value of field 'toValueSetDefinition'. The field
     * 'toValueSetDefinition' has the following description: the
     * specific value set definition that was used to resolve the
     * to entities in this map
     * 
     * @return the value of field 'ToValueSetDefinition'.
     */
    public edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference getToValueSetDefinition(
    ) {
        return this._toValueSetDefinition;
    }

    /**
     * Method getUseCodeSystemVersion.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.CodeSystemVersionReference
     * at the given index
     */
    public CodeSystemVersionReference getUseCodeSystemVersion(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._useCodeSystemVersionList.size()) {
            throw new IndexOutOfBoundsException("getUseCodeSystemVersion: Index value '" + index + "' not in range [0.." + (this._useCodeSystemVersionList.size() - 1) + "]");
        }

        return _useCodeSystemVersionList.get(index);
    }

    /**
     * Method getUseCodeSystemVersion.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public CodeSystemVersionReference[] getUseCodeSystemVersion(
    ) {
        CodeSystemVersionReference[] array = new CodeSystemVersionReference[0];
        return this._useCodeSystemVersionList.toArray(array);
    }

    /**
     * Method getUseCodeSystemVersionAsReference.Returns a
     * reference to '_useCodeSystemVersionList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<CodeSystemVersionReference> getUseCodeSystemVersionAsReference(
    ) {
        return this._useCodeSystemVersionList;
    }

    /**
     * Method getUseCodeSystemVersionCount.
     * 
     * @return the size of this collection
     */
    public int getUseCodeSystemVersionCount(
    ) {
        return this._useCodeSystemVersionList.size();
    }

    /**
     * Returns the value of field 'versionOf'. The field
     * 'versionOf' has the following description: a reference to
     * the Map resource that this is a version of
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
        if (_fromValueSetDefinition != null) {
           result = 37 * result + _fromValueSetDefinition.hashCode();
        }
        if (_fromCodeSystemVersion != null) {
           result = 37 * result + _fromCodeSystemVersion.hashCode();
        }
        if (_toValueSetDefinition != null) {
           result = 37 * result + _toValueSetDefinition.hashCode();
        }
        if (_toCodeSystemVersion != null) {
           result = 37 * result + _toCodeSystemVersion.hashCode();
        }
        if (_useCodeSystemVersionList != null) {
           result = 37 * result + _useCodeSystemVersionList.hashCode();
        }
        if (_applicableContextList != null) {
           result = 37 * result + _applicableContextList.hashCode();
        }
        if (_versionTagList != null) {
           result = 37 * result + _versionTagList.hashCode();
        }
        if (_entries != null) {
           result = 37 * result + _entries.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateApplicableContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ContextReference> iterateApplicableContext(
    ) {
        return this._applicableContextList.iterator();
    }

    /**
     * Method iterateUseCodeSystemVersion.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends CodeSystemVersionReference> iterateUseCodeSystemVersion(
    ) {
        return this._useCodeSystemVersionList.iterator();
    }

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
    public void removeAllApplicableContext(
    ) {
        this._applicableContextList.clear();
    }

    /**
     */
    public void removeAllUseCodeSystemVersion(
    ) {
        this._useCodeSystemVersionList.clear();
    }

    /**
     */
    public void removeAllVersionTag(
    ) {
        this._versionTagList.clear();
    }

    /**
     * Method removeApplicableContext.
     * 
     * @param vApplicableContext
     * @return true if the object was removed from the collection.
     */
    public boolean removeApplicableContext(
            final ContextReference vApplicableContext) {
        return _applicableContextList.remove(vApplicableContext);
    }

    /**
     * Method removeApplicableContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ContextReference removeApplicableContextAt(
            final int index) {
        ContextReference obj = this._applicableContextList.remove(index);
        return obj;
    }

    /**
     * Method removeUseCodeSystemVersion.
     * 
     * @param vUseCodeSystemVersion
     * @return true if the object was removed from the collection.
     */
    public boolean removeUseCodeSystemVersion(
            final CodeSystemVersionReference vUseCodeSystemVersion) {
        return _useCodeSystemVersionList.remove(vUseCodeSystemVersion);
    }

    /**
     * Method removeUseCodeSystemVersionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public CodeSystemVersionReference removeUseCodeSystemVersionAt(
            final int index) {
        CodeSystemVersionReference obj = this._useCodeSystemVersionList.remove(index);
        return obj;
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
     * 
     * 
     * @param index
     * @param vApplicableContext
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setApplicableContext(
            final int index,
            final ContextReference vApplicableContext)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._applicableContextList.size()) {
            throw new IndexOutOfBoundsException("setApplicableContext: Index value '" + index + "' not in range [0.." + (this._applicableContextList.size() - 1) + "]");
        }

        this._applicableContextList.set(index, vApplicableContext);
    }

    /**
     * 
     * 
     * @param vApplicableContextArray
     */
    public void setApplicableContext(
            final ContextReference[] vApplicableContextArray) {
        //-- copy array
        _applicableContextList.clear();

        Collections.addAll(this._applicableContextList, vApplicableContextArray);
    }

    /**
     * Sets the value of '_applicableContextList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vApplicableContextList the Vector to copy.
     */
    public void setApplicableContext(
            final java.util.List<ContextReference> vApplicableContextList) {
        // copy vector
        this._applicableContextList.clear();

        this._applicableContextList.addAll(vApplicableContextList);
    }

    /**
     * Sets the value of '_applicableContextList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param applicableContextList the Vector to set.
     */
    public void setApplicableContextAsReference(
            final java.util.List<ContextReference> applicableContextList) {
        this._applicableContextList = applicableContextList;
    }

    /**
     * Sets the value of field 'entries'. The field 'entries' has
     * the following description: a DirectoryURI that resolves to
     * the set of MapEntries that are contained in this MapVersion.
     * 
     * @param entries the value of field 'entries'.
     */
    public void setEntries(
            final String entries) {
        this._entries = entries;
    }

    /**
     * Sets the value of field 'fromCodeSystemVersion'. The field
     * 'fromCodeSystemVersion' has the following description: the
     * specific code system version that provided the from entities
     * in this map
     * 
     * @param fromCodeSystemVersion the value of field
     * 'fromCodeSystemVersion'.
     */
    public void setFromCodeSystemVersion(
            final CodeSystemVersionReference fromCodeSystemVersion) {
        this._fromCodeSystemVersion = fromCodeSystemVersion;
    }

    /**
     * Sets the value of field 'fromValueSetDefinition'. The field
     * 'fromValueSetDefinition' has the following description: the
     * specific value set definition that was used to resolve the
     * from entities in this map
     * 
     * @param fromValueSetDefinition the value of field
     * 'fromValueSetDefinition'.
     */
    public void setFromValueSetDefinition(
            final edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference fromValueSetDefinition) {
        this._fromValueSetDefinition = fromValueSetDefinition;
    }

    /**
     * Sets the value of field 'mapVersionName'. The field
     * 'mapVersionName' has the following description: a local
     * identifier that uniquely names this version within the
     * context of the CTS2 service implementation
     * 
     * @param mapVersionName the value of field 'mapVersionName'.
     */
    public void setMapVersionName(
            final String mapVersionName) {
        this._mapVersionName = mapVersionName;
    }

    /**
     * Sets the value of field 'toCodeSystemVersion'. The field
     * 'toCodeSystemVersion' has the following description: the
     * specific code system version that provided the to entities
     * in this map
     * 
     * @param toCodeSystemVersion the value of field
     * 'toCodeSystemVersion'.
     */
    public void setToCodeSystemVersion(
            final CodeSystemVersionReference toCodeSystemVersion) {
        this._toCodeSystemVersion = toCodeSystemVersion;
    }

    /**
     * Sets the value of field 'toValueSetDefinition'. The field
     * 'toValueSetDefinition' has the following description: the
     * specific value set definition that was used to resolve the
     * to entities in this map
     * 
     * @param toValueSetDefinition the value of field
     * 'toValueSetDefinition'.
     */
    public void setToValueSetDefinition(
            final edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference toValueSetDefinition) {
        this._toValueSetDefinition = toValueSetDefinition;
    }

    /**
     * 
     * 
     * @param index
     * @param vUseCodeSystemVersion
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUseCodeSystemVersion(
            final int index,
            final CodeSystemVersionReference vUseCodeSystemVersion)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._useCodeSystemVersionList.size()) {
            throw new IndexOutOfBoundsException("setUseCodeSystemVersion: Index value '" + index + "' not in range [0.." + (this._useCodeSystemVersionList.size() - 1) + "]");
        }

        this._useCodeSystemVersionList.set(index, vUseCodeSystemVersion);
    }

    /**
     * 
     * 
     * @param vUseCodeSystemVersionArray
     */
    public void setUseCodeSystemVersion(
            final CodeSystemVersionReference[] vUseCodeSystemVersionArray) {
        //-- copy array
        _useCodeSystemVersionList.clear();

        Collections.addAll(this._useCodeSystemVersionList, vUseCodeSystemVersionArray);
    }

    /**
     * Sets the value of '_useCodeSystemVersionList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vUseCodeSystemVersionList the Vector to copy.
     */
    public void setUseCodeSystemVersion(
            final java.util.List<CodeSystemVersionReference> vUseCodeSystemVersionList) {
        // copy vector
        this._useCodeSystemVersionList.clear();

        this._useCodeSystemVersionList.addAll(vUseCodeSystemVersionList);
    }

    /**
     * Sets the value of '_useCodeSystemVersionList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param useCodeSystemVersionList the Vector to set.
     */
    public void setUseCodeSystemVersionAsReference(
            final java.util.List<CodeSystemVersionReference> useCodeSystemVersionList) {
        this._useCodeSystemVersionList = useCodeSystemVersionList;
    }

    /**
     * Sets the value of field 'versionOf'. The field 'versionOf'
     * has the following description: a reference to the Map
     * resource that this is a version of
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
     * Method unmarshalMapVersion.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.mapversion.MapVersion
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
