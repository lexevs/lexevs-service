/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.codesystem;

import edu.mayo.cts2.framework.model.core.Message;

/**
 * A CodeSystemCatalogEntry read from a service instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CodeSystemCatalogEntryMsg extends Message
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codeSystemCatalogEntry.
     */
    private CodeSystemCatalogEntry _codeSystemCatalogEntry;


      //----------------/
     //- Constructors -/
    //----------------/

    public CodeSystemCatalogEntryMsg() {
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

        if (obj instanceof CodeSystemCatalogEntryMsg) {

            CodeSystemCatalogEntryMsg temp = (CodeSystemCatalogEntryMsg)obj;
            if (this._codeSystemCatalogEntry != null) {
                if (temp._codeSystemCatalogEntry == null) return false;
                return this._codeSystemCatalogEntry.equals(temp._codeSystemCatalogEntry);
            } else return temp._codeSystemCatalogEntry == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystemCatalogEntry'.
     * 
     * @return the value of field 'CodeSystemCatalogEntry'.
     */
    public CodeSystemCatalogEntry getCodeSystemCatalogEntry(
    ) {
        return this._codeSystemCatalogEntry;
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
        if (_codeSystemCatalogEntry != null) {
           result = 37 * result + _codeSystemCatalogEntry.hashCode();
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
     * Sets the value of field 'codeSystemCatalogEntry'.
     * 
     * @param codeSystemCatalogEntry the value of field
     * 'codeSystemCatalogEntry'.
     */
    public void setCodeSystemCatalogEntry(
            final CodeSystemCatalogEntry codeSystemCatalogEntry) {
        this._codeSystemCatalogEntry = codeSystemCatalogEntry;
    }

    /**
     * Method unmarshalCodeSystemCatalogEntryMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.codesystem.CodeSystemCatalogEntryMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
