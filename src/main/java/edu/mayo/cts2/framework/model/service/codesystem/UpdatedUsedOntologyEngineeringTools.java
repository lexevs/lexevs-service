/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystem;

import edu.mayo.cts2.framework.model.core.OntologyEngineeringToolReference;
import java.util.Collections;

/**
 * Class UpdatedUsedOntologyEngineeringTools.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedUsedOntologyEngineeringTools extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _usedOntologyEngineeringToolList.
     */
    private java.util.List<OntologyEngineeringToolReference> _usedOntologyEngineeringToolList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedUsedOntologyEngineeringTools() {
        super();
        this._usedOntologyEngineeringToolList = new java.util.ArrayList<OntologyEngineeringToolReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vUsedOntologyEngineeringTool
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsedOntologyEngineeringTool(
            final OntologyEngineeringToolReference vUsedOntologyEngineeringTool)
    throws IndexOutOfBoundsException {
        this._usedOntologyEngineeringToolList.add(vUsedOntologyEngineeringTool);
    }

    /**
     * 
     * 
     * @param index
     * @param vUsedOntologyEngineeringTool
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsedOntologyEngineeringTool(
            final int index,
            final OntologyEngineeringToolReference vUsedOntologyEngineeringTool)
    throws IndexOutOfBoundsException {
        this._usedOntologyEngineeringToolList.add(index, vUsedOntologyEngineeringTool);
    }

    /**
     * Method enumerateUsedOntologyEngineeringTool.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends OntologyEngineeringToolReference> enumerateUsedOntologyEngineeringTool(
    ) {
        return Collections.enumeration(this._usedOntologyEngineeringToolList);
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

        if (obj instanceof UpdatedUsedOntologyEngineeringTools) {

            UpdatedUsedOntologyEngineeringTools temp = (UpdatedUsedOntologyEngineeringTools)obj;
            if (this._usedOntologyEngineeringToolList != null) {
                if (temp._usedOntologyEngineeringToolList == null) return false;
                return this._usedOntologyEngineeringToolList.equals(temp._usedOntologyEngineeringToolList);
            } else return temp._usedOntologyEngineeringToolList == null;
        }
        return false;
    }

    /**
     * Method getUsedOntologyEngineeringTool.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.OntologyEngineeringToolReference
     * at the given index
     */
    public OntologyEngineeringToolReference getUsedOntologyEngineeringTool(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usedOntologyEngineeringToolList.size()) {
            throw new IndexOutOfBoundsException("getUsedOntologyEngineeringTool: Index value '" + index + "' not in range [0.." + (this._usedOntologyEngineeringToolList.size() - 1) + "]");
        }

        return _usedOntologyEngineeringToolList.get(index);
    }

    /**
     * Method getUsedOntologyEngineeringTool.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public OntologyEngineeringToolReference[] getUsedOntologyEngineeringTool(
    ) {
        OntologyEngineeringToolReference[] array = new OntologyEngineeringToolReference[0];
        return this._usedOntologyEngineeringToolList.toArray(array);
    }

    /**
     * Method getUsedOntologyEngineeringToolAsReference.Returns a
     * reference to '_usedOntologyEngineeringToolList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<OntologyEngineeringToolReference> getUsedOntologyEngineeringToolAsReference(
    ) {
        return this._usedOntologyEngineeringToolList;
    }

    /**
     * Method getUsedOntologyEngineeringToolCount.
     * 
     * @return the size of this collection
     */
    public int getUsedOntologyEngineeringToolCount(
    ) {
        return this._usedOntologyEngineeringToolList.size();
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
        if (_usedOntologyEngineeringToolList != null) {
           result = 37 * result + _usedOntologyEngineeringToolList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateUsedOntologyEngineeringTool.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends OntologyEngineeringToolReference> iterateUsedOntologyEngineeringTool(
    ) {
        return this._usedOntologyEngineeringToolList.iterator();
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
    public void removeAllUsedOntologyEngineeringTool(
    ) {
        this._usedOntologyEngineeringToolList.clear();
    }

    /**
     * Method removeUsedOntologyEngineeringTool.
     * 
     * @param vUsedOntologyEngineeringTool
     * @return true if the object was removed from the collection.
     */
    public boolean removeUsedOntologyEngineeringTool(
            final OntologyEngineeringToolReference vUsedOntologyEngineeringTool) {
        return _usedOntologyEngineeringToolList.remove(vUsedOntologyEngineeringTool);
    }

    /**
     * Method removeUsedOntologyEngineeringToolAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public OntologyEngineeringToolReference removeUsedOntologyEngineeringToolAt(
            final int index) {
        OntologyEngineeringToolReference obj = this._usedOntologyEngineeringToolList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vUsedOntologyEngineeringTool
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUsedOntologyEngineeringTool(
            final int index,
            final OntologyEngineeringToolReference vUsedOntologyEngineeringTool)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usedOntologyEngineeringToolList.size()) {
            throw new IndexOutOfBoundsException("setUsedOntologyEngineeringTool: Index value '" + index + "' not in range [0.." + (this._usedOntologyEngineeringToolList.size() - 1) + "]");
        }

        this._usedOntologyEngineeringToolList.set(index, vUsedOntologyEngineeringTool);
    }

    /**
     * 
     * 
     * @param vUsedOntologyEngineeringToolArray
     */
    public void setUsedOntologyEngineeringTool(
            final OntologyEngineeringToolReference[] vUsedOntologyEngineeringToolArray) {
        //-- copy array
        _usedOntologyEngineeringToolList.clear();

        Collections.addAll(this._usedOntologyEngineeringToolList, vUsedOntologyEngineeringToolArray);
    }

    /**
     * Sets the value of '_usedOntologyEngineeringToolList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vUsedOntologyEngineeringToolList the Vector to copy.
     */
    public void setUsedOntologyEngineeringTool(
            final java.util.List<OntologyEngineeringToolReference> vUsedOntologyEngineeringToolList) {
        // copy vector
        this._usedOntologyEngineeringToolList.clear();

        this._usedOntologyEngineeringToolList.addAll(vUsedOntologyEngineeringToolList);
    }

    /**
     * Sets the value of '_usedOntologyEngineeringToolList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param usedOntologyEngineeringToolList the Vector to set.
     */
    public void setUsedOntologyEngineeringToolAsReference(
            final java.util.List<OntologyEngineeringToolReference> usedOntologyEngineeringToolList) {
        this._usedOntologyEngineeringToolList = usedOntologyEngineeringToolList;
    }

    /**
     * Method unmarshalUpdatedUsedOntologyEngineeringTools.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystem.UpdatedUsedOntologyEngineeringTools
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
