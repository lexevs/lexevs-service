/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.association;

/**
 * Class UpdatedDerivationReasoningAlgorithm.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedDerivationReasoningAlgorithm extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _derivationReasoningAlgorithm.
     */
    private edu.mayo.cts2.framework.model.core.ReasoningAlgorithmReference _derivationReasoningAlgorithm;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedDerivationReasoningAlgorithm() {
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

        if (obj instanceof UpdatedDerivationReasoningAlgorithm) {

            UpdatedDerivationReasoningAlgorithm temp = (UpdatedDerivationReasoningAlgorithm)obj;
            if (this._derivationReasoningAlgorithm != null) {
                if (temp._derivationReasoningAlgorithm == null) return false;
                return this._derivationReasoningAlgorithm.equals(temp._derivationReasoningAlgorithm);
            } else return temp._derivationReasoningAlgorithm == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'derivationReasoningAlgorithm'.
     * 
     * @return the value of field 'DerivationReasoningAlgorithm'.
     */
    public edu.mayo.cts2.framework.model.core.ReasoningAlgorithmReference getDerivationReasoningAlgorithm(
    ) {
        return this._derivationReasoningAlgorithm;
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
        if (_derivationReasoningAlgorithm != null) {
           result = 37 * result + _derivationReasoningAlgorithm.hashCode();
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
     * Sets the value of field 'derivationReasoningAlgorithm'.
     * 
     * @param derivationReasoningAlgorithm the value of field
     * 'derivationReasoningAlgorithm'.
     */
    public void setDerivationReasoningAlgorithm(
            final edu.mayo.cts2.framework.model.core.ReasoningAlgorithmReference derivationReasoningAlgorithm) {
        this._derivationReasoningAlgorithm = derivationReasoningAlgorithm;
    }

    /**
     * Method unmarshalUpdatedDerivationReasoningAlgorithm.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.association.UpdatedDerivationReasoningAlgorithm
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
