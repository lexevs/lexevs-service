/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.service.core.types.ActiveOrAll;

/**
 * The context that controls the behavior of a read or query. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ReadContext extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Determines whether the query only applies to only active or
     * all entries. 
     */
    private ActiveOrAll _active = ActiveOrAll.fromValue("ACTIVE_ONLY");

    /**
     * The spoken or written language that should be used for the
     * results of the inquiry, where appropriate.
     */
    private NameOrURI _referenceLanguage;

    /**
     * The URI of an open change set whose contents should be
     * included in the results of the access request.
     * changeSetContext is only applicable in services that support
     * the Authoring profile
     */
    private String _changeSetContext;

    /**
     * The contextual date and time of the query. referenceTime is
     * may only be present in services that support the Temporal
     * profile.
     */
    private java.util.Date _referenceTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReadContext() {
        super();
        setActive(ActiveOrAll.fromValue("ACTIVE_ONLY"));
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

        if (obj instanceof ReadContext) {

            ReadContext temp = (ReadContext)obj;
            if (this._active != null) {
                if (temp._active == null) return false;
                if (!this._active.equals(temp._active)) 
                    return false;
            } else if (temp._active != null)
                return false;
            if (this._referenceLanguage != null) {
                if (temp._referenceLanguage == null) return false;
                if (!this._referenceLanguage.equals(temp._referenceLanguage)) 
                    return false;
            } else if (temp._referenceLanguage != null)
                return false;
            if (this._changeSetContext != null) {
                if (temp._changeSetContext == null) return false;
                if (!this._changeSetContext.equals(temp._changeSetContext)) 
                    return false;
            } else if (temp._changeSetContext != null)
                return false;
            if (this._referenceTime != null) {
                if (temp._referenceTime == null) return false;
                return this._referenceTime.equals(temp._referenceTime);
            } else return temp._referenceTime == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'active'. The field 'active' has
     * the following description: Determines whether the query only
     * applies to only active or all entries. 
     * 
     * @return the value of field 'Active'.
     */
    public ActiveOrAll getActive(
    ) {
        return this._active;
    }

    /**
     * Returns the value of field 'changeSetContext'. The field
     * 'changeSetContext' has the following description: The URI of
     * an open change set whose contents should be included in the
     * results of the access request. changeSetContext is only
     * applicable in services that support the Authoring profile
     * 
     * @return the value of field 'ChangeSetContext'.
     */
    public String getChangeSetContext(
    ) {
        return this._changeSetContext;
    }

    /**
     * Returns the value of field 'referenceLanguage'. The field
     * 'referenceLanguage' has the following description: The
     * spoken or written language that should be used for the
     * results of the inquiry, where appropriate.
     * 
     * @return the value of field 'ReferenceLanguage'.
     */
    public NameOrURI getReferenceLanguage(
    ) {
        return this._referenceLanguage;
    }

    /**
     * Returns the value of field 'referenceTime'. The field
     * 'referenceTime' has the following description: The
     * contextual date and time of the query. referenceTime is may
     * only be present in services that support the Temporal
     * profile.
     * 
     * @return the value of field 'ReferenceTime'.
     */
    public java.util.Date getReferenceTime(
    ) {
        return this._referenceTime;
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
        if (_active != null) {
           result = 37 * result + _active.hashCode();
        }
        if (_referenceLanguage != null) {
           result = 37 * result + _referenceLanguage.hashCode();
        }
        if (_changeSetContext != null) {
           result = 37 * result + _changeSetContext.hashCode();
        }
        if (_referenceTime != null) {
           result = 37 * result + _referenceTime.hashCode();
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
     * Sets the value of field 'active'. The field 'active' has the
     * following description: Determines whether the query only
     * applies to only active or all entries. 
     * 
     * @param active the value of field 'active'.
     */
    public void setActive(
            final ActiveOrAll active) {
        this._active = active;
    }

    /**
     * Sets the value of field 'changeSetContext'. The field
     * 'changeSetContext' has the following description: The URI of
     * an open change set whose contents should be included in the
     * results of the access request. changeSetContext is only
     * applicable in services that support the Authoring profile
     * 
     * @param changeSetContext the value of field 'changeSetContext'
     */
    public void setChangeSetContext(
            final String changeSetContext) {
        this._changeSetContext = changeSetContext;
    }

    /**
     * Sets the value of field 'referenceLanguage'. The field
     * 'referenceLanguage' has the following description: The
     * spoken or written language that should be used for the
     * results of the inquiry, where appropriate.
     * 
     * @param referenceLanguage the value of field
     * 'referenceLanguage'.
     */
    public void setReferenceLanguage(
            final NameOrURI referenceLanguage) {
        this._referenceLanguage = referenceLanguage;
    }

    /**
     * Sets the value of field 'referenceTime'. The field
     * 'referenceTime' has the following description: The
     * contextual date and time of the query. referenceTime is may
     * only be present in services that support the Temporal
     * profile.
     * 
     * @param referenceTime the value of field 'referenceTime'.
     */
    public void setReferenceTime(
            final java.util.Date referenceTime) {
        this._referenceTime = referenceTime;
    }

    /**
     * Method unmarshalReadContext.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.ReadContext
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
