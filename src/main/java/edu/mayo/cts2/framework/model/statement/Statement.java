/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.statement;

import edu.mayo.cts2.framework.model.core.SourceAndRoleReference;
import edu.mayo.cts2.framework.model.core.StatementTarget;
import java.util.Collections;

/**
 * An assertion about a CTS2 model element. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Statement extends edu.mayo.cts2.framework.model.core.Changeable 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The unique statement identifier. Must be globally unique if
     * information is to be exchanged and updated on the statement
     * leve.
     */
    private String _statementURI;

    /**
     * the subject of the statement - either a resource or a
     * reference to a terminological entity. subject may reference
     * a specific Association, CodeSystem,
     *  CodeSystemVersion, Map, MapEntry, MapVersion,
     * EntityDescription,
     *  ValueSet, ValueSetDefinition, ConceptDomain,
     * ConceptDomainBinding, 
     */
    private StatementSubject _subject;

    /**
     * the predicate of the statement. Note that this is type
     * URIAndEntityName as, while it serves as a predicate in the
     * statement itself it is not necessary that it be formally
     * recognized as a
     *  predicate by the CTS2 service - it may have been translated
     * or transformed by the load process.
     */
    private edu.mayo.cts2.framework.model.core.URIAndEntityName _predicate;

    /**
     * Field _targetList.
     */
    private java.util.List<StatementTarget> _targetList;

    /**
     * the identifier and name of the CTS2 attribute or element
     * that renders this statement, if any
     */
    private edu.mayo.cts2.framework.model.core.ModelAttributeReference _associatedAttribute;

    /**
     * the source(s) of the statement and the role(s) they played
     */
    private java.util.List<SourceAndRoleReference> _sourceList;

    /**
     * the code system version that is asserting this particular
     * statement. In the case of ontologies that import other
     * ontologies, this is the outermost importing ontology.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemVersionReference _assertedBy;

    /**
     * the code system version (ontology) that actually makes this
     * statement. In the case of ontologies, this is the innermost
     * imported ontology.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemVersionReference _assertedIn;

    /**
     * Field _qualifierList.
     */
    private java.util.List<StatementQualifier> _qualifierList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Statement() {
        super();
        this._targetList = new java.util.ArrayList<StatementTarget>();
        this._sourceList = new java.util.ArrayList<SourceAndRoleReference>();
        this._qualifierList = new java.util.ArrayList<StatementQualifier>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQualifier(
            final StatementQualifier vQualifier)
    throws IndexOutOfBoundsException {
        this._qualifierList.add(vQualifier);
    }

    /**
     * 
     * 
     * @param index
     * @param vQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addQualifier(
            final int index,
            final StatementQualifier vQualifier)
    throws IndexOutOfBoundsException {
        this._qualifierList.add(index, vQualifier);
    }

    /**
     * 
     * 
     * @param vSource
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSource(
            final SourceAndRoleReference vSource)
    throws IndexOutOfBoundsException {
        this._sourceList.add(vSource);
    }

    /**
     * 
     * 
     * @param index
     * @param vSource
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSource(
            final int index,
            final SourceAndRoleReference vSource)
    throws IndexOutOfBoundsException {
        this._sourceList.add(index, vSource);
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
     * Method enumerateQualifier.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends StatementQualifier> enumerateQualifier(
    ) {
        return Collections.enumeration(this._qualifierList);
    }

    /**
     * Method enumerateSource.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends SourceAndRoleReference> enumerateSource(
    ) {
        return Collections.enumeration(this._sourceList);
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

        if (obj instanceof Statement) {

            Statement temp = (Statement)obj;
            if (this._statementURI != null) {
                if (temp._statementURI == null) return false;
                if (!this._statementURI.equals(temp._statementURI)) 
                    return false;
            } else if (temp._statementURI != null)
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
            if (this._associatedAttribute != null) {
                if (temp._associatedAttribute == null) return false;
                if (!this._associatedAttribute.equals(temp._associatedAttribute)) 
                    return false;
            } else if (temp._associatedAttribute != null)
                return false;
            if (this._sourceList != null) {
                if (temp._sourceList == null) return false;
                if (!this._sourceList.equals(temp._sourceList)) 
                    return false;
            } else if (temp._sourceList != null)
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
            if (this._qualifierList != null) {
                if (temp._qualifierList == null) return false;
                return this._qualifierList.equals(temp._qualifierList);
            } else return temp._qualifierList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'assertedBy'. The field
     * 'assertedBy' has the following description: the code system
     * version that is asserting this particular statement. In the
     * case of ontologies that import other ontologies, this is the
     * outermost importing ontology.
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
     * version (ontology) that actually makes this statement. In
     * the case of ontologies, this is the innermost imported
     * ontology.
     * 
     * @return the value of field 'AssertedIn'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference getAssertedIn(
    ) {
        return this._assertedIn;
    }

    /**
     * Returns the value of field 'associatedAttribute'. The field
     * 'associatedAttribute' has the following description: the
     * identifier and name of the CTS2 attribute or element that
     * renders this statement, if any
     * 
     * @return the value of field 'AssociatedAttribute'.
     */
    public edu.mayo.cts2.framework.model.core.ModelAttributeReference getAssociatedAttribute(
    ) {
        return this._associatedAttribute;
    }

    /**
     * Returns the value of field 'predicate'. The field
     * 'predicate' has the following description: the predicate of
     * the statement. Note that this is type URIAndEntityName as,
     * while it serves as a predicate in the statement itself it is
     * not necessary that it be formally recognized as a
     *  predicate by the CTS2 service - it may have been translated
     * or transformed by the load process.
     * 
     * @return the value of field 'Predicate'.
     */
    public edu.mayo.cts2.framework.model.core.URIAndEntityName getPredicate(
    ) {
        return this._predicate;
    }

    /**
     * Method getQualifier.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.statement.StatementQualifier
     * at the given index
     */
    public StatementQualifier getQualifier(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._qualifierList.size()) {
            throw new IndexOutOfBoundsException("getQualifier: Index value '" + index + "' not in range [0.." + (this._qualifierList.size() - 1) + "]");
        }

        return _qualifierList.get(index);
    }

    /**
     * Method getQualifier.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public StatementQualifier[] getQualifier(
    ) {
        StatementQualifier[] array = new StatementQualifier[0];
        return this._qualifierList.toArray(array);
    }

    /**
     * Method getQualifierAsReference.Returns a reference to
     * '_qualifierList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<StatementQualifier> getQualifierAsReference(
    ) {
        return this._qualifierList;
    }

    /**
     * Method getQualifierCount.
     * 
     * @return the size of this collection
     */
    public int getQualifierCount(
    ) {
        return this._qualifierList.size();
    }

    /**
     * Method getSource.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.SourceAndRoleReference at
     * the given index
     */
    public SourceAndRoleReference getSource(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceList.size()) {
            throw new IndexOutOfBoundsException("getSource: Index value '" + index + "' not in range [0.." + (this._sourceList.size() - 1) + "]");
        }

        return _sourceList.get(index);
    }

    /**
     * Method getSource.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public SourceAndRoleReference[] getSource(
    ) {
        SourceAndRoleReference[] array = new SourceAndRoleReference[0];
        return this._sourceList.toArray(array);
    }

    /**
     * Method getSourceAsReference.Returns a reference to
     * '_sourceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<SourceAndRoleReference> getSourceAsReference(
    ) {
        return this._sourceList;
    }

    /**
     * Method getSourceCount.
     * 
     * @return the size of this collection
     */
    public int getSourceCount(
    ) {
        return this._sourceList.size();
    }

    /**
     * Returns the value of field 'statementURI'. The field
     * 'statementURI' has the following description: The unique
     * statement identifier. Must be globally unique if information
     * is to be exchanged and updated on the statement leve.
     * 
     * @return the value of field 'StatementURI'.
     */
    public String getStatementURI(
    ) {
        return this._statementURI;
    }

    /**
     * Returns the value of field 'subject'. The field 'subject'
     * has the following description: the subject of the statement
     * - either a resource or a reference to a terminological
     * entity. subject may reference a specific Association,
     * CodeSystem,
     *  CodeSystemVersion, Map, MapEntry, MapVersion,
     * EntityDescription,
     *  ValueSet, ValueSetDefinition, ConceptDomain,
     * ConceptDomainBinding, 
     * 
     * @return the value of field 'Subject'.
     */
    public StatementSubject getSubject(
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
        if (_statementURI != null) {
           result = 37 * result + _statementURI.hashCode();
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
        if (_associatedAttribute != null) {
           result = 37 * result + _associatedAttribute.hashCode();
        }
        if (_sourceList != null) {
           result = 37 * result + _sourceList.hashCode();
        }
        if (_assertedBy != null) {
           result = 37 * result + _assertedBy.hashCode();
        }
        if (_assertedIn != null) {
           result = 37 * result + _assertedIn.hashCode();
        }
        if (_qualifierList != null) {
           result = 37 * result + _qualifierList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateQualifier.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends StatementQualifier> iterateQualifier(
    ) {
        return this._qualifierList.iterator();
    }

    /**
     * Method iterateSource.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends SourceAndRoleReference> iterateSource(
    ) {
        return this._sourceList.iterator();
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
    public void removeAllQualifier(
    ) {
        this._qualifierList.clear();
    }

    /**
     */
    public void removeAllSource(
    ) {
        this._sourceList.clear();
    }

    /**
     */
    public void removeAllTarget(
    ) {
        this._targetList.clear();
    }

    /**
     * Method removeQualifier.
     * 
     * @param vQualifier
     * @return true if the object was removed from the collection.
     */
    public boolean removeQualifier(
            final StatementQualifier vQualifier) {
        return _qualifierList.remove(vQualifier);
    }

    /**
     * Method removeQualifierAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public StatementQualifier removeQualifierAt(
            final int index) {
        StatementQualifier obj = this._qualifierList.remove(index);
        return obj;
    }

    /**
     * Method removeSource.
     * 
     * @param vSource
     * @return true if the object was removed from the collection.
     */
    public boolean removeSource(
            final SourceAndRoleReference vSource) {
        return _sourceList.remove(vSource);
    }

    /**
     * Method removeSourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public SourceAndRoleReference removeSourceAt(
            final int index) {
        SourceAndRoleReference obj = this._sourceList.remove(index);
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
     * is asserting this particular statement. In the case of
     * ontologies that import other ontologies, this is the
     * outermost importing ontology.
     * 
     * @param assertedBy the value of field 'assertedBy'.
     */
    public void setAssertedBy(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference assertedBy) {
        this._assertedBy = assertedBy;
    }

    /**
     * Sets the value of field 'assertedIn'. The field 'assertedIn'
     * has the following description: the code system version
     * (ontology) that actually makes this statement. In the case
     * of ontologies, this is the innermost imported ontology.
     * 
     * @param assertedIn the value of field 'assertedIn'.
     */
    public void setAssertedIn(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference assertedIn) {
        this._assertedIn = assertedIn;
    }

    /**
     * Sets the value of field 'associatedAttribute'. The field
     * 'associatedAttribute' has the following description: the
     * identifier and name of the CTS2 attribute or element that
     * renders this statement, if any
     * 
     * @param associatedAttribute the value of field
     * 'associatedAttribute'.
     */
    public void setAssociatedAttribute(
            final edu.mayo.cts2.framework.model.core.ModelAttributeReference associatedAttribute) {
        this._associatedAttribute = associatedAttribute;
    }

    /**
     * Sets the value of field 'predicate'. The field 'predicate'
     * has the following description: the predicate of the
     * statement. Note that this is type URIAndEntityName as, while
     * it serves as a predicate in the statement itself it is not
     * necessary that it be formally recognized as a
     *  predicate by the CTS2 service - it may have been translated
     * or transformed by the load process.
     * 
     * @param predicate the value of field 'predicate'.
     */
    public void setPredicate(
            final edu.mayo.cts2.framework.model.core.URIAndEntityName predicate) {
        this._predicate = predicate;
    }

    /**
     * 
     * 
     * @param index
     * @param vQualifier
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setQualifier(
            final int index,
            final StatementQualifier vQualifier)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._qualifierList.size()) {
            throw new IndexOutOfBoundsException("setQualifier: Index value '" + index + "' not in range [0.." + (this._qualifierList.size() - 1) + "]");
        }

        this._qualifierList.set(index, vQualifier);
    }

    /**
     * 
     * 
     * @param vQualifierArray
     */
    public void setQualifier(
            final StatementQualifier[] vQualifierArray) {
        //-- copy array
        _qualifierList.clear();

        Collections.addAll(this._qualifierList, vQualifierArray);
    }

    /**
     * Sets the value of '_qualifierList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vQualifierList the Vector to copy.
     */
    public void setQualifier(
            final java.util.List<StatementQualifier> vQualifierList) {
        // copy vector
        this._qualifierList.clear();

        this._qualifierList.addAll(vQualifierList);
    }

    /**
     * Sets the value of '_qualifierList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param qualifierList the Vector to set.
     */
    public void setQualifierAsReference(
            final java.util.List<StatementQualifier> qualifierList) {
        this._qualifierList = qualifierList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSource
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSource(
            final int index,
            final SourceAndRoleReference vSource)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sourceList.size()) {
            throw new IndexOutOfBoundsException("setSource: Index value '" + index + "' not in range [0.." + (this._sourceList.size() - 1) + "]");
        }

        this._sourceList.set(index, vSource);
    }

    /**
     * 
     * 
     * @param vSourceArray
     */
    public void setSource(
            final SourceAndRoleReference[] vSourceArray) {
        //-- copy array
        _sourceList.clear();

        Collections.addAll(this._sourceList, vSourceArray);
    }

    /**
     * Sets the value of '_sourceList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vSourceList the Vector to copy.
     */
    public void setSource(
            final java.util.List<SourceAndRoleReference> vSourceList) {
        // copy vector
        this._sourceList.clear();

        this._sourceList.addAll(vSourceList);
    }

    /**
     * Sets the value of '_sourceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param sourceList the Vector to set.
     */
    public void setSourceAsReference(
            final java.util.List<SourceAndRoleReference> sourceList) {
        this._sourceList = sourceList;
    }

    /**
     * Sets the value of field 'statementURI'. The field
     * 'statementURI' has the following description: The unique
     * statement identifier. Must be globally unique if information
     * is to be exchanged and updated on the statement leve.
     * 
     * @param statementURI the value of field 'statementURI'.
     */
    public void setStatementURI(
            final String statementURI) {
        this._statementURI = statementURI;
    }

    /**
     * Sets the value of field 'subject'. The field 'subject' has
     * the following description: the subject of the statement -
     * either a resource or a reference to a terminological entity.
     * subject may reference a specific Association, CodeSystem,
     *  CodeSystemVersion, Map, MapEntry, MapVersion,
     * EntityDescription,
     *  ValueSet, ValueSetDefinition, ConceptDomain,
     * ConceptDomainBinding, 
     * 
     * @param subject the value of field 'subject'.
     */
    public void setSubject(
            final StatementSubject subject) {
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

    /**
     * Method unmarshalStatement.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.statement.Statement
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
