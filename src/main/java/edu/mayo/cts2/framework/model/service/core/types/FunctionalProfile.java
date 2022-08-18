/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core.types;

/**
 * An enumeration of the possible functional profiles, some or all
 * of which can be implemented by a conformant CTS2 service
 * 
 * @version $Revision$ $Date$
 */
public enum FunctionalProfile {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant FP_READ
     */
    FP_READ("FP_READ"),
    /**
     * Constant FP_QUERY
     */
    FP_QUERY("FP_QUERY"),
    /**
     * Constant FP_IMPORT
     */
    FP_IMPORT("FP_IMPORT"),
    /**
     * Constant FP_EXPORT
     */
    FP_EXPORT("FP_EXPORT"),
    /**
     * Constant FP_UPDATE
     */
    FP_UPDATE("FP_UPDATE"),
    /**
     * Constant FP_MAINTENANCE
     */
    FP_MAINTENANCE("FP_MAINTENANCE"),
    /**
     * Constant FP_TEMPORAL
     */
    FP_TEMPORAL("FP_TEMPORAL");

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
    private static final java.util.Map<String, FunctionalProfile> enumConstants = new java.util.HashMap<String, FunctionalProfile>();


    static {
        for (FunctionalProfile c: FunctionalProfile.values()) {
            FunctionalProfile.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    FunctionalProfile(final String value) {
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
    public static FunctionalProfile fromValue(
            final String value) {
        FunctionalProfile c = FunctionalProfile.enumConstants.get(value);
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
