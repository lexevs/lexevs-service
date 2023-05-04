/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.mapversion.types;

/**
 * An indicator that states whether processing is to continue if a
 * condition is satisfied or it is to terminate. 
 * 
 * @version $Revision$ $Date$
 */
public enum MapProcessingRule {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ALL_MATCHES
     */
    ALL_MATCHES("ALL_MATCHES"),
    /**
     * Constant FIRST_MATCH
     */
    FIRST_MATCH("FIRST_MATCH");

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
    private static final java.util.Map<String, MapProcessingRule> enumConstants = new java.util.HashMap<String, MapProcessingRule>();


    static {
        for (MapProcessingRule c: MapProcessingRule.values()) {
            MapProcessingRule.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    MapProcessingRule(final String value) {
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
    public static MapProcessingRule fromValue(
            final String value) {
        MapProcessingRule c = MapProcessingRule.enumConstants.get(value);
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
