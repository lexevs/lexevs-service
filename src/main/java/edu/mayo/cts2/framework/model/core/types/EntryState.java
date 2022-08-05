/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * the current state of the Changeable element. Note that
 * entryState represents the state of the element itself - not the
 * state of a given change. The applicability of a given change is
 *  identified by its effectiveDate, not entryState.
 * 
 * @version $Revision$ $Date$
 */
public enum EntryState {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant INACTIVE
     */
    INACTIVE("INACTIVE"),
    /**
     * Constant ACTIVE
     */
    ACTIVE("ACTIVE");

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
    private static final java.util.Map<String, EntryState> enumConstants = new java.util.HashMap<String, EntryState>();


    static {
        for (EntryState c: EntryState.values()) {
            EntryState.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    EntryState(final String value) {
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
    public static EntryState fromValue(
            final String value) {
        EntryState c = EntryState.enumConstants.get(value);
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
