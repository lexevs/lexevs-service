/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * Class UpdatedChangeNotes.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedChangeNotes extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _changeNotes.
     */
    private edu.mayo.cts2.framework.model.core.OpaqueData _changeNotes;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedChangeNotes() {
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

        if (obj instanceof UpdatedChangeNotes) {

            UpdatedChangeNotes temp = (UpdatedChangeNotes)obj;
            if (this._changeNotes != null) {
                if (temp._changeNotes == null) return false;
                return this._changeNotes.equals(temp._changeNotes);
            } else return temp._changeNotes == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeNotes'.
     * 
     * @return the value of field 'ChangeNotes'.
     */
    public edu.mayo.cts2.framework.model.core.OpaqueData getChangeNotes(
    ) {
        return this._changeNotes;
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
        if (_changeNotes != null) {
           result = 37 * result + _changeNotes.hashCode();
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
     * Sets the value of field 'changeNotes'.
     * 
     * @param changeNotes the value of field 'changeNotes'.
     */
    public void setChangeNotes(
            final edu.mayo.cts2.framework.model.core.OpaqueData changeNotes) {
        this._changeNotes = changeNotes;
    }

    /**
     * Method unmarshalUpdatedChangeNotes.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedChangeNotes
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
