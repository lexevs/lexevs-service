/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity;

import edu.mayo.cts2.framework.model.core.ContextReference;
import java.util.Collections;

/**
 * A Designation is identical to a Lexical Label as defined in
 * SKOS. It is a "string of
 *  (UNICODE) characters ... in a given natural language, such as
 * English or Japanese." "These labels provide the strongest clues
 * as to the meaning of a (SKOS concept)". The CTS2 specification
 * generalizes the label
 *  use to include not only SKOS concepts but any class, predicate
 * or individual - collectively referred to as Entity. Note that
 * Designation is intended only for identifiers that are
 * interpreted by human beings.
 *  Numeric codes and other machine readable identifiers should be
 * recorded as ScopedEntityNames.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Designation extends edu.mayo.cts2.framework.model.core.EntryDescription 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an indicator that determines the particular role that this
     * designation plays
     */
    private edu.mayo.cts2.framework.model.entity.types.DesignationRole _designationRole = edu.mayo.cts2.framework.model.entity.types.DesignationRole.fromValue("ALTERNATIVE");

    /**
     * the code system version that contains the assertion(s)
     * represented in the Note
     */
    private String _assertedInCodeSystemVersion;

    /**
     * an identifier that is assigned to this designation / entity
     * pair by the authoring body. As an example this would carry
     * the SCTID for SNOMED-CT concepts.
     */
    private String _externalIdentifier;

    /**
     * a URI that, when de-referenced, provides the equivalent
     * Statement that forms this designation. This is only present
     * when the Statement profile is supported by the implementing
     *  service.
     */
    private String _correspondingStatement;

    /**
     * the context(s) in which this designation is applicable
     */
    private java.util.List<ContextReference> _usageContextList;

    /**
     * the type of designation (e.g. abbreviation, eponym, short
     * name, long name, etc.) of the given designation.
     */
    private edu.mayo.cts2.framework.model.core.DesignationTypeReference _designationType;

    /**
     * identifies the significance that case plays in the value of
     * this particular designation.
     */
    private edu.mayo.cts2.framework.model.core.CaseSignificanceReference _caseSignificance;

    /**
     * a measure of how closely this designation actually matches
     * the intended meaning of the target entity. Typical values
     * might represent "exact", "approximate", "broader",
     * "narrower",
     *  etc.
     */
    private edu.mayo.cts2.framework.model.core.DesignationFidelityReference _degreeOfFidelity;


      //----------------/
     //- Constructors -/
    //----------------/

    public Designation() {
        super();
        setDesignationRole(edu.mayo.cts2.framework.model.entity.types.DesignationRole.fromValue("ALTERNATIVE"));
        this._usageContextList = new java.util.ArrayList<ContextReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vUsageContext
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsageContext(
            final ContextReference vUsageContext)
    throws IndexOutOfBoundsException {
        this._usageContextList.add(vUsageContext);
    }

    /**
     * 
     * 
     * @param index
     * @param vUsageContext
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUsageContext(
            final int index,
            final ContextReference vUsageContext)
    throws IndexOutOfBoundsException {
        this._usageContextList.add(index, vUsageContext);
    }

    /**
     * Method enumerateUsageContext.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ContextReference> enumerateUsageContext(
    ) {
        return Collections.enumeration(this._usageContextList);
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

        if (obj instanceof Designation) {

            Designation temp = (Designation)obj;
            if (this._designationRole != null) {
                if (temp._designationRole == null) return false;
                if (!this._designationRole.equals(temp._designationRole)) 
                    return false;
            } else if (temp._designationRole != null)
                return false;
            if (this._assertedInCodeSystemVersion != null) {
                if (temp._assertedInCodeSystemVersion == null) return false;
                if (!this._assertedInCodeSystemVersion.equals(temp._assertedInCodeSystemVersion)) 
                    return false;
            } else if (temp._assertedInCodeSystemVersion != null)
                return false;
            if (this._externalIdentifier != null) {
                if (temp._externalIdentifier == null) return false;
                if (!this._externalIdentifier.equals(temp._externalIdentifier)) 
                    return false;
            } else if (temp._externalIdentifier != null)
                return false;
            if (this._correspondingStatement != null) {
                if (temp._correspondingStatement == null) return false;
                if (!this._correspondingStatement.equals(temp._correspondingStatement)) 
                    return false;
            } else if (temp._correspondingStatement != null)
                return false;
            if (this._usageContextList != null) {
                if (temp._usageContextList == null) return false;
                if (!this._usageContextList.equals(temp._usageContextList)) 
                    return false;
            } else if (temp._usageContextList != null)
                return false;
            if (this._designationType != null) {
                if (temp._designationType == null) return false;
                if (!this._designationType.equals(temp._designationType)) 
                    return false;
            } else if (temp._designationType != null)
                return false;
            if (this._caseSignificance != null) {
                if (temp._caseSignificance == null) return false;
                if (!this._caseSignificance.equals(temp._caseSignificance)) 
                    return false;
            } else if (temp._caseSignificance != null)
                return false;
            if (this._degreeOfFidelity != null) {
                if (temp._degreeOfFidelity == null) return false;
                return this._degreeOfFidelity.equals(temp._degreeOfFidelity);
            } else return temp._degreeOfFidelity == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'assertedInCodeSystemVersion'.
     * The field 'assertedInCodeSystemVersion' has the following
     * description: the code system version that contains the
     * assertion(s) represented in the Note
     * 
     * @return the value of field 'AssertedInCodeSystemVersion'.
     */
    public String getAssertedInCodeSystemVersion(
    ) {
        return this._assertedInCodeSystemVersion;
    }

    /**
     * Returns the value of field 'caseSignificance'. The field
     * 'caseSignificance' has the following description: identifies
     * the significance that case plays in the value of this
     * particular designation.
     * 
     * @return the value of field 'CaseSignificance'.
     */
    public edu.mayo.cts2.framework.model.core.CaseSignificanceReference getCaseSignificance(
    ) {
        return this._caseSignificance;
    }

    /**
     * Returns the value of field 'correspondingStatement'. The
     * field 'correspondingStatement' has the following
     * description: a URI that, when de-referenced, provides the
     * equivalent Statement that forms this designation. This is
     * only present when the Statement profile is supported by the
     * implementing
     *  service.
     * 
     * @return the value of field 'CorrespondingStatement'.
     */
    public String getCorrespondingStatement(
    ) {
        return this._correspondingStatement;
    }

    /**
     * Returns the value of field 'degreeOfFidelity'. The field
     * 'degreeOfFidelity' has the following description: a measure
     * of how closely this designation actually matches the
     * intended meaning of the target entity. Typical values might
     * represent "exact", "approximate", "broader", "narrower",
     *  etc.
     * 
     * @return the value of field 'DegreeOfFidelity'.
     */
    public edu.mayo.cts2.framework.model.core.DesignationFidelityReference getDegreeOfFidelity(
    ) {
        return this._degreeOfFidelity;
    }

    /**
     * Returns the value of field 'designationRole'. The field
     * 'designationRole' has the following description: an
     * indicator that determines the particular role that this
     * designation plays
     * 
     * @return the value of field 'DesignationRole'.
     */
    public edu.mayo.cts2.framework.model.entity.types.DesignationRole getDesignationRole(
    ) {
        return this._designationRole;
    }

    /**
     * Returns the value of field 'designationType'. The field
     * 'designationType' has the following description: the type of
     * designation (e.g. abbreviation, eponym, short name, long
     * name, etc.) of the given designation.
     * 
     * @return the value of field 'DesignationType'.
     */
    public edu.mayo.cts2.framework.model.core.DesignationTypeReference getDesignationType(
    ) {
        return this._designationType;
    }

    /**
     * Returns the value of field 'externalIdentifier'. The field
     * 'externalIdentifier' has the following description: an
     * identifier that is assigned to this designation / entity
     * pair by the authoring body. As an example this would carry
     * the SCTID for SNOMED-CT concepts.
     * 
     * @return the value of field 'ExternalIdentifier'.
     */
    public String getExternalIdentifier(
    ) {
        return this._externalIdentifier;
    }

    /**
     * Method getUsageContext.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.ContextReference at the
     * given index
     */
    public ContextReference getUsageContext(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usageContextList.size()) {
            throw new IndexOutOfBoundsException("getUsageContext: Index value '" + index + "' not in range [0.." + (this._usageContextList.size() - 1) + "]");
        }

        return _usageContextList.get(index);
    }

    /**
     * Method getUsageContext.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ContextReference[] getUsageContext(
    ) {
        ContextReference[] array = new ContextReference[0];
        return this._usageContextList.toArray(array);
    }

    /**
     * Method getUsageContextAsReference.Returns a reference to
     * '_usageContextList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ContextReference> getUsageContextAsReference(
    ) {
        return this._usageContextList;
    }

    /**
     * Method getUsageContextCount.
     * 
     * @return the size of this collection
     */
    public int getUsageContextCount(
    ) {
        return this._usageContextList.size();
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
        if (_designationRole != null) {
           result = 37 * result + _designationRole.hashCode();
        }
        if (_assertedInCodeSystemVersion != null) {
           result = 37 * result + _assertedInCodeSystemVersion.hashCode();
        }
        if (_externalIdentifier != null) {
           result = 37 * result + _externalIdentifier.hashCode();
        }
        if (_correspondingStatement != null) {
           result = 37 * result + _correspondingStatement.hashCode();
        }
        if (_usageContextList != null) {
           result = 37 * result + _usageContextList.hashCode();
        }
        if (_designationType != null) {
           result = 37 * result + _designationType.hashCode();
        }
        if (_caseSignificance != null) {
           result = 37 * result + _caseSignificance.hashCode();
        }
        if (_degreeOfFidelity != null) {
           result = 37 * result + _degreeOfFidelity.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateUsageContext.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ContextReference> iterateUsageContext(
    ) {
        return this._usageContextList.iterator();
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
    public void removeAllUsageContext(
    ) {
        this._usageContextList.clear();
    }

    /**
     * Method removeUsageContext.
     * 
     * @param vUsageContext
     * @return true if the object was removed from the collection.
     */
    public boolean removeUsageContext(
            final ContextReference vUsageContext) {
        return _usageContextList.remove(vUsageContext);
    }

    /**
     * Method removeUsageContextAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ContextReference removeUsageContextAt(
            final int index) {
        ContextReference obj = this._usageContextList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'assertedInCodeSystemVersion'. The
     * field 'assertedInCodeSystemVersion' has the following
     * description: the code system version that contains the
     * assertion(s) represented in the Note
     * 
     * @param assertedInCodeSystemVersion the value of field
     * 'assertedInCodeSystemVersion'.
     */
    public void setAssertedInCodeSystemVersion(
            final String assertedInCodeSystemVersion) {
        this._assertedInCodeSystemVersion = assertedInCodeSystemVersion;
    }

    /**
     * Sets the value of field 'caseSignificance'. The field
     * 'caseSignificance' has the following description: identifies
     * the significance that case plays in the value of this
     * particular designation.
     * 
     * @param caseSignificance the value of field 'caseSignificance'
     */
    public void setCaseSignificance(
            final edu.mayo.cts2.framework.model.core.CaseSignificanceReference caseSignificance) {
        this._caseSignificance = caseSignificance;
    }

    /**
     * Sets the value of field 'correspondingStatement'. The field
     * 'correspondingStatement' has the following description: a
     * URI that, when de-referenced, provides the equivalent
     * Statement that forms this designation. This is only present
     * when the Statement profile is supported by the implementing
     *  service.
     * 
     * @param correspondingStatement the value of field
     * 'correspondingStatement'.
     */
    public void setCorrespondingStatement(
            final String correspondingStatement) {
        this._correspondingStatement = correspondingStatement;
    }

    /**
     * Sets the value of field 'degreeOfFidelity'. The field
     * 'degreeOfFidelity' has the following description: a measure
     * of how closely this designation actually matches the
     * intended meaning of the target entity. Typical values might
     * represent "exact", "approximate", "broader", "narrower",
     *  etc.
     * 
     * @param degreeOfFidelity the value of field 'degreeOfFidelity'
     */
    public void setDegreeOfFidelity(
            final edu.mayo.cts2.framework.model.core.DesignationFidelityReference degreeOfFidelity) {
        this._degreeOfFidelity = degreeOfFidelity;
    }

    /**
     * Sets the value of field 'designationRole'. The field
     * 'designationRole' has the following description: an
     * indicator that determines the particular role that this
     * designation plays
     * 
     * @param designationRole the value of field 'designationRole'.
     */
    public void setDesignationRole(
            final edu.mayo.cts2.framework.model.entity.types.DesignationRole designationRole) {
        this._designationRole = designationRole;
    }

    /**
     * Sets the value of field 'designationType'. The field
     * 'designationType' has the following description: the type of
     * designation (e.g. abbreviation, eponym, short name, long
     * name, etc.) of the given designation.
     * 
     * @param designationType the value of field 'designationType'.
     */
    public void setDesignationType(
            final edu.mayo.cts2.framework.model.core.DesignationTypeReference designationType) {
        this._designationType = designationType;
    }

    /**
     * Sets the value of field 'externalIdentifier'. The field
     * 'externalIdentifier' has the following description: an
     * identifier that is assigned to this designation / entity
     * pair by the authoring body. As an example this would carry
     * the SCTID for SNOMED-CT concepts.
     * 
     * @param externalIdentifier the value of field
     * 'externalIdentifier'.
     */
    public void setExternalIdentifier(
            final String externalIdentifier) {
        this._externalIdentifier = externalIdentifier;
    }

    /**
     * 
     * 
     * @param index
     * @param vUsageContext
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUsageContext(
            final int index,
            final ContextReference vUsageContext)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._usageContextList.size()) {
            throw new IndexOutOfBoundsException("setUsageContext: Index value '" + index + "' not in range [0.." + (this._usageContextList.size() - 1) + "]");
        }

        this._usageContextList.set(index, vUsageContext);
    }

    /**
     * 
     * 
     * @param vUsageContextArray
     */
    public void setUsageContext(
            final ContextReference[] vUsageContextArray) {
        //-- copy array
        _usageContextList.clear();

        Collections.addAll(this._usageContextList, vUsageContextArray);
    }

    /**
     * Sets the value of '_usageContextList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vUsageContextList the Vector to copy.
     */
    public void setUsageContext(
            final java.util.List<ContextReference> vUsageContextList) {
        // copy vector
        this._usageContextList.clear();

        this._usageContextList.addAll(vUsageContextList);
    }

    /**
     * Sets the value of '_usageContextList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param usageContextList the Vector to set.
     */
    public void setUsageContextAsReference(
            final java.util.List<ContextReference> usageContextList) {
        this._usageContextList = usageContextList;
    }

    /**
     * Method unmarshalDesignation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.entity.Designation
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
