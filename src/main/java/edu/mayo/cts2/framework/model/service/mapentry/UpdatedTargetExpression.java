/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.mapentry;

import edu.mayo.cts2.framework.model.core.EntityExpression;

/**
 * Class UpdatedTargetExpression.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedTargetExpression extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an expression that, when evaluated, produces a
     *  complex target
     */
    private EntityExpression _targetExpression;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedTargetExpression() {
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

        if (obj instanceof UpdatedTargetExpression) {

            UpdatedTargetExpression temp = (UpdatedTargetExpression)obj;
            if (this._targetExpression != null) {
                if (temp._targetExpression == null) return false;
                return this._targetExpression.equals(temp._targetExpression);
            } else return temp._targetExpression == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'targetExpression'. The field
     * 'targetExpression' has the following description: an
     * expression that, when evaluated, produces a
     *  complex target
     * 
     * @return the value of field 'TargetExpression'.
     */
    public EntityExpression getTargetExpression(
    ) {
        return this._targetExpression;
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
        if (_targetExpression != null) {
           result = 37 * result + _targetExpression.hashCode();
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
     * Sets the value of field 'targetExpression'. The field
     * 'targetExpression' has the following description: an
     * expression that, when evaluated, produces a
     *  complex target
     * 
     * @param targetExpression the value of field 'targetExpression'
     */
    public void setTargetExpression(
            final EntityExpression targetExpression) {
        this._targetExpression = targetExpression;
    }

    /**
     * Method unmarshalUpdatedTargetExpression.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.mapentry.UpdatedTargetExpression
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
