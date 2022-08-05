package edu.mayo.cts2.framework.service.core.url

import edu.mayo.cts2.framework.service.core.config.ServerContext
import edu.mayo.cts2.framework.service.core.config.TestServerContext
import edu.mayo.cts2.framework.model.codesystem.CodeSystemCatalogEntry
import edu.mayo.cts2.framework.model.codesystemversion.CodeSystemVersionCatalogEntry
import edu.mayo.cts2.framework.model.core.CodeSystemReference
import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference
import edu.mayo.cts2.framework.model.core.NameAndMeaningReference

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

import static org.junit.jupiter.api.Assertions.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HrefProcessorTest {
	
	HrefProcessor hrefProcessor

	@BeforeAll
	void setup(){
		ServerContext serverContext = new TestServerContext()
		serverContext.appName = "testapp"
		serverContext.serverRoot = "http://serverRoot:8080"
		
		hrefProcessor = new HrefProcessor(new UrlConstructor(serverContext))
	}
	
	@Test
	void TestProcessCodeSystemHrefs(){
		def cs = new CodeSystemCatalogEntry(
			codeSystemName:"cs",
			currentVersion: 
				new CodeSystemVersionReference(
					codeSystem: new CodeSystemReference(content:"cs"),
					version:new NameAndMeaningReference(content:"csv")))
		
		hrefProcessor.processHrefs(cs)
		
		assertEquals "http://serverRoot:8080/testapp/codesystem/cs", cs.getCurrentVersion().getCodeSystem().getHref()
		assertEquals "http://serverRoot:8080/testapp/codesystem/cs/version/csv", cs.getCurrentVersion().getVersion().getHref()
		assertEquals "http://serverRoot:8080/testapp/codesystem/cs/versions", cs.getVersions();
	}
	
	@Test
	@Disabled
	void TestProcessCodeSystemVersionHrefs(){
		def csv = new CodeSystemVersionCatalogEntry(
			codeSystemVersionName:"csv",
			versionOf: new CodeSystemReference(content:"cs"))
		
		hrefProcessor.processHrefs(csv)
		
		assertEquals "http://serverRoot:8080/testapp/codesystem/cs", csv.getVersionOf().getHref()
		assertEquals "http://serverRoot:8080/testapp/codesystem/cs/version/csv/entities", csv.getEntityDescriptions()
		assertEquals "http://serverRoot:8080/testapp/codesystem/cs/version/csv/associations", csv.getAssociations()
		assertEquals "http://serverRoot:8080/testapp/codesystem/cs/version/csv/classes", csv.getClasses()
		assertEquals "http://serverRoot:8080/testapp/codesystem/cs/version/csv/roles", csv.getRoles()
		assertEquals "http://serverRoot:8080/testapp/codesystem/cs/version/csv/individuals", csv.getIndividuals()
	
	}
	


}
