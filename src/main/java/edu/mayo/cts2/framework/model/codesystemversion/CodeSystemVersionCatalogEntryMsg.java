/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.codesystemversion;

/**
 * A CodeSystemVersionCatalogEntry read from a service instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodeSystemVersionCatalogEntryMsg extends edu.mayo.cts2.framework.model.core.Message 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codeSystemVersionCatalogEntry.
     */
    private CodeSystemVersionCatalogEntry _codeSystemVersionCatalogEntry;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodeSystemVersionCatalogEntryMsg() {
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

        if (obj instanceof CodeSystemVersionCatalogEntryMsg) {

            CodeSystemVersionCatalogEntryMsg temp = (CodeSystemVersionCatalogEntryMsg)obj;
            if (this._codeSystemVersionCatalogEntry != null) {
                if (temp._codeSystemVersionCatalogEntry == null) return false;
                return this._codeSystemVersionCatalogEntry.equals(temp._codeSystemVersionCatalogEntry);
            } else return temp._codeSystemVersionCatalogEntry == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystemVersionCatalogEntry'.
     * 
     * @return the value of field 'CodeSystemVersionCatalogEntry'.
     */
    public CodeSystemVersionCatalogEntry getCodeSystemVersionCatalogEntry(
    ) {
        return this._codeSystemVersionCatalogEntry;
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
        if (_codeSystemVersionCatalogEntry != null) {
           result = 37 * result + _codeSystemVersionCatalogEntry.hashCode();
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
     * Sets the value of field 'codeSystemVersionCatalogEntry'.
     * 
     * @param codeSystemVersionCatalogEntry the value of field
     * 'codeSystemVersionCatalogEntry'.
     */
    public void setCodeSystemVersionCatalogEntry(
            final CodeSystemVersionCatalogEntry codeSystemVersionCatalogEntry) {
        this._codeSystemVersionCatalogEntry = codeSystemVersionCatalogEntry;
    }

    /**
     * Method unmarshalCodeSystemVersionCatalogEntryMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.codesystemversion.CodeSystemVersionCatalogEntryMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
