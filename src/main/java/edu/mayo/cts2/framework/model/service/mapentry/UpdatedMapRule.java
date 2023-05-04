/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

/**
 * Class UpdatedMapRule.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedMapRule extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the map rule for the target. If omitted, the rule
     *  always evaluates to TRUE
     */
    private edu.mayo.cts2.framework.model.mapversion.MapRule _mapRule;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedMapRule() {
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

        if (obj instanceof UpdatedMapRule) {

            UpdatedMapRule temp = (UpdatedMapRule)obj;
            if (this._mapRule != null) {
                if (temp._mapRule == null) return false;
                return this._mapRule.equals(temp._mapRule);
            } else return temp._mapRule == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'mapRule'. The field 'mapRule'
     * has the following description: the map rule for the target.
     * If omitted, the rule
     *  always evaluates to TRUE
     * 
     * @return the value of field 'MapRule'.
     */
    public edu.mayo.cts2.framework.model.mapversion.MapRule getMapRule(
    ) {
        return this._mapRule;
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
        if (_mapRule != null) {
           result = 37 * result + _mapRule.hashCode();
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
     * Sets the value of field 'mapRule'. The field 'mapRule' has
     * the following description: the map rule for the target. If
     * omitted, the rule
     *  always evaluates to TRUE
     * 
     * @param mapRule the value of field 'mapRule'.
     */
    public void setMapRule(
            final edu.mayo.cts2.framework.model.mapversion.MapRule mapRule) {
        this._mapRule = mapRule;
    }

    /**
     * Method unmarshalUpdatedMapRule.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.UpdatedMapRule
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
