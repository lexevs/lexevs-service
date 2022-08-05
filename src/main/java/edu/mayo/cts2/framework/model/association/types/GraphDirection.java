/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.association.types;

/**
 * An indicator that states whether the graph represents a graph at
 * which the focus is in the subject role, the target role or both.
 * 
 * @version $Revision$ $Date$
 */
public enum GraphDirection {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant FORWARD
     */
    FORWARD("FORWARD"),
    /**
     * Constant REVERSE
     */
    REVERSE("REVERSE"),
    /**
     * Constant BOTH
     */
    BOTH("BOTH");

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
    private static final java.util.Map<String, GraphDirection> enumConstants = new java.util.HashMap<String, GraphDirection>();


    static {
        for (GraphDirection c: GraphDirection.values()) {
            GraphDirection.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    GraphDirection(final String value) {
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
    public static GraphDirection fromValue(
            final String value) {
        GraphDirection c = GraphDirection.enumConstants.get(value);
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
