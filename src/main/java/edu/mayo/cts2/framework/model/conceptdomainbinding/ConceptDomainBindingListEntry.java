/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.conceptdomainbinding;

/**
 * A directory of a set of concept domain bindings.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ConceptDomainBindingListEntry extends edu.mayo.cts2.framework.model.core.DirectoryEntry 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _entry.
     */
    private ConceptDomainBinding _entry;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptDomainBindingListEntry() {
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

        if (obj instanceof ConceptDomainBindingListEntry) {

            ConceptDomainBindingListEntry temp = (ConceptDomainBindingListEntry)obj;
            if (this._entry != null) {
                if (temp._entry == null) return false;
                return this._entry.equals(temp._entry);
            } else return temp._entry == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'entry'.
     * 
     * @return the value of field 'Entry'.
     */
    public ConceptDomainBinding getEntry(
    ) {
        return this._entry;
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
        if (_entry != null) {
           result = 37 * result + _entry.hashCode();
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
     * Sets the value of field 'entry'.
     * 
     * @param entry the value of field 'entry'.
     */
    public void setEntry(
            final ConceptDomainBinding entry) {
        this._entry = entry;
    }

    /**
     * Method unmarshalConceptDomainBindingListEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.conceptdomainbinding.ConceptDomainBindingListEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
