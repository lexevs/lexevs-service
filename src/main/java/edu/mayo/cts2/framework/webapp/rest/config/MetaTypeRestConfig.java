/*
 * Copyright: (c) 2004-2012 Mayo Foundation for Medical Education and 
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
package edu.mayo.cts2.framework.webapp.rest.config;


import java.util.Dictionary;
import java.util.Hashtable;
import org.apache.commons.lang.BooleanUtils;
//import org.osgi.framework.Constants;
//import org.osgi.service.cm.ConfigurationException;
//import org.osgi.service.cm.ManagedService;
//import org.osgi.service.metatype.MetaTypeProvider;
import org.springframework.stereotype.Component;

/**
 * The Class MetaTypeRestConfig.
 *
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
//@ExportedService( { MetaTypeProvider.class, ManagedService.class  })
@Component
public class MetaTypeRestConfig  implements RestConfig {
	
	public static final String ALLOW_HTML_RENDERING = "allowHtmlRendering";
	public static final String SHOW_STACK_TRACE = "showStackTrace";
	public static final String SHOW_HOME_PAGE = "showHomePage";
    public static final String SUPPORT_EMAIL = "supportEmail";
    public static final String ALTERNATE_HOME_PAGE = "alternateHomePage";
    public static final String MAX_TO_RETURN = "maxToReturn";
    

    private static final String SERVICE_PID = "edu.mayo.cts2.framework.service.webapp.rest.config";
	
	private static final boolean ALLOW_HTML_RENDERING_DEFAULT = false;
	private boolean allowHtmlRendering = ALLOW_HTML_RENDERING_DEFAULT;
	
	private static final boolean SHOW_STACK_TRACE_DEFAULT = false;
	private boolean showStackTrace = SHOW_STACK_TRACE_DEFAULT;
	
	private static final boolean SHOW_HOME_PAGE_DEFAULT = true;
	private boolean showHomePage = SHOW_HOME_PAGE_DEFAULT;
	
	private String alternateHomePage = null;
	
	private Integer maxToReturn = null;

	/* (non-Javadoc)
	 * @see org.osgi.service.metatype.MetaTypeProvider#getLocales()
	 */

	public String[] getLocales() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.osgi.service.cm.ManagedService#updated(java.util.Dictionary)
	 */

	public void updated(@SuppressWarnings("rawtypes") Dictionary properties) throws Exception {
		if(properties != null){	
			String str_allow = (String)properties.get(ALLOW_HTML_RENDERING);
			this.allowHtmlRendering = str_allow != null ? Boolean.parseBoolean(str_allow) : ALLOW_HTML_RENDERING_DEFAULT;

			String str_show = (String)properties.get(SHOW_STACK_TRACE);
			this.showStackTrace = str_show != null ? Boolean.parseBoolean(str_show) : SHOW_STACK_TRACE_DEFAULT;
			
			String str_home = (String)properties.get(SHOW_HOME_PAGE);
			this.showHomePage = str_home != null ? Boolean.parseBoolean(str_home) : SHOW_HOME_PAGE_DEFAULT;

			this.alternateHomePage = (String) properties.get(ALTERNATE_HOME_PAGE);
						
			String str_maxToReturn = (String)properties.get(MAX_TO_RETURN);
			if (str_maxToReturn != null && Integer.valueOf(str_maxToReturn) != null){
				this.maxToReturn = Integer.valueOf(str_maxToReturn);
			}
			
		}		
	}

    protected String checkEnvironmentVariableOverride(String property, String value){
        String enValue = System.getProperty(property);
        if(enValue != null){
            return enValue;
        } else {
            return value;
        }
    }
	
	protected boolean checkEnvironmentVariableOverride(String property, boolean value){
		String enValue = System.getProperty(property);
		if(enValue != null){
			return BooleanUtils.toBoolean(enValue);
		} else {
			return value;
		}
	}

	/* (non-Javadoc)
	 * @see edu.mayo.cts2.framework.service.core.plugin.ServiceMetadataAware#getMetadata()
	 */

	public Hashtable<String, Object> getMetadata() {
		Hashtable<String, Object> table = new Hashtable<String, Object>();
		table.put("service.pid", SERVICE_PID);
		
		return table;
	}

	@Override
	public boolean getAllowHtmlRendering() {
		return this.checkEnvironmentVariableOverride(ALLOW_HTML_RENDERING, this.allowHtmlRendering);
	}

	@Override
	public boolean getShowStackTraceOnError() {
		return this.checkEnvironmentVariableOverride(SHOW_STACK_TRACE, this.showStackTrace);
	}


	public boolean getShowHomePage() {
		return this.checkEnvironmentVariableOverride(SHOW_HOME_PAGE, this.showHomePage);
	}


    public String getSupportEmail() {
        return this.checkEnvironmentVariableOverride(SUPPORT_EMAIL, null);
    }
    

	public String getAlternateHomePage() {
		return this.checkEnvironmentVariableOverride(ALTERNATE_HOME_PAGE, this.alternateHomePage);
	}

    /* (non-Javadoc)
         * @see edu.mayo.cts2.framework.service.core.config.AbstractConfigurableExportedService#getMetatypeXmlPath()
         */

	protected String getMetatypeXmlPath() {
		return "/rest/webapp-rest-metatype.xml";
	}


	public Integer getMaxToReturn() {
		return this.maxToReturn;
	}
	
}
