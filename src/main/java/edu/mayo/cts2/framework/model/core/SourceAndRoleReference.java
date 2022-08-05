/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * a reference to a source that also includes the role that the
 * source played and/or fixes the particular chapter, page or other
 * element within the reference
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SourceAndRoleReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    protected String _content = null;

    /**
     * Field _source.
     */
    private SourceReference _source;

    /**
     * a role that the source played in the creation of the
     * containing resource
     */
    private RoleReference _role;

    /**
     * additional bibliographic information such as page number,
     * edition, etc.
     */
    private OpaqueData _bibliographicLink;


      //----------------/
     //- Constructors -/
    //----------------/

    public SourceAndRoleReference() {
        super();
        setContent("");
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

        if (obj instanceof SourceAndRoleReference) {

            SourceAndRoleReference temp = (SourceAndRoleReference)obj;
            if (this._content != null) {
                if (temp._content == null) return false;
                if (!this._content.equals(temp._content)) 
                    return false;
            } else if (temp._content != null)
                return false;
            if (this._source != null) {
                if (temp._source == null) return false;
                if (!this._source.equals(temp._source)) 
                    return false;
            } else if (temp._source != null)
                return false;
            if (this._role != null) {
                if (temp._role == null) return false;
                if (!this._role.equals(temp._role)) 
                    return false;
            } else if (temp._role != null)
                return false;
            if (this._bibliographicLink != null) {
                if (temp._bibliographicLink == null) return false;
                return this._bibliographicLink.equals(temp._bibliographicLink);
            } else return temp._bibliographicLink == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'bibliographicLink'. The field
     * 'bibliographicLink' has the following description:
     * additional bibliographic information such as page number,
     * edition, etc.
     * 
     * @return the value of field 'BibliographicLink'.
     */
    public OpaqueData getBibliographicLink(
    ) {
        return this._bibliographicLink;
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
     * Returns the value of field 'role'. The field 'role' has the
     * following description: a role that the source played in the
     * creation of the containing resource
     * 
     * @return the value of field 'Role'.
     */
    public RoleReference getRole(
    ) {
        return this._role;
    }

    /**
     * Returns the value of field 'source'.
     * 
     * @return the value of field 'Source'.
     */
    public SourceReference getSource(
    ) {
        return this._source;
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
        if (_source != null) {
           result = 37 * result + _source.hashCode();
        }
        if (_role != null) {
           result = 37 * result + _role.hashCode();
        }
        if (_bibliographicLink != null) {
           result = 37 * result + _bibliographicLink.hashCode();
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
     * Sets the value of field 'bibliographicLink'. The field
     * 'bibliographicLink' has the following description:
     * additional bibliographic information such as page number,
     * edition, etc.
     * 
     * @param bibliographicLink the value of field
     * 'bibliographicLink'.
     */
    public void setBibliographicLink(
            final OpaqueData bibliographicLink) {
        this._bibliographicLink = bibliographicLink;
    }

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
     * Sets the value of field 'role'. The field 'role' has the
     * following description: a role that the source played in the
     * creation of the containing resource
     * 
     * @param role the value of field 'role'.
     */
    public void setRole(
            final RoleReference role) {
        this._role = role;
    }

    /**
     * Sets the value of field 'source'.
     * 
     * @param source the value of field 'source'.
     */
    public void setSource(
            final SourceReference source) {
        this._source = source;
    }

    /**
     * Method unmarshalSourceAndRoleReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.SourceAndRoleReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
