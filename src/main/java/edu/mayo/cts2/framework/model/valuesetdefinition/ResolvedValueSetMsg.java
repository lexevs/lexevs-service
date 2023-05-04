/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

/**
 * A ResolvedValueSet read from a service instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ResolvedValueSetMsg extends edu.mayo.cts2.framework.model.core.Message 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resolvedValueSet.
     */
    private ResolvedValueSet _resolvedValueSet;


      //----------------/
     //- Constructors -/
    //----------------/

    public ResolvedValueSetMsg() {
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

        if (obj instanceof ResolvedValueSetMsg) {

            ResolvedValueSetMsg temp = (ResolvedValueSetMsg)obj;
            if (this._resolvedValueSet != null) {
                if (temp._resolvedValueSet == null) return false;
                return this._resolvedValueSet.equals(temp._resolvedValueSet);
            } else return temp._resolvedValueSet == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'resolvedValueSet'.
     * 
     * @return the value of field 'ResolvedValueSet'.
     */
    public ResolvedValueSet getResolvedValueSet(
    ) {
        return this._resolvedValueSet;
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
        if (_resolvedValueSet != null) {
           result = 37 * result + _resolvedValueSet.hashCode();
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
     * Sets the value of field 'resolvedValueSet'.
     * 
     * @param resolvedValueSet the value of field 'resolvedValueSet'
     */
    public void setResolvedValueSet(
            final ResolvedValueSet resolvedValueSet) {
        this._resolvedValueSet = resolvedValueSet;
    }

    /**
     * Method unmarshalResolvedValueSetMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.ResolvedValueSetMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
