/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystem;

import edu.mayo.cts2.framework.model.core.OntologyDomainReference;
import java.util.Collections;

/**
 * Class UpdatedOntologyDomains.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedOntologyDomains extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ontologyDomainList.
     */
    private java.util.List<OntologyDomainReference> _ontologyDomainList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedOntologyDomains() {
        super();
        this._ontologyDomainList = new java.util.ArrayList<OntologyDomainReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vOntologyDomain
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOntologyDomain(
            final OntologyDomainReference vOntologyDomain)
    throws IndexOutOfBoundsException {
        this._ontologyDomainList.add(vOntologyDomain);
    }

    /**
     * 
     * 
     * @param index
     * @param vOntologyDomain
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOntologyDomain(
            final int index,
            final OntologyDomainReference vOntologyDomain)
    throws IndexOutOfBoundsException {
        this._ontologyDomainList.add(index, vOntologyDomain);
    }

    /**
     * Method enumerateOntologyDomain.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends OntologyDomainReference> enumerateOntologyDomain(
    ) {
        return Collections.enumeration(this._ontologyDomainList);
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

        if (obj instanceof UpdatedOntologyDomains) {

            UpdatedOntologyDomains temp = (UpdatedOntologyDomains)obj;
            if (this._ontologyDomainList != null) {
                if (temp._ontologyDomainList == null) return false;
                return this._ontologyDomainList.equals(temp._ontologyDomainList);
            } else return temp._ontologyDomainList == null;
        }
        return false;
    }

    /**
     * Method getOntologyDomain.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.OntologyDomainReference
     * at the given index
     */
    public OntologyDomainReference getOntologyDomain(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ontologyDomainList.size()) {
            throw new IndexOutOfBoundsException("getOntologyDomain: Index value '" + index + "' not in range [0.." + (this._ontologyDomainList.size() - 1) + "]");
        }

        return _ontologyDomainList.get(index);
    }

    /**
     * Method getOntologyDomain.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public OntologyDomainReference[] getOntologyDomain(
    ) {
        OntologyDomainReference[] array = new OntologyDomainReference[0];
        return this._ontologyDomainList.toArray(array);
    }

    /**
     * Method getOntologyDomainAsReference.Returns a reference to
     * '_ontologyDomainList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<OntologyDomainReference> getOntologyDomainAsReference(
    ) {
        return this._ontologyDomainList;
    }

    /**
     * Method getOntologyDomainCount.
     * 
     * @return the size of this collection
     */
    public int getOntologyDomainCount(
    ) {
        return this._ontologyDomainList.size();
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
        if (_ontologyDomainList != null) {
           result = 37 * result + _ontologyDomainList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateOntologyDomain.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends OntologyDomainReference> iterateOntologyDomain(
    ) {
        return this._ontologyDomainList.iterator();
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
    public void removeAllOntologyDomain(
    ) {
        this._ontologyDomainList.clear();
    }

    /**
     * Method removeOntologyDomain.
     * 
     * @param vOntologyDomain
     * @return true if the object was removed from the collection.
     */
    public boolean removeOntologyDomain(
            final OntologyDomainReference vOntologyDomain) {
        return _ontologyDomainList.remove(vOntologyDomain);
    }

    /**
     * Method removeOntologyDomainAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public OntologyDomainReference removeOntologyDomainAt(
            final int index) {
        OntologyDomainReference obj = this._ontologyDomainList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vOntologyDomain
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOntologyDomain(
            final int index,
            final OntologyDomainReference vOntologyDomain)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ontologyDomainList.size()) {
            throw new IndexOutOfBoundsException("setOntologyDomain: Index value '" + index + "' not in range [0.." + (this._ontologyDomainList.size() - 1) + "]");
        }

        this._ontologyDomainList.set(index, vOntologyDomain);
    }

    /**
     * 
     * 
     * @param vOntologyDomainArray
     */
    public void setOntologyDomain(
            final OntologyDomainReference[] vOntologyDomainArray) {
        //-- copy array
        _ontologyDomainList.clear();

        Collections.addAll(this._ontologyDomainList, vOntologyDomainArray);
    }

    /**
     * Sets the value of '_ontologyDomainList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vOntologyDomainList the Vector to copy.
     */
    public void setOntologyDomain(
            final java.util.List<OntologyDomainReference> vOntologyDomainList) {
        // copy vector
        this._ontologyDomainList.clear();

        this._ontologyDomainList.addAll(vOntologyDomainList);
    }

    /**
     * Sets the value of '_ontologyDomainList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param ontologyDomainList the Vector to set.
     */
    public void setOntologyDomainAsReference(
            final java.util.List<OntologyDomainReference> ontologyDomainList) {
        this._ontologyDomainList = ontologyDomainList;
    }

    /**
     * Method unmarshalUpdatedOntologyDomains.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystem.UpdatedOntologyDomains
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
