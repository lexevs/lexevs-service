/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.conceptdomain;

import edu.mayo.cts2.framework.model.core.AbstractResourceDescriptionDirectoryEntry;
import edu.mayo.cts2.framework.model.core.NamedEntityReference;

/**
 * a synopsis of a ConceptDomain along with information about how
 * to access the complete resource
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ConceptDomainCatalogEntrySummary extends AbstractResourceDescriptionDirectoryEntry
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name by which the concept domain is known within the
     * context of the CTS2 service instance. conceptDomainName must
     * uniquely designate a single, abstract ConceptDomain
     *  within the context of all concept domains known to the
     * instance of the service. Note that conceptDomainName is not
     * necessarily globally unique and the about URI should be used
     * whenever communication
     *  information about the ConceptDomain across time or service
     * instances.
     */
    private String _conceptDomainName;

    /**
     * a reference to an EntityDescription that describes the
     * domain and scope of meaning for the ConceptDomain. If
     * present, this association is equivalent to the
     *  data_element_concept_domain association in section 11.2.3.2
     * of ISO 11179-3. entityrReference provides a definition for
     * the ConceptDomain and potentially describes its relationship
     * with other
     *  ConceptDomains as well as providing a semantic link to the
     * possible value meanings available to domain bindings.
     */
    private NamedEntityReference _definingEntity;

    /**
     * a URI that resolves to the known bindings (aka. Data
     * Elements) of the referenced ConceptDomain
     */
    private String _bindings;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptDomainCatalogEntrySummary() {
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

        if (obj instanceof ConceptDomainCatalogEntrySummary) {

            ConceptDomainCatalogEntrySummary temp = (ConceptDomainCatalogEntrySummary)obj;
            if (this._conceptDomainName != null) {
                if (temp._conceptDomainName == null) return false;
                if (!this._conceptDomainName.equals(temp._conceptDomainName)) 
                    return false;
            } else if (temp._conceptDomainName != null)
                return false;
            if (this._definingEntity != null) {
                if (temp._definingEntity == null) return false;
                if (!this._definingEntity.equals(temp._definingEntity)) 
                    return false;
            } else if (temp._definingEntity != null)
                return false;
            if (this._bindings != null) {
                if (temp._bindings == null) return false;
                return this._bindings.equals(temp._bindings);
            } else return temp._bindings == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'bindings'. The field 'bindings'
     * has the following description: a URI that resolves to the
     * known bindings (aka. Data Elements) of the referenced
     * ConceptDomain
     * 
     * @return the value of field 'Bindings'.
     */
    public String getBindings(
    ) {
        return this._bindings;
    }

    /**
     * Returns the value of field 'conceptDomainName'. The field
     * 'conceptDomainName' has the following description: the name
     * by which the concept domain is known within the context of
     * the CTS2 service instance. conceptDomainName must uniquely
     * designate a single, abstract ConceptDomain
     *  within the context of all concept domains known to the
     * instance of the service. Note that conceptDomainName is not
     * necessarily globally unique and the about URI should be used
     * whenever communication
     *  information about the ConceptDomain across time or service
     * instances.
     * 
     * @return the value of field 'ConceptDomainName'.
     */
    public String getConceptDomainName(
    ) {
        return this._conceptDomainName;
    }

    /**
     * Returns the value of field 'definingEntity'. The field
     * 'definingEntity' has the following description: a reference
     * to an EntityDescription that describes the domain and scope
     * of meaning for the ConceptDomain. If present, this
     * association is equivalent to the
     *  data_element_concept_domain association in section 11.2.3.2
     * of ISO 11179-3. entityrReference provides a definition for
     * the ConceptDomain and potentially describes its relationship
     * with other
     *  ConceptDomains as well as providing a semantic link to the
     * possible value meanings available to domain bindings.
     * 
     * @return the value of field 'DefiningEntity'.
     */
    public NamedEntityReference getDefiningEntity(
    ) {
        return this._definingEntity;
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
        if (_conceptDomainName != null) {
           result = 37 * result + _conceptDomainName.hashCode();
        }
        if (_definingEntity != null) {
           result = 37 * result + _definingEntity.hashCode();
        }
        if (_bindings != null) {
           result = 37 * result + _bindings.hashCode();
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
     * Sets the value of field 'bindings'. The field 'bindings' has
     * the following description: a URI that resolves to the known
     * bindings (aka. Data Elements) of the referenced
     * ConceptDomain
     * 
     * @param bindings the value of field 'bindings'.
     */
    public void setBindings(
            final String bindings) {
        this._bindings = bindings;
    }

    /**
     * Sets the value of field 'conceptDomainName'. The field
     * 'conceptDomainName' has the following description: the name
     * by which the concept domain is known within the context of
     * the CTS2 service instance. conceptDomainName must uniquely
     * designate a single, abstract ConceptDomain
     *  within the context of all concept domains known to the
     * instance of the service. Note that conceptDomainName is not
     * necessarily globally unique and the about URI should be used
     * whenever communication
     *  information about the ConceptDomain across time or service
     * instances.
     * 
     * @param conceptDomainName the value of field
     * 'conceptDomainName'.
     */
    public void setConceptDomainName(
            final String conceptDomainName) {
        this._conceptDomainName = conceptDomainName;
    }

    /**
     * Sets the value of field 'definingEntity'. The field
     * 'definingEntity' has the following description: a reference
     * to an EntityDescription that describes the domain and scope
     * of meaning for the ConceptDomain. If present, this
     * association is equivalent to the
     *  data_element_concept_domain association in section 11.2.3.2
     * of ISO 11179-3. entityrReference provides a definition for
     * the ConceptDomain and potentially describes its relationship
     * with other
     *  ConceptDomains as well as providing a semantic link to the
     * possible value meanings available to domain bindings.
     * 
     * @param definingEntity the value of field 'definingEntity'.
     */
    public void setDefiningEntity(
            final NamedEntityReference definingEntity) {
        this._definingEntity = definingEntity;
    }

    /**
     * Method unmarshalConceptDomainCatalogEntrySummary.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.conceptdomain.ConceptDomainCatalogEntrySummary
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
