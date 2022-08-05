/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

import edu.mayo.cts2.framework.model.core.Message;

/**
 * An ordered list of map targets 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapTargetListMsg extends Message
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mapTargetList.
     */
    private MapTargetList _mapTargetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapTargetListMsg() {
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

        if (obj instanceof MapTargetListMsg) {

            MapTargetListMsg temp = (MapTargetListMsg)obj;
            if (this._mapTargetList != null) {
                if (temp._mapTargetList == null) return false;
                return this._mapTargetList.equals(temp._mapTargetList);
            } else return temp._mapTargetList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'mapTargetList'.
     * 
     * @return the value of field 'MapTargetList'.
     */
    public MapTargetList getMapTargetList(
    ) {
        return this._mapTargetList;
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
        if (_mapTargetList != null) {
           result = 37 * result + _mapTargetList.hashCode();
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
     * Sets the value of field 'mapTargetList'.
     * 
     * @param mapTargetList the value of field 'mapTargetList'.
     */
    public void setMapTargetList(
            final MapTargetList mapTargetList) {
        this._mapTargetList = mapTargetList;
    }

    /**
     * Method unmarshalMapTargetListMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.MapTargetListMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
