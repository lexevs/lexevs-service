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
public class QueryChoice2 extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The right-hand side of the Set Operation.
     *  
     */
    private Query _query2;

    /**
     * The right-hand side of the Set Operation.
     *  
     */
    private String _directoryUri2;


      //----------------/
     //- Constructors -/
    //----------------/

    public QueryChoice2() {
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

        if (obj instanceof QueryChoice2) {

            QueryChoice2 temp = (QueryChoice2)obj;
            if (this._query2 != null) {
                if (temp._query2 == null) return false;
                if (!this._query2.equals(temp._query2)) 
                    return false;
            } else if (temp._query2 != null)
                return false;
            if (this._directoryUri2 != null) {
                if (temp._directoryUri2 == null) return false;
                return this._directoryUri2.equals(temp._directoryUri2);
            } else return temp._directoryUri2 == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'directoryUri2'. The field
     * 'directoryUri2' has the following description: The
     * right-hand side of the Set Operation.
     *  
     * 
     * @return the value of field 'DirectoryUri2'.
     */
    public String getDirectoryUri2(
    ) {
        return this._directoryUri2;
    }

    /**
     * Returns the value of field 'query2'. The field 'query2' has
     * the following description: The right-hand side of the Set
     * Operation.
     *  
     * 
     * @return the value of field 'Query2'.
     */
    public Query getQuery2(
    ) {
        return this._query2;
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
        if (_query2 != null) {
           result = 37 * result + _query2.hashCode();
        }
        if (_directoryUri2 != null) {
           result = 37 * result + _directoryUri2.hashCode();
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
     * Sets the value of field 'directoryUri2'. The field
     * 'directoryUri2' has the following description: The
     * right-hand side of the Set Operation.
     *  
     * 
     * @param directoryUri2 the value of field 'directoryUri2'.
     */
    public void setDirectoryUri2(
            final String directoryUri2) {
        this._directoryUri2 = directoryUri2;
    }

    /**
     * Sets the value of field 'query2'. The field 'query2' has the
     * following description: The right-hand side of the Set
     * Operation.
     *  
     * 
     * @param query2 the value of field 'query2'.
     */
    public void setQuery2(
            final Query query2) {
        this._query2 = query2;
    }

    /**
     * Method unmarshalQueryChoice2.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.QueryChoice2
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
