/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.conceptdomain;

/**
 * Class ConceptDomainQueryService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ConceptDomainQueryService extends edu.mayo.cts2.framework.model.service.core.BaseQueryService 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _allConceptDomains.
     */
    private String _allConceptDomains;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptDomainQueryService() {
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

        if (obj instanceof ConceptDomainQueryService) {

            ConceptDomainQueryService temp = (ConceptDomainQueryService)obj;
            if (this._allConceptDomains != null) {
                if (temp._allConceptDomains == null) return false;
                return this._allConceptDomains.equals(temp._allConceptDomains);
            } else return temp._allConceptDomains == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'allConceptDomains'.
     * 
     * @return the value of field 'AllConceptDomains'.
     */
    public String getAllConceptDomains(
    ) {
        return this._allConceptDomains;
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
        if (_allConceptDomains != null) {
           result = 37 * result + _allConceptDomains.hashCode();
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
     * Sets the value of field 'allConceptDomains'.
     * 
     * @param allConceptDomains the value of field
     * 'allConceptDomains'.
     */
    public void setAllConceptDomains(
            final String allConceptDomains) {
        this._allConceptDomains = allConceptDomains;
    }

    /**
     * Method unmarshalConceptDomainQueryService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.conceptdomain.ConceptDomainQueryService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
