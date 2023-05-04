/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.EntryDescription;

/**
 * Class UpdatedResourceSynopsis.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedResourceSynopsis extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resourceSynopsis.
     */
    private EntryDescription _resourceSynopsis;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedResourceSynopsis() {
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

        if (obj instanceof UpdatedResourceSynopsis) {

            UpdatedResourceSynopsis temp = (UpdatedResourceSynopsis)obj;
            if (this._resourceSynopsis != null) {
                if (temp._resourceSynopsis == null) return false;
                return this._resourceSynopsis.equals(temp._resourceSynopsis);
            } else return temp._resourceSynopsis == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'resourceSynopsis'.
     * 
     * @return the value of field 'ResourceSynopsis'.
     */
    public EntryDescription getResourceSynopsis(
    ) {
        return this._resourceSynopsis;
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
        if (_resourceSynopsis != null) {
           result = 37 * result + _resourceSynopsis.hashCode();
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
     * Sets the value of field 'resourceSynopsis'.
     * 
     * @param resourceSynopsis the value of field 'resourceSynopsis'
     */
    public void setResourceSynopsis(
            final EntryDescription resourceSynopsis) {
        this._resourceSynopsis = resourceSynopsis;
    }

    /**
     * Method unmarshalUpdatedResourceSynopsis.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedResourceSynopsis
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
