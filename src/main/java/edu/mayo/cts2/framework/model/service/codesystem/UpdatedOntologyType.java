/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystem;

import edu.mayo.cts2.framework.model.core.OntologyTypeReference;
import java.util.Collections;

/**
 * Class UpdatedOntologyType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedOntologyType extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ontologyTypeList.
     */
    private java.util.List<OntologyTypeReference> _ontologyTypeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedOntologyType() {
        super();
        this._ontologyTypeList = new java.util.ArrayList<OntologyTypeReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOntologyType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOntologyType(
            final OntologyTypeReference vOntologyType)
    throws IndexOutOfBoundsException {
        this._ontologyTypeList.add(vOntologyType);
    }

    /**
     * 
     * 
     * @param index
     * @param vOntologyType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOntologyType(
            final int index,
            final OntologyTypeReference vOntologyType)
    throws IndexOutOfBoundsException {
        this._ontologyTypeList.add(index, vOntologyType);
    }

    /**
     * Method enumerateOntologyType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends OntologyTypeReference> enumerateOntologyType(
    ) {
        return Collections.enumeration(this._ontologyTypeList);
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

        if (obj instanceof UpdatedOntologyType) {

            UpdatedOntologyType temp = (UpdatedOntologyType)obj;
            if (this._ontologyTypeList != null) {
                if (temp._ontologyTypeList == null) return false;
                return this._ontologyTypeList.equals(temp._ontologyTypeList);
            } else return temp._ontologyTypeList == null;
        }
        return false;
    }

    /**
     * Method getOntologyType.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.OntologyTypeReference at
     * the given index
     */
    public OntologyTypeReference getOntologyType(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ontologyTypeList.size()) {
            throw new IndexOutOfBoundsException("getOntologyType: Index value '" + index + "' not in range [0.." + (this._ontologyTypeList.size() - 1) + "]");
        }

        return _ontologyTypeList.get(index);
    }

    /**
     * Method getOntologyType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public OntologyTypeReference[] getOntologyType(
    ) {
        OntologyTypeReference[] array = new OntologyTypeReference[0];
        return this._ontologyTypeList.toArray(array);
    }

    /**
     * Method getOntologyTypeAsReference.Returns a reference to
     * '_ontologyTypeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<OntologyTypeReference> getOntologyTypeAsReference(
    ) {
        return this._ontologyTypeList;
    }

    /**
     * Method getOntologyTypeCount.
     * 
     * @return the size of this collection
     */
    public int getOntologyTypeCount(
    ) {
        return this._ontologyTypeList.size();
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
        if (_ontologyTypeList != null) {
           result = 37 * result + _ontologyTypeList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateOntologyType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends OntologyTypeReference> iterateOntologyType(
    ) {
        return this._ontologyTypeList.iterator();
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
    public void removeAllOntologyType(
    ) {
        this._ontologyTypeList.clear();
    }

    /**
     * Method removeOntologyType.
     * 
     * @param vOntologyType
     * @return true if the object was removed from the collection.
     */
    public boolean removeOntologyType(
            final OntologyTypeReference vOntologyType) {
        return _ontologyTypeList.remove(vOntologyType);
    }

    /**
     * Method removeOntologyTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public OntologyTypeReference removeOntologyTypeAt(
            final int index) {
        OntologyTypeReference obj = this._ontologyTypeList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vOntologyType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOntologyType(
            final int index,
            final OntologyTypeReference vOntologyType)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ontologyTypeList.size()) {
            throw new IndexOutOfBoundsException("setOntologyType: Index value '" + index + "' not in range [0.." + (this._ontologyTypeList.size() - 1) + "]");
        }

        this._ontologyTypeList.set(index, vOntologyType);
    }

    /**
     * 
     * 
     * @param vOntologyTypeArray
     */
    public void setOntologyType(
            final OntologyTypeReference[] vOntologyTypeArray) {
        //-- copy array
        _ontologyTypeList.clear();

        Collections.addAll(this._ontologyTypeList, vOntologyTypeArray);
    }

    /**
     * Sets the value of '_ontologyTypeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vOntologyTypeList the Vector to copy.
     */
    public void setOntologyType(
            final java.util.List<OntologyTypeReference> vOntologyTypeList) {
        // copy vector
        this._ontologyTypeList.clear();

        this._ontologyTypeList.addAll(vOntologyTypeList);
    }

    /**
     * Sets the value of '_ontologyTypeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param ontologyTypeList the Vector to set.
     */
    public void setOntologyTypeAsReference(
            final java.util.List<OntologyTypeReference> ontologyTypeList) {
        this._ontologyTypeList = ontologyTypeList;
    }

    /**
     * Method unmarshalUpdatedOntologyType.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystem.UpdatedOntologyType
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
