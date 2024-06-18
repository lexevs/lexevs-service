/*
* Copyright: (c) Mayo Foundation for Medical Education and
* Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
* triple-shield Mayo logo are trademarks and service marks of MFMER.
*
* Distributed under the OSI-approved BSD 3-Clause License.
* See http://ncip.github.com/lexevs-service/LICENSE.txt for details.
*/
package edu.mayo.cts2.framework.lexevs;

import jakarta.annotation.PostConstruct;

import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Impl.LexBIGServiceImpl;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * A factory for creating LexBigService objects.
 */
@Component
public class LexBigServiceFactory implements FactoryBean<LexBIGService>, DisposableBean {

	private static final String LG_CONFIG_FILE_ENV = "LG_CONFIG_FILE";
	
	protected Logger log = LogManager.getLogger(this.getClass());

	private LexBIGService lexBIGService;

//	@Value("${lexevsRemoteApiUrl}")
//	private String lexevsRemoteApiUrl;
	
	@Value("${LG_CONFIG_FILE}")
	private String lgConfigFile;
	
	private boolean hasBeenConfigured = false;

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public LexBIGService getObject() throws InterruptedException {
		while(! this.hasBeenConfigured){
			this.log.warn("Waiting for the Configuration Service to start...");
			Thread.sleep(4000);
		}
		
		if(StringUtils.isBlank(this.lgConfigFile)){
			throw new IllegalStateException(LG_CONFIG_FILE_ENV + " value is empty.");
		}
		System.setProperty(LG_CONFIG_FILE_ENV, this.lgConfigFile);
		
		this.lexBIGService = LexBIGServiceImpl.defaultInstance();
		return this.lexBIGService;
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class<?> getObjectType() {
		return LexBIGService.class;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
	
	@Override
	public void destroy() throws LBException {
		if(this.lexBIGService != null){
			log.info("Shutting down local LexEVS.");
			this.lexBIGService.getServiceManager(null).shutdown();
		}
	}
	
	@PostConstruct
	public void updateCallback(){
		
		this.hasBeenConfigured = true;
	}

//	public String getLexevsRemoteApiUrl() {
//		return lexevsRemoteApiUrl;
//	}
//
//	public void setLexevsRemoteApiUrl(String lexevsRemoteApiUrl) {
//		this.lexevsRemoteApiUrl = lexevsRemoteApiUrl;
//	}

	public String getLgConfigFile() {
		return lgConfigFile;
	}

	public void setLgConfigFile(String lgConfigFile) {
		this.lgConfigFile = lgConfigFile;
	}

}
