/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.core;

/**
 * Provides a directory or list of resources that match a specific
 * filter and are ordered in a specified order. A directory is
 * read-only and is not necessarily immutable.Note that the name of
 * the link to
 *  DirectoryEntry is called "entries" rather than "entry". This
 * allows subclasses to use "entry" without type collisions in the
 * Z.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class Directory extends Message
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an indicator that states whether the complete directory
     * listing is included in entries or whether additional
     * retrievals are needed to get the full listing.
     */
    private edu.mayo.cts2.framework.model.core.types.CompleteDirectory _complete;

    /**
     * the number of entries in this directory segment. Note that
     * this is not the total number of entries in the complete
     * directory listing - just the number of entries in this
     *  segment.
     */
    private Long _numEntries;

    /**
     * a URI that, when de-referenced, produces the preceding set
     * of entries in the directory.
     */
    private String _prev;

    /**
     * a URI that, when de-referenced, produces the next set of
     * entries in the directory.
     */
    private String _next;

    /**
     * the filter(s) that were applied to generate this directory
     */
    private Filter _directoryFilter;

    /**
     * the sort criteria used in the directory. When this is left
     * as optional, there is the possibility that some directories
     * may not be ordered. Some PSMs may chose to make sortCriteria
     *  mandatory, meaning that all directory listings must reflect
     * some sort order.
     */
    private SortCriteria _sortCriteria;


      //----------------/
     //- Constructors -/
    //----------------/

    public Directory() {
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

        if (obj instanceof Directory) {

            Directory temp = (Directory)obj;
            if (this._complete != null) {
                if (temp._complete == null) return false;
                if (!this._complete.equals(temp._complete)) 
                    return false;
            } else if (temp._complete != null)
                return false;
            if (this._numEntries != null) {
                if (temp._numEntries == null) return false;
                if (!this._numEntries.equals(temp._numEntries)) 
                    return false;
            } else if (temp._numEntries != null)
                return false;
            if (this._prev != null) {
                if (temp._prev == null) return false;
                if (!this._prev.equals(temp._prev)) 
                    return false;
            } else if (temp._prev != null)
                return false;
            if (this._next != null) {
                if (temp._next == null) return false;
                if (!this._next.equals(temp._next)) 
                    return false;
            } else if (temp._next != null)
                return false;
            if (this._directoryFilter != null) {
                if (temp._directoryFilter == null) return false;
                if (!this._directoryFilter.equals(temp._directoryFilter)) 
                    return false;
            } else if (temp._directoryFilter != null)
                return false;
            if (this._sortCriteria != null) {
                if (temp._sortCriteria == null) return false;
                return this._sortCriteria.equals(temp._sortCriteria);
            } else return temp._sortCriteria == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'complete'. The field 'complete'
     * has the following description: an indicator that states
     * whether the complete directory listing is included in
     * entries or whether additional retrievals are needed to get
     * the full listing.
     * 
     * @return the value of field 'Complete'.
     */
    public edu.mayo.cts2.framework.model.core.types.CompleteDirectory getComplete(
    ) {
        return this._complete;
    }

    /**
     * Returns the value of field 'directoryFilter'. The field
     * 'directoryFilter' has the following description: the
     * filter(s) that were applied to generate this directory
     * 
     * @return the value of field 'DirectoryFilter'.
     */
    public Filter getDirectoryFilter(
    ) {
        return this._directoryFilter;
    }

    /**
     * Returns the value of field 'next'. The field 'next' has the
     * following description: a URI that, when de-referenced,
     * produces the next set of entries in the directory.
     * 
     * @return the value of field 'Next'.
     */
    public String getNext(
    ) {
        return this._next;
    }

    /**
     * Returns the value of field 'numEntries'. The field
     * 'numEntries' has the following description: the number of
     * entries in this directory segment. Note that this is not the
     * total number of entries in the complete directory listing -
     * just the number of entries in this
     *  segment.
     * 
     * @return the value of field 'NumEntries'.
     */
    public Long getNumEntries(
    ) {
        return this._numEntries;
    }

    /**
     * Returns the value of field 'prev'. The field 'prev' has the
     * following description: a URI that, when de-referenced,
     * produces the preceding set of entries in the directory.
     * 
     * @return the value of field 'Prev'.
     */
    public String getPrev(
    ) {
        return this._prev;
    }

    /**
     * Returns the value of field 'sortCriteria'. The field
     * 'sortCriteria' has the following description: the sort
     * criteria used in the directory. When this is left as
     * optional, there is the possibility that some directories may
     * not be ordered. Some PSMs may chose to make sortCriteria
     *  mandatory, meaning that all directory listings must reflect
     * some sort order.
     * 
     * @return the value of field 'SortCriteria'.
     */
    public SortCriteria getSortCriteria(
    ) {
        return this._sortCriteria;
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
        if (_complete != null) {
           result = 37 * result + _complete.hashCode();
        }
        if (_numEntries != null) {
           result = 37 * result + _numEntries.hashCode();
        }
        if (_prev != null) {
           result = 37 * result + _prev.hashCode();
        }
        if (_next != null) {
           result = 37 * result + _next.hashCode();
        }
        if (_directoryFilter != null) {
           result = 37 * result + _directoryFilter.hashCode();
        }
        if (_sortCriteria != null) {
           result = 37 * result + _sortCriteria.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Sets the value of field 'complete'. The field 'complete' has
     * the following description: an indicator that states whether
     * the complete directory listing is included in entries or
     * whether additional retrievals are needed to get the full
     * listing.
     * 
     * @param complete the value of field 'complete'.
     */
    public void setComplete(
            final edu.mayo.cts2.framework.model.core.types.CompleteDirectory complete) {
        this._complete = complete;
    }

    /**
     * Sets the value of field 'directoryFilter'. The field
     * 'directoryFilter' has the following description: the
     * filter(s) that were applied to generate this directory
     * 
     * @param directoryFilter the value of field 'directoryFilter'.
     */
    public void setDirectoryFilter(
            final Filter directoryFilter) {
        this._directoryFilter = directoryFilter;
    }

    /**
     * Sets the value of field 'next'. The field 'next' has the
     * following description: a URI that, when de-referenced,
     * produces the next set of entries in the directory.
     * 
     * @param next the value of field 'next'.
     */
    public void setNext(
            final String next) {
        this._next = next;
    }

    /**
     * Sets the value of field 'numEntries'. The field 'numEntries'
     * has the following description: the number of entries in this
     * directory segment. Note that this is not the total number of
     * entries in the complete directory listing - just the number
     * of entries in this
     *  segment.
     * 
     * @param numEntries the value of field 'numEntries'.
     */
    public void setNumEntries(
            final Long numEntries) {
        this._numEntries = numEntries;
    }

    /**
     * Sets the value of field 'prev'. The field 'prev' has the
     * following description: a URI that, when de-referenced,
     * produces the preceding set of entries in the directory.
     * 
     * @param prev the value of field 'prev'.
     */
    public void setPrev(
            final String prev) {
        this._prev = prev;
    }

    /**
     * Sets the value of field 'sortCriteria'. The field
     * 'sortCriteria' has the following description: the sort
     * criteria used in the directory. When this is left as
     * optional, there is the possibility that some directories may
     * not be ordered. Some PSMs may chose to make sortCriteria
     *  mandatory, meaning that all directory listings must reflect
     * some sort order.
     * 
     * @param sortCriteria the value of field 'sortCriteria'.
     */
    public void setSortCriteria(
            final SortCriteria sortCriteria) {
        this._sortCriteria = sortCriteria;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
