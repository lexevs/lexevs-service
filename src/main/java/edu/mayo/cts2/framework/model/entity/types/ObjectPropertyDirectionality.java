/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity.types;

/**
 * indicates whether the semantics of an object property are
 * unidirectional (i.e. $\lnot r(a,b) \implies r(b,a)$ or
 * bidirectional ($r(a,b) \implies r(b,a)$). 
 * 
 * @version $Revision$ $Date$
 */
public enum ObjectPropertyDirectionality {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant UNIDIRECTIONAL
     */
    UNIDIRECTIONAL("UNIDIRECTIONAL"),
    /**
     * Constant BIDIRECTIONAL
     */
    BIDIRECTIONAL("BIDIRECTIONAL");

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
    private static final java.util.Map<String, ObjectPropertyDirectionality> enumConstants = new java.util.HashMap<String, ObjectPropertyDirectionality>();


    static {
        for (ObjectPropertyDirectionality c: ObjectPropertyDirectionality.values()) {
            ObjectPropertyDirectionality.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    ObjectPropertyDirectionality(final String value) {
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
    public static ObjectPropertyDirectionality fromValue(
            final String value) {
        ObjectPropertyDirectionality c = ObjectPropertyDirectionality.enumConstants.get(value);
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
