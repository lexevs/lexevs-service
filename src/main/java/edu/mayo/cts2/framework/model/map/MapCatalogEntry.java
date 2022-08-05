/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.map;

import edu.mayo.cts2.framework.model.core.AbstractResourceDescription;
import edu.mayo.cts2.framework.model.core.CodeSystemReference;
import edu.mayo.cts2.framework.model.core.MapVersionReference;
import edu.mayo.cts2.framework.model.core.ValueSetReference;

/**
 * An entry in a catalog of maps - organized collections of rules
 * that describe how information encoded using one set of value
 * meanings can be transformed into a second, related set of
 * meanings. A map catalog
 *  contains information about who is responsible for creating and
 * distributing the rules, the source code system or value set, the
 * target code system or value set, how often the rules are
 * updated, how they are distributed,
 *  etc.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapCatalogEntry extends AbstractResourceDescription
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name by which the map is known within the context of the
     * CTS2 service instance. mapName must uniquely designate a
     * single, abstract Map within the context of all maps
     *  known to the instance of the service. Note that mapName is
     * not necessarily globally unique and the about URI should be
     * used whenever communication information about the Map across
     * time or
     *  service instances.
     */
    private String _mapName;

    /**
     * the CodeSystem from which the source codes in the Map are
     * drawn. Note that the source codes may be drawn from either a
     * CodeSystem or a ValueSet, but not
     *  both.
     */
    private CodeSystemReference _fromCodeSystem;

    /**
     * the ValueSet from which the source codes in the Map are
     * drawn. Note that the source codes may be drawn from either a
     * CodeSystem or a ValueSet, but not
     *  both.
     */
    private ValueSetReference _fromValueSet;

    /**
     * the CodeSystem from which the target codes in the Map are
     * drawn. Note that the target codes may be drawn from either a
     * CodeSystem or a ValueSet, but not
     *  both.
     */
    private CodeSystemReference _toCodeSystem;

    /**
     * the ValueSet from which the source codes in the Map are
     * drawn. Note that the target codes may be drawn from either a
     * CodeSystem or a ValueSet, but not
     *  both.
     */
    private ValueSetReference _toValueSet;

    /**
     * a URI that, when resolved, returns the known versions of the
     * containing Map
     */
    private String _versions;

    /**
     * The map version associated with this catalog entry that has
     * been assigned the CURRENT tag, if any
     */
    private MapVersionReference _currentVersion;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapCatalogEntry() {
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

        if (obj instanceof MapCatalogEntry) {

            MapCatalogEntry temp = (MapCatalogEntry)obj;
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
            if (this._versions != null) {
                if (temp._versions == null) return false;
                if (!this._versions.equals(temp._versions)) 
                    return false;
            } else if (temp._versions != null)
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
     * 'currentVersion' has the following description: The map
     * version associated with this catalog entry that has been
     * assigned the CURRENT tag, if any
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
     * CodeSystem from which the source codes in the Map are drawn.
     * Note that the source codes may be drawn from either a
     * CodeSystem or a ValueSet, but not
     *  both.
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
     * from which the source codes in the Map are drawn. Note that
     * the source codes may be drawn from either a CodeSystem or a
     * ValueSet, but not
     *  both.
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
     * known within the context of the CTS2 service instance.
     * mapName must uniquely designate a single, abstract Map
     * within the context of all maps
     *  known to the instance of the service. Note that mapName is
     * not necessarily globally unique and the about URI should be
     * used whenever communication information about the Map across
     * time or
     *  service instances.
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
     * from which the target codes in the Map are drawn. Note that
     * the target codes may be drawn from either a CodeSystem or a
     * ValueSet, but not
     *  both.
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
     * from which the source codes in the Map are drawn. Note that
     * the target codes may be drawn from either a CodeSystem or a
     * ValueSet, but not
     *  both.
     * 
     * @return the value of field 'ToValueSet'.
     */
    public ValueSetReference getToValueSet(
    ) {
        return this._toValueSet;
    }

    /**
     * Returns the value of field 'versions'. The field 'versions'
     * has the following description: a URI that, when resolved,
     * returns the known versions of the containing Map
     * 
     * @return the value of field 'Versions'.
     */
    public String getVersions(
    ) {
        return this._versions;
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
        if (_versions != null) {
           result = 37 * result + _versions.hashCode();
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
     * 'currentVersion' has the following description: The map
     * version associated with this catalog entry that has been
     * assigned the CURRENT tag, if any
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
     * CodeSystem from which the source codes in the Map are drawn.
     * Note that the source codes may be drawn from either a
     * CodeSystem or a ValueSet, but not
     *  both.
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
     * from which the source codes in the Map are drawn. Note that
     * the source codes may be drawn from either a CodeSystem or a
     * ValueSet, but not
     *  both.
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
     * known within the context of the CTS2 service instance.
     * mapName must uniquely designate a single, abstract Map
     * within the context of all maps
     *  known to the instance of the service. Note that mapName is
     * not necessarily globally unique and the about URI should be
     * used whenever communication information about the Map across
     * time or
     *  service instances.
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
     * from which the target codes in the Map are drawn. Note that
     * the target codes may be drawn from either a CodeSystem or a
     * ValueSet, but not
     *  both.
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
     * source codes in the Map are drawn. Note that the target
     * codes may be drawn from either a CodeSystem or a ValueSet,
     * but not
     *  both.
     * 
     * @param toValueSet the value of field 'toValueSet'.
     */
    public void setToValueSet(
            final ValueSetReference toValueSet) {
        this._toValueSet = toValueSet;
    }

    /**
     * Sets the value of field 'versions'. The field 'versions' has
     * the following description: a URI that, when resolved,
     * returns the known versions of the containing Map
     * 
     * @param versions the value of field 'versions'.
     */
    public void setVersions(
            final String versions) {
        this._versions = versions;
    }

    /**
     * Method unmarshalMapCatalogEntry.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.map.MapCatalogEntry
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
