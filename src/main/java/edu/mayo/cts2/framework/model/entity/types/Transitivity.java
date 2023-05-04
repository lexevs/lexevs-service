/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity.types;

/**
 * an indicator that determines whether an object property is
 * considered to be transitive
 * 
 * @version $Revision$ $Date$
 */
public enum Transitivity {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant TRANSITIVE
     */
    TRANSITIVE("TRANSITIVE"),
    /**
     * Constant INTRANSITIVE
     */
    INTRANSITIVE("INTRANSITIVE"),
    /**
     * Constant ANTITRANSITIVE
     */
    ANTITRANSITIVE("ANTITRANSITIVE");

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
    private static final java.util.Map<String, Transitivity> enumConstants = new java.util.HashMap<String, Transitivity>();


    static {
        for (Transitivity c: Transitivity.values()) {
            Transitivity.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    Transitivity(final String value) {
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
    public static Transitivity fromValue(
            final String value) {
        Transitivity c = Transitivity.enumConstants.get(value);
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
