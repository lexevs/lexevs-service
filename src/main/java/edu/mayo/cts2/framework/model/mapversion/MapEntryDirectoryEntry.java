/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.mapversion;

/**
 * A synopsis of a MapEntry along with information about how to
 * access the complete resource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapEntryDirectoryEntry extends edu.mayo.cts2.framework.model.core.DirectoryEntry 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a reference to the MapVersion that contains or asserts this
     * entry
     */
    private edu.mayo.cts2.framework.model.core.MapVersionReference _assertedBy;

    /**
     * the URI and name of the source entity for this entry.
     */
    private edu.mayo.cts2.framework.model.core.URIAndEntityName _mapFrom;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapEntryDirectoryEntry() {
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

        if (obj instanceof MapEntryDirectoryEntry) {

            MapEntryDirectoryEntry temp = (MapEntryDirectoryEntry)obj;
            if (this._assertedBy != null) {
                if (temp._assertedBy == null) return false;
                if (!this._assertedBy.equals(temp._assertedBy)) 
                    return false;
            } else if (temp._assertedBy != null)
                return false;
            if (this._mapFrom != null) {
                if (temp._mapFrom == null) return false;
                return this._mapFrom.equals(temp._mapFrom);
            } else return temp._mapFrom == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'assertedBy'. The field
     * 'assertedBy' has the following description: a reference to
     * the MapVersion that contains or asserts this entry
     * 
     * @return the value of field 'AssertedBy'.
     */
    public edu.mayo.cts2.framework.model.core.MapVersionReference getAssertedBy(
    ) {
        return this._assertedBy;
    }

    /**
     * Returns the value of field 'mapFrom'. The field 'mapFrom'
     * has the following description: the URI and name of the
     * source entity for this entry.
     * 
     * @return the value of field 'MapFrom'.
     */
    public edu.mayo.cts2.framework.model.core.URIAndEntityName getMapFrom(
    ) {
        return this._mapFrom;
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
        if (_assertedBy != null) {
           result = 37 * result + _assertedBy.hashCode();
        }
        if (_mapFrom != null) {
           result = 37 * result + _mapFrom.hashCode();
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
     * Sets the value of field 'assertedBy'. The field 'assertedBy'
     * has the following description: a reference to the MapVersion
     * that contains or asserts this entry
     * 
     * @param assertedBy the value of field 'assertedBy'.
     */
    public void setAssertedBy(
            final edu.mayo.cts2.framework.model.core.MapVersionReference assertedBy) {
        this._assertedBy = assertedBy;
    }

    /**
     * Sets the value of field 'mapFrom'. The field 'mapFrom' has
     * the following description: the URI and name of the source
     * entity for this entry.
     * 
     * @param mapFrom the value of field 'mapFrom'.
     */
    public void setMapFrom(
            final edu.mayo.cts2.framework.model.core.URIAndEntityName mapFrom) {
        this._mapFrom = mapFrom;
    }

    /**
     * Method unmarshalMapEntryDirectoryEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.mapversion.MapEntryDirectoryEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
