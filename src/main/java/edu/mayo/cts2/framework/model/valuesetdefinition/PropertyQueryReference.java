/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

/**
 * A description of a set of entity references that are determined
 * by applying a filter to the attribute(s) or property(s) that
 * appear in an EntityDescription in a specified code system.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class PropertyQueryReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The code system that contains the assertions that form the
     * attributes or properties to be tested.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemReference _codeSystem;

    /**
     * The version of the code system that makes the assertions. If
     * present, codeSystemVersion must be a version of codeSystem.
     * If this attribute is present, the referenced version of the
     * code
     *  system will always be used to resolve the attributes or
     * properties. If absent, the specific version of the code
     * system to be used in resolution is determined in the resolve
     * value set definition call
     *  itself.
     */
    private edu.mayo.cts2.framework.model.core.CodeSystemVersionReference _codeSystemVersion;

    /**
     * The filter to be applied to entities in the referenced code
     * system. 
     */
    private edu.mayo.cts2.framework.model.core.FilterComponent _filter;


      //----------------/
     //- Constructors -/
    //----------------/

    public PropertyQueryReference() {
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

        if (obj instanceof PropertyQueryReference) {

            PropertyQueryReference temp = (PropertyQueryReference)obj;
            if (this._codeSystem != null) {
                if (temp._codeSystem == null) return false;
                if (!this._codeSystem.equals(temp._codeSystem)) 
                    return false;
            } else if (temp._codeSystem != null)
                return false;
            if (this._codeSystemVersion != null) {
                if (temp._codeSystemVersion == null) return false;
                if (!this._codeSystemVersion.equals(temp._codeSystemVersion)) 
                    return false;
            } else if (temp._codeSystemVersion != null)
                return false;
            if (this._filter != null) {
                if (temp._filter == null) return false;
                return this._filter.equals(temp._filter);
            } else return temp._filter == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'codeSystem'. The field
     * 'codeSystem' has the following description: The code system
     * that contains the assertions that form the attributes or
     * properties to be tested.
     * 
     * @return the value of field 'CodeSystem'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemReference getCodeSystem(
    ) {
        return this._codeSystem;
    }

    /**
     * Returns the value of field 'codeSystemVersion'. The field
     * 'codeSystemVersion' has the following description: The
     * version of the code system that makes the assertions. If
     * present, codeSystemVersion must be a version of codeSystem.
     * If this attribute is present, the referenced version of the
     * code
     *  system will always be used to resolve the attributes or
     * properties. If absent, the specific version of the code
     * system to be used in resolution is determined in the resolve
     * value set definition call
     *  itself.
     * 
     * @return the value of field 'CodeSystemVersion'.
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference getCodeSystemVersion(
    ) {
        return this._codeSystemVersion;
    }

    /**
     * Returns the value of field 'filter'. The field 'filter' has
     * the following description: The filter to be applied to
     * entities in the referenced code system. 
     * 
     * @return the value of field 'Filter'.
     */
    public edu.mayo.cts2.framework.model.core.FilterComponent getFilter(
    ) {
        return this._filter;
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
        if (_codeSystem != null) {
           result = 37 * result + _codeSystem.hashCode();
        }
        if (_codeSystemVersion != null) {
           result = 37 * result + _codeSystemVersion.hashCode();
        }
        if (_filter != null) {
           result = 37 * result + _filter.hashCode();
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
     * Sets the value of field 'codeSystem'. The field 'codeSystem'
     * has the following description: The code system that contains
     * the assertions that form the attributes or properties to be
     * tested.
     * 
     * @param codeSystem the value of field 'codeSystem'.
     */
    public void setCodeSystem(
            final edu.mayo.cts2.framework.model.core.CodeSystemReference codeSystem) {
        this._codeSystem = codeSystem;
    }

    /**
     * Sets the value of field 'codeSystemVersion'. The field
     * 'codeSystemVersion' has the following description: The
     * version of the code system that makes the assertions. If
     * present, codeSystemVersion must be a version of codeSystem.
     * If this attribute is present, the referenced version of the
     * code
     *  system will always be used to resolve the attributes or
     * properties. If absent, the specific version of the code
     * system to be used in resolution is determined in the resolve
     * value set definition call
     *  itself.
     * 
     * @param codeSystemVersion the value of field
     * 'codeSystemVersion'.
     */
    public void setCodeSystemVersion(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference codeSystemVersion) {
        this._codeSystemVersion = codeSystemVersion;
    }

    /**
     * Sets the value of field 'filter'. The field 'filter' has the
     * following description: The filter to be applied to entities
     * in the referenced code system. 
     * 
     * @param filter the value of field 'filter'.
     */
    public void setFilter(
            final edu.mayo.cts2.framework.model.core.FilterComponent filter) {
        this._filter = filter;
    }

    /**
     * Method unmarshalPropertyQueryReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.PropertyQueryReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
