/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * Either a 'DirectoryURI' or a 'Query' may participate in a Set
 * Operation.
 *  
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Query5Choice extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The left-hand side of the Set Operation.
     *  
     */
    private Query _query1;

    /**
     * The left-hand side of the Set Operation.
     *  
     */
    private String _directoryUri1;


      //----------------/
     //- Constructors -/
    //----------------/

    public Query5Choice() {
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

        if (obj instanceof Query5Choice) {

            Query5Choice temp = (Query5Choice)obj;
            if (this._query1 != null) {
                if (temp._query1 == null) return false;
                if (!this._query1.equals(temp._query1)) 
                    return false;
            } else if (temp._query1 != null)
                return false;
            if (this._directoryUri1 != null) {
                if (temp._directoryUri1 == null) return false;
                return this._directoryUri1.equals(temp._directoryUri1);
            } else return temp._directoryUri1 == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'directoryUri1'. The field
     * 'directoryUri1' has the following description: The left-hand
     * side of the Set Operation.
     *  
     * 
     * @return the value of field 'DirectoryUri1'.
     */
    public String getDirectoryUri1(
    ) {
        return this._directoryUri1;
    }

    /**
     * Returns the value of field 'query1'. The field 'query1' has
     * the following description: The left-hand side of the Set
     * Operation.
     *  
     * 
     * @return the value of field 'Query1'.
     */
    public Query getQuery1(
    ) {
        return this._query1;
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
        if (_query1 != null) {
           result = 37 * result + _query1.hashCode();
        }
        if (_directoryUri1 != null) {
           result = 37 * result + _directoryUri1.hashCode();
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
     * Sets the value of field 'directoryUri1'. The field
     * 'directoryUri1' has the following description: The left-hand
     * side of the Set Operation.
     *  
     * 
     * @param directoryUri1 the value of field 'directoryUri1'.
     */
    public void setDirectoryUri1(
            final String directoryUri1) {
        this._directoryUri1 = directoryUri1;
    }

    /**
     * Sets the value of field 'query1'. The field 'query1' has the
     * following description: The left-hand side of the Set
     * Operation.
     *  
     * 
     * @param query1 the value of field 'query1'.
     */
    public void setQuery1(
            final Query query1) {
        this._query1 = query1;
    }

    /**
     * Method unmarshalQuery5Choice.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.Query5Choice
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
