/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * a reference to a tag that can be assigned to versionable
 * resources within the context of a service implementation
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class VersionTagReference extends NameAndMeaningReference
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    


      //----------------/
     //- Constructors -/
    //----------------/

    public VersionTagReference() {
        super();
        setContent("");
    }

    public VersionTagReference(final String defaultValue) {
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

        if (obj instanceof VersionTagReference) {

            VersionTagReference temp = (VersionTagReference)obj;
            if (this._content != null) {
                if (temp._content == null) return false;
                return this._content.equals(temp._content);
            } else return temp._content == null;
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

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
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
     * Method unmarshalVersionTagReference.
     * 
     * @param reader

     * edu.mayo.cts2.framework.model.core.VersionTagReference
     */

    /**
     * 
     * 

//     */

}
