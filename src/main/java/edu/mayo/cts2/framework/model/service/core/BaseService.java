/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.FormatReference;
import java.util.Collections;

/**
 * BaseService contains the components that are common to any CTS2
 * service implementation. It includes information about the
 * service itself, the namespaces and formats that are known to the
 * service and the structural, functional and representation
 * profiles that are supported by the service instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class BaseService extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A short name that identifies the particular service and
     * implementation.
     */
    private String _serviceName;

/**
 * The version of LexEVS that this service is based on.
 */
    private String _lexevsVersion;

    /**
     * A description of the service, its use, etc.
     */
    private edu.mayo.cts2.framework.model.core.OpaqueData _serviceDescription;

    /**
     * The version or release identifier of the service.
     */
    private String _serviceVersion;

    /**
     * A reference to the individual or organization that provides
     * the service.
     */
    private edu.mayo.cts2.framework.model.core.SourceReference _serviceProvider;

    /**
     * A list of the representation formats supported by the
     * service. Example: text/html, text/xml, application/json
     */
    private java.util.List<FormatReference> _supportedFormatList;

    /**
     * The default format used by the service unless otherwise
     * specified.
     */
    private FormatReference _defaultFormat;

    /**
     * The set of service profiles that are supported by this
     * service implementation
     */
    private java.util.List<ProfileElement> _supportedProfileList;

    /**
     * The particular implementation type(s) supported by this
     * profile
     */
    private edu.mayo.cts2.framework.model.service.core.types.ImplementationProfile _implementationType;

    /**
     * The set of namespaces recognized by this service. Because
     * many namespace identifiers tend to be cryptic (i.e. HL7
     * OIDs, BioPortal URL's, etc.), knownNamespace includes the
     * namespace name, an optional URI \emph{and} a place to
     * provide textual detail describing what the namespace
     * references. Note that namespace names must be unique across
     * an entire CTS2 implementation - the same namespace name
     * cannot represent one namespace in code system A
     *  and a second in code system B. Note also that namespace
     * names are \emph{local} to a service instance. Information
     * that is communicated between service instances, recorded in
     * data tables or client software \emph{must} use full URIs.
     */
    private java.util.List<DocumentedNamespaceReference> _knownNamespaceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BaseService() {
        super();
        this._supportedFormatList = new java.util.ArrayList<FormatReference>();
        this._supportedProfileList = new java.util.ArrayList<ProfileElement>();
        this._knownNamespaceList = new java.util.ArrayList<DocumentedNamespaceReference>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vKnownNamespace
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownNamespace(
            final DocumentedNamespaceReference vKnownNamespace)
    throws IndexOutOfBoundsException {
        this._knownNamespaceList.add(vKnownNamespace);
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownNamespace
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addKnownNamespace(
            final int index,
            final DocumentedNamespaceReference vKnownNamespace)
    throws IndexOutOfBoundsException {
        this._knownNamespaceList.add(index, vKnownNamespace);
    }

    /**
     * 
     * 
     * @param vSupportedFormat
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedFormat(
            final FormatReference vSupportedFormat)
    throws IndexOutOfBoundsException {
        this._supportedFormatList.add(vSupportedFormat);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedFormat
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedFormat(
            final int index,
            final FormatReference vSupportedFormat)
    throws IndexOutOfBoundsException {
        this._supportedFormatList.add(index, vSupportedFormat);
    }

    /**
     * 
     * 
     * @param vSupportedProfile
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedProfile(
            final ProfileElement vSupportedProfile)
    throws IndexOutOfBoundsException {
        this._supportedProfileList.add(vSupportedProfile);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedProfile
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedProfile(
            final int index,
            final ProfileElement vSupportedProfile)
    throws IndexOutOfBoundsException {
        this._supportedProfileList.add(index, vSupportedProfile);
    }

    /**
     * Method enumerateKnownNamespace.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends DocumentedNamespaceReference> enumerateKnownNamespace(
    ) {
        return Collections.enumeration(this._knownNamespaceList);
    }

    /**
     * Method enumerateSupportedFormat.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends FormatReference> enumerateSupportedFormat(
    ) {
        return Collections.enumeration(this._supportedFormatList);
    }

    /**
     * Method enumerateSupportedProfile.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends ProfileElement> enumerateSupportedProfile(
    ) {
        return Collections.enumeration(this._supportedProfileList);
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

        if (obj instanceof BaseService) {

            BaseService temp = (BaseService)obj;
            if (this._serviceName != null) {
                if (temp._serviceName == null) return false;
                if (!this._serviceName.equals(temp._serviceName)) 
                    return false;
            } else if (temp._serviceName != null)
                return false;
            if (this._serviceDescription != null) {
                if (temp._serviceDescription == null) return false;
                if (!this._serviceDescription.equals(temp._serviceDescription)) 
                    return false;
            } else if (temp._serviceDescription != null)
                return false;
            if (this._serviceVersion != null) {
                if (temp._serviceVersion == null) return false;
                if (!this._serviceVersion.equals(temp._serviceVersion)) 
                    return false;
            } else if (temp._serviceVersion != null)
                return false;
            if (this._serviceProvider != null) {
                if (temp._serviceProvider == null) return false;
                if (!this._serviceProvider.equals(temp._serviceProvider)) 
                    return false;
            } else if (temp._serviceProvider != null)
                return false;
            if (this._supportedFormatList != null) {
                if (temp._supportedFormatList == null) return false;
                if (!this._supportedFormatList.equals(temp._supportedFormatList)) 
                    return false;
            } else if (temp._supportedFormatList != null)
                return false;
            if (this._defaultFormat != null) {
                if (temp._defaultFormat == null) return false;
                if (!this._defaultFormat.equals(temp._defaultFormat)) 
                    return false;
            } else if (temp._defaultFormat != null)
                return false;
            if (this._supportedProfileList != null) {
                if (temp._supportedProfileList == null) return false;
                if (!this._supportedProfileList.equals(temp._supportedProfileList)) 
                    return false;
            } else if (temp._supportedProfileList != null)
                return false;
            if (this._implementationType != null) {
                if (temp._implementationType == null) return false;
                if (!this._implementationType.equals(temp._implementationType)) 
                    return false;
            } else if (temp._implementationType != null)
                return false;
            if (this._knownNamespaceList != null) {
                if (temp._knownNamespaceList == null) return false;
                return this._knownNamespaceList.equals(temp._knownNamespaceList);
            } else return temp._knownNamespaceList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultFormat'. The field
     * 'defaultFormat' has the following description: The default
     * format used by the service unless otherwise specified.
     * 
     * @return the value of field 'DefaultFormat'.
     */
    public FormatReference getDefaultFormat(
    ) {
        return this._defaultFormat;
    }

    /**
     * Returns the value of field 'implementationType'. The field
     * 'implementationType' has the following description: The
     * particular implementation type(s) supported by this profile
     * 
     * @return the value of field 'ImplementationType'.
     */
    public edu.mayo.cts2.framework.model.service.core.types.ImplementationProfile getImplementationType(
    ) {
        return this._implementationType;
    }

    /**
     * Method getKnownNamespace.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.service.core.DocumentedNamespaceReference
     * at the given index
     */
    public DocumentedNamespaceReference getKnownNamespace(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownNamespaceList.size()) {
            throw new IndexOutOfBoundsException("getKnownNamespace: Index value '" + index + "' not in range [0.." + (this._knownNamespaceList.size() - 1) + "]");
        }

        return _knownNamespaceList.get(index);
    }

    /**
     * Method getKnownNamespace.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public DocumentedNamespaceReference[] getKnownNamespace(
    ) {
        DocumentedNamespaceReference[] array = new DocumentedNamespaceReference[0];
        return this._knownNamespaceList.toArray(array);
    }

    /**
     * Method getKnownNamespaceAsReference.Returns a reference to
     * '_knownNamespaceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<DocumentedNamespaceReference> getKnownNamespaceAsReference(
    ) {
        return this._knownNamespaceList;
    }

    /**
     * Method getKnownNamespaceCount.
     * 
     * @return the size of this collection
     */
    public int getKnownNamespaceCount(
    ) {
        return this._knownNamespaceList.size();
    }

    /**
     * Returns the value of field 'serviceDescription'. The field
     * 'serviceDescription' has the following description: A
     * description of the service, its use, etc.
     * 
     * @return the value of field 'ServiceDescription'.
     */
    public edu.mayo.cts2.framework.model.core.OpaqueData getServiceDescription(
    ) {
        return this._serviceDescription;
    }

    /**
     * Returns the value of field 'serviceName'. The field
     * 'serviceName' has the following description: A short name
     * that identifies the particular service and implementation.
     * 
     * @return the value of field 'ServiceName'.
     */
    public String getServiceName(
    ) {
        return this._serviceName;
    }

    /**
     * Returns the value of field 'serviceProvider'. The field
     * 'serviceProvider' has the following description: A reference
     * to the individual or organization that provides the service.
     * 
     * @return the value of field 'ServiceProvider'.
     */
    public edu.mayo.cts2.framework.model.core.SourceReference getServiceProvider(
    ) {
        return this._serviceProvider;
    }

    /**
     * Returns the value of field 'serviceVersion'. The field
     * 'serviceVersion' has the following description: The version
     * or release identifier of the service.
     * 
     * @return the value of field 'ServiceVersion'.
     */
    public String getServiceVersion(
    ) {
        return this._serviceVersion;
    }

    /**
     * Method getSupportedFormat.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.FormatReference at the
     * given index
     */
    public FormatReference getSupportedFormat(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedFormatList.size()) {
            throw new IndexOutOfBoundsException("getSupportedFormat: Index value '" + index + "' not in range [0.." + (this._supportedFormatList.size() - 1) + "]");
        }

        return _supportedFormatList.get(index);
    }

    /**
     * Method getSupportedFormat.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public FormatReference[] getSupportedFormat(
    ) {
        FormatReference[] array = new FormatReference[0];
        return this._supportedFormatList.toArray(array);
    }

    /**
     * Method getSupportedFormatAsReference.Returns a reference to
     * '_supportedFormatList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<FormatReference> getSupportedFormatAsReference(
    ) {
        return this._supportedFormatList;
    }

    /**
     * Method getSupportedFormatCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedFormatCount(
    ) {
        return this._supportedFormatList.size();
    }

    /**
     * Method getSupportedProfile.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.service.core.ProfileElement at
     * the given index
     */
    public ProfileElement getSupportedProfile(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedProfileList.size()) {
            throw new IndexOutOfBoundsException("getSupportedProfile: Index value '" + index + "' not in range [0.." + (this._supportedProfileList.size() - 1) + "]");
        }

        return _supportedProfileList.get(index);
    }

    /**
     * Method getSupportedProfile.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public ProfileElement[] getSupportedProfile(
    ) {
        ProfileElement[] array = new ProfileElement[0];
        return this._supportedProfileList.toArray(array);
    }

    /**
     * Method getSupportedProfileAsReference.Returns a reference to
     * '_supportedProfileList'. No type checking is performed on
     * any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<ProfileElement> getSupportedProfileAsReference(
    ) {
        return this._supportedProfileList;
    }

    /**
     * Method getSupportedProfileCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedProfileCount(
    ) {
        return this._supportedProfileList.size();
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
        if (_serviceName != null) {
           result = 37 * result + _serviceName.hashCode();
        }
        if (_serviceDescription != null) {
           result = 37 * result + _serviceDescription.hashCode();
        }
        if (_serviceVersion != null) {
           result = 37 * result + _serviceVersion.hashCode();
        }
        if (_serviceProvider != null) {
           result = 37 * result + _serviceProvider.hashCode();
        }
        if (_supportedFormatList != null) {
           result = 37 * result + _supportedFormatList.hashCode();
        }
        if (_defaultFormat != null) {
           result = 37 * result + _defaultFormat.hashCode();
        }
        if (_supportedProfileList != null) {
           result = 37 * result + _supportedProfileList.hashCode();
        }
        if (_implementationType != null) {
           result = 37 * result + _implementationType.hashCode();
        }
        if (_knownNamespaceList != null) {
           result = 37 * result + _knownNamespaceList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateKnownNamespace.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends DocumentedNamespaceReference> iterateKnownNamespace(
    ) {
        return this._knownNamespaceList.iterator();
    }

    /**
     * Method iterateSupportedFormat.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends FormatReference> iterateSupportedFormat(
    ) {
        return this._supportedFormatList.iterator();
    }

    /**
     * Method iterateSupportedProfile.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends ProfileElement> iterateSupportedProfile(
    ) {
        return this._supportedProfileList.iterator();
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
    public void removeAllKnownNamespace(
    ) {
        this._knownNamespaceList.clear();
    }

    /**
     */
    public void removeAllSupportedFormat(
    ) {
        this._supportedFormatList.clear();
    }

    /**
     */
    public void removeAllSupportedProfile(
    ) {
        this._supportedProfileList.clear();
    }

    /**
     * Method removeKnownNamespace.
     * 
     * @param vKnownNamespace
     * @return true if the object was removed from the collection.
     */
    public boolean removeKnownNamespace(
            final DocumentedNamespaceReference vKnownNamespace) {
        return _knownNamespaceList.remove(vKnownNamespace);
    }

    /**
     * Method removeKnownNamespaceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public DocumentedNamespaceReference removeKnownNamespaceAt(
            final int index) {
        DocumentedNamespaceReference obj = this._knownNamespaceList.remove(index);
        return obj;
    }

    /**
     * Method removeSupportedFormat.
     * 
     * @param vSupportedFormat
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedFormat(
            final FormatReference vSupportedFormat) {
        return _supportedFormatList.remove(vSupportedFormat);
    }

    /**
     * Method removeSupportedFormatAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public FormatReference removeSupportedFormatAt(
            final int index) {
        FormatReference obj = this._supportedFormatList.remove(index);
        return obj;
    }

    /**
     * Method removeSupportedProfile.
     * 
     * @param vSupportedProfile
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedProfile(
            final ProfileElement vSupportedProfile) {
        return _supportedProfileList.remove(vSupportedProfile);
    }

    /**
     * Method removeSupportedProfileAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public ProfileElement removeSupportedProfileAt(
            final int index) {
        ProfileElement obj = this._supportedProfileList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'defaultFormat'. The field
     * 'defaultFormat' has the following description: The default
     * format used by the service unless otherwise specified.
     * 
     * @param defaultFormat the value of field 'defaultFormat'.
     */
    public void setDefaultFormat(
            final FormatReference defaultFormat) {
        this._defaultFormat = defaultFormat;
    }

    /**
     * Sets the value of field 'implementationType'. The field
     * 'implementationType' has the following description: The
     * particular implementation type(s) supported by this profile
     * 
     * @param implementationType the value of field
     * 'implementationType'.
     */
    public void setImplementationType(
            final edu.mayo.cts2.framework.model.service.core.types.ImplementationProfile implementationType) {
        this._implementationType = implementationType;
    }

    /**
     * 
     * 
     * @param index
     * @param vKnownNamespace
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setKnownNamespace(
            final int index,
            final DocumentedNamespaceReference vKnownNamespace)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._knownNamespaceList.size()) {
            throw new IndexOutOfBoundsException("setKnownNamespace: Index value '" + index + "' not in range [0.." + (this._knownNamespaceList.size() - 1) + "]");
        }

        this._knownNamespaceList.set(index, vKnownNamespace);
    }

    /**
     * 
     * 
     * @param vKnownNamespaceArray
     */
    public void setKnownNamespace(
            final DocumentedNamespaceReference[] vKnownNamespaceArray) {
        //-- copy array
        _knownNamespaceList.clear();

        Collections.addAll(this._knownNamespaceList, vKnownNamespaceArray);
    }

    /**
     * Sets the value of '_knownNamespaceList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vKnownNamespaceList the Vector to copy.
     */
    public void setKnownNamespace(
            final java.util.List<DocumentedNamespaceReference> vKnownNamespaceList) {
        // copy vector
        this._knownNamespaceList.clear();

        this._knownNamespaceList.addAll(vKnownNamespaceList);
    }

    /**
     * Sets the value of '_knownNamespaceList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param knownNamespaceList the Vector to set.
     */
    public void setKnownNamespaceAsReference(
            final java.util.List<DocumentedNamespaceReference> knownNamespaceList) {
        this._knownNamespaceList = knownNamespaceList;
    }

    /**
     * Sets the value of field 'serviceDescription'. The field
     * 'serviceDescription' has the following description: A
     * description of the service, its use, etc.
     * 
     * @param serviceDescription the value of field
     * 'serviceDescription'.
     */
    public void setServiceDescription(
            final edu.mayo.cts2.framework.model.core.OpaqueData serviceDescription) {
        this._serviceDescription = serviceDescription;
    }

    /**
     * Sets the value of field 'serviceName'. The field
     * 'serviceName' has the following description: A short name
     * that identifies the particular service and implementation.
     * 
     * @param serviceName the value of field 'serviceName'.
     */
    public void setServiceName(
            final String serviceName) {
        this._serviceName = serviceName;
    }

    /**
     * Sets the value of field 'serviceProvider'. The field
     * 'serviceProvider' has the following description: A reference
     * to the individual or organization that provides the service.
     * 
     * @param serviceProvider the value of field 'serviceProvider'.
     */
    public void setServiceProvider(
            final edu.mayo.cts2.framework.model.core.SourceReference serviceProvider) {
        this._serviceProvider = serviceProvider;
    }

    /**
     * Sets the value of field 'serviceVersion'. The field
     * 'serviceVersion' has the following description: The version
     * or release identifier of the service.
     * 
     * @param serviceVersion the value of field 'serviceVersion'.
     */
    public void setServiceVersion(
            final String serviceVersion) {
        this._serviceVersion = serviceVersion;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedFormat
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedFormat(
            final int index,
            final FormatReference vSupportedFormat)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedFormatList.size()) {
            throw new IndexOutOfBoundsException("setSupportedFormat: Index value '" + index + "' not in range [0.." + (this._supportedFormatList.size() - 1) + "]");
        }

        this._supportedFormatList.set(index, vSupportedFormat);
    }

    /**
     * 
     * 
     * @param vSupportedFormatArray
     */
    public void setSupportedFormat(
            final FormatReference[] vSupportedFormatArray) {
        //-- copy array
        _supportedFormatList.clear();

        Collections.addAll(this._supportedFormatList, vSupportedFormatArray);
    }

    /**
     * Sets the value of '_supportedFormatList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedFormatList the Vector to copy.
     */
    public void setSupportedFormat(
            final java.util.List<FormatReference> vSupportedFormatList) {
        // copy vector
        this._supportedFormatList.clear();

        this._supportedFormatList.addAll(vSupportedFormatList);
    }

    /**
     * Sets the value of '_supportedFormatList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedFormatList the Vector to set.
     */
    public void setSupportedFormatAsReference(
            final java.util.List<FormatReference> supportedFormatList) {
        this._supportedFormatList = supportedFormatList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedProfile
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedProfile(
            final int index,
            final ProfileElement vSupportedProfile)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedProfileList.size()) {
            throw new IndexOutOfBoundsException("setSupportedProfile: Index value '" + index + "' not in range [0.." + (this._supportedProfileList.size() - 1) + "]");
        }

        this._supportedProfileList.set(index, vSupportedProfile);
    }

    /**
     * 
     * 
     * @param vSupportedProfileArray
     */
    public void setSupportedProfile(
            final ProfileElement[] vSupportedProfileArray) {
        //-- copy array
        _supportedProfileList.clear();

        Collections.addAll(this._supportedProfileList, vSupportedProfileArray);
    }

    /**
     * Sets the value of '_supportedProfileList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSupportedProfileList the Vector to copy.
     */
    public void setSupportedProfile(
            final java.util.List<ProfileElement> vSupportedProfileList) {
        // copy vector
        this._supportedProfileList.clear();

        this._supportedProfileList.addAll(vSupportedProfileList);
    }

    /**
     * Sets the value of '_supportedProfileList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param supportedProfileList the Vector to set.
     */
    public void setSupportedProfileAsReference(
            final java.util.List<ProfileElement> supportedProfileList) {
        this._supportedProfileList = supportedProfileList;
    }

    public void setlexevsVersion(final String lexevsVersion) {
            this._lexevsVersion = lexevsVersion;
    }

    /**
     * Method unmarshalBaseService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.BaseService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
