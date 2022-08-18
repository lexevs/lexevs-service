/*
 * Copyright: (c) 2004-2011 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.mayo.cts2.framework.service.core.config;

import java.net.InetAddress;
import org.apache.commons.logging.LogFactory;

/**
 * The Class ConfigConstants.
 *
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class ConfigConstants {

	public static final String CONFIG_DIRECTORY = "config";
	
	public static final String CTS2_DEPLOYMENT_CONFIG_FILE_NAME = "cts2-deployment.properties";

	/** The Constant CONTEXT_PROPERTIES_FILE. */
	public static final String CONTEXT_PROPERTIES_FILE = "service.properties";

	/** The Constant JNDI_CONTEXT_ID. */
	public static final String JNDI_CONTEXT_ID = "contextIdentifier";

	/** The Constant JNDI_CONFIG_DIRECTORY. */
	public static final String JNDI_CONFIG_DIRECTORY = "configDirectory";

	/** The Constant CTS2_CONFIG_DIRECTORY_ENV_VARIABLE. */
	public static final String CTS2_CONFIG_DIRECTORY_ENV_VARIABLE = "cts2.config.dir";

	/** The Constant CTS2_CONTEXT_ENV_VARIABLE. */
	public static final String CTS2_CONTEXT_ENV_VARIABLE = "cts2.context";

	
	public static final String SERVER_ROOT_PROPERTY = "server.root";
	public static final String DEFAULT_SERVER_ROOT_PROPERTY_VALUE;
	static {
		String temp = "http://localhost:8080";
		try
		{
			temp = "http://" + InetAddress.getLocalHost().getHostName() + ":8080";
		}
		catch (Exception e)
		{
			LogFactory.getLog(ConfigConstants.class).warn("Error determining hostname automatically, using 'localhost'.  ", e);;
		}
		DEFAULT_SERVER_ROOT_PROPERTY_VALUE = temp;
	}
	
	public static final String APP_NAME_PROPERTY = "app.name";	
	public static final String DEFAULT_APP_NAME_PROPERTY_VALUE = "webapp-rest";

	
	public static final String ADMIN_USERNAME_PROPERTY = "admin.username";
	public static final String DEFAULT_ADMIN_USERNAME_VALUE = "admin";
	
	public static final String ADMIN_PASSWORD_PROPERTY = "admin.password";
	public static final String DEFAULT_ADMIN_PASSWORD_VALUE = "admin";
	
	public static final String BLANK_VALUE = "";
	
	private ConfigConstants(){
		super();
	}
}
