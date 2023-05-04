/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * Parameters that control the return format, number of elements
 * and amount of time that can be taken for a query to complete.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class QueryControl extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The maximum number of entries that may be present in a
     * return Directory. Note that a service may choose to return
     * less than maxToReturn entries - this is simply an upper
     * limit. If maxToReturn is not supplied, the service may use
     * whatever return block size it determines to be most
     * appropriate.
     */
    private Long _maxToReturn;

    /**
     * The maximum amount of time that may be taken to process a
     * query before a time out exception occurs. If not present,
     * the service determines the maximum query time out.
     */
    private Long _timeLimit;

    /**
     * The local identifier or URI of the return format for query
     * results.
     */
    private NameOrURI _format;

    /**
     * The local identifier or URI of the sort criteria for query
     * results.
     */
    private SortCriteria _sortCriteria;


      //----------------/
     //- Constructors -/
    //----------------/

    public QueryControl() {
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

        if (obj instanceof QueryControl) {

            QueryControl temp = (QueryControl)obj;
            if (this._maxToReturn != null) {
                if (temp._maxToReturn == null) return false;
                if (!this._maxToReturn.equals(temp._maxToReturn)) 
                    return false;
            } else if (temp._maxToReturn != null)
                return false;
            if (this._timeLimit != null) {
                if (temp._timeLimit == null) return false;
                if (!this._timeLimit.equals(temp._timeLimit)) 
                    return false;
            } else if (temp._timeLimit != null)
                return false;
            if (this._format != null) {
                if (temp._format == null) return false;
                if (!this._format.equals(temp._format)) 
                    return false;
            } else if (temp._format != null)
                return false;
            if (this._sortCriteria != null) {
                if (temp._sortCriteria == null) return false;
                return this._sortCriteria.equals(temp._sortCriteria);
            } else return temp._sortCriteria == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'format'. The field 'format' has
     * the following description: The local identifier or URI of
     * the return format for query results.
     * 
     * @return the value of field 'Format'.
     */
    public NameOrURI getFormat(
    ) {
        return this._format;
    }

    /**
     * Returns the value of field 'maxToReturn'. The field
     * 'maxToReturn' has the following description: The maximum
     * number of entries that may be present in a return Directory.
     * Note that a service may choose to return less than
     * maxToReturn entries - this is simply an upper limit. If
     * maxToReturn is not supplied, the service may use whatever
     * return block size it determines to be most appropriate.
     * 
     * @return the value of field 'MaxToReturn'.
     */
    public Long getMaxToReturn(
    ) {
        return this._maxToReturn;
    }

    /**
     * Returns the value of field 'sortCriteria'. The field
     * 'sortCriteria' has the following description: The local
     * identifier or URI of the sort criteria for query results.
     * 
     * @return the value of field 'SortCriteria'.
     */
    public SortCriteria getSortCriteria(
    ) {
        return this._sortCriteria;
    }

    /**
     * Returns the value of field 'timeLimit'. The field
     * 'timeLimit' has the following description: The maximum
     * amount of time that may be taken to process a query before a
     * time out exception occurs. If not present, the service
     * determines the maximum query time out.
     * 
     * @return the value of field 'TimeLimit'.
     */
    public Long getTimeLimit(
    ) {
        return this._timeLimit;
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
        if (_maxToReturn != null) {
           result = 37 * result + _maxToReturn.hashCode();
        }
        if (_timeLimit != null) {
           result = 37 * result + _timeLimit.hashCode();
        }
        if (_format != null) {
           result = 37 * result + _format.hashCode();
        }
        if (_sortCriteria != null) {
           result = 37 * result + _sortCriteria.hashCode();
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
     * Sets the value of field 'format'. The field 'format' has the
     * following description: The local identifier or URI of the
     * return format for query results.
     * 
     * @param format the value of field 'format'.
     */
    public void setFormat(
            final NameOrURI format) {
        this._format = format;
    }

    /**
     * Sets the value of field 'maxToReturn'. The field
     * 'maxToReturn' has the following description: The maximum
     * number of entries that may be present in a return Directory.
     * Note that a service may choose to return less than
     * maxToReturn entries - this is simply an upper limit. If
     * maxToReturn is not supplied, the service may use whatever
     * return block size it determines to be most appropriate.
     * 
     * @param maxToReturn the value of field 'maxToReturn'.
     */
    public void setMaxToReturn(
            final Long maxToReturn) {
        this._maxToReturn = maxToReturn;
    }

    /**
     * Sets the value of field 'sortCriteria'. The field
     * 'sortCriteria' has the following description: The local
     * identifier or URI of the sort criteria for query results.
     * 
     * @param sortCriteria the value of field 'sortCriteria'.
     */
    public void setSortCriteria(
            final SortCriteria sortCriteria) {
        this._sortCriteria = sortCriteria;
    }

    /**
     * Sets the value of field 'timeLimit'. The field 'timeLimit'
     * has the following description: The maximum amount of time
     * that may be taken to process a query before a time out
     * exception occurs. If not present, the service determines the
     * maximum query time out.
     * 
     * @param timeLimit the value of field 'timeLimit'.
     */
    public void setTimeLimit(
            final Long timeLimit) {
        this._timeLimit = timeLimit;
    }

    /**
     * Method unmarshalQueryControl.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.QueryControl
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
