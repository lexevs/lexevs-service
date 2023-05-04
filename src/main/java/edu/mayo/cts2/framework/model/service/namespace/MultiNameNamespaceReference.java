/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.namespace;

import java.util.Collections;

/**
 * Class MultiNameNamespaceReference.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MultiNameNamespaceReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _uri.
     */
    private String _uri;

    /**
     * Field _href.
     */
    private String _href;

    /**
     * Field _preferredName.
     */
    private String _preferredName;

    /**
     * Field _alternateNameList.
     */
    private java.util.List<String> _alternateNameList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MultiNameNamespaceReference() {
        super();
        this._alternateNameList = new java.util.ArrayList<String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAlternateName
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateName(
            final String vAlternateName)
    throws IndexOutOfBoundsException {
        this._alternateNameList.add(vAlternateName);
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateName
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateName(
            final int index,
            final String vAlternateName)
    throws IndexOutOfBoundsException {
        this._alternateNameList.add(index, vAlternateName);
    }

    /**
     * Method enumerateAlternateName.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends String> enumerateAlternateName(
    ) {
        return Collections.enumeration(this._alternateNameList);
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

        if (obj instanceof MultiNameNamespaceReference) {

            MultiNameNamespaceReference temp = (MultiNameNamespaceReference)obj;
            if (this._uri != null) {
                if (temp._uri == null) return false;
                if (!this._uri.equals(temp._uri)) 
                    return false;
            } else if (temp._uri != null)
                return false;
            if (this._href != null) {
                if (temp._href == null) return false;
                if (!this._href.equals(temp._href)) 
                    return false;
            } else if (temp._href != null)
                return false;
            if (this._preferredName != null) {
                if (temp._preferredName == null) return false;
                if (!this._preferredName.equals(temp._preferredName)) 
                    return false;
            } else if (temp._preferredName != null)
                return false;
            if (this._alternateNameList != null) {
                if (temp._alternateNameList == null) return false;
                return this._alternateNameList.equals(temp._alternateNameList);
            } else return temp._alternateNameList == null;
        }
        return false;
    }

    /**
     * Method getAlternateName.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getAlternateName(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateNameList.size()) {
            throw new IndexOutOfBoundsException("getAlternateName: Index value '" + index + "' not in range [0.." + (this._alternateNameList.size() - 1) + "]");
        }

        return _alternateNameList.get(index);
    }

    /**
     * Method getAlternateName.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getAlternateName(
    ) {
        String[] array = new String[0];
        return this._alternateNameList.toArray(array);
    }

    /**
     * Method getAlternateNameAsReference.Returns a reference to
     * '_alternateNameList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getAlternateNameAsReference(
    ) {
        return this._alternateNameList;
    }

    /**
     * Method getAlternateNameCount.
     * 
     * @return the size of this collection
     */
    public int getAlternateNameCount(
    ) {
        return this._alternateNameList.size();
    }

    /**
     * Returns the value of field 'href'.
     * 
     * @return the value of field 'Href'.
     */
    public String getHref(
    ) {
        return this._href;
    }

    /**
     * Returns the value of field 'preferredName'.
     * 
     * @return the value of field 'PreferredName'.
     */
    public String getPreferredName(
    ) {
        return this._preferredName;
    }

    /**
     * Returns the value of field 'uri'.
     * 
     * @return the value of field 'Uri'.
     */
    public String getUri(
    ) {
        return this._uri;
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
        if (_uri != null) {
           result = 37 * result + _uri.hashCode();
        }
        if (_href != null) {
           result = 37 * result + _href.hashCode();
        }
        if (_preferredName != null) {
           result = 37 * result + _preferredName.hashCode();
        }
        if (_alternateNameList != null) {
           result = 37 * result + _alternateNameList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateAlternateName.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends String> iterateAlternateName(
    ) {
        return this._alternateNameList.iterator();
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
    public void removeAllAlternateName(
    ) {
        this._alternateNameList.clear();
    }

    /**
     * Method removeAlternateName.
     * 
     * @param vAlternateName
     * @return true if the object was removed from the collection.
     */
    public boolean removeAlternateName(
            final String vAlternateName) {
        return _alternateNameList.remove(vAlternateName);
    }

    /**
     * Method removeAlternateNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeAlternateNameAt(
            final int index) {
        String obj = this._alternateNameList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateName
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAlternateName(
            final int index,
            final String vAlternateName)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateNameList.size()) {
            throw new IndexOutOfBoundsException("setAlternateName: Index value '" + index + "' not in range [0.." + (this._alternateNameList.size() - 1) + "]");
        }

        this._alternateNameList.set(index, vAlternateName);
    }

    /**
     * 
     * 
     * @param vAlternateNameArray
     */
    public void setAlternateName(
            final String[] vAlternateNameArray) {
        //-- copy array
        _alternateNameList.clear();

        Collections.addAll(this._alternateNameList, vAlternateNameArray);
    }

    /**
     * Sets the value of '_alternateNameList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vAlternateNameList the Vector to copy.
     */
    public void setAlternateName(
            final java.util.List<String> vAlternateNameList) {
        // copy vector
        this._alternateNameList.clear();

        this._alternateNameList.addAll(vAlternateNameList);
    }

    /**
     * Sets the value of '_alternateNameList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param alternateNameList the Vector to set.
     */
    public void setAlternateNameAsReference(
            final java.util.List<String> alternateNameList) {
        this._alternateNameList = alternateNameList;
    }

    /**
     * Sets the value of field 'href'.
     * 
     * @param href the value of field 'href'.
     */
    public void setHref(
            final String href) {
        this._href = href;
    }

    /**
     * Sets the value of field 'preferredName'.
     * 
     * @param preferredName the value of field 'preferredName'.
     */
    public void setPreferredName(
            final String preferredName) {
        this._preferredName = preferredName;
    }

    /**
     * Sets the value of field 'uri'.
     * 
     * @param uri the value of field 'uri'.
     */
    public void setUri(
            final String uri) {
        this._uri = uri;
    }

    /**
     * Method unmarshalMultiNameNamespaceReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.namespace.MultiNameNamespaceReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
