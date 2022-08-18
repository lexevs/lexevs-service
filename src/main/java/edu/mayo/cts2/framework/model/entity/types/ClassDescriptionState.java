/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity.types;

/**
 * determines whether a class description is considered to consist
 * of necessary or necessary and sufficient definitions of the
 * member individuals
 * 
 * @version $Revision$ $Date$
 */
public enum ClassDescriptionState {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant PRIMITIVE
     */
    PRIMITIVE("PRIMITIVE"),
    /**
     * Constant FULLY_DEFINED
     */
    FULLY_DEFINED("FULLY_DEFINED");

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
    private static final java.util.Map<String, ClassDescriptionState> enumConstants = new java.util.HashMap<String, ClassDescriptionState>();


    static {
        for (ClassDescriptionState c: ClassDescriptionState.values()) {
            ClassDescriptionState.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    ClassDescriptionState(final String value) {
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
    public static ClassDescriptionState fromValue(
            final String value) {
        ClassDescriptionState c = ClassDescriptionState.enumConstants.get(value);
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
