/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.updates;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ChangeableResource extends edu.mayo.cts2.framework.model.core.AbstractIsChangeableChoice 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _entryOrder.
     */
    private Long _entryOrder;

    /**
     * Internal choice value storage
     */
    private Object _choiceValue;

    /**
     * Field _association.
     */
    private edu.mayo.cts2.framework.model.association.Association _association;

    /**
     * Field _codeSystem.
     */
    private edu.mayo.cts2.framework.model.codesystem.CodeSystemCatalogEntry _codeSystem;

    /**
     * Field _codeSystemVersion.
     */
    private edu.mayo.cts2.framework.model.codesystemversion.CodeSystemVersionCatalogEntry _codeSystemVersion;

    /**
     * Field _conceptDomain.
     */
    private edu.mayo.cts2.framework.model.conceptdomain.ConceptDomainCatalogEntry _conceptDomain;

    /**
     * Field _conceptDomainBinding.
     */
    private edu.mayo.cts2.framework.model.conceptdomainbinding.ConceptDomainBinding _conceptDomainBinding;

    /**
     * Field _entityDescription.
     */
    private edu.mayo.cts2.framework.model.entity.EntityDescription _entityDescription;

    /**
     * Field _map.
     */
    private edu.mayo.cts2.framework.model.map.MapCatalogEntry _map;

    /**
     * Field _mapVersion.
     */
    private edu.mayo.cts2.framework.model.mapversion.MapVersion _mapVersion;

    /**
     * Field _mapEntry.
     */
    private edu.mayo.cts2.framework.model.mapversion.MapEntry _mapEntry;

    /**
     * Field _statement.
     */
    private edu.mayo.cts2.framework.model.statement.Statement _statement;

    /**
     * Field _valueSet.
     */
    private edu.mayo.cts2.framework.model.valueset.ValueSetCatalogEntry _valueSet;

    /**
     * Field _valueSetDefinition.
     */
    private edu.mayo.cts2.framework.model.valuesetdefinition.ValueSetDefinition _valueSetDefinition;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChangeableResource() {
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

        if (obj instanceof ChangeableResource) {

            ChangeableResource temp = (ChangeableResource)obj;
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
            if (this._association != null) {
                if (temp._association == null) return false;
                if (!this._association.equals(temp._association)) 
                    return false;
            } else if (temp._association != null)
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
            if (this._conceptDomain != null) {
                if (temp._conceptDomain == null) return false;
                if (!this._conceptDomain.equals(temp._conceptDomain)) 
                    return false;
            } else if (temp._conceptDomain != null)
                return false;
            if (this._conceptDomainBinding != null) {
                if (temp._conceptDomainBinding == null) return false;
                if (!this._conceptDomainBinding.equals(temp._conceptDomainBinding)) 
                    return false;
            } else if (temp._conceptDomainBinding != null)
                return false;
            if (this._entityDescription != null) {
                if (temp._entityDescription == null) return false;
                if (!this._entityDescription.equals(temp._entityDescription)) 
                    return false;
            } else if (temp._entityDescription != null)
                return false;
            if (this._map != null) {
                if (temp._map == null) return false;
                if (!this._map.equals(temp._map)) 
                    return false;
            } else if (temp._map != null)
                return false;
            if (this._mapVersion != null) {
                if (temp._mapVersion == null) return false;
                if (!this._mapVersion.equals(temp._mapVersion)) 
                    return false;
            } else if (temp._mapVersion != null)
                return false;
            if (this._mapEntry != null) {
                if (temp._mapEntry == null) return false;
                if (!this._mapEntry.equals(temp._mapEntry)) 
                    return false;
            } else if (temp._mapEntry != null)
                return false;
            if (this._statement != null) {
                if (temp._statement == null) return false;
                if (!this._statement.equals(temp._statement)) 
                    return false;
            } else if (temp._statement != null)
                return false;
            if (this._valueSet != null) {
                if (temp._valueSet == null) return false;
                if (!this._valueSet.equals(temp._valueSet)) 
                    return false;
            } else if (temp._valueSet != null)
                return false;
            if (this._valueSetDefinition != null) {
                if (temp._valueSetDefinition == null) return false;
                return this._valueSetDefinition.equals(temp._valueSetDefinition);
            } else return temp._valueSetDefinition == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'association'.
     * 
     * @return the value of field 'Association'.
     */
    public edu.mayo.cts2.framework.model.association.Association getAssociation(
    ) {
        return this._association;
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
     * Returns the value of field 'codeSystem'.
     * 
     * @return the value of field 'CodeSystem'.
     */
    public edu.mayo.cts2.framework.model.codesystem.CodeSystemCatalogEntry getCodeSystem(
    ) {
        return this._codeSystem;
    }

    /**
     * Returns the value of field 'codeSystemVersion'.
     * 
     * @return the value of field 'CodeSystemVersion'.
     */
    public edu.mayo.cts2.framework.model.codesystemversion.CodeSystemVersionCatalogEntry getCodeSystemVersion(
    ) {
        return this._codeSystemVersion;
    }

    /**
     * Returns the value of field 'conceptDomain'.
     * 
     * @return the value of field 'ConceptDomain'.
     */
    public edu.mayo.cts2.framework.model.conceptdomain.ConceptDomainCatalogEntry getConceptDomain(
    ) {
        return this._conceptDomain;
    }

    /**
     * Returns the value of field 'conceptDomainBinding'.
     * 
     * @return the value of field 'ConceptDomainBinding'.
     */
    public edu.mayo.cts2.framework.model.conceptdomainbinding.ConceptDomainBinding getConceptDomainBinding(
    ) {
        return this._conceptDomainBinding;
    }

    /**
     * Returns the value of field 'entityDescription'.
     * 
     * @return the value of field 'EntityDescription'.
     */
    public edu.mayo.cts2.framework.model.entity.EntityDescription getEntityDescription(
    ) {
        return this._entityDescription;
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
     * Returns the value of field 'map'.
     * 
     * @return the value of field 'Map'.
     */
    public edu.mayo.cts2.framework.model.map.MapCatalogEntry getMap(
    ) {
        return this._map;
    }

    /**
     * Returns the value of field 'mapEntry'.
     * 
     * @return the value of field 'MapEntry'.
     */
    public edu.mayo.cts2.framework.model.mapversion.MapEntry getMapEntry(
    ) {
        return this._mapEntry;
    }

    /**
     * Returns the value of field 'mapVersion'.
     * 
     * @return the value of field 'MapVersion'.
     */
    public edu.mayo.cts2.framework.model.mapversion.MapVersion getMapVersion(
    ) {
        return this._mapVersion;
    }

    /**
     * Returns the value of field 'statement'.
     * 
     * @return the value of field 'Statement'.
     */
    public edu.mayo.cts2.framework.model.statement.Statement getStatement(
    ) {
        return this._statement;
    }

    /**
     * Returns the value of field 'valueSet'.
     * 
     * @return the value of field 'ValueSet'.
     */
    public edu.mayo.cts2.framework.model.valueset.ValueSetCatalogEntry getValueSet(
    ) {
        return this._valueSet;
    }

    /**
     * Returns the value of field 'valueSetDefinition'.
     * 
     * @return the value of field 'ValueSetDefinition'.
     */
    public edu.mayo.cts2.framework.model.valuesetdefinition.ValueSetDefinition getValueSetDefinition(
    ) {
        return this._valueSetDefinition;
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
        if (_entryOrder != null) {
           result = 37 * result + _entryOrder.hashCode();
        }
        if (_choiceValue != null) {
           result = 37 * result + _choiceValue.hashCode();
        }
        if (_association != null) {
           result = 37 * result + _association.hashCode();
        }
        if (_codeSystem != null) {
           result = 37 * result + _codeSystem.hashCode();
        }
        if (_codeSystemVersion != null) {
           result = 37 * result + _codeSystemVersion.hashCode();
        }
        if (_conceptDomain != null) {
           result = 37 * result + _conceptDomain.hashCode();
        }
        if (_conceptDomainBinding != null) {
           result = 37 * result + _conceptDomainBinding.hashCode();
        }
        if (_entityDescription != null) {
           result = 37 * result + _entityDescription.hashCode();
        }
        if (_map != null) {
           result = 37 * result + _map.hashCode();
        }
        if (_mapVersion != null) {
           result = 37 * result + _mapVersion.hashCode();
        }
        if (_mapEntry != null) {
           result = 37 * result + _mapEntry.hashCode();
        }
        if (_statement != null) {
           result = 37 * result + _statement.hashCode();
        }
        if (_valueSet != null) {
           result = 37 * result + _valueSet.hashCode();
        }
        if (_valueSetDefinition != null) {
           result = 37 * result + _valueSetDefinition.hashCode();
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
     * Sets the value of field 'association'.
     * 
     * @param association the value of field 'association'.
     */
    public void setAssociation(
            final edu.mayo.cts2.framework.model.association.Association association) {
        this._association = association;
        this._choiceValue = association;
    }

    /**
     * Sets the value of field 'codeSystem'.
     * 
     * @param codeSystem the value of field 'codeSystem'.
     */
    public void setCodeSystem(
            final edu.mayo.cts2.framework.model.codesystem.CodeSystemCatalogEntry codeSystem) {
        this._codeSystem = codeSystem;
        this._choiceValue = codeSystem;
    }

    /**
     * Sets the value of field 'codeSystemVersion'.
     * 
     * @param codeSystemVersion the value of field
     * 'codeSystemVersion'.
     */
    public void setCodeSystemVersion(
            final edu.mayo.cts2.framework.model.codesystemversion.CodeSystemVersionCatalogEntry codeSystemVersion) {
        this._codeSystemVersion = codeSystemVersion;
        this._choiceValue = codeSystemVersion;
    }

    /**
     * Sets the value of field 'conceptDomain'.
     * 
     * @param conceptDomain the value of field 'conceptDomain'.
     */
    public void setConceptDomain(
            final edu.mayo.cts2.framework.model.conceptdomain.ConceptDomainCatalogEntry conceptDomain) {
        this._conceptDomain = conceptDomain;
        this._choiceValue = conceptDomain;
    }

    /**
     * Sets the value of field 'conceptDomainBinding'.
     * 
     * @param conceptDomainBinding the value of field
     * 'conceptDomainBinding'.
     */
    public void setConceptDomainBinding(
            final edu.mayo.cts2.framework.model.conceptdomainbinding.ConceptDomainBinding conceptDomainBinding) {
        this._conceptDomainBinding = conceptDomainBinding;
        this._choiceValue = conceptDomainBinding;
    }

    /**
     * Sets the value of field 'entityDescription'.
     * 
     * @param entityDescription the value of field
     * 'entityDescription'.
     */
    public void setEntityDescription(
            final edu.mayo.cts2.framework.model.entity.EntityDescription entityDescription) {
        this._entityDescription = entityDescription;
        this._choiceValue = entityDescription;
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
     * Sets the value of field 'map'.
     * 
     * @param map the value of field 'map'.
     */
    public void setMap(
            final edu.mayo.cts2.framework.model.map.MapCatalogEntry map) {
        this._map = map;
        this._choiceValue = map;
    }

    /**
     * Sets the value of field 'mapEntry'.
     * 
     * @param mapEntry the value of field 'mapEntry'.
     */
    public void setMapEntry(
            final edu.mayo.cts2.framework.model.mapversion.MapEntry mapEntry) {
        this._mapEntry = mapEntry;
        this._choiceValue = mapEntry;
    }

    /**
     * Sets the value of field 'mapVersion'.
     * 
     * @param mapVersion the value of field 'mapVersion'.
     */
    public void setMapVersion(
            final edu.mayo.cts2.framework.model.mapversion.MapVersion mapVersion) {
        this._mapVersion = mapVersion;
        this._choiceValue = mapVersion;
    }

    /**
     * Sets the value of field 'statement'.
     * 
     * @param statement the value of field 'statement'.
     */
    public void setStatement(
            final edu.mayo.cts2.framework.model.statement.Statement statement) {
        this._statement = statement;
        this._choiceValue = statement;
    }

    /**
     * Sets the value of field 'valueSet'.
     * 
     * @param valueSet the value of field 'valueSet'.
     */
    public void setValueSet(
            final edu.mayo.cts2.framework.model.valueset.ValueSetCatalogEntry valueSet) {
        this._valueSet = valueSet;
        this._choiceValue = valueSet;
    }

    /**
     * Sets the value of field 'valueSetDefinition'.
     * 
     * @param valueSetDefinition the value of field
     * 'valueSetDefinition'.
     */
    public void setValueSetDefinition(
            final edu.mayo.cts2.framework.model.valuesetdefinition.ValueSetDefinition valueSetDefinition) {
        this._valueSetDefinition = valueSetDefinition;
        this._choiceValue = valueSetDefinition;
    }

    /**
     * Method unmarshalChangeableResource.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.updates.ChangeableResource
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
