/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapversion;

import edu.mayo.cts2.framework.model.service.core.NameOrURIList;

/**
 * Class UpdatedUseCodeSystemVersions.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedUseCodeSystemVersions extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _useCodeSystemVersions.
     */
    private NameOrURIList _useCodeSystemVersions;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedUseCodeSystemVersions() {
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

        if (obj instanceof UpdatedUseCodeSystemVersions) {

            UpdatedUseCodeSystemVersions temp = (UpdatedUseCodeSystemVersions)obj;
            if (this._useCodeSystemVersions != null) {
                if (temp._useCodeSystemVersions == null) return false;
                return this._useCodeSystemVersions.equals(temp._useCodeSystemVersions);
            } else return temp._useCodeSystemVersions == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'useCodeSystemVersions'.
     * 
     * @return the value of field 'UseCodeSystemVersions'.
     */
    public NameOrURIList getUseCodeSystemVersions(
    ) {
        return this._useCodeSystemVersions;
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
        if (_useCodeSystemVersions != null) {
           result = 37 * result + _useCodeSystemVersions.hashCode();
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
     * Sets the value of field 'useCodeSystemVersions'.
     * 
     * @param useCodeSystemVersions the value of field
     * 'useCodeSystemVersions'.
     */
    public void setUseCodeSystemVersions(
            final NameOrURIList useCodeSystemVersions) {
        this._useCodeSystemVersions = useCodeSystemVersions;
    }

    /**
     * Method unmarshalUpdatedUseCodeSystemVersions.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapversion.UpdatedUseCodeSystemVersions
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
