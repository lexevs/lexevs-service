/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition.types;

/**
 * Indicates whether only directly associated nodes or the
 * transitive closure over the supplied predicate is to be used in
 * the resolution of an entity reference and predicate. 
 * 
 * @version $Revision$ $Date$
 */
public enum TransitiveClosure {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant DIRECTLY_ASSOCIATED
     */
    DIRECTLY_ASSOCIATED("DIRECTLY_ASSOCIATED"),
    /**
     * Constant TRANSITIVE_CLOSURE
     */
    TRANSITIVE_CLOSURE("TRANSITIVE_CLOSURE");

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
    private static final java.util.Map<String, TransitiveClosure> enumConstants = new java.util.HashMap<String, TransitiveClosure>();


    static {
        for (TransitiveClosure c: TransitiveClosure.values()) {
            TransitiveClosure.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    TransitiveClosure(final String value) {
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
    public static TransitiveClosure fromValue(
            final String value) {
        TransitiveClosure c = TransitiveClosure.enumConstants.get(value);
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
