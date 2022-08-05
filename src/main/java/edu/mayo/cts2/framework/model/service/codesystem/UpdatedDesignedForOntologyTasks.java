/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystem;

import edu.mayo.cts2.framework.model.core.OntologyTaskReference;
import java.util.Collections;

/**
 * Class UpdatedDesignedForOntologyTasks.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedDesignedForOntologyTasks extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _designedForOntologyTaskList.
     */
    private java.util.List<OntologyTaskReference> _designedForOntologyTaskList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedDesignedForOntologyTasks() {
        super();
        this._designedForOntologyTaskList = new java.util.ArrayList<OntologyTaskReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDesignedForOntologyTask
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDesignedForOntologyTask(
            final OntologyTaskReference vDesignedForOntologyTask)
    throws IndexOutOfBoundsException {
        this._designedForOntologyTaskList.add(vDesignedForOntologyTask);
    }

    /**
     * 
     * 
     * @param index
     * @param vDesignedForOntologyTask
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDesignedForOntologyTask(
            final int index,
            final OntologyTaskReference vDesignedForOntologyTask)
    throws IndexOutOfBoundsException {
        this._designedForOntologyTaskList.add(index, vDesignedForOntologyTask);
    }

    /**
     * Method enumerateDesignedForOntologyTask.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends OntologyTaskReference> enumerateDesignedForOntologyTask(
    ) {
        return Collections.enumeration(this._designedForOntologyTaskList);
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

        if (obj instanceof UpdatedDesignedForOntologyTasks) {

            UpdatedDesignedForOntologyTasks temp = (UpdatedDesignedForOntologyTasks)obj;
            if (this._designedForOntologyTaskList != null) {
                if (temp._designedForOntologyTaskList == null) return false;
                return this._designedForOntologyTaskList.equals(temp._designedForOntologyTaskList);
            } else return temp._designedForOntologyTaskList == null;
        }
        return false;
    }

    /**
     * Method getDesignedForOntologyTask.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.OntologyTaskReference at
     * the given index
     */
    public OntologyTaskReference getDesignedForOntologyTask(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._designedForOntologyTaskList.size()) {
            throw new IndexOutOfBoundsException("getDesignedForOntologyTask: Index value '" + index + "' not in range [0.." + (this._designedForOntologyTaskList.size() - 1) + "]");
        }

        return _designedForOntologyTaskList.get(index);
    }

    /**
     * Method getDesignedForOntologyTask.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public OntologyTaskReference[] getDesignedForOntologyTask(
    ) {
        OntologyTaskReference[] array = new OntologyTaskReference[0];
        return this._designedForOntologyTaskList.toArray(array);
    }

    /**
     * Method getDesignedForOntologyTaskAsReference.Returns a
     * reference to '_designedForOntologyTaskList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<OntologyTaskReference> getDesignedForOntologyTaskAsReference(
    ) {
        return this._designedForOntologyTaskList;
    }

    /**
     * Method getDesignedForOntologyTaskCount.
     * 
     * @return the size of this collection
     */
    public int getDesignedForOntologyTaskCount(
    ) {
        return this._designedForOntologyTaskList.size();
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
        if (_designedForOntologyTaskList != null) {
           result = 37 * result + _designedForOntologyTaskList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateDesignedForOntologyTask.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends OntologyTaskReference> iterateDesignedForOntologyTask(
    ) {
        return this._designedForOntologyTaskList.iterator();
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
    public void removeAllDesignedForOntologyTask(
    ) {
        this._designedForOntologyTaskList.clear();
    }

    /**
     * Method removeDesignedForOntologyTask.
     * 
     * @param vDesignedForOntologyTask
     * @return true if the object was removed from the collection.
     */
    public boolean removeDesignedForOntologyTask(
            final OntologyTaskReference vDesignedForOntologyTask) {
        return _designedForOntologyTaskList.remove(vDesignedForOntologyTask);
    }

    /**
     * Method removeDesignedForOntologyTaskAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public OntologyTaskReference removeDesignedForOntologyTaskAt(
            final int index) {
        OntologyTaskReference obj = this._designedForOntologyTaskList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDesignedForOntologyTask
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDesignedForOntologyTask(
            final int index,
            final OntologyTaskReference vDesignedForOntologyTask)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._designedForOntologyTaskList.size()) {
            throw new IndexOutOfBoundsException("setDesignedForOntologyTask: Index value '" + index + "' not in range [0.." + (this._designedForOntologyTaskList.size() - 1) + "]");
        }

        this._designedForOntologyTaskList.set(index, vDesignedForOntologyTask);
    }

    /**
     * 
     * 
     * @param vDesignedForOntologyTaskArray
     */
    public void setDesignedForOntologyTask(
            final OntologyTaskReference[] vDesignedForOntologyTaskArray) {
        //-- copy array
        _designedForOntologyTaskList.clear();

        Collections.addAll(this._designedForOntologyTaskList, vDesignedForOntologyTaskArray);
    }

    /**
     * Sets the value of '_designedForOntologyTaskList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vDesignedForOntologyTaskList the Vector to copy.
     */
    public void setDesignedForOntologyTask(
            final java.util.List<OntologyTaskReference> vDesignedForOntologyTaskList) {
        // copy vector
        this._designedForOntologyTaskList.clear();

        this._designedForOntologyTaskList.addAll(vDesignedForOntologyTaskList);
    }

    /**
     * Sets the value of '_designedForOntologyTaskList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param designedForOntologyTaskList the Vector to set.
     */
    public void setDesignedForOntologyTaskAsReference(
            final java.util.List<OntologyTaskReference> designedForOntologyTaskList) {
        this._designedForOntologyTaskList = designedForOntologyTaskList;
    }

    /**
     * Method unmarshalUpdatedDesignedForOntologyTasks.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystem.UpdatedDesignedForOntologyTasks
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
