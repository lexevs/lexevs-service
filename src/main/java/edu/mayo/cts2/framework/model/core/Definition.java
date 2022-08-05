/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * Text or other representation that is intended to communicate the
 * intended meaning of the associated entity to a human being.
 * While this is intended to be very close in meaning to
 * skos:definition, its intent is slightly different in that the
 * CTS2 specification does not treat definition as a subproperty of
 * note -
 *  rather it views comments, examples and definitions as separate
 * entities.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Definition extends Note
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the role that the definition plays with respect to the
     * defined entity
     */
    private edu.mayo.cts2.framework.model.core.types.DefinitionRole _definitionRole = edu.mayo.cts2.framework.model.core.types.DefinitionRole.fromValue("NORMATIVE");

    /**
     * the context(s) in which the definition is considered
     * applicable
     */
    private ContextReference _usageContext;


      //----------------/
     //- Constructors -/
    //----------------/

    public Definition() {
        super();
        setDefinitionRole(edu.mayo.cts2.framework.model.core.types.DefinitionRole.fromValue("NORMATIVE"));
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

        if (obj instanceof Definition) {

            Definition temp = (Definition)obj;
            if (this._definitionRole != null) {
                if (temp._definitionRole == null) return false;
                if (!this._definitionRole.equals(temp._definitionRole)) 
                    return false;
            } else if (temp._definitionRole != null)
                return false;
            if (this._usageContext != null) {
                if (temp._usageContext == null) return false;
                return this._usageContext.equals(temp._usageContext);
            } else return temp._usageContext == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'definitionRole'. The field
     * 'definitionRole' has the following description: the role
     * that the definition plays with respect to the defined entity
     * 
     * @return the value of field 'DefinitionRole'.
     */
    public edu.mayo.cts2.framework.model.core.types.DefinitionRole getDefinitionRole(
    ) {
        return this._definitionRole;
    }

    /**
     * Returns the value of field 'usageContext'. The field
     * 'usageContext' has the following description: the context(s)
     * in which the definition is considered applicable
     * 
     * @return the value of field 'UsageContext'.
     */
    public ContextReference getUsageContext(
    ) {
        return this._usageContext;
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
        if (_definitionRole != null) {
           result = 37 * result + _definitionRole.hashCode();
        }
        if (_usageContext != null) {
           result = 37 * result + _usageContext.hashCode();
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
     * Sets the value of field 'definitionRole'. The field
     * 'definitionRole' has the following description: the role
     * that the definition plays with respect to the defined entity
     * 
     * @param definitionRole the value of field 'definitionRole'.
     */
    public void setDefinitionRole(
            final edu.mayo.cts2.framework.model.core.types.DefinitionRole definitionRole) {
        this._definitionRole = definitionRole;
    }

    /**
     * Sets the value of field 'usageContext'. The field
     * 'usageContext' has the following description: the context(s)
     * in which the definition is considered applicable
     * 
     * @param usageContext the value of field 'usageContext'.
     */
    public void setUsageContext(
            final ContextReference usageContext) {
        this._usageContext = usageContext;
    }

    /**
     * Method unmarshalDefinition.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.Definition
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
