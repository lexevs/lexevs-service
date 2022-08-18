/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.association.types;

/**
 * The derivation of a given statement - whether it is directly
 * asserted by the source, is derived by the application of a
 * reasoner or is unknown because the reasoner or source does not
 * supply such
 *  information.
 * 
 * @version $Revision$ $Date$
 */
public enum AssociationDerivation {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ASSERTED
     */
    ASSERTED("ASSERTED"),
    /**
     * Constant INFERRED
     */
    INFERRED("INFERRED");

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
    private static final java.util.Map<String, AssociationDerivation> enumConstants = new java.util.HashMap<String, AssociationDerivation>();


    static {
        for (AssociationDerivation c: AssociationDerivation.values()) {
            AssociationDerivation.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    AssociationDerivation(final String value) {
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
    public static AssociationDerivation fromValue(
            final String value) {
        AssociationDerivation c = AssociationDerivation.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final String value) {
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
