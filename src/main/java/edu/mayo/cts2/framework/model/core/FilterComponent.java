/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * A restriction on an attribute, property or special field
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class FilterComponent extends ComponentReference
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the algorithm to be used for testing the referenced
     * component. Examples might include "starts with", "regular
     * expression match", "exists", "inRange", etc. NOTE: The CTS2
     * specification
     *  needs to establish a core set of match algorithms that all
     * compliant implementations must support.
     */
    private MatchAlgorithmReference _matchAlgorithm;

    /**
     * the value to be used in comparison. The structure and format
     * of matchValue depends on the specific matchAlgorithm. As an
     * example, a "startsWith" algorithm would be plain text, a
     *  "regularExpression" algorithm would have a regular
     * expression while an "exists" algorithm would have nothing in
     * the matchValue attribute.
     */
    private String _matchValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public FilterComponent() {
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

        if (obj instanceof FilterComponent) {

            FilterComponent temp = (FilterComponent)obj;
            if (this._matchAlgorithm != null) {
                if (temp._matchAlgorithm == null) return false;
                if (!this._matchAlgorithm.equals(temp._matchAlgorithm)) 
                    return false;
            } else if (temp._matchAlgorithm != null)
                return false;
            if (this._matchValue != null) {
                if (temp._matchValue == null) return false;
                return this._matchValue.equals(temp._matchValue);
            } else return temp._matchValue == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'matchAlgorithm'. The field
     * 'matchAlgorithm' has the following description: the
     * algorithm to be used for testing the referenced component.
     * Examples might include "starts with", "regular expression
     * match", "exists", "inRange", etc. NOTE: The CTS2
     * specification
     *  needs to establish a core set of match algorithms that all
     * compliant implementations must support.
     * 
     * @return the value of field 'MatchAlgorithm'.
     */
    public MatchAlgorithmReference getMatchAlgorithm(
    ) {
        return this._matchAlgorithm;
    }

    /**
     * Returns the value of field 'matchValue'. The field
     * 'matchValue' has the following description: the value to be
     * used in comparison. The structure and format of matchValue
     * depends on the specific matchAlgorithm. As an example, a
     * "startsWith" algorithm would be plain text, a
     *  "regularExpression" algorithm would have a regular
     * expression while an "exists" algorithm would have nothing in
     * the matchValue attribute.
     * 
     * @return the value of field 'MatchValue'.
     */
    public String getMatchValue(
    ) {
        return this._matchValue;
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
        if (_matchAlgorithm != null) {
           result = 37 * result + _matchAlgorithm.hashCode();
        }
        if (_matchValue != null) {
           result = 37 * result + _matchValue.hashCode();
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
     * Sets the value of field 'matchAlgorithm'. The field
     * 'matchAlgorithm' has the following description: the
     * algorithm to be used for testing the referenced component.
     * Examples might include "starts with", "regular expression
     * match", "exists", "inRange", etc. NOTE: The CTS2
     * specification
     *  needs to establish a core set of match algorithms that all
     * compliant implementations must support.
     * 
     * @param matchAlgorithm the value of field 'matchAlgorithm'.
     */
    public void setMatchAlgorithm(
            final MatchAlgorithmReference matchAlgorithm) {
        this._matchAlgorithm = matchAlgorithm;
    }

    /**
     * Sets the value of field 'matchValue'. The field 'matchValue'
     * has the following description: the value to be used in
     * comparison. The structure and format of matchValue depends
     * on the specific matchAlgorithm. As an example, a
     * "startsWith" algorithm would be plain text, a
     *  "regularExpression" algorithm would have a regular
     * expression while an "exists" algorithm would have nothing in
     * the matchValue attribute.
     * 
     * @param matchValue the value of field 'matchValue'.
     */
    public void setMatchValue(
            final String matchValue) {
        this._matchValue = matchValue;
    }

    /**
     * Method unmarshalFilterComponent.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.FilterComponent
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
