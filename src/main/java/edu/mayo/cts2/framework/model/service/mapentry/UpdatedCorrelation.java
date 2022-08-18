/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

/**
 * Class UpdatedCorrelation.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedCorrelation extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name or URI of a correlation factor
     *  
     */
    private edu.mayo.cts2.framework.model.core.MapCorrelationReference _correlation;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedCorrelation() {
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

        if (obj instanceof UpdatedCorrelation) {

            UpdatedCorrelation temp = (UpdatedCorrelation)obj;
            if (this._correlation != null) {
                if (temp._correlation == null) return false;
                return this._correlation.equals(temp._correlation);
            } else return temp._correlation == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'correlation'. The field
     * 'correlation' has the following description: the name or URI
     * of a correlation factor
     *  
     * 
     * @return the value of field 'Correlation'.
     */
    public edu.mayo.cts2.framework.model.core.MapCorrelationReference getCorrelation(
    ) {
        return this._correlation;
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
        if (_correlation != null) {
           result = 37 * result + _correlation.hashCode();
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
     * Sets the value of field 'correlation'. The field
     * 'correlation' has the following description: the name or URI
     * of a correlation factor
     *  
     * 
     * @param correlation the value of field 'correlation'.
     */
    public void setCorrelation(
            final edu.mayo.cts2.framework.model.core.MapCorrelationReference correlation) {
        this._correlation = correlation;
    }

    /**
     * Method unmarshalUpdatedCorrelation.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.UpdatedCorrelation
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
