/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * The role that a given definition plays for a given entity.
 * 
 * @version $Revision$ $Date$
 */
public enum DefinitionRole {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant NORMATIVE
     */
    NORMATIVE("NORMATIVE"),
    /**
     * Constant INFORMATIVE
     */
    INFORMATIVE("INFORMATIVE");

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
    private static final java.util.Map<String, DefinitionRole> enumConstants = new java.util.HashMap<String, DefinitionRole>();


    static {
        for (DefinitionRole c: DefinitionRole.values()) {
            DefinitionRole.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    DefinitionRole(final String value) {
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
    public static DefinitionRole fromValue(
            final String value) {
        DefinitionRole c = DefinitionRole.enumConstants.get(value);
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
