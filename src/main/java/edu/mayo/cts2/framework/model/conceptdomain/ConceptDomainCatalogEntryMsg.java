/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.conceptdomain;

/**
 * A ConceptDomainCatalogEntry read from a service instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ConceptDomainCatalogEntryMsg extends edu.mayo.cts2.framework.model.core.Message 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _conceptDomainCatalogEntry.
     */
    private ConceptDomainCatalogEntry _conceptDomainCatalogEntry;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptDomainCatalogEntryMsg() {
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

        if (obj instanceof ConceptDomainCatalogEntryMsg) {

            ConceptDomainCatalogEntryMsg temp = (ConceptDomainCatalogEntryMsg)obj;
            if (this._conceptDomainCatalogEntry != null) {
                if (temp._conceptDomainCatalogEntry == null) return false;
                return this._conceptDomainCatalogEntry.equals(temp._conceptDomainCatalogEntry);
            } else return temp._conceptDomainCatalogEntry == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'conceptDomainCatalogEntry'.
     * 
     * @return the value of field 'ConceptDomainCatalogEntry'.
     */
    public ConceptDomainCatalogEntry getConceptDomainCatalogEntry(
    ) {
        return this._conceptDomainCatalogEntry;
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
        if (_conceptDomainCatalogEntry != null) {
           result = 37 * result + _conceptDomainCatalogEntry.hashCode();
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
     * Sets the value of field 'conceptDomainCatalogEntry'.
     * 
     * @param conceptDomainCatalogEntry the value of field
     * 'conceptDomainCatalogEntry'.
     */
    public void setConceptDomainCatalogEntry(
            final ConceptDomainCatalogEntry conceptDomainCatalogEntry) {
        this._conceptDomainCatalogEntry = conceptDomainCatalogEntry;
    }

    /**
     * Method unmarshalConceptDomainCatalogEntryMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.conceptdomain.ConceptDomainCatalogEntryMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
