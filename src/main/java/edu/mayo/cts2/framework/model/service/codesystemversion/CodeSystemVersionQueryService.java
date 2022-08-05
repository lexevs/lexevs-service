/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystemversion;

import edu.mayo.cts2.framework.model.core.VersionTagReference;
import java.util.Collections;

/**
 * Class CodeSystemVersionQueryService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodeSystemVersionQueryService extends edu.mayo.cts2.framework.model.service.core.BaseQueryService 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codeSystemVersions.
     */
    private String _codeSystemVersions;

    /**
     * Field _supportedTagList.
     */
    private java.util.List<VersionTagReference> _supportedTagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodeSystemVersionQueryService() {
        super();
        this._supportedTagList = new java.util.ArrayList<VersionTagReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSupportedTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedTag(
            final VersionTagReference vSupportedTag)
    throws IndexOutOfBoundsException {
        this._supportedTagList.add(vSupportedTag);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedTag(
            final int index,
            final VersionTagReference vSupportedTag)
    throws IndexOutOfBoundsException {
        this._supportedTagList.add(index, vSupportedTag);
    }

    /**
     * Method enumerateSupportedTag.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends VersionTagReference> enumerateSupportedTag(
    ) {
        return Collections.enumeration(this._supportedTagList);
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

        if (obj instanceof CodeSystemVersionQueryService) {

            CodeSystemVersionQueryService temp = (CodeSystemVersionQueryService)obj;
            if (this._codeSystemVersions != null) {
                if (temp._codeSystemVersions == null) return false;
                if (!this._codeSystemVersions.equals(temp._codeSystemVersions)) 
                    return false;
            } else if (temp._codeSystemVersions != null)
                return false;
            if (this._supportedTagList != null) {
                if (temp._supportedTagList == null) return false;
                return this._supportedTagList.equals(temp._supportedTagList);
            } else return temp._supportedTagList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystemVersions'.
     * 
     * @return the value of field 'CodeSystemVersions'.
     */
    public String getCodeSystemVersions(
    ) {
        return this._codeSystemVersions;
    }

    /**
     * Method getSupportedTag.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.VersionTagReference at
     * the given index
     */
    public VersionTagReference getSupportedTag(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedTagList.size()) {
            throw new IndexOutOfBoundsException("getSupportedTag: Index value '" + index + "' not in range [0.." + (this._supportedTagList.size() - 1) + "]");
        }

        return _supportedTagList.get(index);
    }

    /**
     * Method getSupportedTag.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public VersionTagReference[] getSupportedTag(
    ) {
        VersionTagReference[] array = new VersionTagReference[0];
        return this._supportedTagList.toArray(array);
    }

    /**
     * Method getSupportedTagAsReference.Returns a reference to
     * '_supportedTagList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<VersionTagReference> getSupportedTagAsReference(
    ) {
        return this._supportedTagList;
    }

    /**
     * Method getSupportedTagCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedTagCount(
    ) {
        return this._supportedTagList.size();
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
        if (_codeSystemVersions != null) {
           result = 37 * result + _codeSystemVersions.hashCode();
        }
        if (_supportedTagList != null) {
           result = 37 * result + _supportedTagList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateSupportedTag.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends VersionTagReference> iterateSupportedTag(
    ) {
        return this._supportedTagList.iterator();
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
    public void removeAllSupportedTag(
    ) {
        this._supportedTagList.clear();
    }

    /**
     * Method removeSupportedTag.
     * 
     * @param vSupportedTag
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedTag(
            final VersionTagReference vSupportedTag) {
        return _supportedTagList.remove(vSupportedTag);
    }

    /**
     * Method removeSupportedTagAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public VersionTagReference removeSupportedTagAt(
            final int index) {
        VersionTagReference obj = this._supportedTagList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'codeSystemVersions'.
     * 
     * @param codeSystemVersions the value of field
     * 'codeSystemVersions'.
     */
    public void setCodeSystemVersions(
            final String codeSystemVersions) {
        this._codeSystemVersions = codeSystemVersions;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedTag(
            final int index,
            final VersionTagReference vSupportedTag)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedTagList.size()) {
            throw new IndexOutOfBoundsException("setSupportedTag: Index value '" + index + "' not in range [0.." + (this._supportedTagList.size() - 1) + "]");
        }

        this._supportedTagList.set(index, vSupportedTag);
    }

    /**
     * 
     * 
     * @param vSupportedTagArray
     */
    public void setSupportedTag(
            final VersionTagReference[] vSupportedTagArray) {
        //-- copy array
        _supportedTagList.clear();

        Collections.addAll(this._supportedTagList, vSupportedTagArray);
    }

    /**
     * Sets the value of '_supportedTagList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedTagList the Vector to copy.
     */
    public void setSupportedTag(
            final java.util.List<VersionTagReference> vSupportedTagList) {
        // copy vector
        this._supportedTagList.clear();

        this._supportedTagList.addAll(vSupportedTagList);
    }

    /**
     * Sets the value of '_supportedTagList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedTagList the Vector to set.
     */
    public void setSupportedTagAsReference(
            final java.util.List<VersionTagReference> supportedTagList) {
        this._supportedTagList = supportedTagList;
    }

    /**
     * Method unmarshalCodeSystemVersionQueryService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystemversion.CodeSystemVersionQueryService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
