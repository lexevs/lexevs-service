/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystemversion;

import edu.mayo.cts2.framework.model.service.core.NameOrURI;
import java.util.Collections;

/**
 * Class UpdatedUtilizes.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedUtilizes extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _utilizesList.
     */
    private java.util.List<NameOrURI> _utilizesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedUtilizes() {
        super();
        this._utilizesList = new java.util.ArrayList<NameOrURI>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vUtilizes
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUtilizes(
            final NameOrURI vUtilizes)
    throws IndexOutOfBoundsException {
        this._utilizesList.add(vUtilizes);
    }

    /**
     * 
     * 
     * @param index
     * @param vUtilizes
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUtilizes(
            final int index,
            final NameOrURI vUtilizes)
    throws IndexOutOfBoundsException {
        this._utilizesList.add(index, vUtilizes);
    }

    /**
     * Method enumerateUtilizes.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends NameOrURI> enumerateUtilizes(
    ) {
        return Collections.enumeration(this._utilizesList);
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

        if (obj instanceof UpdatedUtilizes) {

            UpdatedUtilizes temp = (UpdatedUtilizes)obj;
            if (this._utilizesList != null) {
                if (temp._utilizesList == null) return false;
                return this._utilizesList.equals(temp._utilizesList);
            } else return temp._utilizesList == null;
        }
        return false;
    }

    /**
     * Method getUtilizes.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.service.core.NameOrURI at the
     * given index
     */
    public NameOrURI getUtilizes(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._utilizesList.size()) {
            throw new IndexOutOfBoundsException("getUtilizes: Index value '" + index + "' not in range [0.." + (this._utilizesList.size() - 1) + "]");
        }

        return _utilizesList.get(index);
    }

    /**
     * Method getUtilizes.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public NameOrURI[] getUtilizes(
    ) {
        NameOrURI[] array = new NameOrURI[0];
        return this._utilizesList.toArray(array);
    }

    /**
     * Method getUtilizesAsReference.Returns a reference to
     * '_utilizesList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<NameOrURI> getUtilizesAsReference(
    ) {
        return this._utilizesList;
    }

    /**
     * Method getUtilizesCount.
     * 
     * @return the size of this collection
     */
    public int getUtilizesCount(
    ) {
        return this._utilizesList.size();
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
        if (_utilizesList != null) {
           result = 37 * result + _utilizesList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateUtilizes.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends NameOrURI> iterateUtilizes(
    ) {
        return this._utilizesList.iterator();
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
    public void removeAllUtilizes(
    ) {
        this._utilizesList.clear();
    }

    /**
     * Method removeUtilizes.
     * 
     * @param vUtilizes
     * @return true if the object was removed from the collection.
     */
    public boolean removeUtilizes(
            final NameOrURI vUtilizes) {
        return _utilizesList.remove(vUtilizes);
    }

    /**
     * Method removeUtilizesAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public NameOrURI removeUtilizesAt(
            final int index) {
        NameOrURI obj = this._utilizesList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vUtilizes
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUtilizes(
            final int index,
            final NameOrURI vUtilizes)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._utilizesList.size()) {
            throw new IndexOutOfBoundsException("setUtilizes: Index value '" + index + "' not in range [0.." + (this._utilizesList.size() - 1) + "]");
        }

        this._utilizesList.set(index, vUtilizes);
    }

    /**
     * 
     * 
     * @param vUtilizesArray
     */
    public void setUtilizes(
            final NameOrURI[] vUtilizesArray) {
        //-- copy array
        _utilizesList.clear();

        Collections.addAll(this._utilizesList, vUtilizesArray);
    }

    /**
     * Sets the value of '_utilizesList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vUtilizesList the Vector to copy.
     */
    public void setUtilizes(
            final java.util.List<NameOrURI> vUtilizesList) {
        // copy vector
        this._utilizesList.clear();

        this._utilizesList.addAll(vUtilizesList);
    }

    /**
     * Sets the value of '_utilizesList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param utilizesList the Vector to set.
     */
    public void setUtilizesAsReference(
            final java.util.List<NameOrURI> utilizesList) {
        this._utilizesList = utilizesList;
    }

    /**
     * Method unmarshalUpdatedUtilizes.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystemversion.UpdatedUtilizes
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
