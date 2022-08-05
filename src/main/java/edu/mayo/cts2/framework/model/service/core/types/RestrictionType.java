/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core.types;

/**
 * A parameter used in queries where multiple elements are
 * provided. It determines whether a candidate element must satisfy
 * all restrictions or just one or more restriction in order to be
 * considered as satisfying the restriction composite
 * 
 * @version $Revision$ $Date$
 */
public enum RestrictionType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ALL
     */
    ALL("ALL"),
    /**
     * Constant AT_LEAST_ONE
     */
    AT_LEAST_ONE("AT_LEAST_ONE");

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
    private static final java.util.Map<String, RestrictionType> enumConstants = new java.util.HashMap<String, RestrictionType>();


    static {
        for (RestrictionType c: RestrictionType.values()) {
            RestrictionType.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    RestrictionType(final String value) {
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
    public static RestrictionType fromValue(
            final String value) {
        RestrictionType c = RestrictionType.enumConstants.get(value);
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
