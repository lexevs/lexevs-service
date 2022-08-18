/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

/**
 * An element of a value set definition that, when resolved yields
 * a set of entity references that are to be included in, excluded
 * from or intersected with the set of elements that represent the
 * full resolution of
 *  the definition.Note that only ACTIVE entity references are
 * included. INACTIVE entity references may never be considered for
 * inclusion or exclusion in the resolution of a value set
 * definition.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetDefinitionEntry extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * instructions for how the results of the entry evaluation
     * will be applied to the set of entities in the base
     * definition. Results can be added to the set (UNION),
     * intersected with members already in
     *  the set (INTERSECT) or be removed from the set (DIFFERENCE)
     */
    private edu.mayo.cts2.framework.model.core.types.SetOperator _operator;

    /**
     * Field _entryOrder.
     */
    private Long _entryOrder;

    /**
     * Internal choice value storage
     */
    private Object _choiceValue;

    /**
     * Field _associatedEntities.
     */
    private AssociatedEntitiesReference _associatedEntities;

    /**
     * Field _completeCodeSystem.
     */
    private CompleteCodeSystemReference _completeCodeSystem;

    /**
     * Field _completeValueSet.
     */
    private CompleteValueSetReference _completeValueSet;

    /**
     * Field _externalValueSetDefinition.
     */
    private ExternalValueSetDefinition _externalValueSetDefinition;

    /**
     * Field _propertyQuery.
     */
    private PropertyQueryReference _propertyQuery;

    /**
     * Field _entityList.
     */
    private SpecificEntityList _entityList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetDefinitionEntry() {
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

        if (obj instanceof ValueSetDefinitionEntry) {

            ValueSetDefinitionEntry temp = (ValueSetDefinitionEntry)obj;
            if (this._operator != null) {
                if (temp._operator == null) return false;
                if (!this._operator.equals(temp._operator)) 
                    return false;
            } else if (temp._operator != null)
                return false;
            if (this._entryOrder != null) {
                if (temp._entryOrder == null) return false;
                if (!this._entryOrder.equals(temp._entryOrder)) 
                    return false;
            } else if (temp._entryOrder != null)
                return false;
            if (this._choiceValue != null) {
                if (temp._choiceValue == null) return false;
                if (!this._choiceValue.equals(temp._choiceValue)) 
                    return false;
            } else if (temp._choiceValue != null)
                return false;
            if (this._associatedEntities != null) {
                if (temp._associatedEntities == null) return false;
                if (!this._associatedEntities.equals(temp._associatedEntities)) 
                    return false;
            } else if (temp._associatedEntities != null)
                return false;
            if (this._completeCodeSystem != null) {
                if (temp._completeCodeSystem == null) return false;
                if (!this._completeCodeSystem.equals(temp._completeCodeSystem)) 
                    return false;
            } else if (temp._completeCodeSystem != null)
                return false;
            if (this._completeValueSet != null) {
                if (temp._completeValueSet == null) return false;
                if (!this._completeValueSet.equals(temp._completeValueSet)) 
                    return false;
            } else if (temp._completeValueSet != null)
                return false;
            if (this._externalValueSetDefinition != null) {
                if (temp._externalValueSetDefinition == null) return false;
                if (!this._externalValueSetDefinition.equals(temp._externalValueSetDefinition)) 
                    return false;
            } else if (temp._externalValueSetDefinition != null)
                return false;
            if (this._propertyQuery != null) {
                if (temp._propertyQuery == null) return false;
                if (!this._propertyQuery.equals(temp._propertyQuery)) 
                    return false;
            } else if (temp._propertyQuery != null)
                return false;
            if (this._entityList != null) {
                if (temp._entityList == null) return false;
                return this._entityList.equals(temp._entityList);
            } else return temp._entityList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'associatedEntities'.
     * 
     * @return the value of field 'AssociatedEntities'.
     */
    public AssociatedEntitiesReference getAssociatedEntities(
    ) {
        return this._associatedEntities;
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
     * Returns the value of field 'completeCodeSystem'.
     * 
     * @return the value of field 'CompleteCodeSystem'.
     */
    public CompleteCodeSystemReference getCompleteCodeSystem(
    ) {
        return this._completeCodeSystem;
    }

    /**
     * Returns the value of field 'completeValueSet'.
     * 
     * @return the value of field 'CompleteValueSet'.
     */
    public CompleteValueSetReference getCompleteValueSet(
    ) {
        return this._completeValueSet;
    }

    /**
     * Returns the value of field 'entityList'.
     * 
     * @return the value of field 'EntityList'.
     */
    public SpecificEntityList getEntityList(
    ) {
        return this._entityList;
    }

    /**
     * Returns the value of field 'entryOrder'.
     * 
     * @return the value of field 'EntryOrder'.
     */
    public Long getEntryOrder(
    ) {
        return this._entryOrder;
    }

    /**
     * Returns the value of field 'externalValueSetDefinition'.
     * 
     * @return the value of field 'ExternalValueSetDefinition'.
     */
    public ExternalValueSetDefinition getExternalValueSetDefinition(
    ) {
        return this._externalValueSetDefinition;
    }

    /**
     * Returns the value of field 'operator'. The field 'operator'
     * has the following description: instructions for how the
     * results of the entry evaluation will be applied to the set
     * of entities in the base definition. Results can be added to
     * the set (UNION), intersected with members already in
     *  the set (INTERSECT) or be removed from the set (DIFFERENCE)
     * 
     * @return the value of field 'Operator'.
     */
    public edu.mayo.cts2.framework.model.core.types.SetOperator getOperator(
    ) {
        return this._operator;
    }

    /**
     * Returns the value of field 'propertyQuery'.
     * 
     * @return the value of field 'PropertyQuery'.
     */
    public PropertyQueryReference getPropertyQuery(
    ) {
        return this._propertyQuery;
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
        if (_operator != null) {
           result = 37 * result + _operator.hashCode();
        }
        if (_entryOrder != null) {
           result = 37 * result + _entryOrder.hashCode();
        }
        if (_choiceValue != null) {
           result = 37 * result + _choiceValue.hashCode();
        }
        if (_associatedEntities != null) {
           result = 37 * result + _associatedEntities.hashCode();
        }
        if (_completeCodeSystem != null) {
           result = 37 * result + _completeCodeSystem.hashCode();
        }
        if (_completeValueSet != null) {
           result = 37 * result + _completeValueSet.hashCode();
        }
        if (_externalValueSetDefinition != null) {
           result = 37 * result + _externalValueSetDefinition.hashCode();
        }
        if (_propertyQuery != null) {
           result = 37 * result + _propertyQuery.hashCode();
        }
        if (_entityList != null) {
           result = 37 * result + _entityList.hashCode();
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
     * Sets the value of field 'associatedEntities'.
     * 
     * @param associatedEntities the value of field
     * 'associatedEntities'.
     */
    public void setAssociatedEntities(
            final AssociatedEntitiesReference associatedEntities) {
        this._associatedEntities = associatedEntities;
        this._choiceValue = associatedEntities;
    }

    /**
     * Sets the value of field 'completeCodeSystem'.
     * 
     * @param completeCodeSystem the value of field
     * 'completeCodeSystem'.
     */
    public void setCompleteCodeSystem(
            final CompleteCodeSystemReference completeCodeSystem) {
        this._completeCodeSystem = completeCodeSystem;
        this._choiceValue = completeCodeSystem;
    }

    /**
     * Sets the value of field 'completeValueSet'.
     * 
     * @param completeValueSet the value of field 'completeValueSet'
     */
    public void setCompleteValueSet(
            final CompleteValueSetReference completeValueSet) {
        this._completeValueSet = completeValueSet;
        this._choiceValue = completeValueSet;
    }

    /**
     * Sets the value of field 'entityList'.
     * 
     * @param entityList the value of field 'entityList'.
     */
    public void setEntityList(
            final SpecificEntityList entityList) {
        this._entityList = entityList;
        this._choiceValue = entityList;
    }

    /**
     * Sets the value of field 'entryOrder'.
     * 
     * @param entryOrder the value of field 'entryOrder'.
     */
    public void setEntryOrder(
            final Long entryOrder) {
        this._entryOrder = entryOrder;
    }

    /**
     * Sets the value of field 'externalValueSetDefinition'.
     * 
     * @param externalValueSetDefinition the value of field
     * 'externalValueSetDefinition'.
     */
    public void setExternalValueSetDefinition(
            final ExternalValueSetDefinition externalValueSetDefinition) {
        this._externalValueSetDefinition = externalValueSetDefinition;
        this._choiceValue = externalValueSetDefinition;
    }

    /**
     * Sets the value of field 'operator'. The field 'operator' has
     * the following description: instructions for how the results
     * of the entry evaluation will be applied to the set of
     * entities in the base definition. Results can be added to the
     * set (UNION), intersected with members already in
     *  the set (INTERSECT) or be removed from the set (DIFFERENCE)
     * 
     * @param operator the value of field 'operator'.
     */
    public void setOperator(
            final edu.mayo.cts2.framework.model.core.types.SetOperator operator) {
        this._operator = operator;
    }

    /**
     * Sets the value of field 'propertyQuery'.
     * 
     * @param propertyQuery the value of field 'propertyQuery'.
     */
    public void setPropertyQuery(
            final PropertyQueryReference propertyQuery) {
        this._propertyQuery = propertyQuery;
        this._choiceValue = propertyQuery;
    }

    /**
     * Method unmarshalValueSetDefinitionEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.ValueSetDefinitionEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
