/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.conceptdomainbinding;

/**
 * Class ConceptDomainBindingQueryService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ConceptDomainBindingQueryService extends edu.mayo.cts2.framework.model.service.core.BaseQueryService 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a DirectoryURI that resolves to the set of all
     *  concept domain bindings known to the service
     */
    private String _conceptDomainBindings;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptDomainBindingQueryService() {
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

        if (obj instanceof ConceptDomainBindingQueryService) {

            ConceptDomainBindingQueryService temp = (ConceptDomainBindingQueryService)obj;
            if (this._conceptDomainBindings != null) {
                if (temp._conceptDomainBindings == null) return false;
                return this._conceptDomainBindings.equals(temp._conceptDomainBindings);
            } else return temp._conceptDomainBindings == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'conceptDomainBindings'. The
     * field 'conceptDomainBindings' has the following description:
     * a DirectoryURI that resolves to the set of all
     *  concept domain bindings known to the service
     * 
     * @return the value of field 'ConceptDomainBindings'.
     */
    public String getConceptDomainBindings(
    ) {
        return this._conceptDomainBindings;
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
        if (_conceptDomainBindings != null) {
           result = 37 * result + _conceptDomainBindings.hashCode();
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
     * Sets the value of field 'conceptDomainBindings'. The field
     * 'conceptDomainBindings' has the following description: a
     * DirectoryURI that resolves to the set of all
     *  concept domain bindings known to the service
     * 
     * @param conceptDomainBindings the value of field
     * 'conceptDomainBindings'.
     */
    public void setConceptDomainBindings(
            final String conceptDomainBindings) {
        this._conceptDomainBindings = conceptDomainBindings;
    }

    /**
     * Method unmarshalConceptDomainBindingQueryService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.conceptdomainbinding.ConceptDomainBindingQueryService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
