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
 * 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ImportExportBase extends BaseService
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _supportedSourceAndNotationList.
     */
    private java.util.List<SourceAndNotation> _supportedSourceAndNotationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ImportExportBase() {
        super();
        this._supportedSourceAndNotationList = new java.util.ArrayList<SourceAndNotation>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSupportedSourceAndNotation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSourceAndNotation(
            final SourceAndNotation vSupportedSourceAndNotation)
    throws IndexOutOfBoundsException {
        this._supportedSourceAndNotationList.add(vSupportedSourceAndNotation);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSourceAndNotation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSourceAndNotation(
            final int index,
            final SourceAndNotation vSupportedSourceAndNotation)
    throws IndexOutOfBoundsException {
        this._supportedSourceAndNotationList.add(index, vSupportedSourceAndNotation);
    }

    /**
     * Method enumerateSupportedSourceAndNotation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends SourceAndNotation> enumerateSupportedSourceAndNotation(
    ) {
        return Collections.enumeration(this._supportedSourceAndNotationList);
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

        if (obj instanceof ImportExportBase) {

            ImportExportBase temp = (ImportExportBase)obj;
            if (this._supportedSourceAndNotationList != null) {
                if (temp._supportedSourceAndNotationList == null) return false;
                return this._supportedSourceAndNotationList.equals(temp._supportedSourceAndNotationList);
            } else return temp._supportedSourceAndNotationList == null;
        }
        return false;
    }

    /**
     * Method getSupportedSourceAndNotation.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.SourceAndNotation at the
     * given index
     */
    public SourceAndNotation getSupportedSourceAndNotation(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSourceAndNotationList.size()) {
            throw new IndexOutOfBoundsException("getSupportedSourceAndNotation: Index value '" + index + "' not in range [0.." + (this._supportedSourceAndNotationList.size() - 1) + "]");
        }

        return _supportedSourceAndNotationList.get(index);
    }

    /**
     * Method getSupportedSourceAndNotation.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public SourceAndNotation[] getSupportedSourceAndNotation(
    ) {
        SourceAndNotation[] array = new SourceAndNotation[0];
        return this._supportedSourceAndNotationList.toArray(array);
    }

    /**
     * Method getSupportedSourceAndNotationAsReference.Returns a
     * reference to '_supportedSourceAndNotationList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<SourceAndNotation> getSupportedSourceAndNotationAsReference(
    ) {
        return this._supportedSourceAndNotationList;
    }

    /**
     * Method getSupportedSourceAndNotationCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedSourceAndNotationCount(
    ) {
        return this._supportedSourceAndNotationList.size();
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
        if (_supportedSourceAndNotationList != null) {
           result = 37 * result + _supportedSourceAndNotationList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateSupportedSourceAndNotation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends SourceAndNotation> iterateSupportedSourceAndNotation(
    ) {
        return this._supportedSourceAndNotationList.iterator();
    }

    /**
     */
    public void removeAllSupportedSourceAndNotation(
    ) {
        this._supportedSourceAndNotationList.clear();
    }

    /**
     * Method removeSupportedSourceAndNotation.
     * 
     * @param vSupportedSourceAndNotation
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedSourceAndNotation(
            final SourceAndNotation vSupportedSourceAndNotation) {
        return _supportedSourceAndNotationList.remove(vSupportedSourceAndNotation);
    }

    /**
     * Method removeSupportedSourceAndNotationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public SourceAndNotation removeSupportedSourceAndNotationAt(
            final int index) {
        SourceAndNotation obj = this._supportedSourceAndNotationList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSourceAndNotation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedSourceAndNotation(
            final int index,
            final SourceAndNotation vSupportedSourceAndNotation)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSourceAndNotationList.size()) {
            throw new IndexOutOfBoundsException("setSupportedSourceAndNotation: Index value '" + index + "' not in range [0.." + (this._supportedSourceAndNotationList.size() - 1) + "]");
        }

        this._supportedSourceAndNotationList.set(index, vSupportedSourceAndNotation);
    }

    /**
     * 
     * 
     * @param vSupportedSourceAndNotationArray
     */
    public void setSupportedSourceAndNotation(
            final SourceAndNotation[] vSupportedSourceAndNotationArray) {
        //-- copy array
        _supportedSourceAndNotationList.clear();

        Collections.addAll(this._supportedSourceAndNotationList, vSupportedSourceAndNotationArray);
    }

    /**
     * Sets the value of '_supportedSourceAndNotationList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vSupportedSourceAndNotationList the Vector to copy.
     */
    public void setSupportedSourceAndNotation(
            final java.util.List<SourceAndNotation> vSupportedSourceAndNotationList) {
        // copy vector
        this._supportedSourceAndNotationList.clear();

        this._supportedSourceAndNotationList.addAll(vSupportedSourceAndNotationList);
    }

    /**
     * Sets the value of '_supportedSourceAndNotationList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param supportedSourceAndNotationList the Vector to set.
     */
    public void setSupportedSourceAndNotationAsReference(
            final java.util.List<SourceAndNotation> supportedSourceAndNotationList) {
        this._supportedSourceAndNotationList = supportedSourceAndNotationList;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
