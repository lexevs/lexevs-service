/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.NamespaceReference;

/**
 * A namespace reference that may include additional documentation
 * about the scope of the namespace.
 *  
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class DocumentedNamespaceReference extends NamespaceReference
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    

    /**
     * Documentation about the scope and origin of the namespace.
     *  
     */
    private String _description;


      //----------------/
     //- Constructors -/
    //----------------/

    public DocumentedNamespaceReference() {
        super();
        setContent("");
    }

    public DocumentedNamespaceReference(final String defaultValue) {
        try {
            setContent(defaultValue);
         } catch(Exception e) {
            throw new RuntimeException("Unable to cast default value for simple content!");
         } 
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

        if (obj instanceof DocumentedNamespaceReference) {

            DocumentedNamespaceReference temp = (DocumentedNamespaceReference)obj;
            if (this._content != null) {
                if (temp._content == null) return false;
                if (!this._content.equals(temp._content)) 
                    return false;
            } else if (temp._content != null)
                return false;
            if (this._description != null) {
                if (temp._description == null) return false;
                return this._description.equals(temp._description);
            } else return temp._description == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'Content'.
     */
    public String getContent(
    ) {
        return this._content;
    }

    /**
     * Returns the value of field 'description'. The field
     * 'description' has the following description: Documentation
     * about the scope and origin of the namespace.
     *  
     * 
     * @return the value of field 'Description'.
     */
    public String getDescription(
    ) {
        return this._description;
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
        if (_content != null) {
           result = 37 * result + _content.hashCode();
        }
        if (_description != null) {
           result = 37 * result + _description.hashCode();
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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(
            final String content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'description'. The field
     * 'description' has the following description: Documentation
     * about the scope and origin of the namespace.
     *  
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final String description) {
        this._description = description;
    }

    /**
     * Method unmarshalDocumentedNamespaceReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.DocumentedNamespaceReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
