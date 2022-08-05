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
public enum OverwriteRule {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant OVERWRITE_IF_EXISTS
     */
    OVERWRITE_IF_EXISTS("OVERWRITE_IF_EXISTS"),
    /**
     * Constant FAIL_IF_EXISTS
     */
    FAIL_IF_EXISTS("FAIL_IF_EXISTS");

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
    private static final java.util.Map<String, OverwriteRule> enumConstants = new java.util.HashMap<String, OverwriteRule>();


    static {
        for (OverwriteRule c: OverwriteRule.values()) {
            OverwriteRule.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    OverwriteRule(final String value) {
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
    public static OverwriteRule fromValue(
            final String value) {
        OverwriteRule c = OverwriteRule.enumConstants.get(value);
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
