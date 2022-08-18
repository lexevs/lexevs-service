/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.association.types;

/**
 * Identifies the root of an association graph
 * 
 * @version $Revision$ $Date$
 */
public enum GraphFocus {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant SPECIFIC_ENTITY
     */
    SPECIFIC_ENTITY("SPECIFIC_ENTITY"),
    /**
     * Constant TOP_NODE
     */
    TOP_NODE("TOP_NODE"),
    /**
     * Constant BOTTOM_NODE
     */
    BOTTOM_NODE("BOTTOM_NODE");

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
    private static final java.util.Map<String, GraphFocus> enumConstants = new java.util.HashMap<String, GraphFocus>();


    static {
        for (GraphFocus c: GraphFocus.values()) {
            GraphFocus.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    GraphFocus(final String value) {
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
    public static GraphFocus fromValue(
            final String value) {
        GraphFocus c = GraphFocus.enumConstants.get(value);
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
