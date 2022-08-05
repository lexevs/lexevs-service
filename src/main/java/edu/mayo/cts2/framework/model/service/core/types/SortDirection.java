/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core.types;

/**
 * The collating order of a sort.
 * 
 * @version $Revision$ $Date$
 */
public enum SortDirection {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ASCENDING
     */
    ASCENDING("ASCENDING"),
    /**
     * Constant DESCENDING
     */
    DESCENDING("DESCENDING");

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
    private static final java.util.Map<String, SortDirection> enumConstants = new java.util.HashMap<String, SortDirection>();


    static {
        for (SortDirection c: SortDirection.values()) {
            SortDirection.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    SortDirection(final String value) {
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
    public static SortDirection fromValue(
            final String value) {
        SortDirection c = SortDirection.enumConstants.get(value);
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
