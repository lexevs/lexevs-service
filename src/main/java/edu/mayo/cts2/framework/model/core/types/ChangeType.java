/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * An indicator that shows the type of change that occurred that
 * transformed a Changeable element from its immediately previous
 * state to the state that the ChangeType is associated
 *  with.
 * 
 * @version $Revision$ $Date$
 */
public enum ChangeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant CREATE
     */
    CREATE("CREATE"),
    /**
     * Constant UPDATE
     */
    UPDATE("UPDATE"),
    /**
     * Constant METADATA
     */
    METADATA("METADATA"),
    /**
     * Constant DELETE
     */
    DELETE("DELETE"),
    /**
     * Constant CLONE
     */
    CLONE("CLONE"),
    /**
     * Constant IMPORT
     */
    IMPORT("IMPORT");

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
    private static final java.util.Map<String, ChangeType> enumConstants = new java.util.HashMap<String, ChangeType>();


    static {
        for (ChangeType c: ChangeType.values()) {
            ChangeType.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    ChangeType(final String value) {
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
    public static ChangeType fromValue(
            final String value) {
        ChangeType c = ChangeType.enumConstants.get(value);
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
