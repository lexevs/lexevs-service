/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

/**
 * The set of parameters that can be updated in a map
 *  entry.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateMapEntryRequest extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedProcessingRule.
     */
    private UpdatedProcessingRule _updatedProcessingRule;

    /**
     * Field _updatedSource.
     */
    private UpdatedSource _updatedSource;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateMapEntryRequest() {
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

        if (obj instanceof UpdateMapEntryRequest) {

            UpdateMapEntryRequest temp = (UpdateMapEntryRequest)obj;
            if (this._updatedProcessingRule != null) {
                if (temp._updatedProcessingRule == null) return false;
                if (!this._updatedProcessingRule.equals(temp._updatedProcessingRule)) 
                    return false;
            } else if (temp._updatedProcessingRule != null)
                return false;
            if (this._updatedSource != null) {
                if (temp._updatedSource == null) return false;
                return this._updatedSource.equals(temp._updatedSource);
            } else return temp._updatedSource == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedProcessingRule'.
     * 
     * @return the value of field 'UpdatedProcessingRule'.
     */
    public UpdatedProcessingRule getUpdatedProcessingRule(
    ) {
        return this._updatedProcessingRule;
    }

    /**
     * Returns the value of field 'updatedSource'.
     * 
     * @return the value of field 'UpdatedSource'.
     */
    public UpdatedSource getUpdatedSource(
    ) {
        return this._updatedSource;
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
        if (_updatedProcessingRule != null) {
           result = 37 * result + _updatedProcessingRule.hashCode();
        }
        if (_updatedSource != null) {
           result = 37 * result + _updatedSource.hashCode();
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
     * Sets the value of field 'updatedProcessingRule'.
     * 
     * @param updatedProcessingRule the value of field
     * 'updatedProcessingRule'.
     */
    public void setUpdatedProcessingRule(
            final UpdatedProcessingRule updatedProcessingRule) {
        this._updatedProcessingRule = updatedProcessingRule;
    }

    /**
     * Sets the value of field 'updatedSource'.
     * 
     * @param updatedSource the value of field 'updatedSource'.
     */
    public void setUpdatedSource(
            final UpdatedSource updatedSource) {
        this._updatedSource = updatedSource;
    }

    /**
     * Method unmarshalUpdateMapEntryRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.UpdateMapEntryRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
