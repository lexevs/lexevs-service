/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

import java.util.Collections;

/**
 * An opaque inner type that can contain any well-formed, but
 * arbitrary information.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class TsAnyType extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    protected String _content = null;

    /**
     * Field _anyObject.
     */
    private java.util.List<Object> _anyObject;


      //----------------/
     //- Constructors -/
    //----------------/

    public TsAnyType() {
        super();
        setContent("");
        this._anyObject = new java.util.ArrayList<Object>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAnyObject
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAnyObject(
            final Object vAnyObject)
    throws IndexOutOfBoundsException {
        this._anyObject.add(vAnyObject);
    }

    /**
     * 
     * 
     * @param index
     * @param vAnyObject
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAnyObject(
            final int index,
            final Object vAnyObject)
    throws IndexOutOfBoundsException {
        this._anyObject.add(index, vAnyObject);
    }

    /**
     * Method enumerateAnyObject.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<?> enumerateAnyObject(
    ) {
        return Collections.enumeration(this._anyObject);
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

        if (obj instanceof TsAnyType) {

            TsAnyType temp = (TsAnyType)obj;
            if (this._content != null) {
                if (temp._content == null) return false;
                if (!this._content.equals(temp._content)) 
                    return false;
            } else if (temp._content != null)
                return false;
            if (this._anyObject != null) {
                if (temp._anyObject == null) return false;
                return this._anyObject.equals(temp._anyObject);
            } else return temp._anyObject == null;
        }
        return false;
    }

    /**
     * Method getAnyObject.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.Object at the given index
     */
    public Object getAnyObject(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._anyObject.size()) {
            throw new IndexOutOfBoundsException("getAnyObject: Index value '" + index + "' not in range [0.." + (this._anyObject.size() - 1) + "]");
        }

        return _anyObject.get(index);
    }

    /**
     * Method getAnyObject.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Object[] getAnyObject(
    ) {
        Object[] array = new Object[0];
        return this._anyObject.toArray(array);
    }

    /**
     * Method getAnyObjectAsReference.Returns a reference to
     * '_anyObject'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Object> getAnyObjectAsReference(
    ) {
        return this._anyObject;
    }

    /**
     * Method getAnyObjectCount.
     * 
     * @return the size of this collection
     */
    public int getAnyObjectCount(
    ) {
        return this._anyObject.size();
    }

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'Content'.
     */
    public String getContent(
    ) {
        return this._content;
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
        if (_content != null) {
           result = 37 * result + _content.hashCode();
        }
        if (_anyObject != null) {
           result = 37 * result + _anyObject.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateAnyObject.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<?> iterateAnyObject(
    ) {
        return this._anyObject.iterator();
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
    public void removeAllAnyObject(
    ) {
        this._anyObject.clear();
    }

    /**
     * Method removeAnyObject.
     * 
     * @param vAnyObject
     * @return true if the object was removed from the collection.
     */
    public boolean removeAnyObject(
            final Object vAnyObject) {
        return _anyObject.remove(vAnyObject);
    }

    /**
     * Method removeAnyObjectAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Object removeAnyObjectAt(
            final int index) {
        Object obj = this._anyObject.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAnyObject
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAnyObject(
            final int index,
            final Object vAnyObject)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._anyObject.size()) {
            throw new IndexOutOfBoundsException("setAnyObject: Index value '" + index + "' not in range [0.." + (this._anyObject.size() - 1) + "]");
        }

        this._anyObject.set(index, vAnyObject);
    }

    /**
     * 
     * 
     * @param vAnyObjectArray
     */
    public void setAnyObject(
            final Object[] vAnyObjectArray) {
        //-- copy array
        _anyObject.clear();

        Collections.addAll(this._anyObject, vAnyObjectArray);
    }

    /**
     * Sets the value of '_anyObject' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vAnyObjectList the Vector to copy.
     */
    public void setAnyObject(
            final java.util.List<Object> vAnyObjectList) {
        // copy vector
        this._anyObject.clear();

        this._anyObject.addAll(vAnyObjectList);
    }

    /**
     * Sets the value of '_anyObject' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param anyObjectList the Vector to set.
     */
    public void setAnyObjectAsReference(
            final java.util.List<Object> anyObjectList) {
        this._anyObject = anyObjectList;
    }

    /**
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(
            final String content) {
        this._content = content;
    }

    /**
     * Method unmarshalTsAnyType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.TsAnyType
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
