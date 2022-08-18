/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * The result of a change set validation call
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValidationResponse extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _message.
     */
    private edu.mayo.cts2.framework.model.core.OpaqueData _message;

    /**
     * Field _validationResponse.
     */
    private edu.mayo.cts2.framework.model.service.core.types.ValidationResponseType _validationResponse;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValidationResponse() {
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

        if (obj instanceof ValidationResponse) {

            ValidationResponse temp = (ValidationResponse)obj;
            if (this._message != null) {
                if (temp._message == null) return false;
                if (!this._message.equals(temp._message)) 
                    return false;
            } else if (temp._message != null)
                return false;
            if (this._validationResponse != null) {
                if (temp._validationResponse == null) return false;
                return this._validationResponse.equals(temp._validationResponse);
            } else return temp._validationResponse == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'message'.
     * 
     * @return the value of field 'Message'.
     */
    public edu.mayo.cts2.framework.model.core.OpaqueData getMessage(
    ) {
        return this._message;
    }

    /**
     * Returns the value of field 'validationResponse'.
     * 
     * @return the value of field 'ValidationResponse'.
     */
    public edu.mayo.cts2.framework.model.service.core.types.ValidationResponseType getValidationResponse(
    ) {
        return this._validationResponse;
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
        if (_message != null) {
           result = 37 * result + _message.hashCode();
        }
        if (_validationResponse != null) {
           result = 37 * result + _validationResponse.hashCode();
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
     * Sets the value of field 'message'.
     * 
     * @param message the value of field 'message'.
     */
    public void setMessage(
            final edu.mayo.cts2.framework.model.core.OpaqueData message) {
        this._message = message;
    }

    /**
     * Sets the value of field 'validationResponse'.
     * 
     * @param validationResponse the value of field
     * 'validationResponse'.
     */
    public void setValidationResponse(
            final edu.mayo.cts2.framework.model.service.core.types.ValidationResponseType validationResponse) {
        this._validationResponse = validationResponse;
    }

    /**
     * Method unmarshalValidationResponse.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.ValidationResponse
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
