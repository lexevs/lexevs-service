/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * Note corresponds to the target of skos:note. It contains an
 * attributed literal that may include a language, format and, when
 * appropriate,
 *  schema. 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class Note extends EntryDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the code system version that contains the assertion(s)
     * represented in the Note
     */
    private String _assertedInCodeSystemVersion;

    /**
     * the URI of the Statement from which this note was derived.
     * This will only be present in services that support the
     * Statement profile.
     */
    private String _correspondingStatement;

    /**
     * an external identifier assigned to this note by an outside
     * party
     */
    private String _externalIdentifier;


      //----------------/
     //- Constructors -/
    //----------------/

    public Note() {
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

        if (obj instanceof Note) {

            Note temp = (Note)obj;
            if (this._assertedInCodeSystemVersion != null) {
                if (temp._assertedInCodeSystemVersion == null) return false;
                if (!this._assertedInCodeSystemVersion.equals(temp._assertedInCodeSystemVersion)) 
                    return false;
            } else if (temp._assertedInCodeSystemVersion != null)
                return false;
            if (this._correspondingStatement != null) {
                if (temp._correspondingStatement == null) return false;
                if (!this._correspondingStatement.equals(temp._correspondingStatement)) 
                    return false;
            } else if (temp._correspondingStatement != null)
                return false;
            if (this._externalIdentifier != null) {
                if (temp._externalIdentifier == null) return false;
                return this._externalIdentifier.equals(temp._externalIdentifier);
            } else return temp._externalIdentifier == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'assertedInCodeSystemVersion'.
     * The field 'assertedInCodeSystemVersion' has the following
     * description: the code system version that contains the
     * assertion(s) represented in the Note
     * 
     * @return the value of field 'AssertedInCodeSystemVersion'.
     */
    public String getAssertedInCodeSystemVersion(
    ) {
        return this._assertedInCodeSystemVersion;
    }

    /**
     * Returns the value of field 'correspondingStatement'. The
     * field 'correspondingStatement' has the following
     * description: the URI of the Statement from which this note
     * was derived. This will only be present in services that
     * support the Statement profile.
     * 
     * @return the value of field 'CorrespondingStatement'.
     */
    public String getCorrespondingStatement(
    ) {
        return this._correspondingStatement;
    }

    /**
     * Returns the value of field 'externalIdentifier'. The field
     * 'externalIdentifier' has the following description: an
     * external identifier assigned to this note by an outside
     * party
     * 
     * @return the value of field 'ExternalIdentifier'.
     */
    public String getExternalIdentifier(
    ) {
        return this._externalIdentifier;
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
        if (_assertedInCodeSystemVersion != null) {
           result = 37 * result + _assertedInCodeSystemVersion.hashCode();
        }
        if (_correspondingStatement != null) {
           result = 37 * result + _correspondingStatement.hashCode();
        }
        if (_externalIdentifier != null) {
           result = 37 * result + _externalIdentifier.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Sets the value of field 'assertedInCodeSystemVersion'. The
     * field 'assertedInCodeSystemVersion' has the following
     * description: the code system version that contains the
     * assertion(s) represented in the Note
     * 
     * @param assertedInCodeSystemVersion the value of field
     * 'assertedInCodeSystemVersion'.
     */
    public void setAssertedInCodeSystemVersion(
            final String assertedInCodeSystemVersion) {
        this._assertedInCodeSystemVersion = assertedInCodeSystemVersion;
    }

    /**
     * Sets the value of field 'correspondingStatement'. The field
     * 'correspondingStatement' has the following description: the
     * URI of the Statement from which this note was derived. This
     * will only be present in services that support the Statement
     * profile.
     * 
     * @param correspondingStatement the value of field
     * 'correspondingStatement'.
     */
    public void setCorrespondingStatement(
            final String correspondingStatement) {
        this._correspondingStatement = correspondingStatement;
    }

    /**
     * Sets the value of field 'externalIdentifier'. The field
     * 'externalIdentifier' has the following description: an
     * external identifier assigned to this note by an outside
     * party
     * 
     * @param externalIdentifier the value of field
     * 'externalIdentifier'.
     */
    public void setExternalIdentifier(
            final String externalIdentifier) {
        this._externalIdentifier = externalIdentifier;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
