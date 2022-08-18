/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.association;

/**
 * Class UpdatedDerivation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedDerivation extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _derivation.
     */
    private edu.mayo.cts2.framework.model.association.types.AssociationDerivation _derivation;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedDerivation() {
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

        if (obj instanceof UpdatedDerivation) {

            UpdatedDerivation temp = (UpdatedDerivation)obj;
            if (this._derivation != null) {
                if (temp._derivation == null) return false;
                return this._derivation.equals(temp._derivation);
            } else return temp._derivation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'derivation'.
     * 
     * @return the value of field 'Derivation'.
     */
    public edu.mayo.cts2.framework.model.association.types.AssociationDerivation getDerivation(
    ) {
        return this._derivation;
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
        if (_derivation != null) {
           result = 37 * result + _derivation.hashCode();
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
     * Sets the value of field 'derivation'.
     * 
     * @param derivation the value of field 'derivation'.
     */
    public void setDerivation(
            final edu.mayo.cts2.framework.model.association.types.AssociationDerivation derivation) {
        this._derivation = derivation;
    }

    /**
     * Method unmarshalUpdatedDerivation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.association.UpdatedDerivation
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
