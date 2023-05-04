/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * A
 *  DirectoryEntry that identifies the elements of a resource
 * description that appear in every directory of resources of a
 * particular type. ResourceDescriptionDirectoryEntry is an
 * abstract type and is realized in
 *  the implementing subtypes listed in CTS2ResourceType
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class ResourceDescriptionDirectoryEntry extends DirectoryEntry
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the (or a) definitive URI that represents the resource being
     * described. 
     */
    private String _about;

    /**
     * the formal or officially assigned name of this resource
     */
    private String _formalName;

    /**
     * a textual summary of the resource - what it is, what it is
     * for, etc.
     */
    private EntryDescription _resourceSynopsis;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResourceDescriptionDirectoryEntry() {
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

        if (obj instanceof ResourceDescriptionDirectoryEntry) {

            ResourceDescriptionDirectoryEntry temp = (ResourceDescriptionDirectoryEntry)obj;
            if (this._about != null) {
                if (temp._about == null) return false;
                if (!this._about.equals(temp._about)) 
                    return false;
            } else if (temp._about != null)
                return false;
            if (this._formalName != null) {
                if (temp._formalName == null) return false;
                if (!this._formalName.equals(temp._formalName)) 
                    return false;
            } else if (temp._formalName != null)
                return false;
            if (this._resourceSynopsis != null) {
                if (temp._resourceSynopsis == null) return false;
                return this._resourceSynopsis.equals(temp._resourceSynopsis);
            } else return temp._resourceSynopsis == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'about'. The field 'about' has
     * the following description: the (or a) definitive URI that
     * represents the resource being described. 
     * 
     * @return the value of field 'About'.
     */
    public String getAbout(
    ) {
        return this._about;
    }

    /**
     * Returns the value of field 'formalName'. The field
     * 'formalName' has the following description: the formal or
     * officially assigned name of this resource
     * 
     * @return the value of field 'FormalName'.
     */
    public String getFormalName(
    ) {
        return this._formalName;
    }

    /**
     * Returns the value of field 'resourceSynopsis'. The field
     * 'resourceSynopsis' has the following description: a textual
     * summary of the resource - what it is, what it is for, etc.
     * 
     * @return the value of field 'ResourceSynopsis'.
     */
    public EntryDescription getResourceSynopsis(
    ) {
        return this._resourceSynopsis;
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
        if (_about != null) {
           result = 37 * result + _about.hashCode();
        }
        if (_formalName != null) {
           result = 37 * result + _formalName.hashCode();
        }
        if (_resourceSynopsis != null) {
           result = 37 * result + _resourceSynopsis.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Sets the value of field 'about'. The field 'about' has the
     * following description: the (or a) definitive URI that
     * represents the resource being described. 
     * 
     * @param about the value of field 'about'.
     */
    public void setAbout(
            final String about) {
        this._about = about;
    }

    /**
     * Sets the value of field 'formalName'. The field 'formalName'
     * has the following description: the formal or officially
     * assigned name of this resource
     * 
     * @param formalName the value of field 'formalName'.
     */
    public void setFormalName(
            final String formalName) {
        this._formalName = formalName;
    }

    /**
     * Sets the value of field 'resourceSynopsis'. The field
     * 'resourceSynopsis' has the following description: a textual
     * summary of the resource - what it is, what it is for, etc.
     * 
     * @param resourceSynopsis the value of field 'resourceSynopsis'
     */
    public void setResourceSynopsis(
            final EntryDescription resourceSynopsis) {
        this._resourceSynopsis = resourceSynopsis;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
