/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.association;

/**
 * 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociationRendering extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _languageAndSyntax.
     */
    private edu.mayo.cts2.framework.model.core.OntologyLanguageAndSyntax _languageAndSyntax;

    /**
     * Field _representation.
     */
    private edu.mayo.cts2.framework.model.core.OpaqueData _representation;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociationRendering() {
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

        if (obj instanceof AssociationRendering) {

            AssociationRendering temp = (AssociationRendering)obj;
            if (this._languageAndSyntax != null) {
                if (temp._languageAndSyntax == null) return false;
                if (!this._languageAndSyntax.equals(temp._languageAndSyntax)) 
                    return false;
            } else if (temp._languageAndSyntax != null)
                return false;
            if (this._representation != null) {
                if (temp._representation == null) return false;
                return this._representation.equals(temp._representation);
            } else return temp._representation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'languageAndSyntax'.
     * 
     * @return the value of field 'LanguageAndSyntax'.
     */
    public edu.mayo.cts2.framework.model.core.OntologyLanguageAndSyntax getLanguageAndSyntax(
    ) {
        return this._languageAndSyntax;
    }

    /**
     * Returns the value of field 'representation'.
     * 
     * @return the value of field 'Representation'.
     */
    public edu.mayo.cts2.framework.model.core.OpaqueData getRepresentation(
    ) {
        return this._representation;
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
        if (_languageAndSyntax != null) {
           result = 37 * result + _languageAndSyntax.hashCode();
        }
        if (_representation != null) {
           result = 37 * result + _representation.hashCode();
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
     * Sets the value of field 'languageAndSyntax'.
     * 
     * @param languageAndSyntax the value of field
     * 'languageAndSyntax'.
     */
    public void setLanguageAndSyntax(
            final edu.mayo.cts2.framework.model.core.OntologyLanguageAndSyntax languageAndSyntax) {
        this._languageAndSyntax = languageAndSyntax;
    }

    /**
     * Sets the value of field 'representation'.
     * 
     * @param representation the value of field 'representation'.
     */
    public void setRepresentation(
            final edu.mayo.cts2.framework.model.core.OpaqueData representation) {
        this._representation = representation;
    }

    /**
     * Method unmarshalAssociationRendering.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.association.AssociationRenderin
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
