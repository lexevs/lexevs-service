/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * The detailed description of what happened to a changeable
 * resource. ChangeDescription will only be present in service
 * profiles that support either the History or MAINTENANCE
 * profiles.
 *  
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ChangeDescription extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the type of change that occurred to cause the associated
     * Changeable element to reach the state it is in
     */
    private edu.mayo.cts2.framework.model.core.types.ChangeType _changeType;

    /**
     * an indicator that states whether the change has been
     * committed and is available to service consumers or is still
     * pending while further authoring may occur. committed must
     * always be COMMITTED
     *  in services that do not support the MAINTENANCE profile
     */
    private edu.mayo.cts2.framework.model.core.types.ChangeCommitted _committed = edu.mayo.cts2.framework.model.core.types.ChangeCommitted.fromValue("COMMITTED");

    /**
     * the URI of the ChangeSet that contains the described change
     */
    private String _containingChangeSet;

    /**
     * the URI of the ChangeSet that contains the change that
     * immediately preceded this change, if any
     */
    private String _prevChangeSet;

    /**
     * the date and time when this change was applied to the local
     * service instance. changeDate is only present on committed
     * changes.
     */
    private java.util.Date _changeDate;

    /**
     * the date and time that this change is (or was) scheduled to
     * take effect in the local service instance. Typically this
     * attribute is used to schedule a component to become active
     * on a given date.A
     *  change having a future effectiveDate will not be visible to
     * service calls whose reference time is earlier to this time.
     * This attribute may only be present in committed changes. A
     * compliant CTS2 service
     *  implementation MUST not allow a change to be written with a
     * effectiveDate that is earlier than changeDate. The purpose
     * of this requirement is to prevent the "rewriting of history"
     * - making a change
     *  effective in the past.
     */
    private java.util.Date _effectiveDate;

    /**
     * Field _prevImage.
     */
    private Changeable _prevImage;

    /**
     * a note, set of instructions and other information about the
     * nature and purpose of this change
     */
    private OpaqueData _changeNotes;

    /**
     * the person or organization responsible for this change
     */
    private SourceReference _changeSource;

    /**
     * the local identifier and URI of the resource that was cloned
     * in this change if this is a CLONE operation.
     */
    private NameAndMeaningReference _clonedResource;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChangeDescription() {
        super();
        setCommitted(edu.mayo.cts2.framework.model.core.types.ChangeCommitted.fromValue("COMMITTED"));
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

        if (obj instanceof ChangeDescription) {

            ChangeDescription temp = (ChangeDescription)obj;
            if (this._changeType != null) {
                if (temp._changeType == null) return false;
                if (!this._changeType.equals(temp._changeType)) 
                    return false;
            } else if (temp._changeType != null)
                return false;
            if (this._committed != null) {
                if (temp._committed == null) return false;
                if (!this._committed.equals(temp._committed)) 
                    return false;
            } else if (temp._committed != null)
                return false;
            if (this._containingChangeSet != null) {
                if (temp._containingChangeSet == null) return false;
                if (!this._containingChangeSet.equals(temp._containingChangeSet)) 
                    return false;
            } else if (temp._containingChangeSet != null)
                return false;
            if (this._prevChangeSet != null) {
                if (temp._prevChangeSet == null) return false;
                if (!this._prevChangeSet.equals(temp._prevChangeSet)) 
                    return false;
            } else if (temp._prevChangeSet != null)
                return false;
            if (this._changeDate != null) {
                if (temp._changeDate == null) return false;
                if (!this._changeDate.equals(temp._changeDate)) 
                    return false;
            } else if (temp._changeDate != null)
                return false;
            if (this._effectiveDate != null) {
                if (temp._effectiveDate == null) return false;
                if (!this._effectiveDate.equals(temp._effectiveDate)) 
                    return false;
            } else if (temp._effectiveDate != null)
                return false;
            if (this._prevImage != null) {
                if (temp._prevImage == null) return false;
                if (!this._prevImage.equals(temp._prevImage)) 
                    return false;
            } else if (temp._prevImage != null)
                return false;
            if (this._changeNotes != null) {
                if (temp._changeNotes == null) return false;
                if (!this._changeNotes.equals(temp._changeNotes)) 
                    return false;
            } else if (temp._changeNotes != null)
                return false;
            if (this._changeSource != null) {
                if (temp._changeSource == null) return false;
                if (!this._changeSource.equals(temp._changeSource)) 
                    return false;
            } else if (temp._changeSource != null)
                return false;
            if (this._clonedResource != null) {
                if (temp._clonedResource == null) return false;
                return this._clonedResource.equals(temp._clonedResource);
            } else return temp._clonedResource == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeDate'. The field
     * 'changeDate' has the following description: the date and
     * time when this change was applied to the local service
     * instance. changeDate is only present on committed changes.
     * 
     * @return the value of field 'ChangeDate'.
     */
    public java.util.Date getChangeDate(
    ) {
        return this._changeDate;
    }

    /**
     * Returns the value of field 'changeNotes'. The field
     * 'changeNotes' has the following description: a note, set of
     * instructions and other information about the nature and
     * purpose of this change
     * 
     * @return the value of field 'ChangeNotes'.
     */
    public OpaqueData getChangeNotes(
    ) {
        return this._changeNotes;
    }

    /**
     * Returns the value of field 'changeSource'. The field
     * 'changeSource' has the following description: the person or
     * organization responsible for this change
     * 
     * @return the value of field 'ChangeSource'.
     */
    public SourceReference getChangeSource(
    ) {
        return this._changeSource;
    }

    /**
     * Returns the value of field 'changeType'. The field
     * 'changeType' has the following description: the type of
     * change that occurred to cause the associated Changeable
     * element to reach the state it is in
     * 
     * @return the value of field 'ChangeType'.
     */
    public edu.mayo.cts2.framework.model.core.types.ChangeType getChangeType(
    ) {
        return this._changeType;
    }

    /**
     * Returns the value of field 'clonedResource'. The field
     * 'clonedResource' has the following description: the local
     * identifier and URI of the resource that was cloned in this
     * change if this is a CLONE operation.
     * 
     * @return the value of field 'ClonedResource'.
     */
    public NameAndMeaningReference getClonedResource(
    ) {
        return this._clonedResource;
    }

    /**
     * Returns the value of field 'committed'. The field
     * 'committed' has the following description: an indicator that
     * states whether the change has been committed and is
     * available to service consumers or is still pending while
     * further authoring may occur. committed must always be
     * COMMITTED
     *  in services that do not support the MAINTENANCE profile
     * 
     * @return the value of field 'Committed'.
     */
    public edu.mayo.cts2.framework.model.core.types.ChangeCommitted getCommitted(
    ) {
        return this._committed;
    }

    /**
     * Returns the value of field 'containingChangeSet'. The field
     * 'containingChangeSet' has the following description: the URI
     * of the ChangeSet that contains the described change
     * 
     * @return the value of field 'ContainingChangeSet'.
     */
    public String getContainingChangeSet(
    ) {
        return this._containingChangeSet;
    }

    /**
     * Returns the value of field 'effectiveDate'. The field
     * 'effectiveDate' has the following description: the date and
     * time that this change is (or was) scheduled to take effect
     * in the local service instance. Typically this attribute is
     * used to schedule a component to become active on a given
     * date.A
     *  change having a future effectiveDate will not be visible to
     * service calls whose reference time is earlier to this time.
     * This attribute may only be present in committed changes. A
     * compliant CTS2 service
     *  implementation MUST not allow a change to be written with a
     * effectiveDate that is earlier than changeDate. The purpose
     * of this requirement is to prevent the "rewriting of history"
     * - making a change
     *  effective in the past.
     * 
     * @return the value of field 'EffectiveDate'.
     */
    public java.util.Date getEffectiveDate(
    ) {
        return this._effectiveDate;
    }

    /**
     * Returns the value of field 'prevChangeSet'. The field
     * 'prevChangeSet' has the following description: the URI of
     * the ChangeSet that contains the change that immediately
     * preceded this change, if any
     * 
     * @return the value of field 'PrevChangeSet'.
     */
    public String getPrevChangeSet(
    ) {
        return this._prevChangeSet;
    }

    /**
     * Returns the value of field 'prevImage'.
     * 
     * @return the value of field 'PrevImage'.
     */
    public Changeable getPrevImage(
    ) {
        return this._prevImage;
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
        if (_changeType != null) {
           result = 37 * result + _changeType.hashCode();
        }
        if (_committed != null) {
           result = 37 * result + _committed.hashCode();
        }
        if (_containingChangeSet != null) {
           result = 37 * result + _containingChangeSet.hashCode();
        }
        if (_prevChangeSet != null) {
           result = 37 * result + _prevChangeSet.hashCode();
        }
        if (_changeDate != null) {
           result = 37 * result + _changeDate.hashCode();
        }
        if (_effectiveDate != null) {
           result = 37 * result + _effectiveDate.hashCode();
        }
        if (_prevImage != null) {
           result = 37 * result + _prevImage.hashCode();
        }
        if (_changeNotes != null) {
           result = 37 * result + _changeNotes.hashCode();
        }
        if (_changeSource != null) {
           result = 37 * result + _changeSource.hashCode();
        }
        if (_clonedResource != null) {
           result = 37 * result + _clonedResource.hashCode();
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
     * Sets the value of field 'changeDate'. The field 'changeDate'
     * has the following description: the date and time when this
     * change was applied to the local service instance. changeDate
     * is only present on committed changes.
     * 
     * @param changeDate the value of field 'changeDate'.
     */
    public void setChangeDate(
            final java.util.Date changeDate) {
        this._changeDate = changeDate;
    }

    /**
     * Sets the value of field 'changeNotes'. The field
     * 'changeNotes' has the following description: a note, set of
     * instructions and other information about the nature and
     * purpose of this change
     * 
     * @param changeNotes the value of field 'changeNotes'.
     */
    public void setChangeNotes(
            final OpaqueData changeNotes) {
        this._changeNotes = changeNotes;
    }

    /**
     * Sets the value of field 'changeSource'. The field
     * 'changeSource' has the following description: the person or
     * organization responsible for this change
     * 
     * @param changeSource the value of field 'changeSource'.
     */
    public void setChangeSource(
            final SourceReference changeSource) {
        this._changeSource = changeSource;
    }

    /**
     * Sets the value of field 'changeType'. The field 'changeType'
     * has the following description: the type of change that
     * occurred to cause the associated Changeable element to reach
     * the state it is in
     * 
     * @param changeType the value of field 'changeType'.
     */
    public void setChangeType(
            final edu.mayo.cts2.framework.model.core.types.ChangeType changeType) {
        this._changeType = changeType;
    }

    /**
     * Sets the value of field 'clonedResource'. The field
     * 'clonedResource' has the following description: the local
     * identifier and URI of the resource that was cloned in this
     * change if this is a CLONE operation.
     * 
     * @param clonedResource the value of field 'clonedResource'.
     */
    public void setClonedResource(
            final NameAndMeaningReference clonedResource) {
        this._clonedResource = clonedResource;
    }

    /**
     * Sets the value of field 'committed'. The field 'committed'
     * has the following description: an indicator that states
     * whether the change has been committed and is available to
     * service consumers or is still pending while further
     * authoring may occur. committed must always be COMMITTED
     *  in services that do not support the MAINTENANCE profile
     * 
     * @param committed the value of field 'committed'.
     */
    public void setCommitted(
            final edu.mayo.cts2.framework.model.core.types.ChangeCommitted committed) {
        this._committed = committed;
    }

    /**
     * Sets the value of field 'containingChangeSet'. The field
     * 'containingChangeSet' has the following description: the URI
     * of the ChangeSet that contains the described change
     * 
     * @param containingChangeSet the value of field
     * 'containingChangeSet'.
     */
    public void setContainingChangeSet(
            final String containingChangeSet) {
        this._containingChangeSet = containingChangeSet;
    }

    /**
     * Sets the value of field 'effectiveDate'. The field
     * 'effectiveDate' has the following description: the date and
     * time that this change is (or was) scheduled to take effect
     * in the local service instance. Typically this attribute is
     * used to schedule a component to become active on a given
     * date.A
     *  change having a future effectiveDate will not be visible to
     * service calls whose reference time is earlier to this time.
     * This attribute may only be present in committed changes. A
     * compliant CTS2 service
     *  implementation MUST not allow a change to be written with a
     * effectiveDate that is earlier than changeDate. The purpose
     * of this requirement is to prevent the "rewriting of history"
     * - making a change
     *  effective in the past.
     * 
     * @param effectiveDate the value of field 'effectiveDate'.
     */
    public void setEffectiveDate(
            final java.util.Date effectiveDate) {
        this._effectiveDate = effectiveDate;
    }

    /**
     * Sets the value of field 'prevChangeSet'. The field
     * 'prevChangeSet' has the following description: the URI of
     * the ChangeSet that contains the change that immediately
     * preceded this change, if any
     * 
     * @param prevChangeSet the value of field 'prevChangeSet'.
     */
    public void setPrevChangeSet(
            final String prevChangeSet) {
        this._prevChangeSet = prevChangeSet;
    }

    /**
     * Sets the value of field 'prevImage'.
     * 
     * @param prevImage the value of field 'prevImage'.
     */
    public void setPrevImage(
            final Changeable prevImage) {
        this._prevImage = prevImage;
    }

    /**
     * Method unmarshalChangeDescription.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.ChangeDescription
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
