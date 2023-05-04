/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.statement;

/**
 * Metadata about a statement including provenance, external
 * identity, validity, etc. The subject of a qualifier is the
 * statement itself, not the statement subject.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class StatementQualifier extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A reference to the statement qualifier predicate. 
     */
    private edu.mayo.cts2.framework.model.core.URIAndEntityName _qualifierPredicate;

    /**
     * The CTS2 model attribute that represents this particular
     * statement qualifier
     */
    private edu.mayo.cts2.framework.model.core.ModelAttributeReference _associatedAttribute;

    /**
     * Field _target.
     */
    private edu.mayo.cts2.framework.model.core.StatementTarget _target;


      //----------------/
     //- Constructors -/
    //----------------/

    public StatementQualifier() {
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

        if (obj instanceof StatementQualifier) {

            StatementQualifier temp = (StatementQualifier)obj;
            if (this._qualifierPredicate != null) {
                if (temp._qualifierPredicate == null) return false;
                if (!this._qualifierPredicate.equals(temp._qualifierPredicate)) 
                    return false;
            } else if (temp._qualifierPredicate != null)
                return false;
            if (this._associatedAttribute != null) {
                if (temp._associatedAttribute == null) return false;
                if (!this._associatedAttribute.equals(temp._associatedAttribute)) 
                    return false;
            } else if (temp._associatedAttribute != null)
                return false;
            if (this._target != null) {
                if (temp._target == null) return false;
                return this._target.equals(temp._target);
            } else return temp._target == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'associatedAttribute'. The field
     * 'associatedAttribute' has the following description: The
     * CTS2 model attribute that represents this particular
     * statement qualifier
     * 
     * @return the value of field 'AssociatedAttribute'.
     */
    public edu.mayo.cts2.framework.model.core.ModelAttributeReference getAssociatedAttribute(
    ) {
        return this._associatedAttribute;
    }

    /**
     * Returns the value of field 'qualifierPredicate'. The field
     * 'qualifierPredicate' has the following description: A
     * reference to the statement qualifier predicate. 
     * 
     * @return the value of field 'QualifierPredicate'.
     */
    public edu.mayo.cts2.framework.model.core.URIAndEntityName getQualifierPredicate(
    ) {
        return this._qualifierPredicate;
    }

    /**
     * Returns the value of field 'target'.
     * 
     * @return the value of field 'Target'.
     */
    public edu.mayo.cts2.framework.model.core.StatementTarget getTarget(
    ) {
        return this._target;
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
        if (_qualifierPredicate != null) {
           result = 37 * result + _qualifierPredicate.hashCode();
        }
        if (_associatedAttribute != null) {
           result = 37 * result + _associatedAttribute.hashCode();
        }
        if (_target != null) {
           result = 37 * result + _target.hashCode();
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
     * Sets the value of field 'associatedAttribute'. The field
     * 'associatedAttribute' has the following description: The
     * CTS2 model attribute that represents this particular
     * statement qualifier
     * 
     * @param associatedAttribute the value of field
     * 'associatedAttribute'.
     */
    public void setAssociatedAttribute(
            final edu.mayo.cts2.framework.model.core.ModelAttributeReference associatedAttribute) {
        this._associatedAttribute = associatedAttribute;
    }

    /**
     * Sets the value of field 'qualifierPredicate'. The field
     * 'qualifierPredicate' has the following description: A
     * reference to the statement qualifier predicate. 
     * 
     * @param qualifierPredicate the value of field
     * 'qualifierPredicate'.
     */
    public void setQualifierPredicate(
            final edu.mayo.cts2.framework.model.core.URIAndEntityName qualifierPredicate) {
        this._qualifierPredicate = qualifierPredicate;
    }

    /**
     * Sets the value of field 'target'.
     * 
     * @param target the value of field 'target'.
     */
    public void setTarget(
            final edu.mayo.cts2.framework.model.core.StatementTarget target) {
        this._target = target;
    }

    /**
     * Method unmarshalStatementQualifier.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.statement.StatementQualifier
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
