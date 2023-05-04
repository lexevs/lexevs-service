/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.MatchAlgorithmReference;
import edu.mayo.cts2.framework.model.core.ModelAttributeReference;
import edu.mayo.cts2.framework.model.core.PredicateReference;
import java.util.Collections;

/**
 * BaseQueryService represents the set of attributes and operations
 * that are common across all query service implementations. It
 * includes generic directory manipulation functions as well as
 * enumerations of the permissible values for query parameters in
 * the given service context.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class BaseQueryService extends BaseService
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The set of properties that are used in one or more instances
     * of the resource represented by this service. This list
     * includes all properties that are can be used in queries in
     * this service, independent of the entryState or temporal
     * state of the resource(s) being searched. 
     */
    private java.util.List<PredicateReference> _knownPropertyList;

    /**
     * The match algorithms that can be used in filters for this
     * service instance.
     */
    private java.util.List<MatchAlgorithmReference> _supportedMatchAlgorithmList;

    /**
     * The set of model attributes that can be referenced in filter
     * instances for the given service implementation.
     */
    private java.util.List<ModelAttributeReference> _supportedModelAttributeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BaseQueryService() {
        super();
        this._knownPropertyList = new java.util.ArrayList<PredicateReference>();
        this._supportedMatchAlgorithmList = new java.util.ArrayList<MatchAlgorithmReference>();
        this._supportedModelAttributeList = new java.util.ArrayList<ModelAttributeReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vKnownProperty
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownProperty(
            final PredicateReference vKnownProperty)
    throws IndexOutOfBoundsException {
        this._knownPropertyList.add(vKnownProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownProperty
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownProperty(
            final int index,
            final PredicateReference vKnownProperty)
    throws IndexOutOfBoundsException {
        this._knownPropertyList.add(index, vKnownProperty);
    }

    /**
     * 
     * 
     * @param vSupportedMatchAlgorithm
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedMatchAlgorithm(
            final MatchAlgorithmReference vSupportedMatchAlgorithm)
    throws IndexOutOfBoundsException {
        this._supportedMatchAlgorithmList.add(vSupportedMatchAlgorithm);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedMatchAlgorithm
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedMatchAlgorithm(
            final int index,
            final MatchAlgorithmReference vSupportedMatchAlgorithm)
    throws IndexOutOfBoundsException {
        this._supportedMatchAlgorithmList.add(index, vSupportedMatchAlgorithm);
    }

    /**
     * 
     * 
     * @param vSupportedModelAttribute
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedModelAttribute(
            final ModelAttributeReference vSupportedModelAttribute)
    throws IndexOutOfBoundsException {
        this._supportedModelAttributeList.add(vSupportedModelAttribute);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedModelAttribute
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedModelAttribute(
            final int index,
            final ModelAttributeReference vSupportedModelAttribute)
    throws IndexOutOfBoundsException {
        this._supportedModelAttributeList.add(index, vSupportedModelAttribute);
    }

    /**
     * Method enumerateKnownProperty.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends PredicateReference> enumerateKnownProperty(
    ) {
        return Collections.enumeration(this._knownPropertyList);
    }

    /**
     * Method enumerateSupportedMatchAlgorithm.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends MatchAlgorithmReference> enumerateSupportedMatchAlgorithm(
    ) {
        return Collections.enumeration(this._supportedMatchAlgorithmList);
    }

    /**
     * Method enumerateSupportedModelAttribute.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ModelAttributeReference> enumerateSupportedModelAttribute(
    ) {
        return Collections.enumeration(this._supportedModelAttributeList);
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

        if (obj instanceof BaseQueryService) {

            BaseQueryService temp = (BaseQueryService)obj;
            if (this._knownPropertyList != null) {
                if (temp._knownPropertyList == null) return false;
                if (!this._knownPropertyList.equals(temp._knownPropertyList)) 
                    return false;
            } else if (temp._knownPropertyList != null)
                return false;
            if (this._supportedMatchAlgorithmList != null) {
                if (temp._supportedMatchAlgorithmList == null) return false;
                if (!this._supportedMatchAlgorithmList.equals(temp._supportedMatchAlgorithmList)) 
                    return false;
            } else if (temp._supportedMatchAlgorithmList != null)
                return false;
            if (this._supportedModelAttributeList != null) {
                if (temp._supportedModelAttributeList == null) return false;
                return this._supportedModelAttributeList.equals(temp._supportedModelAttributeList);
            } else return temp._supportedModelAttributeList == null;
        }
        return false;
    }

    /**
     * Method getKnownProperty.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.PredicateReference at the
     * given index
     */
    public PredicateReference getKnownProperty(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownPropertyList.size()) {
            throw new IndexOutOfBoundsException("getKnownProperty: Index value '" + index + "' not in range [0.." + (this._knownPropertyList.size() - 1) + "]");
        }

        return _knownPropertyList.get(index);
    }

    /**
     * Method getKnownProperty.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public PredicateReference[] getKnownProperty(
    ) {
        PredicateReference[] array = new PredicateReference[0];
        return this._knownPropertyList.toArray(array);
    }

    /**
     * Method getKnownPropertyAsReference.Returns a reference to
     * '_knownPropertyList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<PredicateReference> getKnownPropertyAsReference(
    ) {
        return this._knownPropertyList;
    }

    /**
     * Method getKnownPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getKnownPropertyCount(
    ) {
        return this._knownPropertyList.size();
    }

    /**
     * Method getSupportedMatchAlgorithm.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.MatchAlgorithmReference
     * at the given index
     */
    public MatchAlgorithmReference getSupportedMatchAlgorithm(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedMatchAlgorithmList.size()) {
            throw new IndexOutOfBoundsException("getSupportedMatchAlgorithm: Index value '" + index + "' not in range [0.." + (this._supportedMatchAlgorithmList.size() - 1) + "]");
        }

        return _supportedMatchAlgorithmList.get(index);
    }

    /**
     * Method getSupportedMatchAlgorithm.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public MatchAlgorithmReference[] getSupportedMatchAlgorithm(
    ) {
        MatchAlgorithmReference[] array = new MatchAlgorithmReference[0];
        return this._supportedMatchAlgorithmList.toArray(array);
    }

    /**
     * Method getSupportedMatchAlgorithmAsReference.Returns a
     * reference to '_supportedMatchAlgorithmList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<MatchAlgorithmReference> getSupportedMatchAlgorithmAsReference(
    ) {
        return this._supportedMatchAlgorithmList;
    }

    /**
     * Method getSupportedMatchAlgorithmCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedMatchAlgorithmCount(
    ) {
        return this._supportedMatchAlgorithmList.size();
    }

    /**
     * Method getSupportedModelAttribute.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.ModelAttributeReference
     * at the given index
     */
    public ModelAttributeReference getSupportedModelAttribute(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedModelAttributeList.size()) {
            throw new IndexOutOfBoundsException("getSupportedModelAttribute: Index value '" + index + "' not in range [0.." + (this._supportedModelAttributeList.size() - 1) + "]");
        }

        return _supportedModelAttributeList.get(index);
    }

    /**
     * Method getSupportedModelAttribute.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ModelAttributeReference[] getSupportedModelAttribute(
    ) {
        ModelAttributeReference[] array = new ModelAttributeReference[0];
        return this._supportedModelAttributeList.toArray(array);
    }

    /**
     * Method getSupportedModelAttributeAsReference.Returns a
     * reference to '_supportedModelAttributeList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ModelAttributeReference> getSupportedModelAttributeAsReference(
    ) {
        return this._supportedModelAttributeList;
    }

    /**
     * Method getSupportedModelAttributeCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedModelAttributeCount(
    ) {
        return this._supportedModelAttributeList.size();
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
        if (_knownPropertyList != null) {
           result = 37 * result + _knownPropertyList.hashCode();
        }
        if (_supportedMatchAlgorithmList != null) {
           result = 37 * result + _supportedMatchAlgorithmList.hashCode();
        }
        if (_supportedModelAttributeList != null) {
           result = 37 * result + _supportedModelAttributeList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateKnownProperty.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends PredicateReference> iterateKnownProperty(
    ) {
        return this._knownPropertyList.iterator();
    }

    /**
     * Method iterateSupportedMatchAlgorithm.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends MatchAlgorithmReference> iterateSupportedMatchAlgorithm(
    ) {
        return this._supportedMatchAlgorithmList.iterator();
    }

    /**
     * Method iterateSupportedModelAttribute.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ModelAttributeReference> iterateSupportedModelAttribute(
    ) {
        return this._supportedModelAttributeList.iterator();
    }

    /**
     */
    public void removeAllKnownProperty(
    ) {
        this._knownPropertyList.clear();
    }

    /**
     */
    public void removeAllSupportedMatchAlgorithm(
    ) {
        this._supportedMatchAlgorithmList.clear();
    }

    /**
     */
    public void removeAllSupportedModelAttribute(
    ) {
        this._supportedModelAttributeList.clear();
    }

    /**
     * Method removeKnownProperty.
     * 
     * @param vKnownProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownProperty(
            final PredicateReference vKnownProperty) {
        return _knownPropertyList.remove(vKnownProperty);
    }

    /**
     * Method removeKnownPropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public PredicateReference removeKnownPropertyAt(
            final int index) {
        PredicateReference obj = this._knownPropertyList.remove(index);
        return obj;
    }

    /**
     * Method removeSupportedMatchAlgorithm.
     * 
     * @param vSupportedMatchAlgorithm
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedMatchAlgorithm(
            final MatchAlgorithmReference vSupportedMatchAlgorithm) {
        return _supportedMatchAlgorithmList.remove(vSupportedMatchAlgorithm);
    }

    /**
     * Method removeSupportedMatchAlgorithmAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public MatchAlgorithmReference removeSupportedMatchAlgorithmAt(
            final int index) {
        MatchAlgorithmReference obj = this._supportedMatchAlgorithmList.remove(index);
        return obj;
    }

    /**
     * Method removeSupportedModelAttribute.
     * 
     * @param vSupportedModelAttribute
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedModelAttribute(
            final ModelAttributeReference vSupportedModelAttribute) {
        return _supportedModelAttributeList.remove(vSupportedModelAttribute);
    }

    /**
     * Method removeSupportedModelAttributeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ModelAttributeReference removeSupportedModelAttributeAt(
            final int index) {
        ModelAttributeReference obj = this._supportedModelAttributeList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownProperty
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownProperty(
            final int index,
            final PredicateReference vKnownProperty)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownPropertyList.size()) {
            throw new IndexOutOfBoundsException("setKnownProperty: Index value '" + index + "' not in range [0.." + (this._knownPropertyList.size() - 1) + "]");
        }

        this._knownPropertyList.set(index, vKnownProperty);
    }

    /**
     * 
     * 
     * @param vKnownPropertyArray
     */
    public void setKnownProperty(
            final PredicateReference[] vKnownPropertyArray) {
        //-- copy array
        _knownPropertyList.clear();

        Collections.addAll(this._knownPropertyList, vKnownPropertyArray);
    }

    /**
     * Sets the value of '_knownPropertyList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vKnownPropertyList the Vector to copy.
     */
    public void setKnownProperty(
            final java.util.List<PredicateReference> vKnownPropertyList) {
        // copy vector
        this._knownPropertyList.clear();

        this._knownPropertyList.addAll(vKnownPropertyList);
    }

    /**
     * Sets the value of '_knownPropertyList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownPropertyList the Vector to set.
     */
    public void setKnownPropertyAsReference(
            final java.util.List<PredicateReference> knownPropertyList) {
        this._knownPropertyList = knownPropertyList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedMatchAlgorithm
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedMatchAlgorithm(
            final int index,
            final MatchAlgorithmReference vSupportedMatchAlgorithm)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedMatchAlgorithmList.size()) {
            throw new IndexOutOfBoundsException("setSupportedMatchAlgorithm: Index value '" + index + "' not in range [0.." + (this._supportedMatchAlgorithmList.size() - 1) + "]");
        }

        this._supportedMatchAlgorithmList.set(index, vSupportedMatchAlgorithm);
    }

    /**
     * 
     * 
     * @param vSupportedMatchAlgorithmArray
     */
    public void setSupportedMatchAlgorithm(
            final MatchAlgorithmReference[] vSupportedMatchAlgorithmArray) {
        //-- copy array
        _supportedMatchAlgorithmList.clear();

        Collections.addAll(this._supportedMatchAlgorithmList, vSupportedMatchAlgorithmArray);
    }

    /**
     * Sets the value of '_supportedMatchAlgorithmList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vSupportedMatchAlgorithmList the Vector to copy.
     */
    public void setSupportedMatchAlgorithm(
            final java.util.List<MatchAlgorithmReference> vSupportedMatchAlgorithmList) {
        // copy vector
        this._supportedMatchAlgorithmList.clear();

        this._supportedMatchAlgorithmList.addAll(vSupportedMatchAlgorithmList);
    }

    /**
     * Sets the value of '_supportedMatchAlgorithmList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedMatchAlgorithmList the Vector to set.
     */
    public void setSupportedMatchAlgorithmAsReference(
            final java.util.List<MatchAlgorithmReference> supportedMatchAlgorithmList) {
        this._supportedMatchAlgorithmList = supportedMatchAlgorithmList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedModelAttribute
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedModelAttribute(
            final int index,
            final ModelAttributeReference vSupportedModelAttribute)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedModelAttributeList.size()) {
            throw new IndexOutOfBoundsException("setSupportedModelAttribute: Index value '" + index + "' not in range [0.." + (this._supportedModelAttributeList.size() - 1) + "]");
        }

        this._supportedModelAttributeList.set(index, vSupportedModelAttribute);
    }

    /**
     * 
     * 
     * @param vSupportedModelAttributeArray
     */
    public void setSupportedModelAttribute(
            final ModelAttributeReference[] vSupportedModelAttributeArray) {
        //-- copy array
        _supportedModelAttributeList.clear();

        Collections.addAll(this._supportedModelAttributeList, vSupportedModelAttributeArray);
    }

    /**
     * Sets the value of '_supportedModelAttributeList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vSupportedModelAttributeList the Vector to copy.
     */
    public void setSupportedModelAttribute(
            final java.util.List<ModelAttributeReference> vSupportedModelAttributeList) {
        // copy vector
        this._supportedModelAttributeList.clear();

        this._supportedModelAttributeList.addAll(vSupportedModelAttributeList);
    }

    /**
     * Sets the value of '_supportedModelAttributeList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedModelAttributeList the Vector to set.
     */
    public void setSupportedModelAttributeAsReference(
            final java.util.List<ModelAttributeReference> supportedModelAttributeList) {
        this._supportedModelAttributeList = supportedModelAttributeList;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
