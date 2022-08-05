/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.valuesetdefinition;

import edu.mayo.cts2.framework.model.core.VersionTagReference;
import java.util.Collections;

/**
 * Class ValueSetDefinitionReadService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetDefinitionReadService extends edu.mayo.cts2.framework.model.service.core.BaseReadService 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _knownTagList.
     */
    private java.util.List<VersionTagReference> _knownTagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetDefinitionReadService() {
        super();
        this._knownTagList = new java.util.ArrayList<VersionTagReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vKnownTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownTag(
            final VersionTagReference vKnownTag)
    throws IndexOutOfBoundsException {
        this._knownTagList.add(vKnownTag);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownTag(
            final int index,
            final VersionTagReference vKnownTag)
    throws IndexOutOfBoundsException {
        this._knownTagList.add(index, vKnownTag);
    }

    /**
     * Method enumerateKnownTag.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends VersionTagReference> enumerateKnownTag(
    ) {
        return Collections.enumeration(this._knownTagList);
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

        if (obj instanceof ValueSetDefinitionReadService) {

            ValueSetDefinitionReadService temp = (ValueSetDefinitionReadService)obj;
            if (this._knownTagList != null) {
                if (temp._knownTagList == null) return false;
                return this._knownTagList.equals(temp._knownTagList);
            } else return temp._knownTagList == null;
        }
        return false;
    }

    /**
     * Method getKnownTag.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.VersionTagReference at
     * the given index
     */
    public VersionTagReference getKnownTag(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownTagList.size()) {
            throw new IndexOutOfBoundsException("getKnownTag: Index value '" + index + "' not in range [0.." + (this._knownTagList.size() - 1) + "]");
        }

        return _knownTagList.get(index);
    }

    /**
     * Method getKnownTag.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public VersionTagReference[] getKnownTag(
    ) {
        VersionTagReference[] array = new VersionTagReference[0];
        return this._knownTagList.toArray(array);
    }

    /**
     * Method getKnownTagAsReference.Returns a reference to
     * '_knownTagList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<VersionTagReference> getKnownTagAsReference(
    ) {
        return this._knownTagList;
    }

    /**
     * Method getKnownTagCount.
     * 
     * @return the size of this collection
     */
    public int getKnownTagCount(
    ) {
        return this._knownTagList.size();
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
        if (_knownTagList != null) {
           result = 37 * result + _knownTagList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateKnownTag.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends VersionTagReference> iterateKnownTag(
    ) {
        return this._knownTagList.iterator();
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
    public void removeAllKnownTag(
    ) {
        this._knownTagList.clear();
    }

    /**
     * Method removeKnownTag.
     * 
     * @param vKnownTag
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownTag(
            final VersionTagReference vKnownTag) {
        return _knownTagList.remove(vKnownTag);
    }

    /**
     * Method removeKnownTagAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public VersionTagReference removeKnownTagAt(
            final int index) {
        VersionTagReference obj = this._knownTagList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownTag(
            final int index,
            final VersionTagReference vKnownTag)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownTagList.size()) {
            throw new IndexOutOfBoundsException("setKnownTag: Index value '" + index + "' not in range [0.." + (this._knownTagList.size() - 1) + "]");
        }

        this._knownTagList.set(index, vKnownTag);
    }

    /**
     * 
     * 
     * @param vKnownTagArray
     */
    public void setKnownTag(
            final VersionTagReference[] vKnownTagArray) {
        //-- copy array
        _knownTagList.clear();

        Collections.addAll(this._knownTagList, vKnownTagArray);
    }

    /**
     * Sets the value of '_knownTagList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vKnownTagList the Vector to copy.
     */
    public void setKnownTag(
            final java.util.List<VersionTagReference> vKnownTagList) {
        // copy vector
        this._knownTagList.clear();

        this._knownTagList.addAll(vKnownTagList);
    }

    /**
     * Sets the value of '_knownTagList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownTagList the Vector to set.
     */
    public void setKnownTagAsReference(
            final java.util.List<VersionTagReference> knownTagList) {
        this._knownTagList = knownTagList;
    }

    /**
     * Method unmarshalValueSetDefinitionReadService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.valuesetdefinition.ValueSetDefinitionReadService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
