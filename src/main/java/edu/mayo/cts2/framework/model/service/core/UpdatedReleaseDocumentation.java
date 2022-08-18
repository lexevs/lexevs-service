/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.OpaqueData;

/**
 * Class UpdatedReleaseDocumentation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedReleaseDocumentation extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _releaseDocumentation.
     */
    private OpaqueData _releaseDocumentation;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedReleaseDocumentation() {
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

        if (obj instanceof UpdatedReleaseDocumentation) {

            UpdatedReleaseDocumentation temp = (UpdatedReleaseDocumentation)obj;
            if (this._releaseDocumentation != null) {
                if (temp._releaseDocumentation == null) return false;
                return this._releaseDocumentation.equals(temp._releaseDocumentation);
            } else return temp._releaseDocumentation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'releaseDocumentation'.
     * 
     * @return the value of field 'ReleaseDocumentation'.
     */
    public OpaqueData getReleaseDocumentation(
    ) {
        return this._releaseDocumentation;
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
        if (_releaseDocumentation != null) {
           result = 37 * result + _releaseDocumentation.hashCode();
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
     * Sets the value of field 'releaseDocumentation'.
     * 
     * @param releaseDocumentation the value of field
     * 'releaseDocumentation'.
     */
    public void setReleaseDocumentation(
            final OpaqueData releaseDocumentation) {
        this._releaseDocumentation = releaseDocumentation;
    }

    /**
     * Method unmarshalUpdatedReleaseDocumentation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedReleaseDocumentation
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
