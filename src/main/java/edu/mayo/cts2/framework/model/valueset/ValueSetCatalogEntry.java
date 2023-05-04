/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valueset;

/**
 * An entry in a value set catalog that describes the purpose, use,
 * etc. of a value set.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetCatalogEntry extends edu.mayo.cts2.framework.model.core.AbstractResourceDescription 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the unique name of this value set within the context of the
     * CTS2 service instance. 
     */
    private String _valueSetName;

    /**
     * a DirectoryURI that references a set of definition
     * (versions) for this value set. If the service profile does
     * not support value set definitions, this attribute should be
     * omitted. If the
     *  service supports definitions but none are known for this
     * value set, the parameter should be supplied, but will
     * resolve to an empty directory.
     */
    private String _definitions;

    /**
     * a reference to the definition associated with the CURRENT
     * tag, if any 
     */
    private edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference _currentDefinition;

    /**
     * a URI that resolves to the resolution of this value set
     * using the CURRENT tag for both the definition and the code
     * system versions
     */
    private String _currentResolution;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetCatalogEntry() {
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

        if (obj instanceof ValueSetCatalogEntry) {

            ValueSetCatalogEntry temp = (ValueSetCatalogEntry)obj;
            if (this._valueSetName != null) {
                if (temp._valueSetName == null) return false;
                if (!this._valueSetName.equals(temp._valueSetName)) 
                    return false;
            } else if (temp._valueSetName != null)
                return false;
            if (this._definitions != null) {
                if (temp._definitions == null) return false;
                if (!this._definitions.equals(temp._definitions)) 
                    return false;
            } else if (temp._definitions != null)
                return false;
            if (this._currentDefinition != null) {
                if (temp._currentDefinition == null) return false;
                if (!this._currentDefinition.equals(temp._currentDefinition)) 
                    return false;
            } else if (temp._currentDefinition != null)
                return false;
            if (this._currentResolution != null) {
                if (temp._currentResolution == null) return false;
                return this._currentResolution.equals(temp._currentResolution);
            } else return temp._currentResolution == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'currentDefinition'. The field
     * 'currentDefinition' has the following description: a
     * reference to the definition associated with the CURRENT tag,
     * if any 
     * 
     * @return the value of field 'CurrentDefinition'.
     */
    public edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference getCurrentDefinition(
    ) {
        return this._currentDefinition;
    }

    /**
     * Returns the value of field 'currentResolution'. The field
     * 'currentResolution' has the following description: a URI
     * that resolves to the resolution of this value set using the
     * CURRENT tag for both the definition and the code system
     * versions
     * 
     * @return the value of field 'CurrentResolution'.
     */
    public String getCurrentResolution(
    ) {
        return this._currentResolution;
    }

    /**
     * Returns the value of field 'definitions'. The field
     * 'definitions' has the following description: a DirectoryURI
     * that references a set of definition (versions) for this
     * value set. If the service profile does not support value set
     * definitions, this attribute should be omitted. If the
     *  service supports definitions but none are known for this
     * value set, the parameter should be supplied, but will
     * resolve to an empty directory.
     * 
     * @return the value of field 'Definitions'.
     */
    public String getDefinitions(
    ) {
        return this._definitions;
    }

    /**
     * Returns the value of field 'valueSetName'. The field
     * 'valueSetName' has the following description: the unique
     * name of this value set within the context of the CTS2
     * service instance. 
     * 
     * @return the value of field 'ValueSetName'.
     */
    public String getValueSetName(
    ) {
        return this._valueSetName;
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
        if (_valueSetName != null) {
           result = 37 * result + _valueSetName.hashCode();
        }
        if (_definitions != null) {
           result = 37 * result + _definitions.hashCode();
        }
        if (_currentDefinition != null) {
           result = 37 * result + _currentDefinition.hashCode();
        }
        if (_currentResolution != null) {
           result = 37 * result + _currentResolution.hashCode();
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
     * Sets the value of field 'currentDefinition'. The field
     * 'currentDefinition' has the following description: a
     * reference to the definition associated with the CURRENT tag,
     * if any 
     * 
     * @param currentDefinition the value of field
     * 'currentDefinition'.
     */
    public void setCurrentDefinition(
            final edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference currentDefinition) {
        this._currentDefinition = currentDefinition;
    }

    /**
     * Sets the value of field 'currentResolution'. The field
     * 'currentResolution' has the following description: a URI
     * that resolves to the resolution of this value set using the
     * CURRENT tag for both the definition and the code system
     * versions
     * 
     * @param currentResolution the value of field
     * 'currentResolution'.
     */
    public void setCurrentResolution(
            final String currentResolution) {
        this._currentResolution = currentResolution;
    }

    /**
     * Sets the value of field 'definitions'. The field
     * 'definitions' has the following description: a DirectoryURI
     * that references a set of definition (versions) for this
     * value set. If the service profile does not support value set
     * definitions, this attribute should be omitted. If the
     *  service supports definitions but none are known for this
     * value set, the parameter should be supplied, but will
     * resolve to an empty directory.
     * 
     * @param definitions the value of field 'definitions'.
     */
    public void setDefinitions(
            final String definitions) {
        this._definitions = definitions;
    }

    /**
     * Sets the value of field 'valueSetName'. The field
     * 'valueSetName' has the following description: the unique
     * name of this value set within the context of the CTS2
     * service instance. 
     * 
     * @param valueSetName the value of field 'valueSetName'.
     */
    public void setValueSetName(
            final String valueSetName) {
        this._valueSetName = valueSetName;
    }

    /**
     * Method unmarshalValueSetCatalogEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valueset.ValueSetCatalogEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
