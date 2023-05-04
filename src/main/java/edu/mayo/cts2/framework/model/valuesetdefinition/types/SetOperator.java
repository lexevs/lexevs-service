/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition.types;

/**
 * General set operators that specify set union, difference or
 * intersection in various contexts
 * 
 * @version $Revision$ $Date$
 */
public enum SetOperator {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant UNION
     */
    UNION("UNION"),
    /**
     * Constant INTERSECT
     */
    INTERSECT("INTERSECT"),
    /**
     * Constant SUBTRACT
     */
    SUBTRACT("SUBTRACT");

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
    private static final java.util.Map<String, SetOperator> enumConstants = new java.util.HashMap<String, SetOperator>();


    static {
        for (SetOperator c: SetOperator.values()) {
            SetOperator.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    SetOperator(final String value) {
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
    public static SetOperator fromValue(
            final String value) {
        SetOperator c = SetOperator.enumConstants.get(value);
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
