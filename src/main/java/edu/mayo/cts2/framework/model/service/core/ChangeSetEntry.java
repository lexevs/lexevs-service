/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * A change set URI along with the date and time it was applied to
 * a particular service implementation
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ChangeSetEntry extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
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
     * The date and time that a change set was applied to a given
     * service instance
     */
    private java.util.Date _applicationDate;

    /**
     * The URI of the change set that was applied
     */
    private String _changeSetURI;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChangeSetEntry() {
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

        if (obj instanceof ChangeSetEntry) {

            ChangeSetEntry temp = (ChangeSetEntry)obj;
            if (this._entryOrder != null) {
                if (temp._entryOrder == null) return false;
                if (!this._entryOrder.equals(temp._entryOrder)) 
                    return false;
            } else if (temp._entryOrder != null)
                return false;
            if (this._applicationDate != null) {
                if (temp._applicationDate == null) return false;
                if (!this._applicationDate.equals(temp._applicationDate)) 
                    return false;
            } else if (temp._applicationDate != null)
                return false;
            if (this._changeSetURI != null) {
                if (temp._changeSetURI == null) return false;
                return this._changeSetURI.equals(temp._changeSetURI);
            } else return temp._changeSetURI == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'applicationDate'. The field
     * 'applicationDate' has the following description: The date
     * and time that a change set was applied to a given service
     * instance
     * 
     * @return the value of field 'ApplicationDate'.
     */
    public java.util.Date getApplicationDate(
    ) {
        return this._applicationDate;
    }

    /**
     * Returns the value of field 'changeSetURI'. The field
     * 'changeSetURI' has the following description: The URI of the
     * change set that was applied
     * 
     * @return the value of field 'ChangeSetURI'.
     */
    public String getChangeSetURI(
    ) {
        return this._changeSetURI;
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
        if (_applicationDate != null) {
           result = 37 * result + _applicationDate.hashCode();
        }
        if (_changeSetURI != null) {
           result = 37 * result + _changeSetURI.hashCode();
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
     * Sets the value of field 'applicationDate'. The field
     * 'applicationDate' has the following description: The date
     * and time that a change set was applied to a given service
     * instance
     * 
     * @param applicationDate the value of field 'applicationDate'.
     */
    public void setApplicationDate(
            final java.util.Date applicationDate) {
        this._applicationDate = applicationDate;
    }

    /**
     * Sets the value of field 'changeSetURI'. The field
     * 'changeSetURI' has the following description: The URI of the
     * change set that was applied
     * 
     * @param changeSetURI the value of field 'changeSetURI'.
     */
    public void setChangeSetURI(
            final String changeSetURI) {
        this._changeSetURI = changeSetURI;
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
     * Method unmarshalChangeSetEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.ChangeSetEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
