/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.SourceAndNotation;
import java.util.Collections;

/**
 * Class UpdatedReleaseFormats.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedReleaseFormats extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _releaseFormatList.
     */
    private java.util.List<SourceAndNotation> _releaseFormatList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedReleaseFormats() {
        super();
        this._releaseFormatList = new java.util.ArrayList<SourceAndNotation>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vReleaseFormat
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReleaseFormat(
            final SourceAndNotation vReleaseFormat)
    throws IndexOutOfBoundsException {
        this._releaseFormatList.add(vReleaseFormat);
    }

    /**
     * 
     * 
     * @param index
     * @param vReleaseFormat
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReleaseFormat(
            final int index,
            final SourceAndNotation vReleaseFormat)
    throws IndexOutOfBoundsException {
        this._releaseFormatList.add(index, vReleaseFormat);
    }

    /**
     * Method enumerateReleaseFormat.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends SourceAndNotation> enumerateReleaseFormat(
    ) {
        return Collections.enumeration(this._releaseFormatList);
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

        if (obj instanceof UpdatedReleaseFormats) {

            UpdatedReleaseFormats temp = (UpdatedReleaseFormats)obj;
            if (this._releaseFormatList != null) {
                if (temp._releaseFormatList == null) return false;
                return this._releaseFormatList.equals(temp._releaseFormatList);
            } else return temp._releaseFormatList == null;
        }
        return false;
    }

    /**
     * Method getReleaseFormat.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.SourceAndNotation at the
     * given index
     */
    public SourceAndNotation getReleaseFormat(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._releaseFormatList.size()) {
            throw new IndexOutOfBoundsException("getReleaseFormat: Index value '" + index + "' not in range [0.." + (this._releaseFormatList.size() - 1) + "]");
        }

        return _releaseFormatList.get(index);
    }

    /**
     * Method getReleaseFormat.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public SourceAndNotation[] getReleaseFormat(
    ) {
        SourceAndNotation[] array = new SourceAndNotation[0];
        return this._releaseFormatList.toArray(array);
    }

    /**
     * Method getReleaseFormatAsReference.Returns a reference to
     * '_releaseFormatList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<SourceAndNotation> getReleaseFormatAsReference(
    ) {
        return this._releaseFormatList;
    }

    /**
     * Method getReleaseFormatCount.
     * 
     * @return the size of this collection
     */
    public int getReleaseFormatCount(
    ) {
        return this._releaseFormatList.size();
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
        if (_releaseFormatList != null) {
           result = 37 * result + _releaseFormatList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateReleaseFormat.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends SourceAndNotation> iterateReleaseFormat(
    ) {
        return this._releaseFormatList.iterator();
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
    public void removeAllReleaseFormat(
    ) {
        this._releaseFormatList.clear();
    }

    /**
     * Method removeReleaseFormat.
     * 
     * @param vReleaseFormat
     * @return true if the object was removed from the collection.
     */
    public boolean removeReleaseFormat(
            final SourceAndNotation vReleaseFormat) {
        return _releaseFormatList.remove(vReleaseFormat);
    }

    /**
     * Method removeReleaseFormatAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public SourceAndNotation removeReleaseFormatAt(
            final int index) {
        SourceAndNotation obj = this._releaseFormatList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vReleaseFormat
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setReleaseFormat(
            final int index,
            final SourceAndNotation vReleaseFormat)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._releaseFormatList.size()) {
            throw new IndexOutOfBoundsException("setReleaseFormat: Index value '" + index + "' not in range [0.." + (this._releaseFormatList.size() - 1) + "]");
        }

        this._releaseFormatList.set(index, vReleaseFormat);
    }

    /**
     * 
     * 
     * @param vReleaseFormatArray
     */
    public void setReleaseFormat(
            final SourceAndNotation[] vReleaseFormatArray) {
        //-- copy array
        _releaseFormatList.clear();

        Collections.addAll(this._releaseFormatList, vReleaseFormatArray);
    }

    /**
     * Sets the value of '_releaseFormatList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vReleaseFormatList the Vector to copy.
     */
    public void setReleaseFormat(
            final java.util.List<SourceAndNotation> vReleaseFormatList) {
        // copy vector
        this._releaseFormatList.clear();

        this._releaseFormatList.addAll(vReleaseFormatList);
    }

    /**
     * Sets the value of '_releaseFormatList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param releaseFormatList the Vector to set.
     */
    public void setReleaseFormatAsReference(
            final java.util.List<SourceAndNotation> releaseFormatList) {
        this._releaseFormatList = releaseFormatList;
    }

    /**
     * Method unmarshalUpdatedReleaseFormats.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedReleaseFormats
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
