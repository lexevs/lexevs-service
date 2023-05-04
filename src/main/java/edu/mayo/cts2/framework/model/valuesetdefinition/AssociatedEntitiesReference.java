/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

/**
 * The description of a set of entities that are associated with a
 * referenced entity. This description names a reference entity and
 * an association predicate, which identifies a set of entities
 * that are related to
 *  the reference entity according to a given code system. The
 * description can reference the direct targets of the association
 * (children), the direct sources of the association (parents), the
 * transitive closure of the
 *  association targets (descendants), the transitive closure of
 * the association sources (ancestors) and can state whether all
 * intermediate nodes are included in the closure or just the leaf
 * nodes.Note that the terms "parent"
 *  and "children" are asserted in reference to the predicate
 * itself. As an example, in the association "arm subClassOf
 * bodyPart", the "parent" is arm and the "child" is bodyPart.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociatedEntitiesReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an indicator that determines whether the referencedEntity
     * serves in the source (SOURCE_TO_TARGET) or target
     * (TARGET_TO_SOURCE) role.
     */
    private edu.mayo.cts2.framework.model.core.types.AssociationDirection _direction;

    /**
     * an indicator that determines whether all nodes in the
     * transitive closure are to be included in the resulting set
     * or only the nodes that terminate the closure. This indicator
     * is ignored if
     *  transitivity is not TRANSITIVE_CLOSURE. Note that nodes
     * that participate in cycles are not included if leafOnly is
     * set to LEAF_ONLY.
     */
    private edu.mayo.cts2.framework.model.valuesetdefinition.types.LeafOrAll _leafOnly = edu.mayo.cts2.framework.model.valuesetdefinition.types.LeafOrAll.fromValue("ALL_INTERMEDIATE_NODES");

    /**
     * an indicator that determines whether only entity references
     * that participate in a direct association with the
     * referencedEntity are considered to be a part of the
     * definition or whether all entity
     *  references that appear on the transitive closure of entity
     * reference are to be included. Note that leafOnly further
     * qualifies this result.
     */
    private edu.mayo.cts2.framework.model.valuesetdefinition.types.TransitiveClosure _transitivity = edu.mayo.cts2.framework.model.valuesetdefinition.types.TransitiveClosure.fromValue("DIRECTLY_ASSOCIATED");

    /**
     * the entity reference that is the root of the association
     * description. referencedEntity is not considered to be part
     * of the resolution of AssociatedEntitiesReference. If it is
     * to be
     *  included in the final set, it must be explicitly named in a
     * second SpecificEntityList construct.
     */
    private edu.mayo.cts2.framework.model.core.URIAndEntityName _referencedEntity;

    /**
     * the code system that makes the association assertions
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemReference _codeSystem;

    /**
     * the version of the code system that makes the association
     * assertions. If present, \\codeSystemVersion must be a
     * version of codeSystem. If this attribute is present, the
     * referenced version
     *  of the code system will always be used to resolve the
     * associations. If absent, the specific version of the code
     * system to be used in resolution is determined in the resolve
     * value set definition call
     *  itself.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemVersionReference _codeSystemVersion;

    /**
     * the association predicate to be used in resolving the
     * definition entry.
     */
    private edu.mayo.cts2.framework.model.core.PredicateReference _predicate;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociatedEntitiesReference() {
        super();
        setLeafOnly(edu.mayo.cts2.framework.model.valuesetdefinition.types.LeafOrAll.fromValue("ALL_INTERMEDIATE_NODES"));
        setTransitivity(edu.mayo.cts2.framework.model.valuesetdefinition.types.TransitiveClosure.fromValue("DIRECTLY_ASSOCIATED"));
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

        if (obj instanceof AssociatedEntitiesReference) {

            AssociatedEntitiesReference temp = (AssociatedEntitiesReference)obj;
            if (this._direction != null) {
                if (temp._direction == null) return false;
                if (!this._direction.equals(temp._direction)) 
                    return false;
            } else if (temp._direction != null)
                return false;
            if (this._leafOnly != null) {
                if (temp._leafOnly == null) return false;
                if (!this._leafOnly.equals(temp._leafOnly)) 
                    return false;
            } else if (temp._leafOnly != null)
                return false;
            if (this._transitivity != null) {
                if (temp._transitivity == null) return false;
                if (!this._transitivity.equals(temp._transitivity)) 
                    return false;
            } else if (temp._transitivity != null)
                return false;
            if (this._referencedEntity != null) {
                if (temp._referencedEntity == null) return false;
                if (!this._referencedEntity.equals(temp._referencedEntity)) 
                    return false;
            } else if (temp._referencedEntity != null)
                return false;
            if (this._codeSystem != null) {
                if (temp._codeSystem == null) return false;
                if (!this._codeSystem.equals(temp._codeSystem)) 
                    return false;
            } else if (temp._codeSystem != null)
                return false;
            if (this._codeSystemVersion != null) {
                if (temp._codeSystemVersion == null) return false;
                if (!this._codeSystemVersion.equals(temp._codeSystemVersion)) 
                    return false;
            } else if (temp._codeSystemVersion != null)
                return false;
            if (this._predicate != null) {
                if (temp._predicate == null) return false;
                return this._predicate.equals(temp._predicate);
            } else return temp._predicate == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystem'. The field
     * 'codeSystem' has the following description: the code system
     * that makes the association assertions
     * 
     * @return the value of field 'CodeSystem'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemReference getCodeSystem(
    ) {
        return this._codeSystem;
    }

    /**
     * Returns the value of field 'codeSystemVersion'. The field
     * 'codeSystemVersion' has the following description: the
     * version of the code system that makes the association
     * assertions. If present, \\codeSystemVersion must be a
     * version of codeSystem. If this attribute is present, the
     * referenced version
     *  of the code system will always be used to resolve the
     * associations. If absent, the specific version of the code
     * system to be used in resolution is determined in the resolve
     * value set definition call
     *  itself.
     * 
     * @return the value of field 'CodeSystemVersion'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference getCodeSystemVersion(
    ) {
        return this._codeSystemVersion;
    }

    /**
     * Returns the value of field 'direction'. The field
     * 'direction' has the following description: an indicator that
     * determines whether the referencedEntity serves in the source
     * (SOURCE_TO_TARGET) or target (TARGET_TO_SOURCE) role.
     * 
     * @return the value of field 'Direction'.
     */
    public edu.mayo.cts2.framework.model.core.types.AssociationDirection getDirection(
    ) {
        return this._direction;
    }

    /**
     * Returns the value of field 'leafOnly'. The field 'leafOnly'
     * has the following description: an indicator that determines
     * whether all nodes in the transitive closure are to be
     * included in the resulting set or only the nodes that
     * terminate the closure. This indicator is ignored if
     *  transitivity is not TRANSITIVE_CLOSURE. Note that nodes
     * that participate in cycles are not included if leafOnly is
     * set to LEAF_ONLY.
     * 
     * @return the value of field 'LeafOnly'.
     */
    public edu.mayo.cts2.framework.model.valuesetdefinition.types.LeafOrAll getLeafOnly(
    ) {
        return this._leafOnly;
    }

    /**
     * Returns the value of field 'predicate'. The field
     * 'predicate' has the following description: the association
     * predicate to be used in resolving the definition entry.
     * 
     * @return the value of field 'Predicate'.
     */
    public edu.mayo.cts2.framework.model.core.PredicateReference getPredicate(
    ) {
        return this._predicate;
    }

    /**
     * Returns the value of field 'referencedEntity'. The field
     * 'referencedEntity' has the following description: the entity
     * reference that is the root of the association description.
     * referencedEntity is not considered to be part of the
     * resolution of AssociatedEntitiesReference. If it is to be
     *  included in the final set, it must be explicitly named in a
     * second SpecificEntityList construct.
     * 
     * @return the value of field 'ReferencedEntity'.
     */
    public edu.mayo.cts2.framework.model.core.URIAndEntityName getReferencedEntity(
    ) {
        return this._referencedEntity;
    }

    /**
     * Returns the value of field 'transitivity'. The field
     * 'transitivity' has the following description: an indicator
     * that determines whether only entity references that
     * participate in a direct association with the
     * referencedEntity are considered to be a part of the
     * definition or whether all entity
     *  references that appear on the transitive closure of entity
     * reference are to be included. Note that leafOnly further
     * qualifies this result.
     * 
     * @return the value of field 'Transitivity'.
     */
    public edu.mayo.cts2.framework.model.valuesetdefinition.types.TransitiveClosure getTransitivity(
    ) {
        return this._transitivity;
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
        if (_direction != null) {
           result = 37 * result + _direction.hashCode();
        }
        if (_leafOnly != null) {
           result = 37 * result + _leafOnly.hashCode();
        }
        if (_transitivity != null) {
           result = 37 * result + _transitivity.hashCode();
        }
        if (_referencedEntity != null) {
           result = 37 * result + _referencedEntity.hashCode();
        }
        if (_codeSystem != null) {
           result = 37 * result + _codeSystem.hashCode();
        }
        if (_codeSystemVersion != null) {
           result = 37 * result + _codeSystemVersion.hashCode();
        }
        if (_predicate != null) {
           result = 37 * result + _predicate.hashCode();
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
     * Sets the value of field 'codeSystem'. The field 'codeSystem'
     * has the following description: the code system that makes
     * the association assertions
     * 
     * @param codeSystem the value of field 'codeSystem'.
     */
    public void setCodeSystem(
            final edu.mayo.cts2.framework.model.core.CodeSystemReference codeSystem) {
        this._codeSystem = codeSystem;
    }

    /**
     * Sets the value of field 'codeSystemVersion'. The field
     * 'codeSystemVersion' has the following description: the
     * version of the code system that makes the association
     * assertions. If present, \\codeSystemVersion must be a
     * version of codeSystem. If this attribute is present, the
     * referenced version
     *  of the code system will always be used to resolve the
     * associations. If absent, the specific version of the code
     * system to be used in resolution is determined in the resolve
     * value set definition call
     *  itself.
     * 
     * @param codeSystemVersion the value of field
     * 'codeSystemVersion'.
     */
    public void setCodeSystemVersion(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference codeSystemVersion) {
        this._codeSystemVersion = codeSystemVersion;
    }

    /**
     * Sets the value of field 'direction'. The field 'direction'
     * has the following description: an indicator that determines
     * whether the referencedEntity serves in the source
     * (SOURCE_TO_TARGET) or target (TARGET_TO_SOURCE) role.
     * 
     * @param direction the value of field 'direction'.
     */
    public void setDirection(
            final edu.mayo.cts2.framework.model.core.types.AssociationDirection direction) {
        this._direction = direction;
    }

    /**
     * Sets the value of field 'leafOnly'. The field 'leafOnly' has
     * the following description: an indicator that determines
     * whether all nodes in the transitive closure are to be
     * included in the resulting set or only the nodes that
     * terminate the closure. This indicator is ignored if
     *  transitivity is not TRANSITIVE_CLOSURE. Note that nodes
     * that participate in cycles are not included if leafOnly is
     * set to LEAF_ONLY.
     * 
     * @param leafOnly the value of field 'leafOnly'.
     */
    public void setLeafOnly(
            final edu.mayo.cts2.framework.model.valuesetdefinition.types.LeafOrAll leafOnly) {
        this._leafOnly = leafOnly;
    }

    /**
     * Sets the value of field 'predicate'. The field 'predicate'
     * has the following description: the association predicate to
     * be used in resolving the definition entry.
     * 
     * @param predicate the value of field 'predicate'.
     */
    public void setPredicate(
            final edu.mayo.cts2.framework.model.core.PredicateReference predicate) {
        this._predicate = predicate;
    }

    /**
     * Sets the value of field 'referencedEntity'. The field
     * 'referencedEntity' has the following description: the entity
     * reference that is the root of the association description.
     * referencedEntity is not considered to be part of the
     * resolution of AssociatedEntitiesReference. If it is to be
     *  included in the final set, it must be explicitly named in a
     * second SpecificEntityList construct.
     * 
     * @param referencedEntity the value of field 'referencedEntity'
     */
    public void setReferencedEntity(
            final edu.mayo.cts2.framework.model.core.URIAndEntityName referencedEntity) {
        this._referencedEntity = referencedEntity;
    }

    /**
     * Sets the value of field 'transitivity'. The field
     * 'transitivity' has the following description: an indicator
     * that determines whether only entity references that
     * participate in a direct association with the
     * referencedEntity are considered to be a part of the
     * definition or whether all entity
     *  references that appear on the transitive closure of entity
     * reference are to be included. Note that leafOnly further
     * qualifies this result.
     * 
     * @param transitivity the value of field 'transitivity'.
     */
    public void setTransitivity(
            final edu.mayo.cts2.framework.model.valuesetdefinition.types.TransitiveClosure transitivity) {
        this._transitivity = transitivity;
    }

    /**
     * Method unmarshalAssociatedEntitiesReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.AssociatedEntitiesReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
