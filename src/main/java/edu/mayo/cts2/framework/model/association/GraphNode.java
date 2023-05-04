/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.association;

/**
 * The summary of an association as represented in a flattened
 * graph structure. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class GraphNode extends AssociationDirectoryEntry
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an integer that corresponds to the particular
     * EntityReference in nodeEntity. Every instance of the same
     * EntityReference will be represented by the same nodeNumber.
     * There
     *  will be graph node for every source predicate target
     * combination in the association, with multiple GraphNodes
     * being generated for targets that are of type set or BNode.
     */
    private Long _nodeNumber;

    /**
     * an indicator whether nodeEntity plays a source or a target
     * role in the accompanying AssociationDirectory instance
     */
    private edu.mayo.cts2.framework.model.core.types.AssociationDirection _direction;

    /**
     * an integer that represents the next graph node that is
     * reached by traversing the specified predicate in the
     * specified direction. This number will only be present if the
     * result of
     *  traversing predicate results in an EntityReference. Target
     * nodes of type ResourceReference or Literal will not be
     * assigned node numbers. Note that each EntityReference target
     * of
     *  a nested BNODE will be represented by a different GraphNode.
     */
    private Long _nextNodeNumber;

    /**
     * The one based distance in hops between the nodeEntity and
     * the graph focus.
     */
    private Long _depth;

    /**
     * the URI, name and a designation for the EntityReference
     * represented by this node. nodeEntity represents the
     * association subject when direction is
     *  SOURCE_TO_TARGET and (one of the) targets when direction is
     * TARGET_TO_SOURCE.
     */
    private edu.mayo.cts2.framework.model.core.URIAndEntityName _nodeEntity;


      //----------------/
     //- Constructors -/
    //----------------/

    public GraphNode() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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

        if (obj instanceof GraphNode) {

            GraphNode temp = (GraphNode)obj;
            if (this._nodeNumber != null) {
                if (temp._nodeNumber == null) return false;
                if (!this._nodeNumber.equals(temp._nodeNumber)) 
                    return false;
            } else if (temp._nodeNumber != null)
                return false;
            if (this._direction != null) {
                if (temp._direction == null) return false;
                if (!this._direction.equals(temp._direction)) 
                    return false;
            } else if (temp._direction != null)
                return false;
            if (this._nextNodeNumber != null) {
                if (temp._nextNodeNumber == null) return false;
                if (!this._nextNodeNumber.equals(temp._nextNodeNumber)) 
                    return false;
            } else if (temp._nextNodeNumber != null)
                return false;
            if (this._depth != null) {
                if (temp._depth == null) return false;
                if (!this._depth.equals(temp._depth)) 
                    return false;
            } else if (temp._depth != null)
                return false;
            if (this._nodeEntity != null) {
                if (temp._nodeEntity == null) return false;
                return this._nodeEntity.equals(temp._nodeEntity);
            } else return temp._nodeEntity == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'depth'. The field 'depth' has
     * the following description: The one based distance in hops
     * between the nodeEntity and the graph focus.
     * 
     * @return the value of field 'Depth'.
     */
    public Long getDepth(
    ) {
        return this._depth;
    }

    /**
     * Returns the value of field 'direction'. The field
     * 'direction' has the following description: an indicator
     * whether nodeEntity plays a source or a target role in the
     * accompanying AssociationDirectory instance
     * 
     * @return the value of field 'Direction'.
     */
    public edu.mayo.cts2.framework.model.core.types.AssociationDirection getDirection(
    ) {
        return this._direction;
    }

    /**
     * Returns the value of field 'nextNodeNumber'. The field
     * 'nextNodeNumber' has the following description: an integer
     * that represents the next graph node that is reached by
     * traversing the specified predicate in the specified
     * direction. This number will only be present if the result of
     *  traversing predicate results in an EntityReference. Target
     * nodes of type ResourceReference or Literal will not be
     * assigned node numbers. Note that each EntityReference target
     * of
     *  a nested BNODE will be represented by a different
     * GraphNode.
     * 
     * @return the value of field 'NextNodeNumber'.
     */
    public Long getNextNodeNumber(
    ) {
        return this._nextNodeNumber;
    }

    /**
     * Returns the value of field 'nodeEntity'. The field
     * 'nodeEntity' has the following description: the URI, name
     * and a designation for the EntityReference represented by
     * this node. nodeEntity represents the association subject
     * when direction is
     *  SOURCE_TO_TARGET and (one of the) targets when direction is
     * TARGET_TO_SOURCE.
     * 
     * @return the value of field 'NodeEntity'.
     */
    public edu.mayo.cts2.framework.model.core.URIAndEntityName getNodeEntity(
    ) {
        return this._nodeEntity;
    }

    /**
     * Returns the value of field 'nodeNumber'. The field
     * 'nodeNumber' has the following description: an integer that
     * corresponds to the particular EntityReference in nodeEntity.
     * Every instance of the same EntityReference will be
     * represented by the same nodeNumber. There
     *  will be graph node for every source predicate target
     * combination in the association, with multiple GraphNodes
     * being generated for targets that are of type set or BNode.
     * 
     * @return the value of field 'NodeNumber'.
     */
    public Long getNodeNumber(
    ) {
        return this._nodeNumber;
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
        if (_nodeNumber != null) {
           result = 37 * result + _nodeNumber.hashCode();
        }
        if (_direction != null) {
           result = 37 * result + _direction.hashCode();
        }
        if (_nextNodeNumber != null) {
           result = 37 * result + _nextNodeNumber.hashCode();
        }
        if (_depth != null) {
           result = 37 * result + _depth.hashCode();
        }
        if (_nodeEntity != null) {
           result = 37 * result + _nodeEntity.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

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
     * Sets the value of field 'depth'. The field 'depth' has the
     * following description: The one based distance in hops
     * between the nodeEntity and the graph focus.
     * 
     * @param depth the value of field 'depth'.
     */
    public void setDepth(
            final Long depth) {
        this._depth = depth;
    }

    /**
     * Sets the value of field 'direction'. The field 'direction'
     * has the following description: an indicator whether
     * nodeEntity plays a source or a target role in the
     * accompanying AssociationDirectory instance
     * 
     * @param direction the value of field 'direction'.
     */
    public void setDirection(
            final edu.mayo.cts2.framework.model.core.types.AssociationDirection direction) {
        this._direction = direction;
    }

    /**
     * Sets the value of field 'nextNodeNumber'. The field
     * 'nextNodeNumber' has the following description: an integer
     * that represents the next graph node that is reached by
     * traversing the specified predicate in the specified
     * direction. This number will only be present if the result of
     *  traversing predicate results in an EntityReference. Target
     * nodes of type ResourceReference or Literal will not be
     * assigned node numbers. Note that each EntityReference target
     * of
     *  a nested BNODE will be represented by a different
     * GraphNode.
     * 
     * @param nextNodeNumber the value of field 'nextNodeNumber'.
     */
    public void setNextNodeNumber(
            final Long nextNodeNumber) {
        this._nextNodeNumber = nextNodeNumber;
    }

    /**
     * Sets the value of field 'nodeEntity'. The field 'nodeEntity'
     * has the following description: the URI, name and a
     * designation for the EntityReference represented by this
     * node. nodeEntity represents the association subject when
     * direction is
     *  SOURCE_TO_TARGET and (one of the) targets when direction is
     * TARGET_TO_SOURCE.
     * 
     * @param nodeEntity the value of field 'nodeEntity'.
     */
    public void setNodeEntity(
            final edu.mayo.cts2.framework.model.core.URIAndEntityName nodeEntity) {
        this._nodeEntity = nodeEntity;
    }

    /**
     * Sets the value of field 'nodeNumber'. The field 'nodeNumber'
     * has the following description: an integer that corresponds
     * to the particular EntityReference in nodeEntity. Every
     * instance of the same EntityReference will be represented by
     * the same nodeNumber. There
     *  will be graph node for every source predicate target
     * combination in the association, with multiple GraphNodes
     * being generated for targets that are of type set or BNode.
     * 
     * @param nodeNumber the value of field 'nodeNumber'.
     */
    public void setNodeNumber(
            final Long nodeNumber) {
        this._nodeNumber = nodeNumber;
    }

    /**
     * Method unmarshalGraphNode.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.association.GraphNode
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
