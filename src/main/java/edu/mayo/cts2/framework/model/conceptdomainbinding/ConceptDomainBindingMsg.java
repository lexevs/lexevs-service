/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.conceptdomainbinding;

/**
 * A ConceptDomainBinding read from a service instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ConceptDomainBindingMsg extends edu.mayo.cts2.framework.model.core.Message 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _conceptDomainBinding.
     */
    private ConceptDomainBinding _conceptDomainBinding;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptDomainBindingMsg() {
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

        if (obj instanceof ConceptDomainBindingMsg) {

            ConceptDomainBindingMsg temp = (ConceptDomainBindingMsg)obj;
            if (this._conceptDomainBinding != null) {
                if (temp._conceptDomainBinding == null) return false;
                return this._conceptDomainBinding.equals(temp._conceptDomainBinding);
            } else return temp._conceptDomainBinding == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'conceptDomainBinding'.
     * 
     * @return the value of field 'ConceptDomainBinding'.
     */
    public ConceptDomainBinding getConceptDomainBinding(
    ) {
        return this._conceptDomainBinding;
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
        if (_conceptDomainBinding != null) {
           result = 37 * result + _conceptDomainBinding.hashCode();
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
     * Sets the value of field 'conceptDomainBinding'.
     * 
     * @param conceptDomainBinding the value of field
     * 'conceptDomainBinding'.
     */
    public void setConceptDomainBinding(
            final ConceptDomainBinding conceptDomainBinding) {
        this._conceptDomainBinding = conceptDomainBinding;
    }

    /**
     * Method unmarshalConceptDomainBindingMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.conceptdomainbinding.ConceptDomainBindingMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
