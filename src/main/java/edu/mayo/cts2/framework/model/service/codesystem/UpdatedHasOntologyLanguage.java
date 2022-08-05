/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.codesystem;

/**
 * Class UpdatedHasOntologyLanguage.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedHasOntologyLanguage extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _hasOntologyLanguage.
     */
    private edu.mayo.cts2.framework.model.core.OntologyLanguageReference _hasOntologyLanguage;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedHasOntologyLanguage() {
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

        if (obj instanceof UpdatedHasOntologyLanguage) {

            UpdatedHasOntologyLanguage temp = (UpdatedHasOntologyLanguage)obj;
            if (this._hasOntologyLanguage != null) {
                if (temp._hasOntologyLanguage == null) return false;
                return this._hasOntologyLanguage.equals(temp._hasOntologyLanguage);
            } else return temp._hasOntologyLanguage == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'hasOntologyLanguage'.
     * 
     * @return the value of field 'HasOntologyLanguage'.
     */
    public edu.mayo.cts2.framework.model.core.OntologyLanguageReference getHasOntologyLanguage(
    ) {
        return this._hasOntologyLanguage;
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
        if (_hasOntologyLanguage != null) {
           result = 37 * result + _hasOntologyLanguage.hashCode();
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
     * Sets the value of field 'hasOntologyLanguage'.
     * 
     * @param hasOntologyLanguage the value of field
     * 'hasOntologyLanguage'.
     */
    public void setHasOntologyLanguage(
            final edu.mayo.cts2.framework.model.core.OntologyLanguageReference hasOntologyLanguage) {
        this._hasOntologyLanguage = hasOntologyLanguage;
    }

    /**
     * Method unmarshalUpdatedHasOntologyLanguage.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.codesystem.UpdatedHasOntologyLanguage
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
