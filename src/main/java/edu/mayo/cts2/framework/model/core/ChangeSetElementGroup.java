/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * Class ChangeSetElementGroup.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ChangeSetElementGroup extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the person or organization who initially created the change
     * set
     */
    private SourceReference _creator;

    /**
     * documentation and instructions about the purpose and
     * application of the change set
     */
    private OpaqueData _changeInstructions;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChangeSetElementGroup() {
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

        if (obj instanceof ChangeSetElementGroup) {

            ChangeSetElementGroup temp = (ChangeSetElementGroup)obj;
            if (this._creator != null) {
                if (temp._creator == null) return false;
                if (!this._creator.equals(temp._creator)) 
                    return false;
            } else if (temp._creator != null)
                return false;
            if (this._changeInstructions != null) {
                if (temp._changeInstructions == null) return false;
                return this._changeInstructions.equals(temp._changeInstructions);
            } else return temp._changeInstructions == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeInstructions'. The field
     * 'changeInstructions' has the following description:
     * documentation and instructions about the purpose and
     * application of the change set
     * 
     * @return the value of field 'ChangeInstructions'.
     */
    public OpaqueData getChangeInstructions(
    ) {
        return this._changeInstructions;
    }

    /**
     * Returns the value of field 'creator'. The field 'creator'
     * has the following description: the person or organization
     * who initially created the change set
     * 
     * @return the value of field 'Creator'.
     */
    public SourceReference getCreator(
    ) {
        return this._creator;
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
        if (_creator != null) {
           result = 37 * result + _creator.hashCode();
        }
        if (_changeInstructions != null) {
           result = 37 * result + _changeInstructions.hashCode();
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
     * Sets the value of field 'changeInstructions'. The field
     * 'changeInstructions' has the following description:
     * documentation and instructions about the purpose and
     * application of the change set
     * 
     * @param changeInstructions the value of field
     * 'changeInstructions'.
     */
    public void setChangeInstructions(
            final OpaqueData changeInstructions) {
        this._changeInstructions = changeInstructions;
    }

    /**
     * Sets the value of field 'creator'. The field 'creator' has
     * the following description: the person or organization who
     * initially created the change set
     * 
     * @param creator the value of field 'creator'.
     */
    public void setCreator(
            final SourceReference creator) {
        this._creator = creator;
    }

    /**
     * Method unmarshalChangeSetElementGroup.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.ChangeSetElementGroup
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
