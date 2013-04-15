/*
* Copyright: (c) 2004-2013 Mayo Foundation for Medical Education and
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
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package edu.mayo.cts2.framework.plugin.service.lexevs;

import java.lang.reflect.Method;

import javax.annotation.Resource;

import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;

/**
 * A factory for creating LexBigService objects.
 */
public class LexBigServiceFactory implements FactoryBean<LexBIGService>, DisposableBean {

	protected Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private LexEvsOsgiClassLoader lexEvsOsgiClassLoader;
	
	private LexBIGService lexBIGService;

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public LexBIGService getObject() throws Exception {

		Method method = this.lexEvsOsgiClassLoader.
			loadClass("org.LexGrid.LexBIG.Impl.LexBIGServiceImpl").
				getDeclaredMethod("defaultInstance");
		
		method.setAccessible(true);
		
		this.lexBIGService = (LexBIGService) method.invoke(null);

		return lexBIGService;
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
	public void destroy() throws Exception {
		log.info("Shutting down LexEVS.");
		this.lexBIGService.getServiceManager(null).shutdown();
	}
}
