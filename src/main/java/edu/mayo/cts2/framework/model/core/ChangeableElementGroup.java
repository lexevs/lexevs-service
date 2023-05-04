/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * Class ChangeableElementGroup.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ChangeableElementGroup extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the state of this model element in an externally defined
     * workflow
     */
    private StatusReference _status;

    /**
     * Detailed information about the last change that resulted in
     * this changeable element being in the state that it is now.
     * changeDescription is only present in services that support
     * the HISTORY profile and then only when specifically requested
     */
    private ChangeDescription _changeDescription;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChangeableElementGroup() {
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

        if (obj instanceof ChangeableElementGroup) {

            ChangeableElementGroup temp = (ChangeableElementGroup)obj;
            if (this._status != null) {
                if (temp._status == null) return false;
                if (!this._status.equals(temp._status)) 
                    return false;
            } else if (temp._status != null)
                return false;
            if (this._changeDescription != null) {
                if (temp._changeDescription == null) return false;
                return this._changeDescription.equals(temp._changeDescription);
            } else return temp._changeDescription == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeDescription'. The field
     * 'changeDescription' has the following description: Detailed
     * information about the last change that resulted in this
     * changeable element being in the state that it is now.
     * changeDescription is only present in services that support
     * the HISTORY profile and then only when specifically
     * requested.
     * 
     * @return the value of field 'ChangeDescription'.
     */
    public ChangeDescription getChangeDescription(
    ) {
        return this._changeDescription;
    }

    /**
     * Returns the value of field 'status'. The field 'status' has
     * the following description: the state of this model element
     * in an externally defined workflow
     * 
     * @return the value of field 'Status'.
     */
    public StatusReference getStatus(
    ) {
        return this._status;
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
        if (_status != null) {
           result = 37 * result + _status.hashCode();
        }
        if (_changeDescription != null) {
           result = 37 * result + _changeDescription.hashCode();
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
     * Sets the value of field 'changeDescription'. The field
     * 'changeDescription' has the following description: Detailed
     * information about the last change that resulted in this
     * changeable element being in the state that it is now.
     * changeDescription is only present in services that support
     * the HISTORY profile and then only when specifically
     * requested.
     * 
     * @param changeDescription the value of field
     * 'changeDescription'.
     */
    public void setChangeDescription(
            final ChangeDescription changeDescription) {
        this._changeDescription = changeDescription;
    }

    /**
     * Sets the value of field 'status'. The field 'status' has the
     * following description: the state of this model element in an
     * externally defined workflow
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final StatusReference status) {
        this._status = status;
    }

    /**
     * Method unmarshalChangeableElementGroup.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.ChangeableElementGroup
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
