/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity.types;

/**
 * The role that a designation plays in respect to the referenced
 * Entity. DesignationRole is intended to convey the same semantics
 * as the three types of SKOS Label - skos:prefLabel (PREFERRED),
 * skos:altLabel (ALTERNATIVE) and skos:hiddenLabel (HIDDEN). The
 * SKOS consistency rules with respect to
 *  preferred labels also apply to designation with two
 * exceptions:(1) There can be more than one preferred label for
 * the same language if the usageContext is different(2) If the
 * service implementation supports structured
 *  data, it is possible to have more than one preferred label for
 * the same language and context as long as each has a different
 * format.
 * 
 * @version $Revision$ $Date$
 */
public enum DesignationRole {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant PREFERRED
     */
    PREFERRED("PREFERRED"),
    /**
     * Constant ALTERNATIVE
     */
    ALTERNATIVE("ALTERNATIVE"),
    /**
     * Constant HIDDEN
     */
    HIDDEN("HIDDEN");

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
    private static final java.util.Map<String, DesignationRole> enumConstants = new java.util.HashMap<String, DesignationRole>();


    static {
        for (DesignationRole c: DesignationRole.values()) {
            DesignationRole.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    DesignationRole(final String value) {
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
    public static DesignationRole fromValue(
            final String value) {
        DesignationRole c = DesignationRole.enumConstants.get(value);
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
