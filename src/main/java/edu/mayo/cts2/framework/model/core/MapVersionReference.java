/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * a reference to a map version and the corresponding map, if known
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapVersionReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mapVersion.
     */
    private NameAndMeaningReference _mapVersion;

    /**
     * a reference to the corresponding map. Must be present if it
     * is known the implementing CTS2 service
     */
    private MapReference _map;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapVersionReference() {
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

        if (obj instanceof MapVersionReference) {

            MapVersionReference temp = (MapVersionReference)obj;
            if (this._mapVersion != null) {
                if (temp._mapVersion == null) return false;
                if (!this._mapVersion.equals(temp._mapVersion)) 
                    return false;
            } else if (temp._mapVersion != null)
                return false;
            if (this._map != null) {
                if (temp._map == null) return false;
                return this._map.equals(temp._map);
            } else return temp._map == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'map'. The field 'map' has the
     * following description: a reference to the corresponding map.
     * Must be present if it is known the implementing CTS2 service
     * 
     * @return the value of field 'Map'.
     */
    public MapReference getMap(
    ) {
        return this._map;
    }

    /**
     * Returns the value of field 'mapVersion'.
     * 
     * @return the value of field 'MapVersion'.
     */
    public NameAndMeaningReference getMapVersion(
    ) {
        return this._mapVersion;
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
        if (_mapVersion != null) {
           result = 37 * result + _mapVersion.hashCode();
        }
        if (_map != null) {
           result = 37 * result + _map.hashCode();
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
     * Sets the value of field 'map'. The field 'map' has the
     * following description: a reference to the corresponding map.
     * Must be present if it is known the implementing CTS2 service
     * 
     * @param map the value of field 'map'.
     */
    public void setMap(
            final MapReference map) {
        this._map = map;
    }

    /**
     * Sets the value of field 'mapVersion'.
     * 
     * @param mapVersion the value of field 'mapVersion'.
     */
    public void setMapVersion(
            final NameAndMeaningReference mapVersion) {
        this._mapVersion = mapVersion;
    }

    /**
     * Method unmarshalMapVersionReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.MapVersionReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
