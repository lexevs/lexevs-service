/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.map;

import edu.mayo.cts2.framework.model.service.core.BaseQueryService;

/**
 * Class MapCatalogQueryService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapCatalogQueryService extends BaseQueryService
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _allMaps.
     */
    private String _allMaps;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapCatalogQueryService() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Overrides the java.lang.Object.equals method.
     * 
     * @param obj
     * @return true if the objects are equal.
     */
    @Override()
    public boolean equals(
            final Object obj) {
        if ( this == obj )
            return true;

        if (!super.equals(obj))
            return false;

        if (obj instanceof MapCatalogQueryService) {

            MapCatalogQueryService temp = (MapCatalogQueryService)obj;
            if (this._allMaps != null) {
                if (temp._allMaps == null) return false;
                return this._allMaps.equals(temp._allMaps);
            } else return temp._allMaps == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'allMaps'.
     * 
     * @return the value of field 'AllMaps'.
     */
    public String getAllMaps(
    ) {
        return this._allMaps;
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     * 
     * @return a hash code value for the object.
     */
    public int hashCode(
    ) {
        int result = super.hashCode();

        long tmp;
        if (_allMaps != null) {
           result = 37 * result + _allMaps.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */

    /**
     * Sets the value of field 'allMaps'.
     * 
     * @param allMaps the value of field 'allMaps'.
     */
    public void setAllMaps(
            final String allMaps) {
        this._allMaps = allMaps;
    }

    /**
     * Method unmarshalMapCatalogQueryService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.map.MapCatalogQueryService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
