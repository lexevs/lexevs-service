/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import java.util.Collections;

/**
 * Class URIList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class URIList extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _memberList.
     */
    private java.util.List<String> _memberList;


      //----------------/
     //- Constructors -/
    //----------------/

    public URIList() {
        super();
        this._memberList = new java.util.ArrayList<String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMember
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMember(
            final String vMember)
    throws IndexOutOfBoundsException {
        this._memberList.add(vMember);
    }

    /**
     * 
     * 
     * @param index
     * @param vMember
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMember(
            final int index,
            final String vMember)
    throws IndexOutOfBoundsException {
        this._memberList.add(index, vMember);
    }

    /**
     * Method enumerateMember.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends String> enumerateMember(
    ) {
        return Collections.enumeration(this._memberList);
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

        if (obj instanceof URIList) {

            URIList temp = (URIList)obj;
            if (this._memberList != null) {
                if (temp._memberList == null) return false;
                return this._memberList.equals(temp._memberList);
            } else return temp._memberList == null;
        }
        return false;
    }

    /**
     * Method getMember.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getMember(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._memberList.size()) {
            throw new IndexOutOfBoundsException("getMember: Index value '" + index + "' not in range [0.." + (this._memberList.size() - 1) + "]");
        }

        return _memberList.get(index);
    }

    /**
     * Method getMember.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getMember(
    ) {
        String[] array = new String[0];
        return this._memberList.toArray(array);
    }

    /**
     * Method getMemberAsReference.Returns a reference to
     * '_memberList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getMemberAsReference(
    ) {
        return this._memberList;
    }

    /**
     * Method getMemberCount.
     * 
     * @return the size of this collection
     */
    public int getMemberCount(
    ) {
        return this._memberList.size();
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
        if (_memberList != null) {
           result = 37 * result + _memberList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateMember.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends String> iterateMember(
    ) {
        return this._memberList.iterator();
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
    public void removeAllMember(
    ) {
        this._memberList.clear();
    }

    /**
     * Method removeMember.
     * 
     * @param vMember
     * @return true if the object was removed from the collection.
     */
    public boolean removeMember(
            final String vMember) {
        return _memberList.remove(vMember);
    }

    /**
     * Method removeMemberAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeMemberAt(
            final int index) {
        String obj = this._memberList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vMember
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMember(
            final int index,
            final String vMember)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._memberList.size()) {
            throw new IndexOutOfBoundsException("setMember: Index value '" + index + "' not in range [0.." + (this._memberList.size() - 1) + "]");
        }

        this._memberList.set(index, vMember);
    }

    /**
     * 
     * 
     * @param vMemberArray
     */
    public void setMember(
            final String[] vMemberArray) {
        //-- copy array
        _memberList.clear();

        Collections.addAll(this._memberList, vMemberArray);
    }

    /**
     * Sets the value of '_memberList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vMemberList the Vector to copy.
     */
    public void setMember(
            final java.util.List<String> vMemberList) {
        // copy vector
        this._memberList.clear();

        this._memberList.addAll(vMemberList);
    }

    /**
     * Sets the value of '_memberList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param memberList the Vector to set.
     */
    public void setMemberAsReference(
            final java.util.List<String> memberList) {
        this._memberList = memberList;
    }

    /**
     * Method unmarshalURIList.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.URIList
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
