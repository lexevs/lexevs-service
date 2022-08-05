/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateAbstractResourceDescription extends UpdateResourceDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedReleaseDocumentation.
     */
    private UpdatedReleaseDocumentation _updatedReleaseDocumentation;

    /**
     * Field _updatedReleaseFormats.
     */
    private UpdatedReleaseFormats _updatedReleaseFormats;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateAbstractResourceDescription() {
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

        if (obj instanceof UpdateAbstractResourceDescription) {

            UpdateAbstractResourceDescription temp = (UpdateAbstractResourceDescription)obj;
            if (this._updatedReleaseDocumentation != null) {
                if (temp._updatedReleaseDocumentation == null) return false;
                if (!this._updatedReleaseDocumentation.equals(temp._updatedReleaseDocumentation)) 
                    return false;
            } else if (temp._updatedReleaseDocumentation != null)
                return false;
            if (this._updatedReleaseFormats != null) {
                if (temp._updatedReleaseFormats == null) return false;
                return this._updatedReleaseFormats.equals(temp._updatedReleaseFormats);
            } else return temp._updatedReleaseFormats == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedReleaseDocumentation'.
     * 
     * @return the value of field 'UpdatedReleaseDocumentation'.
     */
    public UpdatedReleaseDocumentation getUpdatedReleaseDocumentation(
    ) {
        return this._updatedReleaseDocumentation;
    }

    /**
     * Returns the value of field 'updatedReleaseFormats'.
     * 
     * @return the value of field 'UpdatedReleaseFormats'.
     */
    public UpdatedReleaseFormats getUpdatedReleaseFormats(
    ) {
        return this._updatedReleaseFormats;
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
        if (_updatedReleaseDocumentation != null) {
           result = 37 * result + _updatedReleaseDocumentation.hashCode();
        }
        if (_updatedReleaseFormats != null) {
           result = 37 * result + _updatedReleaseFormats.hashCode();
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
     * Sets the value of field 'updatedReleaseDocumentation'.
     * 
     * @param updatedReleaseDocumentation the value of field
     * 'updatedReleaseDocumentation'.
     */
    public void setUpdatedReleaseDocumentation(
            final UpdatedReleaseDocumentation updatedReleaseDocumentation) {
        this._updatedReleaseDocumentation = updatedReleaseDocumentation;
    }

    /**
     * Sets the value of field 'updatedReleaseFormats'.
     * 
     * @param updatedReleaseFormats the value of field
     * 'updatedReleaseFormats'.
     */
    public void setUpdatedReleaseFormats(
            final UpdatedReleaseFormats updatedReleaseFormats) {
        this._updatedReleaseFormats = updatedReleaseFormats;
    }

    /**
     * Method unmarshalUpdateAbstractResourceDescription.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdateAbstractResourceDescription
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
