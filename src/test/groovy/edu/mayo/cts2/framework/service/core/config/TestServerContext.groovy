package edu.mayo.cts2.framework.service.core.config

class TestServerContext implements ServerContext {

	String serverRoot = "http://localhost:8080"
	
	String appName = "webapp"

	@Override
	String getServerRootWithAppName() {
		serverRoot + '/' + appName
	}	
	
	
}
