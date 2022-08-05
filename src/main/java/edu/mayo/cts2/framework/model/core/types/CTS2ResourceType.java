/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * the resource types that can be described in a CTS2 service
 * 
 * @version $Revision$ $Date$
 */
public enum CTS2ResourceType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant CODE_SYSTEM
     */
    CODE_SYSTEM("CODE_SYSTEM"),
    /**
     * Constant CODE_SYSTEM_VERSION
     */
    CODE_SYSTEM_VERSION("CODE_SYSTEM_VERSION"),
    /**
     * Constant CONCEPT_DOMAIN
     */
    CONCEPT_DOMAIN("CONCEPT_DOMAIN"),
    /**
     * Constant MAP
     */
    MAP("MAP"),
    /**
     * Constant MAP_VERSION
     */
    MAP_VERSION("MAP_VERSION"),
    /**
     * Constant VALUE_SET
     */
    VALUE_SET("VALUE_SET"),
    /**
     * Constant VALUE_SET_DEFINITION
     */
    VALUE_SET_DEFINITION("VALUE_SET_DEFINITION");

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
    private static final java.util.Map<String, CTS2ResourceType> enumConstants = new java.util.HashMap<String, CTS2ResourceType>();


    static {
        for (CTS2ResourceType c: CTS2ResourceType.values()) {
            CTS2ResourceType.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    CTS2ResourceType(final String value) {
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
    public static CTS2ResourceType fromValue(
            final String value) {
        CTS2ResourceType c = CTS2ResourceType.enumConstants.get(value);
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
