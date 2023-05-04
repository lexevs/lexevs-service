/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.association;

import edu.mayo.cts2.framework.model.association.types.GraphDirection;
import edu.mayo.cts2.framework.model.association.types.GraphFocus;
import edu.mayo.cts2.framework.model.core.Directory;
import edu.mayo.cts2.framework.model.core.URIAndEntityName;
import java.util.Collections;

/**
 * An augmented rendering of a set of Associations where the
 * linkage between subject and target nodes has been normalized for
 * easier traversal.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociationGraph extends Directory
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the depth (one based) of the graph. This is a copy of the
     * resolveDepth parameter of the resolveAsGraph method in the
     * AdvancedAssociationQueryService
     */
    private Long _expansionDepth;

    /**
     * the direction the graph was expanded. This is a copy of the
     * resolveDirection parameter of the resolveAsGraph method in
     * the AdvancedAssociationQueryService
     */
    private GraphDirection _expansionDirection;

    /**
     * the focus of the graph
     */
    private GraphFocus _graphFocus;

    /**
     * the focus entity of the graph, if any. This is a copy of the
     * focus parameter from the resolveAsGraph method in the
     * AdvancedAssociationQueryService
     */
    private URIAndEntityName _focusEntity;

    /**
     * Field _entryList.
     */
    private java.util.List<GraphNode> _entryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociationGraph() {
        super();
        this._entryList = new java.util.ArrayList<GraphNode>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEntry
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final GraphNode vEntry)
    throws IndexOutOfBoundsException {
        this._entryList.add(vEntry);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final int index,
            final GraphNode vEntry)
    throws IndexOutOfBoundsException {
        this._entryList.add(index, vEntry);
    }

    /**
     * Method enumerateEntry.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends GraphNode> enumerateEntry(
    ) {
        return Collections.enumeration(this._entryList);
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

        if (obj instanceof AssociationGraph) {

            AssociationGraph temp = (AssociationGraph)obj;
            if (this._expansionDepth != null) {
                if (temp._expansionDepth == null) return false;
                if (!this._expansionDepth.equals(temp._expansionDepth)) 
                    return false;
            } else if (temp._expansionDepth != null)
                return false;
            if (this._expansionDirection != null) {
                if (temp._expansionDirection == null) return false;
                if (!this._expansionDirection.equals(temp._expansionDirection)) 
                    return false;
            } else if (temp._expansionDirection != null)
                return false;
            if (this._graphFocus != null) {
                if (temp._graphFocus == null) return false;
                if (!this._graphFocus.equals(temp._graphFocus)) 
                    return false;
            } else if (temp._graphFocus != null)
                return false;
            if (this._focusEntity != null) {
                if (temp._focusEntity == null) return false;
                if (!this._focusEntity.equals(temp._focusEntity)) 
                    return false;
            } else if (temp._focusEntity != null)
                return false;
            if (this._entryList != null) {
                if (temp._entryList == null) return false;
                return this._entryList.equals(temp._entryList);
            } else return temp._entryList == null;
        }
        return false;
    }

    /**
     * Method getEntry.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.association.GraphNode at the
     * given index
     */
    public GraphNode getEntry(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("getEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }

        return _entryList.get(index);
    }

    /**
     * Method getEntry.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public GraphNode[] getEntry(
    ) {
        GraphNode[] array = new GraphNode[0];
        return this._entryList.toArray(array);
    }

    /**
     * Method getEntryAsReference.Returns a reference to
     * '_entryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<GraphNode> getEntryAsReference(
    ) {
        return this._entryList;
    }

    /**
     * Method getEntryCount.
     * 
     * @return the size of this collection
     */
    public int getEntryCount(
    ) {
        return this._entryList.size();
    }

    /**
     * Returns the value of field 'expansionDepth'. The field
     * 'expansionDepth' has the following description: the depth
     * (one based) of the graph. This is a copy of the resolveDepth
     * parameter of the resolveAsGraph method in the
     * AdvancedAssociationQueryService
     * 
     * @return the value of field 'ExpansionDepth'.
     */
    public Long getExpansionDepth(
    ) {
        return this._expansionDepth;
    }

    /**
     * Returns the value of field 'expansionDirection'. The field
     * 'expansionDirection' has the following description: the
     * direction the graph was expanded. This is a copy of the
     * resolveDirection parameter of the resolveAsGraph method in
     * the AdvancedAssociationQueryService
     * 
     * @return the value of field 'ExpansionDirection'.
     */
    public GraphDirection getExpansionDirection(
    ) {
        return this._expansionDirection;
    }

    /**
     * Returns the value of field 'focusEntity'. The field
     * 'focusEntity' has the following description: the focus
     * entity of the graph, if any. This is a copy of the focus
     * parameter from the resolveAsGraph method in the
     * AdvancedAssociationQueryService
     * 
     * @return the value of field 'FocusEntity'.
     */
    public URIAndEntityName getFocusEntity(
    ) {
        return this._focusEntity;
    }

    /**
     * Returns the value of field 'graphFocus'. The field
     * 'graphFocus' has the following description: the focus of the
     * graph
     * 
     * @return the value of field 'GraphFocus'.
     */
    public GraphFocus getGraphFocus(
    ) {
        return this._graphFocus;
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
        if (_expansionDepth != null) {
           result = 37 * result + _expansionDepth.hashCode();
        }
        if (_expansionDirection != null) {
           result = 37 * result + _expansionDirection.hashCode();
        }
        if (_graphFocus != null) {
           result = 37 * result + _graphFocus.hashCode();
        }
        if (_focusEntity != null) {
           result = 37 * result + _focusEntity.hashCode();
        }
        if (_entryList != null) {
           result = 37 * result + _entryList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateEntry.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends GraphNode> iterateEntry(
    ) {
        return this._entryList.iterator();
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
    public void removeAllEntry(
    ) {
        this._entryList.clear();
    }

    /**
     * Method removeEntry.
     * 
     * @param vEntry
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntry(
            final GraphNode vEntry) {
        return _entryList.remove(vEntry);
    }

    /**
     * Method removeEntryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public GraphNode removeEntryAt(
            final int index) {
        GraphNode obj = this._entryList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntry(
            final int index,
            final GraphNode vEntry)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("setEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }

        this._entryList.set(index, vEntry);
    }

    /**
     * 
     * 
     * @param vEntryArray
     */
    public void setEntry(
            final GraphNode[] vEntryArray) {
        //-- copy array
        _entryList.clear();

        Collections.addAll(this._entryList, vEntryArray);
    }

    /**
     * Sets the value of '_entryList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vEntryList the Vector to copy.
     */
    public void setEntry(
            final java.util.List<GraphNode> vEntryList) {
        // copy vector
        this._entryList.clear();

        this._entryList.addAll(vEntryList);
    }

    /**
     * Sets the value of '_entryList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param entryList the Vector to set.
     */
    public void setEntryAsReference(
            final java.util.List<GraphNode> entryList) {
        this._entryList = entryList;
    }

    /**
     * Sets the value of field 'expansionDepth'. The field
     * 'expansionDepth' has the following description: the depth
     * (one based) of the graph. This is a copy of the resolveDepth
     * parameter of the resolveAsGraph method in the
     * AdvancedAssociationQueryService
     * 
     * @param expansionDepth the value of field 'expansionDepth'.
     */
    public void setExpansionDepth(
            final Long expansionDepth) {
        this._expansionDepth = expansionDepth;
    }

    /**
     * Sets the value of field 'expansionDirection'. The field
     * 'expansionDirection' has the following description: the
     * direction the graph was expanded. This is a copy of the
     * resolveDirection parameter of the resolveAsGraph method in
     * the AdvancedAssociationQueryService
     * 
     * @param expansionDirection the value of field
     * 'expansionDirection'.
     */
    public void setExpansionDirection(
            final GraphDirection expansionDirection) {
        this._expansionDirection = expansionDirection;
    }

    /**
     * Sets the value of field 'focusEntity'. The field
     * 'focusEntity' has the following description: the focus
     * entity of the graph, if any. This is a copy of the focus
     * parameter from the resolveAsGraph method in the
     * AdvancedAssociationQueryService
     * 
     * @param focusEntity the value of field 'focusEntity'.
     */
    public void setFocusEntity(
            final URIAndEntityName focusEntity) {
        this._focusEntity = focusEntity;
    }

    /**
     * Sets the value of field 'graphFocus'. The field 'graphFocus'
     * has the following description: the focus of the graph
     * 
     * @param graphFocus the value of field 'graphFocus'.
     */
    public void setGraphFocus(
            final GraphFocus graphFocus) {
        this._graphFocus = graphFocus;
    }

    /**
     * Method unmarshalAssociationGraph.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.association.AssociationGraph
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
