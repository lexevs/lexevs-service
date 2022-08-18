/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapversion;

/**
 * Class UpdatedApplicableContexts.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedApplicableContexts extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _applicableContexts.
     */
    private edu.mayo.cts2.framework.model.service.core.NameOrURIList _applicableContexts;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedApplicableContexts() {
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

        if (obj instanceof UpdatedApplicableContexts) {

            UpdatedApplicableContexts temp = (UpdatedApplicableContexts)obj;
            if (this._applicableContexts != null) {
                if (temp._applicableContexts == null) return false;
                return this._applicableContexts.equals(temp._applicableContexts);
            } else return temp._applicableContexts == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'applicableContexts'.
     * 
     * @return the value of field 'ApplicableContexts'.
     */
    public edu.mayo.cts2.framework.model.service.core.NameOrURIList getApplicableContexts(
    ) {
        return this._applicableContexts;
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
        if (_applicableContexts != null) {
           result = 37 * result + _applicableContexts.hashCode();
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
     * Sets the value of field 'applicableContexts'.
     * 
     * @param applicableContexts the value of field
     * 'applicableContexts'.
     */
    public void setApplicableContexts(
            final edu.mayo.cts2.framework.model.service.core.NameOrURIList applicableContexts) {
        this._applicableContexts = applicableContexts;
    }

    /**
     * Method unmarshalUpdatedApplicableContexts.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapversion.UpdatedApplicableContexts
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
