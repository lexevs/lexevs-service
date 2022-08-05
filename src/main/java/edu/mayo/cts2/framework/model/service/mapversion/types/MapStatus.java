/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapversion.types;

/**
 * An indicator that determines whether all referencs...
 * 
 * @version $Revision$ $Date$
 */
public enum MapStatus {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant UNMAPPED
     */
    UNMAPPED("UNMAPPED"),
    /**
     * Constant NOMAP
     */
    NOMAP("NOMAP"),
    /**
     * Constant MAPPED
     */
    MAPPED("MAPPED"),
    /**
     * Constant ALLMAPENTRIES
     */
    ALLMAPENTRIES("ALLMAPENTRIES");

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
    private static final java.util.Map<String, MapStatus> enumConstants = new java.util.HashMap<String, MapStatus>();


    static {
        for (MapStatus c: MapStatus.values()) {
            MapStatus.enumConstants.put(c.value, c);
        }

    }


    //----------------/
     //- Constructors -/
    //----------------/

    MapStatus(final String value) {
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
    public static MapStatus fromValue(
            final String value) {
        MapStatus c = MapStatus.enumConstants.get(value);
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
