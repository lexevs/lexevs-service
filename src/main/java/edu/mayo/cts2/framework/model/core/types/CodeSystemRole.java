/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * The role that a code system plays in the definition or
 * description of an entity.
 * 
 * @version $Revision$ $Date$
 */
public enum CodeSystemRole {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant PRIMARY
     */
    PRIMARY("PRIMARY"),
    /**
     * Constant SECONDARY
     */
    SECONDARY("SECONDARY");

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
    private static final java.util.Map<String, CodeSystemRole> enumConstants = new java.util.HashMap<String, CodeSystemRole>();


    static {
        for (CodeSystemRole c: CodeSystemRole.values()) {
            CodeSystemRole.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    CodeSystemRole(final String value) {
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
    public static CodeSystemRole fromValue(
            final String value) {
        CodeSystemRole c = CodeSystemRole.enumConstants.get(value);
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
