/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.mapversion;

/**
 * A rule / target entry in a MapSet. The entries in a MapSet are
 * evaluated in entry order. For each entry, rule is evaluated. If
 * rule returns FALSE, then evaluation moves on to
 *  the next MapTarget in the set. If rule returns TRUE, the
 * MapTarget is returned as a qualifying map in the associated
 * MapSet and corresponding MapEntry. The setting of processingRule
 *  in the MapSet determines whether subsequent MapTargets are
 * evaluated. If processingRule is set to FIRST_MATCH, the first
 * matching MapTarget terminates the evaluation of the
 *  MapSet. If processingRule is set to ALL_MATCHES, then
 * processing continues until all MapTargets in the set have been
 * evaluated.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapTarget extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an identifier assigned to this particular source/set/target
     * tuple by an outside body
     */
    private String _externalEntryId;

    /**
     * Field _entryOrder.
     */
    private Long _entryOrder;

    /**
     * a predicate of some sort that can be used to determine
     * whether this entry meets the mapping criteria. If absent,
     * the mapping is considered unconditional.
     */
    private MapRule _rule;

    /**
     * the target entity to be used if the rule is satisfied. If
     * not present, the assumption is that the source entity maps
     * to nothing in this set / rule
     */
    private edu.mayo.cts2.framework.model.core.URIAndEntityName _mapTo;

    /**
     * a description of the resulting rule. Can be used to carry
     * text to instruct human beings how to do the mapping as well
     * as additional machine readable instructions.
     */
    private edu.mayo.cts2.framework.model.core.OpaqueData _targetDescription;

    /**
     * a formal expression that, when interpreted, results in the
     * map target. This expression could carry an RDF fragment, an
     * expression in the SNOMED-CT compositional grammar or
     * something
     *  else.
     */
    private edu.mayo.cts2.framework.model.core.EntityExpression _targetExpression;

    /**
     * a reference to how well the mapping correlates. Example
     * correlations might be Exact, not mappable, partial overlap,
     * narrower than, etc.
     */
    private edu.mayo.cts2.framework.model.core.MapCorrelationReference _correlation;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapTarget() {
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

        if (obj instanceof MapTarget) {

            MapTarget temp = (MapTarget)obj;
            if (this._externalEntryId != null) {
                if (temp._externalEntryId == null) return false;
                if (!this._externalEntryId.equals(temp._externalEntryId)) 
                    return false;
            } else if (temp._externalEntryId != null)
                return false;
            if (this._entryOrder != null) {
                if (temp._entryOrder == null) return false;
                if (!this._entryOrder.equals(temp._entryOrder)) 
                    return false;
            } else if (temp._entryOrder != null)
                return false;
            if (this._rule != null) {
                if (temp._rule == null) return false;
                if (!this._rule.equals(temp._rule)) 
                    return false;
            } else if (temp._rule != null)
                return false;
            if (this._mapTo != null) {
                if (temp._mapTo == null) return false;
                if (!this._mapTo.equals(temp._mapTo)) 
                    return false;
            } else if (temp._mapTo != null)
                return false;
            if (this._targetDescription != null) {
                if (temp._targetDescription == null) return false;
                if (!this._targetDescription.equals(temp._targetDescription)) 
                    return false;
            } else if (temp._targetDescription != null)
                return false;
            if (this._targetExpression != null) {
                if (temp._targetExpression == null) return false;
                if (!this._targetExpression.equals(temp._targetExpression)) 
                    return false;
            } else if (temp._targetExpression != null)
                return false;
            if (this._correlation != null) {
                if (temp._correlation == null) return false;
                return this._correlation.equals(temp._correlation);
            } else return temp._correlation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'correlation'. The field
     * 'correlation' has the following description: a reference to
     * how well the mapping correlates. Example correlations might
     * be Exact, not mappable, partial overlap, narrower than, etc.
     * 
     * @return the value of field 'Correlation'.
     */
    public edu.mayo.cts2.framework.model.core.MapCorrelationReference getCorrelation(
    ) {
        return this._correlation;
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
     * Returns the value of field 'externalEntryId'. The field
     * 'externalEntryId' has the following description: an
     * identifier assigned to this particular source/set/target
     * tuple by an outside body
     * 
     * @return the value of field 'ExternalEntryId'.
     */
    public String getExternalEntryId(
    ) {
        return this._externalEntryId;
    }

    /**
     * Returns the value of field 'mapTo'. The field 'mapTo' has
     * the following description: the target entity to be used if
     * the rule is satisfied. If not present, the assumption is
     * that the source entity maps to nothing in this set / rule
     * 
     * @return the value of field 'MapTo'.
     */
    public edu.mayo.cts2.framework.model.core.URIAndEntityName getMapTo(
    ) {
        return this._mapTo;
    }

    /**
     * Returns the value of field 'rule'. The field 'rule' has the
     * following description: a predicate of some sort that can be
     * used to determine whether this entry meets the mapping
     * criteria. If absent, the mapping is considered
     * unconditional.
     * 
     * @return the value of field 'Rule'.
     */
    public MapRule getRule(
    ) {
        return this._rule;
    }

    /**
     * Returns the value of field 'targetDescription'. The field
     * 'targetDescription' has the following description: a
     * description of the resulting rule. Can be used to carry text
     * to instruct human beings how to do the mapping as well as
     * additional machine readable instructions.
     * 
     * @return the value of field 'TargetDescription'.
     */
    public edu.mayo.cts2.framework.model.core.OpaqueData getTargetDescription(
    ) {
        return this._targetDescription;
    }

    /**
     * Returns the value of field 'targetExpression'. The field
     * 'targetExpression' has the following description: a formal
     * expression that, when interpreted, results in the map
     * target. This expression could carry an RDF fragment, an
     * expression in the SNOMED-CT compositional grammar or
     * something
     *  else.
     * 
     * @return the value of field 'TargetExpression'.
     */
    public edu.mayo.cts2.framework.model.core.EntityExpression getTargetExpression(
    ) {
        return this._targetExpression;
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
        if (_externalEntryId != null) {
           result = 37 * result + _externalEntryId.hashCode();
        }
        if (_entryOrder != null) {
           result = 37 * result + _entryOrder.hashCode();
        }
        if (_rule != null) {
           result = 37 * result + _rule.hashCode();
        }
        if (_mapTo != null) {
           result = 37 * result + _mapTo.hashCode();
        }
        if (_targetDescription != null) {
           result = 37 * result + _targetDescription.hashCode();
        }
        if (_targetExpression != null) {
           result = 37 * result + _targetExpression.hashCode();
        }
        if (_correlation != null) {
           result = 37 * result + _correlation.hashCode();
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
     * Sets the value of field 'correlation'. The field
     * 'correlation' has the following description: a reference to
     * how well the mapping correlates. Example correlations might
     * be Exact, not mappable, partial overlap, narrower than, etc.
     * 
     * @param correlation the value of field 'correlation'.
     */
    public void setCorrelation(
            final edu.mayo.cts2.framework.model.core.MapCorrelationReference correlation) {
        this._correlation = correlation;
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
     * Sets the value of field 'externalEntryId'. The field
     * 'externalEntryId' has the following description: an
     * identifier assigned to this particular source/set/target
     * tuple by an outside body
     * 
     * @param externalEntryId the value of field 'externalEntryId'.
     */
    public void setExternalEntryId(
            final String externalEntryId) {
        this._externalEntryId = externalEntryId;
    }

    /**
     * Sets the value of field 'mapTo'. The field 'mapTo' has the
     * following description: the target entity to be used if the
     * rule is satisfied. If not present, the assumption is that
     * the source entity maps to nothing in this set / rule
     * 
     * @param mapTo the value of field 'mapTo'.
     */
    public void setMapTo(
            final edu.mayo.cts2.framework.model.core.URIAndEntityName mapTo) {
        this._mapTo = mapTo;
    }

    /**
     * Sets the value of field 'rule'. The field 'rule' has the
     * following description: a predicate of some sort that can be
     * used to determine whether this entry meets the mapping
     * criteria. If absent, the mapping is considered
     * unconditional.
     * 
     * @param rule the value of field 'rule'.
     */
    public void setRule(
            final MapRule rule) {
        this._rule = rule;
    }

    /**
     * Sets the value of field 'targetDescription'. The field
     * 'targetDescription' has the following description: a
     * description of the resulting rule. Can be used to carry text
     * to instruct human beings how to do the mapping as well as
     * additional machine readable instructions.
     * 
     * @param targetDescription the value of field
     * 'targetDescription'.
     */
    public void setTargetDescription(
            final edu.mayo.cts2.framework.model.core.OpaqueData targetDescription) {
        this._targetDescription = targetDescription;
    }

    /**
     * Sets the value of field 'targetExpression'. The field
     * 'targetExpression' has the following description: a formal
     * expression that, when interpreted, results in the map
     * target. This expression could carry an RDF fragment, an
     * expression in the SNOMED-CT compositional grammar or
     * something
     *  else.
     * 
     * @param targetExpression the value of field 'targetExpression'
     */
    public void setTargetExpression(
            final edu.mayo.cts2.framework.model.core.EntityExpression targetExpression) {
        this._targetExpression = targetExpression;
    }

    /**
     * Method unmarshalMapTarget.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.mapversion.MapTarget
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
