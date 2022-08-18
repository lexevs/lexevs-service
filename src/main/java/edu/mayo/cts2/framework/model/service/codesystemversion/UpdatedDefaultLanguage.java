/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystemversion;

import edu.mayo.cts2.framework.model.service.core.NameOrURI;

/**
 * Class UpdatedDefaultLanguage.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedDefaultLanguage extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defaultLanguage.
     */
    private NameOrURI _defaultLanguage;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedDefaultLanguage() {
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

        if (obj instanceof UpdatedDefaultLanguage) {

            UpdatedDefaultLanguage temp = (UpdatedDefaultLanguage)obj;
            if (this._defaultLanguage != null) {
                if (temp._defaultLanguage == null) return false;
                return this._defaultLanguage.equals(temp._defaultLanguage);
            } else return temp._defaultLanguage == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultLanguage'.
     * 
     * @return the value of field 'DefaultLanguage'.
     */
    public NameOrURI getDefaultLanguage(
    ) {
        return this._defaultLanguage;
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
        if (_defaultLanguage != null) {
           result = 37 * result + _defaultLanguage.hashCode();
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
     * Sets the value of field 'defaultLanguage'.
     * 
     * @param defaultLanguage the value of field 'defaultLanguage'.
     */
    public void setDefaultLanguage(
            final NameOrURI defaultLanguage) {
        this._defaultLanguage = defaultLanguage;
    }

    /**
     * Method unmarshalUpdatedDefaultLanguage.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystemversion.UpdatedDefaultLanguage
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
