/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valueset;

/**
 * A ValueSetDefinition read from a service instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetCatalogEntryMsg extends edu.mayo.cts2.framework.model.core.Message 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _valueSetCatalogEntry.
     */
    private ValueSetCatalogEntry _valueSetCatalogEntry;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetCatalogEntryMsg() {
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

        if (obj instanceof ValueSetCatalogEntryMsg) {

            ValueSetCatalogEntryMsg temp = (ValueSetCatalogEntryMsg)obj;
            if (this._valueSetCatalogEntry != null) {
                if (temp._valueSetCatalogEntry == null) return false;
                return this._valueSetCatalogEntry.equals(temp._valueSetCatalogEntry);
            } else return temp._valueSetCatalogEntry == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'valueSetCatalogEntry'.
     * 
     * @return the value of field 'ValueSetCatalogEntry'.
     */
    public ValueSetCatalogEntry getValueSetCatalogEntry(
    ) {
        return this._valueSetCatalogEntry;
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
        if (_valueSetCatalogEntry != null) {
           result = 37 * result + _valueSetCatalogEntry.hashCode();
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
     * Sets the value of field 'valueSetCatalogEntry'.
     * 
     * @param valueSetCatalogEntry the value of field
     * 'valueSetCatalogEntry'.
     */
    public void setValueSetCatalogEntry(
            final ValueSetCatalogEntry valueSetCatalogEntry) {
        this._valueSetCatalogEntry = valueSetCatalogEntry;
    }

    /**
     * Method unmarshalValueSetCatalogEntryMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valueset.ValueSetCatalogEntryMs
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
