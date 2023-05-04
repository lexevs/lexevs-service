/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import java.util.Collections;

/**
 * The state of a running or completed load or export process.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ProcessStatus extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A message summarizing the final results of the process
     */
    private String _completionMessage;

    /**
     * The date and time that the process finished execution if it
     * isn't still running
     */
    private java.util.Date _endTime;

    /**
     * The number of errors (LoggingLevel = ERROR or FATAL)
     * encountered by the process so far
     */
    private Long _numErrors;

    /**
     * The number of warnings (LoggingLevel = WARN) encountered by
     * the process so far
     */
    private Long _numWarnings;

    /**
     * The date and time that the process began execution
     */
    private java.util.Date _startTime;

    /**
     * The set of log records created by the process
     */
    private java.util.List<LogEntry> _logList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProcessStatus() {
        super();
        this._logList = new java.util.ArrayList<LogEntry>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLog
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLog(
            final LogEntry vLog)
    throws IndexOutOfBoundsException {
        this._logList.add(vLog);
    }

    /**
     * 
     * 
     * @param index
     * @param vLog
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLog(
            final int index,
            final LogEntry vLog)
    throws IndexOutOfBoundsException {
        this._logList.add(index, vLog);
    }

    /**
     * Method enumerateLog.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends LogEntry> enumerateLog(
    ) {
        return Collections.enumeration(this._logList);
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

        if (obj instanceof ProcessStatus) {

            ProcessStatus temp = (ProcessStatus)obj;
            if (this._completionMessage != null) {
                if (temp._completionMessage == null) return false;
                if (!this._completionMessage.equals(temp._completionMessage)) 
                    return false;
            } else if (temp._completionMessage != null)
                return false;
            if (this._endTime != null) {
                if (temp._endTime == null) return false;
                if (!this._endTime.equals(temp._endTime)) 
                    return false;
            } else if (temp._endTime != null)
                return false;
            if (this._numErrors != null) {
                if (temp._numErrors == null) return false;
                if (!this._numErrors.equals(temp._numErrors)) 
                    return false;
            } else if (temp._numErrors != null)
                return false;
            if (this._numWarnings != null) {
                if (temp._numWarnings == null) return false;
                if (!this._numWarnings.equals(temp._numWarnings)) 
                    return false;
            } else if (temp._numWarnings != null)
                return false;
            if (this._startTime != null) {
                if (temp._startTime == null) return false;
                if (!this._startTime.equals(temp._startTime)) 
                    return false;
            } else if (temp._startTime != null)
                return false;
            if (this._logList != null) {
                if (temp._logList == null) return false;
                return this._logList.equals(temp._logList);
            } else return temp._logList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'completionMessage'. The field
     * 'completionMessage' has the following description: A message
     * summarizing the final results of the process
     * 
     * @return the value of field 'CompletionMessage'.
     */
    public String getCompletionMessage(
    ) {
        return this._completionMessage;
    }

    /**
     * Returns the value of field 'endTime'. The field 'endTime'
     * has the following description: The date and time that the
     * process finished execution if it isn't still running
     * 
     * @return the value of field 'EndTime'.
     */
    public java.util.Date getEndTime(
    ) {
        return this._endTime;
    }

    /**
     * Method getLog.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.service.core.LogEntry at the
     * given index
     */
    public LogEntry getLog(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._logList.size()) {
            throw new IndexOutOfBoundsException("getLog: Index value '" + index + "' not in range [0.." + (this._logList.size() - 1) + "]");
        }

        return _logList.get(index);
    }

    /**
     * Method getLog.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public LogEntry[] getLog(
    ) {
        LogEntry[] array = new LogEntry[0];
        return this._logList.toArray(array);
    }

    /**
     * Method getLogAsReference.Returns a reference to '_logList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<LogEntry> getLogAsReference(
    ) {
        return this._logList;
    }

    /**
     * Method getLogCount.
     * 
     * @return the size of this collection
     */
    public int getLogCount(
    ) {
        return this._logList.size();
    }

    /**
     * Returns the value of field 'numErrors'. The field
     * 'numErrors' has the following description: The number of
     * errors (LoggingLevel = ERROR or FATAL) encountered by the
     * process so far
     * 
     * @return the value of field 'NumErrors'.
     */
    public Long getNumErrors(
    ) {
        return this._numErrors;
    }

    /**
     * Returns the value of field 'numWarnings'. The field
     * 'numWarnings' has the following description: The number of
     * warnings (LoggingLevel = WARN) encountered by the process so
     * far
     * 
     * @return the value of field 'NumWarnings'.
     */
    public Long getNumWarnings(
    ) {
        return this._numWarnings;
    }

    /**
     * Returns the value of field 'startTime'. The field
     * 'startTime' has the following description: The date and time
     * that the process began execution
     * 
     * @return the value of field 'StartTime'.
     */
    public java.util.Date getStartTime(
    ) {
        return this._startTime;
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
        if (_completionMessage != null) {
           result = 37 * result + _completionMessage.hashCode();
        }
        if (_endTime != null) {
           result = 37 * result + _endTime.hashCode();
        }
        if (_numErrors != null) {
           result = 37 * result + _numErrors.hashCode();
        }
        if (_numWarnings != null) {
           result = 37 * result + _numWarnings.hashCode();
        }
        if (_startTime != null) {
           result = 37 * result + _startTime.hashCode();
        }
        if (_logList != null) {
           result = 37 * result + _logList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateLog.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends LogEntry> iterateLog(
    ) {
        return this._logList.iterator();
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
    public void removeAllLog(
    ) {
        this._logList.clear();
    }

    /**
     * Method removeLog.
     * 
     * @param vLog
     * @return true if the object was removed from the collection.
     */
    public boolean removeLog(
            final LogEntry vLog) {
        return _logList.remove(vLog);
    }

    /**
     * Method removeLogAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public LogEntry removeLogAt(
            final int index) {
        LogEntry obj = this._logList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'completionMessage'. The field
     * 'completionMessage' has the following description: A message
     * summarizing the final results of the process
     * 
     * @param completionMessage the value of field
     * 'completionMessage'.
     */
    public void setCompletionMessage(
            final String completionMessage) {
        this._completionMessage = completionMessage;
    }

    /**
     * Sets the value of field 'endTime'. The field 'endTime' has
     * the following description: The date and time that the
     * process finished execution if it isn't still running
     * 
     * @param endTime the value of field 'endTime'.
     */
    public void setEndTime(
            final java.util.Date endTime) {
        this._endTime = endTime;
    }

    /**
     * 
     * 
     * @param index
     * @param vLog
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLog(
            final int index,
            final LogEntry vLog)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._logList.size()) {
            throw new IndexOutOfBoundsException("setLog: Index value '" + index + "' not in range [0.." + (this._logList.size() - 1) + "]");
        }

        this._logList.set(index, vLog);
    }

    /**
     * 
     * 
     * @param vLogArray
     */
    public void setLog(
            final LogEntry[] vLogArray) {
        //-- copy array
        _logList.clear();

        Collections.addAll(this._logList, vLogArray);
    }

    /**
     * Sets the value of '_logList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vLogList the Vector to copy.
     */
    public void setLog(
            final java.util.List<LogEntry> vLogList) {
        // copy vector
        this._logList.clear();

        this._logList.addAll(vLogList);
    }

    /**
     * Sets the value of '_logList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param logList the Vector to set.
     */
    public void setLogAsReference(
            final java.util.List<LogEntry> logList) {
        this._logList = logList;
    }

    /**
     * Sets the value of field 'numErrors'. The field 'numErrors'
     * has the following description: The number of errors
     * (LoggingLevel = ERROR or FATAL) encountered by the process
     * so far
     * 
     * @param numErrors the value of field 'numErrors'.
     */
    public void setNumErrors(
            final Long numErrors) {
        this._numErrors = numErrors;
    }

    /**
     * Sets the value of field 'numWarnings'. The field
     * 'numWarnings' has the following description: The number of
     * warnings (LoggingLevel = WARN) encountered by the process so
     * far
     * 
     * @param numWarnings the value of field 'numWarnings'.
     */
    public void setNumWarnings(
            final Long numWarnings) {
        this._numWarnings = numWarnings;
    }

    /**
     * Sets the value of field 'startTime'. The field 'startTime'
     * has the following description: The date and time that the
     * process began execution
     * 
     * @param startTime the value of field 'startTime'.
     */
    public void setStartTime(
            final java.util.Date startTime) {
        this._startTime = startTime;
    }

    /**
     * Method unmarshalProcessStatus.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.ProcessStatus
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
