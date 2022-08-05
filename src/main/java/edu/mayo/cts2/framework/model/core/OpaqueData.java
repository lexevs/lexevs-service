/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * Opaque data is the equivalent of an ASN.1 External Type ISO/IEC
 * 8824-1:2008 Information technology -- Abstract Syntax Notation
 * One (ASN.1): Specification of basic notion. Clause 37 - Notation
 * for the
 *  external type or the XML Schema anyType. An OpaqueData instance
 * may represent text with an optional spoken or written language
 * code or a
 *  formal structure such as embedded HTML, XML or MIME encoded
 * data. When a formal structure is included, its type should be
 * specified in the format attribute and, when the type is an XML
 * variant, the corresponding
 *  schema (or DTD) should be included in the schema parameter.The
 * OpaqueData data type must be encoded in such a way that the
 * content can be represented by a character string. Binary data is
 * not permitted,although
 *  hyperlinks to binary data are.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class OpaqueData extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the instance value. Note that instance value should be
     * encoded in such a way that it allows embedded structures. As
     * an example, in XML Schema, this encoding should be to
     * xs:anyType or an
     *  equivalent.
     */
    private TsAnyType _value;

    /**
     * the format or encoding for value. This is typically recorded
     * as the URI of a Mime Type.
     */
    private FormatReference _format;

    /**
     * a reference to the written or spoken language used in value.
     */
    private LanguageReference _language;

    /**
     * if the format of the document involves an XML encoding, this
     * contains the URI of a document that carries the
     * corresponding XML Schema or DTD.
     */
    private String _schema;


      //----------------/
     //- Constructors -/
    //----------------/

    public OpaqueData() {
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

        if (obj instanceof OpaqueData) {

            OpaqueData temp = (OpaqueData)obj;
            if (this._value != null) {
                if (temp._value == null) return false;
                if (!this._value.equals(temp._value)) 
                    return false;
            } else if (temp._value != null)
                return false;
            if (this._format != null) {
                if (temp._format == null) return false;
                if (!this._format.equals(temp._format)) 
                    return false;
            } else if (temp._format != null)
                return false;
            if (this._language != null) {
                if (temp._language == null) return false;
                if (!this._language.equals(temp._language)) 
                    return false;
            } else if (temp._language != null)
                return false;
            if (this._schema != null) {
                if (temp._schema == null) return false;
                return this._schema.equals(temp._schema);
            } else return temp._schema == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'format'. The field 'format' has
     * the following description: the format or encoding for value.
     * This is typically recorded as the URI of a Mime Type.
     * 
     * @return the value of field 'Format'.
     */
    public FormatReference getFormat(
    ) {
        return this._format;
    }

    /**
     * Returns the value of field 'language'. The field 'language'
     * has the following description: a reference to the written or
     * spoken language used in value.
     * 
     * @return the value of field 'Language'.
     */
    public LanguageReference getLanguage(
    ) {
        return this._language;
    }

    /**
     * Returns the value of field 'schema'. The field 'schema' has
     * the following description: if the format of the document
     * involves an XML encoding, this contains the URI of a
     * document that carries the corresponding XML Schema or DTD.
     * 
     * @return the value of field 'Schema'.
     */
    public String getSchema(
    ) {
        return this._schema;
    }

    /**
     * Returns the value of field 'value'. The field 'value' has
     * the following description: the instance value. Note that
     * instance value should be encoded in such a way that it
     * allows embedded structures. As an example, in XML Schema,
     * this encoding should be to xs:anyType or an
     *  equivalent.
     * 
     * @return the value of field 'Value'.
     */
    public TsAnyType getValue(
    ) {
        return this._value;
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
        if (_value != null) {
           result = 37 * result + _value.hashCode();
        }
        if (_format != null) {
           result = 37 * result + _format.hashCode();
        }
        if (_language != null) {
           result = 37 * result + _language.hashCode();
        }
        if (_schema != null) {
           result = 37 * result + _schema.hashCode();
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
     * Sets the value of field 'format'. The field 'format' has the
     * following description: the format or encoding for value.
     * This is typically recorded as the URI of a Mime Type.
     * 
     * @param format the value of field 'format'.
     */
    public void setFormat(
            final FormatReference format) {
        this._format = format;
    }

    /**
     * Sets the value of field 'language'. The field 'language' has
     * the following description: a reference to the written or
     * spoken language used in value.
     * 
     * @param language the value of field 'language'.
     */
    public void setLanguage(
            final LanguageReference language) {
        this._language = language;
    }

    /**
     * Sets the value of field 'schema'. The field 'schema' has the
     * following description: if the format of the document
     * involves an XML encoding, this contains the URI of a
     * document that carries the corresponding XML Schema or DTD.
     * 
     * @param schema the value of field 'schema'.
     */
    public void setSchema(
            final String schema) {
        this._schema = schema;
    }

    /**
     * Sets the value of field 'value'. The field 'value' has the
     * following description: the instance value. Note that
     * instance value should be encoded in such a way that it
     * allows embedded structures. As an example, in XML Schema,
     * this encoding should be to xs:anyType or an
     *  equivalent.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(
            final TsAnyType value) {
        this._value = value;
    }

    /**
     * Method unmarshalOpaqueData.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.OpaqueData
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
