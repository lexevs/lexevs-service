/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.map;

import edu.mayo.cts2.framework.model.core.AbstractResourceDescriptionDirectoryEntry;
import edu.mayo.cts2.framework.model.core.CodeSystemReference;
import edu.mayo.cts2.framework.model.core.MapVersionReference;
import edu.mayo.cts2.framework.model.core.ValueSetReference;

/**
 * A synopsis of a MapCatalogEntry.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapCatalogEntrySummary extends AbstractResourceDescriptionDirectoryEntry
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name by which the map is known within the context of the
     * CTS2 service instance
     */
    private String _mapName;

    /**
     * the CodeSystem from which the source codes in the Map are
     * drawn
     */
    private CodeSystemReference _fromCodeSystem;

    /**
     * the ValueSet from which the source codes in the Map are drawn
     */
    private ValueSetReference _fromValueSet;

    /**
     * the CodeSystem from which the target codes in the Map are
     * drawn
     */
    private CodeSystemReference _toCodeSystem;

    /**
     * the ValueSet from which the source codes in the Map are drawn
     */
    private ValueSetReference _toValueSet;

    /**
     * a reference to the map version with the CURRENT tag, if any
     */
    private MapVersionReference _currentVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapCatalogEntrySummary() {
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

        if (obj instanceof MapCatalogEntrySummary) {

            MapCatalogEntrySummary temp = (MapCatalogEntrySummary)obj;
            if (this._mapName != null) {
                if (temp._mapName == null) return false;
                if (!this._mapName.equals(temp._mapName)) 
                    return false;
            } else if (temp._mapName != null)
                return false;
            if (this._fromCodeSystem != null) {
                if (temp._fromCodeSystem == null) return false;
                if (!this._fromCodeSystem.equals(temp._fromCodeSystem)) 
                    return false;
            } else if (temp._fromCodeSystem != null)
                return false;
            if (this._fromValueSet != null) {
                if (temp._fromValueSet == null) return false;
                if (!this._fromValueSet.equals(temp._fromValueSet)) 
                    return false;
            } else if (temp._fromValueSet != null)
                return false;
            if (this._toCodeSystem != null) {
                if (temp._toCodeSystem == null) return false;
                if (!this._toCodeSystem.equals(temp._toCodeSystem)) 
                    return false;
            } else if (temp._toCodeSystem != null)
                return false;
            if (this._toValueSet != null) {
                if (temp._toValueSet == null) return false;
                if (!this._toValueSet.equals(temp._toValueSet)) 
                    return false;
            } else if (temp._toValueSet != null)
                return false;
            if (this._currentVersion != null) {
                if (temp._currentVersion == null) return false;
                return this._currentVersion.equals(temp._currentVersion);
            } else return temp._currentVersion == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'currentVersion'. The field
     * 'currentVersion' has the following description: a reference
     * to the map version with the CURRENT tag, if any
     * 
     * @return the value of field 'CurrentVersion'.
     */
    public MapVersionReference getCurrentVersion(
    ) {
        return this._currentVersion;
    }

    /**
     * Returns the value of field 'fromCodeSystem'. The field
     * 'fromCodeSystem' has the following description: the
     * CodeSystem from which the source codes in the Map are drawn
     * 
     * @return the value of field 'FromCodeSystem'.
     */
    public CodeSystemReference getFromCodeSystem(
    ) {
        return this._fromCodeSystem;
    }

    /**
     * Returns the value of field 'fromValueSet'. The field
     * 'fromValueSet' has the following description: the ValueSet
     * from which the source codes in the Map are drawn
     * 
     * @return the value of field 'FromValueSet'.
     */
    public ValueSetReference getFromValueSet(
    ) {
        return this._fromValueSet;
    }

    /**
     * Returns the value of field 'mapName'. The field 'mapName'
     * has the following description: the name by which the map is
     * known within the context of the CTS2 service instance
     * 
     * @return the value of field 'MapName'.
     */
    public String getMapName(
    ) {
        return this._mapName;
    }

    /**
     * Returns the value of field 'toCodeSystem'. The field
     * 'toCodeSystem' has the following description: the CodeSystem
     * from which the target codes in the Map are drawn
     * 
     * @return the value of field 'ToCodeSystem'.
     */
    public CodeSystemReference getToCodeSystem(
    ) {
        return this._toCodeSystem;
    }

    /**
     * Returns the value of field 'toValueSet'. The field
     * 'toValueSet' has the following description: the ValueSet
     * from which the source codes in the Map are drawn
     * 
     * @return the value of field 'ToValueSet'.
     */
    public ValueSetReference getToValueSet(
    ) {
        return this._toValueSet;
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
        if (_mapName != null) {
           result = 37 * result + _mapName.hashCode();
        }
        if (_fromCodeSystem != null) {
           result = 37 * result + _fromCodeSystem.hashCode();
        }
        if (_fromValueSet != null) {
           result = 37 * result + _fromValueSet.hashCode();
        }
        if (_toCodeSystem != null) {
           result = 37 * result + _toCodeSystem.hashCode();
        }
        if (_toValueSet != null) {
           result = 37 * result + _toValueSet.hashCode();
        }
        if (_currentVersion != null) {
           result = 37 * result + _currentVersion.hashCode();
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
     * Sets the value of field 'currentVersion'. The field
     * 'currentVersion' has the following description: a reference
     * to the map version with the CURRENT tag, if any
     * 
     * @param currentVersion the value of field 'currentVersion'.
     */
    public void setCurrentVersion(
            final MapVersionReference currentVersion) {
        this._currentVersion = currentVersion;
    }

    /**
     * Sets the value of field 'fromCodeSystem'. The field
     * 'fromCodeSystem' has the following description: the
     * CodeSystem from which the source codes in the Map are drawn
     * 
     * @param fromCodeSystem the value of field 'fromCodeSystem'.
     */
    public void setFromCodeSystem(
            final CodeSystemReference fromCodeSystem) {
        this._fromCodeSystem = fromCodeSystem;
    }

    /**
     * Sets the value of field 'fromValueSet'. The field
     * 'fromValueSet' has the following description: the ValueSet
     * from which the source codes in the Map are drawn
     * 
     * @param fromValueSet the value of field 'fromValueSet'.
     */
    public void setFromValueSet(
            final ValueSetReference fromValueSet) {
        this._fromValueSet = fromValueSet;
    }

    /**
     * Sets the value of field 'mapName'. The field 'mapName' has
     * the following description: the name by which the map is
     * known within the context of the CTS2 service instance
     * 
     * @param mapName the value of field 'mapName'.
     */
    public void setMapName(
            final String mapName) {
        this._mapName = mapName;
    }

    /**
     * Sets the value of field 'toCodeSystem'. The field
     * 'toCodeSystem' has the following description: the CodeSystem
     * from which the target codes in the Map are drawn
     * 
     * @param toCodeSystem the value of field 'toCodeSystem'.
     */
    public void setToCodeSystem(
            final CodeSystemReference toCodeSystem) {
        this._toCodeSystem = toCodeSystem;
    }

    /**
     * Sets the value of field 'toValueSet'. The field 'toValueSet'
     * has the following description: the ValueSet from which the
     * source codes in the Map are drawn
     * 
     * @param toValueSet the value of field 'toValueSet'.
     */
    public void setToValueSet(
            final ValueSetReference toValueSet) {
        this._toValueSet = toValueSet;
    }

    /**
     * Method unmarshalMapCatalogEntrySummary.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.map.MapCatalogEntrySummary
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
