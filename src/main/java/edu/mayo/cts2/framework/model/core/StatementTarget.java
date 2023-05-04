/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

import java.util.Collections;

/**
 * the target of a Statement. StatementTarget represents one of a
 * literal value, a reference to a non-entity type resource, an
 * entity, or an anonymous blank BNODE.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class StatementTarget extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an external identifier that has been assigned to the
     * statement with this particular target by the authoring body.
     * As an example, this would carry the SctId if the authoring
     * body were
     *  SNOMED-CT
     */
    private String _externalIdentifier;

    /**
     * Internal choice value storage
     */
    private Object _choiceValue;

    /**
     * the URI and optional namespace/name when the target type is
     * ENTITY
     */
    private URIAndEntityName _entity;

    /**
     * the literal target when the statement type is LITERAL.
     */
    private OpaqueData _literal;

    /**
     * the resource URI when the statement type is RESOURCE
     */
    private String _resource;

    /**
     * a collection of statements about an anonymous subject
     */
    private java.util.List<AnonymousStatement> _bnodeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public StatementTarget() {
        super();
        this._bnodeList = new java.util.ArrayList<AnonymousStatement>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vBnode
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBnode(
            final AnonymousStatement vBnode)
    throws IndexOutOfBoundsException {
        this._bnodeList.add(vBnode);
    }

    /**
     * 
     * 
     * @param index
     * @param vBnode
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addBnode(
            final int index,
            final AnonymousStatement vBnode)
    throws IndexOutOfBoundsException {
        this._bnodeList.add(index, vBnode);
    }

    /**
     * Method enumerateBnode.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends AnonymousStatement> enumerateBnode(
    ) {
        return Collections.enumeration(this._bnodeList);
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

        if (obj instanceof StatementTarget) {

            StatementTarget temp = (StatementTarget)obj;
            if (this._externalIdentifier != null) {
                if (temp._externalIdentifier == null) return false;
                if (!this._externalIdentifier.equals(temp._externalIdentifier)) 
                    return false;
            } else if (temp._externalIdentifier != null)
                return false;
            if (this._choiceValue != null) {
                if (temp._choiceValue == null) return false;
                if (!this._choiceValue.equals(temp._choiceValue)) 
                    return false;
            } else if (temp._choiceValue != null)
                return false;
            if (this._entity != null) {
                if (temp._entity == null) return false;
                if (!this._entity.equals(temp._entity)) 
                    return false;
            } else if (temp._entity != null)
                return false;
            if (this._literal != null) {
                if (temp._literal == null) return false;
                if (!this._literal.equals(temp._literal)) 
                    return false;
            } else if (temp._literal != null)
                return false;
            if (this._resource != null) {
                if (temp._resource == null) return false;
                if (!this._resource.equals(temp._resource)) 
                    return false;
            } else if (temp._resource != null)
                return false;
            if (this._bnodeList != null) {
                if (temp._bnodeList == null) return false;
                return this._bnodeList.equals(temp._bnodeList);
            } else return temp._bnodeList == null;
        }
        return false;
    }

    /**
     * Method getBnode.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.AnonymousStatement at the
     * given index
     */
    public AnonymousStatement getBnode(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bnodeList.size()) {
            throw new IndexOutOfBoundsException("getBnode: Index value '" + index + "' not in range [0.." + (this._bnodeList.size() - 1) + "]");
        }

        return _bnodeList.get(index);
    }

    /**
     * Method getBnode.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public AnonymousStatement[] getBnode(
    ) {
        AnonymousStatement[] array = new AnonymousStatement[0];
        return this._bnodeList.toArray(array);
    }

    /**
     * Method getBnodeAsReference.Returns a reference to
     * '_bnodeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<AnonymousStatement> getBnodeAsReference(
    ) {
        return this._bnodeList;
    }

    /**
     * Method getBnodeCount.
     * 
     * @return the size of this collection
     */
    public int getBnodeCount(
    ) {
        return this._bnodeList.size();
    }

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'entity'. The field 'entity' has
     * the following description: the URI and optional
     * namespace/name when the target type is ENTITY
     * 
     * @return the value of field 'Entity'.
     */
    public URIAndEntityName getEntity(
    ) {
        return this._entity;
    }

    /**
     * Returns the value of field 'externalIdentifier'. The field
     * 'externalIdentifier' has the following description: an
     * external identifier that has been assigned to the statement
     * with this particular target by the authoring body. As an
     * example, this would carry the SctId if the authoring body
     * were
     *  SNOMED-CT
     * 
     * @return the value of field 'ExternalIdentifier'.
     */
    public String getExternalIdentifier(
    ) {
        return this._externalIdentifier;
    }

    /**
     * Returns the value of field 'literal'. The field 'literal'
     * has the following description: the literal target when the
     * statement type is LITERAL.
     * 
     * @return the value of field 'Literal'.
     */
    public OpaqueData getLiteral(
    ) {
        return this._literal;
    }

    /**
     * Returns the value of field 'resource'. The field 'resource'
     * has the following description: the resource URI when the
     * statement type is RESOURCE
     * 
     * @return the value of field 'Resource'.
     */
    public String getResource(
    ) {
        return this._resource;
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
        if (_externalIdentifier != null) {
           result = 37 * result + _externalIdentifier.hashCode();
        }
        if (_choiceValue != null) {
           result = 37 * result + _choiceValue.hashCode();
        }
        if (_entity != null) {
           result = 37 * result + _entity.hashCode();
        }
        if (_literal != null) {
           result = 37 * result + _literal.hashCode();
        }
        if (_resource != null) {
           result = 37 * result + _resource.hashCode();
        }
        if (_bnodeList != null) {
           result = 37 * result + _bnodeList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateBnode.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends AnonymousStatement> iterateBnode(
    ) {
        return this._bnodeList.iterator();
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
    public void removeAllBnode(
    ) {
        this._bnodeList.clear();
    }

    /**
     * Method removeBnode.
     * 
     * @param vBnode
     * @return true if the object was removed from the collection.
     */
    public boolean removeBnode(
            final AnonymousStatement vBnode) {
        return _bnodeList.remove(vBnode);
    }

    /**
     * Method removeBnodeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public AnonymousStatement removeBnodeAt(
            final int index) {
        AnonymousStatement obj = this._bnodeList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vBnode
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setBnode(
            final int index,
            final AnonymousStatement vBnode)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._bnodeList.size()) {
            throw new IndexOutOfBoundsException("setBnode: Index value '" + index + "' not in range [0.." + (this._bnodeList.size() - 1) + "]");
        }

        this._bnodeList.set(index, vBnode);
    }

    /**
     * 
     * 
     * @param vBnodeArray
     */
    public void setBnode(
            final AnonymousStatement[] vBnodeArray) {
        //-- copy array
        _bnodeList.clear();

        Collections.addAll(this._bnodeList, vBnodeArray);
    }

    /**
     * Sets the value of '_bnodeList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vBnodeList the Vector to copy.
     */
    public void setBnode(
            final java.util.List<AnonymousStatement> vBnodeList) {
        // copy vector
        this._bnodeList.clear();

        this._bnodeList.addAll(vBnodeList);
    }

    /**
     * Sets the value of '_bnodeList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param bnodeList the Vector to set.
     */
    public void setBnodeAsReference(
            final java.util.List<AnonymousStatement> bnodeList) {
        this._bnodeList = bnodeList;
    }

    /**
     * Sets the value of field 'entity'. The field 'entity' has the
     * following description: the URI and optional namespace/name
     * when the target type is ENTITY
     * 
     * @param entity the value of field 'entity'.
     */
    public void setEntity(
            final URIAndEntityName entity) {
        this._entity = entity;
        this._choiceValue = entity;
    }

    /**
     * Sets the value of field 'externalIdentifier'. The field
     * 'externalIdentifier' has the following description: an
     * external identifier that has been assigned to the statement
     * with this particular target by the authoring body. As an
     * example, this would carry the SctId if the authoring body
     * were
     *  SNOMED-CT
     * 
     * @param externalIdentifier the value of field
     * 'externalIdentifier'.
     */
    public void setExternalIdentifier(
            final String externalIdentifier) {
        this._externalIdentifier = externalIdentifier;
    }

    /**
     * Sets the value of field 'literal'. The field 'literal' has
     * the following description: the literal target when the
     * statement type is LITERAL.
     * 
     * @param literal the value of field 'literal'.
     */
    public void setLiteral(
            final OpaqueData literal) {
        this._literal = literal;
        this._choiceValue = literal;
    }

    /**
     * Sets the value of field 'resource'. The field 'resource' has
     * the following description: the resource URI when the
     * statement type is RESOURCE
     * 
     * @param resource the value of field 'resource'.
     */
    public void setResource(
            final String resource) {
        this._resource = resource;
        this._choiceValue = resource;
    }

    /**
     * Method unmarshalStatementTarget.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.StatementTarget
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
