package edu.mayo.cts2.framework.service.core.config;

import org.springframework.beans.factory.annotation.Value;

public class ServerContextImpl implements ServerContext {
	
	@Value("${server.root}")
	private String serverRoot;
	
	@Value("${app.name}")
	private String appName;
	

	@Override
	public String getServerRoot() {
		return null;
	}

	@Override
	public String getServerRootWithAppName() {
		return serverRoot + "/" + appName;
	}

	@Override
	public String getAppName() {
		return appName;
	}

}
