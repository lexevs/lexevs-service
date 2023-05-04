/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

import java.util.Collections;

/**
 * The header information for any REST resource retrieval
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class RESTResource extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The URI of the REST service. As an example, if the resource
     * URI
     *  was "http://informatics.mayo.edu/cts2/rest/codesystems",
     * the resourceRoot would be
     *  "http://informatics.mayo.edu/cts2/rest/"
     */
    private String _resourceRoot;

    /**
     * The relative URI of the resource with respect to the
     * resourceRoot. As an example,
     *  if the resource URI was
     * "http://informatics.mayo.edu/cts2/rest/codesystems", the
     * resourceURI would
     *  be "codesystems". Fragment and query identifiers should
     * also be included.
     */
    private String _resourceURI;

    /**
     * The paramaters that were used in executing the query. This
     * carries all of the parameters that
     *  are needed to reconstruct the complete query in either a
     * RESTful or procedural environment. The service provider
     *  may or may not include non-CTS2 related parameters such as
     * security tokens, routing requests, etc.
     */
    private java.util.List<Parameter> _parameterList;

    /**
     * The date and time that the resource was accessed.
     */
    private java.util.Date _accessDate;


      //----------------/
     //- Constructors -/
    //----------------/

    public RESTResource() {
        super();
        this._parameterList = new java.util.ArrayList<Parameter>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vParameter
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final Parameter vParameter)
    throws IndexOutOfBoundsException {
        this._parameterList.add(vParameter);
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final int index,
            final Parameter vParameter)
    throws IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     * Method enumerateParameter.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Parameter> enumerateParameter(
    ) {
        return Collections.enumeration(this._parameterList);
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

        if (obj instanceof RESTResource) {

            RESTResource temp = (RESTResource)obj;
            if (this._resourceRoot != null) {
                if (temp._resourceRoot == null) return false;
                if (!this._resourceRoot.equals(temp._resourceRoot)) 
                    return false;
            } else if (temp._resourceRoot != null)
                return false;
            if (this._resourceURI != null) {
                if (temp._resourceURI == null) return false;
                if (!this._resourceURI.equals(temp._resourceURI)) 
                    return false;
            } else if (temp._resourceURI != null)
                return false;
            if (this._parameterList != null) {
                if (temp._parameterList == null) return false;
                if (!this._parameterList.equals(temp._parameterList)) 
                    return false;
            } else if (temp._parameterList != null)
                return false;
            if (this._accessDate != null) {
                if (temp._accessDate == null) return false;
                return this._accessDate.equals(temp._accessDate);
            } else return temp._accessDate == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'accessDate'. The field
     * 'accessDate' has the following description: The date and
     * time that the resource was accessed.
     * 
     * @return the value of field 'AccessDate'.
     */
    public java.util.Date getAccessDate(
    ) {
        return this._accessDate;
    }

    /**
     * Method getParameter.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Parameter at the given
     * index
     */
    public Parameter getParameter(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }

        return _parameterList.get(index);
    }

    /**
     * Method getParameter.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Parameter[] getParameter(
    ) {
        Parameter[] array = new Parameter[0];
        return this._parameterList.toArray(array);
    }

    /**
     * Method getParameterAsReference.Returns a reference to
     * '_parameterList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Parameter> getParameterAsReference(
    ) {
        return this._parameterList;
    }

    /**
     * Method getParameterCount.
     * 
     * @return the size of this collection
     */
    public int getParameterCount(
    ) {
        return this._parameterList.size();
    }

    /**
     * Returns the value of field 'resourceRoot'. The field
     * 'resourceRoot' has the following description: The URI of the
     * REST service. As an example, if the resource URI
     *  was "http://informatics.mayo.edu/cts2/rest/codesystems",
     * the resourceRoot would be
     *  "http://informatics.mayo.edu/cts2/rest/"
     * 
     * @return the value of field 'ResourceRoot'.
     */
    public String getResourceRoot(
    ) {
        return this._resourceRoot;
    }

    /**
     * Returns the value of field 'resourceURI'. The field
     * 'resourceURI' has the following description: The relative
     * URI of the resource with respect to the resourceRoot. As an
     * example,
     *  if the resource URI was
     * "http://informatics.mayo.edu/cts2/rest/codesystems", the
     * resourceURI would
     *  be "codesystems". Fragment and query identifiers should
     * also be included.
     * 
     * @return the value of field 'ResourceURI'.
     */
    public String getResourceURI(
    ) {
        return this._resourceURI;
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
        if (_resourceRoot != null) {
           result = 37 * result + _resourceRoot.hashCode();
        }
        if (_resourceURI != null) {
           result = 37 * result + _resourceURI.hashCode();
        }
        if (_parameterList != null) {
           result = 37 * result + _parameterList.hashCode();
        }
        if (_accessDate != null) {
           result = 37 * result + _accessDate.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateParameter.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Parameter> iterateParameter(
    ) {
        return this._parameterList.iterator();
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
    public void removeAllParameter(
    ) {
        this._parameterList.clear();
    }

    /**
     * Method removeParameter.
     * 
     * @param vParameter
     * @return true if the object was removed from the collection.
     */
    public boolean removeParameter(
            final Parameter vParameter) {
        return _parameterList.remove(vParameter);
    }

    /**
     * Method removeParameterAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Parameter removeParameterAt(
            final int index) {
        Parameter obj = this._parameterList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'accessDate'. The field 'accessDate'
     * has the following description: The date and time that the
     * resource was accessed.
     * 
     * @param accessDate the value of field 'accessDate'.
     */
    public void setAccessDate(
            final java.util.Date accessDate) {
        this._accessDate = accessDate;
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParameter(
            final int index,
            final Parameter vParameter)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("setParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }

        this._parameterList.set(index, vParameter);
    }

    /**
     * 
     * 
     * @param vParameterArray
     */
    public void setParameter(
            final Parameter[] vParameterArray) {
        //-- copy array
        _parameterList.clear();

        Collections.addAll(this._parameterList, vParameterArray);
    }

    /**
     * Sets the value of '_parameterList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vParameterList the Vector to copy.
     */
    public void setParameter(
            final java.util.List<Parameter> vParameterList) {
        // copy vector
        this._parameterList.clear();

        this._parameterList.addAll(vParameterList);
    }

    /**
     * Sets the value of '_parameterList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param parameterList the Vector to set.
     */
    public void setParameterAsReference(
            final java.util.List<Parameter> parameterList) {
        this._parameterList = parameterList;
    }

    /**
     * Sets the value of field 'resourceRoot'. The field
     * 'resourceRoot' has the following description: The URI of the
     * REST service. As an example, if the resource URI
     *  was "http://informatics.mayo.edu/cts2/rest/codesystems",
     * the resourceRoot would be
     *  "http://informatics.mayo.edu/cts2/rest/"
     * 
     * @param resourceRoot the value of field 'resourceRoot'.
     */
    public void setResourceRoot(
            final String resourceRoot) {
        this._resourceRoot = resourceRoot;
    }

    /**
     * Sets the value of field 'resourceURI'. The field
     * 'resourceURI' has the following description: The relative
     * URI of the resource with respect to the resourceRoot. As an
     * example,
     *  if the resource URI was
     * "http://informatics.mayo.edu/cts2/rest/codesystems", the
     * resourceURI would
     *  be "codesystems". Fragment and query identifiers should
     * also be included.
     * 
     * @param resourceURI the value of field 'resourceURI'.
     */
    public void setResourceURI(
            final String resourceURI) {
        this._resourceURI = resourceURI;
    }

    /**
     * Method unmarshalRESTResource.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.RESTResource
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
