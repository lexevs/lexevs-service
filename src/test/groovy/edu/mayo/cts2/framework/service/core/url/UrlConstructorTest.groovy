package edu.mayo.cts2.framework.service.core.url

import edu.mayo.cts2.framework.service.core.config.ServerContext
import edu.mayo.cts2.framework.service.core.config.TestServerContext
import edu.mayo.cts2.framework.model.service.core.types.FunctionalProfile
import edu.mayo.cts2.framework.model.service.core.types.StructuralProfile
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

import static org.junit.jupiter.api.Assertions.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UrlConstructorTest {
	
	UrlConstructor urlConstructor = new UrlConstructor()
	
	@BeforeAll
	void setup(){
		ServerContext serverContext = new TestServerContext()
		serverContext.appName = "testapp"
		serverContext.serverRoot = "http://serverRoot:8090"
		
		urlConstructor.serverContext = serverContext
	}
	
	@Test
	void "Test create CodeSystem URL"(){
		String url = urlConstructor.createCodeSystemUrl("CSN");
		
		assertEquals "http://serverRoot:8090/testapp/codesystem/CSN", url
	}
	
	@Test
	void "Test create CodeSystemVersion URL"(){
		String url = urlConstructor.createCodeSystemVersionUrl("CSN", "CSVN");
		
		assertEquals "http://serverRoot:8090/testapp/codesystem/CSN/version/CSVN", url
	}
	
	@Test
	void "Test create Entity URL"(){
		String url = urlConstructor.createEntityUrl("CSN", "CSVN", "ENTITY");
		
		assertEquals "http://serverRoot:8090/testapp/codesystem/CSN/version/CSVN/entity/ENTITY", url
	}
	
	@Test
	void "Test create Entities of CodeSystemVersion URL"(){
		String url = urlConstructor.createEntitiesOfCodeSystemVersionUrl("CSN", "CSVN");
		
		assertEquals "http://serverRoot:8090/testapp/codesystem/CSN/version/CSVN/entities", url
	}

	@Test
	void "Test create Service URL"(){
		String url = urlConstructor.createServiceUrl(StructuralProfile.SP_CODE_SYSTEM, FunctionalProfile.FP_READ);

		assertEquals "http://serverRoot:8090/testapp/service/codesystemread", url
	}
}
