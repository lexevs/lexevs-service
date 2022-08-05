/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import java.util.Collections;

/**
 * Class UpdatedKeywords.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedKeywords extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _keywordList.
     */
    private java.util.List<String> _keywordList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedKeywords() {
        super();
        this._keywordList = new java.util.ArrayList<String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vKeyword
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKeyword(
            final String vKeyword)
    throws IndexOutOfBoundsException {
        this._keywordList.add(vKeyword);
    }

    /**
     * 
     * 
     * @param index
     * @param vKeyword
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKeyword(
            final int index,
            final String vKeyword)
    throws IndexOutOfBoundsException {
        this._keywordList.add(index, vKeyword);
    }

    /**
     * Method enumerateKeyword.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends String> enumerateKeyword(
    ) {
        return Collections.enumeration(this._keywordList);
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

        if (obj instanceof UpdatedKeywords) {

            UpdatedKeywords temp = (UpdatedKeywords)obj;
            if (this._keywordList != null) {
                if (temp._keywordList == null) return false;
                return this._keywordList.equals(temp._keywordList);
            } else return temp._keywordList == null;
        }
        return false;
    }

    /**
     * Method getKeyword.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getKeyword(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._keywordList.size()) {
            throw new IndexOutOfBoundsException("getKeyword: Index value '" + index + "' not in range [0.." + (this._keywordList.size() - 1) + "]");
        }

        return _keywordList.get(index);
    }

    /**
     * Method getKeyword.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getKeyword(
    ) {
        String[] array = new String[0];
        return this._keywordList.toArray(array);
    }

    /**
     * Method getKeywordAsReference.Returns a reference to
     * '_keywordList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getKeywordAsReference(
    ) {
        return this._keywordList;
    }

    /**
     * Method getKeywordCount.
     * 
     * @return the size of this collection
     */
    public int getKeywordCount(
    ) {
        return this._keywordList.size();
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
        if (_keywordList != null) {
           result = 37 * result + _keywordList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateKeyword.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends String> iterateKeyword(
    ) {
        return this._keywordList.iterator();
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
    public void removeAllKeyword(
    ) {
        this._keywordList.clear();
    }

    /**
     * Method removeKeyword.
     * 
     * @param vKeyword
     * @return true if the object was removed from the collection.
     */
    public boolean removeKeyword(
            final String vKeyword) {
        return _keywordList.remove(vKeyword);
    }

    /**
     * Method removeKeywordAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeKeywordAt(
            final int index) {
        String obj = this._keywordList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vKeyword
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKeyword(
            final int index,
            final String vKeyword)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._keywordList.size()) {
            throw new IndexOutOfBoundsException("setKeyword: Index value '" + index + "' not in range [0.." + (this._keywordList.size() - 1) + "]");
        }

        this._keywordList.set(index, vKeyword);
    }

    /**
     * 
     * 
     * @param vKeywordArray
     */
    public void setKeyword(
            final String[] vKeywordArray) {
        //-- copy array
        _keywordList.clear();

        Collections.addAll(this._keywordList, vKeywordArray);
    }

    /**
     * Sets the value of '_keywordList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vKeywordList the Vector to copy.
     */
    public void setKeyword(
            final java.util.List<String> vKeywordList) {
        // copy vector
        this._keywordList.clear();

        this._keywordList.addAll(vKeywordList);
    }

    /**
     * Sets the value of '_keywordList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param keywordList the Vector to set.
     */
    public void setKeywordAsReference(
            final java.util.List<String> keywordList) {
        this._keywordList = keywordList;
    }

    /**
     * Method unmarshalUpdatedKeywords.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedKeywords
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
