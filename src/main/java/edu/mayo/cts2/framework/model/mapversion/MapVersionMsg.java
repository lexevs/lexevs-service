/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.mapversion;

/**
 * A MapVersion read from a service instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapVersionMsg extends edu.mayo.cts2.framework.model.core.Message 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mapVersion.
     */
    private MapVersion _mapVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapVersionMsg() {
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

        if (obj instanceof MapVersionMsg) {

            MapVersionMsg temp = (MapVersionMsg)obj;
            if (this._mapVersion != null) {
                if (temp._mapVersion == null) return false;
                return this._mapVersion.equals(temp._mapVersion);
            } else return temp._mapVersion == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'mapVersion'.
     * 
     * @return the value of field 'MapVersion'.
     */
    public MapVersion getMapVersion(
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
     * Sets the value of field 'mapVersion'.
     * 
     * @param mapVersion the value of field 'mapVersion'.
     */
    public void setMapVersion(
            final MapVersion mapVersion) {
        this._mapVersion = mapVersion;
    }

    /**
     * Method unmarshalMapVersionMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.mapversion.MapVersionMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
