/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.valuesetdefinition;

import edu.mayo.cts2.framework.model.valuesetdefinition.ResolvedValueSetSummary;
import java.util.Collections;

/**
 * Class ResolvedValueSetLoader.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ResolvedValueSetLoader extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _knownValueSetList.
     */
    private java.util.List<ResolvedValueSetSummary> _knownValueSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResolvedValueSetLoader() {
        super();
        this._knownValueSetList = new java.util.ArrayList<ResolvedValueSetSummary>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vKnownValueSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownValueSet(
            final ResolvedValueSetSummary vKnownValueSet)
    throws IndexOutOfBoundsException {
        this._knownValueSetList.add(vKnownValueSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownValueSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownValueSet(
            final int index,
            final ResolvedValueSetSummary vKnownValueSet)
    throws IndexOutOfBoundsException {
        this._knownValueSetList.add(index, vKnownValueSet);
    }

    /**
     * Method enumerateKnownValueSet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ResolvedValueSetSummary> enumerateKnownValueSet(
    ) {
        return Collections.enumeration(this._knownValueSetList);
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

        if (obj instanceof ResolvedValueSetLoader) {

            ResolvedValueSetLoader temp = (ResolvedValueSetLoader)obj;
            if (this._knownValueSetList != null) {
                if (temp._knownValueSetList == null) return false;
                return this._knownValueSetList.equals(temp._knownValueSetList);
            } else return temp._knownValueSetList == null;
        }
        return false;
    }

    /**
     * Method getKnownValueSet.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.valuesetdefinition.ResolvedValueSetSummary
     * at the given index
     */
    public ResolvedValueSetSummary getKnownValueSet(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownValueSetList.size()) {
            throw new IndexOutOfBoundsException("getKnownValueSet: Index value '" + index + "' not in range [0.." + (this._knownValueSetList.size() - 1) + "]");
        }

        return _knownValueSetList.get(index);
    }

    /**
     * Method getKnownValueSet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ResolvedValueSetSummary[] getKnownValueSet(
    ) {
        ResolvedValueSetSummary[] array = new ResolvedValueSetSummary[0];
        return this._knownValueSetList.toArray(array);
    }

    /**
     * Method getKnownValueSetAsReference.Returns a reference to
     * '_knownValueSetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ResolvedValueSetSummary> getKnownValueSetAsReference(
    ) {
        return this._knownValueSetList;
    }

    /**
     * Method getKnownValueSetCount.
     * 
     * @return the size of this collection
     */
    public int getKnownValueSetCount(
    ) {
        return this._knownValueSetList.size();
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
        if (_knownValueSetList != null) {
           result = 37 * result + _knownValueSetList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateKnownValueSet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ResolvedValueSetSummary> iterateKnownValueSet(
    ) {
        return this._knownValueSetList.iterator();
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
    public void removeAllKnownValueSet(
    ) {
        this._knownValueSetList.clear();
    }

    /**
     * Method removeKnownValueSet.
     * 
     * @param vKnownValueSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownValueSet(
            final ResolvedValueSetSummary vKnownValueSet) {
        return _knownValueSetList.remove(vKnownValueSet);
    }

    /**
     * Method removeKnownValueSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ResolvedValueSetSummary removeKnownValueSetAt(
            final int index) {
        ResolvedValueSetSummary obj = this._knownValueSetList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownValueSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownValueSet(
            final int index,
            final ResolvedValueSetSummary vKnownValueSet)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownValueSetList.size()) {
            throw new IndexOutOfBoundsException("setKnownValueSet: Index value '" + index + "' not in range [0.." + (this._knownValueSetList.size() - 1) + "]");
        }

        this._knownValueSetList.set(index, vKnownValueSet);
    }

    /**
     * 
     * 
     * @param vKnownValueSetArray
     */
    public void setKnownValueSet(
            final ResolvedValueSetSummary[] vKnownValueSetArray) {
        //-- copy array
        _knownValueSetList.clear();

        Collections.addAll(this._knownValueSetList, vKnownValueSetArray);
    }

    /**
     * Sets the value of '_knownValueSetList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vKnownValueSetList the Vector to copy.
     */
    public void setKnownValueSet(
            final java.util.List<ResolvedValueSetSummary> vKnownValueSetList) {
        // copy vector
        this._knownValueSetList.clear();

        this._knownValueSetList.addAll(vKnownValueSetList);
    }

    /**
     * Sets the value of '_knownValueSetList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownValueSetList the Vector to set.
     */
    public void setKnownValueSetAsReference(
            final java.util.List<ResolvedValueSetSummary> knownValueSetList) {
        this._knownValueSetList = knownValueSetList;
    }

    /**
     * Method unmarshalResolvedValueSetLoader.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.valuesetdefinition.ResolvedValueSetLoader
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
