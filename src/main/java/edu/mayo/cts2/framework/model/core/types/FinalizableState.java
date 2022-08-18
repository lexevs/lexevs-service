/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * possible states of a Finalizable resource
 * 
 * @version $Revision$ $Date$
 */
public enum FinalizableState {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant OPEN
     */
    OPEN("OPEN"),
    /**
     * Constant FINAL
     */
    FINAL("FINAL");

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
    private static final java.util.Map<String, FinalizableState> enumConstants = new java.util.HashMap<String, FinalizableState>();


    static {
        for (FinalizableState c: FinalizableState.values()) {
            FinalizableState.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    FinalizableState(final String value) {
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
    public static FinalizableState fromValue(
            final String value) {
        FinalizableState c = FinalizableState.enumConstants.get(value);
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
