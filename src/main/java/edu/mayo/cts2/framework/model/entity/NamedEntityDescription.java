/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.entity;

import edu.mayo.cts2.framework.model.core.ChangeableElementGroup;
import edu.mayo.cts2.framework.model.core.types.EntryState;

/**
 * An entity description that is referenced by a globally unique
 * external URI
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class NamedEntityDescription extends EntityDescriptionBase
implements java.io.Serializable, edu.mayo.cts2.framework.model.core.IsChangeable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an indicator that states whether the Changeable element is
     * ACTIVE, and subject to searching and browsing access or
     * INACTIVE, meaning that it is only accessible if its identity
     * is
     *  already known or if the service calls specifically state
     * that they want to see inactive service elements
     */
    private EntryState _entryState = EntryState.fromValue("ACTIVE");

    /**
     * Field _changeableElementGroup.
     */
    private ChangeableElementGroup _changeableElementGroup;


      //----------------/
     //- Constructors -/
    //----------------/

    public NamedEntityDescription() {
        super();
        setEntryState(EntryState.fromValue("ACTIVE"));
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

        if (obj instanceof NamedEntityDescription) {

            NamedEntityDescription temp = (NamedEntityDescription)obj;
            if (this._entryState != null) {
                if (temp._entryState == null) return false;
                if (!this._entryState.equals(temp._entryState)) 
                    return false;
            } else if (temp._entryState != null)
                return false;
            if (this._changeableElementGroup != null) {
                if (temp._changeableElementGroup == null) return false;
                return this._changeableElementGroup.equals(temp._changeableElementGroup);
            } else return temp._changeableElementGroup == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeableElementGroup'.
     * 
     * @return the value of field 'ChangeableElementGroup'.
     */
    public ChangeableElementGroup getChangeableElementGroup(
    ) {
        return this._changeableElementGroup;
    }

    /**
     * Returns the value of field 'entryState'. The field
     * 'entryState' has the following description: an indicator
     * that states whether the Changeable element is ACTIVE, and
     * subject to searching and browsing access or INACTIVE,
     * meaning that it is only accessible if its identity is
     *  already known or if the service calls specifically state
     * that they want to see inactive service elements
     * 
     * @return the value of field 'EntryState'.
     */
    public EntryState getEntryState(
    ) {
        return this._entryState;
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
        if (_entryState != null) {
           result = 37 * result + _entryState.hashCode();
        }
        if (_changeableElementGroup != null) {
           result = 37 * result + _changeableElementGroup.hashCode();
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
     * Sets the value of field 'changeableElementGroup'.
     * 
     * @param changeableElementGroup the value of field
     * 'changeableElementGroup'.
     */
    public void setChangeableElementGroup(
            final ChangeableElementGroup changeableElementGroup) {
        this._changeableElementGroup = changeableElementGroup;
    }

    /**
     * Sets the value of field 'entryState'. The field 'entryState'
     * has the following description: an indicator that states
     * whether the Changeable element is ACTIVE, and subject to
     * searching and browsing access or INACTIVE, meaning that it
     * is only accessible if its identity is
     *  already known or if the service calls specifically state
     * that they want to see inactive service elements
     * 
     * @param entryState the value of field 'entryState'.
     */
    public void setEntryState(
            final EntryState entryState) {
        this._entryState = entryState;
    }

    /**
     * Method unmarshalNamedEntityDescription.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.entity.NamedEntityDescription
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
