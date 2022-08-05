/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class HistoryService extends BaseService
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _earliestChange.
     */
    private java.util.Date _earliestChange;

    /**
     * Field _latestChange.
     */
    private java.util.Date _latestChange;

    /**
     * Field _changeHistory.
     */
    private String _changeHistory;


      //----------------/
     //- Constructors -/
    //----------------/

    public HistoryService() {
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

        if (obj instanceof HistoryService) {

            HistoryService temp = (HistoryService)obj;
            if (this._earliestChange != null) {
                if (temp._earliestChange == null) return false;
                if (!this._earliestChange.equals(temp._earliestChange)) 
                    return false;
            } else if (temp._earliestChange != null)
                return false;
            if (this._latestChange != null) {
                if (temp._latestChange == null) return false;
                if (!this._latestChange.equals(temp._latestChange)) 
                    return false;
            } else if (temp._latestChange != null)
                return false;
            if (this._changeHistory != null) {
                if (temp._changeHistory == null) return false;
                return this._changeHistory.equals(temp._changeHistory);
            } else return temp._changeHistory == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeHistory'.
     * 
     * @return the value of field 'ChangeHistory'.
     */
    public String getChangeHistory(
    ) {
        return this._changeHistory;
    }

    /**
     * Returns the value of field 'earliestChange'.
     * 
     * @return the value of field 'EarliestChange'.
     */
    public java.util.Date getEarliestChange(
    ) {
        return this._earliestChange;
    }

    /**
     * Returns the value of field 'latestChange'.
     * 
     * @return the value of field 'LatestChange'.
     */
    public java.util.Date getLatestChange(
    ) {
        return this._latestChange;
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
        if (_earliestChange != null) {
           result = 37 * result + _earliestChange.hashCode();
        }
        if (_latestChange != null) {
           result = 37 * result + _latestChange.hashCode();
        }
        if (_changeHistory != null) {
           result = 37 * result + _changeHistory.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Sets the value of field 'changeHistory'.
     * 
     * @param changeHistory the value of field 'changeHistory'.
     */
    public void setChangeHistory(
            final String changeHistory) {
        this._changeHistory = changeHistory;
    }

    /**
     * Sets the value of field 'earliestChange'.
     * 
     * @param earliestChange the value of field 'earliestChange'.
     */
    public void setEarliestChange(
            final java.util.Date earliestChange) {
        this._earliestChange = earliestChange;
    }

    /**
     * Sets the value of field 'latestChange'.
     * 
     * @param latestChange the value of field 'latestChange'.
     */
    public void setLatestChange(
            final java.util.Date latestChange) {
        this._latestChange = latestChange;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
