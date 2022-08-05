/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.conceptdomainbinding;

import edu.mayo.cts2.framework.model.core.BindingQualifierReference;
import edu.mayo.cts2.framework.model.core.ConceptDomainReference;
import edu.mayo.cts2.framework.model.core.ContextReference;
import edu.mayo.cts2.framework.model.core.ResourceDescriptionDirectoryEntry;
import edu.mayo.cts2.framework.model.core.ValueSetReference;

/**
 * A synopsis of a ConceptDomainBinding along with information
 * about how to access the complete resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ConceptDomainBindingDirectoryEntry extends ResourceDescriptionDirectoryEntry
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the ConceptDomain being bound to a value set
     */
    private ConceptDomainReference _bindingFor;

    /**
     * the ValueSet being bound
     */
    private ValueSetReference _boundValueSet;

    /**
     * additional information that qualifies the intent or purpose
     * of the binding. 
     */
    private BindingQualifierReference _bindingQualifier;

    /**
     * the context or realm in which the binding applies
     */
    private ContextReference _applicableContext;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConceptDomainBindingDirectoryEntry() {
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

        if (obj instanceof ConceptDomainBindingDirectoryEntry) {

            ConceptDomainBindingDirectoryEntry temp = (ConceptDomainBindingDirectoryEntry)obj;
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
            if (this._bindingQualifier != null) {
                if (temp._bindingQualifier == null) return false;
                if (!this._bindingQualifier.equals(temp._bindingQualifier)) 
                    return false;
            } else if (temp._bindingQualifier != null)
                return false;
            if (this._applicableContext != null) {
                if (temp._applicableContext == null) return false;
                return this._applicableContext.equals(temp._applicableContext);
            } else return temp._applicableContext == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'applicableContext'. The field
     * 'applicableContext' has the following description: the
     * context or realm in which the binding applies
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
     * ConceptDomain being bound to a value set
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
     * binding. 
     * 
     * @return the value of field 'BindingQualifier'.
     */
    public BindingQualifierReference getBindingQualifier(
    ) {
        return this._bindingQualifier;
    }

    /**
     * Returns the value of field 'boundValueSet'. The field
     * 'boundValueSet' has the following description: the ValueSet
     * being bound
     * 
     * @return the value of field 'BoundValueSet'.
     */
    public ValueSetReference getBoundValueSet(
    ) {
        return this._boundValueSet;
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
        if (_bindingFor != null) {
           result = 37 * result + _bindingFor.hashCode();
        }
        if (_boundValueSet != null) {
           result = 37 * result + _boundValueSet.hashCode();
        }
        if (_bindingQualifier != null) {
           result = 37 * result + _bindingQualifier.hashCode();
        }
        if (_applicableContext != null) {
           result = 37 * result + _applicableContext.hashCode();
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
     * 'applicableContext' has the following description: the
     * context or realm in which the binding applies
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
     * to a value set
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
     * binding. 
     * 
     * @param bindingQualifier the value of field 'bindingQualifier'
     */
    public void setBindingQualifier(
            final BindingQualifierReference bindingQualifier) {
        this._bindingQualifier = bindingQualifier;
    }

    /**
     * Sets the value of field 'boundValueSet'. The field
     * 'boundValueSet' has the following description: the ValueSet
     * being bound
     * 
     * @param boundValueSet the value of field 'boundValueSet'.
     */
    public void setBoundValueSet(
            final ValueSetReference boundValueSet) {
        this._boundValueSet = boundValueSet;
    }

    /**
     * Method unmarshalConceptDomainBindingDirectoryEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.conceptdomainbinding.ConceptDomainBindingDirectoryEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
