/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition.types;

/**
 * Indicates whether intermediate nodes in a transitive closure are
 * to be included in the result or only the "leaf" nodes.
 * 
 * @version $Revision$ $Date$
 */
public enum LeafOrAll {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant LEAF_ONLY
     */
    LEAF_ONLY("LEAF_ONLY"),
    /**
     * Constant ALL_INTERMEDIATE_NODES
     */
    ALL_INTERMEDIATE_NODES("ALL_INTERMEDIATE_NODES");

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
    private static final java.util.Map<String, LeafOrAll> enumConstants = new java.util.HashMap<String, LeafOrAll>();


    static {
        for (LeafOrAll c: LeafOrAll.values()) {
            LeafOrAll.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    LeafOrAll(final String value) {
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
    public static LeafOrAll fromValue(
            final String value) {
        LeafOrAll c = LeafOrAll.enumConstants.get(value);
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
