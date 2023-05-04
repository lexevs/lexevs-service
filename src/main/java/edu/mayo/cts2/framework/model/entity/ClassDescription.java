/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity;

import edu.mayo.cts2.framework.model.entity.types.ClassDescriptionState;
import edu.mayo.cts2.framework.model.entity.types.ClassDescriptionType;

/**
 * the description of an entity that is a Class, Type or "Concept".
 * "Classes can be understood as sets of
 *  individuals".
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ClassDescription extends NamedEntityDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the specific role that the class description plays, if known.
     */
    private ClassDescriptionType _descriptionType;

    /**
     * an indicator that states whether the class description
     * contains only necessary assertions (PRIMITIVE) or is
     * considered to be both necessary and sufficient assertions
     *  (FULLY_DEFINED).
     */
    private ClassDescriptionState _descriptionState;


      //----------------/
     //- Constructors -/
    //----------------/

    public ClassDescription() {
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

        if (obj instanceof ClassDescription) {

            ClassDescription temp = (ClassDescription)obj;
            if (this._descriptionType != null) {
                if (temp._descriptionType == null) return false;
                if (!this._descriptionType.equals(temp._descriptionType)) 
                    return false;
            } else if (temp._descriptionType != null)
                return false;
            if (this._descriptionState != null) {
                if (temp._descriptionState == null) return false;
                return this._descriptionState.equals(temp._descriptionState);
            } else return temp._descriptionState == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'descriptionState'. The field
     * 'descriptionState' has the following description: an
     * indicator that states whether the class description contains
     * only necessary assertions (PRIMITIVE) or is considered to be
     * both necessary and sufficient assertions
     *  (FULLY_DEFINED).
     * 
     * @return the value of field 'DescriptionState'.
     */
    public ClassDescriptionState getDescriptionState(
    ) {
        return this._descriptionState;
    }

    /**
     * Returns the value of field 'descriptionType'. The field
     * 'descriptionType' has the following description: the
     * specific role that the class description plays, if known.
     * 
     * @return the value of field 'DescriptionType'.
     */
    public ClassDescriptionType getDescriptionType(
    ) {
        return this._descriptionType;
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
        if (_descriptionType != null) {
           result = 37 * result + _descriptionType.hashCode();
        }
        if (_descriptionState != null) {
           result = 37 * result + _descriptionState.hashCode();
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
     * Sets the value of field 'descriptionState'. The field
     * 'descriptionState' has the following description: an
     * indicator that states whether the class description contains
     * only necessary assertions (PRIMITIVE) or is considered to be
     * both necessary and sufficient assertions
     *  (FULLY_DEFINED).
     * 
     * @param descriptionState the value of field 'descriptionState'
     */
    public void setDescriptionState(
            final ClassDescriptionState descriptionState) {
        this._descriptionState = descriptionState;
    }

    /**
     * Sets the value of field 'descriptionType'. The field
     * 'descriptionType' has the following description: the
     * specific role that the class description plays, if known.
     * 
     * @param descriptionType the value of field 'descriptionType'.
     */
    public void setDescriptionType(
            final ClassDescriptionType descriptionType) {
        this._descriptionType = descriptionType;
    }

    /**
     * Method unmarshalClassDescription.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.entity.ClassDescription
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
