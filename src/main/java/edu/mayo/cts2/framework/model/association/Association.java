/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.association;

import edu.mayo.cts2.framework.model.core.Property;
import edu.mayo.cts2.framework.model.core.ReasoningAlgorithmReference;
import edu.mayo.cts2.framework.model.core.StatementTarget;
import edu.mayo.cts2.framework.service.core.xml.Cts2XMLMarshaller;

import java.util.Collections;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import static org.springframework.http.RequestEntity.put;

/**
 * A "semantic" assertion about a relationship between a subject
 * entity and a target entity, literal or compound expression as
 * represented by an unnamed blank node ("bnode"). 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@XmlRootElement(name = "association")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Association extends edu.mayo.cts2.framework.model.core.Changeable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the unique identifier of the association instance. While the
     * update mechanism of the CTS2 specifications requires that
     * all Changeable elements have unique identifiers, the rules
     *  and mechanism for assigning unique identifiers to
     * statements and associations are non-trivial. At the moment,
     * the CTS2 specification remains silent when it comes to
     * arriving at how this identifier is
     *  generated except to note that, if two service
     * implementations do not generate the same unique identifier
     * for the same assertion, then the prevImage element in
     * Changeable becomes the only way to
     *  identify which Association instance is being updated or
     * deleted.
     */
    private String _associationID;

    /**
     * how this association was derived. ASSERTED takes precedence
     * over DERIVED , meaning that an assertion that is both
     * asserted and derived is marked as asserted. If absent
     *  the derivation is unknown.
     */
    private edu.mayo.cts2.framework.model.association.types.AssociationDerivation _derivation;

    /**
     * the subject of the association statement. subject must
     * reference an Entity - i.e. a class, predicate and/or
     * individual.
     */
    private edu.mayo.cts2.framework.model.core.URIAndEntityName _subject;

    /**
     * the predicate of the association statement.
     */
    private edu.mayo.cts2.framework.model.core.PredicateReference _predicate;

    /**
     * the target (object) of the association statement. A target
     * may be a reference to an entity, an external resource URI, a
     * literal or a compound expression (bnode) or a set of
     *  targets.
     */
    private java.util.List<StatementTarget> _targetList;

    /**
     * additional tag/value attributes that qualify the association
     * statement itself as opposed to the statement subject.
     */
    private java.util.List<Property> _associationQualifierList;

    /**
     * the code system version that is making this assertion. A
     * code system version makes an assertion when (a) it contains
     * the assertion, (b) it imports a code system version that
     * contains the
     *  assertion or (c) the assertion is inferred from other
     * assertions.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemVersionReference _assertedBy;

    /**
     * the code system version that actually contains this
     * assertion. If absent, it is the same resource as assertedBy.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemVersionReference _assertedIn;

    /**
     * a reasoning algorithm that was used to derive an association
     * of derivation
     *  INFERRED. Note that more than one reasoning algorithm may
     * be present for the same association.
     */
    private java.util.List<ReasoningAlgorithmReference> _derivationReasoningAlgorithmList;

    /**
     * detail about the provenance and history of the statement(s)
     * from which this particular association is derived. This
     * attribute will only be present in CTS2 service
     * implementations that
     *  support the statements model.
     */
    private String _sourceStatements;


      //----------------/
     //- Constructors -/
    //----------------/

    public Association() {
        super();
        this._targetList = new java.util.ArrayList<StatementTarget>();
        this._associationQualifierList = new java.util.ArrayList<Property>();
        this._derivationReasoningAlgorithmList = new java.util.ArrayList<ReasoningAlgorithmReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssociationQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationQualifier(
            final Property vAssociationQualifier)
    throws IndexOutOfBoundsException {
        this._associationQualifierList.add(vAssociationQualifier);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssociationQualifier(
            final int index,
            final Property vAssociationQualifier)
    throws IndexOutOfBoundsException {
        this._associationQualifierList.add(index, vAssociationQualifier);
    }

    /**
     * 
     * 
     * @param vDerivationReasoningAlgorithm
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDerivationReasoningAlgorithm(
            final ReasoningAlgorithmReference vDerivationReasoningAlgorithm)
    throws IndexOutOfBoundsException {
        this._derivationReasoningAlgorithmList.add(vDerivationReasoningAlgorithm);
    }

    /**
     * 
     * 
     * @param index
     * @param vDerivationReasoningAlgorithm
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDerivationReasoningAlgorithm(
            final int index,
            final ReasoningAlgorithmReference vDerivationReasoningAlgorithm)
    throws IndexOutOfBoundsException {
        this._derivationReasoningAlgorithmList.add(index, vDerivationReasoningAlgorithm);
    }

    /**
     * 
     * 
     * @param vTarget
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final StatementTarget vTarget)
    throws IndexOutOfBoundsException {
        this._targetList.add(vTarget);
    }

    /**
     * 
     * 
     * @param index
     * @param vTarget
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final int index,
            final StatementTarget vTarget)
    throws IndexOutOfBoundsException {
        this._targetList.add(index, vTarget);
    }

    /**
     * Method enumerateAssociationQualifier.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends Property> enumerateAssociationQualifier(
    ) {
        return Collections.enumeration(this._associationQualifierList);
    }

    /**
     * Method enumerateDerivationReasoningAlgorithm.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ReasoningAlgorithmReference> enumerateDerivationReasoningAlgorithm(
    ) {
        return Collections.enumeration(this._derivationReasoningAlgorithmList);
    }

    /**
     * Method enumerateTarget.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends StatementTarget> enumerateTarget(
    ) {
        return Collections.enumeration(this._targetList);
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

        if (obj instanceof Association) {

            Association temp = (Association)obj;
            if (this._associationID != null) {
                if (temp._associationID == null) return false;
                if (!this._associationID.equals(temp._associationID)) 
                    return false;
            } else if (temp._associationID != null)
                return false;
            if (this._derivation != null) {
                if (temp._derivation == null) return false;
                if (!this._derivation.equals(temp._derivation)) 
                    return false;
            } else if (temp._derivation != null)
                return false;
            if (this._subject != null) {
                if (temp._subject == null) return false;
                if (!this._subject.equals(temp._subject)) 
                    return false;
            } else if (temp._subject != null)
                return false;
            if (this._predicate != null) {
                if (temp._predicate == null) return false;
                if (!this._predicate.equals(temp._predicate)) 
                    return false;
            } else if (temp._predicate != null)
                return false;
            if (this._targetList != null) {
                if (temp._targetList == null) return false;
                if (!this._targetList.equals(temp._targetList)) 
                    return false;
            } else if (temp._targetList != null)
                return false;
            if (this._associationQualifierList != null) {
                if (temp._associationQualifierList == null) return false;
                if (!this._associationQualifierList.equals(temp._associationQualifierList)) 
                    return false;
            } else if (temp._associationQualifierList != null)
                return false;
            if (this._assertedBy != null) {
                if (temp._assertedBy == null) return false;
                if (!this._assertedBy.equals(temp._assertedBy)) 
                    return false;
            } else if (temp._assertedBy != null)
                return false;
            if (this._assertedIn != null) {
                if (temp._assertedIn == null) return false;
                if (!this._assertedIn.equals(temp._assertedIn)) 
                    return false;
            } else if (temp._assertedIn != null)
                return false;
            if (this._derivationReasoningAlgorithmList != null) {
                if (temp._derivationReasoningAlgorithmList == null) return false;
                if (!this._derivationReasoningAlgorithmList.equals(temp._derivationReasoningAlgorithmList)) 
                    return false;
            } else if (temp._derivationReasoningAlgorithmList != null)
                return false;
            if (this._sourceStatements != null) {
                if (temp._sourceStatements == null) return false;
                return this._sourceStatements.equals(temp._sourceStatements);
            } else return temp._sourceStatements == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'assertedBy'. The field
     * 'assertedBy' has the following description: the code system
     * version that is making this assertion. A code system version
     * makes an assertion when (a) it contains the assertion, (b)
     * it imports a code system version that contains the
     *  assertion or (c) the assertion is inferred from other
     * assertions.
     * 
     * @return the value of field 'AssertedBy'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference getAssertedBy(
    ) {
        return this._assertedBy;
    }

    /**
     * Returns the value of field 'assertedIn'. The field
     * 'assertedIn' has the following description: the code system
     * version that actually contains this assertion. If absent, it
     * is the same resource as assertedBy.
     * 
     * @return the value of field 'AssertedIn'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference getAssertedIn(
    ) {
        return this._assertedIn;
    }

    /**
     * Returns the value of field 'associationID'. The field
     * 'associationID' has the following description: the unique
     * identifier of the association instance. While the update
     * mechanism of the CTS2 specifications requires that all
     * Changeable elements have unique identifiers, the rules
     *  and mechanism for assigning unique identifiers to
     * statements and associations are non-trivial. At the moment,
     * the CTS2 specification remains silent when it comes to
     * arriving at how this identifier is
     *  generated except to note that, if two service
     * implementations do not generate the same unique identifier
     * for the same assertion, then the prevImage element in
     * Changeable becomes the only way to
     *  identify which Association instance is being updated or
     * deleted.
     * 
     * @return the value of field 'AssociationID'.
     */
    public String getAssociationID(
    ) {
        return this._associationID;
    }

    /**
     * Method getAssociationQualifier.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.Property at the given inde
     */
    public Property getAssociationQualifier(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationQualifierList.size()) {
            throw new IndexOutOfBoundsException("getAssociationQualifier: Index value '" + index + "' not in range [0.." + (this._associationQualifierList.size() - 1) + "]");
        }

        return _associationQualifierList.get(index);
    }

    /**
     * Method getAssociationQualifier.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Property[] getAssociationQualifier(
    ) {
        Property[] array = new Property[0];
        return this._associationQualifierList.toArray(array);
    }

    /**
     * Method getAssociationQualifierAsReference.Returns a
     * reference to '_associationQualifierList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<Property> getAssociationQualifierAsReference(
    ) {
        return this._associationQualifierList;
    }

    /**
     * Method getAssociationQualifierCount.
     * 
     * @return the size of this collection
     */
    public int getAssociationQualifierCount(
    ) {
        return this._associationQualifierList.size();
    }

    /**
     * Returns the value of field 'derivation'. The field
     * 'derivation' has the following description: how this
     * association was derived. ASSERTED takes precedence over
     * DERIVED , meaning that an assertion that is both asserted
     * and derived is marked as asserted. If absent
     *  the derivation is unknown.
     * 
     * @return the value of field 'Derivation'.
     */
    public edu.mayo.cts2.framework.model.association.types.AssociationDerivation getDerivation(
    ) {
        return this._derivation;
    }

    /**
     * Method getDerivationReasoningAlgorithm.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.ReasoningAlgorithmReference
     * at the given index
     */
    public ReasoningAlgorithmReference getDerivationReasoningAlgorithm(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._derivationReasoningAlgorithmList.size()) {
            throw new IndexOutOfBoundsException("getDerivationReasoningAlgorithm: Index value '" + index + "' not in range [0.." + (this._derivationReasoningAlgorithmList.size() - 1) + "]");
        }

        return _derivationReasoningAlgorithmList.get(index);
    }

    /**
     * Method getDerivationReasoningAlgorithm.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ReasoningAlgorithmReference[] getDerivationReasoningAlgorithm(
    ) {
        ReasoningAlgorithmReference[] array = new ReasoningAlgorithmReference[0];
        return this._derivationReasoningAlgorithmList.toArray(array);
    }

    /**
     * Method getDerivationReasoningAlgorithmAsReference.Returns a
     * reference to '_derivationReasoningAlgorithmList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ReasoningAlgorithmReference> getDerivationReasoningAlgorithmAsReference(
    ) {
        return this._derivationReasoningAlgorithmList;
    }

    /**
     * Method getDerivationReasoningAlgorithmCount.
     * 
     * @return the size of this collection
     */
    public int getDerivationReasoningAlgorithmCount(
    ) {
        return this._derivationReasoningAlgorithmList.size();
    }

    /**
     * Returns the value of field 'predicate'. The field
     * 'predicate' has the following description: the predicate of
     * the association statement.
     * 
     * @return the value of field 'Predicate'.
     */
    public edu.mayo.cts2.framework.model.core.PredicateReference getPredicate(
    ) {
        return this._predicate;
    }

    /**
     * Returns the value of field 'sourceStatements'. The field
     * 'sourceStatements' has the following description: detail
     * about the provenance and history of the statement(s) from
     * which this particular association is derived. This attribute
     * will only be present in CTS2 service implementations that
     *  support the statements model.
     * 
     * @return the value of field 'SourceStatements'.
     */
    public String getSourceStatements(
    ) {
        return this._sourceStatements;
    }

    /**
     * Returns the value of field 'subject'. The field 'subject'
     * has the following description: the subject of the
     * association statement. subject must reference an Entity -
     * i.e. a class, predicate and/or individual.
     * 
     * @return the value of field 'Subject'.
     */
    public edu.mayo.cts2.framework.model.core.URIAndEntityName getSubject(
    ) {
        return this._subject;
    }

    /**
     * Method getTarget.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.StatementTarget at the
     * given index
     */
    public StatementTarget getTarget(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("getTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }

        return _targetList.get(index);
    }

    /**
     * Method getTarget.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public StatementTarget[] getTarget(
    ) {
        StatementTarget[] array = new StatementTarget[0];
        return this._targetList.toArray(array);
    }

    /**
     * Method getTargetAsReference.Returns a reference to
     * '_targetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<StatementTarget> getTargetAsReference(
    ) {
        return this._targetList;
    }

    /**
     * Method getTargetCount.
     * 
     * @return the size of this collection
     */
    public int getTargetCount(
    ) {
        return this._targetList.size();
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
        if (_associationID != null) {
           result = 37 * result + _associationID.hashCode();
        }
        if (_derivation != null) {
           result = 37 * result + _derivation.hashCode();
        }
        if (_subject != null) {
           result = 37 * result + _subject.hashCode();
        }
        if (_predicate != null) {
           result = 37 * result + _predicate.hashCode();
        }
        if (_targetList != null) {
           result = 37 * result + _targetList.hashCode();
        }
        if (_associationQualifierList != null) {
           result = 37 * result + _associationQualifierList.hashCode();
        }
        if (_assertedBy != null) {
           result = 37 * result + _assertedBy.hashCode();
        }
        if (_assertedIn != null) {
           result = 37 * result + _assertedIn.hashCode();
        }
        if (_derivationReasoningAlgorithmList != null) {
           result = 37 * result + _derivationReasoningAlgorithmList.hashCode();
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
     * Method iterateAssociationQualifier.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends Property> iterateAssociationQualifier(
    ) {
        return this._associationQualifierList.iterator();
    }

    /**
     * Method iterateDerivationReasoningAlgorithm.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ReasoningAlgorithmReference> iterateDerivationReasoningAlgorithm(
    ) {
        return this._derivationReasoningAlgorithmList.iterator();
    }

    /**
     * Method iterateTarget.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends StatementTarget> iterateTarget(
    ) {
        return this._targetList.iterator();
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
    public void removeAllAssociationQualifier(
    ) {
        this._associationQualifierList.clear();
    }

    /**
     */
    public void removeAllDerivationReasoningAlgorithm(
    ) {
        this._derivationReasoningAlgorithmList.clear();
    }

    /**
     */
    public void removeAllTarget(
    ) {
        this._targetList.clear();
    }

    /**
     * Method removeAssociationQualifier.
     * 
     * @param vAssociationQualifier
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssociationQualifier(
            final Property vAssociationQualifier) {
        return _associationQualifierList.remove(vAssociationQualifier);
    }

    /**
     * Method removeAssociationQualifierAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Property removeAssociationQualifierAt(
            final int index) {
        Property obj = this._associationQualifierList.remove(index);
        return obj;
    }

    /**
     * Method removeDerivationReasoningAlgorithm.
     * 
     * @param vDerivationReasoningAlgorithm
     * @return true if the object was removed from the collection.
     */
    public boolean removeDerivationReasoningAlgorithm(
            final ReasoningAlgorithmReference vDerivationReasoningAlgorithm) {
        return _derivationReasoningAlgorithmList.remove(vDerivationReasoningAlgorithm);
    }

    /**
     * Method removeDerivationReasoningAlgorithmAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ReasoningAlgorithmReference removeDerivationReasoningAlgorithmAt(
            final int index) {
        ReasoningAlgorithmReference obj = this._derivationReasoningAlgorithmList.remove(index);
        return obj;
    }

    /**
     * Method removeTarget.
     * 
     * @param vTarget
     * @return true if the object was removed from the collection.
     */
    public boolean removeTarget(
            final StatementTarget vTarget) {
        return _targetList.remove(vTarget);
    }

    /**
     * Method removeTargetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public StatementTarget removeTargetAt(
            final int index) {
        StatementTarget obj = this._targetList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'assertedBy'. The field 'assertedBy'
     * has the following description: the code system version that
     * is making this assertion. A code system version makes an
     * assertion when (a) it contains the assertion, (b) it imports
     * a code system version that contains the
     *  assertion or (c) the assertion is inferred from other
     * assertions.
     * 
     * @param assertedBy the value of field 'assertedBy'.
     */
    public void setAssertedBy(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference assertedBy) {
        this._assertedBy = assertedBy;
    }

    /**
     * Sets the value of field 'assertedIn'. The field 'assertedIn'
     * has the following description: the code system version that
     * actually contains this assertion. If absent, it is the same
     * resource as assertedBy.
     * 
     * @param assertedIn the value of field 'assertedIn'.
     */
    public void setAssertedIn(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference assertedIn) {
        this._assertedIn = assertedIn;
    }

    /**
     * Sets the value of field 'associationID'. The field
     * 'associationID' has the following description: the unique
     * identifier of the association instance. While the update
     * mechanism of the CTS2 specifications requires that all
     * Changeable elements have unique identifiers, the rules
     *  and mechanism for assigning unique identifiers to
     * statements and associations are non-trivial. At the moment,
     * the CTS2 specification remains silent when it comes to
     * arriving at how this identifier is
     *  generated except to note that, if two service
     * implementations do not generate the same unique identifier
     * for the same assertion, then the prevImage element in
     * Changeable becomes the only way to
     *  identify which Association instance is being updated or
     * deleted.
     * 
     * @param associationID the value of field 'associationID'.
     */
    public void setAssociationID(
            final String associationID) {
        this._associationID = associationID;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssociationQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssociationQualifier(
            final int index,
            final Property vAssociationQualifier)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._associationQualifierList.size()) {
            throw new IndexOutOfBoundsException("setAssociationQualifier: Index value '" + index + "' not in range [0.." + (this._associationQualifierList.size() - 1) + "]");
        }

        this._associationQualifierList.set(index, vAssociationQualifier);
    }

    /**
     * 
     * 
     * @param vAssociationQualifierArray
     */
    public void setAssociationQualifier(
            final Property[] vAssociationQualifierArray) {
        //-- copy array
        _associationQualifierList.clear();

        Collections.addAll(this._associationQualifierList, vAssociationQualifierArray);
    }

    /**
     * Sets the value of '_associationQualifierList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vAssociationQualifierList the Vector to copy.
     */
    public void setAssociationQualifier(
            final java.util.List<Property> vAssociationQualifierList) {
        // copy vector
        this._associationQualifierList.clear();

        this._associationQualifierList.addAll(vAssociationQualifierList);
    }

    /**
     * Sets the value of '_associationQualifierList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param associationQualifierList the Vector to set.
     */
    public void setAssociationQualifierAsReference(
            final java.util.List<Property> associationQualifierList) {
        this._associationQualifierList = associationQualifierList;
    }

    /**
     * Sets the value of field 'derivation'. The field 'derivation'
     * has the following description: how this association was
     * derived. ASSERTED takes precedence over DERIVED , meaning
     * that an assertion that is both asserted and derived is
     * marked as asserted. If absent
     *  the derivation is unknown.
     * 
     * @param derivation the value of field 'derivation'.
     */
    public void setDerivation(
            final edu.mayo.cts2.framework.model.association.types.AssociationDerivation derivation) {
        this._derivation = derivation;
    }

    /**
     * 
     * 
     * @param index
     * @param vDerivationReasoningAlgorithm
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDerivationReasoningAlgorithm(
            final int index,
            final ReasoningAlgorithmReference vDerivationReasoningAlgorithm)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._derivationReasoningAlgorithmList.size()) {
            throw new IndexOutOfBoundsException("setDerivationReasoningAlgorithm: Index value '" + index + "' not in range [0.." + (this._derivationReasoningAlgorithmList.size() - 1) + "]");
        }

        this._derivationReasoningAlgorithmList.set(index, vDerivationReasoningAlgorithm);
    }

    /**
     * 
     * 
     * @param vDerivationReasoningAlgorithmArray
     */
    public void setDerivationReasoningAlgorithm(
            final ReasoningAlgorithmReference[] vDerivationReasoningAlgorithmArray) {
        //-- copy array
        _derivationReasoningAlgorithmList.clear();

        Collections.addAll(this._derivationReasoningAlgorithmList, vDerivationReasoningAlgorithmArray);
    }

    /**
     * Sets the value of '_derivationReasoningAlgorithmList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vDerivationReasoningAlgorithmList the Vector to copy.
     */
    public void setDerivationReasoningAlgorithm(
            final java.util.List<ReasoningAlgorithmReference> vDerivationReasoningAlgorithmList) {
        // copy vector
        this._derivationReasoningAlgorithmList.clear();

        this._derivationReasoningAlgorithmList.addAll(vDerivationReasoningAlgorithmList);
    }

    /**
     * Sets the value of '_derivationReasoningAlgorithmList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param derivationReasoningAlgorithmList the Vector to set.
     */
    public void setDerivationReasoningAlgorithmAsReference(
            final java.util.List<ReasoningAlgorithmReference> derivationReasoningAlgorithmList) {
        this._derivationReasoningAlgorithmList = derivationReasoningAlgorithmList;
    }

    /**
     * Sets the value of field 'predicate'. The field 'predicate'
     * has the following description: the predicate of the
     * association statement.
     * 
     * @param predicate the value of field 'predicate'.
     */
    public void setPredicate(
            final edu.mayo.cts2.framework.model.core.PredicateReference predicate) {
        this._predicate = predicate;
    }

    /**
     * Sets the value of field 'sourceStatements'. The field
     * 'sourceStatements' has the following description: detail
     * about the provenance and history of the statement(s) from
     * which this particular association is derived. This attribute
     * will only be present in CTS2 service implementations that
     *  support the statements model.
     * 
     * @param sourceStatements the value of field 'sourceStatements'
     */
    public void setSourceStatements(
            final String sourceStatements) {
        this._sourceStatements = sourceStatements;
    }

    /**
     * Sets the value of field 'subject'. The field 'subject' has
     * the following description: the subject of the association
     * statement. subject must reference an Entity - i.e. a class,
     * predicate and/or individual.
     * 
     * @param subject the value of field 'subject'.
     */
    public void setSubject(
            final edu.mayo.cts2.framework.model.core.URIAndEntityName subject) {
        this._subject = subject;
    }

    /**
     * 
     * 
     * @param index
     * @param vTarget
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTarget(
            final int index,
            final StatementTarget vTarget)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("setTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }

        this._targetList.set(index, vTarget);
    }

    /**
     * 
     * 
     * @param vTargetArray
     */
    public void setTarget(
            final StatementTarget[] vTargetArray) {
        //-- copy array
        _targetList.clear();

        Collections.addAll(this._targetList, vTargetArray);
    }

    /**
     * Sets the value of '_targetList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vTargetList the Vector to copy.
     */
    public void setTarget(
            final java.util.List<StatementTarget> vTargetList) {
        // copy vector
        this._targetList.clear();

        this._targetList.addAll(vTargetList);
    }

    /**
     * Sets the value of '_targetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param targetList the Vector to set.
     */
    public void setTargetAsReference(
            final java.util.List<StatementTarget> targetList) {
        this._targetList = targetList;
    }


//    public static Association unmarshalAssociation(final java.io.Reader reader){
//        JAXBContext jaxbContext;
//        Association association = new Association();
//        try {
//            jaxbContext = JAXBContext.newInstance(Association.class);
//            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//            association = (Association) jaxbUnmarshaller.unmarshal(reader);
//
//        }
//        catch (JAXBException e) {
//            e.printStackTrace();
//        }
//        return association;
//    }

//    public static String marshal(final java.io.Writer writer){
//        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
//        jaxb2Marshaller.setClassesToBeBound(Association.class);
//        jaxb2Marshaller.setContextPath(Association.class.getPackage().getName());
//        StreamResult result = new StreamResult(writer);
//        jaxb2Marshaller.marshal(new Association(), result);
////        jaxb2Marshaller.setMarshallerProperties(new HashMap<String, Object>(){{
////            put(Marshaller.JAXB_FORMATTED_OUTPUT,true);
////        }});
//        return writer.toString();
//
//    }

    public static String marshall(){
        return Cts2XMLMarshaller.marshalToXml(new Association(), Association.class);

    }

    public static Association unmarshall(java.io.InputStream reader){
        return Cts2XMLMarshaller.unmarshalFromXML(reader);
    }


    /**
     * Method unmarshalAssociation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.association.Association
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
