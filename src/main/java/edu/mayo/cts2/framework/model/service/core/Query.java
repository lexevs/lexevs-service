/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

/**
 * Message structure for packaging and sending complex queries.
 *  
 *  A Query may contain a Filter, a Set Operation, or Both.
 *  
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Query extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The match algorithm of the filter to be applied. If a
     * 'setOperation' is specified, 
     *  the filter will apply to the resulting aggregate.
     *  
     */
    private NameOrURI _matchAlgorithm;

    /**
     * The match value of the filter to be applied. If a
     * 'setOperation' is specified, 
     *  the filter will apply to the resulting aggregate.
     *  
     */
    private String _matchValue;

    /**
     * The target components of the filter to be applied. If a
     * 'setOperation' is specified, 
     *  the filter will apply to the resulting aggregate.
     *  
     */
    private NameOrURIList _filterComponent;

    /**
     * The Set Operation to be applied to the two DirectoryURIs.
     *  
     */
    private edu.mayo.cts2.framework.model.core.types.SetOperator _setOperation;

    /**
     * Either a 'DirectoryURI' or a 'Query' may participate in a
     * Set Operation.
     *  
     */
    private Query6Choice _query6Choice;

    /**
     * Either a 'DirectoryURI' or a 'Query' may participate in a
     * Set Operation.
     *  
     */
    private Query6Choice2 _query6Choice2;


      //----------------/
     //- Constructors -/
    //----------------/

    public Query() {
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

        if (obj instanceof Query) {

            Query temp = (Query)obj;
            if (this._matchAlgorithm != null) {
                if (temp._matchAlgorithm == null) return false;
                if (!this._matchAlgorithm.equals(temp._matchAlgorithm)) 
                    return false;
            } else if (temp._matchAlgorithm != null)
                return false;
            if (this._matchValue != null) {
                if (temp._matchValue == null) return false;
                if (!this._matchValue.equals(temp._matchValue)) 
                    return false;
            } else if (temp._matchValue != null)
                return false;
            if (this._filterComponent != null) {
                if (temp._filterComponent == null) return false;
                if (!this._filterComponent.equals(temp._filterComponent)) 
                    return false;
            } else if (temp._filterComponent != null)
                return false;
            if (this._setOperation != null) {
                if (temp._setOperation == null) return false;
                if (!this._setOperation.equals(temp._setOperation)) 
                    return false;
            } else if (temp._setOperation != null)
                return false;
            if (this._query6Choice != null) {
                if (temp._query6Choice == null) return false;
                if (!this._query6Choice.equals(temp._query6Choice)) 
                    return false;
            } else if (temp._query6Choice != null)
                return false;
            if (this._query6Choice2 != null) {
                if (temp._query6Choice2 == null) return false;
                return this._query6Choice2.equals(temp._query6Choice2);
            } else return temp._query6Choice2 == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'filterComponent'. The field
     * 'filterComponent' has the following description: The target
     * components of the filter to be applied. If a 'setOperation'
     * is specified, 
     *  the filter will apply to the resulting aggregate.
     *  
     * 
     * @return the value of field 'FilterComponent'.
     */
    public NameOrURIList getFilterComponent(
    ) {
        return this._filterComponent;
    }

    /**
     * Returns the value of field 'matchAlgorithm'. The field
     * 'matchAlgorithm' has the following description: The match
     * algorithm of the filter to be applied. If a 'setOperation'
     * is specified, 
     *  the filter will apply to the resulting aggregate.
     *  
     * 
     * @return the value of field 'MatchAlgorithm'.
     */
    public NameOrURI getMatchAlgorithm(
    ) {
        return this._matchAlgorithm;
    }

    /**
     * Returns the value of field 'matchValue'. The field
     * 'matchValue' has the following description: The match value
     * of the filter to be applied. If a 'setOperation' is
     * specified, 
     *  the filter will apply to the resulting aggregate.
     *  
     * 
     * @return the value of field 'MatchValue'.
     */
    public String getMatchValue(
    ) {
        return this._matchValue;
    }

    /**
     * Returns the value of field 'query6Choice'. The field
     * 'query6Choice' has the following description: Either a
     * 'DirectoryURI' or a 'Query' may participate in a Set
     * Operation.
     *  
     * 
     * @return the value of field 'Query6Choice'.
     */
    public Query6Choice getQuery6Choice(
    ) {
        return this._query6Choice;
    }

    /**
     * Returns the value of field 'query6Choice2'. The field
     * 'query6Choice2' has the following description: Either a
     * 'DirectoryURI' or a 'Query' may participate in a Set
     * Operation.
     *  
     * 
     * @return the value of field 'Query6Choice2'.
     */
    public Query6Choice2 getQuery6Choice2(
    ) {
        return this._query6Choice2;
    }

    /**
     * Returns the value of field 'setOperation'. The field
     * 'setOperation' has the following description: The Set
     * Operation to be applied to the two DirectoryURIs.
     *  
     * 
     * @return the value of field 'SetOperation'.
     */
    public edu.mayo.cts2.framework.model.core.types.SetOperator getSetOperation(
    ) {
        return this._setOperation;
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
        if (_filterComponent != null) {
           result = 37 * result + _filterComponent.hashCode();
        }
        if (_setOperation != null) {
           result = 37 * result + _setOperation.hashCode();
        }
        if (_query6Choice != null) {
           result = 37 * result + _query6Choice.hashCode();
        }
        if (_query6Choice2 != null) {
           result = 37 * result + _query6Choice2.hashCode();
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
     * Sets the value of field 'filterComponent'. The field
     * 'filterComponent' has the following description: The target
     * components of the filter to be applied. If a 'setOperation'
     * is specified, 
     *  the filter will apply to the resulting aggregate.
     *  
     * 
     * @param filterComponent the value of field 'filterComponent'.
     */
    public void setFilterComponent(
            final NameOrURIList filterComponent) {
        this._filterComponent = filterComponent;
    }

    /**
     * Sets the value of field 'matchAlgorithm'. The field
     * 'matchAlgorithm' has the following description: The match
     * algorithm of the filter to be applied. If a 'setOperation'
     * is specified, 
     *  the filter will apply to the resulting aggregate.
     *  
     * 
     * @param matchAlgorithm the value of field 'matchAlgorithm'.
     */
    public void setMatchAlgorithm(
            final NameOrURI matchAlgorithm) {
        this._matchAlgorithm = matchAlgorithm;
    }

    /**
     * Sets the value of field 'matchValue'. The field 'matchValue'
     * has the following description: The match value of the filter
     * to be applied. If a 'setOperation' is specified, 
     *  the filter will apply to the resulting aggregate.
     *  
     * 
     * @param matchValue the value of field 'matchValue'.
     */
    public void setMatchValue(
            final String matchValue) {
        this._matchValue = matchValue;
    }

    /**
     * Sets the value of field 'query6Choice'. The field
     * 'query6Choice' has the following description: Either a
     * 'DirectoryURI' or a 'Query' may participate in a Set
     * Operation.
     *  
     * 
     * @param query6Choice the value of field 'query6Choice'.
     */
    public void setQuery6Choice(
            final Query6Choice query6Choice) {
        this._query6Choice = query6Choice;
    }

    /**
     * Sets the value of field 'query6Choice2'. The field
     * 'query6Choice2' has the following description: Either a
     * 'DirectoryURI' or a 'Query' may participate in a Set
     * Operation.
     *  
     * 
     * @param query6Choice2 the value of field 'query6Choice2'.
     */
    public void setQuery6Choice2(
            final Query6Choice2 query6Choice2) {
        this._query6Choice2 = query6Choice2;
    }

    /**
     * Sets the value of field 'setOperation'. The field
     * 'setOperation' has the following description: The Set
     * Operation to be applied to the two DirectoryURIs.
     *  
     * 
     * @param setOperation the value of field 'setOperation'.
     */
    public void setSetOperation(
            final edu.mayo.cts2.framework.model.core.types.SetOperator setOperation) {
        this._setOperation = setOperation;
    }

    /**
     * Method unmarshalQuery.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.Query
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
