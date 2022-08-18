/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core.types;

/**
 * The CTS2 specification defines eleven distinct structural
 * profiles. CTS2 compliant implementations may elect to implement
 * any combination of these profiles to meet their individual
 * requirements and use cases.
 * 
 * @version $Revision$ $Date$
 */
public enum StructuralProfile {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant SP_CODE_SYSTEM
     */
    SP_CODE_SYSTEM("SP_CODE_SYSTEM"),
    /**
     * Constant SP_CODE_SYSTEM_VERSION
     */
    SP_CODE_SYSTEM_VERSION("SP_CODE_SYSTEM_VERSION"),
    /**
     * Constant SP_ENTITY_DESCRIPTION
     */
    SP_ENTITY_DESCRIPTION("SP_ENTITY_DESCRIPTION"),
    /**
     * Constant SP_ASSOCIATION
     */
    SP_ASSOCIATION("SP_ASSOCIATION"),
    /**
     * Constant SP_VALUE_SET
     */
    SP_VALUE_SET("SP_VALUE_SET"),
    /**
     * Constant SP_VALUE_SET_DEFINITION
     */
    SP_VALUE_SET_DEFINITION("SP_VALUE_SET_DEFINITION"),
    /**
     * Constant SP_VALUE_SET_RESOLUTION
     */
    SP_VALUE_SET_RESOLUTION("SP_VALUE_SET_RESOLUTION"),
    /**
     * Constant SP_CONCEPT_DOMAIN
     */
    SP_CONCEPT_DOMAIN("SP_CONCEPT_DOMAIN"),
    /**
     * Constant SP_CONCEPT_DOMAIN_BINDING
     */
    SP_CONCEPT_DOMAIN_BINDING("SP_CONCEPT_DOMAIN_BINDING"),
    /**
     * Constant SP_MAP
     */
    SP_MAP("SP_MAP"),
    /**
     * Constant SP_MAP_VERSION
     */
    SP_MAP_VERSION("SP_MAP_VERSION"),
    /**
     * Constant SP_MAP_ENTRY
     */
    SP_MAP_ENTRY("SP_MAP_ENTRY"),
    /**
     * Constant SP_STATEMENT
     */
    SP_STATEMENT("SP_STATEMENT");

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
    private static final java.util.Map<String, StructuralProfile> enumConstants = new java.util.HashMap<String, StructuralProfile>();


    static {
        for (StructuralProfile c: StructuralProfile.values()) {
            StructuralProfile.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    StructuralProfile(final String value) {
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
    public static StructuralProfile fromValue(
            final String value) {
        StructuralProfile c = StructuralProfile.enumConstants.get(value);
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
