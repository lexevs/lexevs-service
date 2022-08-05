/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

import java.util.Collections;

/**
 * ResourceDescription represents the shared characteristics common
 * to both abstract and resource version descriptions.
 * ResourceDescription is an abstract type and, as such, cannot be
 * directly
 *  created. Resource descriptions are Changeable, meaning that
 * they have identity and can be created, updated and deleted.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ResourceDescription extends Changeable
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the (or a) definitive URI that represents the resource being
     * described. Note that this is NOT the URI of the resource
     * description in the CTS2 format, but of the resource itself.
     * As an example, the
     *  about URI for the Wine ontology would be
     * "http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#". The
     * NCI Thesaurus has, amongst others, the
     *  about URI of
     * http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#. HL7
     * uses ISO Object Identifiers (OIDs) to label resources so,
     * from the HL7 perspective, the about URI of the NCI Thesaurus
     * would
     *  be "urn:oid:2.16.840.1.113883.3.26.1.1"
     */
    private String _about;

    /**
     * the formal or officially assigned name of this resource, if
     * any
     */
    private String _formalName;

    /**
     * additional identifiers that are used to index and locatethe
     * resource
     */
    private java.util.List<String> _keywordList;

    /**
     * the class(es) that this resource instantiates
     */
    private java.util.List<URIAndEntityName> _resourceTypeList;

    /**
     * a textual summary of the resource - what it is, what it is
     * for, etc.
     */
    private EntryDescription _resourceSynopsis;

    /**
     * a reference to a document thatprovide additional information
     * about the resource
     */
    private java.util.List<String> _additionalDocumentationList;

    /**
     * a reference to an individual, organization of bibliographic
     * reference that participated in the creation, validation,
     * review, dissemination of this resource and therole(s) they
     *  played
     */
    private java.util.List<SourceAndRoleReference> _sourceAndRoleList;

    /**
     * copyright and IP information. Note that rights applies to
     * the source resource, not the CTS2 rendering.
     */
    private OpaqueData _rights;

    /**
     * an additional note or comment about the resource
     */
    private java.util.List<Comment> _noteList;

    /**
     * additional information about the resource that doesnot fit
     * into any of the attributes described above
     */
    private java.util.List<Property> _propertyList;

    /**
     * an alternative identifier that uniquely names this resource
     * in other environments as contexts. As an example, if a
     * resource had both an ISO Object Identifier and a DNS name,
     * the DNS name might
     *  be assigned as the entryID of the resource by one service
     * while the ISO OID would be recorded as an alternateURI using
     * the "urn:oid" prefix. Note that alternateIds can be added or
     * removed
     *  during resource updates.
     */
    private java.util.List<String> _alternateIDList;

    /**
     * a DirectoryURI that references the set of statements that
     * were used to construct the containing resource. This
     * attribute must (may?) be present if and only if the service
     * supports the
     *  Statement profile 
     */
    private String _sourceStatements;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResourceDescription() {
        super();
        this._keywordList = new java.util.ArrayList<String>();
        this._resourceTypeList = new java.util.ArrayList<URIAndEntityName>();
        this._additionalDocumentationList = new java.util.ArrayList<String>();
        this._sourceAndRoleList = new java.util.ArrayList<SourceAndRoleReference>();
        this._noteList = new java.util.ArrayList<Comment>();
        this._propertyList = new java.util.ArrayList<Property>();
        this._alternateIDList = new java.util.ArrayList<String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAdditionalDocumentation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAdditionalDocumentation(
            final String vAdditionalDocumentation)
    throws IndexOutOfBoundsException {
        this._additionalDocumentationList.add(vAdditionalDocumentation);
    }

    /**
     * 
     * 
     * @param index
     * @param vAdditionalDocumentation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAdditionalDocumentation(
            final int index,
            final String vAdditionalDocumentation)
    throws IndexOutOfBoundsException {
        this._additionalDocumentationList.add(index, vAdditionalDocumentation);
    }

    /**
     * 
     * 
     * @param vAlternateID
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateID(
            final String vAlternateID)
    throws IndexOutOfBoundsException {
        this._alternateIDList.add(vAlternateID);
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateID
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlternateID(
            final int index,
            final String vAlternateID)
    throws IndexOutOfBoundsException {
        this._alternateIDList.add(index, vAlternateID);
    }

    /**
     * 
     * 
     * @param vKeyword
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKeyword(
            final String vKeyword)
    throws IndexOutOfBoundsException {
        this._keywordList.add(vKeyword);
    }

    /**
     * 
     * 
     * @param index
     * @param vKeyword
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKeyword(
            final int index,
            final String vKeyword)
    throws IndexOutOfBoundsException {
        this._keywordList.add(index, vKeyword);
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
     * 
     * 
     * @param vResourceType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceType(
            final URIAndEntityName vResourceType)
    throws IndexOutOfBoundsException {
        this._resourceTypeList.add(vResourceType);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceType(
            final int index,
            final URIAndEntityName vResourceType)
    throws IndexOutOfBoundsException {
        this._resourceTypeList.add(index, vResourceType);
    }

    /**
     * 
     * 
     * @param vSourceAndRole
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceAndRole(
            final SourceAndRoleReference vSourceAndRole)
    throws IndexOutOfBoundsException {
        this._sourceAndRoleList.add(vSourceAndRole);
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceAndRole
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSourceAndRole(
            final int index,
            final SourceAndRoleReference vSourceAndRole)
    throws IndexOutOfBoundsException {
        this._sourceAndRoleList.add(index, vSourceAndRole);
    }

    /**
     * Method enumerateAdditionalDocumentation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends String> enumerateAdditionalDocumentation(
    ) {
        return Collections.enumeration(this._additionalDocumentationList);
    }

    /**
     * Method enumerateAlternateID.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends String> enumerateAlternateID(
    ) {
        return Collections.enumeration(this._alternateIDList);
    }

    /**
     * Method enumerateKeyword.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends String> enumerateKeyword(
    ) {
        return Collections.enumeration(this._keywordList);
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
     * Method enumerateResourceType.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends URIAndEntityName> enumerateResourceType(
    ) {
        return Collections.enumeration(this._resourceTypeList);
    }

    /**
     * Method enumerateSourceAndRole.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends SourceAndRoleReference> enumerateSourceAndRole(
    ) {
        return Collections.enumeration(this._sourceAndRoleList);
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

        if (obj instanceof ResourceDescription) {

            ResourceDescription temp = (ResourceDescription)obj;
            if (this._about != null) {
                if (temp._about == null) return false;
                if (!this._about.equals(temp._about)) 
                    return false;
            } else if (temp._about != null)
                return false;
            if (this._formalName != null) {
                if (temp._formalName == null) return false;
                if (!this._formalName.equals(temp._formalName)) 
                    return false;
            } else if (temp._formalName != null)
                return false;
            if (this._keywordList != null) {
                if (temp._keywordList == null) return false;
                if (!this._keywordList.equals(temp._keywordList)) 
                    return false;
            } else if (temp._keywordList != null)
                return false;
            if (this._resourceTypeList != null) {
                if (temp._resourceTypeList == null) return false;
                if (!this._resourceTypeList.equals(temp._resourceTypeList)) 
                    return false;
            } else if (temp._resourceTypeList != null)
                return false;
            if (this._resourceSynopsis != null) {
                if (temp._resourceSynopsis == null) return false;
                if (!this._resourceSynopsis.equals(temp._resourceSynopsis)) 
                    return false;
            } else if (temp._resourceSynopsis != null)
                return false;
            if (this._additionalDocumentationList != null) {
                if (temp._additionalDocumentationList == null) return false;
                if (!this._additionalDocumentationList.equals(temp._additionalDocumentationList)) 
                    return false;
            } else if (temp._additionalDocumentationList != null)
                return false;
            if (this._sourceAndRoleList != null) {
                if (temp._sourceAndRoleList == null) return false;
                if (!this._sourceAndRoleList.equals(temp._sourceAndRoleList)) 
                    return false;
            } else if (temp._sourceAndRoleList != null)
                return false;
            if (this._rights != null) {
                if (temp._rights == null) return false;
                if (!this._rights.equals(temp._rights)) 
                    return false;
            } else if (temp._rights != null)
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
            if (this._alternateIDList != null) {
                if (temp._alternateIDList == null) return false;
                if (!this._alternateIDList.equals(temp._alternateIDList)) 
                    return false;
            } else if (temp._alternateIDList != null)
                return false;
            if (this._sourceStatements != null) {
                if (temp._sourceStatements == null) return false;
                return this._sourceStatements.equals(temp._sourceStatements);
            } else return temp._sourceStatements == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'about'. The field 'about' has
     * the following description: the (or a) definitive URI that
     * represents the resource being described. Note that this is
     * NOT the URI of the resource description in the CTS2 format,
     * but of the resource itself. As an example, the
     *  about URI for the Wine ontology would be
     * "http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#". The
     * NCI Thesaurus has, amongst others, the
     *  about URI of
     * http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#. HL7
     * uses ISO Object Identifiers (OIDs) to label resources so,
     * from the HL7 perspective, the about URI of the NCI Thesaurus
     * would
     *  be "urn:oid:2.16.840.1.113883.3.26.1.1"
     * 
     * @return the value of field 'About'.
     */
    public String getAbout(
    ) {
        return this._about;
    }

    /**
     * Method getAdditionalDocumentation.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getAdditionalDocumentation(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._additionalDocumentationList.size()) {
            throw new IndexOutOfBoundsException("getAdditionalDocumentation: Index value '" + index + "' not in range [0.." + (this._additionalDocumentationList.size() - 1) + "]");
        }

        return _additionalDocumentationList.get(index);
    }

    /**
     * Method getAdditionalDocumentation.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getAdditionalDocumentation(
    ) {
        String[] array = new String[0];
        return this._additionalDocumentationList.toArray(array);
    }

    /**
     * Method getAdditionalDocumentationAsReference.Returns a
     * reference to '_additionalDocumentationList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getAdditionalDocumentationAsReference(
    ) {
        return this._additionalDocumentationList;
    }

    /**
     * Method getAdditionalDocumentationCount.
     * 
     * @return the size of this collection
     */
    public int getAdditionalDocumentationCount(
    ) {
        return this._additionalDocumentationList.size();
    }

    /**
     * Method getAlternateID.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getAlternateID(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateIDList.size()) {
            throw new IndexOutOfBoundsException("getAlternateID: Index value '" + index + "' not in range [0.." + (this._alternateIDList.size() - 1) + "]");
        }

        return _alternateIDList.get(index);
    }

    /**
     * Method getAlternateID.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getAlternateID(
    ) {
        String[] array = new String[0];
        return this._alternateIDList.toArray(array);
    }

    /**
     * Method getAlternateIDAsReference.Returns a reference to
     * '_alternateIDList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getAlternateIDAsReference(
    ) {
        return this._alternateIDList;
    }

    /**
     * Method getAlternateIDCount.
     * 
     * @return the size of this collection
     */
    public int getAlternateIDCount(
    ) {
        return this._alternateIDList.size();
    }

    /**
     * Returns the value of field 'formalName'. The field
     * 'formalName' has the following description: the formal or
     * officially assigned name of this resource, if any
     * 
     * @return the value of field 'FormalName'.
     */
    public String getFormalName(
    ) {
        return this._formalName;
    }

    /**
     * Method getKeyword.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public String getKeyword(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._keywordList.size()) {
            throw new IndexOutOfBoundsException("getKeyword: Index value '" + index + "' not in range [0.." + (this._keywordList.size() - 1) + "]");
        }

        return _keywordList.get(index);
    }

    /**
     * Method getKeyword.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public String[] getKeyword(
    ) {
        String[] array = new String[0];
        return this._keywordList.toArray(array);
    }

    /**
     * Method getKeywordAsReference.Returns a reference to
     * '_keywordList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getKeywordAsReference(
    ) {
        return this._keywordList;
    }

    /**
     * Method getKeywordCount.
     * 
     * @return the size of this collection
     */
    public int getKeywordCount(
    ) {
        return this._keywordList.size();
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
     * Returns the value of field 'resourceSynopsis'. The field
     * 'resourceSynopsis' has the following description: a textual
     * summary of the resource - what it is, what it is for, etc.
     * 
     * @return the value of field 'ResourceSynopsis'.
     */
    public EntryDescription getResourceSynopsis(
    ) {
        return this._resourceSynopsis;
    }

    /**
     * Method getResourceType.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.URIAndEntityName at the
     * given index
     */
    public URIAndEntityName getResourceType(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceTypeList.size()) {
            throw new IndexOutOfBoundsException("getResourceType: Index value '" + index + "' not in range [0.." + (this._resourceTypeList.size() - 1) + "]");
        }

        return _resourceTypeList.get(index);
    }

    /**
     * Method getResourceType.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public URIAndEntityName[] getResourceType(
    ) {
        URIAndEntityName[] array = new URIAndEntityName[0];
        return this._resourceTypeList.toArray(array);
    }

    /**
     * Method getResourceTypeAsReference.Returns a reference to
     * '_resourceTypeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<URIAndEntityName> getResourceTypeAsReference(
    ) {
        return this._resourceTypeList;
    }

    /**
     * Method getResourceTypeCount.
     * 
     * @return the size of this collection
     */
    public int getResourceTypeCount(
    ) {
        return this._resourceTypeList.size();
    }

    /**
     * Returns the value of field 'rights'. The field 'rights' has
     * the following description: copyright and IP information.
     * Note that rights applies to the source resource, not the
     * CTS2 rendering.
     * 
     * @return the value of field 'Rights'.
     */
    public OpaqueData getRights(
    ) {
        return this._rights;
    }

    /**
     * Method getSourceAndRole.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.SourceAndRoleReference at
     * the given index
     */
    public SourceAndRoleReference getSourceAndRole(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceAndRoleList.size()) {
            throw new IndexOutOfBoundsException("getSourceAndRole: Index value '" + index + "' not in range [0.." + (this._sourceAndRoleList.size() - 1) + "]");
        }

        return _sourceAndRoleList.get(index);
    }

    /**
     * Method getSourceAndRole.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public SourceAndRoleReference[] getSourceAndRole(
    ) {
        SourceAndRoleReference[] array = new SourceAndRoleReference[0];
        return this._sourceAndRoleList.toArray(array);
    }

    /**
     * Method getSourceAndRoleAsReference.Returns a reference to
     * '_sourceAndRoleList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<SourceAndRoleReference> getSourceAndRoleAsReference(
    ) {
        return this._sourceAndRoleList;
    }

    /**
     * Method getSourceAndRoleCount.
     * 
     * @return the size of this collection
     */
    public int getSourceAndRoleCount(
    ) {
        return this._sourceAndRoleList.size();
    }

    /**
     * Returns the value of field 'sourceStatements'. The field
     * 'sourceStatements' has the following description: a
     * DirectoryURI that references the set of statements that were
     * used to construct the containing resource. This attribute
     * must (may?) be present if and only if the service supports
     * the
     *  Statement profile 
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
        if (_about != null) {
           result = 37 * result + _about.hashCode();
        }
        if (_formalName != null) {
           result = 37 * result + _formalName.hashCode();
        }
        if (_keywordList != null) {
           result = 37 * result + _keywordList.hashCode();
        }
        if (_resourceTypeList != null) {
           result = 37 * result + _resourceTypeList.hashCode();
        }
        if (_resourceSynopsis != null) {
           result = 37 * result + _resourceSynopsis.hashCode();
        }
        if (_additionalDocumentationList != null) {
           result = 37 * result + _additionalDocumentationList.hashCode();
        }
        if (_sourceAndRoleList != null) {
           result = 37 * result + _sourceAndRoleList.hashCode();
        }
        if (_rights != null) {
           result = 37 * result + _rights.hashCode();
        }
        if (_noteList != null) {
           result = 37 * result + _noteList.hashCode();
        }
        if (_propertyList != null) {
           result = 37 * result + _propertyList.hashCode();
        }
        if (_alternateIDList != null) {
           result = 37 * result + _alternateIDList.hashCode();
        }
        if (_sourceStatements != null) {
           result = 37 * result + _sourceStatements.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateAdditionalDocumentation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends String> iterateAdditionalDocumentation(
    ) {
        return this._additionalDocumentationList.iterator();
    }

    /**
     * Method iterateAlternateID.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends String> iterateAlternateID(
    ) {
        return this._alternateIDList.iterator();
    }

    /**
     * Method iterateKeyword.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends String> iterateKeyword(
    ) {
        return this._keywordList.iterator();
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
     * Method iterateResourceType.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends URIAndEntityName> iterateResourceType(
    ) {
        return this._resourceTypeList.iterator();
    }

    /**
     * Method iterateSourceAndRole.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends SourceAndRoleReference> iterateSourceAndRole(
    ) {
        return this._sourceAndRoleList.iterator();
    }

    /**
     * Method removeAdditionalDocumentation.
     * 
     * @param vAdditionalDocumentation
     * @return true if the object was removed from the collection.
     */
    public boolean removeAdditionalDocumentation(
            final String vAdditionalDocumentation) {
        return _additionalDocumentationList.remove(vAdditionalDocumentation);
    }

    /**
     * Method removeAdditionalDocumentationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeAdditionalDocumentationAt(
            final int index) {
        String obj = this._additionalDocumentationList.remove(index);
        return obj;
    }

    /**
     */
    public void removeAllAdditionalDocumentation(
    ) {
        this._additionalDocumentationList.clear();
    }

    /**
     */
    public void removeAllAlternateID(
    ) {
        this._alternateIDList.clear();
    }

    /**
     */
    public void removeAllKeyword(
    ) {
        this._keywordList.clear();
    }

    /**
     */
    public void removeAllNote(
    ) {
        this._noteList.clear();
    }

    /**
     */
    public void removeAllProperty(
    ) {
        this._propertyList.clear();
    }

    /**
     */
    public void removeAllResourceType(
    ) {
        this._resourceTypeList.clear();
    }

    /**
     */
    public void removeAllSourceAndRole(
    ) {
        this._sourceAndRoleList.clear();
    }

    /**
     * Method removeAlternateID.
     * 
     * @param vAlternateID
     * @return true if the object was removed from the collection.
     */
    public boolean removeAlternateID(
            final String vAlternateID) {
        return _alternateIDList.remove(vAlternateID);
    }

    /**
     * Method removeAlternateIDAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeAlternateIDAt(
            final int index) {
        String obj = this._alternateIDList.remove(index);
        return obj;
    }

    /**
     * Method removeKeyword.
     * 
     * @param vKeyword
     * @return true if the object was removed from the collection.
     */
    public boolean removeKeyword(
            final String vKeyword) {
        return _keywordList.remove(vKeyword);
    }

    /**
     * Method removeKeywordAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeKeywordAt(
            final int index) {
        String obj = this._keywordList.remove(index);
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
     * Method removeResourceType.
     * 
     * @param vResourceType
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceType(
            final URIAndEntityName vResourceType) {
        return _resourceTypeList.remove(vResourceType);
    }

    /**
     * Method removeResourceTypeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public URIAndEntityName removeResourceTypeAt(
            final int index) {
        URIAndEntityName obj = this._resourceTypeList.remove(index);
        return obj;
    }

    /**
     * Method removeSourceAndRole.
     * 
     * @param vSourceAndRole
     * @return true if the object was removed from the collection.
     */
    public boolean removeSourceAndRole(
            final SourceAndRoleReference vSourceAndRole) {
        return _sourceAndRoleList.remove(vSourceAndRole);
    }

    /**
     * Method removeSourceAndRoleAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public SourceAndRoleReference removeSourceAndRoleAt(
            final int index) {
        SourceAndRoleReference obj = this._sourceAndRoleList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'about'. The field 'about' has the
     * following description: the (or a) definitive URI that
     * represents the resource being described. Note that this is
     * NOT the URI of the resource description in the CTS2 format,
     * but of the resource itself. As an example, the
     *  about URI for the Wine ontology would be
     * "http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#". The
     * NCI Thesaurus has, amongst others, the
     *  about URI of
     * http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#. HL7
     * uses ISO Object Identifiers (OIDs) to label resources so,
     * from the HL7 perspective, the about URI of the NCI Thesaurus
     * would
     *  be "urn:oid:2.16.840.1.113883.3.26.1.1"
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
     * @param vAdditionalDocumentation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAdditionalDocumentation(
            final int index,
            final String vAdditionalDocumentation)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._additionalDocumentationList.size()) {
            throw new IndexOutOfBoundsException("setAdditionalDocumentation: Index value '" + index + "' not in range [0.." + (this._additionalDocumentationList.size() - 1) + "]");
        }

        this._additionalDocumentationList.set(index, vAdditionalDocumentation);
    }

    /**
     * 
     * 
     * @param vAdditionalDocumentationArray
     */
    public void setAdditionalDocumentation(
            final String[] vAdditionalDocumentationArray) {
        //-- copy array
        _additionalDocumentationList.clear();

        Collections.addAll(this._additionalDocumentationList, vAdditionalDocumentationArray);
    }

    /**
     * Sets the value of '_additionalDocumentationList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vAdditionalDocumentationList the Vector to copy.
     */
    public void setAdditionalDocumentation(
            final java.util.List<String> vAdditionalDocumentationList) {
        // copy vector
        this._additionalDocumentationList.clear();

        this._additionalDocumentationList.addAll(vAdditionalDocumentationList);
    }

    /**
     * Sets the value of '_additionalDocumentationList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param additionalDocumentationList the Vector to set.
     */
    public void setAdditionalDocumentationAsReference(
            final java.util.List<String> additionalDocumentationList) {
        this._additionalDocumentationList = additionalDocumentationList;
    }

    /**
     * 
     * 
     * @param index
     * @param vAlternateID
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAlternateID(
            final int index,
            final String vAlternateID)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._alternateIDList.size()) {
            throw new IndexOutOfBoundsException("setAlternateID: Index value '" + index + "' not in range [0.." + (this._alternateIDList.size() - 1) + "]");
        }

        this._alternateIDList.set(index, vAlternateID);
    }

    /**
     * 
     * 
     * @param vAlternateIDArray
     */
    public void setAlternateID(
            final String[] vAlternateIDArray) {
        //-- copy array
        _alternateIDList.clear();

        Collections.addAll(this._alternateIDList, vAlternateIDArray);
    }

    /**
     * Sets the value of '_alternateIDList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vAlternateIDList the Vector to copy.
     */
    public void setAlternateID(
            final java.util.List<String> vAlternateIDList) {
        // copy vector
        this._alternateIDList.clear();

        this._alternateIDList.addAll(vAlternateIDList);
    }

    /**
     * Sets the value of '_alternateIDList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param alternateIDList the Vector to set.
     */
    public void setAlternateIDAsReference(
            final java.util.List<String> alternateIDList) {
        this._alternateIDList = alternateIDList;
    }

    /**
     * Sets the value of field 'formalName'. The field 'formalName'
     * has the following description: the formal or officially
     * assigned name of this resource, if any
     * 
     * @param formalName the value of field 'formalName'.
     */
    public void setFormalName(
            final String formalName) {
        this._formalName = formalName;
    }

    /**
     * 
     * 
     * @param index
     * @param vKeyword
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKeyword(
            final int index,
            final String vKeyword)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._keywordList.size()) {
            throw new IndexOutOfBoundsException("setKeyword: Index value '" + index + "' not in range [0.." + (this._keywordList.size() - 1) + "]");
        }

        this._keywordList.set(index, vKeyword);
    }

    /**
     * 
     * 
     * @param vKeywordArray
     */
    public void setKeyword(
            final String[] vKeywordArray) {
        //-- copy array
        _keywordList.clear();

        Collections.addAll(this._keywordList, vKeywordArray);
    }

    /**
     * Sets the value of '_keywordList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vKeywordList the Vector to copy.
     */
    public void setKeyword(
            final java.util.List<String> vKeywordList) {
        // copy vector
        this._keywordList.clear();

        this._keywordList.addAll(vKeywordList);
    }

    /**
     * Sets the value of '_keywordList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param keywordList the Vector to set.
     */
    public void setKeywordAsReference(
            final java.util.List<String> keywordList) {
        this._keywordList = keywordList;
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
     * Sets the value of field 'resourceSynopsis'. The field
     * 'resourceSynopsis' has the following description: a textual
     * summary of the resource - what it is, what it is for, etc.
     * 
     * @param resourceSynopsis the value of field 'resourceSynopsis'
     */
    public void setResourceSynopsis(
            final EntryDescription resourceSynopsis) {
        this._resourceSynopsis = resourceSynopsis;
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceType
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceType(
            final int index,
            final URIAndEntityName vResourceType)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceTypeList.size()) {
            throw new IndexOutOfBoundsException("setResourceType: Index value '" + index + "' not in range [0.." + (this._resourceTypeList.size() - 1) + "]");
        }

        this._resourceTypeList.set(index, vResourceType);
    }

    /**
     * 
     * 
     * @param vResourceTypeArray
     */
    public void setResourceType(
            final URIAndEntityName[] vResourceTypeArray) {
        //-- copy array
        _resourceTypeList.clear();

        Collections.addAll(this._resourceTypeList, vResourceTypeArray);
    }

    /**
     * Sets the value of '_resourceTypeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vResourceTypeList the Vector to copy.
     */
    public void setResourceType(
            final java.util.List<URIAndEntityName> vResourceTypeList) {
        // copy vector
        this._resourceTypeList.clear();

        this._resourceTypeList.addAll(vResourceTypeList);
    }

    /**
     * Sets the value of '_resourceTypeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param resourceTypeList the Vector to set.
     */
    public void setResourceTypeAsReference(
            final java.util.List<URIAndEntityName> resourceTypeList) {
        this._resourceTypeList = resourceTypeList;
    }

    /**
     * Sets the value of field 'rights'. The field 'rights' has the
     * following description: copyright and IP information. Note
     * that rights applies to the source resource, not the CTS2
     * rendering.
     * 
     * @param rights the value of field 'rights'.
     */
    public void setRights(
            final OpaqueData rights) {
        this._rights = rights;
    }

    /**
     * 
     * 
     * @param index
     * @param vSourceAndRole
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSourceAndRole(
            final int index,
            final SourceAndRoleReference vSourceAndRole)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceAndRoleList.size()) {
            throw new IndexOutOfBoundsException("setSourceAndRole: Index value '" + index + "' not in range [0.." + (this._sourceAndRoleList.size() - 1) + "]");
        }

        this._sourceAndRoleList.set(index, vSourceAndRole);
    }

    /**
     * 
     * 
     * @param vSourceAndRoleArray
     */
    public void setSourceAndRole(
            final SourceAndRoleReference[] vSourceAndRoleArray) {
        //-- copy array
        _sourceAndRoleList.clear();

        Collections.addAll(this._sourceAndRoleList, vSourceAndRoleArray);
    }

    /**
     * Sets the value of '_sourceAndRoleList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSourceAndRoleList the Vector to copy.
     */
    public void setSourceAndRole(
            final java.util.List<SourceAndRoleReference> vSourceAndRoleList) {
        // copy vector
        this._sourceAndRoleList.clear();

        this._sourceAndRoleList.addAll(vSourceAndRoleList);
    }

    /**
     * Sets the value of '_sourceAndRoleList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param sourceAndRoleList the Vector to set.
     */
    public void setSourceAndRoleAsReference(
            final java.util.List<SourceAndRoleReference> sourceAndRoleList) {
        this._sourceAndRoleList = sourceAndRoleList;
    }

    /**
     * Sets the value of field 'sourceStatements'. The field
     * 'sourceStatements' has the following description: a
     * DirectoryURI that references the set of statements that were
     * used to construct the containing resource. This attribute
     * must (may?) be present if and only if the service supports
     * the
     *  Statement profile 
     * 
     * @param sourceStatements the value of field 'sourceStatements'
     */
    public void setSourceStatements(
            final String sourceStatements) {
        this._sourceStatements = sourceStatements;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
