/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * The particular attribute, property or special element to be
 * sorted along with the sort direction
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class SortCriterion extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the sort order
     */
    private edu.mayo.cts2.framework.model.core.types.SortDirection _sortDirection = edu.mayo.cts2.framework.model.core.types.SortDirection.fromValue("ASCENDING");

    /**
     * Field _entryOrder.
     */
    private Long _entryOrder;

    /**
     * the type and name of the attribute, property or special
     * element to be sorted
     */
    private ComponentReference _sortElement;


      //----------------/
     //- Constructors -/
    //----------------/

    public SortCriterion() {
        super();
        setSortDirection(edu.mayo.cts2.framework.model.core.types.SortDirection.fromValue("ASCENDING"));
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

        if (obj instanceof SortCriterion) {

            SortCriterion temp = (SortCriterion)obj;
            if (this._sortDirection != null) {
                if (temp._sortDirection == null) return false;
                if (!this._sortDirection.equals(temp._sortDirection)) 
                    return false;
            } else if (temp._sortDirection != null)
                return false;
            if (this._entryOrder != null) {
                if (temp._entryOrder == null) return false;
                if (!this._entryOrder.equals(temp._entryOrder)) 
                    return false;
            } else if (temp._entryOrder != null)
                return false;
            if (this._sortElement != null) {
                if (temp._sortElement == null) return false;
                return this._sortElement.equals(temp._sortElement);
            } else return temp._sortElement == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'entryOrder'.
     * 
     * @return the value of field 'EntryOrder'.
     */
    public Long getEntryOrder(
    ) {
        return this._entryOrder;
    }

    /**
     * Returns the value of field 'sortDirection'. The field
     * 'sortDirection' has the following description: the sort
     * order
     * 
     * @return the value of field 'SortDirection'.
     */
    public edu.mayo.cts2.framework.model.core.types.SortDirection getSortDirection(
    ) {
        return this._sortDirection;
    }

    /**
     * Returns the value of field 'sortElement'. The field
     * 'sortElement' has the following description: the type and
     * name of the attribute, property or special element to be
     * sorted
     * 
     * @return the value of field 'SortElement'.
     */
    public ComponentReference getSortElement(
    ) {
        return this._sortElement;
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
        if (_sortDirection != null) {
           result = 37 * result + _sortDirection.hashCode();
        }
        if (_entryOrder != null) {
           result = 37 * result + _entryOrder.hashCode();
        }
        if (_sortElement != null) {
           result = 37 * result + _sortElement.hashCode();
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
     * Sets the value of field 'entryOrder'.
     * 
     * @param entryOrder the value of field 'entryOrder'.
     */
    public void setEntryOrder(
            final Long entryOrder) {
        this._entryOrder = entryOrder;
    }

    /**
     * Sets the value of field 'sortDirection'. The field
     * 'sortDirection' has the following description: the sort
     * order
     * 
     * @param sortDirection the value of field 'sortDirection'.
     */
    public void setSortDirection(
            final edu.mayo.cts2.framework.model.core.types.SortDirection sortDirection) {
        this._sortDirection = sortDirection;
    }

    /**
     * Sets the value of field 'sortElement'. The field
     * 'sortElement' has the following description: the type and
     * name of the attribute, property or special element to be
     * sorted
     * 
     * @param sortElement the value of field 'sortElement'.
     */
    public void setSortElement(
            final ComponentReference sortElement) {
        this._sortElement = sortElement;
    }

    /**
     * Method unmarshalSortCriterion.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.core.SortCriterion
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
