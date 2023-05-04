/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core.types;

/**
 * An indicator that determines whether an entity reference /
 * predicate combination is to be evaluated with the entity
 * reference in the source (left hand side) position of the
 * association query or the target
 *  (right hand side or "object") position.Note:
 *  AssociationDirection doesn't strictly belong in this diagram,
 * but it is kind of an orphan class and we didn't want to create
 * an entire new diagram just for one element.
 * 
 * @version $Revision$ $Date$
 */
public enum AssociationDirection {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant SOURCE_TO_TARGET
     */
    SOURCE_TO_TARGET("SOURCE_TO_TARGET"),
    /**
     * Constant TARGET_TO_SOURCE
     */
    TARGET_TO_SOURCE("TARGET_TO_SOURCE");

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
    private static final java.util.Map<String, AssociationDirection> enumConstants = new java.util.HashMap<String, AssociationDirection>();


    static {
        for (AssociationDirection c: AssociationDirection.values()) {
            AssociationDirection.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    AssociationDirection(final String value) {
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
    public static AssociationDirection fromValue(
            final String value) {
        AssociationDirection c = AssociationDirection.enumConstants.get(value);
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
