/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.statement;

/**
 * The subject of a statement, which may either be a resource URI
 * or an entity reference, which includes both the URI and the
 * namespace/name.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class StatementSubject extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private Object _choiceValue;

    /**
     * A non-entity statement subject such as the URI of a
     * CodeSystem, CodeSystemVersion, ValueSet, etc.
     */
    private String _resource;

    /**
     * The subject of a statement about a class, role or individual.
     */
    private edu.mayo.cts2.framework.model.core.URIAndEntityName _entity;


      //----------------/
     //- Constructors -/
    //----------------/

    public StatementSubject() {
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

        if (obj instanceof StatementSubject) {

            StatementSubject temp = (StatementSubject)obj;
            if (this._choiceValue != null) {
                if (temp._choiceValue == null) return false;
                if (!this._choiceValue.equals(temp._choiceValue)) 
                    return false;
            } else if (temp._choiceValue != null)
                return false;
            if (this._resource != null) {
                if (temp._resource == null) return false;
                if (!this._resource.equals(temp._resource)) 
                    return false;
            } else if (temp._resource != null)
                return false;
            if (this._entity != null) {
                if (temp._entity == null) return false;
                return this._entity.equals(temp._entity);
            } else return temp._entity == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'entity'. The field 'entity' has
     * the following description: The subject of a statement about
     * a class, role or individual.
     * 
     * @return the value of field 'Entity'.
     */
    public edu.mayo.cts2.framework.model.core.URIAndEntityName getEntity(
    ) {
        return this._entity;
    }

    /**
     * Returns the value of field 'resource'. The field 'resource'
     * has the following description: A non-entity statement
     * subject such as the URI of a CodeSystem, CodeSystemVersion,
     * ValueSet, etc.
     * 
     * @return the value of field 'Resource'.
     */
    public String getResource(
    ) {
        return this._resource;
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
        if (_choiceValue != null) {
           result = 37 * result + _choiceValue.hashCode();
        }
        if (_resource != null) {
           result = 37 * result + _resource.hashCode();
        }
        if (_entity != null) {
           result = 37 * result + _entity.hashCode();
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
     * Sets the value of field 'entity'. The field 'entity' has the
     * following description: The subject of a statement about a
     * class, role or individual.
     * 
     * @param entity the value of field 'entity'.
     */
    public void setEntity(
            final edu.mayo.cts2.framework.model.core.URIAndEntityName entity) {
        this._entity = entity;
        this._choiceValue = entity;
    }

    /**
     * Sets the value of field 'resource'. The field 'resource' has
     * the following description: A non-entity statement subject
     * such as the URI of a CodeSystem, CodeSystemVersion,
     * ValueSet, etc.
     * 
     * @param resource the value of field 'resource'.
     */
    public void setResource(
            final String resource) {
        this._resource = resource;
        this._choiceValue = resource;
    }

    /**
     * Method unmarshalStatementSubject.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.statement.StatementSubject
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
