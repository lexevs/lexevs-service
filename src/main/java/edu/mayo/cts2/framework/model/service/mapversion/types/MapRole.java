/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapversion.types;

/**
 * An indicator that determines whether the "from", the "to" or
 * both components of a Map or MapVersion are being queried.
 * 
 * @version $Revision$ $Date$
 */
public enum MapRole {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant MAP_FROM_ROLE
     */
    MAP_FROM_ROLE("MAP_FROM_ROLE"),
    /**
     * Constant MAP_TO_ROLE
     */
    MAP_TO_ROLE("MAP_TO_ROLE"),
    /**
     * Constant BOTH_MAP_ROLES
     */
    BOTH_MAP_ROLES("BOTH_MAP_ROLES");

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
    private static final java.util.Map<String, MapRole> enumConstants = new java.util.HashMap<String, MapRole>();


    static {
        for (MapRole c: MapRole.values()) {
            MapRole.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    MapRole(final String value) {
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
    public static MapRole fromValue(
            final String value) {
        MapRole c = MapRole.enumConstants.get(value);
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
