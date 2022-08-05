/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.updates;

/**
 * An ordered collection of changes that, when applied, will
 * transform a service instance from one consistent state to
 *  another. A ChangeSet is viewed as an atomic unit of change -
 * either all of the Changeable elements in a change set will
 *  be applied or none of them will be applied. It is anticipated
 * that service implementations will provide a mechanism by which
 * it can
 *  apply local business rules to the validation and application of
 * change sets. These rules may include the option to selectively
 * apply,
 *  reject, modify or ignore the elements of change sets as they
 * arrive. In this case, it is up to the developers of the business
 * rules to
 *  determine what constitutes a "complete" change set that can be
 * applied.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ChangeSetMsg extends edu.mayo.cts2.framework.model.core.Message 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _changeSet.
     */
    private ChangeSet _changeSet;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChangeSetMsg() {
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

        if (obj instanceof ChangeSetMsg) {

            ChangeSetMsg temp = (ChangeSetMsg)obj;
            if (this._changeSet != null) {
                if (temp._changeSet == null) return false;
                return this._changeSet.equals(temp._changeSet);
            } else return temp._changeSet == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeSet'.
     * 
     * @return the value of field 'ChangeSet'.
     */
    public ChangeSet getChangeSet(
    ) {
        return this._changeSet;
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
        if (_changeSet != null) {
           result = 37 * result + _changeSet.hashCode();
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
     * Sets the value of field 'changeSet'.
     * 
     * @param changeSet the value of field 'changeSet'.
     */
    public void setChangeSet(
            final ChangeSet changeSet) {
        this._changeSet = changeSet;
    }

    /**
     * Method unmarshalChangeSetMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.updates.ChangeSetMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
