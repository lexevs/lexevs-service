/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * an entry in a directory. DirectoryEntry is a mixin that
 * identifies the attributes that must or may be present in any
 * element that can be represented as an entry in a Directory.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class DirectoryEntry extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * a LocalURI that resolves to the full resource described by
     * the DirectoryEntry. This should be present if the service
     * either (a) supports the Read functional profile for the
     * specified
     *  type or (b) is aware of another service that does.
     */
    private String _href;

    /**
     * a local identifier that names a unique resource within the
     * context of type and the service context. This attribute must
     * be present if the corresponding element has a local name.
     * Note, however, that
     *  some elements (e.g. Association, ValueSetDefinition, etc.)
     * do not local names and are identified exclusively by their
     * href.
     */
    private String _resourceName;

    /**
     * a relative measure of the "goodness of fit" of the directory
     * entry within the context of the directoryFilter in the
     * containing Directory.
     */
    private Double _matchStrength;


      //----------------/
     //- Constructors -/
    //----------------/

    public DirectoryEntry() {
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

        if (obj instanceof DirectoryEntry) {

            DirectoryEntry temp = (DirectoryEntry)obj;
            if (this._href != null) {
                if (temp._href == null) return false;
                if (!this._href.equals(temp._href)) 
                    return false;
            } else if (temp._href != null)
                return false;
            if (this._resourceName != null) {
                if (temp._resourceName == null) return false;
                if (!this._resourceName.equals(temp._resourceName)) 
                    return false;
            } else if (temp._resourceName != null)
                return false;
            if (this._matchStrength != null) {
                if (temp._matchStrength == null) return false;
                return this._matchStrength.equals(temp._matchStrength);
            } else return temp._matchStrength == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'href'. The field 'href' has the
     * following description: a LocalURI that resolves to the full
     * resource described by the DirectoryEntry. This should be
     * present if the service either (a) supports the Read
     * functional profile for the specified
     *  type or (b) is aware of another service that does.
     * 
     * @return the value of field 'Href'.
     */
    public String getHref(
    ) {
        return this._href;
    }

    /**
     * Returns the value of field 'matchStrength'. The field
     * 'matchStrength' has the following description: a relative
     * measure of the "goodness of fit" of the directory entry
     * within the context of the directoryFilter in the containing
     * Directory.
     * 
     * @return the value of field 'MatchStrength'.
     */
    public Double getMatchStrength(
    ) {
        return this._matchStrength;
    }

    /**
     * Returns the value of field 'resourceName'. The field
     * 'resourceName' has the following description: a local
     * identifier that names a unique resource within the context
     * of type and the service context. This attribute must be
     * present if the corresponding element has a local name. Note,
     * however, that
     *  some elements (e.g. Association, ValueSetDefinition, etc.)
     * do not local names and are identified exclusively by their
     * href.
     * 
     * @return the value of field 'ResourceName'.
     */
    public String getResourceName(
    ) {
        return this._resourceName;
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
        if (_href != null) {
           result = 37 * result + _href.hashCode();
        }
        if (_resourceName != null) {
           result = 37 * result + _resourceName.hashCode();
        }
        if (_matchStrength != null) {
           result = 37 * result + _matchStrength.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Sets the value of field 'href'. The field 'href' has the
     * following description: a LocalURI that resolves to the full
     * resource described by the DirectoryEntry. This should be
     * present if the service either (a) supports the Read
     * functional profile for the specified
     *  type or (b) is aware of another service that does.
     * 
     * @param href the value of field 'href'.
     */
    public void setHref(
            final String href) {
        this._href = href;
    }

    /**
     * Sets the value of field 'matchStrength'. The field
     * 'matchStrength' has the following description: a relative
     * measure of the "goodness of fit" of the directory entry
     * within the context of the directoryFilter in the containing
     * Directory.
     * 
     * @param matchStrength the value of field 'matchStrength'.
     */
    public void setMatchStrength(
            final Double matchStrength) {
        this._matchStrength = matchStrength;
    }

    /**
     * Sets the value of field 'resourceName'. The field
     * 'resourceName' has the following description: a local
     * identifier that names a unique resource within the context
     * of type and the service context. This attribute must be
     * present if the corresponding element has a local name. Note,
     * however, that
     *  some elements (e.g. Association, ValueSetDefinition, etc.)
     * do not local names and are identified exclusively by their
     * href.
     * 
     * @param resourceName the value of field 'resourceName'.
     */
    public void setResourceName(
            final String resourceName) {
        this._resourceName = resourceName;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
