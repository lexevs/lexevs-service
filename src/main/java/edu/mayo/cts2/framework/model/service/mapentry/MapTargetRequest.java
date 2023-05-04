/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

/**
 * A set of parameters that are used to create or
 *  update a map target
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapTargetRequest extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedCorrelation.
     */
    private UpdatedCorrelation _updatedCorrelation;

    /**
     * Field _updatedExternalEntryId.
     */
    private UpdatedExternalEntryId _updatedExternalEntryId;

    /**
     * Field _updatedMapRule.
     */
    private UpdatedMapRule _updatedMapRule;

    /**
     * Field _updatedMapTo.
     */
    private UpdatedMapTo _updatedMapTo;

    /**
     * Field _updatedTargetDescription.
     */
    private UpdatedTargetDescription _updatedTargetDescription;

    /**
     * Field _updatedTargetExpression.
     */
    private UpdatedTargetExpression _updatedTargetExpression;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapTargetRequest() {
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

        if (obj instanceof MapTargetRequest) {

            MapTargetRequest temp = (MapTargetRequest)obj;
            if (this._updatedCorrelation != null) {
                if (temp._updatedCorrelation == null) return false;
                if (!this._updatedCorrelation.equals(temp._updatedCorrelation)) 
                    return false;
            } else if (temp._updatedCorrelation != null)
                return false;
            if (this._updatedExternalEntryId != null) {
                if (temp._updatedExternalEntryId == null) return false;
                if (!this._updatedExternalEntryId.equals(temp._updatedExternalEntryId)) 
                    return false;
            } else if (temp._updatedExternalEntryId != null)
                return false;
            if (this._updatedMapRule != null) {
                if (temp._updatedMapRule == null) return false;
                if (!this._updatedMapRule.equals(temp._updatedMapRule)) 
                    return false;
            } else if (temp._updatedMapRule != null)
                return false;
            if (this._updatedMapTo != null) {
                if (temp._updatedMapTo == null) return false;
                if (!this._updatedMapTo.equals(temp._updatedMapTo)) 
                    return false;
            } else if (temp._updatedMapTo != null)
                return false;
            if (this._updatedTargetDescription != null) {
                if (temp._updatedTargetDescription == null) return false;
                if (!this._updatedTargetDescription.equals(temp._updatedTargetDescription)) 
                    return false;
            } else if (temp._updatedTargetDescription != null)
                return false;
            if (this._updatedTargetExpression != null) {
                if (temp._updatedTargetExpression == null) return false;
                return this._updatedTargetExpression.equals(temp._updatedTargetExpression);
            } else return temp._updatedTargetExpression == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedCorrelation'.
     * 
     * @return the value of field 'UpdatedCorrelation'.
     */
    public UpdatedCorrelation getUpdatedCorrelation(
    ) {
        return this._updatedCorrelation;
    }

    /**
     * Returns the value of field 'updatedExternalEntryId'.
     * 
     * @return the value of field 'UpdatedExternalEntryId'.
     */
    public UpdatedExternalEntryId getUpdatedExternalEntryId(
    ) {
        return this._updatedExternalEntryId;
    }

    /**
     * Returns the value of field 'updatedMapRule'.
     * 
     * @return the value of field 'UpdatedMapRule'.
     */
    public UpdatedMapRule getUpdatedMapRule(
    ) {
        return this._updatedMapRule;
    }

    /**
     * Returns the value of field 'updatedMapTo'.
     * 
     * @return the value of field 'UpdatedMapTo'.
     */
    public UpdatedMapTo getUpdatedMapTo(
    ) {
        return this._updatedMapTo;
    }

    /**
     * Returns the value of field 'updatedTargetDescription'.
     * 
     * @return the value of field 'UpdatedTargetDescription'.
     */
    public UpdatedTargetDescription getUpdatedTargetDescription(
    ) {
        return this._updatedTargetDescription;
    }

    /**
     * Returns the value of field 'updatedTargetExpression'.
     * 
     * @return the value of field 'UpdatedTargetExpression'.
     */
    public UpdatedTargetExpression getUpdatedTargetExpression(
    ) {
        return this._updatedTargetExpression;
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
        if (_updatedCorrelation != null) {
           result = 37 * result + _updatedCorrelation.hashCode();
        }
        if (_updatedExternalEntryId != null) {
           result = 37 * result + _updatedExternalEntryId.hashCode();
        }
        if (_updatedMapRule != null) {
           result = 37 * result + _updatedMapRule.hashCode();
        }
        if (_updatedMapTo != null) {
           result = 37 * result + _updatedMapTo.hashCode();
        }
        if (_updatedTargetDescription != null) {
           result = 37 * result + _updatedTargetDescription.hashCode();
        }
        if (_updatedTargetExpression != null) {
           result = 37 * result + _updatedTargetExpression.hashCode();
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
     * Sets the value of field 'updatedCorrelation'.
     * 
     * @param updatedCorrelation the value of field
     * 'updatedCorrelation'.
     */
    public void setUpdatedCorrelation(
            final UpdatedCorrelation updatedCorrelation) {
        this._updatedCorrelation = updatedCorrelation;
    }

    /**
     * Sets the value of field 'updatedExternalEntryId'.
     * 
     * @param updatedExternalEntryId the value of field
     * 'updatedExternalEntryId'.
     */
    public void setUpdatedExternalEntryId(
            final UpdatedExternalEntryId updatedExternalEntryId) {
        this._updatedExternalEntryId = updatedExternalEntryId;
    }

    /**
     * Sets the value of field 'updatedMapRule'.
     * 
     * @param updatedMapRule the value of field 'updatedMapRule'.
     */
    public void setUpdatedMapRule(
            final UpdatedMapRule updatedMapRule) {
        this._updatedMapRule = updatedMapRule;
    }

    /**
     * Sets the value of field 'updatedMapTo'.
     * 
     * @param updatedMapTo the value of field 'updatedMapTo'.
     */
    public void setUpdatedMapTo(
            final UpdatedMapTo updatedMapTo) {
        this._updatedMapTo = updatedMapTo;
    }

    /**
     * Sets the value of field 'updatedTargetDescription'.
     * 
     * @param updatedTargetDescription the value of field
     * 'updatedTargetDescription'.
     */
    public void setUpdatedTargetDescription(
            final UpdatedTargetDescription updatedTargetDescription) {
        this._updatedTargetDescription = updatedTargetDescription;
    }

    /**
     * Sets the value of field 'updatedTargetExpression'.
     * 
     * @param updatedTargetExpression the value of field
     * 'updatedTargetExpression'.
     */
    public void setUpdatedTargetExpression(
            final UpdatedTargetExpression updatedTargetExpression) {
        this._updatedTargetExpression = updatedTargetExpression;
    }

    /**
     * Method unmarshalMapTargetRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.MapTargetRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
