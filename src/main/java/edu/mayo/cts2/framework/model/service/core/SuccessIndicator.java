/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.OpaqueData;
import edu.mayo.cts2.framework.model.service.core.types.SuccessIndicatorType;

/**
 * An indicator that determines whether a change set was
 * successfully added or not.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SuccessIndicator extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _message.
     */
    private OpaqueData _message;

    /**
     * Field _successIndicator.
     */
    private SuccessIndicatorType _successIndicator;


      //----------------/
     //- Constructors -/
    //----------------/

    public SuccessIndicator() {
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

        if (obj instanceof SuccessIndicator) {

            SuccessIndicator temp = (SuccessIndicator)obj;
            if (this._message != null) {
                if (temp._message == null) return false;
                if (!this._message.equals(temp._message)) 
                    return false;
            } else if (temp._message != null)
                return false;
            if (this._successIndicator != null) {
                if (temp._successIndicator == null) return false;
                return this._successIndicator.equals(temp._successIndicator);
            } else return temp._successIndicator == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'message'.
     * 
     * @return the value of field 'Message'.
     */
    public OpaqueData getMessage(
    ) {
        return this._message;
    }

    /**
     * Returns the value of field 'successIndicator'.
     * 
     * @return the value of field 'SuccessIndicator'.
     */
    public SuccessIndicatorType getSuccessIndicator(
    ) {
        return this._successIndicator;
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
        if (_successIndicator != null) {
           result = 37 * result + _successIndicator.hashCode();
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
            final OpaqueData message) {
        this._message = message;
    }

    /**
     * Sets the value of field 'successIndicator'.
     * 
     * @param successIndicator the value of field 'successIndicator'
     */
    public void setSuccessIndicator(
            final SuccessIndicatorType successIndicator) {
        this._successIndicator = successIndicator;
    }

    /**
     * Method unmarshalSuccessIndicator.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.SuccessIndicator
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
