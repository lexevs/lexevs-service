/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.conceptdomainbinding;

/**
 * Class UpdatedUseCodeSystemVersion.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedUseCodeSystemVersion extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the local identifiers for or URIs of a set of
     *  code system versions to be used in the binding
     */
    private edu.mayo.cts2.framework.model.service.core.NameOrURIList _useCodeSystemVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedUseCodeSystemVersion() {
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

        if (obj instanceof UpdatedUseCodeSystemVersion) {

            UpdatedUseCodeSystemVersion temp = (UpdatedUseCodeSystemVersion)obj;
            if (this._useCodeSystemVersion != null) {
                if (temp._useCodeSystemVersion == null) return false;
                return this._useCodeSystemVersion.equals(temp._useCodeSystemVersion);
            } else return temp._useCodeSystemVersion == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'useCodeSystemVersion'. The field
     * 'useCodeSystemVersion' has the following description: the
     * local identifiers for or URIs of a set of
     *  code system versions to be used in the binding
     * 
     * @return the value of field 'UseCodeSystemVersion'.
     */
    public edu.mayo.cts2.framework.model.service.core.NameOrURIList getUseCodeSystemVersion(
    ) {
        return this._useCodeSystemVersion;
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
        if (_useCodeSystemVersion != null) {
           result = 37 * result + _useCodeSystemVersion.hashCode();
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
     * Sets the value of field 'useCodeSystemVersion'. The field
     * 'useCodeSystemVersion' has the following description: the
     * local identifiers for or URIs of a set of
     *  code system versions to be used in the binding
     * 
     * @param useCodeSystemVersion the value of field
     * 'useCodeSystemVersion'.
     */
    public void setUseCodeSystemVersion(
            final edu.mayo.cts2.framework.model.service.core.NameOrURIList useCodeSystemVersion) {
        this._useCodeSystemVersion = useCodeSystemVersion;
    }

    /**
     * Method unmarshalUpdatedUseCodeSystemVersion.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.conceptdomainbinding.UpdatedUseCodeSystemVersion
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
