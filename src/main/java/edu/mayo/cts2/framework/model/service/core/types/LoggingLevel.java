/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core.types;

/**
 * The LoggingLevel entries are modeled after the corresponding
 * levels in the Apache log4j package. As with the log4j package,
 * each level includes the entries in the lower level. In
 * particular, levels are ordered. For the standard levels, we have
 * DEBUG &lt; INFO &lt; WARN &lt; ERROR &lt; FATAL.
 * 
 * @version $Revision$ $Date$
 */
public enum LoggingLevel {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant DEBUG
     */
    DEBUG("DEBUG"),
    /**
     * Constant INFO
     */
    INFO("INFO"),
    /**
     * Constant WARN
     */
    WARN("WARN"),
    /**
     * Constant ERROR
     */
    ERROR("ERROR"),
    /**
     * Constant FATAL
     */
    FATAL("FATAL");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<String, LoggingLevel> enumConstants = new java.util.HashMap<String, LoggingLevel>();


    static {
        for (LoggingLevel c: LoggingLevel.values()) {
            LoggingLevel.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    LoggingLevel(final String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static LoggingLevel fromValue(
            final String value) {
        LoggingLevel c = LoggingLevel.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public String value(
    ) {
        return this.value;
    }

}
