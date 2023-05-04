/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity;

/**
 * A choice of the possible types of entity description
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EntityDescription extends edu.mayo.cts2.framework.model.core.AbstractIsChangeableChoice 
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
     * Field _namedEntity.
     */
    private NamedEntityDescription _namedEntity;

    /**
     * Field _anonymousEntity.
     */
    private AnonymousEntityDescription _anonymousEntity;

    /**
     * Field _classDescription.
     */
    private ClassDescription _classDescription;

    /**
     * Field _dataTypeDescription.
     */
    private DataTypeDescription _dataTypeDescription;

    /**
     * Field _predicateDescription.
     */
    private PredicateDescription _predicateDescription;

    /**
     * Field _objectPropertyDescription.
     */
    private ObjectPropertyDescription _objectPropertyDescription;

    /**
     * Field _dataPropertyDescription.
     */
    private DataPropertyDescription _dataPropertyDescription;

    /**
     * Field _annotationPropertyDescription.
     */
    private AnnotationPropertyDescription _annotationPropertyDescription;

    /**
     * Field _namedIndividual.
     */
    private NamedIndividualDescription _namedIndividual;

    /**
     * Field _anonymousIndividual.
     */
    private AnonymousIndividualDescription _anonymousIndividual;


      //----------------/
     //- Constructors -/
    //----------------/

    public EntityDescription() {
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

        if (obj instanceof EntityDescription) {

            EntityDescription temp = (EntityDescription)obj;
            if (this._choiceValue != null) {
                if (temp._choiceValue == null) return false;
                if (!this._choiceValue.equals(temp._choiceValue)) 
                    return false;
            } else if (temp._choiceValue != null)
                return false;
            if (this._namedEntity != null) {
                if (temp._namedEntity == null) return false;
                if (!this._namedEntity.equals(temp._namedEntity)) 
                    return false;
            } else if (temp._namedEntity != null)
                return false;
            if (this._anonymousEntity != null) {
                if (temp._anonymousEntity == null) return false;
                if (!this._anonymousEntity.equals(temp._anonymousEntity)) 
                    return false;
            } else if (temp._anonymousEntity != null)
                return false;
            if (this._classDescription != null) {
                if (temp._classDescription == null) return false;
                if (!this._classDescription.equals(temp._classDescription)) 
                    return false;
            } else if (temp._classDescription != null)
                return false;
            if (this._dataTypeDescription != null) {
                if (temp._dataTypeDescription == null) return false;
                if (!this._dataTypeDescription.equals(temp._dataTypeDescription)) 
                    return false;
            } else if (temp._dataTypeDescription != null)
                return false;
            if (this._predicateDescription != null) {
                if (temp._predicateDescription == null) return false;
                if (!this._predicateDescription.equals(temp._predicateDescription)) 
                    return false;
            } else if (temp._predicateDescription != null)
                return false;
            if (this._objectPropertyDescription != null) {
                if (temp._objectPropertyDescription == null) return false;
                if (!this._objectPropertyDescription.equals(temp._objectPropertyDescription)) 
                    return false;
            } else if (temp._objectPropertyDescription != null)
                return false;
            if (this._dataPropertyDescription != null) {
                if (temp._dataPropertyDescription == null) return false;
                if (!this._dataPropertyDescription.equals(temp._dataPropertyDescription)) 
                    return false;
            } else if (temp._dataPropertyDescription != null)
                return false;
            if (this._annotationPropertyDescription != null) {
                if (temp._annotationPropertyDescription == null) return false;
                if (!this._annotationPropertyDescription.equals(temp._annotationPropertyDescription)) 
                    return false;
            } else if (temp._annotationPropertyDescription != null)
                return false;
            if (this._namedIndividual != null) {
                if (temp._namedIndividual == null) return false;
                if (!this._namedIndividual.equals(temp._namedIndividual)) 
                    return false;
            } else if (temp._namedIndividual != null)
                return false;
            if (this._anonymousIndividual != null) {
                if (temp._anonymousIndividual == null) return false;
                return this._anonymousIndividual.equals(temp._anonymousIndividual);
            } else return temp._anonymousIndividual == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'annotationPropertyDescription'.
     * 
     * @return the value of field 'AnnotationPropertyDescription'.
     */
    public AnnotationPropertyDescription getAnnotationPropertyDescription(
    ) {
        return this._annotationPropertyDescription;
    }

    /**
     * Returns the value of field 'anonymousEntity'.
     * 
     * @return the value of field 'AnonymousEntity'.
     */
    public AnonymousEntityDescription getAnonymousEntity(
    ) {
        return this._anonymousEntity;
    }

    /**
     * Returns the value of field 'anonymousIndividual'.
     * 
     * @return the value of field 'AnonymousIndividual'.
     */
    public AnonymousIndividualDescription getAnonymousIndividual(
    ) {
        return this._anonymousIndividual;
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
     * Returns the value of field 'classDescription'.
     * 
     * @return the value of field 'ClassDescription'.
     */
    public ClassDescription getClassDescription(
    ) {
        return this._classDescription;
    }

    /**
     * Returns the value of field 'dataPropertyDescription'.
     * 
     * @return the value of field 'DataPropertyDescription'.
     */
    public DataPropertyDescription getDataPropertyDescription(
    ) {
        return this._dataPropertyDescription;
    }

    /**
     * Returns the value of field 'dataTypeDescription'.
     * 
     * @return the value of field 'DataTypeDescription'.
     */
    public DataTypeDescription getDataTypeDescription(
    ) {
        return this._dataTypeDescription;
    }

    /**
     * Returns the value of field 'namedEntity'.
     * 
     * @return the value of field 'NamedEntity'.
     */
    public NamedEntityDescription getNamedEntity(
    ) {
        return this._namedEntity;
    }

    /**
     * Returns the value of field 'namedIndividual'.
     * 
     * @return the value of field 'NamedIndividual'.
     */
    public NamedIndividualDescription getNamedIndividual(
    ) {
        return this._namedIndividual;
    }

    /**
     * Returns the value of field 'objectPropertyDescription'.
     * 
     * @return the value of field 'ObjectPropertyDescription'.
     */
    public ObjectPropertyDescription getObjectPropertyDescription(
    ) {
        return this._objectPropertyDescription;
    }

    /**
     * Returns the value of field 'predicateDescription'.
     * 
     * @return the value of field 'PredicateDescription'.
     */
    public PredicateDescription getPredicateDescription(
    ) {
        return this._predicateDescription;
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
        if (_namedEntity != null) {
           result = 37 * result + _namedEntity.hashCode();
        }
        if (_anonymousEntity != null) {
           result = 37 * result + _anonymousEntity.hashCode();
        }
        if (_classDescription != null) {
           result = 37 * result + _classDescription.hashCode();
        }
        if (_dataTypeDescription != null) {
           result = 37 * result + _dataTypeDescription.hashCode();
        }
        if (_predicateDescription != null) {
           result = 37 * result + _predicateDescription.hashCode();
        }
        if (_objectPropertyDescription != null) {
           result = 37 * result + _objectPropertyDescription.hashCode();
        }
        if (_dataPropertyDescription != null) {
           result = 37 * result + _dataPropertyDescription.hashCode();
        }
        if (_annotationPropertyDescription != null) {
           result = 37 * result + _annotationPropertyDescription.hashCode();
        }
        if (_namedIndividual != null) {
           result = 37 * result + _namedIndividual.hashCode();
        }
        if (_anonymousIndividual != null) {
           result = 37 * result + _anonymousIndividual.hashCode();
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
     * Sets the value of field 'annotationPropertyDescription'.
     * 
     * @param annotationPropertyDescription the value of field
     * 'annotationPropertyDescription'.
     */
    public void setAnnotationPropertyDescription(
            final AnnotationPropertyDescription annotationPropertyDescription) {
        this._annotationPropertyDescription = annotationPropertyDescription;
        this._choiceValue = annotationPropertyDescription;
    }

    /**
     * Sets the value of field 'anonymousEntity'.
     * 
     * @param anonymousEntity the value of field 'anonymousEntity'.
     */
    public void setAnonymousEntity(
            final AnonymousEntityDescription anonymousEntity) {
        this._anonymousEntity = anonymousEntity;
        this._choiceValue = anonymousEntity;
    }

    /**
     * Sets the value of field 'anonymousIndividual'.
     * 
     * @param anonymousIndividual the value of field
     * 'anonymousIndividual'.
     */
    public void setAnonymousIndividual(
            final AnonymousIndividualDescription anonymousIndividual) {
        this._anonymousIndividual = anonymousIndividual;
        this._choiceValue = anonymousIndividual;
    }

    /**
     * Sets the value of field 'classDescription'.
     * 
     * @param classDescription the value of field 'classDescription'
     */
    public void setClassDescription(
            final ClassDescription classDescription) {
        this._classDescription = classDescription;
        this._choiceValue = classDescription;
    }

    /**
     * Sets the value of field 'dataPropertyDescription'.
     * 
     * @param dataPropertyDescription the value of field
     * 'dataPropertyDescription'.
     */
    public void setDataPropertyDescription(
            final DataPropertyDescription dataPropertyDescription) {
        this._dataPropertyDescription = dataPropertyDescription;
        this._choiceValue = dataPropertyDescription;
    }

    /**
     * Sets the value of field 'dataTypeDescription'.
     * 
     * @param dataTypeDescription the value of field
     * 'dataTypeDescription'.
     */
    public void setDataTypeDescription(
            final DataTypeDescription dataTypeDescription) {
        this._dataTypeDescription = dataTypeDescription;
        this._choiceValue = dataTypeDescription;
    }

    /**
     * Sets the value of field 'namedEntity'.
     * 
     * @param namedEntity the value of field 'namedEntity'.
     */
    public void setNamedEntity(
            final NamedEntityDescription namedEntity) {
        this._namedEntity = namedEntity;
        this._choiceValue = namedEntity;
    }

    /**
     * Sets the value of field 'namedIndividual'.
     * 
     * @param namedIndividual the value of field 'namedIndividual'.
     */
    public void setNamedIndividual(
            final NamedIndividualDescription namedIndividual) {
        this._namedIndividual = namedIndividual;
        this._choiceValue = namedIndividual;
    }

    /**
     * Sets the value of field 'objectPropertyDescription'.
     * 
     * @param objectPropertyDescription the value of field
     * 'objectPropertyDescription'.
     */
    public void setObjectPropertyDescription(
            final ObjectPropertyDescription objectPropertyDescription) {
        this._objectPropertyDescription = objectPropertyDescription;
        this._choiceValue = objectPropertyDescription;
    }

    /**
     * Sets the value of field 'predicateDescription'.
     * 
     * @param predicateDescription the value of field
     * 'predicateDescription'.
     */
    public void setPredicateDescription(
            final PredicateDescription predicateDescription) {
        this._predicateDescription = predicateDescription;
        this._choiceValue = predicateDescription;
    }

    /**
     * Method unmarshalEntityDescription.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.entity.EntityDescription
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
