/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

import edu.mayo.cts2.framework.model.mapversion.types.MapProcessingRule;

/**
 * Class UpdatedProcessingRule.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedProcessingRule extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the rule for processing the member sets
     *  
     */
    private MapProcessingRule _processingRule;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedProcessingRule() {
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

        if (obj instanceof UpdatedProcessingRule) {

            UpdatedProcessingRule temp = (UpdatedProcessingRule)obj;
            if (this._processingRule != null) {
                if (temp._processingRule == null) return false;
                return this._processingRule.equals(temp._processingRule);
            } else return temp._processingRule == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'processingRule'. The field
     * 'processingRule' has the following description: the rule for
     * processing the member sets
     *  
     * 
     * @return the value of field 'ProcessingRule'.
     */
    public MapProcessingRule getProcessingRule(
    ) {
        return this._processingRule;
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
        if (_processingRule != null) {
           result = 37 * result + _processingRule.hashCode();
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
     * Sets the value of field 'processingRule'. The field
     * 'processingRule' has the following description: the rule for
     * processing the member sets
     *  
     * 
     * @param processingRule the value of field 'processingRule'.
     */
    public void setProcessingRule(
            final MapProcessingRule processingRule) {
        this._processingRule = processingRule;
    }

    /**
     * Method unmarshalUpdatedProcessingRule.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.UpdatedProcessingRule
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
