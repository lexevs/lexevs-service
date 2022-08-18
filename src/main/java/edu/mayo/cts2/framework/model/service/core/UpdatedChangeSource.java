/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * Class UpdatedChangeSource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedChangeSource extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _changeSource.
     */
    private edu.mayo.cts2.framework.model.core.SourceReference _changeSource;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedChangeSource() {
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

        if (obj instanceof UpdatedChangeSource) {

            UpdatedChangeSource temp = (UpdatedChangeSource)obj;
            if (this._changeSource != null) {
                if (temp._changeSource == null) return false;
                return this._changeSource.equals(temp._changeSource);
            } else return temp._changeSource == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeSource'.
     * 
     * @return the value of field 'ChangeSource'.
     */
    public edu.mayo.cts2.framework.model.core.SourceReference getChangeSource(
    ) {
        return this._changeSource;
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
        if (_changeSource != null) {
           result = 37 * result + _changeSource.hashCode();
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
     * Sets the value of field 'changeSource'.
     * 
     * @param changeSource the value of field 'changeSource'.
     */
    public void setChangeSource(
            final edu.mayo.cts2.framework.model.core.SourceReference changeSource) {
        this._changeSource = changeSource;
    }

    /**
     * Method unmarshalUpdatedChangeSource.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedChangeSourc
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
