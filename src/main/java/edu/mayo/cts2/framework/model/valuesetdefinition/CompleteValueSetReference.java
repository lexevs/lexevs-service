/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import edu.mayo.cts2.framework.model.core.ValueSetReference;

/**
 * A reference to a value set that, when resolved, results in a set
 * of entity references that are included in this entry. An entry
 * of this type can just name a value set, meaning that the
 * specific definition is
 *  determined in the resolve value set call, can name both a value
 * set and value set definition, meaning that the specific
 * definition is always used in the resolution. It can also specify
 * one or more code system versions to be
 *  used in the resolution of the named value set.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CompleteValueSetReference extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a reference to the value set whose definition supplies a set
     * of entity references.
     */
    private ValueSetReference _valueSet;

    /**
     * a reference to a particular definition of valueSet that is
     * to be used in resolving this reference. If absent, the
     * specific definition is determined by the resolve value set
     * call. If present,
     *  valueSetDefinition must be a definition of valueSet and
     * will always be used to resolve this entity set.
     */
    private ValueSetReference _valueSetDefinition;

    /**
     * a reference to a CodeSystemVersion that will be used to
     * resolve this call. referenceCodeSystemVersion will only be
     * used if one or more components of the resolution of valueSet
     *  identify a code system without specifying a specific
     * version. At most, only one version of a given code system
     * may appear in the referenceCodeSystemVersion list. While
     * CTS2 service implementations
     *  must resolve resolution calls for definitions that carry
     * unused referenceCodeSystemVersion entries, they may choose
     * to issue a warning at the time the definition is created or
     * loaded.
     */
    private CodeSystemVersionReference _referenceCodeSystemVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public CompleteValueSetReference() {
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

        if (obj instanceof CompleteValueSetReference) {

            CompleteValueSetReference temp = (CompleteValueSetReference)obj;
            if (this._valueSet != null) {
                if (temp._valueSet == null) return false;
                if (!this._valueSet.equals(temp._valueSet)) 
                    return false;
            } else if (temp._valueSet != null)
                return false;
            if (this._valueSetDefinition != null) {
                if (temp._valueSetDefinition == null) return false;
                if (!this._valueSetDefinition.equals(temp._valueSetDefinition)) 
                    return false;
            } else if (temp._valueSetDefinition != null)
                return false;
            if (this._referenceCodeSystemVersion != null) {
                if (temp._referenceCodeSystemVersion == null) return false;
                return this._referenceCodeSystemVersion.equals(temp._referenceCodeSystemVersion);
            } else return temp._referenceCodeSystemVersion == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'referenceCodeSystemVersion'. The
     * field 'referenceCodeSystemVersion' has the following
     * description: a reference to a CodeSystemVersion that will be
     * used to resolve this call. referenceCodeSystemVersion will
     * only be used if one or more components of the resolution of
     * valueSet
     *  identify a code system without specifying a specific
     * version. At most, only one version of a given code system
     * may appear in the referenceCodeSystemVersion list. While
     * CTS2 service implementations
     *  must resolve resolution calls for definitions that carry
     * unused referenceCodeSystemVersion entries, they may choose
     * to issue a warning at the time the definition is created or
     * loaded.
     * 
     * @return the value of field 'ReferenceCodeSystemVersion'.
     */
    public CodeSystemVersionReference getReferenceCodeSystemVersion(
    ) {
        return this._referenceCodeSystemVersion;
    }

    /**
     * Returns the value of field 'valueSet'. The field 'valueSet'
     * has the following description: a reference to the value set
     * whose definition supplies a set of entity references.
     * 
     * @return the value of field 'ValueSet'.
     */
    public ValueSetReference getValueSet(
    ) {
        return this._valueSet;
    }

    /**
     * Returns the value of field 'valueSetDefinition'. The field
     * 'valueSetDefinition' has the following description: a
     * reference to a particular definition of valueSet that is to
     * be used in resolving this reference. If absent, the specific
     * definition is determined by the resolve value set call. If
     * present,
     *  valueSetDefinition must be a definition of valueSet and
     * will always be used to resolve this entity set.
     * 
     * @return the value of field 'ValueSetDefinition'.
     */
    public ValueSetReference getValueSetDefinition(
    ) {
        return this._valueSetDefinition;
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
        if (_valueSet != null) {
           result = 37 * result + _valueSet.hashCode();
        }
        if (_valueSetDefinition != null) {
           result = 37 * result + _valueSetDefinition.hashCode();
        }
        if (_referenceCodeSystemVersion != null) {
           result = 37 * result + _referenceCodeSystemVersion.hashCode();
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
     * Sets the value of field 'referenceCodeSystemVersion'. The
     * field 'referenceCodeSystemVersion' has the following
     * description: a reference to a CodeSystemVersion that will be
     * used to resolve this call. referenceCodeSystemVersion will
     * only be used if one or more components of the resolution of
     * valueSet
     *  identify a code system without specifying a specific
     * version. At most, only one version of a given code system
     * may appear in the referenceCodeSystemVersion list. While
     * CTS2 service implementations
     *  must resolve resolution calls for definitions that carry
     * unused referenceCodeSystemVersion entries, they may choose
     * to issue a warning at the time the definition is created or
     * loaded.
     * 
     * @param referenceCodeSystemVersion the value of field
     * 'referenceCodeSystemVersion'.
     */
    public void setReferenceCodeSystemVersion(
            final CodeSystemVersionReference referenceCodeSystemVersion) {
        this._referenceCodeSystemVersion = referenceCodeSystemVersion;
    }

    /**
     * Sets the value of field 'valueSet'. The field 'valueSet' has
     * the following description: a reference to the value set
     * whose definition supplies a set of entity references.
     * 
     * @param valueSet the value of field 'valueSet'.
     */
    public void setValueSet(
            final ValueSetReference valueSet) {
        this._valueSet = valueSet;
    }

    /**
     * Sets the value of field 'valueSetDefinition'. The field
     * 'valueSetDefinition' has the following description: a
     * reference to a particular definition of valueSet that is to
     * be used in resolving this reference. If absent, the specific
     * definition is determined by the resolve value set call. If
     * present,
     *  valueSetDefinition must be a definition of valueSet and
     * will always be used to resolve this entity set.
     * 
     * @param valueSetDefinition the value of field
     * 'valueSetDefinition'.
     */
    public void setValueSetDefinition(
            final ValueSetReference valueSetDefinition) {
        this._valueSetDefinition = valueSetDefinition;
    }

    /**
     * Method unmarshalCompleteValueSetReference.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.CompleteValueSetReference
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
