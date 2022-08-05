/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * An indicator that determines whether a Directory contains all of
 * the qualifying entries or only some.
 * 
 * @version $Revision$ $Date$
 */
public enum CompleteDirectory {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant COMPLETE
     */
    COMPLETE("COMPLETE"),
    /**
     * Constant PARTIAL
     */
    PARTIAL("PARTIAL");

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
    private static final java.util.Map<String, CompleteDirectory> enumConstants = new java.util.HashMap<String, CompleteDirectory>();


    static {
        for (CompleteDirectory c: CompleteDirectory.values()) {
            CompleteDirectory.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    CompleteDirectory(final String value) {
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
    public static CompleteDirectory fromValue(
            final String value) {
        CompleteDirectory c = CompleteDirectory.enumConstants.get(value);
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
