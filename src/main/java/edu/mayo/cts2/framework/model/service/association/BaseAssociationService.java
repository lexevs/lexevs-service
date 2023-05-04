/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.association;

import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import edu.mayo.cts2.framework.model.core.PredicateReference;
import java.util.Collections;

/**
 * Class BaseAssociationService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class BaseAssociationService extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _knownCodeSystemVersionList.
     */
    private java.util.List<CodeSystemVersionReference> _knownCodeSystemVersionList;

    /**
     * Field _knownPredicateList.
     */
    private java.util.List<PredicateReference> _knownPredicateList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BaseAssociationService() {
        super();
        this._knownCodeSystemVersionList = new java.util.ArrayList<CodeSystemVersionReference>();
        this._knownPredicateList = new java.util.ArrayList<PredicateReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * @param vKnownPredicate
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownPredicate(
            final PredicateReference vKnownPredicate)
    throws IndexOutOfBoundsException {
        this._knownPredicateList.add(vKnownPredicate);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownPredicate
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownPredicate(
            final int index,
            final PredicateReference vKnownPredicate)
    throws IndexOutOfBoundsException {
        this._knownPredicateList.add(index, vKnownPredicate);
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
     * Method enumerateKnownPredicate.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends PredicateReference> enumerateKnownPredicate(
    ) {
        return Collections.enumeration(this._knownPredicateList);
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

        if (obj instanceof BaseAssociationService) {

            BaseAssociationService temp = (BaseAssociationService)obj;
            if (this._knownCodeSystemVersionList != null) {
                if (temp._knownCodeSystemVersionList == null) return false;
                if (!this._knownCodeSystemVersionList.equals(temp._knownCodeSystemVersionList)) 
                    return false;
            } else if (temp._knownCodeSystemVersionList != null)
                return false;
            if (this._knownPredicateList != null) {
                if (temp._knownPredicateList == null) return false;
                return this._knownPredicateList.equals(temp._knownPredicateList);
            } else return temp._knownPredicateList == null;
        }
        return false;
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
     * Method getKnownPredicate.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.PredicateReference at the
     * given index
     */
    public PredicateReference getKnownPredicate(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownPredicateList.size()) {
            throw new IndexOutOfBoundsException("getKnownPredicate: Index value '" + index + "' not in range [0.." + (this._knownPredicateList.size() - 1) + "]");
        }

        return _knownPredicateList.get(index);
    }

    /**
     * Method getKnownPredicate.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public PredicateReference[] getKnownPredicate(
    ) {
        PredicateReference[] array = new PredicateReference[0];
        return this._knownPredicateList.toArray(array);
    }

    /**
     * Method getKnownPredicateAsReference.Returns a reference to
     * '_knownPredicateList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<PredicateReference> getKnownPredicateAsReference(
    ) {
        return this._knownPredicateList;
    }

    /**
     * Method getKnownPredicateCount.
     * 
     * @return the size of this collection
     */
    public int getKnownPredicateCount(
    ) {
        return this._knownPredicateList.size();
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
        if (_knownCodeSystemVersionList != null) {
           result = 37 * result + _knownCodeSystemVersionList.hashCode();
        }
        if (_knownPredicateList != null) {
           result = 37 * result + _knownPredicateList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

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
     * Method iterateKnownPredicate.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends PredicateReference> iterateKnownPredicate(
    ) {
        return this._knownPredicateList.iterator();
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
    public void removeAllKnownCodeSystemVersion(
    ) {
        this._knownCodeSystemVersionList.clear();
    }

    /**
     */
    public void removeAllKnownPredicate(
    ) {
        this._knownPredicateList.clear();
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
     * Method removeKnownPredicate.
     * 
     * @param vKnownPredicate
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownPredicate(
            final PredicateReference vKnownPredicate) {
        return _knownPredicateList.remove(vKnownPredicate);
    }

    /**
     * Method removeKnownPredicateAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public PredicateReference removeKnownPredicateAt(
            final int index) {
        PredicateReference obj = this._knownPredicateList.remove(index);
        return obj;
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
     * @param vKnownPredicate
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownPredicate(
            final int index,
            final PredicateReference vKnownPredicate)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownPredicateList.size()) {
            throw new IndexOutOfBoundsException("setKnownPredicate: Index value '" + index + "' not in range [0.." + (this._knownPredicateList.size() - 1) + "]");
        }

        this._knownPredicateList.set(index, vKnownPredicate);
    }

    /**
     * 
     * 
     * @param vKnownPredicateArray
     */
    public void setKnownPredicate(
            final PredicateReference[] vKnownPredicateArray) {
        //-- copy array
        _knownPredicateList.clear();

        Collections.addAll(this._knownPredicateList, vKnownPredicateArray);
    }

    /**
     * Sets the value of '_knownPredicateList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vKnownPredicateList the Vector to copy.
     */
    public void setKnownPredicate(
            final java.util.List<PredicateReference> vKnownPredicateList) {
        // copy vector
        this._knownPredicateList.clear();

        this._knownPredicateList.addAll(vKnownPredicateList);
    }

    /**
     * Sets the value of '_knownPredicateList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownPredicateList the Vector to set.
     */
    public void setKnownPredicateAsReference(
            final java.util.List<PredicateReference> knownPredicateList) {
        this._knownPredicateList = knownPredicateList;
    }

    /**
     * Method unmarshalBaseAssociationService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.association.BaseAssociationService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
