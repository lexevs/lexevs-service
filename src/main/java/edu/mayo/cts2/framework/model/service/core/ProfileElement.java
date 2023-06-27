/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import java.util.Collections;

/**
 * Class ProfileElement.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ProfileElement extends edu.mayo.cts2.framework.model.BaseCts2ModelObject  implements Comparable
, java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A resource that is implemented by a service instance
     */
    private edu.mayo.cts2.framework.model.service.core.types.StructuralProfile _structuralProfile;

    /**
     * A functional profile that the service instance supports for
     * the corresponding structure
     */
    private java.util.List<FunctionalProfileEntry> _functionalProfileList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProfileElement() {
        super();
        this._functionalProfileList = new java.util.ArrayList<FunctionalProfileEntry>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vFunctionalProfile
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFunctionalProfile(
            final FunctionalProfileEntry vFunctionalProfile)
    throws IndexOutOfBoundsException {
        this._functionalProfileList.add(vFunctionalProfile);
    }

    /**
     * 
     * 
     * @param index
     * @param vFunctionalProfile
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFunctionalProfile(
            final int index,
            final FunctionalProfileEntry vFunctionalProfile)
    throws IndexOutOfBoundsException {
        this._functionalProfileList.add(index, vFunctionalProfile);
    }

    /**
     * Method enumerateFunctionalProfile.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends FunctionalProfileEntry> enumerateFunctionalProfile(
    ) {
        return Collections.enumeration(this._functionalProfileList);
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

        if (obj instanceof ProfileElement) {

            ProfileElement temp = (ProfileElement)obj;
            if (this._structuralProfile != null) {
                if (temp._structuralProfile == null) return false;
                if (!this._structuralProfile.equals(temp._structuralProfile)) 
                    return false;
            } else if (temp._structuralProfile != null)
                return false;
            if (this._functionalProfileList != null) {
                if (temp._functionalProfileList == null) return false;
                return this._functionalProfileList.equals(temp._functionalProfileList);
            } else return temp._functionalProfileList == null;
        }
        return false;
    }

    /**
     * Method getFunctionalProfile.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.service.core.FunctionalProfileEntry
     * at the given index
     */
    public FunctionalProfileEntry getFunctionalProfile(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._functionalProfileList.size()) {
            throw new IndexOutOfBoundsException("getFunctionalProfile: Index value '" + index + "' not in range [0.." + (this._functionalProfileList.size() - 1) + "]");
        }

        return _functionalProfileList.get(index);
    }

    /**
     * Method getFunctionalProfile.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public FunctionalProfileEntry[] getFunctionalProfile(
    ) {
        FunctionalProfileEntry[] array = new FunctionalProfileEntry[0];
        return this._functionalProfileList.toArray(array);
    }

    /**
     * Method getFunctionalProfileAsReference.Returns a reference
     * to '_functionalProfileList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<FunctionalProfileEntry> getFunctionalProfileAsReference(
    ) {
        return this._functionalProfileList;
    }

    /**
     * Method getFunctionalProfileCount.
     * 
     * @return the size of this collection
     */
    public int getFunctionalProfileCount(
    ) {
        return this._functionalProfileList.size();
    }

    /**
     * Returns the value of field 'structuralProfile'. The field
     * 'structuralProfile' has the following description: A
     * resource that is implemented by a service instance
     * 
     * @return the value of field 'StructuralProfile'.
     */
    public edu.mayo.cts2.framework.model.service.core.types.StructuralProfile getStructuralProfile(
    ) {
        return this._structuralProfile;
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
        if (_structuralProfile != null) {
           result = 37 * result + _structuralProfile.hashCode();
        }
        if (_functionalProfileList != null) {
           result = 37 * result + _functionalProfileList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateFunctionalProfile.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends FunctionalProfileEntry> iterateFunctionalProfile(
    ) {
        return this._functionalProfileList.iterator();
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
    public void removeAllFunctionalProfile(
    ) {
        this._functionalProfileList.clear();
    }

    /**
     * Method removeFunctionalProfile.
     * 
     * @param vFunctionalProfile
     * @return true if the object was removed from the collection.
     */
    public boolean removeFunctionalProfile(
            final FunctionalProfileEntry vFunctionalProfile) {
        return _functionalProfileList.remove(vFunctionalProfile);
    }

    /**
     * Method removeFunctionalProfileAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public FunctionalProfileEntry removeFunctionalProfileAt(
            final int index) {
        FunctionalProfileEntry obj = this._functionalProfileList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vFunctionalProfile
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setFunctionalProfile(
            final int index,
            final FunctionalProfileEntry vFunctionalProfile)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._functionalProfileList.size()) {
            throw new IndexOutOfBoundsException("setFunctionalProfile: Index value '" + index + "' not in range [0.." + (this._functionalProfileList.size() - 1) + "]");
        }

        this._functionalProfileList.set(index, vFunctionalProfile);
    }

    /**
     * 
     * 
     * @param vFunctionalProfileArray
     */
    public void setFunctionalProfile(
            final FunctionalProfileEntry[] vFunctionalProfileArray) {
        //-- copy array
        _functionalProfileList.clear();

        Collections.addAll(this._functionalProfileList, vFunctionalProfileArray);
    }

    /**
     * Sets the value of '_functionalProfileList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vFunctionalProfileList the Vector to copy.
     */
    public void setFunctionalProfile(
            final java.util.List<FunctionalProfileEntry> vFunctionalProfileList) {
        // copy vector
        this._functionalProfileList.clear();

        this._functionalProfileList.addAll(vFunctionalProfileList);
    }

    /**
     * Sets the value of '_functionalProfileList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param functionalProfileList the Vector to set.
     */
    public void setFunctionalProfileAsReference(
            final java.util.List<FunctionalProfileEntry> functionalProfileList) {
        this._functionalProfileList = functionalProfileList;
    }

    /**
     * Sets the value of field 'structuralProfile'. The field
     * 'structuralProfile' has the following description: A
     * resource that is implemented by a service instance
     * 
     * @param structuralProfile the value of field
     * 'structuralProfile'.
     */
    public void setStructuralProfile(
            final edu.mayo.cts2.framework.model.service.core.types.StructuralProfile structuralProfile) {
        this._structuralProfile = structuralProfile;
    }


    public int compareTo(ProfileElement o) {
        if(o.getStructuralProfile().equals(this.getStructuralProfile())){
            //compare functional profiles
                return o.getFunctionalProfile().toString().compareTo(this.getFunctionalProfile().toString());
        } else {
            String a = o.getStructuralProfile().toString() + o.getFunctionalProfile().toString();
            String b = this.getStructuralProfile().toString() + this.getFunctionalProfile().toString();
            return a.compareTo(b);

            }

    }

    public int compareTo(Object o) {
        if(o instanceof ProfileElement){
            return compareTo((ProfileElement)o);
        } else {
            return 0;
        }
    }

    /**
     * Method unmarshalProfileElement.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.ProfileElement
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
