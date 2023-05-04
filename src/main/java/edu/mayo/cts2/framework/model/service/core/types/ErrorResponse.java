/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core.types;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
public enum ErrorResponse {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant CONTINUE_ON_ERROR
     */
    CONTINUE_ON_ERROR("CONTINUE_ON_ERROR"),
    /**
     * Constant STOP_ON_ERROR
     */
    STOP_ON_ERROR("STOP_ON_ERROR"),
    /**
     * Constant STOP_ON_WARNING
     */
    STOP_ON_WARNING("STOP_ON_WARNING");

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
    private static final java.util.Map<String, ErrorResponse> enumConstants = new java.util.HashMap<String, ErrorResponse>();


    static {
        for (ErrorResponse c: ErrorResponse.values()) {
            ErrorResponse.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    ErrorResponse(final String value) {
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
    public static ErrorResponse fromValue(
            final String value) {
        ErrorResponse c = ErrorResponse.enumConstants.get(value);
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
