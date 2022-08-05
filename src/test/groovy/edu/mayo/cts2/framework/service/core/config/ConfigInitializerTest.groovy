package edu.mayo.cts2.framework.service.core.config


import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

import static org.junit.jupiter.api.Assertions.assertTrue
import static org.junit.jupiter.api.Assertions.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ConfigInitializerTest {
	
	ConfigInitializer initializer = null;
	
	def configDir
	def contextDir
	
	@BeforeAll
	void setup(){
		def tmpDir = System.getProperty("java.io.tmpdir")
		
		configDir = tmpDir + File.separator + UUID.randomUUID().toString()

		System.setProperty(ConfigConstants.CTS2_CONFIG_DIRECTORY_ENV_VARIABLE,
			configDir)

		
		new File(configDir).delete()
		new File(configDir).deleteDir()
		new File(configDir).deleteOnExit()

		
		contextDir = UUID.randomUUID().toString()
		
		ConfigInitializer.instance = null
		
		ConfigInitializer.initialize(contextDir)
		
		initializer = ConfigInitializer.instance()
	}
	
	@Test
	void testInit(){
		assertNotNull initializer
	}
	
	@Test
	void "Check config dir created"(){
		assertTrue new File(configDir).exists()
	}

	
	@Test
	void "Check context dir created"(){
		assertTrue new File(configDir + File.separator + contextDir).exists()
	}

}
