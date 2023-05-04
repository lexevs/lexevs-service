/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

import edu.mayo.cts2.framework.model.core.OpaqueData;

/**
 * Class UpdatedTargetDescription.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedTargetDescription extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the description of the rule and/or target
     *  
     */
    private OpaqueData _targetDescription;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedTargetDescription() {
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

        if (obj instanceof UpdatedTargetDescription) {

            UpdatedTargetDescription temp = (UpdatedTargetDescription)obj;
            if (this._targetDescription != null) {
                if (temp._targetDescription == null) return false;
                return this._targetDescription.equals(temp._targetDescription);
            } else return temp._targetDescription == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'targetDescription'. The field
     * 'targetDescription' has the following description: the
     * description of the rule and/or target
     *  
     * 
     * @return the value of field 'TargetDescription'.
     */
    public OpaqueData getTargetDescription(
    ) {
        return this._targetDescription;
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
        if (_targetDescription != null) {
           result = 37 * result + _targetDescription.hashCode();
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
     * Sets the value of field 'targetDescription'. The field
     * 'targetDescription' has the following description: the
     * description of the rule and/or target
     *  
     * 
     * @param targetDescription the value of field
     * 'targetDescription'.
     */
    public void setTargetDescription(
            final OpaqueData targetDescription) {
        this._targetDescription = targetDescription;
    }

    /**
     * Method unmarshalUpdatedTargetDescription.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.UpdatedTargetDescription
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
