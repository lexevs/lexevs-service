/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.association;

import edu.mayo.cts2.framework.model.core.OntologyLanguageAndSyntax;
import java.util.Collections;

/**
 * Class ReasoningService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ReasoningService extends BaseAssociationService
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defaultSyntaxAndNotation.
     */
    private OntologyLanguageAndSyntax _defaultSyntaxAndNotation;

    /**
     * Field _supportedSyntaxAndNotationList.
     */
    private java.util.List<OntologyLanguageAndSyntax> _supportedSyntaxAndNotationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReasoningService() {
        super();
        this._supportedSyntaxAndNotationList = new java.util.ArrayList<OntologyLanguageAndSyntax>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSupportedSyntaxAndNotation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSyntaxAndNotation(
            final OntologyLanguageAndSyntax vSupportedSyntaxAndNotation)
    throws IndexOutOfBoundsException {
        this._supportedSyntaxAndNotationList.add(vSupportedSyntaxAndNotation);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSyntaxAndNotation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSyntaxAndNotation(
            final int index,
            final OntologyLanguageAndSyntax vSupportedSyntaxAndNotation)
    throws IndexOutOfBoundsException {
        this._supportedSyntaxAndNotationList.add(index, vSupportedSyntaxAndNotation);
    }

    /**
     * Method enumerateSupportedSyntaxAndNotation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends OntologyLanguageAndSyntax> enumerateSupportedSyntaxAndNotation(
    ) {
        return Collections.enumeration(this._supportedSyntaxAndNotationList);
    }

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

        if (obj instanceof ReasoningService) {

            ReasoningService temp = (ReasoningService)obj;
            if (this._defaultSyntaxAndNotation != null) {
                if (temp._defaultSyntaxAndNotation == null) return false;
                if (!this._defaultSyntaxAndNotation.equals(temp._defaultSyntaxAndNotation)) 
                    return false;
            } else if (temp._defaultSyntaxAndNotation != null)
                return false;
            if (this._supportedSyntaxAndNotationList != null) {
                if (temp._supportedSyntaxAndNotationList == null) return false;
                return this._supportedSyntaxAndNotationList.equals(temp._supportedSyntaxAndNotationList);
            } else return temp._supportedSyntaxAndNotationList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultSyntaxAndNotation'.
     * 
     * @return the value of field 'DefaultSyntaxAndNotation'.
     */
    public OntologyLanguageAndSyntax getDefaultSyntaxAndNotation(
    ) {
        return this._defaultSyntaxAndNotation;
    }

    /**
     * Method getSupportedSyntaxAndNotation.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.OntologyLanguageAndSyntax
     * at the given index
     */
    public OntologyLanguageAndSyntax getSupportedSyntaxAndNotation(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSyntaxAndNotationList.size()) {
            throw new IndexOutOfBoundsException("getSupportedSyntaxAndNotation: Index value '" + index + "' not in range [0.." + (this._supportedSyntaxAndNotationList.size() - 1) + "]");
        }

        return _supportedSyntaxAndNotationList.get(index);
    }

    /**
     * Method getSupportedSyntaxAndNotation.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public OntologyLanguageAndSyntax[] getSupportedSyntaxAndNotation(
    ) {
        OntologyLanguageAndSyntax[] array = new OntologyLanguageAndSyntax[0];
        return this._supportedSyntaxAndNotationList.toArray(array);
    }

    /**
     * Method getSupportedSyntaxAndNotationAsReference.Returns a
     * reference to '_supportedSyntaxAndNotationList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<OntologyLanguageAndSyntax> getSupportedSyntaxAndNotationAsReference(
    ) {
        return this._supportedSyntaxAndNotationList;
    }

    /**
     * Method getSupportedSyntaxAndNotationCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedSyntaxAndNotationCount(
    ) {
        return this._supportedSyntaxAndNotationList.size();
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
        if (_defaultSyntaxAndNotation != null) {
           result = 37 * result + _defaultSyntaxAndNotation.hashCode();
        }
        if (_supportedSyntaxAndNotationList != null) {
           result = 37 * result + _supportedSyntaxAndNotationList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateSupportedSyntaxAndNotation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends OntologyLanguageAndSyntax> iterateSupportedSyntaxAndNotation(
    ) {
        return this._supportedSyntaxAndNotationList.iterator();
    }

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
     */
    public void removeAllSupportedSyntaxAndNotation(
    ) {
        this._supportedSyntaxAndNotationList.clear();
    }

    /**
     * Method removeSupportedSyntaxAndNotation.
     * 
     * @param vSupportedSyntaxAndNotation
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedSyntaxAndNotation(
            final OntologyLanguageAndSyntax vSupportedSyntaxAndNotation) {
        return _supportedSyntaxAndNotationList.remove(vSupportedSyntaxAndNotation);
    }

    /**
     * Method removeSupportedSyntaxAndNotationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public OntologyLanguageAndSyntax removeSupportedSyntaxAndNotationAt(
            final int index) {
        OntologyLanguageAndSyntax obj = this._supportedSyntaxAndNotationList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'defaultSyntaxAndNotation'.
     * 
     * @param defaultSyntaxAndNotation the value of field
     * 'defaultSyntaxAndNotation'.
     */
    public void setDefaultSyntaxAndNotation(
            final OntologyLanguageAndSyntax defaultSyntaxAndNotation) {
        this._defaultSyntaxAndNotation = defaultSyntaxAndNotation;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSyntaxAndNotation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedSyntaxAndNotation(
            final int index,
            final OntologyLanguageAndSyntax vSupportedSyntaxAndNotation)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSyntaxAndNotationList.size()) {
            throw new IndexOutOfBoundsException("setSupportedSyntaxAndNotation: Index value '" + index + "' not in range [0.." + (this._supportedSyntaxAndNotationList.size() - 1) + "]");
        }

        this._supportedSyntaxAndNotationList.set(index, vSupportedSyntaxAndNotation);
    }

    /**
     * 
     * 
     * @param vSupportedSyntaxAndNotationArray
     */
    public void setSupportedSyntaxAndNotation(
            final OntologyLanguageAndSyntax[] vSupportedSyntaxAndNotationArray) {
        //-- copy array
        _supportedSyntaxAndNotationList.clear();

        Collections.addAll(this._supportedSyntaxAndNotationList, vSupportedSyntaxAndNotationArray);
    }

    /**
     * Sets the value of '_supportedSyntaxAndNotationList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vSupportedSyntaxAndNotationList the Vector to copy.
     */
    public void setSupportedSyntaxAndNotation(
            final java.util.List<OntologyLanguageAndSyntax> vSupportedSyntaxAndNotationList) {
        // copy vector
        this._supportedSyntaxAndNotationList.clear();

        this._supportedSyntaxAndNotationList.addAll(vSupportedSyntaxAndNotationList);
    }

    /**
     * Sets the value of '_supportedSyntaxAndNotationList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param supportedSyntaxAndNotationList the Vector to set.
     */
    public void setSupportedSyntaxAndNotationAsReference(
            final java.util.List<OntologyLanguageAndSyntax> supportedSyntaxAndNotationList) {
        this._supportedSyntaxAndNotationList = supportedSyntaxAndNotationList;
    }

    /**
     * Method unmarshalReasoningService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.association.ReasoningService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
