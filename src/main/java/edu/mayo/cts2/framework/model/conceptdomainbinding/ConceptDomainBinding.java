/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.conceptdomainbinding;

import edu.mayo.cts2.framework.model.core.BindingQualifierReference;
import edu.mayo.cts2.framework.model.core.Changeable;
import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import edu.mayo.cts2.framework.model.core.ConceptDomainReference;
import edu.mayo.cts2.framework.model.core.ContextReference;
import edu.mayo.cts2.framework.model.core.ValueSetDefinitionReference;
import edu.mayo.cts2.framework.model.core.ValueSetReference;

/**
 * The binding of a ConceptDomain and a ValueSet that supplies the
 * set of permissible value meanings in a given context.
 * ConceptDomainBinding can also bind specific value set
 * definitions
 *  and/or specific code system versions where desired. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ConceptDomainBinding extends Changeable
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The unique identifier of this particular binding instance.
     */
    private String _bindingURI;

    /**
     * the ConceptDomain being bound to a value set.
     */
    private ConceptDomainReference _bindingFor;

    /**
     * the bound value set
     */
    private ValueSetReference _boundValueSet;

    /**
     * a realm or context in which the particular binding applies.
     * If not present, the binding applies in any context not
     * stated in another binding
     */
    private ContextReference _applicableContext;

    /**
     * the specific definition of the value set to be bound. If not
     * specified, the definition that is used to determine the
     * permissible values is specified when the concept domain is
     * applied in the
     *  context.
     */
    private ValueSetDefinitionReference _boundValueSetDefinition;

    /**
     * the specific version(s) of the code systems to be used in
     * the resolution of the value set definition. Note that it is
     * also possible for value set definitions themselves to state
     * which version of
     *  a code system is to be used. When this is the case, the
     * code system version(s) specified in the ConceptDomainBinding
     * do not override those stated in the value set definition -
     * the value set definition
     *  version information takes precedence.
     */
    private CodeSystemVersionReference _useCodeSystemVersion;

    /**
     * additional information that qualifies the intent or purpose
     * of the binding. In the HL7 case, this is intended to
     * indicate "whether the binding is 'overall', 'minimum' or
     * 'maximum'." The actual
     *  interpretation of the qualifier is outside of the scope of
     * the CTS2 specification but, if present, bindingQualifier
     * contributes to the identity of the specific binding.
     */
    private BindingQualifierReference _bindingQualifier;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptDomainBinding() {
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

        if (obj instanceof ConceptDomainBinding) {

            ConceptDomainBinding temp = (ConceptDomainBinding)obj;
            if (this._bindingURI != null) {
                if (temp._bindingURI == null) return false;
                if (!this._bindingURI.equals(temp._bindingURI)) 
                    return false;
            } else if (temp._bindingURI != null)
                return false;
            if (this._bindingFor != null) {
                if (temp._bindingFor == null) return false;
                if (!this._bindingFor.equals(temp._bindingFor)) 
                    return false;
            } else if (temp._bindingFor != null)
                return false;
            if (this._boundValueSet != null) {
                if (temp._boundValueSet == null) return false;
                if (!this._boundValueSet.equals(temp._boundValueSet)) 
                    return false;
            } else if (temp._boundValueSet != null)
                return false;
            if (this._applicableContext != null) {
                if (temp._applicableContext == null) return false;
                if (!this._applicableContext.equals(temp._applicableContext)) 
                    return false;
            } else if (temp._applicableContext != null)
                return false;
            if (this._boundValueSetDefinition != null) {
                if (temp._boundValueSetDefinition == null) return false;
                if (!this._boundValueSetDefinition.equals(temp._boundValueSetDefinition)) 
                    return false;
            } else if (temp._boundValueSetDefinition != null)
                return false;
            if (this._useCodeSystemVersion != null) {
                if (temp._useCodeSystemVersion == null) return false;
                if (!this._useCodeSystemVersion.equals(temp._useCodeSystemVersion)) 
                    return false;
            } else if (temp._useCodeSystemVersion != null)
                return false;
            if (this._bindingQualifier != null) {
                if (temp._bindingQualifier == null) return false;
                return this._bindingQualifier.equals(temp._bindingQualifier);
            } else return temp._bindingQualifier == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'applicableContext'. The field
     * 'applicableContext' has the following description: a realm
     * or context in which the particular binding applies. If not
     * present, the binding applies in any context not stated in
     * another binding
     * 
     * @return the value of field 'ApplicableContext'.
     */
    public ContextReference getApplicableContext(
    ) {
        return this._applicableContext;
    }

    /**
     * Returns the value of field 'bindingFor'. The field
     * 'bindingFor' has the following description: the
     * ConceptDomain being bound to a value set.
     * 
     * @return the value of field 'BindingFor'.
     */
    public ConceptDomainReference getBindingFor(
    ) {
        return this._bindingFor;
    }

    /**
     * Returns the value of field 'bindingQualifier'. The field
     * 'bindingQualifier' has the following description: additional
     * information that qualifies the intent or purpose of the
     * binding. In the HL7 case, this is intended to indicate
     * "whether the binding is 'overall', 'minimum' or 'maximum'."
     * The actual
     *  interpretation of the qualifier is outside of the scope of
     * the CTS2 specification but, if present, bindingQualifier
     * contributes to the identity of the specific binding.
     * 
     * @return the value of field 'BindingQualifier'.
     */
    public BindingQualifierReference getBindingQualifier(
    ) {
        return this._bindingQualifier;
    }

    /**
     * Returns the value of field 'bindingURI'. The field
     * 'bindingURI' has the following description: The unique
     * identifier of this particular binding instance.
     * 
     * @return the value of field 'BindingURI'.
     */
    public String getBindingURI(
    ) {
        return this._bindingURI;
    }

    /**
     * Returns the value of field 'boundValueSet'. The field
     * 'boundValueSet' has the following description: the bound
     * value set
     * 
     * @return the value of field 'BoundValueSet'.
     */
    public ValueSetReference getBoundValueSet(
    ) {
        return this._boundValueSet;
    }

    /**
     * Returns the value of field 'boundValueSetDefinition'. The
     * field 'boundValueSetDefinition' has the following
     * description: the specific definition of the value set to be
     * bound. If not specified, the definition that is used to
     * determine the permissible values is specified when the
     * concept domain is applied in the
     *  context.
     * 
     * @return the value of field 'BoundValueSetDefinition'.
     */
    public ValueSetDefinitionReference getBoundValueSetDefinition(
    ) {
        return this._boundValueSetDefinition;
    }

    /**
     * Returns the value of field 'useCodeSystemVersion'. The field
     * 'useCodeSystemVersion' has the following description: the
     * specific version(s) of the code systems to be used in the
     * resolution of the value set definition. Note that it is also
     * possible for value set definitions themselves to state which
     * version of
     *  a code system is to be used. When this is the case, the
     * code system version(s) specified in the ConceptDomainBinding
     * do not override those stated in the value set definition -
     * the value set definition
     *  version information takes precedence.
     * 
     * @return the value of field 'UseCodeSystemVersion'.
     */
    public CodeSystemVersionReference getUseCodeSystemVersion(
    ) {
        return this._useCodeSystemVersion;
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
        if (_bindingURI != null) {
           result = 37 * result + _bindingURI.hashCode();
        }
        if (_bindingFor != null) {
           result = 37 * result + _bindingFor.hashCode();
        }
        if (_boundValueSet != null) {
           result = 37 * result + _boundValueSet.hashCode();
        }
        if (_applicableContext != null) {
           result = 37 * result + _applicableContext.hashCode();
        }
        if (_boundValueSetDefinition != null) {
           result = 37 * result + _boundValueSetDefinition.hashCode();
        }
        if (_useCodeSystemVersion != null) {
           result = 37 * result + _useCodeSystemVersion.hashCode();
        }
        if (_bindingQualifier != null) {
           result = 37 * result + _bindingQualifier.hashCode();
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
     * Sets the value of field 'applicableContext'. The field
     * 'applicableContext' has the following description: a realm
     * or context in which the particular binding applies. If not
     * present, the binding applies in any context not stated in
     * another binding
     * 
     * @param applicableContext the value of field
     * 'applicableContext'.
     */
    public void setApplicableContext(
            final ContextReference applicableContext) {
        this._applicableContext = applicableContext;
    }

    /**
     * Sets the value of field 'bindingFor'. The field 'bindingFor'
     * has the following description: the ConceptDomain being bound
     * to a value set.
     * 
     * @param bindingFor the value of field 'bindingFor'.
     */
    public void setBindingFor(
            final ConceptDomainReference bindingFor) {
        this._bindingFor = bindingFor;
    }

    /**
     * Sets the value of field 'bindingQualifier'. The field
     * 'bindingQualifier' has the following description: additional
     * information that qualifies the intent or purpose of the
     * binding. In the HL7 case, this is intended to indicate
     * "whether the binding is 'overall', 'minimum' or 'maximum'."
     * The actual
     *  interpretation of the qualifier is outside of the scope of
     * the CTS2 specification but, if present, bindingQualifier
     * contributes to the identity of the specific binding.
     * 
     * @param bindingQualifier the value of field 'bindingQualifier'
     */
    public void setBindingQualifier(
            final BindingQualifierReference bindingQualifier) {
        this._bindingQualifier = bindingQualifier;
    }

    /**
     * Sets the value of field 'bindingURI'. The field 'bindingURI'
     * has the following description: The unique identifier of this
     * particular binding instance.
     * 
     * @param bindingURI the value of field 'bindingURI'.
     */
    public void setBindingURI(
            final String bindingURI) {
        this._bindingURI = bindingURI;
    }

    /**
     * Sets the value of field 'boundValueSet'. The field
     * 'boundValueSet' has the following description: the bound
     * value set
     * 
     * @param boundValueSet the value of field 'boundValueSet'.
     */
    public void setBoundValueSet(
            final ValueSetReference boundValueSet) {
        this._boundValueSet = boundValueSet;
    }

    /**
     * Sets the value of field 'boundValueSetDefinition'. The field
     * 'boundValueSetDefinition' has the following description: the
     * specific definition of the value set to be bound. If not
     * specified, the definition that is used to determine the
     * permissible values is specified when the concept domain is
     * applied in the
     *  context.
     * 
     * @param boundValueSetDefinition the value of field
     * 'boundValueSetDefinition'.
     */
    public void setBoundValueSetDefinition(
            final ValueSetDefinitionReference boundValueSetDefinition) {
        this._boundValueSetDefinition = boundValueSetDefinition;
    }

    /**
     * Sets the value of field 'useCodeSystemVersion'. The field
     * 'useCodeSystemVersion' has the following description: the
     * specific version(s) of the code systems to be used in the
     * resolution of the value set definition. Note that it is also
     * possible for value set definitions themselves to state which
     * version of
     *  a code system is to be used. When this is the case, the
     * code system version(s) specified in the ConceptDomainBinding
     * do not override those stated in the value set definition -
     * the value set definition
     *  version information takes precedence.
     * 
     * @param useCodeSystemVersion the value of field
     * 'useCodeSystemVersion'.
     */
    public void setUseCodeSystemVersion(
            final CodeSystemVersionReference useCodeSystemVersion) {
        this._useCodeSystemVersion = useCodeSystemVersion;
    }

    /**
     * Method unmarshalConceptDomainBinding.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.conceptdomainbinding.ConceptDomainBinding
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
