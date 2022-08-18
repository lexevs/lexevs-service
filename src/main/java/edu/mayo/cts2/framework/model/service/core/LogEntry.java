/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * An entry in sequence of messages related to a process or task
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class LogEntry extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The time the entry was made
     */
    private java.util.Date _entryTime;

    /**
     * The text of the message
     */
    private String _message;

    /**
     * The name of the program or application that created the entry
     */
    private String _programName;

    /**
     * Field _logLevel.
     */
    private edu.mayo.cts2.framework.model.service.core.types.LoggingLevel _logLevel;

    /**
     * An external identifier that uniquely names the message.
     * ExternalURI is present to enable automated processing of log
     * entries where appropriate. The significance and use of
     * messageID is not addressed within the context of the CTS2
     * specification
     */
    private String _messageID;

    /**
     * Field _processUID.
     */
    private String _processUID;


      //----------------/
     //- Constructors -/
    //----------------/

    public LogEntry() {
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

        if (obj instanceof LogEntry) {

            LogEntry temp = (LogEntry)obj;
            if (this._entryTime != null) {
                if (temp._entryTime == null) return false;
                if (!this._entryTime.equals(temp._entryTime)) 
                    return false;
            } else if (temp._entryTime != null)
                return false;
            if (this._message != null) {
                if (temp._message == null) return false;
                if (!this._message.equals(temp._message)) 
                    return false;
            } else if (temp._message != null)
                return false;
            if (this._programName != null) {
                if (temp._programName == null) return false;
                if (!this._programName.equals(temp._programName)) 
                    return false;
            } else if (temp._programName != null)
                return false;
            if (this._logLevel != null) {
                if (temp._logLevel == null) return false;
                if (!this._logLevel.equals(temp._logLevel)) 
                    return false;
            } else if (temp._logLevel != null)
                return false;
            if (this._messageID != null) {
                if (temp._messageID == null) return false;
                if (!this._messageID.equals(temp._messageID)) 
                    return false;
            } else if (temp._messageID != null)
                return false;
            if (this._processUID != null) {
                if (temp._processUID == null) return false;
                return this._processUID.equals(temp._processUID);
            } else return temp._processUID == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'entryTime'. The field
     * 'entryTime' has the following description: The time the
     * entry was made
     * 
     * @return the value of field 'EntryTime'.
     */
    public java.util.Date getEntryTime(
    ) {
        return this._entryTime;
    }

    /**
     * Returns the value of field 'logLevel'.
     * 
     * @return the value of field 'LogLevel'.
     */
    public edu.mayo.cts2.framework.model.service.core.types.LoggingLevel getLogLevel(
    ) {
        return this._logLevel;
    }

    /**
     * Returns the value of field 'message'. The field 'message'
     * has the following description: The text of the message
     * 
     * @return the value of field 'Message'.
     */
    public String getMessage(
    ) {
        return this._message;
    }

    /**
     * Returns the value of field 'messageID'. The field
     * 'messageID' has the following description: An external
     * identifier that uniquely names the message. ExternalURI is
     * present to enable automated processing of log entries where
     * appropriate. The significance and use of messageID is not
     * addressed within the context of the CTS2 specification
     * 
     * @return the value of field 'MessageID'.
     */
    public String getMessageID(
    ) {
        return this._messageID;
    }

    /**
     * Returns the value of field 'processUID'.
     * 
     * @return the value of field 'ProcessUID'.
     */
    public String getProcessUID(
    ) {
        return this._processUID;
    }

    /**
     * Returns the value of field 'programName'. The field
     * 'programName' has the following description: The name of the
     * program or application that created the entry
     * 
     * @return the value of field 'ProgramName'.
     */
    public String getProgramName(
    ) {
        return this._programName;
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
        if (_entryTime != null) {
           result = 37 * result + _entryTime.hashCode();
        }
        if (_message != null) {
           result = 37 * result + _message.hashCode();
        }
        if (_programName != null) {
           result = 37 * result + _programName.hashCode();
        }
        if (_logLevel != null) {
           result = 37 * result + _logLevel.hashCode();
        }
        if (_messageID != null) {
           result = 37 * result + _messageID.hashCode();
        }
        if (_processUID != null) {
           result = 37 * result + _processUID.hashCode();
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
     * Sets the value of field 'entryTime'. The field 'entryTime'
     * has the following description: The time the entry was made
     * 
     * @param entryTime the value of field 'entryTime'.
     */
    public void setEntryTime(
            final java.util.Date entryTime) {
        this._entryTime = entryTime;
    }

    /**
     * Sets the value of field 'logLevel'.
     * 
     * @param logLevel the value of field 'logLevel'.
     */
    public void setLogLevel(
            final edu.mayo.cts2.framework.model.service.core.types.LoggingLevel logLevel) {
        this._logLevel = logLevel;
    }

    /**
     * Sets the value of field 'message'. The field 'message' has
     * the following description: The text of the message
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(
            final String message) {
        this._message = message;
    }

    /**
     * Sets the value of field 'messageID'. The field 'messageID'
     * has the following description: An external identifier that
     * uniquely names the message. ExternalURI is present to enable
     * automated processing of log entries where appropriate. The
     * significance and use of messageID is not addressed within
     * the context of the CTS2 specification
     * 
     * @param messageID the value of field 'messageID'.
     */
    public void setMessageID(
            final String messageID) {
        this._messageID = messageID;
    }

    /**
     * Sets the value of field 'processUID'.
     * 
     * @param processUID the value of field 'processUID'.
     */
    public void setProcessUID(
            final String processUID) {
        this._processUID = processUID;
    }

    /**
     * Sets the value of field 'programName'. The field
     * 'programName' has the following description: The name of the
     * program or application that created the entry
     * 
     * @param programName the value of field 'programName'.
     */
    public void setProgramName(
            final String programName) {
        this._programName = programName;
    }

    /**
     * Method unmarshalLogEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.LogEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
