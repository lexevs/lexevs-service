/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity;

import edu.mayo.cts2.framework.model.core.Comment;
import edu.mayo.cts2.framework.model.core.Definition;
import edu.mayo.cts2.framework.model.core.Example;
import edu.mayo.cts2.framework.model.core.Property;
import edu.mayo.cts2.framework.model.core.ScopedEntityName;
import edu.mayo.cts2.framework.model.core.URIAndEntityName;
import java.util.Collections;

/**
 * The attributes common to both named and anonymous entity
 * descriptions. EntityDescriptionBase is an abstract class and
 * cannot be directly instantiated.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class EntityDescriptionBase extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the URI that represents the entity (class, predicate and/or
     * individual) referenced by this EntityDescription
     *  about is a PersistentURI when entityDescriptionType is
     * NAMED_ENTITY_DESCRIPTION and LocalURI when
     * entityDescriptionType is ANONYMOUS_ENTITY_DESCRIPTION
     */
    private String _about;

    /**
     * If present, identifies the role that the code system plays
     * in the description
     *  of the entity. If absent, the role is unknown.
     */
    private edu.mayo.cts2.framework.model.core.types.CodeSystemRole _codeSystemRole;

    /**
     * the local namespace name and entity name that, together,
     * uniquely name this referenced within the context of a CTS2
     * service instance. As an example, a service instance may
     * choose to designate
     *  the entity referenced by the about URI of
     * http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#CabernetSauvignon
     * with the namespaceName "wine" and the name
     * "CabernetSauvignon".The name
     *  portion of ScopedEntityName must uniquely name the
     * particular entity within the context of the code system
     * version. 
     */
    private ScopedEntityName _entityID;

    /**
     * alternative unique identifiers that reference the about
     * entity in the context of describing code system version. The
     * namespace names the context from which the name (or code) is
     * derived.
     *  Note that it is possible for the entityId name and/or one
     * more alternateEntityId
     *  names to be represented in the designation attribute as
     * well. This would occur when the name serves a dual role of
     * unique identifier and human readable label. An example of
     *  alternateEntityId would be the SNOMED-CT fully specified
     * name, which serves as a unique identifier in human readable
     * form. This might or might not also be considered a
     * designation depending on the context
     *  and use case. Similarly, the SNOMED-CT Clinical Terms V3
     * Identifier (CTV3) and SNOMED-3 identifiers would appear here
     * as well, as would the HL7's case sensitive and case
     * insensitive unit of measure
     *  identifiers.
     */
    private java.util.List<ScopedEntityName> _alternateEntityIDList;

    /**
     * a reference to the version of an ontology or code system
     * that makes the set of assertions contained in this
     * description. Note that this references the "asserting", not
     * the "containing" code system
     *  version. As an example, the Wine Ontology imports the Food
     * Ontology, which, in turn contains descriptions of
     * PotableLiquid. A service that represented a (version of) the
     * Wine Ontology would contain an entity
     *  description about
     * "http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#PotableLiquid"
     * (namespaceName: food, name: PotableLiquid). The
     * describingCodeSystemVersion, however, would be
     *  "http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#"
     * even though this entity was described in the food ontology.
     * Note also that it both the food and wine ontology were
     * represented in a service, the service would
     *  contain two entity descriptions - one from the food
     * ontology perspective and one from the wine ontology
     * perspective.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemVersionReference _describingCodeSystemVersion;

    /**
     * a "string of (UNICODE) characters ... in a given natural
     * language, such as English or Japanese." A designation
     * provides the
     *  strongest clues as to the meaning of a class, predicate or
     * individual. While designations are not mandatory in an
     * entity description, as all that may be available to a
     * service is a code, service implementers are
     *  strongly encouraged to provide at least one preferred or
     * alternate designation to make the description visible to
     * text search engines.
     */
    private java.util.List<Designation> _designationList;

    /**
     * an explanation of the intended meaning of a concept. An
     * EntityDescription may have multiple definitions, each
     * derived from a different source, represented in a different
     * language or having
     *  a different purpose. Definitions apply only to classes and
     * predicates, not individuals.
     */
    private java.util.List<Definition> _definitionList;

    /**
     * an example of an instance or instances of the referenced
     * entity, typically written for human consumption. Examples
     * apply only to classes and predicates, not individuals.
     */
    private java.util.List<Example> _exampleList;

    /**
     * a note or comment about the history, status, use or other
     * descriptions about the EntityDescription. Observe that note,
     * as used in the CTS2 specification, does include examples
     *  or definitions.
     */
    private java.util.List<Comment> _noteList;

    /**
     * additional "non-semantic" (annotation) assertions about the
     * entity being described that do not fit into the designation,
     * definition, note, or example or entityId
     *  categories.
     */
    private java.util.List<Property> _propertyList;

    /**
     * a DirectoryURI that resolves to the list of statements that
     * were used in the assembly of this description. Statements
     * need only be present in service instances that support the
     *  Statement profile, and serves as a bridge between atomic
     * structure contained in the source resource and the CTS2
     * rendering.
     */
    private String _sourceStatements;

    /**
     * an AssociationDirectoryURI that resolves to a list of active
     * associations ("semantic" assertions) in which the about
     * entity appears as a subject and that are assertedBy the
     *  describingCodeSystemVersion. subjectOf is only included in
     * an EntityDescription when resolution would yield at least
     * one result. This attribute will only be present in CTS2
     * service
     *  implementations that support the ASSOCIATION QUERY profile.
     */
    private String _subjectOf;

    /**
     * a DirectoryURI that resolves to the list of active
     * associations ("semantic" assertions) in which the about
     * entity appears as a predicate and that are assertedBy the
     *  describingCodeSystemVersion. predicateOf is only included
     * in an EntityDescription when resolution would yield at least
     * one result. This attribute will only be present in CTS2
     *  service implementations that support the ASSOCIATION QUERY
     * profile.
     */
    private String _predicateOf;

    /**
     * a DirectoryURI that resolves to the list of active
     * associations ("semantic" assertions) in which the about
     * entity appears as either a direct target or the target of a
     * contained BNode and
     *  that are assertedBy the describingCodeSystemVersion.
     * targetOf is only included in an EntityDescription when
     * resolution would yield at least one result. This attribute
     * will only be present
     *  in CTS2 service implementations that support the
     * ASSOCIATION QUERY profile.
     */
    private String _targetOf;

    /**
     * the set of direct "parents" asserted by
     * describingCodeSystemVersion. It is the responsibility of the
     * service to determine what predicate(s) represent
     * "parent/child" relationships. Typically
     *  "parent" is associated with "rdfs:subClassOf" in the
     * OWL/RDF world and skos:broader/skos:narrower in the SKOS
     * environment. It is possible, however for some code systems
     * to have other relationships as well. As an
     *  example, some of the Open Biomedical Ontologies (OBO) use a
     * mixture of subClassOf and partOf relationships. 
     */
    private java.util.List<URIAndEntityName> _parentList;

    /**
     * a DirectoryURI that resolves to the list of direct "parents"
     * asserted by describingCodeSystemVersion. This returns the 
     *  parent elements above.
     */
    private String _parents;

    /**
     * a DirectoryURI that resolves to the transitive closure of
     * the "parents" relationship(s). The primary purpose for this
     * attribute is to provide a handle for subsumption queries. As
     * an example, to
     *  determine whether Class X was a subclass of Class Y, one
     * would query whether the EntityReference to Y was a member of
     * X.ancestors.
     */
    private String _ancestors;

    /**
     * a DirectoryURI that resolves to the list of direct
     * "children" asserted by describingCodeSystemVersion. As with
     * parent, it is the responsibility of the service to determine
     * what
     *  predicate(s) represent "parent/child" relationships.
     * children may also include entity references that appear in
     * the target of bnodes if they are determined to be such by
     * the service.
     */
    private String _children;

    /**
     * a DirectoryURI that resolves to the transitive closure of
     * the "children" relationship(s). The primary purpose for this
     * attribute is to provide a handle for subsumption queries. As
     * an example, a
     *  second way to determine whether Class X was a subclass of
     * Class Y, one would query whether the EntityReference to X
     * was a member of Y.descendants.
     */
    private String _descendants;

    /**
     * the set of type(s) which the entityReference is an instance
     * of. Because this is a terminology service, entityType must
     * include one of owl:class, owl:individual, rdf:predicate or
     * skos:concept,
     *  although it may carry many other types as well.
     */
    private java.util.List<URIAndEntityName> _entityTypeList;

    /**
     * a DirectoryURI that resolves to the list of entities that
     * asserted to be instances of the type represented by about
     * URI. This element is present only if resolution will return
     * a non-empty
     *  set.
     */
    private String _instances;

    /**
     * an entity that has been determined to be equivalent to the
     * about entity in the context of the assertions made by
     * describingCodeSystemVersion.
     */
    private java.util.List<URIAndEntityName> _equivalentEntityList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityDescriptionBase() {
        super();
        this._alternateEntityIDList = new java.util.ArrayList<ScopedEntityName>();
        this._designationList = new java.util.ArrayList<Designation>();
        this._definitionList = new java.util.ArrayList<Definition>();
        this._exampleList = new java.util.ArrayList<Example>();
        this._noteList = new java.util.ArrayList<Comment>();
        this._propertyList = new java.util.ArrayList<Property>();
        this._parentList = new java.util.ArrayList<URIAndEntityName>();
        this._entityTypeList = new java.util.ArrayList<URIAndEntityName>();
        this._equivalentEntityList = new java.util.ArrayList<URIAndEntityName>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAlternateEntityID
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateEntityID(
            final ScopedEntityName vAlternateEntityID)
    throws IndexOutOfBoundsException {
        this._alternateEntityIDList.add(vAlternateEntityID);
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateEntityID
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateEntityID(
            final int index,
            final ScopedEntityName vAlternateEntityID)
    throws IndexOutOfBoundsException {
        this._alternateEntityIDList.add(index, vAlternateEntityID);
    }

    /**
     * 
     * 
     * @param vDefinition
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinition(
            final Definition vDefinition)
    throws IndexOutOfBoundsException {
        this._definitionList.add(vDefinition);
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinition
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinition(
            final int index,
            final Definition vDefinition)
    throws IndexOutOfBoundsException {
        this._definitionList.add(index, vDefinition);
    }

    /**
     * 
     * 
     * @param vDesignation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDesignation(
            final Designation vDesignation)
    throws IndexOutOfBoundsException {
        this._designationList.add(vDesignation);
    }

    /**
     * 
     * 
     * @param index
     * @param vDesignation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDesignation(
            final int index,
            final Designation vDesignation)
    throws IndexOutOfBoundsException {
        this._designationList.add(index, vDesignation);
    }

    /**
     * 
     * 
     * @param vEntityType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntityType(
            final URIAndEntityName vEntityType)
    throws IndexOutOfBoundsException {
        this._entityTypeList.add(vEntityType);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntityType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntityType(
            final int index,
            final URIAndEntityName vEntityType)
    throws IndexOutOfBoundsException {
        this._entityTypeList.add(index, vEntityType);
    }

    /**
     * 
     * 
     * @param vEquivalentEntity
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEquivalentEntity(
            final URIAndEntityName vEquivalentEntity)
    throws IndexOutOfBoundsException {
        this._equivalentEntityList.add(vEquivalentEntity);
    }

    /**
     * 
     * 
     * @param index
     * @param vEquivalentEntity
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEquivalentEntity(
            final int index,
            final URIAndEntityName vEquivalentEntity)
    throws IndexOutOfBoundsException {
        this._equivalentEntityList.add(index, vEquivalentEntity);
    }

    /**
     * 
     * 
     * @param vExample
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExample(
            final Example vExample)
    throws IndexOutOfBoundsException {
        this._exampleList.add(vExample);
    }

    /**
     * 
     * 
     * @param index
     * @param vExample
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExample(
            final int index,
            final Example vExample)
    throws IndexOutOfBoundsException {
        this._exampleList.add(index, vExample);
    }

    /**
     * 
     * 
     * @param vNote
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNote(
            final Comment vNote)
    throws IndexOutOfBoundsException {
        this._noteList.add(vNote);
    }

    /**
     * 
     * 
     * @param index
     * @param vNote
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNote(
            final int index,
            final Comment vNote)
    throws IndexOutOfBoundsException {
        this._noteList.add(index, vNote);
    }

    /**
     * 
     * 
     * @param vParent
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParent(
            final URIAndEntityName vParent)
    throws IndexOutOfBoundsException {
        this._parentList.add(vParent);
    }

    /**
     * 
     * 
     * @param index
     * @param vParent
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParent(
            final int index,
            final URIAndEntityName vParent)
    throws IndexOutOfBoundsException {
        this._parentList.add(index, vParent);
    }

    /**
     * 
     * 
     * @param vProperty
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final Property vProperty)
    throws IndexOutOfBoundsException {
        this._propertyList.add(vProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final int index,
            final Property vProperty)
    throws IndexOutOfBoundsException {
        this._propertyList.add(index, vProperty);
    }

    /**
     * Method enumerateAlternateEntityID.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ScopedEntityName> enumerateAlternateEntityID(
    ) {
        return Collections.enumeration(this._alternateEntityIDList);
    }

    /**
     * Method enumerateDefinition.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Definition> enumerateDefinition(
    ) {
        return Collections.enumeration(this._definitionList);
    }

    /**
     * Method enumerateDesignation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Designation> enumerateDesignation(
    ) {
        return Collections.enumeration(this._designationList);
    }

    /**
     * Method enumerateEntityType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends URIAndEntityName> enumerateEntityType(
    ) {
        return Collections.enumeration(this._entityTypeList);
    }

    /**
     * Method enumerateEquivalentEntity.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends URIAndEntityName> enumerateEquivalentEntity(
    ) {
        return Collections.enumeration(this._equivalentEntityList);
    }

    /**
     * Method enumerateExample.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Example> enumerateExample(
    ) {
        return Collections.enumeration(this._exampleList);
    }

    /**
     * Method enumerateNote.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Comment> enumerateNote(
    ) {
        return Collections.enumeration(this._noteList);
    }

    /**
     * Method enumerateParent.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends URIAndEntityName> enumerateParent(
    ) {
        return Collections.enumeration(this._parentList);
    }

    /**
     * Method enumerateProperty.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Property> enumerateProperty(
    ) {
        return Collections.enumeration(this._propertyList);
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

        if (obj instanceof EntityDescriptionBase) {

            EntityDescriptionBase temp = (EntityDescriptionBase)obj;
            if (this._about != null) {
                if (temp._about == null) return false;
                if (!this._about.equals(temp._about)) 
                    return false;
            } else if (temp._about != null)
                return false;
            if (this._codeSystemRole != null) {
                if (temp._codeSystemRole == null) return false;
                if (!this._codeSystemRole.equals(temp._codeSystemRole)) 
                    return false;
            } else if (temp._codeSystemRole != null)
                return false;
            if (this._entityID != null) {
                if (temp._entityID == null) return false;
                if (!this._entityID.equals(temp._entityID)) 
                    return false;
            } else if (temp._entityID != null)
                return false;
            if (this._alternateEntityIDList != null) {
                if (temp._alternateEntityIDList == null) return false;
                if (!this._alternateEntityIDList.equals(temp._alternateEntityIDList)) 
                    return false;
            } else if (temp._alternateEntityIDList != null)
                return false;
            if (this._describingCodeSystemVersion != null) {
                if (temp._describingCodeSystemVersion == null) return false;
                if (!this._describingCodeSystemVersion.equals(temp._describingCodeSystemVersion)) 
                    return false;
            } else if (temp._describingCodeSystemVersion != null)
                return false;
            if (this._designationList != null) {
                if (temp._designationList == null) return false;
                if (!this._designationList.equals(temp._designationList)) 
                    return false;
            } else if (temp._designationList != null)
                return false;
            if (this._definitionList != null) {
                if (temp._definitionList == null) return false;
                if (!this._definitionList.equals(temp._definitionList)) 
                    return false;
            } else if (temp._definitionList != null)
                return false;
            if (this._exampleList != null) {
                if (temp._exampleList == null) return false;
                if (!this._exampleList.equals(temp._exampleList)) 
                    return false;
            } else if (temp._exampleList != null)
                return false;
            if (this._noteList != null) {
                if (temp._noteList == null) return false;
                if (!this._noteList.equals(temp._noteList)) 
                    return false;
            } else if (temp._noteList != null)
                return false;
            if (this._propertyList != null) {
                if (temp._propertyList == null) return false;
                if (!this._propertyList.equals(temp._propertyList)) 
                    return false;
            } else if (temp._propertyList != null)
                return false;
            if (this._sourceStatements != null) {
                if (temp._sourceStatements == null) return false;
                if (!this._sourceStatements.equals(temp._sourceStatements)) 
                    return false;
            } else if (temp._sourceStatements != null)
                return false;
            if (this._subjectOf != null) {
                if (temp._subjectOf == null) return false;
                if (!this._subjectOf.equals(temp._subjectOf)) 
                    return false;
            } else if (temp._subjectOf != null)
                return false;
            if (this._predicateOf != null) {
                if (temp._predicateOf == null) return false;
                if (!this._predicateOf.equals(temp._predicateOf)) 
                    return false;
            } else if (temp._predicateOf != null)
                return false;
            if (this._targetOf != null) {
                if (temp._targetOf == null) return false;
                if (!this._targetOf.equals(temp._targetOf)) 
                    return false;
            } else if (temp._targetOf != null)
                return false;
            if (this._parentList != null) {
                if (temp._parentList == null) return false;
                if (!this._parentList.equals(temp._parentList)) 
                    return false;
            } else if (temp._parentList != null)
                return false;
            if (this._parents != null) {
                if (temp._parents == null) return false;
                if (!this._parents.equals(temp._parents)) 
                    return false;
            } else if (temp._parents != null)
                return false;
            if (this._ancestors != null) {
                if (temp._ancestors == null) return false;
                if (!this._ancestors.equals(temp._ancestors)) 
                    return false;
            } else if (temp._ancestors != null)
                return false;
            if (this._children != null) {
                if (temp._children == null) return false;
                if (!this._children.equals(temp._children)) 
                    return false;
            } else if (temp._children != null)
                return false;
            if (this._descendants != null) {
                if (temp._descendants == null) return false;
                if (!this._descendants.equals(temp._descendants)) 
                    return false;
            } else if (temp._descendants != null)
                return false;
            if (this._entityTypeList != null) {
                if (temp._entityTypeList == null) return false;
                if (!this._entityTypeList.equals(temp._entityTypeList)) 
                    return false;
            } else if (temp._entityTypeList != null)
                return false;
            if (this._instances != null) {
                if (temp._instances == null) return false;
                if (!this._instances.equals(temp._instances)) 
                    return false;
            } else if (temp._instances != null)
                return false;
            if (this._equivalentEntityList != null) {
                if (temp._equivalentEntityList == null) return false;
                return this._equivalentEntityList.equals(temp._equivalentEntityList);
            } else return temp._equivalentEntityList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'about'. The field 'about' has
     * the following description: the URI that represents the
     * entity (class, predicate and/or individual) referenced by
     * this EntityDescription
     *  about is a PersistentURI when entityDescriptionType is
     * NAMED_ENTITY_DESCRIPTION and LocalURI when
     * entityDescriptionType is ANONYMOUS_ENTITY_DESCRIPTION
     * 
     * @return the value of field 'About'.
     */
    public String getAbout(
    ) {
        return this._about;
    }

    /**
     * Method getAlternateEntityID.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.ScopedEntityName at the
     * given index
     */
    public ScopedEntityName getAlternateEntityID(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateEntityIDList.size()) {
            throw new IndexOutOfBoundsException("getAlternateEntityID: Index value '" + index + "' not in range [0.." + (this._alternateEntityIDList.size() - 1) + "]");
        }

        return _alternateEntityIDList.get(index);
    }

    /**
     * Method getAlternateEntityID.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ScopedEntityName[] getAlternateEntityID(
    ) {
        ScopedEntityName[] array = new ScopedEntityName[0];
        return this._alternateEntityIDList.toArray(array);
    }

    /**
     * Method getAlternateEntityIDAsReference.Returns a reference
     * to '_alternateEntityIDList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ScopedEntityName> getAlternateEntityIDAsReference(
    ) {
        return this._alternateEntityIDList;
    }

    /**
     * Method getAlternateEntityIDCount.
     * 
     * @return the size of this collection
     */
    public int getAlternateEntityIDCount(
    ) {
        return this._alternateEntityIDList.size();
    }

    /**
     * Returns the value of field 'ancestors'. The field
     * 'ancestors' has the following description: a DirectoryURI
     * that resolves to the transitive closure of the "parents"
     * relationship(s). The primary purpose for this attribute is
     * to provide a handle for subsumption queries. As an example,
     * to
     *  determine whether Class X was a subclass of Class Y, one
     * would query whether the EntityReference to Y was a member of
     * X.ancestors.
     * 
     * @return the value of field 'Ancestors'.
     */
    public String getAncestors(
    ) {
        return this._ancestors;
    }

    /**
     * Returns the value of field 'children'. The field 'children'
     * has the following description: a DirectoryURI that resolves
     * to the list of direct "children" asserted by
     * describingCodeSystemVersion. As with parent, it is the
     * responsibility of the service to determine what
     *  predicate(s) represent "parent/child" relationships.
     * children may also include entity references that appear in
     * the target of bnodes if they are determined to be such by
     * the service.
     * 
     * @return the value of field 'Children'.
     */
    public String getChildren(
    ) {
        return this._children;
    }

    /**
     * Returns the value of field 'codeSystemRole'. The field
     * 'codeSystemRole' has the following description: If present,
     * identifies the role that the code system plays in the
     * description
     *  of the entity. If absent, the role is unknown.
     * 
     * @return the value of field 'CodeSystemRole'.
     */
    public edu.mayo.cts2.framework.model.core.types.CodeSystemRole getCodeSystemRole(
    ) {
        return this._codeSystemRole;
    }

    /**
     * Method getDefinition.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Definition at the given
     * index
     */
    public Definition getDefinition(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionList.size()) {
            throw new IndexOutOfBoundsException("getDefinition: Index value '" + index + "' not in range [0.." + (this._definitionList.size() - 1) + "]");
        }

        return _definitionList.get(index);
    }

    /**
     * Method getDefinition.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Definition[] getDefinition(
    ) {
        Definition[] array = new Definition[0];
        return this._definitionList.toArray(array);
    }

    /**
     * Method getDefinitionAsReference.Returns a reference to
     * '_definitionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Definition> getDefinitionAsReference(
    ) {
        return this._definitionList;
    }

    /**
     * Method getDefinitionCount.
     * 
     * @return the size of this collection
     */
    public int getDefinitionCount(
    ) {
        return this._definitionList.size();
    }

    /**
     * Returns the value of field 'descendants'. The field
     * 'descendants' has the following description: a DirectoryURI
     * that resolves to the transitive closure of the "children"
     * relationship(s). The primary purpose for this attribute is
     * to provide a handle for subsumption queries. As an example,
     * a
     *  second way to determine whether Class X was a subclass of
     * Class Y, one would query whether the EntityReference to X
     * was a member of Y.descendants.
     * 
     * @return the value of field 'Descendants'.
     */
    public String getDescendants(
    ) {
        return this._descendants;
    }

    /**
     * Returns the value of field 'describingCodeSystemVersion'.
     * The field 'describingCodeSystemVersion' has the following
     * description: a reference to the version of an ontology or
     * code system that makes the set of assertions contained in
     * this description. Note that this references the "asserting",
     * not the "containing" code system
     *  version. As an example, the Wine Ontology imports the Food
     * Ontology, which, in turn contains descriptions of
     * PotableLiquid. A service that represented a (version of) the
     * Wine Ontology would contain an entity
     *  description about
     * "http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#PotableLiquid"
     * (namespaceName: food, name: PotableLiquid). The
     * describingCodeSystemVersion, however, would be
     *  "http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#"
     * even though this entity was described in the food ontology.
     * Note also that it both the food and wine ontology were
     * represented in a service, the service would
     *  contain two entity descriptions - one from the food
     * ontology perspective and one from the wine ontology
     * perspective.
     * 
     * @return the value of field 'DescribingCodeSystemVersion'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference getDescribingCodeSystemVersion(
    ) {
        return this._describingCodeSystemVersion;
    }

    /**
     * Method getDesignation.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.entity.Designation at the
     * given index
     */
    public Designation getDesignation(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._designationList.size()) {
            throw new IndexOutOfBoundsException("getDesignation: Index value '" + index + "' not in range [0.." + (this._designationList.size() - 1) + "]");
        }

        return _designationList.get(index);
    }

    /**
     * Method getDesignation.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Designation[] getDesignation(
    ) {
        Designation[] array = new Designation[0];
        return this._designationList.toArray(array);
    }

    /**
     * Method getDesignationAsReference.Returns a reference to
     * '_designationList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Designation> getDesignationAsReference(
    ) {
        return this._designationList;
    }

    /**
     * Method getDesignationCount.
     * 
     * @return the size of this collection
     */
    public int getDesignationCount(
    ) {
        return this._designationList.size();
    }

    /**
     * Returns the value of field 'entityID'. The field 'entityID'
     * has the following description: the local namespace name and
     * entity name that, together, uniquely name this referenced
     * within the context of a CTS2 service instance. As an
     * example, a service instance may choose to designate
     *  the entity referenced by the about URI of
     * http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#CabernetSauvignon
     * with the namespaceName "wine" and the name
     * "CabernetSauvignon".The name
     *  portion of ScopedEntityName must uniquely name the
     * particular entity within the context of the code system
     * version. 
     * 
     * @return the value of field 'EntityID'.
     */
    public ScopedEntityName getEntityID(
    ) {
        return this._entityID;
    }

    /**
     * Method getEntityType.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.URIAndEntityName at the
     * given index
     */
    public URIAndEntityName getEntityType(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entityTypeList.size()) {
            throw new IndexOutOfBoundsException("getEntityType: Index value '" + index + "' not in range [0.." + (this._entityTypeList.size() - 1) + "]");
        }

        return _entityTypeList.get(index);
    }

    /**
     * Method getEntityType.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public URIAndEntityName[] getEntityType(
    ) {
        URIAndEntityName[] array = new URIAndEntityName[0];
        return this._entityTypeList.toArray(array);
    }

    /**
     * Method getEntityTypeAsReference.Returns a reference to
     * '_entityTypeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<URIAndEntityName> getEntityTypeAsReference(
    ) {
        return this._entityTypeList;
    }

    /**
     * Method getEntityTypeCount.
     * 
     * @return the size of this collection
     */
    public int getEntityTypeCount(
    ) {
        return this._entityTypeList.size();
    }

    /**
     * Method getEquivalentEntity.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.URIAndEntityName at the
     * given index
     */
    public URIAndEntityName getEquivalentEntity(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._equivalentEntityList.size()) {
            throw new IndexOutOfBoundsException("getEquivalentEntity: Index value '" + index + "' not in range [0.." + (this._equivalentEntityList.size() - 1) + "]");
        }

        return _equivalentEntityList.get(index);
    }

    /**
     * Method getEquivalentEntity.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public URIAndEntityName[] getEquivalentEntity(
    ) {
        URIAndEntityName[] array = new URIAndEntityName[0];
        return this._equivalentEntityList.toArray(array);
    }

    /**
     * Method getEquivalentEntityAsReference.Returns a reference to
     * '_equivalentEntityList'. No type checking is performed on
     * any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<URIAndEntityName> getEquivalentEntityAsReference(
    ) {
        return this._equivalentEntityList;
    }

    /**
     * Method getEquivalentEntityCount.
     * 
     * @return the size of this collection
     */
    public int getEquivalentEntityCount(
    ) {
        return this._equivalentEntityList.size();
    }

    /**
     * Method getExample.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Example at the given index
     */
    public Example getExample(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._exampleList.size()) {
            throw new IndexOutOfBoundsException("getExample: Index value '" + index + "' not in range [0.." + (this._exampleList.size() - 1) + "]");
        }

        return _exampleList.get(index);
    }

    /**
     * Method getExample.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Example[] getExample(
    ) {
        Example[] array = new Example[0];
        return this._exampleList.toArray(array);
    }

    /**
     * Method getExampleAsReference.Returns a reference to
     * '_exampleList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Example> getExampleAsReference(
    ) {
        return this._exampleList;
    }

    /**
     * Method getExampleCount.
     * 
     * @return the size of this collection
     */
    public int getExampleCount(
    ) {
        return this._exampleList.size();
    }

    /**
     * Returns the value of field 'instances'. The field
     * 'instances' has the following description: a DirectoryURI
     * that resolves to the list of entities that asserted to be
     * instances of the type represented by about URI. This element
     * is present only if resolution will return a non-empty
     *  set.
     * 
     * @return the value of field 'Instances'.
     */
    public String getInstances(
    ) {
        return this._instances;
    }

    /**
     * Method getNote.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Comment at the given index
     */
    public Comment getNote(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._noteList.size()) {
            throw new IndexOutOfBoundsException("getNote: Index value '" + index + "' not in range [0.." + (this._noteList.size() - 1) + "]");
        }

        return _noteList.get(index);
    }

    /**
     * Method getNote.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Comment[] getNote(
    ) {
        Comment[] array = new Comment[0];
        return this._noteList.toArray(array);
    }

    /**
     * Method getNoteAsReference.Returns a reference to
     * '_noteList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Comment> getNoteAsReference(
    ) {
        return this._noteList;
    }

    /**
     * Method getNoteCount.
     * 
     * @return the size of this collection
     */
    public int getNoteCount(
    ) {
        return this._noteList.size();
    }

    /**
     * Method getParent.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.URIAndEntityName at the
     * given index
     */
    public URIAndEntityName getParent(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parentList.size()) {
            throw new IndexOutOfBoundsException("getParent: Index value '" + index + "' not in range [0.." + (this._parentList.size() - 1) + "]");
        }

        return _parentList.get(index);
    }

    /**
     * Method getParent.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public URIAndEntityName[] getParent(
    ) {
        URIAndEntityName[] array = new URIAndEntityName[0];
        return this._parentList.toArray(array);
    }

    /**
     * Method getParentAsReference.Returns a reference to
     * '_parentList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<URIAndEntityName> getParentAsReference(
    ) {
        return this._parentList;
    }

    /**
     * Method getParentCount.
     * 
     * @return the size of this collection
     */
    public int getParentCount(
    ) {
        return this._parentList.size();
    }

    /**
     * Returns the value of field 'parents'. The field 'parents'
     * has the following description: a DirectoryURI that resolves
     * to the list of direct "parents" asserted by
     * describingCodeSystemVersion. This returns the 
     *  parent elements above.
     * 
     * @return the value of field 'Parents'.
     */
    public String getParents(
    ) {
        return this._parents;
    }

    /**
     * Returns the value of field 'predicateOf'. The field
     * 'predicateOf' has the following description: a DirectoryURI
     * that resolves to the list of active associations ("semantic"
     * assertions) in which the about entity appears as a predicate
     * and that are assertedBy the
     *  describingCodeSystemVersion. predicateOf is only included
     * in an EntityDescription when resolution would yield at least
     * one result. This attribute will only be present in CTS2
     *  service implementations that support the ASSOCIATION QUERY
     * profile.
     * 
     * @return the value of field 'PredicateOf'.
     */
    public String getPredicateOf(
    ) {
        return this._predicateOf;
    }

    /**
     * Method getProperty.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Property at the given inde
     */
    public Property getProperty(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("getProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }

        return _propertyList.get(index);
    }

    /**
     * Method getProperty.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Property[] getProperty(
    ) {
        Property[] array = new Property[0];
        return this._propertyList.toArray(array);
    }

    /**
     * Method getPropertyAsReference.Returns a reference to
     * '_propertyList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Property> getPropertyAsReference(
    ) {
        return this._propertyList;
    }

    /**
     * Method getPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getPropertyCount(
    ) {
        return this._propertyList.size();
    }

    /**
     * Returns the value of field 'sourceStatements'. The field
     * 'sourceStatements' has the following description: a
     * DirectoryURI that resolves to the list of statements that
     * were used in the assembly of this description. Statements
     * need only be present in service instances that support the
     *  Statement profile, and serves as a bridge between atomic
     * structure contained in the source resource and the CTS2
     * rendering.
     * 
     * @return the value of field 'SourceStatements'.
     */
    public String getSourceStatements(
    ) {
        return this._sourceStatements;
    }

    /**
     * Returns the value of field 'subjectOf'. The field
     * 'subjectOf' has the following description: an
     * AssociationDirectoryURI that resolves to a list of active
     * associations ("semantic" assertions) in which the about
     * entity appears as a subject and that are assertedBy the
     *  describingCodeSystemVersion. subjectOf is only included in
     * an EntityDescription when resolution would yield at least
     * one result. This attribute will only be present in CTS2
     * service
     *  implementations that support the ASSOCIATION QUERY profile.
     * 
     * @return the value of field 'SubjectOf'.
     */
    public String getSubjectOf(
    ) {
        return this._subjectOf;
    }

    /**
     * Returns the value of field 'targetOf'. The field 'targetOf'
     * has the following description: a DirectoryURI that resolves
     * to the list of active associations ("semantic" assertions)
     * in which the about entity appears as either a direct target
     * or the target of a contained BNode and
     *  that are assertedBy the describingCodeSystemVersion.
     * targetOf is only included in an EntityDescription when
     * resolution would yield at least one result. This attribute
     * will only be present
     *  in CTS2 service implementations that support the
     * ASSOCIATION QUERY profile.
     * 
     * @return the value of field 'TargetOf'.
     */
    public String getTargetOf(
    ) {
        return this._targetOf;
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
        if (_about != null) {
           result = 37 * result + _about.hashCode();
        }
        if (_codeSystemRole != null) {
           result = 37 * result + _codeSystemRole.hashCode();
        }
        if (_entityID != null) {
           result = 37 * result + _entityID.hashCode();
        }
        if (_alternateEntityIDList != null) {
           result = 37 * result + _alternateEntityIDList.hashCode();
        }
        if (_describingCodeSystemVersion != null) {
           result = 37 * result + _describingCodeSystemVersion.hashCode();
        }
        if (_designationList != null) {
           result = 37 * result + _designationList.hashCode();
        }
        if (_definitionList != null) {
           result = 37 * result + _definitionList.hashCode();
        }
        if (_exampleList != null) {
           result = 37 * result + _exampleList.hashCode();
        }
        if (_noteList != null) {
           result = 37 * result + _noteList.hashCode();
        }
        if (_propertyList != null) {
           result = 37 * result + _propertyList.hashCode();
        }
        if (_sourceStatements != null) {
           result = 37 * result + _sourceStatements.hashCode();
        }
        if (_subjectOf != null) {
           result = 37 * result + _subjectOf.hashCode();
        }
        if (_predicateOf != null) {
           result = 37 * result + _predicateOf.hashCode();
        }
        if (_targetOf != null) {
           result = 37 * result + _targetOf.hashCode();
        }
        if (_parentList != null) {
           result = 37 * result + _parentList.hashCode();
        }
        if (_parents != null) {
           result = 37 * result + _parents.hashCode();
        }
        if (_ancestors != null) {
           result = 37 * result + _ancestors.hashCode();
        }
        if (_children != null) {
           result = 37 * result + _children.hashCode();
        }
        if (_descendants != null) {
           result = 37 * result + _descendants.hashCode();
        }
        if (_entityTypeList != null) {
           result = 37 * result + _entityTypeList.hashCode();
        }
        if (_instances != null) {
           result = 37 * result + _instances.hashCode();
        }
        if (_equivalentEntityList != null) {
           result = 37 * result + _equivalentEntityList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateAlternateEntityID.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ScopedEntityName> iterateAlternateEntityID(
    ) {
        return this._alternateEntityIDList.iterator();
    }

    /**
     * Method iterateDefinition.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Definition> iterateDefinition(
    ) {
        return this._definitionList.iterator();
    }

    /**
     * Method iterateDesignation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Designation> iterateDesignation(
    ) {
        return this._designationList.iterator();
    }

    /**
     * Method iterateEntityType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends URIAndEntityName> iterateEntityType(
    ) {
        return this._entityTypeList.iterator();
    }

    /**
     * Method iterateEquivalentEntity.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends URIAndEntityName> iterateEquivalentEntity(
    ) {
        return this._equivalentEntityList.iterator();
    }

    /**
     * Method iterateExample.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Example> iterateExample(
    ) {
        return this._exampleList.iterator();
    }

    /**
     * Method iterateNote.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Comment> iterateNote(
    ) {
        return this._noteList.iterator();
    }

    /**
     * Method iterateParent.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends URIAndEntityName> iterateParent(
    ) {
        return this._parentList.iterator();
    }

    /**
     * Method iterateProperty.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Property> iterateProperty(
    ) {
        return this._propertyList.iterator();
    }

    /**
     */
    public void removeAllAlternateEntityID(
    ) {
        this._alternateEntityIDList.clear();
    }

    /**
     */
    public void removeAllDefinition(
    ) {
        this._definitionList.clear();
    }

    /**
     */
    public void removeAllDesignation(
    ) {
        this._designationList.clear();
    }

    /**
     */
    public void removeAllEntityType(
    ) {
        this._entityTypeList.clear();
    }

    /**
     */
    public void removeAllEquivalentEntity(
    ) {
        this._equivalentEntityList.clear();
    }

    /**
     */
    public void removeAllExample(
    ) {
        this._exampleList.clear();
    }

    /**
     */
    public void removeAllNote(
    ) {
        this._noteList.clear();
    }

    /**
     */
    public void removeAllParent(
    ) {
        this._parentList.clear();
    }

    /**
     */
    public void removeAllProperty(
    ) {
        this._propertyList.clear();
    }

    /**
     * Method removeAlternateEntityID.
     * 
     * @param vAlternateEntityID
     * @return true if the object was removed from the collection.
     */
    public boolean removeAlternateEntityID(
            final ScopedEntityName vAlternateEntityID) {
        return _alternateEntityIDList.remove(vAlternateEntityID);
    }

    /**
     * Method removeAlternateEntityIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ScopedEntityName removeAlternateEntityIDAt(
            final int index) {
        ScopedEntityName obj = this._alternateEntityIDList.remove(index);
        return obj;
    }

    /**
     * Method removeDefinition.
     * 
     * @param vDefinition
     * @return true if the object was removed from the collection.
     */
    public boolean removeDefinition(
            final Definition vDefinition) {
        return _definitionList.remove(vDefinition);
    }

    /**
     * Method removeDefinitionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Definition removeDefinitionAt(
            final int index) {
        Definition obj = this._definitionList.remove(index);
        return obj;
    }

    /**
     * Method removeDesignation.
     * 
     * @param vDesignation
     * @return true if the object was removed from the collection.
     */
    public boolean removeDesignation(
            final Designation vDesignation) {
        return _designationList.remove(vDesignation);
    }

    /**
     * Method removeDesignationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Designation removeDesignationAt(
            final int index) {
        Designation obj = this._designationList.remove(index);
        return obj;
    }

    /**
     * Method removeEntityType.
     * 
     * @param vEntityType
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntityType(
            final URIAndEntityName vEntityType) {
        return _entityTypeList.remove(vEntityType);
    }

    /**
     * Method removeEntityTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public URIAndEntityName removeEntityTypeAt(
            final int index) {
        URIAndEntityName obj = this._entityTypeList.remove(index);
        return obj;
    }

    /**
     * Method removeEquivalentEntity.
     * 
     * @param vEquivalentEntity
     * @return true if the object was removed from the collection.
     */
    public boolean removeEquivalentEntity(
            final URIAndEntityName vEquivalentEntity) {
        return _equivalentEntityList.remove(vEquivalentEntity);
    }

    /**
     * Method removeEquivalentEntityAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public URIAndEntityName removeEquivalentEntityAt(
            final int index) {
        URIAndEntityName obj = this._equivalentEntityList.remove(index);
        return obj;
    }

    /**
     * Method removeExample.
     * 
     * @param vExample
     * @return true if the object was removed from the collection.
     */
    public boolean removeExample(
            final Example vExample) {
        return _exampleList.remove(vExample);
    }

    /**
     * Method removeExampleAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Example removeExampleAt(
            final int index) {
        Example obj = this._exampleList.remove(index);
        return obj;
    }

    /**
     * Method removeNote.
     * 
     * @param vNote
     * @return true if the object was removed from the collection.
     */
    public boolean removeNote(
            final Comment vNote) {
        return _noteList.remove(vNote);
    }

    /**
     * Method removeNoteAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Comment removeNoteAt(
            final int index) {
        Comment obj = this._noteList.remove(index);
        return obj;
    }

    /**
     * Method removeParent.
     * 
     * @param vParent
     * @return true if the object was removed from the collection.
     */
    public boolean removeParent(
            final URIAndEntityName vParent) {
        return _parentList.remove(vParent);
    }

    /**
     * Method removeParentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public URIAndEntityName removeParentAt(
            final int index) {
        URIAndEntityName obj = this._parentList.remove(index);
        return obj;
    }

    /**
     * Method removeProperty.
     * 
     * @param vProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeProperty(
            final Property vProperty) {
        return _propertyList.remove(vProperty);
    }

    /**
     * Method removePropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Property removePropertyAt(
            final int index) {
        Property obj = this._propertyList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'about'. The field 'about' has the
     * following description: the URI that represents the entity
     * (class, predicate and/or individual) referenced by this
     * EntityDescription
     *  about is a PersistentURI when entityDescriptionType is
     * NAMED_ENTITY_DESCRIPTION and LocalURI when
     * entityDescriptionType is ANONYMOUS_ENTITY_DESCRIPTION
     * 
     * @param about the value of field 'about'.
     */
    public void setAbout(
            final String about) {
        this._about = about;
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateEntityID
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAlternateEntityID(
            final int index,
            final ScopedEntityName vAlternateEntityID)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateEntityIDList.size()) {
            throw new IndexOutOfBoundsException("setAlternateEntityID: Index value '" + index + "' not in range [0.." + (this._alternateEntityIDList.size() - 1) + "]");
        }

        this._alternateEntityIDList.set(index, vAlternateEntityID);
    }

    /**
     * 
     * 
     * @param vAlternateEntityIDArray
     */
    public void setAlternateEntityID(
            final ScopedEntityName[] vAlternateEntityIDArray) {
        //-- copy array
        _alternateEntityIDList.clear();

        Collections.addAll(this._alternateEntityIDList, vAlternateEntityIDArray);
    }

    /**
     * Sets the value of '_alternateEntityIDList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vAlternateEntityIDList the Vector to copy.
     */
    public void setAlternateEntityID(
            final java.util.List<ScopedEntityName> vAlternateEntityIDList) {
        // copy vector
        this._alternateEntityIDList.clear();

        this._alternateEntityIDList.addAll(vAlternateEntityIDList);
    }

    /**
     * Sets the value of '_alternateEntityIDList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param alternateEntityIDList the Vector to set.
     */
    public void setAlternateEntityIDAsReference(
            final java.util.List<ScopedEntityName> alternateEntityIDList) {
        this._alternateEntityIDList = alternateEntityIDList;
    }

    /**
     * Sets the value of field 'ancestors'. The field 'ancestors'
     * has the following description: a DirectoryURI that resolves
     * to the transitive closure of the "parents" relationship(s).
     * The primary purpose for this attribute is to provide a
     * handle for subsumption queries. As an example, to
     *  determine whether Class X was a subclass of Class Y, one
     * would query whether the EntityReference to Y was a member of
     * X.ancestors.
     * 
     * @param ancestors the value of field 'ancestors'.
     */
    public void setAncestors(
            final String ancestors) {
        this._ancestors = ancestors;
    }

    /**
     * Sets the value of field 'children'. The field 'children' has
     * the following description: a DirectoryURI that resolves to
     * the list of direct "children" asserted by
     * describingCodeSystemVersion. As with parent, it is the
     * responsibility of the service to determine what
     *  predicate(s) represent "parent/child" relationships.
     * children may also include entity references that appear in
     * the target of bnodes if they are determined to be such by
     * the service.
     * 
     * @param children the value of field 'children'.
     */
    public void setChildren(
            final String children) {
        this._children = children;
    }

    /**
     * Sets the value of field 'codeSystemRole'. The field
     * 'codeSystemRole' has the following description: If present,
     * identifies the role that the code system plays in the
     * description
     *  of the entity. If absent, the role is unknown.
     * 
     * @param codeSystemRole the value of field 'codeSystemRole'.
     */
    public void setCodeSystemRole(
            final edu.mayo.cts2.framework.model.core.types.CodeSystemRole codeSystemRole) {
        this._codeSystemRole = codeSystemRole;
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinition
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDefinition(
            final int index,
            final Definition vDefinition)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionList.size()) {
            throw new IndexOutOfBoundsException("setDefinition: Index value '" + index + "' not in range [0.." + (this._definitionList.size() - 1) + "]");
        }

        this._definitionList.set(index, vDefinition);
    }

    /**
     * 
     * 
     * @param vDefinitionArray
     */
    public void setDefinition(
            final Definition[] vDefinitionArray) {
        //-- copy array
        _definitionList.clear();

        Collections.addAll(this._definitionList, vDefinitionArray);
    }

    /**
     * Sets the value of '_definitionList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vDefinitionList the Vector to copy.
     */
    public void setDefinition(
            final java.util.List<Definition> vDefinitionList) {
        // copy vector
        this._definitionList.clear();

        this._definitionList.addAll(vDefinitionList);
    }

    /**
     * Sets the value of '_definitionList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param definitionList the Vector to set.
     */
    public void setDefinitionAsReference(
            final java.util.List<Definition> definitionList) {
        this._definitionList = definitionList;
    }

    /**
     * Sets the value of field 'descendants'. The field
     * 'descendants' has the following description: a DirectoryURI
     * that resolves to the transitive closure of the "children"
     * relationship(s). The primary purpose for this attribute is
     * to provide a handle for subsumption queries. As an example,
     * a
     *  second way to determine whether Class X was a subclass of
     * Class Y, one would query whether the EntityReference to X
     * was a member of Y.descendants.
     * 
     * @param descendants the value of field 'descendants'.
     */
    public void setDescendants(
            final String descendants) {
        this._descendants = descendants;
    }

    /**
     * Sets the value of field 'describingCodeSystemVersion'. The
     * field 'describingCodeSystemVersion' has the following
     * description: a reference to the version of an ontology or
     * code system that makes the set of assertions contained in
     * this description. Note that this references the "asserting",
     * not the "containing" code system
     *  version. As an example, the Wine Ontology imports the Food
     * Ontology, which, in turn contains descriptions of
     * PotableLiquid. A service that represented a (version of) the
     * Wine Ontology would contain an entity
     *  description about
     * "http://www.w3.org/TR/2003/PR-owl-guide-20031209/food#PotableLiquid"
     * (namespaceName: food, name: PotableLiquid). The
     * describingCodeSystemVersion, however, would be
     *  "http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#"
     * even though this entity was described in the food ontology.
     * Note also that it both the food and wine ontology were
     * represented in a service, the service would
     *  contain two entity descriptions - one from the food
     * ontology perspective and one from the wine ontology
     * perspective.
     * 
     * @param describingCodeSystemVersion the value of field
     * 'describingCodeSystemVersion'.
     */
    public void setDescribingCodeSystemVersion(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference describingCodeSystemVersion) {
        this._describingCodeSystemVersion = describingCodeSystemVersion;
    }

    /**
     * 
     * 
     * @param index
     * @param vDesignation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDesignation(
            final int index,
            final Designation vDesignation)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._designationList.size()) {
            throw new IndexOutOfBoundsException("setDesignation: Index value '" + index + "' not in range [0.." + (this._designationList.size() - 1) + "]");
        }

        this._designationList.set(index, vDesignation);
    }

    /**
     * 
     * 
     * @param vDesignationArray
     */
    public void setDesignation(
            final Designation[] vDesignationArray) {
        //-- copy array
        _designationList.clear();

        Collections.addAll(this._designationList, vDesignationArray);
    }

    /**
     * Sets the value of '_designationList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vDesignationList the Vector to copy.
     */
    public void setDesignation(
            final java.util.List<Designation> vDesignationList) {
        // copy vector
        this._designationList.clear();

        this._designationList.addAll(vDesignationList);
    }

    /**
     * Sets the value of '_designationList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param designationList the Vector to set.
     */
    public void setDesignationAsReference(
            final java.util.List<Designation> designationList) {
        this._designationList = designationList;
    }

    /**
     * Sets the value of field 'entityID'. The field 'entityID' has
     * the following description: the local namespace name and
     * entity name that, together, uniquely name this referenced
     * within the context of a CTS2 service instance. As an
     * example, a service instance may choose to designate
     *  the entity referenced by the about URI of
     * http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#CabernetSauvignon
     * with the namespaceName "wine" and the name
     * "CabernetSauvignon".The name
     *  portion of ScopedEntityName must uniquely name the
     * particular entity within the context of the code system
     * version. 
     * 
     * @param entityID the value of field 'entityID'.
     */
    public void setEntityID(
            final ScopedEntityName entityID) {
        this._entityID = entityID;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntityType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntityType(
            final int index,
            final URIAndEntityName vEntityType)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entityTypeList.size()) {
            throw new IndexOutOfBoundsException("setEntityType: Index value '" + index + "' not in range [0.." + (this._entityTypeList.size() - 1) + "]");
        }

        this._entityTypeList.set(index, vEntityType);
    }

    /**
     * 
     * 
     * @param vEntityTypeArray
     */
    public void setEntityType(
            final URIAndEntityName[] vEntityTypeArray) {
        //-- copy array
        _entityTypeList.clear();

        Collections.addAll(this._entityTypeList, vEntityTypeArray);
    }

    /**
     * Sets the value of '_entityTypeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vEntityTypeList the Vector to copy.
     */
    public void setEntityType(
            final java.util.List<URIAndEntityName> vEntityTypeList) {
        // copy vector
        this._entityTypeList.clear();

        this._entityTypeList.addAll(vEntityTypeList);
    }

    /**
     * Sets the value of '_entityTypeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param entityTypeList the Vector to set.
     */
    public void setEntityTypeAsReference(
            final java.util.List<URIAndEntityName> entityTypeList) {
        this._entityTypeList = entityTypeList;
    }

    /**
     * 
     * 
     * @param index
     * @param vEquivalentEntity
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEquivalentEntity(
            final int index,
            final URIAndEntityName vEquivalentEntity)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._equivalentEntityList.size()) {
            throw new IndexOutOfBoundsException("setEquivalentEntity: Index value '" + index + "' not in range [0.." + (this._equivalentEntityList.size() - 1) + "]");
        }

        this._equivalentEntityList.set(index, vEquivalentEntity);
    }

    /**
     * 
     * 
     * @param vEquivalentEntityArray
     */
    public void setEquivalentEntity(
            final URIAndEntityName[] vEquivalentEntityArray) {
        //-- copy array
        _equivalentEntityList.clear();

        Collections.addAll(this._equivalentEntityList, vEquivalentEntityArray);
    }

    /**
     * Sets the value of '_equivalentEntityList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vEquivalentEntityList the Vector to copy.
     */
    public void setEquivalentEntity(
            final java.util.List<URIAndEntityName> vEquivalentEntityList) {
        // copy vector
        this._equivalentEntityList.clear();

        this._equivalentEntityList.addAll(vEquivalentEntityList);
    }

    /**
     * Sets the value of '_equivalentEntityList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param equivalentEntityList the Vector to set.
     */
    public void setEquivalentEntityAsReference(
            final java.util.List<URIAndEntityName> equivalentEntityList) {
        this._equivalentEntityList = equivalentEntityList;
    }

    /**
     * 
     * 
     * @param index
     * @param vExample
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExample(
            final int index,
            final Example vExample)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._exampleList.size()) {
            throw new IndexOutOfBoundsException("setExample: Index value '" + index + "' not in range [0.." + (this._exampleList.size() - 1) + "]");
        }

        this._exampleList.set(index, vExample);
    }

    /**
     * 
     * 
     * @param vExampleArray
     */
    public void setExample(
            final Example[] vExampleArray) {
        //-- copy array
        _exampleList.clear();

        Collections.addAll(this._exampleList, vExampleArray);
    }

    /**
     * Sets the value of '_exampleList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vExampleList the Vector to copy.
     */
    public void setExample(
            final java.util.List<Example> vExampleList) {
        // copy vector
        this._exampleList.clear();

        this._exampleList.addAll(vExampleList);
    }

    /**
     * Sets the value of '_exampleList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param exampleList the Vector to set.
     */
    public void setExampleAsReference(
            final java.util.List<Example> exampleList) {
        this._exampleList = exampleList;
    }

    /**
     * Sets the value of field 'instances'. The field 'instances'
     * has the following description: a DirectoryURI that resolves
     * to the list of entities that asserted to be instances of the
     * type represented by about URI. This element is present only
     * if resolution will return a non-empty
     *  set.
     * 
     * @param instances the value of field 'instances'.
     */
    public void setInstances(
            final String instances) {
        this._instances = instances;
    }

    /**
     * 
     * 
     * @param index
     * @param vNote
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNote(
            final int index,
            final Comment vNote)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._noteList.size()) {
            throw new IndexOutOfBoundsException("setNote: Index value '" + index + "' not in range [0.." + (this._noteList.size() - 1) + "]");
        }

        this._noteList.set(index, vNote);
    }

    /**
     * 
     * 
     * @param vNoteArray
     */
    public void setNote(
            final Comment[] vNoteArray) {
        //-- copy array
        _noteList.clear();

        Collections.addAll(this._noteList, vNoteArray);
    }

    /**
     * Sets the value of '_noteList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vNoteList the Vector to copy.
     */
    public void setNote(
            final java.util.List<Comment> vNoteList) {
        // copy vector
        this._noteList.clear();

        this._noteList.addAll(vNoteList);
    }

    /**
     * Sets the value of '_noteList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param noteList the Vector to set.
     */
    public void setNoteAsReference(
            final java.util.List<Comment> noteList) {
        this._noteList = noteList;
    }

    /**
     * 
     * 
     * @param index
     * @param vParent
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParent(
            final int index,
            final URIAndEntityName vParent)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parentList.size()) {
            throw new IndexOutOfBoundsException("setParent: Index value '" + index + "' not in range [0.." + (this._parentList.size() - 1) + "]");
        }

        this._parentList.set(index, vParent);
    }

    /**
     * 
     * 
     * @param vParentArray
     */
    public void setParent(
            final URIAndEntityName[] vParentArray) {
        //-- copy array
        _parentList.clear();

        Collections.addAll(this._parentList, vParentArray);
    }

    /**
     * Sets the value of '_parentList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vParentList the Vector to copy.
     */
    public void setParent(
            final java.util.List<URIAndEntityName> vParentList) {
        // copy vector
        this._parentList.clear();

        this._parentList.addAll(vParentList);
    }

    /**
     * Sets the value of '_parentList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param parentList the Vector to set.
     */
    public void setParentAsReference(
            final java.util.List<URIAndEntityName> parentList) {
        this._parentList = parentList;
    }

    /**
     * Sets the value of field 'parents'. The field 'parents' has
     * the following description: a DirectoryURI that resolves to
     * the list of direct "parents" asserted by
     * describingCodeSystemVersion. This returns the 
     *  parent elements above.
     * 
     * @param parents the value of field 'parents'.
     */
    public void setParents(
            final String parents) {
        this._parents = parents;
    }

    /**
     * Sets the value of field 'predicateOf'. The field
     * 'predicateOf' has the following description: a DirectoryURI
     * that resolves to the list of active associations ("semantic"
     * assertions) in which the about entity appears as a predicate
     * and that are assertedBy the
     *  describingCodeSystemVersion. predicateOf is only included
     * in an EntityDescription when resolution would yield at least
     * one result. This attribute will only be present in CTS2
     *  service implementations that support the ASSOCIATION QUERY
     * profile.
     * 
     * @param predicateOf the value of field 'predicateOf'.
     */
    public void setPredicateOf(
            final String predicateOf) {
        this._predicateOf = predicateOf;
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProperty(
            final int index,
            final Property vProperty)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("setProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }

        this._propertyList.set(index, vProperty);
    }

    /**
     * 
     * 
     * @param vPropertyArray
     */
    public void setProperty(
            final Property[] vPropertyArray) {
        //-- copy array
        _propertyList.clear();

        Collections.addAll(this._propertyList, vPropertyArray);
    }

    /**
     * Sets the value of '_propertyList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPropertyList the Vector to copy.
     */
    public void setProperty(
            final java.util.List<Property> vPropertyList) {
        // copy vector
        this._propertyList.clear();

        this._propertyList.addAll(vPropertyList);
    }

    /**
     * Sets the value of '_propertyList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertyList the Vector to set.
     */
    public void setPropertyAsReference(
            final java.util.List<Property> propertyList) {
        this._propertyList = propertyList;
    }

    /**
     * Sets the value of field 'sourceStatements'. The field
     * 'sourceStatements' has the following description: a
     * DirectoryURI that resolves to the list of statements that
     * were used in the assembly of this description. Statements
     * need only be present in service instances that support the
     *  Statement profile, and serves as a bridge between atomic
     * structure contained in the source resource and the CTS2
     * rendering.
     * 
     * @param sourceStatements the value of field 'sourceStatements'
     */
    public void setSourceStatements(
            final String sourceStatements) {
        this._sourceStatements = sourceStatements;
    }

    /**
     * Sets the value of field 'subjectOf'. The field 'subjectOf'
     * has the following description: an AssociationDirectoryURI
     * that resolves to a list of active associations ("semantic"
     * assertions) in which the about entity appears as a subject
     * and that are assertedBy the
     *  describingCodeSystemVersion. subjectOf is only included in
     * an EntityDescription when resolution would yield at least
     * one result. This attribute will only be present in CTS2
     * service
     *  implementations that support the ASSOCIATION QUERY profile.
     * 
     * @param subjectOf the value of field 'subjectOf'.
     */
    public void setSubjectOf(
            final String subjectOf) {
        this._subjectOf = subjectOf;
    }

    /**
     * Sets the value of field 'targetOf'. The field 'targetOf' has
     * the following description: a DirectoryURI that resolves to
     * the list of active associations ("semantic" assertions) in
     * which the about entity appears as either a direct target or
     * the target of a contained BNode and
     *  that are assertedBy the describingCodeSystemVersion.
     * targetOf is only included in an EntityDescription when
     * resolution would yield at least one result. This attribute
     * will only be present
     *  in CTS2 service implementations that support the
     * ASSOCIATION QUERY profile.
     * 
     * @param targetOf the value of field 'targetOf'.
     */
    public void setTargetOf(
            final String targetOf) {
        this._targetOf = targetOf;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
