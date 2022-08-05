/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.codesystem;

import edu.mayo.cts2.framework.model.core.AbstractResourceDescription;
import edu.mayo.cts2.framework.model.core.CodeSystemCategoryReference;
import edu.mayo.cts2.framework.model.core.CodeSystemReference;
import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import edu.mayo.cts2.framework.model.core.OntologyDomainReference;
import edu.mayo.cts2.framework.model.core.OntologyEngineeringToolReference;
import edu.mayo.cts2.framework.model.core.OntologyLanguageReference;
import edu.mayo.cts2.framework.model.core.OntologyTaskReference;
import edu.mayo.cts2.framework.model.core.OntologyTypeReference;
import java.util.Collections;

/**
 * Metadata and access information about a code system.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodeSystemCatalogEntry extends AbstractResourceDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the local identifier that uniquely identifies the code
     * system within the context of the implementing service. Note
     * that the about URI is the globally unique identifier.
     */
    private String _codeSystemName;

    /**
     * the category or type of resource that the code system
     * represents.
     */
    private CodeSystemCategoryReference _codeSystemCategory;

    /**
     * the subject domain of the ontology
     */
    private OntologyDomainReference _ontologyDomain;

    /**
     * the nature of the content of the ontology
     */
    private OntologyTypeReference _ontologyType;

    /**
     * the purpose for which the ontology was originally designed
     */
    private java.util.List<OntologyTaskReference> _designedForOntologyTaskList;

    /**
     * the formal ontology language
     */
    private OntologyLanguageReference _hasOntologyLanguage;

    /**
     * a reference to an external code system that is included as a
     * component of the referenced code system. The Wine Ontology,
     *  as an example, includes the Food Ontology as one of its
     * components. Similarly, the US Edition of SNOMED-CT includes
     * the international edition. 
     *  
     */
    private java.util.List<CodeSystemReference> _includesList;

    /**
     * a DirectoryURI that references the known versions of this
     * code system. 
     */
    private String _versions;

    /**
     * a reference to the code system version marked as CURRENT in
     * the service instance.
     */
    private CodeSystemVersionReference _currentVersion;

    /**
     * information about a tool used to create the ontology
     */
    private java.util.List<OntologyEngineeringToolReference> _usedOntologyEngineeringToolList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodeSystemCatalogEntry() {
        super();
        this._designedForOntologyTaskList = new java.util.ArrayList<OntologyTaskReference>();
        this._includesList = new java.util.ArrayList<CodeSystemReference>();
        this._usedOntologyEngineeringToolList = new java.util.ArrayList<OntologyEngineeringToolReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDesignedForOntologyTask
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDesignedForOntologyTask(
            final OntologyTaskReference vDesignedForOntologyTask)
    throws IndexOutOfBoundsException {
        this._designedForOntologyTaskList.add(vDesignedForOntologyTask);
    }

    /**
     * 
     * 
     * @param index
     * @param vDesignedForOntologyTask
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDesignedForOntologyTask(
            final int index,
            final OntologyTaskReference vDesignedForOntologyTask)
    throws IndexOutOfBoundsException {
        this._designedForOntologyTaskList.add(index, vDesignedForOntologyTask);
    }

    /**
     * 
     * 
     * @param vIncludes
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludes(
            final CodeSystemReference vIncludes)
    throws IndexOutOfBoundsException {
        this._includesList.add(vIncludes);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludes
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludes(
            final int index,
            final CodeSystemReference vIncludes)
    throws IndexOutOfBoundsException {
        this._includesList.add(index, vIncludes);
    }

    /**
     * 
     * 
     * @param vUsedOntologyEngineeringTool
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsedOntologyEngineeringTool(
            final OntologyEngineeringToolReference vUsedOntologyEngineeringTool)
    throws IndexOutOfBoundsException {
        this._usedOntologyEngineeringToolList.add(vUsedOntologyEngineeringTool);
    }

    /**
     * 
     * 
     * @param index
     * @param vUsedOntologyEngineeringTool
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsedOntologyEngineeringTool(
            final int index,
            final OntologyEngineeringToolReference vUsedOntologyEngineeringTool)
    throws IndexOutOfBoundsException {
        this._usedOntologyEngineeringToolList.add(index, vUsedOntologyEngineeringTool);
    }

    /**
     * Method enumerateDesignedForOntologyTask.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends OntologyTaskReference> enumerateDesignedForOntologyTask(
    ) {
        return Collections.enumeration(this._designedForOntologyTaskList);
    }

    /**
     * Method enumerateIncludes.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends CodeSystemReference> enumerateIncludes(
    ) {
        return Collections.enumeration(this._includesList);
    }

    /**
     * Method enumerateUsedOntologyEngineeringTool.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends OntologyEngineeringToolReference> enumerateUsedOntologyEngineeringTool(
    ) {
        return Collections.enumeration(this._usedOntologyEngineeringToolList);
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

        if (obj instanceof CodeSystemCatalogEntry) {

            CodeSystemCatalogEntry temp = (CodeSystemCatalogEntry)obj;
            if (this._codeSystemName != null) {
                if (temp._codeSystemName == null) return false;
                if (!this._codeSystemName.equals(temp._codeSystemName)) 
                    return false;
            } else if (temp._codeSystemName != null)
                return false;
            if (this._codeSystemCategory != null) {
                if (temp._codeSystemCategory == null) return false;
                if (!this._codeSystemCategory.equals(temp._codeSystemCategory)) 
                    return false;
            } else if (temp._codeSystemCategory != null)
                return false;
            if (this._ontologyDomain != null) {
                if (temp._ontologyDomain == null) return false;
                if (!this._ontologyDomain.equals(temp._ontologyDomain)) 
                    return false;
            } else if (temp._ontologyDomain != null)
                return false;
            if (this._ontologyType != null) {
                if (temp._ontologyType == null) return false;
                if (!this._ontologyType.equals(temp._ontologyType)) 
                    return false;
            } else if (temp._ontologyType != null)
                return false;
            if (this._designedForOntologyTaskList != null) {
                if (temp._designedForOntologyTaskList == null) return false;
                if (!this._designedForOntologyTaskList.equals(temp._designedForOntologyTaskList)) 
                    return false;
            } else if (temp._designedForOntologyTaskList != null)
                return false;
            if (this._hasOntologyLanguage != null) {
                if (temp._hasOntologyLanguage == null) return false;
                if (!this._hasOntologyLanguage.equals(temp._hasOntologyLanguage)) 
                    return false;
            } else if (temp._hasOntologyLanguage != null)
                return false;
            if (this._includesList != null) {
                if (temp._includesList == null) return false;
                if (!this._includesList.equals(temp._includesList)) 
                    return false;
            } else if (temp._includesList != null)
                return false;
            if (this._versions != null) {
                if (temp._versions == null) return false;
                if (!this._versions.equals(temp._versions)) 
                    return false;
            } else if (temp._versions != null)
                return false;
            if (this._currentVersion != null) {
                if (temp._currentVersion == null) return false;
                if (!this._currentVersion.equals(temp._currentVersion)) 
                    return false;
            } else if (temp._currentVersion != null)
                return false;
            if (this._usedOntologyEngineeringToolList != null) {
                if (temp._usedOntologyEngineeringToolList == null) return false;
                return this._usedOntologyEngineeringToolList.equals(temp._usedOntologyEngineeringToolList);
            } else return temp._usedOntologyEngineeringToolList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystemCategory'. The field
     * 'codeSystemCategory' has the following description: the
     * category or type of resource that the code system
     * represents.
     * 
     * @return the value of field 'CodeSystemCategory'.
     */
    public CodeSystemCategoryReference getCodeSystemCategory(
    ) {
        return this._codeSystemCategory;
    }

    /**
     * Returns the value of field 'codeSystemName'. The field
     * 'codeSystemName' has the following description: the local
     * identifier that uniquely identifies the code system within
     * the context of the implementing service. Note that the about
     * URI is the globally unique identifier.
     * 
     * @return the value of field 'CodeSystemName'.
     */
    public String getCodeSystemName(
    ) {
        return this._codeSystemName;
    }

    /**
     * Returns the value of field 'currentVersion'. The field
     * 'currentVersion' has the following description: a reference
     * to the code system version marked as CURRENT in the service
     * instance.
     * 
     * @return the value of field 'CurrentVersion'.
     */
    public CodeSystemVersionReference getCurrentVersion(
    ) {
        return this._currentVersion;
    }

    /**
     * Method getDesignedForOntologyTask.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.OntologyTaskReference at
     * the given index
     */
    public OntologyTaskReference getDesignedForOntologyTask(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._designedForOntologyTaskList.size()) {
            throw new IndexOutOfBoundsException("getDesignedForOntologyTask: Index value '" + index + "' not in range [0.." + (this._designedForOntologyTaskList.size() - 1) + "]");
        }

        return _designedForOntologyTaskList.get(index);
    }

    /**
     * Method getDesignedForOntologyTask.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public OntologyTaskReference[] getDesignedForOntologyTask(
    ) {
        OntologyTaskReference[] array = new OntologyTaskReference[0];
        return this._designedForOntologyTaskList.toArray(array);
    }

    /**
     * Method getDesignedForOntologyTaskAsReference.Returns a
     * reference to '_designedForOntologyTaskList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<OntologyTaskReference> getDesignedForOntologyTaskAsReference(
    ) {
        return this._designedForOntologyTaskList;
    }

    /**
     * Method getDesignedForOntologyTaskCount.
     * 
     * @return the size of this collection
     */
    public int getDesignedForOntologyTaskCount(
    ) {
        return this._designedForOntologyTaskList.size();
    }

    /**
     * Returns the value of field 'hasOntologyLanguage'. The field
     * 'hasOntologyLanguage' has the following description: the
     * formal ontology language
     * 
     * @return the value of field 'HasOntologyLanguage'.
     */
    public OntologyLanguageReference getHasOntologyLanguage(
    ) {
        return this._hasOntologyLanguage;
    }

    /**
     * Method getIncludes.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.CodeSystemReference at
     * the given index
     */
    public CodeSystemReference getIncludes(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includesList.size()) {
            throw new IndexOutOfBoundsException("getIncludes: Index value '" + index + "' not in range [0.." + (this._includesList.size() - 1) + "]");
        }

        return _includesList.get(index);
    }

    /**
     * Method getIncludes.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public CodeSystemReference[] getIncludes(
    ) {
        CodeSystemReference[] array = new CodeSystemReference[0];
        return this._includesList.toArray(array);
    }

    /**
     * Method getIncludesAsReference.Returns a reference to
     * '_includesList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<CodeSystemReference> getIncludesAsReference(
    ) {
        return this._includesList;
    }

    /**
     * Method getIncludesCount.
     * 
     * @return the size of this collection
     */
    public int getIncludesCount(
    ) {
        return this._includesList.size();
    }

    /**
     * Returns the value of field 'ontologyDomain'. The field
     * 'ontologyDomain' has the following description: the subject
     * domain of the ontology
     * 
     * @return the value of field 'OntologyDomain'.
     */
    public OntologyDomainReference getOntologyDomain(
    ) {
        return this._ontologyDomain;
    }

    /**
     * Returns the value of field 'ontologyType'. The field
     * 'ontologyType' has the following description: the nature of
     * the content of the ontology
     * 
     * @return the value of field 'OntologyType'.
     */
    public OntologyTypeReference getOntologyType(
    ) {
        return this._ontologyType;
    }

    /**
     * Method getUsedOntologyEngineeringTool.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.OntologyEngineeringToolReference
     * at the given index
     */
    public OntologyEngineeringToolReference getUsedOntologyEngineeringTool(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usedOntologyEngineeringToolList.size()) {
            throw new IndexOutOfBoundsException("getUsedOntologyEngineeringTool: Index value '" + index + "' not in range [0.." + (this._usedOntologyEngineeringToolList.size() - 1) + "]");
        }

        return _usedOntologyEngineeringToolList.get(index);
    }

    /**
     * Method getUsedOntologyEngineeringTool.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public OntologyEngineeringToolReference[] getUsedOntologyEngineeringTool(
    ) {
        OntologyEngineeringToolReference[] array = new OntologyEngineeringToolReference[0];
        return this._usedOntologyEngineeringToolList.toArray(array);
    }

    /**
     * Method getUsedOntologyEngineeringToolAsReference.Returns a
     * reference to '_usedOntologyEngineeringToolList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<OntologyEngineeringToolReference> getUsedOntologyEngineeringToolAsReference(
    ) {
        return this._usedOntologyEngineeringToolList;
    }

    /**
     * Method getUsedOntologyEngineeringToolCount.
     * 
     * @return the size of this collection
     */
    public int getUsedOntologyEngineeringToolCount(
    ) {
        return this._usedOntologyEngineeringToolList.size();
    }

    /**
     * Returns the value of field 'versions'. The field 'versions'
     * has the following description: a DirectoryURI that
     * references the known versions of this code system. 
     * 
     * @return the value of field 'Versions'.
     */
    public String getVersions(
    ) {
        return this._versions;
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
        if (_codeSystemName != null) {
           result = 37 * result + _codeSystemName.hashCode();
        }
        if (_codeSystemCategory != null) {
           result = 37 * result + _codeSystemCategory.hashCode();
        }
        if (_ontologyDomain != null) {
           result = 37 * result + _ontologyDomain.hashCode();
        }
        if (_ontologyType != null) {
           result = 37 * result + _ontologyType.hashCode();
        }
        if (_designedForOntologyTaskList != null) {
           result = 37 * result + _designedForOntologyTaskList.hashCode();
        }
        if (_hasOntologyLanguage != null) {
           result = 37 * result + _hasOntologyLanguage.hashCode();
        }
        if (_includesList != null) {
           result = 37 * result + _includesList.hashCode();
        }
        if (_versions != null) {
           result = 37 * result + _versions.hashCode();
        }
        if (_currentVersion != null) {
           result = 37 * result + _currentVersion.hashCode();
        }
        if (_usedOntologyEngineeringToolList != null) {
           result = 37 * result + _usedOntologyEngineeringToolList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateDesignedForOntologyTask.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends OntologyTaskReference> iterateDesignedForOntologyTask(
    ) {
        return this._designedForOntologyTaskList.iterator();
    }

    /**
     * Method iterateIncludes.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends CodeSystemReference> iterateIncludes(
    ) {
        return this._includesList.iterator();
    }

    /**
     * Method iterateUsedOntologyEngineeringTool.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends OntologyEngineeringToolReference> iterateUsedOntologyEngineeringTool(
    ) {
        return this._usedOntologyEngineeringToolList.iterator();
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
    public void removeAllDesignedForOntologyTask(
    ) {
        this._designedForOntologyTaskList.clear();
    }

    /**
     */
    public void removeAllIncludes(
    ) {
        this._includesList.clear();
    }

    /**
     */
    public void removeAllUsedOntologyEngineeringTool(
    ) {
        this._usedOntologyEngineeringToolList.clear();
    }

    /**
     * Method removeDesignedForOntologyTask.
     * 
     * @param vDesignedForOntologyTask
     * @return true if the object was removed from the collection.
     */
    public boolean removeDesignedForOntologyTask(
            final OntologyTaskReference vDesignedForOntologyTask) {
        return _designedForOntologyTaskList.remove(vDesignedForOntologyTask);
    }

    /**
     * Method removeDesignedForOntologyTaskAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public OntologyTaskReference removeDesignedForOntologyTaskAt(
            final int index) {
        OntologyTaskReference obj = this._designedForOntologyTaskList.remove(index);
        return obj;
    }

    /**
     * Method removeIncludes.
     * 
     * @param vIncludes
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludes(
            final CodeSystemReference vIncludes) {
        return _includesList.remove(vIncludes);
    }

    /**
     * Method removeIncludesAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public CodeSystemReference removeIncludesAt(
            final int index) {
        CodeSystemReference obj = this._includesList.remove(index);
        return obj;
    }

    /**
     * Method removeUsedOntologyEngineeringTool.
     * 
     * @param vUsedOntologyEngineeringTool
     * @return true if the object was removed from the collection.
     */
    public boolean removeUsedOntologyEngineeringTool(
            final OntologyEngineeringToolReference vUsedOntologyEngineeringTool) {
        return _usedOntologyEngineeringToolList.remove(vUsedOntologyEngineeringTool);
    }

    /**
     * Method removeUsedOntologyEngineeringToolAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public OntologyEngineeringToolReference removeUsedOntologyEngineeringToolAt(
            final int index) {
        OntologyEngineeringToolReference obj = this._usedOntologyEngineeringToolList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'codeSystemCategory'. The field
     * 'codeSystemCategory' has the following description: the
     * category or type of resource that the code system
     * represents.
     * 
     * @param codeSystemCategory the value of field
     * 'codeSystemCategory'.
     */
    public void setCodeSystemCategory(
            final CodeSystemCategoryReference codeSystemCategory) {
        this._codeSystemCategory = codeSystemCategory;
    }

    /**
     * Sets the value of field 'codeSystemName'. The field
     * 'codeSystemName' has the following description: the local
     * identifier that uniquely identifies the code system within
     * the context of the implementing service. Note that the about
     * URI is the globally unique identifier.
     * 
     * @param codeSystemName the value of field 'codeSystemName'.
     */
    public void setCodeSystemName(
            final String codeSystemName) {
        this._codeSystemName = codeSystemName;
    }

    /**
     * Sets the value of field 'currentVersion'. The field
     * 'currentVersion' has the following description: a reference
     * to the code system version marked as CURRENT in the service
     * instance.
     * 
     * @param currentVersion the value of field 'currentVersion'.
     */
    public void setCurrentVersion(
            final CodeSystemVersionReference currentVersion) {
        this._currentVersion = currentVersion;
    }

    /**
     * 
     * 
     * @param index
     * @param vDesignedForOntologyTask
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDesignedForOntologyTask(
            final int index,
            final OntologyTaskReference vDesignedForOntologyTask)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._designedForOntologyTaskList.size()) {
            throw new IndexOutOfBoundsException("setDesignedForOntologyTask: Index value '" + index + "' not in range [0.." + (this._designedForOntologyTaskList.size() - 1) + "]");
        }

        this._designedForOntologyTaskList.set(index, vDesignedForOntologyTask);
    }

    /**
     * 
     * 
     * @param vDesignedForOntologyTaskArray
     */
    public void setDesignedForOntologyTask(
            final OntologyTaskReference[] vDesignedForOntologyTaskArray) {
        //-- copy array
        _designedForOntologyTaskList.clear();

        Collections.addAll(this._designedForOntologyTaskList, vDesignedForOntologyTaskArray);
    }

    /**
     * Sets the value of '_designedForOntologyTaskList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vDesignedForOntologyTaskList the Vector to copy.
     */
    public void setDesignedForOntologyTask(
            final java.util.List<OntologyTaskReference> vDesignedForOntologyTaskList) {
        // copy vector
        this._designedForOntologyTaskList.clear();

        this._designedForOntologyTaskList.addAll(vDesignedForOntologyTaskList);
    }

    /**
     * Sets the value of '_designedForOntologyTaskList' by setting
     * it to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param designedForOntologyTaskList the Vector to set.
     */
    public void setDesignedForOntologyTaskAsReference(
            final java.util.List<OntologyTaskReference> designedForOntologyTaskList) {
        this._designedForOntologyTaskList = designedForOntologyTaskList;
    }

    /**
     * Sets the value of field 'hasOntologyLanguage'. The field
     * 'hasOntologyLanguage' has the following description: the
     * formal ontology language
     * 
     * @param hasOntologyLanguage the value of field
     * 'hasOntologyLanguage'.
     */
    public void setHasOntologyLanguage(
            final OntologyLanguageReference hasOntologyLanguage) {
        this._hasOntologyLanguage = hasOntologyLanguage;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludes
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludes(
            final int index,
            final CodeSystemReference vIncludes)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includesList.size()) {
            throw new IndexOutOfBoundsException("setIncludes: Index value '" + index + "' not in range [0.." + (this._includesList.size() - 1) + "]");
        }

        this._includesList.set(index, vIncludes);
    }

    /**
     * 
     * 
     * @param vIncludesArray
     */
    public void setIncludes(
            final CodeSystemReference[] vIncludesArray) {
        //-- copy array
        _includesList.clear();

        Collections.addAll(this._includesList, vIncludesArray);
    }

    /**
     * Sets the value of '_includesList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vIncludesList the Vector to copy.
     */
    public void setIncludes(
            final java.util.List<CodeSystemReference> vIncludesList) {
        // copy vector
        this._includesList.clear();

        this._includesList.addAll(vIncludesList);
    }

    /**
     * Sets the value of '_includesList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param includesList the Vector to set.
     */
    public void setIncludesAsReference(
            final java.util.List<CodeSystemReference> includesList) {
        this._includesList = includesList;
    }

    /**
     * Sets the value of field 'ontologyDomain'. The field
     * 'ontologyDomain' has the following description: the subject
     * domain of the ontology
     * 
     * @param ontologyDomain the value of field 'ontologyDomain'.
     */
    public void setOntologyDomain(
            final OntologyDomainReference ontologyDomain) {
        this._ontologyDomain = ontologyDomain;
    }

    /**
     * Sets the value of field 'ontologyType'. The field
     * 'ontologyType' has the following description: the nature of
     * the content of the ontology
     * 
     * @param ontologyType the value of field 'ontologyType'.
     */
    public void setOntologyType(
            final OntologyTypeReference ontologyType) {
        this._ontologyType = ontologyType;
    }

    /**
     * 
     * 
     * @param index
     * @param vUsedOntologyEngineeringTool
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUsedOntologyEngineeringTool(
            final int index,
            final OntologyEngineeringToolReference vUsedOntologyEngineeringTool)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usedOntologyEngineeringToolList.size()) {
            throw new IndexOutOfBoundsException("setUsedOntologyEngineeringTool: Index value '" + index + "' not in range [0.." + (this._usedOntologyEngineeringToolList.size() - 1) + "]");
        }

        this._usedOntologyEngineeringToolList.set(index, vUsedOntologyEngineeringTool);
    }

    /**
     * 
     * 
     * @param vUsedOntologyEngineeringToolArray
     */
    public void setUsedOntologyEngineeringTool(
            final OntologyEngineeringToolReference[] vUsedOntologyEngineeringToolArray) {
        //-- copy array
        _usedOntologyEngineeringToolList.clear();

        Collections.addAll(this._usedOntologyEngineeringToolList, vUsedOntologyEngineeringToolArray);
    }

    /**
     * Sets the value of '_usedOntologyEngineeringToolList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vUsedOntologyEngineeringToolList the Vector to copy.
     */
    public void setUsedOntologyEngineeringTool(
            final java.util.List<OntologyEngineeringToolReference> vUsedOntologyEngineeringToolList) {
        // copy vector
        this._usedOntologyEngineeringToolList.clear();

        this._usedOntologyEngineeringToolList.addAll(vUsedOntologyEngineeringToolList);
    }

    /**
     * Sets the value of '_usedOntologyEngineeringToolList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param usedOntologyEngineeringToolList the Vector to set.
     */
    public void setUsedOntologyEngineeringToolAsReference(
            final java.util.List<OntologyEngineeringToolReference> usedOntologyEngineeringToolList) {
        this._usedOntologyEngineeringToolList = usedOntologyEngineeringToolList;
    }

    /**
     * Sets the value of field 'versions'. The field 'versions' has
     * the following description: a DirectoryURI that references
     * the known versions of this code system. 
     * 
     * @param versions the value of field 'versions'.
     */
    public void setVersions(
            final String versions) {
        this._versions = versions;
    }

    /**
     * Method unmarshalCodeSystemCatalogEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.codesystem.CodeSystemCatalogEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
