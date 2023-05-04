/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.codesystemversion;

import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import edu.mayo.cts2.framework.model.core.LanguageReference;
import java.util.Collections;

/**
 * CodeSystemVersion is a collection of assertions about one or
 * more entities. If the state of a CodeSystemVersion is Final the
 * set of assertions made the resource is fixed, meaning
 *  that if one knows the documentURI assigned to the version and
 * the specific sourceAndNotation from which the version instance
 * was derived, the set of assertions is known as well.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodeSystemVersionCatalogEntry extends edu.mayo.cts2.framework.model.core.ResourceVersionDescription 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an identifier that uniquely names this particular code
     * system version within the context of the CTS2 service
     * instance.
     */
    private String _codeSystemVersionName;

    /**
     * the name, URI and, if supported by the service, link to the
     * code system that this version represents.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemReference _versionOf;

    /**
     * a reference to a code system version whose assertions are
     * included as part this code system version. 
     */
    private java.util.List<CodeSystemVersionReference> _importsList;

    /**
     * the default spoken or written language used in this version
     */
    private LanguageReference _defaultLanguage;

    /**
     * all languages recognized by this particular code system
     * version
     */
    private java.util.List<LanguageReference> _supportedLanguageList;

    /**
     * a DirectoryURI that resolves to the set of all entities and
     * their descriptions asserted by this code system version.
     * This attribute will only be present if and only if the
     * service implementation
     *  supports the EntityQuery service profile.
     */
    private String _entityDescriptions;

    /**
     * a DirectoryURI that,resolves to a a list of all associations
     * asserted by this particular code system version
     */
    private String _associations;

    /**
     * a DirectoryURI that resolves to the set of
     * EntityDescriptions that are of type owl:Class within this
     * code system. Will only be present in code systems that
     * represent
     *  ontologies.
     */
    private String _classes;

    /**
     * a DirectoryURI that resolves to the set of
     * EntityDescriptions that are of type owl:ObjectProperty or
     * owl:DataProperty within this code system. Will only be
     * present in code systems
     *  that represent ontologies.
     */
    private String _roles;

    /**
     * a DirectoryURI that resolves to the set of
     * EntityDescriptions that are of type owl:Individual within
     * this code system. Will only be present in code systems that
     * represent
     *  ontologies.
     */
    private String _individuals;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodeSystemVersionCatalogEntry() {
        super();
        this._importsList = new java.util.ArrayList<CodeSystemVersionReference>();
        this._supportedLanguageList = new java.util.ArrayList<LanguageReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vImports
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImports(
            final CodeSystemVersionReference vImports)
    throws IndexOutOfBoundsException {
        this._importsList.add(vImports);
    }

    /**
     * 
     * 
     * @param index
     * @param vImports
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImports(
            final int index,
            final CodeSystemVersionReference vImports)
    throws IndexOutOfBoundsException {
        this._importsList.add(index, vImports);
    }

    /**
     * 
     * 
     * @param vSupportedLanguage
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedLanguage(
            final LanguageReference vSupportedLanguage)
    throws IndexOutOfBoundsException {
        this._supportedLanguageList.add(vSupportedLanguage);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedLanguage
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedLanguage(
            final int index,
            final LanguageReference vSupportedLanguage)
    throws IndexOutOfBoundsException {
        this._supportedLanguageList.add(index, vSupportedLanguage);
    }

    /**
     * Method enumerateImports.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends CodeSystemVersionReference> enumerateImports(
    ) {
        return Collections.enumeration(this._importsList);
    }

    /**
     * Method enumerateSupportedLanguage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends LanguageReference> enumerateSupportedLanguage(
    ) {
        return Collections.enumeration(this._supportedLanguageList);
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

        if (obj instanceof CodeSystemVersionCatalogEntry) {

            CodeSystemVersionCatalogEntry temp = (CodeSystemVersionCatalogEntry)obj;
            if (this._codeSystemVersionName != null) {
                if (temp._codeSystemVersionName == null) return false;
                if (!this._codeSystemVersionName.equals(temp._codeSystemVersionName)) 
                    return false;
            } else if (temp._codeSystemVersionName != null)
                return false;
            if (this._versionOf != null) {
                if (temp._versionOf == null) return false;
                if (!this._versionOf.equals(temp._versionOf)) 
                    return false;
            } else if (temp._versionOf != null)
                return false;
            if (this._importsList != null) {
                if (temp._importsList == null) return false;
                if (!this._importsList.equals(temp._importsList)) 
                    return false;
            } else if (temp._importsList != null)
                return false;
            if (this._defaultLanguage != null) {
                if (temp._defaultLanguage == null) return false;
                if (!this._defaultLanguage.equals(temp._defaultLanguage)) 
                    return false;
            } else if (temp._defaultLanguage != null)
                return false;
            if (this._supportedLanguageList != null) {
                if (temp._supportedLanguageList == null) return false;
                if (!this._supportedLanguageList.equals(temp._supportedLanguageList)) 
                    return false;
            } else if (temp._supportedLanguageList != null)
                return false;
            if (this._entityDescriptions != null) {
                if (temp._entityDescriptions == null) return false;
                if (!this._entityDescriptions.equals(temp._entityDescriptions)) 
                    return false;
            } else if (temp._entityDescriptions != null)
                return false;
            if (this._associations != null) {
                if (temp._associations == null) return false;
                if (!this._associations.equals(temp._associations)) 
                    return false;
            } else if (temp._associations != null)
                return false;
            if (this._classes != null) {
                if (temp._classes == null) return false;
                if (!this._classes.equals(temp._classes)) 
                    return false;
            } else if (temp._classes != null)
                return false;
            if (this._roles != null) {
                if (temp._roles == null) return false;
                if (!this._roles.equals(temp._roles)) 
                    return false;
            } else if (temp._roles != null)
                return false;
            if (this._individuals != null) {
                if (temp._individuals == null) return false;
                return this._individuals.equals(temp._individuals);
            } else return temp._individuals == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'associations'. The field
     * 'associations' has the following description: a DirectoryURI
     * that,resolves to a a list of all associations asserted by
     * this particular code system version
     * 
     * @return the value of field 'Associations'.
     */
    public String getAssociations(
    ) {
        return this._associations;
    }

    /**
     * Returns the value of field 'classes'. The field 'classes'
     * has the following description: a DirectoryURI that resolves
     * to the set of EntityDescriptions that are of type owl:Class
     * within this code system. Will only be present in code
     * systems that represent
     *  ontologies.
     * 
     * @return the value of field 'Classes'.
     */
    public String getClasses(
    ) {
        return this._classes;
    }

    /**
     * Returns the value of field 'codeSystemVersionName'. The
     * field 'codeSystemVersionName' has the following description:
     * an identifier that uniquely names this particular code
     * system version within the context of the CTS2 service
     * instance.
     * 
     * @return the value of field 'CodeSystemVersionName'.
     */
    public String getCodeSystemVersionName(
    ) {
        return this._codeSystemVersionName;
    }

    /**
     * Returns the value of field 'defaultLanguage'. The field
     * 'defaultLanguage' has the following description: the default
     * spoken or written language used in this version
     * 
     * @return the value of field 'DefaultLanguage'.
     */
    public LanguageReference getDefaultLanguage(
    ) {
        return this._defaultLanguage;
    }

    /**
     * Returns the value of field 'entityDescriptions'. The field
     * 'entityDescriptions' has the following description: a
     * DirectoryURI that resolves to the set of all entities and
     * their descriptions asserted by this code system version.
     * This attribute will only be present if and only if the
     * service implementation
     *  supports the EntityQuery service profile.
     * 
     * @return the value of field 'EntityDescriptions'.
     */
    public String getEntityDescriptions(
    ) {
        return this._entityDescriptions;
    }

    /**
     * Method getImports.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.CodeSystemVersionReference
     * at the given index
     */
    public CodeSystemVersionReference getImports(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._importsList.size()) {
            throw new IndexOutOfBoundsException("getImports: Index value '" + index + "' not in range [0.." + (this._importsList.size() - 1) + "]");
        }

        return _importsList.get(index);
    }

    /**
     * Method getImports.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public CodeSystemVersionReference[] getImports(
    ) {
        CodeSystemVersionReference[] array = new CodeSystemVersionReference[0];
        return this._importsList.toArray(array);
    }

    /**
     * Method getImportsAsReference.Returns a reference to
     * '_importsList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<CodeSystemVersionReference> getImportsAsReference(
    ) {
        return this._importsList;
    }

    /**
     * Method getImportsCount.
     * 
     * @return the size of this collection
     */
    public int getImportsCount(
    ) {
        return this._importsList.size();
    }

    /**
     * Returns the value of field 'individuals'. The field
     * 'individuals' has the following description: a DirectoryURI
     * that resolves to the set of EntityDescriptions that are of
     * type owl:Individual within this code system. Will only be
     * present in code systems that represent
     *  ontologies.
     * 
     * @return the value of field 'Individuals'.
     */
    public String getIndividuals(
    ) {
        return this._individuals;
    }

    /**
     * Returns the value of field 'roles'. The field 'roles' has
     * the following description: a DirectoryURI that resolves to
     * the set of EntityDescriptions that are of type
     * owl:ObjectProperty or owl:DataProperty within this code
     * system. Will only be present in code systems
     *  that represent ontologies.
     * 
     * @return the value of field 'Roles'.
     */
    public String getRoles(
    ) {
        return this._roles;
    }

    /**
     * Method getSupportedLanguage.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.LanguageReference at the
     * given index
     */
    public LanguageReference getSupportedLanguage(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedLanguageList.size()) {
            throw new IndexOutOfBoundsException("getSupportedLanguage: Index value '" + index + "' not in range [0.." + (this._supportedLanguageList.size() - 1) + "]");
        }

        return _supportedLanguageList.get(index);
    }

    /**
     * Method getSupportedLanguage.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public LanguageReference[] getSupportedLanguage(
    ) {
        LanguageReference[] array = new LanguageReference[0];
        return this._supportedLanguageList.toArray(array);
    }

    /**
     * Method getSupportedLanguageAsReference.Returns a reference
     * to '_supportedLanguageList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<LanguageReference> getSupportedLanguageAsReference(
    ) {
        return this._supportedLanguageList;
    }

    /**
     * Method getSupportedLanguageCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedLanguageCount(
    ) {
        return this._supportedLanguageList.size();
    }

    /**
     * Returns the value of field 'versionOf'. The field
     * 'versionOf' has the following description: the name, URI
     * and, if supported by the service, link to the code system
     * that this version represents.
     * 
     * @return the value of field 'VersionOf'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemReference getVersionOf(
    ) {
        return this._versionOf;
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
        if (_codeSystemVersionName != null) {
           result = 37 * result + _codeSystemVersionName.hashCode();
        }
        if (_versionOf != null) {
           result = 37 * result + _versionOf.hashCode();
        }
        if (_importsList != null) {
           result = 37 * result + _importsList.hashCode();
        }
        if (_defaultLanguage != null) {
           result = 37 * result + _defaultLanguage.hashCode();
        }
        if (_supportedLanguageList != null) {
           result = 37 * result + _supportedLanguageList.hashCode();
        }
        if (_entityDescriptions != null) {
           result = 37 * result + _entityDescriptions.hashCode();
        }
        if (_associations != null) {
           result = 37 * result + _associations.hashCode();
        }
        if (_classes != null) {
           result = 37 * result + _classes.hashCode();
        }
        if (_roles != null) {
           result = 37 * result + _roles.hashCode();
        }
        if (_individuals != null) {
           result = 37 * result + _individuals.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateImports.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends CodeSystemVersionReference> iterateImports(
    ) {
        return this._importsList.iterator();
    }

    /**
     * Method iterateSupportedLanguage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends LanguageReference> iterateSupportedLanguage(
    ) {
        return this._supportedLanguageList.iterator();
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
    public void removeAllImports(
    ) {
        this._importsList.clear();
    }

    /**
     */
    public void removeAllSupportedLanguage(
    ) {
        this._supportedLanguageList.clear();
    }

    /**
     * Method removeImports.
     * 
     * @param vImports
     * @return true if the object was removed from the collection.
     */
    public boolean removeImports(
            final CodeSystemVersionReference vImports) {
        return _importsList.remove(vImports);
    }

    /**
     * Method removeImportsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public CodeSystemVersionReference removeImportsAt(
            final int index) {
        CodeSystemVersionReference obj = this._importsList.remove(index);
        return obj;
    }

    /**
     * Method removeSupportedLanguage.
     * 
     * @param vSupportedLanguage
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedLanguage(
            final LanguageReference vSupportedLanguage) {
        return _supportedLanguageList.remove(vSupportedLanguage);
    }

    /**
     * Method removeSupportedLanguageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public LanguageReference removeSupportedLanguageAt(
            final int index) {
        LanguageReference obj = this._supportedLanguageList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'associations'. The field
     * 'associations' has the following description: a DirectoryURI
     * that,resolves to a a list of all associations asserted by
     * this particular code system version
     * 
     * @param associations the value of field 'associations'.
     */
    public void setAssociations(
            final String associations) {
        this._associations = associations;
    }

    /**
     * Sets the value of field 'classes'. The field 'classes' has
     * the following description: a DirectoryURI that resolves to
     * the set of EntityDescriptions that are of type owl:Class
     * within this code system. Will only be present in code
     * systems that represent
     *  ontologies.
     * 
     * @param classes the value of field 'classes'.
     */
    public void setClasses(
            final String classes) {
        this._classes = classes;
    }

    /**
     * Sets the value of field 'codeSystemVersionName'. The field
     * 'codeSystemVersionName' has the following description: an
     * identifier that uniquely names this particular code system
     * version within the context of the CTS2 service instance.
     * 
     * @param codeSystemVersionName the value of field
     * 'codeSystemVersionName'.
     */
    public void setCodeSystemVersionName(
            final String codeSystemVersionName) {
        this._codeSystemVersionName = codeSystemVersionName;
    }

    /**
     * Sets the value of field 'defaultLanguage'. The field
     * 'defaultLanguage' has the following description: the default
     * spoken or written language used in this version
     * 
     * @param defaultLanguage the value of field 'defaultLanguage'.
     */
    public void setDefaultLanguage(
            final LanguageReference defaultLanguage) {
        this._defaultLanguage = defaultLanguage;
    }

    /**
     * Sets the value of field 'entityDescriptions'. The field
     * 'entityDescriptions' has the following description: a
     * DirectoryURI that resolves to the set of all entities and
     * their descriptions asserted by this code system version.
     * This attribute will only be present if and only if the
     * service implementation
     *  supports the EntityQuery service profile.
     * 
     * @param entityDescriptions the value of field
     * 'entityDescriptions'.
     */
    public void setEntityDescriptions(
            final String entityDescriptions) {
        this._entityDescriptions = entityDescriptions;
    }

    /**
     * 
     * 
     * @param index
     * @param vImports
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setImports(
            final int index,
            final CodeSystemVersionReference vImports)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._importsList.size()) {
            throw new IndexOutOfBoundsException("setImports: Index value '" + index + "' not in range [0.." + (this._importsList.size() - 1) + "]");
        }

        this._importsList.set(index, vImports);
    }

    /**
     * 
     * 
     * @param vImportsArray
     */
    public void setImports(
            final CodeSystemVersionReference[] vImportsArray) {
        //-- copy array
        _importsList.clear();

        Collections.addAll(this._importsList, vImportsArray);
    }

    /**
     * Sets the value of '_importsList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vImportsList the Vector to copy.
     */
    public void setImports(
            final java.util.List<CodeSystemVersionReference> vImportsList) {
        // copy vector
        this._importsList.clear();

        this._importsList.addAll(vImportsList);
    }

    /**
     * Sets the value of '_importsList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param importsList the Vector to set.
     */
    public void setImportsAsReference(
            final java.util.List<CodeSystemVersionReference> importsList) {
        this._importsList = importsList;
    }

    /**
     * Sets the value of field 'individuals'. The field
     * 'individuals' has the following description: a DirectoryURI
     * that resolves to the set of EntityDescriptions that are of
     * type owl:Individual within this code system. Will only be
     * present in code systems that represent
     *  ontologies.
     * 
     * @param individuals the value of field 'individuals'.
     */
    public void setIndividuals(
            final String individuals) {
        this._individuals = individuals;
    }

    /**
     * Sets the value of field 'roles'. The field 'roles' has the
     * following description: a DirectoryURI that resolves to the
     * set of EntityDescriptions that are of type
     * owl:ObjectProperty or owl:DataProperty within this code
     * system. Will only be present in code systems
     *  that represent ontologies.
     * 
     * @param roles the value of field 'roles'.
     */
    public void setRoles(
            final String roles) {
        this._roles = roles;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedLanguage
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedLanguage(
            final int index,
            final LanguageReference vSupportedLanguage)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedLanguageList.size()) {
            throw new IndexOutOfBoundsException("setSupportedLanguage: Index value '" + index + "' not in range [0.." + (this._supportedLanguageList.size() - 1) + "]");
        }

        this._supportedLanguageList.set(index, vSupportedLanguage);
    }

    /**
     * 
     * 
     * @param vSupportedLanguageArray
     */
    public void setSupportedLanguage(
            final LanguageReference[] vSupportedLanguageArray) {
        //-- copy array
        _supportedLanguageList.clear();

        Collections.addAll(this._supportedLanguageList, vSupportedLanguageArray);
    }

    /**
     * Sets the value of '_supportedLanguageList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedLanguageList the Vector to copy.
     */
    public void setSupportedLanguage(
            final java.util.List<LanguageReference> vSupportedLanguageList) {
        // copy vector
        this._supportedLanguageList.clear();

        this._supportedLanguageList.addAll(vSupportedLanguageList);
    }

    /**
     * Sets the value of '_supportedLanguageList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedLanguageList the Vector to set.
     */
    public void setSupportedLanguageAsReference(
            final java.util.List<LanguageReference> supportedLanguageList) {
        this._supportedLanguageList = supportedLanguageList;
    }

    /**
     * Sets the value of field 'versionOf'. The field 'versionOf'
     * has the following description: the name, URI and, if
     * supported by the service, link to the code system that this
     * version represents.
     * 
     * @param versionOf the value of field 'versionOf'.
     */
    public void setVersionOf(
            final edu.mayo.cts2.framework.model.core.CodeSystemReference versionOf) {
        this._versionOf = versionOf;
    }

    /**
     * Method unmarshalCodeSystemVersionCatalogEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.codesystemversion.CodeSystemVersionCatalogEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
