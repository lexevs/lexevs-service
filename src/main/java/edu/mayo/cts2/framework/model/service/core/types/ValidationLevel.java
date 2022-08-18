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
public enum ValidationLevel {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant VL_WARN
     */
    VL_WARN("VL_WARN"),
    /**
     * Constant VL_ERROR
     */
    VL_ERROR("VL_ERROR");

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
    private static final java.util.Map<String, ValidationLevel> enumConstants = new java.util.HashMap<String, ValidationLevel>();


    static {
        for (ValidationLevel c: ValidationLevel.values()) {
            ValidationLevel.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    ValidationLevel(final String value) {
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
    public static ValidationLevel fromValue(
            final String value) {
        ValidationLevel c = ValidationLevel.enumConstants.get(value);
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
