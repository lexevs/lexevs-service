/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

import edu.mayo.cts2.framework.model.service.core.EntityNameOrURI;

/**
 * Class UpdatedMapTo.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedMapTo extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the entity name or URI to map to
     *  
     */
    private EntityNameOrURI _mapTo;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedMapTo() {
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

        if (obj instanceof UpdatedMapTo) {

            UpdatedMapTo temp = (UpdatedMapTo)obj;
            if (this._mapTo != null) {
                if (temp._mapTo == null) return false;
                return this._mapTo.equals(temp._mapTo);
            } else return temp._mapTo == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'mapTo'. The field 'mapTo' has
     * the following description: the entity name or URI to map to
     *  
     * 
     * @return the value of field 'MapTo'.
     */
    public EntityNameOrURI getMapTo(
    ) {
        return this._mapTo;
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
        if (_mapTo != null) {
           result = 37 * result + _mapTo.hashCode();
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
     * Sets the value of field 'mapTo'. The field 'mapTo' has the
     * following description: the entity name or URI to map to
     *  
     * 
     * @param mapTo the value of field 'mapTo'.
     */
    public void setMapTo(
            final EntityNameOrURI mapTo) {
        this._mapTo = mapTo;
    }

    /**
     * Method unmarshalUpdatedMapTo.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.UpdatedMapTo
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
