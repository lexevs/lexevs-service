/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valueset;

import edu.mayo.cts2.framework.model.core.AbstractResourceDescriptionDirectoryEntry;
import edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference;

/**
 * A synopsis of a ValueSet along with information about how to
 * access the complete resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetCatalogEntrySummary extends AbstractResourceDescriptionDirectoryEntry
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the local identifier assigned to the value set within the
     * context of the service
     */
    private String _valueSetName;

    /**
     * the name and URI of the value set definition that is
     * associated with the CURRENT tag for this value set. 
     */
    private ValueSetDefinitionReference _currentDefinition;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetCatalogEntrySummary() {
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

        if (obj instanceof ValueSetCatalogEntrySummary) {

            ValueSetCatalogEntrySummary temp = (ValueSetCatalogEntrySummary)obj;
            if (this._valueSetName != null) {
                if (temp._valueSetName == null) return false;
                if (!this._valueSetName.equals(temp._valueSetName)) 
                    return false;
            } else if (temp._valueSetName != null)
                return false;
            if (this._currentDefinition != null) {
                if (temp._currentDefinition == null) return false;
                return this._currentDefinition.equals(temp._currentDefinition);
            } else return temp._currentDefinition == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'currentDefinition'. The field
     * 'currentDefinition' has the following description: the name
     * and URI of the value set definition that is associated with
     * the CURRENT tag for this value set. 
     * 
     * @return the value of field 'CurrentDefinition'.
     */
    public ValueSetDefinitionReference getCurrentDefinition(
    ) {
        return this._currentDefinition;
    }

    /**
     * Returns the value of field 'valueSetName'. The field
     * 'valueSetName' has the following description: the local
     * identifier assigned to the value set within the context of
     * the service
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
        if (_currentDefinition != null) {
           result = 37 * result + _currentDefinition.hashCode();
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
     * 'currentDefinition' has the following description: the name
     * and URI of the value set definition that is associated with
     * the CURRENT tag for this value set. 
     * 
     * @param currentDefinition the value of field
     * 'currentDefinition'.
     */
    public void setCurrentDefinition(
            final ValueSetDefinitionReference currentDefinition) {
        this._currentDefinition = currentDefinition;
    }

    /**
     * Sets the value of field 'valueSetName'. The field
     * 'valueSetName' has the following description: the local
     * identifier assigned to the value set within the context of
     * the service
     * 
     * @param valueSetName the value of field 'valueSetName'.
     */
    public void setValueSetName(
            final String valueSetName) {
        this._valueSetName = valueSetName;
    }

    /**
     * Method unmarshalValueSetCatalogEntrySummary.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valueset.ValueSetCatalogEntrySummary
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
