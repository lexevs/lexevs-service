/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * A parameter in a REST Resource
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Parameter extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _arg.
     */
    private String _arg;

    /**
     * Field _val.
     */
    private String _val;


      //----------------/
     //- Constructors -/
    //----------------/

    public Parameter() {
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

        if (obj instanceof Parameter) {

            Parameter temp = (Parameter)obj;
            if (this._arg != null) {
                if (temp._arg == null) return false;
                if (!this._arg.equals(temp._arg)) 
                    return false;
            } else if (temp._arg != null)
                return false;
            if (this._val != null) {
                if (temp._val == null) return false;
                return this._val.equals(temp._val);
            } else return temp._val == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'arg'.
     * 
     * @return the value of field 'Arg'.
     */
    public String getArg(
    ) {
        return this._arg;
    }

    /**
     * Returns the value of field 'val'.
     * 
     * @return the value of field 'Val'.
     */
    public String getVal(
    ) {
        return this._val;
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
        if (_arg != null) {
           result = 37 * result + _arg.hashCode();
        }
        if (_val != null) {
           result = 37 * result + _val.hashCode();
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
     * Sets the value of field 'arg'.
     * 
     * @param arg the value of field 'arg'.
     */
    public void setArg(
            final String arg) {
        this._arg = arg;
    }

    /**
     * Sets the value of field 'val'.
     * 
     * @param val the value of field 'val'.
     */
    public void setVal(
            final String val) {
        this._val = val;
    }

    /**
     * Method unmarshalParameter.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.Parameter
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
