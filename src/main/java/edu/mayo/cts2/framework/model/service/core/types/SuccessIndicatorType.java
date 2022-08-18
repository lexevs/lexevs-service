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
public enum SuccessIndicatorType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant SUCCESS
     */
    SUCCESS("SUCCESS"),
    /**
     * Constant FAILURE
     */
    FAILURE("FAILURE");

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
    private static final java.util.Map<String, SuccessIndicatorType> enumConstants = new java.util.HashMap<String, SuccessIndicatorType>();


    static {
        for (SuccessIndicatorType c: SuccessIndicatorType.values()) {
            SuccessIndicatorType.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    SuccessIndicatorType(final String value) {
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
    public static SuccessIndicatorType fromValue(
            final String value) {
        SuccessIndicatorType c = SuccessIndicatorType.enumConstants.get(value);
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
