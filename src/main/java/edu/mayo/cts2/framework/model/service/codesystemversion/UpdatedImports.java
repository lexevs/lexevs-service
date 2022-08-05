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
 * Class UpdatedImports.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedImports extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _importsList.
     */
    private java.util.List<NameOrURI> _importsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedImports() {
        super();
        this._importsList = new java.util.ArrayList<NameOrURI>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vImports
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImports(
            final NameOrURI vImports)
    throws IndexOutOfBoundsException {
        this._importsList.add(vImports);
    }

    /**
     * 
     * 
     * @param index
     * @param vImports
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImports(
            final int index,
            final NameOrURI vImports)
    throws IndexOutOfBoundsException {
        this._importsList.add(index, vImports);
    }

    /**
     * Method enumerateImports.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends NameOrURI> enumerateImports(
    ) {
        return Collections.enumeration(this._importsList);
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

        if (obj instanceof UpdatedImports) {

            UpdatedImports temp = (UpdatedImports)obj;
            if (this._importsList != null) {
                if (temp._importsList == null) return false;
                return this._importsList.equals(temp._importsList);
            } else return temp._importsList == null;
        }
        return false;
    }

    /**
     * Method getImports.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.service.core.NameOrURI at the
     * given index
     */
    public NameOrURI getImports(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._importsList.size()) {
            throw new IndexOutOfBoundsException("getImports: Index value '" + index + "' not in range [0.." + (this._importsList.size() - 1) + "]");
        }

        return _importsList.get(index);
    }

    /**
     * Method getImports.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public NameOrURI[] getImports(
    ) {
        NameOrURI[] array = new NameOrURI[0];
        return this._importsList.toArray(array);
    }

    /**
     * Method getImportsAsReference.Returns a reference to
     * '_importsList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<NameOrURI> getImportsAsReference(
    ) {
        return this._importsList;
    }

    /**
     * Method getImportsCount.
     * 
     * @return the size of this collection
     */
    public int getImportsCount(
    ) {
        return this._importsList.size();
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
        if (_importsList != null) {
           result = 37 * result + _importsList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateImports.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends NameOrURI> iterateImports(
    ) {
        return this._importsList.iterator();
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
    public void removeAllImports(
    ) {
        this._importsList.clear();
    }

    /**
     * Method removeImports.
     * 
     * @param vImports
     * @return true if the object was removed from the collection.
     */
    public boolean removeImports(
            final NameOrURI vImports) {
        return _importsList.remove(vImports);
    }

    /**
     * Method removeImportsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public NameOrURI removeImportsAt(
            final int index) {
        NameOrURI obj = this._importsList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vImports
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setImports(
            final int index,
            final NameOrURI vImports)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._importsList.size()) {
            throw new IndexOutOfBoundsException("setImports: Index value '" + index + "' not in range [0.." + (this._importsList.size() - 1) + "]");
        }

        this._importsList.set(index, vImports);
    }

    /**
     * 
     * 
     * @param vImportsArray
     */
    public void setImports(
            final NameOrURI[] vImportsArray) {
        //-- copy array
        _importsList.clear();

        Collections.addAll(this._importsList, vImportsArray);
    }

    /**
     * Sets the value of '_importsList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vImportsList the Vector to copy.
     */
    public void setImports(
            final java.util.List<NameOrURI> vImportsList) {
        // copy vector
        this._importsList.clear();

        this._importsList.addAll(vImportsList);
    }

    /**
     * Sets the value of '_importsList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param importsList the Vector to set.
     */
    public void setImportsAsReference(
            final java.util.List<NameOrURI> importsList) {
        this._importsList = importsList;
    }

    /**
     * Method unmarshalUpdatedImports.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystemversion.UpdatedImports
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
