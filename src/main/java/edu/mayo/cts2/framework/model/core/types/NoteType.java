/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * Enumeration NoteType.
 * 
 * @version $Revision$ $Date$
 */
public enum NoteType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant CHANGENOTE
     */
    CHANGENOTE("ChangeNote"),
    /**
     * Constant EDITORIALNOTE
     */
    EDITORIALNOTE("EditorialNote"),
    /**
     * Constant HISTORYNOTE
     */
    HISTORYNOTE("HistoryNote"),
    /**
     * Constant SCOPENOTE
     */
    SCOPENOTE("ScopeNote"),
    /**
     * Constant NOTE
     */
    NOTE("Note");

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
    private static final java.util.Map<String, NoteType> enumConstants = new java.util.HashMap<String, NoteType>();


    static {
        for (NoteType c: NoteType.values()) {
            NoteType.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    NoteType(final String value) {
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
    public static NoteType fromValue(
            final String value) {
        NoteType c = NoteType.enumConstants.get(value);
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
