/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.mapversion;

import edu.mayo.cts2.framework.model.core.SourceAndRoleReference;
import java.util.Collections;

/**
 * MapEntry defines a set of rules that identify how a single
 * mapFrom Entity maps to zero or more mapTo target Entities. A
 * MapEntry instance is uniquely identified by the combination of
 *  the assertedBy
 *  MapVersionReference and the mapFrom entity identifier.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapEntry extends edu.mayo.cts2.framework.model.core.Changeable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an indicator that etermines how the MapSet entries are
     * evaluated. The first MapSet is evaluated and, if no match is
     * found, the second set is evaluated, etc. If a match is found
     *  and
     *  processingRule is set to FIRST_MATCH then processing
     * terminates. Processing continues until all MatchSets have
     * been evaluated in all other cases
     */
    private edu.mayo.cts2.framework.model.mapversion.types.MapProcessingRule _processingRule;

    /**
     * the mapping version that asserts this entry
     */
    private edu.mayo.cts2.framework.model.core.MapVersionReference _assertedBy;

    /**
     * the name and URI of the "from" or "source" side of the map.
     * There can be at most one mapFrom entry for every unique
     * entity in a given MapVersion.
     */
    private edu.mayo.cts2.framework.model.core.URIAndEntityName _mapFrom;

    /**
     * a list individuals or organizations and the role(s) they
     * played in this entry
     */
    private java.util.List<SourceAndRoleReference> _sourceList;

    /**
     * a URI that resolves to the set of statements that were used
     * to construct this entry
     */
    private String _sourceStatements;

    /**
     * Field _mapSetList.
     */
    private java.util.List<MapSet> _mapSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapEntry() {
        super();
        this._sourceList = new java.util.ArrayList<SourceAndRoleReference>();
        this._mapSetList = new java.util.ArrayList<MapSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMapSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMapSet(
            final MapSet vMapSet)
    throws IndexOutOfBoundsException {
        this._mapSetList.add(vMapSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vMapSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMapSet(
            final int index,
            final MapSet vMapSet)
    throws IndexOutOfBoundsException {
        this._mapSetList.add(index, vMapSet);
    }

    /**
     * 
     * 
     * @param vSource
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSource(
            final SourceAndRoleReference vSource)
    throws IndexOutOfBoundsException {
        this._sourceList.add(vSource);
    }

    /**
     * 
     * 
     * @param index
     * @param vSource
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSource(
            final int index,
            final SourceAndRoleReference vSource)
    throws IndexOutOfBoundsException {
        this._sourceList.add(index, vSource);
    }

    /**
     * Method enumerateMapSet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends MapSet> enumerateMapSet(
    ) {
        return Collections.enumeration(this._mapSetList);
    }

    /**
     * Method enumerateSource.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends SourceAndRoleReference> enumerateSource(
    ) {
        return Collections.enumeration(this._sourceList);
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

        if (obj instanceof MapEntry) {

            MapEntry temp = (MapEntry)obj;
            if (this._processingRule != null) {
                if (temp._processingRule == null) return false;
                if (!this._processingRule.equals(temp._processingRule)) 
                    return false;
            } else if (temp._processingRule != null)
                return false;
            if (this._assertedBy != null) {
                if (temp._assertedBy == null) return false;
                if (!this._assertedBy.equals(temp._assertedBy)) 
                    return false;
            } else if (temp._assertedBy != null)
                return false;
            if (this._mapFrom != null) {
                if (temp._mapFrom == null) return false;
                if (!this._mapFrom.equals(temp._mapFrom)) 
                    return false;
            } else if (temp._mapFrom != null)
                return false;
            if (this._sourceList != null) {
                if (temp._sourceList == null) return false;
                if (!this._sourceList.equals(temp._sourceList)) 
                    return false;
            } else if (temp._sourceList != null)
                return false;
            if (this._sourceStatements != null) {
                if (temp._sourceStatements == null) return false;
                if (!this._sourceStatements.equals(temp._sourceStatements)) 
                    return false;
            } else if (temp._sourceStatements != null)
                return false;
            if (this._mapSetList != null) {
                if (temp._mapSetList == null) return false;
                return this._mapSetList.equals(temp._mapSetList);
            } else return temp._mapSetList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'assertedBy'. The field
     * 'assertedBy' has the following description: the mapping
     * version that asserts this entry
     * 
     * @return the value of field 'AssertedBy'.
     */
    public edu.mayo.cts2.framework.model.core.MapVersionReference getAssertedBy(
    ) {
        return this._assertedBy;
    }

    /**
     * Returns the value of field 'mapFrom'. The field 'mapFrom'
     * has the following description: the name and URI of the
     * "from" or "source" side of the map. There can be at most one
     * mapFrom entry for every unique entity in a given MapVersion.
     * 
     * @return the value of field 'MapFrom'.
     */
    public edu.mayo.cts2.framework.model.core.URIAndEntityName getMapFrom(
    ) {
        return this._mapFrom;
    }

    /**
     * Method getMapSet.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.mapversion.MapSet at the given
     * index
     */
    public MapSet getMapSet(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mapSetList.size()) {
            throw new IndexOutOfBoundsException("getMapSet: Index value '" + index + "' not in range [0.." + (this._mapSetList.size() - 1) + "]");
        }

        return _mapSetList.get(index);
    }

    /**
     * Method getMapSet.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public MapSet[] getMapSet(
    ) {
        MapSet[] array = new MapSet[0];
        return this._mapSetList.toArray(array);
    }

    /**
     * Method getMapSetAsReference.Returns a reference to
     * '_mapSetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<MapSet> getMapSetAsReference(
    ) {
        return this._mapSetList;
    }

    /**
     * Method getMapSetCount.
     * 
     * @return the size of this collection
     */
    public int getMapSetCount(
    ) {
        return this._mapSetList.size();
    }

    /**
     * Returns the value of field 'processingRule'. The field
     * 'processingRule' has the following description: an indicator
     * that etermines how the MapSet entries are evaluated. The
     * first MapSet is evaluated and, if no match is found, the
     * second set is evaluated, etc. If a match is found
     *  and
     *  processingRule is set to FIRST_MATCH then processing
     * terminates. Processing continues until all MatchSets have
     * been evaluated in all other cases
     * 
     * @return the value of field 'ProcessingRule'.
     */
    public edu.mayo.cts2.framework.model.mapversion.types.MapProcessingRule getProcessingRule(
    ) {
        return this._processingRule;
    }

    /**
     * Method getSource.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.SourceAndRoleReference at
     * the given index
     */
    public SourceAndRoleReference getSource(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceList.size()) {
            throw new IndexOutOfBoundsException("getSource: Index value '" + index + "' not in range [0.." + (this._sourceList.size() - 1) + "]");
        }

        return _sourceList.get(index);
    }

    /**
     * Method getSource.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public SourceAndRoleReference[] getSource(
    ) {
        SourceAndRoleReference[] array = new SourceAndRoleReference[0];
        return this._sourceList.toArray(array);
    }

    /**
     * Method getSourceAsReference.Returns a reference to
     * '_sourceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<SourceAndRoleReference> getSourceAsReference(
    ) {
        return this._sourceList;
    }

    /**
     * Method getSourceCount.
     * 
     * @return the size of this collection
     */
    public int getSourceCount(
    ) {
        return this._sourceList.size();
    }

    /**
     * Returns the value of field 'sourceStatements'. The field
     * 'sourceStatements' has the following description: a URI that
     * resolves to the set of statements that were used to
     * construct this entry
     * 
     * @return the value of field 'SourceStatements'.
     */
    public String getSourceStatements(
    ) {
        return this._sourceStatements;
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
        if (_processingRule != null) {
           result = 37 * result + _processingRule.hashCode();
        }
        if (_assertedBy != null) {
           result = 37 * result + _assertedBy.hashCode();
        }
        if (_mapFrom != null) {
           result = 37 * result + _mapFrom.hashCode();
        }
        if (_sourceList != null) {
           result = 37 * result + _sourceList.hashCode();
        }
        if (_sourceStatements != null) {
           result = 37 * result + _sourceStatements.hashCode();
        }
        if (_mapSetList != null) {
           result = 37 * result + _mapSetList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateMapSet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends MapSet> iterateMapSet(
    ) {
        return this._mapSetList.iterator();
    }

    /**
     * Method iterateSource.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends SourceAndRoleReference> iterateSource(
    ) {
        return this._sourceList.iterator();
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
    public void removeAllMapSet(
    ) {
        this._mapSetList.clear();
    }

    /**
     */
    public void removeAllSource(
    ) {
        this._sourceList.clear();
    }

    /**
     * Method removeMapSet.
     * 
     * @param vMapSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeMapSet(
            final MapSet vMapSet) {
        return _mapSetList.remove(vMapSet);
    }

    /**
     * Method removeMapSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public MapSet removeMapSetAt(
            final int index) {
        MapSet obj = this._mapSetList.remove(index);
        return obj;
    }

    /**
     * Method removeSource.
     * 
     * @param vSource
     * @return true if the object was removed from the collection.
     */
    public boolean removeSource(
            final SourceAndRoleReference vSource) {
        return _sourceList.remove(vSource);
    }

    /**
     * Method removeSourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public SourceAndRoleReference removeSourceAt(
            final int index) {
        SourceAndRoleReference obj = this._sourceList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'assertedBy'. The field 'assertedBy'
     * has the following description: the mapping version that
     * asserts this entry
     * 
     * @param assertedBy the value of field 'assertedBy'.
     */
    public void setAssertedBy(
            final edu.mayo.cts2.framework.model.core.MapVersionReference assertedBy) {
        this._assertedBy = assertedBy;
    }

    /**
     * Sets the value of field 'mapFrom'. The field 'mapFrom' has
     * the following description: the name and URI of the "from" or
     * "source" side of the map. There can be at most one mapFrom
     * entry for every unique entity in a given MapVersion.
     * 
     * @param mapFrom the value of field 'mapFrom'.
     */
    public void setMapFrom(
            final edu.mayo.cts2.framework.model.core.URIAndEntityName mapFrom) {
        this._mapFrom = mapFrom;
    }

    /**
     * 
     * 
     * @param index
     * @param vMapSet
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMapSet(
            final int index,
            final MapSet vMapSet)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mapSetList.size()) {
            throw new IndexOutOfBoundsException("setMapSet: Index value '" + index + "' not in range [0.." + (this._mapSetList.size() - 1) + "]");
        }

        this._mapSetList.set(index, vMapSet);
    }

    /**
     * 
     * 
     * @param vMapSetArray
     */
    public void setMapSet(
            final MapSet[] vMapSetArray) {
        //-- copy array
        _mapSetList.clear();

        Collections.addAll(this._mapSetList, vMapSetArray);
    }

    /**
     * Sets the value of '_mapSetList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vMapSetList the Vector to copy.
     */
    public void setMapSet(
            final java.util.List<MapSet> vMapSetList) {
        // copy vector
        this._mapSetList.clear();

        this._mapSetList.addAll(vMapSetList);
    }

    /**
     * Sets the value of '_mapSetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param mapSetList the Vector to set.
     */
    public void setMapSetAsReference(
            final java.util.List<MapSet> mapSetList) {
        this._mapSetList = mapSetList;
    }

    /**
     * Sets the value of field 'processingRule'. The field
     * 'processingRule' has the following description: an indicator
     * that etermines how the MapSet entries are evaluated. The
     * first MapSet is evaluated and, if no match is found, the
     * second set is evaluated, etc. If a match is found
     *  and
     *  processingRule is set to FIRST_MATCH then processing
     * terminates. Processing continues until all MatchSets have
     * been evaluated in all other cases
     * 
     * @param processingRule the value of field 'processingRule'.
     */
    public void setProcessingRule(
            final edu.mayo.cts2.framework.model.mapversion.types.MapProcessingRule processingRule) {
        this._processingRule = processingRule;
    }

    /**
     * 
     * 
     * @param index
     * @param vSource
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSource(
            final int index,
            final SourceAndRoleReference vSource)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceList.size()) {
            throw new IndexOutOfBoundsException("setSource: Index value '" + index + "' not in range [0.." + (this._sourceList.size() - 1) + "]");
        }

        this._sourceList.set(index, vSource);
    }

    /**
     * 
     * 
     * @param vSourceArray
     */
    public void setSource(
            final SourceAndRoleReference[] vSourceArray) {
        //-- copy array
        _sourceList.clear();

        Collections.addAll(this._sourceList, vSourceArray);
    }

    /**
     * Sets the value of '_sourceList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vSourceList the Vector to copy.
     */
    public void setSource(
            final java.util.List<SourceAndRoleReference> vSourceList) {
        // copy vector
        this._sourceList.clear();

        this._sourceList.addAll(vSourceList);
    }

    /**
     * Sets the value of '_sourceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param sourceList the Vector to set.
     */
    public void setSourceAsReference(
            final java.util.List<SourceAndRoleReference> sourceList) {
        this._sourceList = sourceList;
    }

    /**
     * Sets the value of field 'sourceStatements'. The field
     * 'sourceStatements' has the following description: a URI that
     * resolves to the set of statements that were used to
     * construct this entry
     * 
     * @param sourceStatements the value of field 'sourceStatements'
     */
    public void setSourceStatements(
            final String sourceStatements) {
        this._sourceStatements = sourceStatements;
    }

    /**
     * Method unmarshalMapEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.mapversion.MapEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
