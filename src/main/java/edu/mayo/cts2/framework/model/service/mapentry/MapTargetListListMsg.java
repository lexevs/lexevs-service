/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

import edu.mayo.cts2.framework.model.core.Message;

/**
 * A list of map target lists, one per input entity
 *  
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapTargetListListMsg extends Message
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mapTargetListList.
     */
    private MapTargetListList _mapTargetListList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapTargetListListMsg() {
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

        if (obj instanceof MapTargetListListMsg) {

            MapTargetListListMsg temp = (MapTargetListListMsg)obj;
            if (this._mapTargetListList != null) {
                if (temp._mapTargetListList == null) return false;
                return this._mapTargetListList.equals(temp._mapTargetListList);
            } else return temp._mapTargetListList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'mapTargetListList'.
     * 
     * @return the value of field 'MapTargetListList'.
     */
    public MapTargetListList getMapTargetListList(
    ) {
        return this._mapTargetListList;
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
        if (_mapTargetListList != null) {
           result = 37 * result + _mapTargetListList.hashCode();
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
     * Sets the value of field 'mapTargetListList'.
     * 
     * @param mapTargetListList the value of field
     * 'mapTargetListList'.
     */
    public void setMapTargetListList(
            final MapTargetListList mapTargetListList) {
        this._mapTargetListList = mapTargetListList;
    }

    /**
     * Method unmarshalMapTargetListListMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.MapTargetListListMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
