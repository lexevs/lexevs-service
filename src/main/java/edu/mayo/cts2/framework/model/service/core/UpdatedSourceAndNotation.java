/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.SourceAndNotation;

/**
 * Class UpdatedSourceAndNotation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedSourceAndNotation extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sourceAndNotation.
     */
    private SourceAndNotation _sourceAndNotation;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedSourceAndNotation() {
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

        if (obj instanceof UpdatedSourceAndNotation) {

            UpdatedSourceAndNotation temp = (UpdatedSourceAndNotation)obj;
            if (this._sourceAndNotation != null) {
                if (temp._sourceAndNotation == null) return false;
                return this._sourceAndNotation.equals(temp._sourceAndNotation);
            } else return temp._sourceAndNotation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'sourceAndNotation'.
     * 
     * @return the value of field 'SourceAndNotation'.
     */
    public SourceAndNotation getSourceAndNotation(
    ) {
        return this._sourceAndNotation;
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
        if (_sourceAndNotation != null) {
           result = 37 * result + _sourceAndNotation.hashCode();
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
     * Sets the value of field 'sourceAndNotation'.
     * 
     * @param sourceAndNotation the value of field
     * 'sourceAndNotation'.
     */
    public void setSourceAndNotation(
            final SourceAndNotation sourceAndNotation) {
        this._sourceAndNotation = sourceAndNotation;
    }

    /**
     * Method unmarshalUpdatedSourceAndNotation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedSourceAndNotation
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
