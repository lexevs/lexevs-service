/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

import java.util.Collections;

/**
 * A reference to an entity that is identified through a globally
 * unique URI.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class NamedEntityReference extends EntityReference
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a reference to a version of a code system that makes one or
     * more assertions about the referenced entity. Note that only
     * one version of a given code system is allowed in the
     * describingCodeSystem
     *  list. Unless specified otherwise in a specific call, the
     * code system version with the tag "CURRENT" must be used.
     */
    private java.util.List<DescriptionInCodeSystem> _knownEntityDescriptionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NamedEntityReference() {
        super();
        this._knownEntityDescriptionList = new java.util.ArrayList<DescriptionInCodeSystem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vKnownEntityDescription
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownEntityDescription(
            final DescriptionInCodeSystem vKnownEntityDescription)
    throws IndexOutOfBoundsException {
        this._knownEntityDescriptionList.add(vKnownEntityDescription);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownEntityDescription
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownEntityDescription(
            final int index,
            final DescriptionInCodeSystem vKnownEntityDescription)
    throws IndexOutOfBoundsException {
        this._knownEntityDescriptionList.add(index, vKnownEntityDescription);
    }

    /**
     * Method enumerateKnownEntityDescription.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends DescriptionInCodeSystem> enumerateKnownEntityDescription(
    ) {
        return Collections.enumeration(this._knownEntityDescriptionList);
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

        if (obj instanceof NamedEntityReference) {

            NamedEntityReference temp = (NamedEntityReference)obj;
            if (this._knownEntityDescriptionList != null) {
                if (temp._knownEntityDescriptionList == null) return false;
                return this._knownEntityDescriptionList.equals(temp._knownEntityDescriptionList);
            } else return temp._knownEntityDescriptionList == null;
        }
        return false;
    }

    /**
     * Method getKnownEntityDescription.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.DescriptionInCodeSystem
     * at the given index
     */
    public DescriptionInCodeSystem getKnownEntityDescription(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownEntityDescriptionList.size()) {
            throw new IndexOutOfBoundsException("getKnownEntityDescription: Index value '" + index + "' not in range [0.." + (this._knownEntityDescriptionList.size() - 1) + "]");
        }

        return _knownEntityDescriptionList.get(index);
    }

    /**
     * Method getKnownEntityDescription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public DescriptionInCodeSystem[] getKnownEntityDescription(
    ) {
        DescriptionInCodeSystem[] array = new DescriptionInCodeSystem[0];
        return this._knownEntityDescriptionList.toArray(array);
    }

    /**
     * Method getKnownEntityDescriptionAsReference.Returns a
     * reference to '_knownEntityDescriptionList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<DescriptionInCodeSystem> getKnownEntityDescriptionAsReference(
    ) {
        return this._knownEntityDescriptionList;
    }

    /**
     * Method getKnownEntityDescriptionCount.
     * 
     * @return the size of this collection
     */
    public int getKnownEntityDescriptionCount(
    ) {
        return this._knownEntityDescriptionList.size();
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
        if (_knownEntityDescriptionList != null) {
           result = 37 * result + _knownEntityDescriptionList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateKnownEntityDescription.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends DescriptionInCodeSystem> iterateKnownEntityDescription(
    ) {
        return this._knownEntityDescriptionList.iterator();
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
    public void removeAllKnownEntityDescription(
    ) {
        this._knownEntityDescriptionList.clear();
    }

    /**
     * Method removeKnownEntityDescription.
     * 
     * @param vKnownEntityDescription
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownEntityDescription(
            final DescriptionInCodeSystem vKnownEntityDescription) {
        return _knownEntityDescriptionList.remove(vKnownEntityDescription);
    }

    /**
     * Method removeKnownEntityDescriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public DescriptionInCodeSystem removeKnownEntityDescriptionAt(
            final int index) {
        DescriptionInCodeSystem obj = this._knownEntityDescriptionList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownEntityDescription
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownEntityDescription(
            final int index,
            final DescriptionInCodeSystem vKnownEntityDescription)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownEntityDescriptionList.size()) {
            throw new IndexOutOfBoundsException("setKnownEntityDescription: Index value '" + index + "' not in range [0.." + (this._knownEntityDescriptionList.size() - 1) + "]");
        }

        this._knownEntityDescriptionList.set(index, vKnownEntityDescription);
    }

    /**
     * 
     * 
     * @param vKnownEntityDescriptionArray
     */
    public void setKnownEntityDescription(
            final DescriptionInCodeSystem[] vKnownEntityDescriptionArray) {
        //-- copy array
        _knownEntityDescriptionList.clear();

        Collections.addAll(this._knownEntityDescriptionList, vKnownEntityDescriptionArray);
    }

    /**
     * Sets the value of '_knownEntityDescriptionList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vKnownEntityDescriptionList the Vector to copy.
     */
    public void setKnownEntityDescription(
            final java.util.List<DescriptionInCodeSystem> vKnownEntityDescriptionList) {
        // copy vector
        this._knownEntityDescriptionList.clear();

        this._knownEntityDescriptionList.addAll(vKnownEntityDescriptionList);
    }

    /**
     * Sets the value of '_knownEntityDescriptionList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownEntityDescriptionList the Vector to set.
     */
    public void setKnownEntityDescriptionAsReference(
            final java.util.List<DescriptionInCodeSystem> knownEntityDescriptionList) {
        this._knownEntityDescriptionList = knownEntityDescriptionList;
    }

    /**
     * Method unmarshalNamedEntityReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.NamedEntityReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
