/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.DirectoryEntry;
import java.util.Collections;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ExportStatus extends ProcessStatus
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The export destination
     */
    private String _destination;

    /**
     * The number of elements that have been exported so far
     */
    private Long _numElementsExported;

    /**
     * Field _errorHandling.
     */
    private edu.mayo.cts2.framework.model.service.core.types.ErrorResponse _errorHandling;

    /**
     * Field _exportedIRIsList.
     */
    private java.util.List<String> _exportedIRIsList;

    /**
     * Field _overwriteRule.
     */
    private edu.mayo.cts2.framework.model.service.core.types.OverwriteRule _overwriteRule;

    /**
     * Field _resourcesToExportList.
     */
    private java.util.List<DirectoryEntry> _resourcesToExportList;

    /**
     * Field _synchronicity.
     */
    private edu.mayo.cts2.framework.model.service.core.types.SyncOrAsync _synchronicity;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExportStatus() {
        super();
        this._exportedIRIsList = new java.util.ArrayList<String>();
        this._resourcesToExportList = new java.util.ArrayList<DirectoryEntry>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExportedIRIs
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExportedIRIs(
            final String vExportedIRIs)
    throws IndexOutOfBoundsException {
        this._exportedIRIsList.add(vExportedIRIs);
    }

    /**
     * 
     * 
     * @param index
     * @param vExportedIRIs
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExportedIRIs(
            final int index,
            final String vExportedIRIs)
    throws IndexOutOfBoundsException {
        this._exportedIRIsList.add(index, vExportedIRIs);
    }

    /**
     * 
     * 
     * @param vResourcesToExport
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourcesToExport(
            final DirectoryEntry vResourcesToExport)
    throws IndexOutOfBoundsException {
        this._resourcesToExportList.add(vResourcesToExport);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourcesToExport
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourcesToExport(
            final int index,
            final DirectoryEntry vResourcesToExport)
    throws IndexOutOfBoundsException {
        this._resourcesToExportList.add(index, vResourcesToExport);
    }

    /**
     * Method enumerateExportedIRIs.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends String> enumerateExportedIRIs(
    ) {
        return Collections.enumeration(this._exportedIRIsList);
    }

    /**
     * Method enumerateResourcesToExport.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends DirectoryEntry> enumerateResourcesToExport(
    ) {
        return Collections.enumeration(this._resourcesToExportList);
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

        if (obj instanceof ExportStatus) {

            ExportStatus temp = (ExportStatus)obj;
            if (this._destination != null) {
                if (temp._destination == null) return false;
                if (!this._destination.equals(temp._destination)) 
                    return false;
            } else if (temp._destination != null)
                return false;
            if (this._numElementsExported != null) {
                if (temp._numElementsExported == null) return false;
                if (!this._numElementsExported.equals(temp._numElementsExported)) 
                    return false;
            } else if (temp._numElementsExported != null)
                return false;
            if (this._errorHandling != null) {
                if (temp._errorHandling == null) return false;
                if (!this._errorHandling.equals(temp._errorHandling)) 
                    return false;
            } else if (temp._errorHandling != null)
                return false;
            if (this._exportedIRIsList != null) {
                if (temp._exportedIRIsList == null) return false;
                if (!this._exportedIRIsList.equals(temp._exportedIRIsList)) 
                    return false;
            } else if (temp._exportedIRIsList != null)
                return false;
            if (this._overwriteRule != null) {
                if (temp._overwriteRule == null) return false;
                if (!this._overwriteRule.equals(temp._overwriteRule)) 
                    return false;
            } else if (temp._overwriteRule != null)
                return false;
            if (this._resourcesToExportList != null) {
                if (temp._resourcesToExportList == null) return false;
                if (!this._resourcesToExportList.equals(temp._resourcesToExportList)) 
                    return false;
            } else if (temp._resourcesToExportList != null)
                return false;
            if (this._synchronicity != null) {
                if (temp._synchronicity == null) return false;
                return this._synchronicity.equals(temp._synchronicity);
            } else return temp._synchronicity == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'destination'. The field
     * 'destination' has the following description: The export
     * destination
     * 
     * @return the value of field 'Destination'.
     */
    public String getDestination(
    ) {
        return this._destination;
    }

    /**
     * Returns the value of field 'errorHandling'.
     * 
     * @return the value of field 'ErrorHandling'.
     */
    public edu.mayo.cts2.framework.model.service.core.types.ErrorResponse getErrorHandling(
    ) {
        return this._errorHandling;
    }

    /**
     * Method getExportedIRIs.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getExportedIRIs(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._exportedIRIsList.size()) {
            throw new IndexOutOfBoundsException("getExportedIRIs: Index value '" + index + "' not in range [0.." + (this._exportedIRIsList.size() - 1) + "]");
        }

        return _exportedIRIsList.get(index);
    }

    /**
     * Method getExportedIRIs.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getExportedIRIs(
    ) {
        String[] array = new String[0];
        return this._exportedIRIsList.toArray(array);
    }

    /**
     * Method getExportedIRIsAsReference.Returns a reference to
     * '_exportedIRIsList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getExportedIRIsAsReference(
    ) {
        return this._exportedIRIsList;
    }

    /**
     * Method getExportedIRIsCount.
     * 
     * @return the size of this collection
     */
    public int getExportedIRIsCount(
    ) {
        return this._exportedIRIsList.size();
    }

    /**
     * Returns the value of field 'numElementsExported'. The field
     * 'numElementsExported' has the following description: The
     * number of elements that have been exported so far
     * 
     * @return the value of field 'NumElementsExported'.
     */
    public Long getNumElementsExported(
    ) {
        return this._numElementsExported;
    }

    /**
     * Returns the value of field 'overwriteRule'.
     * 
     * @return the value of field 'OverwriteRule'.
     */
    public edu.mayo.cts2.framework.model.service.core.types.OverwriteRule getOverwriteRule(
    ) {
        return this._overwriteRule;
    }

    /**
     * Method getResourcesToExport.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.DirectoryEntry at the
     * given index
     */
    public DirectoryEntry getResourcesToExport(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourcesToExportList.size()) {
            throw new IndexOutOfBoundsException("getResourcesToExport: Index value '" + index + "' not in range [0.." + (this._resourcesToExportList.size() - 1) + "]");
        }

        return _resourcesToExportList.get(index);
    }

    /**
     * Method getResourcesToExport.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public DirectoryEntry[] getResourcesToExport(
    ) {
        DirectoryEntry[] array = new DirectoryEntry[0];
        return this._resourcesToExportList.toArray(array);
    }

    /**
     * Method getResourcesToExportAsReference.Returns a reference
     * to '_resourcesToExportList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<DirectoryEntry> getResourcesToExportAsReference(
    ) {
        return this._resourcesToExportList;
    }

    /**
     * Method getResourcesToExportCount.
     * 
     * @return the size of this collection
     */
    public int getResourcesToExportCount(
    ) {
        return this._resourcesToExportList.size();
    }

    /**
     * Returns the value of field 'synchronicity'.
     * 
     * @return the value of field 'Synchronicity'.
     */
    public edu.mayo.cts2.framework.model.service.core.types.SyncOrAsync getSynchronicity(
    ) {
        return this._synchronicity;
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
        if (_destination != null) {
           result = 37 * result + _destination.hashCode();
        }
        if (_numElementsExported != null) {
           result = 37 * result + _numElementsExported.hashCode();
        }
        if (_errorHandling != null) {
           result = 37 * result + _errorHandling.hashCode();
        }
        if (_exportedIRIsList != null) {
           result = 37 * result + _exportedIRIsList.hashCode();
        }
        if (_overwriteRule != null) {
           result = 37 * result + _overwriteRule.hashCode();
        }
        if (_resourcesToExportList != null) {
           result = 37 * result + _resourcesToExportList.hashCode();
        }
        if (_synchronicity != null) {
           result = 37 * result + _synchronicity.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateExportedIRIs.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends String> iterateExportedIRIs(
    ) {
        return this._exportedIRIsList.iterator();
    }

    /**
     * Method iterateResourcesToExport.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends DirectoryEntry> iterateResourcesToExport(
    ) {
        return this._resourcesToExportList.iterator();
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
    public void removeAllExportedIRIs(
    ) {
        this._exportedIRIsList.clear();
    }

    /**
     */
    public void removeAllResourcesToExport(
    ) {
        this._resourcesToExportList.clear();
    }

    /**
     * Method removeExportedIRIs.
     * 
     * @param vExportedIRIs
     * @return true if the object was removed from the collection.
     */
    public boolean removeExportedIRIs(
            final String vExportedIRIs) {
        return _exportedIRIsList.remove(vExportedIRIs);
    }

    /**
     * Method removeExportedIRIsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeExportedIRIsAt(
            final int index) {
        String obj = this._exportedIRIsList.remove(index);
        return obj;
    }

    /**
     * Method removeResourcesToExport.
     * 
     * @param vResourcesToExport
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourcesToExport(
            final DirectoryEntry vResourcesToExport) {
        return _resourcesToExportList.remove(vResourcesToExport);
    }

    /**
     * Method removeResourcesToExportAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public DirectoryEntry removeResourcesToExportAt(
            final int index) {
        DirectoryEntry obj = this._resourcesToExportList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'destination'. The field
     * 'destination' has the following description: The export
     * destination
     * 
     * @param destination the value of field 'destination'.
     */
    public void setDestination(
            final String destination) {
        this._destination = destination;
    }

    /**
     * Sets the value of field 'errorHandling'.
     * 
     * @param errorHandling the value of field 'errorHandling'.
     */
    public void setErrorHandling(
            final edu.mayo.cts2.framework.model.service.core.types.ErrorResponse errorHandling) {
        this._errorHandling = errorHandling;
    }

    /**
     * 
     * 
     * @param index
     * @param vExportedIRIs
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExportedIRIs(
            final int index,
            final String vExportedIRIs)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._exportedIRIsList.size()) {
            throw new IndexOutOfBoundsException("setExportedIRIs: Index value '" + index + "' not in range [0.." + (this._exportedIRIsList.size() - 1) + "]");
        }

        this._exportedIRIsList.set(index, vExportedIRIs);
    }

    /**
     * 
     * 
     * @param vExportedIRIsArray
     */
    public void setExportedIRIs(
            final String[] vExportedIRIsArray) {
        //-- copy array
        _exportedIRIsList.clear();

        Collections.addAll(this._exportedIRIsList, vExportedIRIsArray);
    }

    /**
     * Sets the value of '_exportedIRIsList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vExportedIRIsList the Vector to copy.
     */
    public void setExportedIRIs(
            final java.util.List<String> vExportedIRIsList) {
        // copy vector
        this._exportedIRIsList.clear();

        this._exportedIRIsList.addAll(vExportedIRIsList);
    }

    /**
     * Sets the value of '_exportedIRIsList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param exportedIRIsList the Vector to set.
     */
    public void setExportedIRIsAsReference(
            final java.util.List<String> exportedIRIsList) {
        this._exportedIRIsList = exportedIRIsList;
    }

    /**
     * Sets the value of field 'numElementsExported'. The field
     * 'numElementsExported' has the following description: The
     * number of elements that have been exported so far
     * 
     * @param numElementsExported the value of field
     * 'numElementsExported'.
     */
    public void setNumElementsExported(
            final Long numElementsExported) {
        this._numElementsExported = numElementsExported;
    }

    /**
     * Sets the value of field 'overwriteRule'.
     * 
     * @param overwriteRule the value of field 'overwriteRule'.
     */
    public void setOverwriteRule(
            final edu.mayo.cts2.framework.model.service.core.types.OverwriteRule overwriteRule) {
        this._overwriteRule = overwriteRule;
    }

    /**
     * 
     * 
     * @param index
     * @param vResourcesToExport
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourcesToExport(
            final int index,
            final DirectoryEntry vResourcesToExport)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourcesToExportList.size()) {
            throw new IndexOutOfBoundsException("setResourcesToExport: Index value '" + index + "' not in range [0.." + (this._resourcesToExportList.size() - 1) + "]");
        }

        this._resourcesToExportList.set(index, vResourcesToExport);
    }

    /**
     * 
     * 
     * @param vResourcesToExportArray
     */
    public void setResourcesToExport(
            final DirectoryEntry[] vResourcesToExportArray) {
        //-- copy array
        _resourcesToExportList.clear();

        Collections.addAll(this._resourcesToExportList, vResourcesToExportArray);
    }

    /**
     * Sets the value of '_resourcesToExportList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vResourcesToExportList the Vector to copy.
     */
    public void setResourcesToExport(
            final java.util.List<DirectoryEntry> vResourcesToExportList) {
        // copy vector
        this._resourcesToExportList.clear();

        this._resourcesToExportList.addAll(vResourcesToExportList);
    }

    /**
     * Sets the value of '_resourcesToExportList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param resourcesToExportList the Vector to set.
     */
    public void setResourcesToExportAsReference(
            final java.util.List<DirectoryEntry> resourcesToExportList) {
        this._resourcesToExportList = resourcesToExportList;
    }

    /**
     * Sets the value of field 'synchronicity'.
     * 
     * @param synchronicity the value of field 'synchronicity'.
     */
    public void setSynchronicity(
            final edu.mayo.cts2.framework.model.service.core.types.SyncOrAsync synchronicity) {
        this._synchronicity = synchronicity;
    }

    /**
     * Method unmarshalExportStatus.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.ExportStatus
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
