/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core.types;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
public enum SyncOrAsync {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant SYNCHRONOUS
     */
    SYNCHRONOUS("SYNCHRONOUS"),
    /**
     * Constant ASYNCHRONOUS
     */
    ASYNCHRONOUS("ASYNCHRONOUS");

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
    private static final java.util.Map<String, SyncOrAsync> enumConstants = new java.util.HashMap<String, SyncOrAsync>();


    static {
        for (SyncOrAsync c: SyncOrAsync.values()) {
            SyncOrAsync.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    SyncOrAsync(final String value) {
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
    public static SyncOrAsync fromValue(
            final String value) {
        SyncOrAsync c = SyncOrAsync.enumConstants.get(value);
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
