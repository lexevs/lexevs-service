/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

/**
 * Class ResolvedValueSetSummary.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ResolvedValueSetSummary extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resolvedValueSetURI.
     */
    private String _resolvedValueSetURI;

    /**
     * Field _resolvedHeader.
     */
    private ResolvedValueSetHeader _resolvedHeader;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResolvedValueSetSummary() {
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

        if (obj instanceof ResolvedValueSetSummary) {

            ResolvedValueSetSummary temp = (ResolvedValueSetSummary)obj;
            if (this._resolvedValueSetURI != null) {
                if (temp._resolvedValueSetURI == null) return false;
                if (!this._resolvedValueSetURI.equals(temp._resolvedValueSetURI)) 
                    return false;
            } else if (temp._resolvedValueSetURI != null)
                return false;
            if (this._resolvedHeader != null) {
                if (temp._resolvedHeader == null) return false;
                return this._resolvedHeader.equals(temp._resolvedHeader);
            } else return temp._resolvedHeader == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'resolvedHeader'.
     * 
     * @return the value of field 'ResolvedHeader'.
     */
    public ResolvedValueSetHeader getResolvedHeader(
    ) {
        return this._resolvedHeader;
    }

    /**
     * Returns the value of field 'resolvedValueSetURI'.
     * 
     * @return the value of field 'ResolvedValueSetURI'.
     */
    public String getResolvedValueSetURI(
    ) {
        return this._resolvedValueSetURI;
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
        if (_resolvedValueSetURI != null) {
           result = 37 * result + _resolvedValueSetURI.hashCode();
        }
        if (_resolvedHeader != null) {
           result = 37 * result + _resolvedHeader.hashCode();
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
     * Sets the value of field 'resolvedHeader'.
     * 
     * @param resolvedHeader the value of field 'resolvedHeader'.
     */
    public void setResolvedHeader(
            final ResolvedValueSetHeader resolvedHeader) {
        this._resolvedHeader = resolvedHeader;
    }

    /**
     * Sets the value of field 'resolvedValueSetURI'.
     * 
     * @param resolvedValueSetURI the value of field
     * 'resolvedValueSetURI'.
     */
    public void setResolvedValueSetURI(
            final String resolvedValueSetURI) {
        this._resolvedValueSetURI = resolvedValueSetURI;
    }

    /**
     * Method unmarshalResolvedValueSetSummary.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.ResolvedValueSetSummary
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
