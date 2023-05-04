/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity.types;

/**
 * the type, from a description logic perspective, of a class
 * description
 * 
 * @version $Revision$ $Date$
 */
public enum ClassDescriptionType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant A
     */
    A("A"),
    /**
     * Constant C
     */
    C("C"),
    /**
     * Constant TOP
     */
    TOP("TOP"),
    /**
     * Constant BOTTOM
     */
    BOTTOM("BOTTOM");

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
    private static final java.util.Map<String, ClassDescriptionType> enumConstants = new java.util.HashMap<String, ClassDescriptionType>();


    static {
        for (ClassDescriptionType c: ClassDescriptionType.values()) {
            ClassDescriptionType.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    ClassDescriptionType(final String value) {
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
    public static ClassDescriptionType fromValue(
            final String value) {
        ClassDescriptionType c = ClassDescriptionType.enumConstants.get(value);
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
