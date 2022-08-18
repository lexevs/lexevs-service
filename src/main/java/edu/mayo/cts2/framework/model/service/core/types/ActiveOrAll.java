/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core.types;

/**
 * An indicator that determines whether the given service access
 * request applies only to elements that are currently marked as
 * ACTIVE in the context of the particular query or to both ACTIVE
 * and INACTIVE entries.
 * 
 * @version $Revision$ $Date$
 */
public enum ActiveOrAll {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ACTIVE_ONLY
     */
    ACTIVE_ONLY("ACTIVE_ONLY"),
    /**
     * Constant ACTIVE_AND_INACTIVE
     */
    ACTIVE_AND_INACTIVE("ACTIVE_AND_INACTIVE");

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
    private static final java.util.Map<String, ActiveOrAll> enumConstants = new java.util.HashMap<String, ActiveOrAll>();


    static {
        for (ActiveOrAll c: ActiveOrAll.values()) {
            ActiveOrAll.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    ActiveOrAll(final String value) {
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
    public static ActiveOrAll fromValue(
            final String value) {
        ActiveOrAll c = ActiveOrAll.enumConstants.get(value);
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
