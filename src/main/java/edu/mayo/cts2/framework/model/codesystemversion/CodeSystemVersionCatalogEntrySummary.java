/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.codesystemversion;

import edu.mayo.cts2.framework.model.core.VersionTagReference;
import java.util.Collections;

/**
 * A synopsis of a CodeSystemVersion along with information about
 * how to access the complete resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodeSystemVersionCatalogEntrySummary extends edu.mayo.cts2.framework.model.core.ResourceVersionDescriptionDirectoryEntry 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an identifier that uniquely names this particular code
     * system version within the context of the CTS2 service
     * instance.
     */
    private String _codeSystemVersionName;

    /**
     * the name, URI and, if supported by the service, link to the
     * code system that this version represents.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemReference _versionOf;

    /**
     * the tag(s) assigned to this version by the service provider.
     * codeSystemVersionTag identifies any roles that this version
     * plays within the workflow of the current provider. As an
     * example,
     *  a provider might assign the tags of "production" and
     * "current" to a given code system version. With the exception
     * of CURRENT the semantics of VersionTag are determined by the
     * service
     *  provider.
     */
    private java.util.List<VersionTagReference> _codeSystemVersionTagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodeSystemVersionCatalogEntrySummary() {
        super();
        this._codeSystemVersionTagList = new java.util.ArrayList<VersionTagReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCodeSystemVersionTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodeSystemVersionTag(
            final VersionTagReference vCodeSystemVersionTag)
    throws IndexOutOfBoundsException {
        this._codeSystemVersionTagList.add(vCodeSystemVersionTag);
    }

    /**
     * 
     * 
     * @param index
     * @param vCodeSystemVersionTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCodeSystemVersionTag(
            final int index,
            final VersionTagReference vCodeSystemVersionTag)
    throws IndexOutOfBoundsException {
        this._codeSystemVersionTagList.add(index, vCodeSystemVersionTag);
    }

    /**
     * Method enumerateCodeSystemVersionTag.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends VersionTagReference> enumerateCodeSystemVersionTag(
    ) {
        return Collections.enumeration(this._codeSystemVersionTagList);
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

        if (obj instanceof CodeSystemVersionCatalogEntrySummary) {

            CodeSystemVersionCatalogEntrySummary temp = (CodeSystemVersionCatalogEntrySummary)obj;
            if (this._codeSystemVersionName != null) {
                if (temp._codeSystemVersionName == null) return false;
                if (!this._codeSystemVersionName.equals(temp._codeSystemVersionName)) 
                    return false;
            } else if (temp._codeSystemVersionName != null)
                return false;
            if (this._versionOf != null) {
                if (temp._versionOf == null) return false;
                if (!this._versionOf.equals(temp._versionOf)) 
                    return false;
            } else if (temp._versionOf != null)
                return false;
            if (this._codeSystemVersionTagList != null) {
                if (temp._codeSystemVersionTagList == null) return false;
                return this._codeSystemVersionTagList.equals(temp._codeSystemVersionTagList);
            } else return temp._codeSystemVersionTagList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystemVersionName'. The
     * field 'codeSystemVersionName' has the following description:
     * an identifier that uniquely names this particular code
     * system version within the context of the CTS2 service
     * instance.
     * 
     * @return the value of field 'CodeSystemVersionName'.
     */
    public String getCodeSystemVersionName(
    ) {
        return this._codeSystemVersionName;
    }

    /**
     * Method getCodeSystemVersionTag.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.VersionTagReference at
     * the given index
     */
    public VersionTagReference getCodeSystemVersionTag(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codeSystemVersionTagList.size()) {
            throw new IndexOutOfBoundsException("getCodeSystemVersionTag: Index value '" + index + "' not in range [0.." + (this._codeSystemVersionTagList.size() - 1) + "]");
        }

        return _codeSystemVersionTagList.get(index);
    }

    /**
     * Method getCodeSystemVersionTag.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public VersionTagReference[] getCodeSystemVersionTag(
    ) {
        VersionTagReference[] array = new VersionTagReference[0];
        return this._codeSystemVersionTagList.toArray(array);
    }

    /**
     * Method getCodeSystemVersionTagAsReference.Returns a
     * reference to '_codeSystemVersionTagList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<VersionTagReference> getCodeSystemVersionTagAsReference(
    ) {
        return this._codeSystemVersionTagList;
    }

    /**
     * Method getCodeSystemVersionTagCount.
     * 
     * @return the size of this collection
     */
    public int getCodeSystemVersionTagCount(
    ) {
        return this._codeSystemVersionTagList.size();
    }

    /**
     * Returns the value of field 'versionOf'. The field
     * 'versionOf' has the following description: the name, URI
     * and, if supported by the service, link to the code system
     * that this version represents.
     * 
     * @return the value of field 'VersionOf'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemReference getVersionOf(
    ) {
        return this._versionOf;
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
        if (_codeSystemVersionName != null) {
           result = 37 * result + _codeSystemVersionName.hashCode();
        }
        if (_versionOf != null) {
           result = 37 * result + _versionOf.hashCode();
        }
        if (_codeSystemVersionTagList != null) {
           result = 37 * result + _codeSystemVersionTagList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateCodeSystemVersionTag.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends VersionTagReference> iterateCodeSystemVersionTag(
    ) {
        return this._codeSystemVersionTagList.iterator();
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
    public void removeAllCodeSystemVersionTag(
    ) {
        this._codeSystemVersionTagList.clear();
    }

    /**
     * Method removeCodeSystemVersionTag.
     * 
     * @param vCodeSystemVersionTag
     * @return true if the object was removed from the collection.
     */
    public boolean removeCodeSystemVersionTag(
            final VersionTagReference vCodeSystemVersionTag) {
        return _codeSystemVersionTagList.remove(vCodeSystemVersionTag);
    }

    /**
     * Method removeCodeSystemVersionTagAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public VersionTagReference removeCodeSystemVersionTagAt(
            final int index) {
        VersionTagReference obj = this._codeSystemVersionTagList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'codeSystemVersionName'. The field
     * 'codeSystemVersionName' has the following description: an
     * identifier that uniquely names this particular code system
     * version within the context of the CTS2 service instance.
     * 
     * @param codeSystemVersionName the value of field
     * 'codeSystemVersionName'.
     */
    public void setCodeSystemVersionName(
            final String codeSystemVersionName) {
        this._codeSystemVersionName = codeSystemVersionName;
    }

    /**
     * 
     * 
     * @param index
     * @param vCodeSystemVersionTag
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCodeSystemVersionTag(
            final int index,
            final VersionTagReference vCodeSystemVersionTag)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._codeSystemVersionTagList.size()) {
            throw new IndexOutOfBoundsException("setCodeSystemVersionTag: Index value '" + index + "' not in range [0.." + (this._codeSystemVersionTagList.size() - 1) + "]");
        }

        this._codeSystemVersionTagList.set(index, vCodeSystemVersionTag);
    }

    /**
     * 
     * 
     * @param vCodeSystemVersionTagArray
     */
    public void setCodeSystemVersionTag(
            final VersionTagReference[] vCodeSystemVersionTagArray) {
        //-- copy array
        _codeSystemVersionTagList.clear();

        Collections.addAll(this._codeSystemVersionTagList, vCodeSystemVersionTagArray);
    }

    /**
     * Sets the value of '_codeSystemVersionTagList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vCodeSystemVersionTagList the Vector to copy.
     */
    public void setCodeSystemVersionTag(
            final java.util.List<VersionTagReference> vCodeSystemVersionTagList) {
        // copy vector
        this._codeSystemVersionTagList.clear();

        this._codeSystemVersionTagList.addAll(vCodeSystemVersionTagList);
    }

    /**
     * Sets the value of '_codeSystemVersionTagList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param codeSystemVersionTagList the Vector to set.
     */
    public void setCodeSystemVersionTagAsReference(
            final java.util.List<VersionTagReference> codeSystemVersionTagList) {
        this._codeSystemVersionTagList = codeSystemVersionTagList;
    }

    /**
     * Sets the value of field 'versionOf'. The field 'versionOf'
     * has the following description: the name, URI and, if
     * supported by the service, link to the code system that this
     * version represents.
     * 
     * @param versionOf the value of field 'versionOf'.
     */
    public void setVersionOf(
            final edu.mayo.cts2.framework.model.core.CodeSystemReference versionOf) {
        this._versionOf = versionOf;
    }

    /**
     * Method unmarshalCodeSystemVersionCatalogEntrySummary.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.codesystemversion.CodeSystemVersionCatalogEntrySummary
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
