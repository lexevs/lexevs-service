/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import java.util.Collections;

/**
 * The information required to completely resolve a value set
 * definition. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ResolvedValueSetHeader extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the specific value set definition that was resolved
     */
    private edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference _resolutionOf;

    /**
     * a reference to a code system version that was used in the
     * resolution of this value set definition
     */
    private java.util.List<CodeSystemVersionReference> _resolvedUsingCodeSystemList;

    /**
     * If the value set includes other value sets, this contains
     * the resolution information used to resolve the inner value
     * sets.
     */
    private java.util.List<ResolvedValueSetHeader> _includesResolvedValueSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResolvedValueSetHeader() {
        super();
        this._resolvedUsingCodeSystemList = new java.util.ArrayList<CodeSystemVersionReference>();
        this._includesResolvedValueSetList = new java.util.ArrayList<ResolvedValueSetHeader>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vIncludesResolvedValueSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludesResolvedValueSet(
            final ResolvedValueSetHeader vIncludesResolvedValueSet)
    throws IndexOutOfBoundsException {
        this._includesResolvedValueSetList.add(vIncludesResolvedValueSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludesResolvedValueSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludesResolvedValueSet(
            final int index,
            final ResolvedValueSetHeader vIncludesResolvedValueSet)
    throws IndexOutOfBoundsException {
        this._includesResolvedValueSetList.add(index, vIncludesResolvedValueSet);
    }

    /**
     * 
     * 
     * @param vResolvedUsingCodeSystem
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResolvedUsingCodeSystem(
            final CodeSystemVersionReference vResolvedUsingCodeSystem)
    throws IndexOutOfBoundsException {
        this._resolvedUsingCodeSystemList.add(vResolvedUsingCodeSystem);
    }

    /**
     * 
     * 
     * @param index
     * @param vResolvedUsingCodeSystem
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResolvedUsingCodeSystem(
            final int index,
            final CodeSystemVersionReference vResolvedUsingCodeSystem)
    throws IndexOutOfBoundsException {
        this._resolvedUsingCodeSystemList.add(index, vResolvedUsingCodeSystem);
    }

    /**
     * Method enumerateIncludesResolvedValueSet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ResolvedValueSetHeader> enumerateIncludesResolvedValueSet(
    ) {
        return Collections.enumeration(this._includesResolvedValueSetList);
    }

    /**
     * Method enumerateResolvedUsingCodeSystem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends CodeSystemVersionReference> enumerateResolvedUsingCodeSystem(
    ) {
        return Collections.enumeration(this._resolvedUsingCodeSystemList);
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

        if (obj instanceof ResolvedValueSetHeader) {

            ResolvedValueSetHeader temp = (ResolvedValueSetHeader)obj;
            if (this._resolutionOf != null) {
                if (temp._resolutionOf == null) return false;
                if (!this._resolutionOf.equals(temp._resolutionOf)) 
                    return false;
            } else if (temp._resolutionOf != null)
                return false;
            if (this._resolvedUsingCodeSystemList != null) {
                if (temp._resolvedUsingCodeSystemList == null) return false;
                if (!this._resolvedUsingCodeSystemList.equals(temp._resolvedUsingCodeSystemList)) 
                    return false;
            } else if (temp._resolvedUsingCodeSystemList != null)
                return false;
            if (this._includesResolvedValueSetList != null) {
                if (temp._includesResolvedValueSetList == null) return false;
                return this._includesResolvedValueSetList.equals(temp._includesResolvedValueSetList);
            } else return temp._includesResolvedValueSetList == null;
        }
        return false;
    }

    /**
     * Method getIncludesResolvedValueSet.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.valuesetdefinition.ResolvedValueSetHeader
     * at the given index
     */
    public ResolvedValueSetHeader getIncludesResolvedValueSet(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includesResolvedValueSetList.size()) {
            throw new IndexOutOfBoundsException("getIncludesResolvedValueSet: Index value '" + index + "' not in range [0.." + (this._includesResolvedValueSetList.size() - 1) + "]");
        }

        return _includesResolvedValueSetList.get(index);
    }

    /**
     * Method getIncludesResolvedValueSet.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ResolvedValueSetHeader[] getIncludesResolvedValueSet(
    ) {
        ResolvedValueSetHeader[] array = new ResolvedValueSetHeader[0];
        return this._includesResolvedValueSetList.toArray(array);
    }

    /**
     * Method getIncludesResolvedValueSetAsReference.Returns a
     * reference to '_includesResolvedValueSetList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ResolvedValueSetHeader> getIncludesResolvedValueSetAsReference(
    ) {
        return this._includesResolvedValueSetList;
    }

    /**
     * Method getIncludesResolvedValueSetCount.
     * 
     * @return the size of this collection
     */
    public int getIncludesResolvedValueSetCount(
    ) {
        return this._includesResolvedValueSetList.size();
    }

    /**
     * Returns the value of field 'resolutionOf'. The field
     * 'resolutionOf' has the following description: the specific
     * value set definition that was resolved
     * 
     * @return the value of field 'ResolutionOf'.
     */
    public edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference getResolutionOf(
    ) {
        return this._resolutionOf;
    }

    /**
     * Method getResolvedUsingCodeSystem.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.CodeSystemVersionReference
     * at the given index
     */
    public CodeSystemVersionReference getResolvedUsingCodeSystem(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resolvedUsingCodeSystemList.size()) {
            throw new IndexOutOfBoundsException("getResolvedUsingCodeSystem: Index value '" + index + "' not in range [0.." + (this._resolvedUsingCodeSystemList.size() - 1) + "]");
        }

        return _resolvedUsingCodeSystemList.get(index);
    }

    /**
     * Method getResolvedUsingCodeSystem.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public CodeSystemVersionReference[] getResolvedUsingCodeSystem(
    ) {
        CodeSystemVersionReference[] array = new CodeSystemVersionReference[0];
        return this._resolvedUsingCodeSystemList.toArray(array);
    }

    /**
     * Method getResolvedUsingCodeSystemAsReference.Returns a
     * reference to '_resolvedUsingCodeSystemList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<CodeSystemVersionReference> getResolvedUsingCodeSystemAsReference(
    ) {
        return this._resolvedUsingCodeSystemList;
    }

    /**
     * Method getResolvedUsingCodeSystemCount.
     * 
     * @return the size of this collection
     */
    public int getResolvedUsingCodeSystemCount(
    ) {
        return this._resolvedUsingCodeSystemList.size();
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
        if (_resolutionOf != null) {
           result = 37 * result + _resolutionOf.hashCode();
        }
        if (_resolvedUsingCodeSystemList != null) {
           result = 37 * result + _resolvedUsingCodeSystemList.hashCode();
        }
        if (_includesResolvedValueSetList != null) {
           result = 37 * result + _includesResolvedValueSetList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateIncludesResolvedValueSet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ResolvedValueSetHeader> iterateIncludesResolvedValueSet(
    ) {
        return this._includesResolvedValueSetList.iterator();
    }

    /**
     * Method iterateResolvedUsingCodeSystem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends CodeSystemVersionReference> iterateResolvedUsingCodeSystem(
    ) {
        return this._resolvedUsingCodeSystemList.iterator();
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
    public void removeAllIncludesResolvedValueSet(
    ) {
        this._includesResolvedValueSetList.clear();
    }

    /**
     */
    public void removeAllResolvedUsingCodeSystem(
    ) {
        this._resolvedUsingCodeSystemList.clear();
    }

    /**
     * Method removeIncludesResolvedValueSet.
     * 
     * @param vIncludesResolvedValueSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludesResolvedValueSet(
            final ResolvedValueSetHeader vIncludesResolvedValueSet) {
        return _includesResolvedValueSetList.remove(vIncludesResolvedValueSet);
    }

    /**
     * Method removeIncludesResolvedValueSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ResolvedValueSetHeader removeIncludesResolvedValueSetAt(
            final int index) {
        ResolvedValueSetHeader obj = this._includesResolvedValueSetList.remove(index);
        return obj;
    }

    /**
     * Method removeResolvedUsingCodeSystem.
     * 
     * @param vResolvedUsingCodeSystem
     * @return true if the object was removed from the collection.
     */
    public boolean removeResolvedUsingCodeSystem(
            final CodeSystemVersionReference vResolvedUsingCodeSystem) {
        return _resolvedUsingCodeSystemList.remove(vResolvedUsingCodeSystem);
    }

    /**
     * Method removeResolvedUsingCodeSystemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public CodeSystemVersionReference removeResolvedUsingCodeSystemAt(
            final int index) {
        CodeSystemVersionReference obj = this._resolvedUsingCodeSystemList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludesResolvedValueSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludesResolvedValueSet(
            final int index,
            final ResolvedValueSetHeader vIncludesResolvedValueSet)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includesResolvedValueSetList.size()) {
            throw new IndexOutOfBoundsException("setIncludesResolvedValueSet: Index value '" + index + "' not in range [0.." + (this._includesResolvedValueSetList.size() - 1) + "]");
        }

        this._includesResolvedValueSetList.set(index, vIncludesResolvedValueSet);
    }

    /**
     * 
     * 
     * @param vIncludesResolvedValueSetArray
     */
    public void setIncludesResolvedValueSet(
            final ResolvedValueSetHeader[] vIncludesResolvedValueSetArray) {
        //-- copy array
        _includesResolvedValueSetList.clear();

        Collections.addAll(this._includesResolvedValueSetList, vIncludesResolvedValueSetArray);
    }

    /**
     * Sets the value of '_includesResolvedValueSetList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vIncludesResolvedValueSetList the Vector to copy.
     */
    public void setIncludesResolvedValueSet(
            final java.util.List<ResolvedValueSetHeader> vIncludesResolvedValueSetList) {
        // copy vector
        this._includesResolvedValueSetList.clear();

        this._includesResolvedValueSetList.addAll(vIncludesResolvedValueSetList);
    }

    /**
     * Sets the value of '_includesResolvedValueSetList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param includesResolvedValueSetList the Vector to set.
     */
    public void setIncludesResolvedValueSetAsReference(
            final java.util.List<ResolvedValueSetHeader> includesResolvedValueSetList) {
        this._includesResolvedValueSetList = includesResolvedValueSetList;
    }

    /**
     * Sets the value of field 'resolutionOf'. The field
     * 'resolutionOf' has the following description: the specific
     * value set definition that was resolved
     * 
     * @param resolutionOf the value of field 'resolutionOf'.
     */
    public void setResolutionOf(
            final edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference resolutionOf) {
        this._resolutionOf = resolutionOf;
    }

    /**
     * 
     * 
     * @param index
     * @param vResolvedUsingCodeSystem
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResolvedUsingCodeSystem(
            final int index,
            final CodeSystemVersionReference vResolvedUsingCodeSystem)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resolvedUsingCodeSystemList.size()) {
            throw new IndexOutOfBoundsException("setResolvedUsingCodeSystem: Index value '" + index + "' not in range [0.." + (this._resolvedUsingCodeSystemList.size() - 1) + "]");
        }

        this._resolvedUsingCodeSystemList.set(index, vResolvedUsingCodeSystem);
    }

    /**
     * 
     * 
     * @param vResolvedUsingCodeSystemArray
     */
    public void setResolvedUsingCodeSystem(
            final CodeSystemVersionReference[] vResolvedUsingCodeSystemArray) {
        //-- copy array
        _resolvedUsingCodeSystemList.clear();

        Collections.addAll(this._resolvedUsingCodeSystemList, vResolvedUsingCodeSystemArray);
    }

    /**
     * Sets the value of '_resolvedUsingCodeSystemList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vResolvedUsingCodeSystemList the Vector to copy.
     */
    public void setResolvedUsingCodeSystem(
            final java.util.List<CodeSystemVersionReference> vResolvedUsingCodeSystemList) {
        // copy vector
        this._resolvedUsingCodeSystemList.clear();

        this._resolvedUsingCodeSystemList.addAll(vResolvedUsingCodeSystemList);
    }

    /**
     * Sets the value of '_resolvedUsingCodeSystemList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param resolvedUsingCodeSystemList the Vector to set.
     */
    public void setResolvedUsingCodeSystemAsReference(
            final java.util.List<CodeSystemVersionReference> resolvedUsingCodeSystemList) {
        this._resolvedUsingCodeSystemList = resolvedUsingCodeSystemList;
    }

    /**
     * Method unmarshalResolvedValueSetHeader.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.ResolvedValueSetHeader
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
