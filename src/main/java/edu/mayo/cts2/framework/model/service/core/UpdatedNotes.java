/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.Comment;
import java.util.Collections;

/**
 * Class UpdatedNotes.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedNotes extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _noteList.
     */
    private java.util.List<Comment> _noteList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedNotes() {
        super();
        this._noteList = new java.util.ArrayList<Comment>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vNote
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNote(
            final Comment vNote)
    throws IndexOutOfBoundsException {
        this._noteList.add(vNote);
    }

    /**
     * 
     * 
     * @param index
     * @param vNote
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNote(
            final int index,
            final Comment vNote)
    throws IndexOutOfBoundsException {
        this._noteList.add(index, vNote);
    }

    /**
     * Method enumerateNote.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Comment> enumerateNote(
    ) {
        return Collections.enumeration(this._noteList);
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

        if (obj instanceof UpdatedNotes) {

            UpdatedNotes temp = (UpdatedNotes)obj;
            if (this._noteList != null) {
                if (temp._noteList == null) return false;
                return this._noteList.equals(temp._noteList);
            } else return temp._noteList == null;
        }
        return false;
    }

    /**
     * Method getNote.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Comment at the given index
     */
    public Comment getNote(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._noteList.size()) {
            throw new IndexOutOfBoundsException("getNote: Index value '" + index + "' not in range [0.." + (this._noteList.size() - 1) + "]");
        }

        return _noteList.get(index);
    }

    /**
     * Method getNote.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Comment[] getNote(
    ) {
        Comment[] array = new Comment[0];
        return this._noteList.toArray(array);
    }

    /**
     * Method getNoteAsReference.Returns a reference to
     * '_noteList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Comment> getNoteAsReference(
    ) {
        return this._noteList;
    }

    /**
     * Method getNoteCount.
     * 
     * @return the size of this collection
     */
    public int getNoteCount(
    ) {
        return this._noteList.size();
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
        if (_noteList != null) {
           result = 37 * result + _noteList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateNote.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Comment> iterateNote(
    ) {
        return this._noteList.iterator();
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
    public void removeAllNote(
    ) {
        this._noteList.clear();
    }

    /**
     * Method removeNote.
     * 
     * @param vNote
     * @return true if the object was removed from the collection.
     */
    public boolean removeNote(
            final Comment vNote) {
        return _noteList.remove(vNote);
    }

    /**
     * Method removeNoteAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Comment removeNoteAt(
            final int index) {
        Comment obj = this._noteList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vNote
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNote(
            final int index,
            final Comment vNote)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._noteList.size()) {
            throw new IndexOutOfBoundsException("setNote: Index value '" + index + "' not in range [0.." + (this._noteList.size() - 1) + "]");
        }

        this._noteList.set(index, vNote);
    }

    /**
     * 
     * 
     * @param vNoteArray
     */
    public void setNote(
            final Comment[] vNoteArray) {
        //-- copy array
        _noteList.clear();

        Collections.addAll(this._noteList, vNoteArray);
    }

    /**
     * Sets the value of '_noteList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vNoteList the Vector to copy.
     */
    public void setNote(
            final java.util.List<Comment> vNoteList) {
        // copy vector
        this._noteList.clear();

        this._noteList.addAll(vNoteList);
    }

    /**
     * Sets the value of '_noteList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param noteList the Vector to set.
     */
    public void setNoteAsReference(
            final java.util.List<Comment> noteList) {
        this._noteList = noteList;
    }

    /**
     * Method unmarshalUpdatedNotes.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedNotes
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
