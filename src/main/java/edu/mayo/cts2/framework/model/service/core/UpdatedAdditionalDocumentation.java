/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import java.util.Collections;

/**
 * Class UpdatedAdditionalDocumentation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedAdditionalDocumentation extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _uriList.
     */
    private java.util.List<String> _uriList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedAdditionalDocumentation() {
        super();
        this._uriList = new java.util.ArrayList<String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vUri
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUri(
            final String vUri)
    throws IndexOutOfBoundsException {
        this._uriList.add(vUri);
    }

    /**
     * 
     * 
     * @param index
     * @param vUri
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUri(
            final int index,
            final String vUri)
    throws IndexOutOfBoundsException {
        this._uriList.add(index, vUri);
    }

    /**
     * Method enumerateUri.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends String> enumerateUri(
    ) {
        return Collections.enumeration(this._uriList);
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

        if (obj instanceof UpdatedAdditionalDocumentation) {

            UpdatedAdditionalDocumentation temp = (UpdatedAdditionalDocumentation)obj;
            if (this._uriList != null) {
                if (temp._uriList == null) return false;
                return this._uriList.equals(temp._uriList);
            } else return temp._uriList == null;
        }
        return false;
    }

    /**
     * Method getUri.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getUri(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._uriList.size()) {
            throw new IndexOutOfBoundsException("getUri: Index value '" + index + "' not in range [0.." + (this._uriList.size() - 1) + "]");
        }

        return _uriList.get(index);
    }

    /**
     * Method getUri.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getUri(
    ) {
        String[] array = new String[0];
        return this._uriList.toArray(array);
    }

    /**
     * Method getUriAsReference.Returns a reference to '_uriList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getUriAsReference(
    ) {
        return this._uriList;
    }

    /**
     * Method getUriCount.
     * 
     * @return the size of this collection
     */
    public int getUriCount(
    ) {
        return this._uriList.size();
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
        if (_uriList != null) {
           result = 37 * result + _uriList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateUri.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends String> iterateUri(
    ) {
        return this._uriList.iterator();
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
    public void removeAllUri(
    ) {
        this._uriList.clear();
    }

    /**
     * Method removeUri.
     * 
     * @param vUri
     * @return true if the object was removed from the collection.
     */
    public boolean removeUri(
            final String vUri) {
        return _uriList.remove(vUri);
    }

    /**
     * Method removeUriAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeUriAt(
            final int index) {
        String obj = this._uriList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vUri
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUri(
            final int index,
            final String vUri)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._uriList.size()) {
            throw new IndexOutOfBoundsException("setUri: Index value '" + index + "' not in range [0.." + (this._uriList.size() - 1) + "]");
        }

        this._uriList.set(index, vUri);
    }

    /**
     * 
     * 
     * @param vUriArray
     */
    public void setUri(
            final String[] vUriArray) {
        //-- copy array
        _uriList.clear();

        Collections.addAll(this._uriList, vUriArray);
    }

    /**
     * Sets the value of '_uriList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vUriList the Vector to copy.
     */
    public void setUri(
            final java.util.List<String> vUriList) {
        // copy vector
        this._uriList.clear();

        this._uriList.addAll(vUriList);
    }

    /**
     * Sets the value of '_uriList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param uriList the Vector to set.
     */
    public void setUriAsReference(
            final java.util.List<String> uriList) {
        this._uriList = uriList;
    }

    /**
     * Method unmarshalUpdatedAdditionalDocumentation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedAdditionalDocumentation
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
