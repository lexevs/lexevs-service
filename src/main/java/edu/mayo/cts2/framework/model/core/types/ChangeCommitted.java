/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * the commitment state of an individual change
 * 
 * @version $Revision$ $Date$
 */
public enum ChangeCommitted {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant PENDING
     */
    PENDING("PENDING"),
    /**
     * Constant COMMITTED
     */
    COMMITTED("COMMITTED");

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
    private static final java.util.Map<String, ChangeCommitted> enumConstants = new java.util.HashMap<String, ChangeCommitted>();


    static {
        for (ChangeCommitted c: ChangeCommitted.values()) {
            ChangeCommitted.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    ChangeCommitted(final String value) {
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
    public static ChangeCommitted fromValue(
            final String value) {
        ChangeCommitted c = ChangeCommitted.enumConstants.get(value);
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
