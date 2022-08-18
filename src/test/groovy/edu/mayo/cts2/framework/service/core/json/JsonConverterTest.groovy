package edu.mayo.cts2.framework.service.core.json

import edu.mayo.cts2.framework.model.core.ChangeDescription
import edu.mayo.cts2.framework.model.core.ChangeableElementGroup
import edu.mayo.cts2.framework.model.core.EntryDescription
import edu.mayo.cts2.framework.model.core.ScopedEntityName
import edu.mayo.cts2.framework.model.core.TsAnyType
import edu.mayo.cts2.framework.service.core.xml.Cts2Marshaller
import edu.mayo.cts2.framework.model.codesystem.CodeSystemCatalogEntry

import edu.mayo.cts2.framework.model.core.types.ChangeType
import edu.mayo.cts2.framework.model.entity.Designation
import edu.mayo.cts2.framework.model.entity.EntityDescription
import edu.mayo.cts2.framework.model.entity.NamedEntityDescription
import edu.mayo.cts2.framework.model.service.exception.UnsupportedNameOrURI
import edu.mayo.cts2.framework.model.updates.ChangeSet
import edu.mayo.cts2.framework.model.updates.ChangeableResource
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertFalse
import static org.junit.jupiter.api.Assertions.assertThrows
import static org.junit.jupiter.api.Assertions.assertTrue
import static org.junit.jupiter.api.Assertions.assertNotNull
import static org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource

import javax.xml.transform.stream.StreamSource


class JsonConverterTest {
	
	@Test
	void TestGetJsonClass(){
		def converter = new JsonConverter()
		
		def json = """
		{"CodeSystemCatalogEntry":{"codeSystemName":"csname","designedForOntologyTask":[],"usedOntologyEngineeringTool":[],"releaseFormat":[],"about":"urn:oid:about","keyword":[],"resourceType":[],"additionalDocumentation":[],"sourceAndRole":[],"note":[],"property":[],"alternateID":[],"entryState":"ACTIVE"}}
		"""	
		
		assertEquals CodeSystemCatalogEntry, converter.getJsonClass(json)
	}
	
	@Test
	void TestFromObjectWithExtra(){
		def converter = new JsonConverter()
		
		def json = """
		{"CodeSystemCatalogEntry":{"somethingElse" : "aDifferentThing", "codeSystemName":"csname","about":"urn:oid:about","entryState":"ACTIVE"}}
		"""
		
		def cs = converter.fromJson(json)
		assertEquals CodeSystemCatalogEntry, cs.class
		assertEquals "urn:oid:about", cs.about
		assertEquals "csname", cs.codeSystemName
		assertEquals "ACTIVE", cs.entryState.toString()
	}

    @Test
    void TestFromInvalidObject(){
        def converter = new JsonConverter()

        def json = """
		{"somethingElse" : "aDifferentThing", "codeSystemName":"csname","about":"urn:oid:about","entryState":"ACTIVE"}
		"""

        Exception exception = assertThrows(JsonUnmarshallingException,() ->converter.fromJson(json))
		assertTrue(exception instanceof JsonUnmarshallingException)
		assertEquals("Could not determine the type of the JSON String: \n" +
				"\t\t{\"somethingElse\" : \"aDifferentThing\", \"codeSystemName\":\"csname\",\"about\":\"urn:oid:about\",\"entryState\":\"ACTIVE\"}\n\t\t", exception.getMessage())
		System.println(exception.getMessage());

    }

    @Test
	void TestJsonToObject(){
		def converter = new JsonConverter()
		
		def json = """
		{"CodeSystemCatalogEntry":{"codeSystemName":"csname","designedForOntologyTask":[],"usedOntologyEngineeringTool":[],"releaseFormat":[],"about":"urn:oid:about","keyword":[],"resourceType":[],"additionalDocumentation":[],"sourceAndRole":[],"note":[],"property":[],"alternateID":[],"entryState":"ACTIVE"}}
		"""
		
		assertEquals "csname", converter.fromJson(json, CodeSystemCatalogEntry).codeSystemName
	}
	
	@Test
	void TestObjectToJsonSpecialChars(){
		def converter = new JsonConverter()
		def cs = new CodeSystemCatalogEntry(resourceSynopsis: new EntryDescription(value: new TsAnyType()))
		cs.resourceSynopsis.value.content = '&lt;a href="https://obo.cvs.sourceforge.net/*checkout*/song/ontology/sofa.obo"&gt;SOFA&lt;/a&gt; '
		
		def json = converter.toJson(cs)
		
		def cs_return = converter.fromJson(json)
		
		assertEquals cs.resourceSynopsis.value.content, cs_return.resourceSynopsis.value.content
	}
	
	@Test
	void TestExceptionToJson(){
		def converter = new JsonConverter()
		def ex = new UnsupportedNameOrURI()
		
		def json = converter.toJson(ex)
	}

	@Test
	void TestSetChoiceValue(){
		def converter = new JsonConverter()
		
		def ed = new NamedEntityDescription(entityID:new ScopedEntityName(name:"n",namespace:"ns"))
		
		def des = new EntityDescription()
		des.setNamedEntity(ed)
		
		converter.setChoiceValue(des)
		
		assertNotNull des.namedEntity
		assertNotNull des.choiceValue
	}
	
	@Test
	void TestGetJsonFromObject(){
		def converter = new JsonConverter()
		
		def cs = new CodeSystemCatalogEntry()
		cs.addKeyword("test1")
		cs.addKeyword("test2")

		assertTrue converter.toJson(cs).contains("\"keyword\":[\"test1\",\"test2\"]")
	}

    @Test
    void TestGetJsonNoSynopsisValue(){
        def converter = new JsonConverter()

        def cs = new CodeSystemCatalogEntry()
        cs.setResourceSynopsis(new EntryDescription())

        converter.toJson(cs)
    }

	@Test
	void TestGetJsonNullSynopsisValue(){
		def converter = new JsonConverter()
		
		def cs = new CodeSystemCatalogEntry()
		cs.setResourceSynopsis(new EntryDescription())
		cs.getResourceSynopsis().setValue(new TsAnyType())
		cs.getResourceSynopsis().getValue().setContent(null)
		
		converter.toJson(cs)
	}

    @Test
    void TestChangeSet(){
        def converter = new JsonConverter()

        def cs = new ChangeSet()
        cs.setChangeSetURI("111")

        def resource = new ChangeableResource()
        resource.codeSystem = new CodeSystemCatalogEntry(codeSystemName: "asdf", about: "asdf")
        resource.entryOrder = 1
        resource.changeableElementGroup = new ChangeableElementGroup(changeDescription: new ChangeDescription(changeType: ChangeType.CREATE))
        cs.addMember(resource)

        def json = converter.toJson(cs)
        print json
        assertFalse json.contains("changeableElementGroup")

        cs = converter.fromJson(json)

        assertNotNull cs.member[0].choiceValue
        assertTrue cs.member[0].choiceValue instanceof CodeSystemCatalogEntry
    }

    @Test
    void TestChangeableElementGroup(){
        def converter = new JsonConverter()
        def resource = new ChangeableResource()
        resource.codeSystem = new CodeSystemCatalogEntry(codeSystemName: "asdf", about: "asdf")
        resource.entryOrder = 1
        resource.changeableElementGroup = new ChangeableElementGroup(changeDescription: new ChangeDescription(changeType: ChangeType.CREATE))

        def json = converter.toJson(resource)

        print json

        def roundTrip = converter.fromJson(json)

        assertNotNull roundTrip.changeableElementGroup
    }
	
	@Test
	void TestGetJsonBlankSynopsisValue(){
		def converter = new JsonConverter()
		
		def cs = new CodeSystemCatalogEntry()
		cs.setResourceSynopsis(new EntryDescription())
		cs.getResourceSynopsis().setValue(new TsAnyType())
		cs.getResourceSynopsis().getValue().setContent("    ")
		
		converter.toJson(cs)
	}

    @Test
    void TestISODate(){
        def converter = new JsonConverter()

        print converter.fromJson("{\"ChangeSet\":{\"state\":\"FINAL\",\"changeSetURI\":\"asdf\",\"creationDate\":\"2013-10-23T16:45:21.142-05:00\"}}")
    }

	//TODO
//	@Test
//	void TestGetJsonFromComplexObject(){
//		def converter = new JsonConverter()
//
//		Cts2Marshaller marshaller = new Cts2MarshallerImpl()
//
//		Resource xml = new ClassPathResource("xml/breakingJson.xml")
//
//		def stream = xml.getInputStream()
//
//		def cs = marshaller.unmarshal(new StreamSource(stream))
//
//		println converter.toJson(cs)
//	}
	
//	@Test
//	void TestGetJsonFromXMLBreaking(){
//		def converter = new JsonConverter()
//
//		Cts2Marshaller marshaller = new Cts2MarshallerImpl()
//
//		Resource xml = new ClassPathResource("xml/breaksJsonCodeSystems.xml")
//
//		def stream = xml.getInputStream()
//
//		def cs = marshaller.unmarshal(new StreamSource(stream))
//
//		converter.toJson(cs)
//	}
	
	@Test
	void TestGetJsonFromDesignation(){
		def converter = new JsonConverter()
		
		def d = new Designation()
		d.value = new TsAnyType(content: "test")

		assertTrue ! converter.toJson(d).contains("anyObject")
		assertTrue converter.toJson(d).contains("\"value\":\"test\"")
	}
	
	@Test
	void TestGetJsonFromDesignationRoundTrip(){
		def converter = new JsonConverter()
		
		def d = new Designation()
		d.value = new TsAnyType(content: "test")
		
		def json = converter.toJson(d)
		
		def retD = converter.fromJson(json)
		
		assertEquals d, retD
	}

}
