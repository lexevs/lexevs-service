/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.mapversion.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

/**
 * Class MapProcessingRuleDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class MapProcessingRuleDescriptor   {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private String _nsURI;

    /**
     * Field _xmlName.
     */
    private String _xmlName;

    /**
     * Field _identity.
     */
    //    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapProcessingRuleDescriptor() {
        super();
        _nsURI = "http://www.omg.org/spec/CTS2/1.1/MapVersion";
        _xmlName = "MapProcessingRule";
        _elementDefinition = false;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
//    @Override()
    public Class getJavaClass(
    ) {
        return MapProcessingRule.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
//    @Override()
    public String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
//    @Override()
    public String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
//    @Override()
    public String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
