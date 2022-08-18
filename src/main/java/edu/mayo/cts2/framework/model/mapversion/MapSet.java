/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.mapversion;

import java.util.Collections;

/**
 * An set of map target rules that, when evaluated, result in zero
 * or qualifying map targets. The setting of MapSet.stopOnMatch
 * determines whether at most one qualifying target is returned or
 * whether many
 *  qualifying targets are returned. MapSets are evaulated in the
 * order that they appear in a MapEntry. If the evaluation results
 * in one or more qualifying MapTargets and MapEntry.processingRule
 * is
 *  FIRST_MATCH, the MapEntry is considered resolved. If, however,
 * \\ MapEntry.processingRule is ALL_MATCHES, all MapSets in the
 * MapEntry are evaluated.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapSet extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an indicator that states whether processing is to stop at
     * the first matching MapTarget or whether all MapTargets in
     * the set are to be evaluated
     */
    private edu.mayo.cts2.framework.model.mapversion.types.MapProcessingRule _processingRule;

    /**
     * Field _entryOrder.
     */
    private Long _entryOrder;

    /**
     * Field _mapTargetList.
     */
    private java.util.List<MapTarget> _mapTargetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapSet() {
        super();
        this._mapTargetList = new java.util.ArrayList<MapTarget>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMapTarget
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMapTarget(
            final MapTarget vMapTarget)
    throws IndexOutOfBoundsException {
        this._mapTargetList.add(vMapTarget);
    }

    /**
     * 
     * 
     * @param index
     * @param vMapTarget
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMapTarget(
            final int index,
            final MapTarget vMapTarget)
    throws IndexOutOfBoundsException {
        this._mapTargetList.add(index, vMapTarget);
    }

    /**
     * Method enumerateMapTarget.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends MapTarget> enumerateMapTarget(
    ) {
        return Collections.enumeration(this._mapTargetList);
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

        if (obj instanceof MapSet) {

            MapSet temp = (MapSet)obj;
            if (this._processingRule != null) {
                if (temp._processingRule == null) return false;
                if (!this._processingRule.equals(temp._processingRule)) 
                    return false;
            } else if (temp._processingRule != null)
                return false;
            if (this._entryOrder != null) {
                if (temp._entryOrder == null) return false;
                if (!this._entryOrder.equals(temp._entryOrder)) 
                    return false;
            } else if (temp._entryOrder != null)
                return false;
            if (this._mapTargetList != null) {
                if (temp._mapTargetList == null) return false;
                return this._mapTargetList.equals(temp._mapTargetList);
            } else return temp._mapTargetList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'entryOrder'.
     * 
     * @return the value of field 'EntryOrder'.
     */
    public Long getEntryOrder(
    ) {
        return this._entryOrder;
    }

    /**
     * Method getMapTarget.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.mapversion.MapTarget at the
     * given index
     */
    public MapTarget getMapTarget(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mapTargetList.size()) {
            throw new IndexOutOfBoundsException("getMapTarget: Index value '" + index + "' not in range [0.." + (this._mapTargetList.size() - 1) + "]");
        }

        return _mapTargetList.get(index);
    }

    /**
     * Method getMapTarget.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public MapTarget[] getMapTarget(
    ) {
        MapTarget[] array = new MapTarget[0];
        return this._mapTargetList.toArray(array);
    }

    /**
     * Method getMapTargetAsReference.Returns a reference to
     * '_mapTargetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<MapTarget> getMapTargetAsReference(
    ) {
        return this._mapTargetList;
    }

    /**
     * Method getMapTargetCount.
     * 
     * @return the size of this collection
     */
    public int getMapTargetCount(
    ) {
        return this._mapTargetList.size();
    }

    /**
     * Returns the value of field 'processingRule'. The field
     * 'processingRule' has the following description: an indicator
     * that states whether processing is to stop at the first
     * matching MapTarget or whether all MapTargets in the set are
     * to be evaluated
     * 
     * @return the value of field 'ProcessingRule'.
     */
    public edu.mayo.cts2.framework.model.mapversion.types.MapProcessingRule getProcessingRule(
    ) {
        return this._processingRule;
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
        if (_entryOrder != null) {
           result = 37 * result + _entryOrder.hashCode();
        }
        if (_mapTargetList != null) {
           result = 37 * result + _mapTargetList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateMapTarget.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends MapTarget> iterateMapTarget(
    ) {
        return this._mapTargetList.iterator();
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
    public void removeAllMapTarget(
    ) {
        this._mapTargetList.clear();
    }

    /**
     * Method removeMapTarget.
     * 
     * @param vMapTarget
     * @return true if the object was removed from the collection.
     */
    public boolean removeMapTarget(
            final MapTarget vMapTarget) {
        return _mapTargetList.remove(vMapTarget);
    }

    /**
     * Method removeMapTargetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public MapTarget removeMapTargetAt(
            final int index) {
        MapTarget obj = this._mapTargetList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'entryOrder'.
     * 
     * @param entryOrder the value of field 'entryOrder'.
     */
    public void setEntryOrder(
            final Long entryOrder) {
        this._entryOrder = entryOrder;
    }

    /**
     * 
     * 
     * @param index
     * @param vMapTarget
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMapTarget(
            final int index,
            final MapTarget vMapTarget)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mapTargetList.size()) {
            throw new IndexOutOfBoundsException("setMapTarget: Index value '" + index + "' not in range [0.." + (this._mapTargetList.size() - 1) + "]");
        }

        this._mapTargetList.set(index, vMapTarget);
    }

    /**
     * 
     * 
     * @param vMapTargetArray
     */
    public void setMapTarget(
            final MapTarget[] vMapTargetArray) {
        //-- copy array
        _mapTargetList.clear();

        Collections.addAll(this._mapTargetList, vMapTargetArray);
    }

    /**
     * Sets the value of '_mapTargetList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vMapTargetList the Vector to copy.
     */
    public void setMapTarget(
            final java.util.List<MapTarget> vMapTargetList) {
        // copy vector
        this._mapTargetList.clear();

        this._mapTargetList.addAll(vMapTargetList);
    }

    /**
     * Sets the value of '_mapTargetList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param mapTargetList the Vector to set.
     */
    public void setMapTargetAsReference(
            final java.util.List<MapTarget> mapTargetList) {
        this._mapTargetList = mapTargetList;
    }

    /**
     * Sets the value of field 'processingRule'. The field
     * 'processingRule' has the following description: an indicator
     * that states whether processing is to stop at the first
     * matching MapTarget or whether all MapTargets in the set are
     * to be evaluated
     * 
     * @param processingRule the value of field 'processingRule'.
     */
    public void setProcessingRule(
            final edu.mayo.cts2.framework.model.mapversion.types.MapProcessingRule processingRule) {
        this._processingRule = processingRule;
    }

    /**
     * Method unmarshalMapSet.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.mapversion.MapSet
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
