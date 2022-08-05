/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core.types;

/**
 * Indicates what PSM(s) are supported by the given service
 * implementation.
 * 
 * @version $Revision$ $Date$
 */
public enum ImplementationProfile {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant IP_REST
     */
    IP_REST("IP_REST"),
    /**
     * Constant IP_SOAP
     */
    IP_SOAP("IP_SOAP"),
    /**
     * Constant IP_CRDF
     */
    IP_CRDF("IP_CRDF");

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
    private static final java.util.Map<String, ImplementationProfile> enumConstants = new java.util.HashMap<String, ImplementationProfile>();


    static {
        for (ImplementationProfile c: ImplementationProfile.values()) {
            ImplementationProfile.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    ImplementationProfile(final String value) {
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
    public static ImplementationProfile fromValue(
            final String value) {
        ImplementationProfile c = ImplementationProfile.enumConstants.get(value);
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
