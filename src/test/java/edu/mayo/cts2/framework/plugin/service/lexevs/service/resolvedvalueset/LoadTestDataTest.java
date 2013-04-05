/*
 * Copyright: (c) 2004-2010 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 * 
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 * 		http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package edu.mayo.cts2.framework.plugin.service.lexevs.service.resolvedvalueset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

import org.LexGrid.LexBIG.DataModel.InterfaceElements.types.ProcessState;
import org.LexGrid.LexBIG.Exceptions.LBException;
import org.LexGrid.LexBIG.Extensions.Load.OBO_Loader;
import org.LexGrid.LexBIG.Impl.loaders.LexGridMultiLoaderImpl;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.LexGrid.LexBIG.LexBIGService.LexBIGServiceManager;
import org.LexGrid.LexBIG.Utility.LBConstants;
import org.junit.Test;
import org.lexgrid.valuesets.LexEVSValueSetDefinitionServices;
import org.lexgrid.valuesets.impl.LexEVSValueSetDefinitionServicesImpl;

import edu.mayo.cts2.framework.plugin.service.lexevs.test.AbstractTestITBase;
import edu.mayo.cts2.framework.plugins.service.LocalClasspathLexBigServiceFactory;

/**
 * This set of tests loads the necessary data for the value set and pick list definition test.
 * 
 * @author <A HREF="mailto:dwarkanath.sridhar@mayo.edu">Sridhar Dwarkanath</A>
 * @version subversion $Revision: $ checked in on $Date: $
 */
public class LoadTestDataTest extends AbstractTestITBase {
	private LexEVSValueSetDefinitionServices vds_;
//	private LexEVSPickListDefinitionServices pls_;
	
//	public LoadTestDataTest(String serverName) {
//		super(serverName);
//	}
    @Test
	public void testLoadAutombilesV1() throws Exception {
	    loadXML("resources/lexevs/test-content/valueset/Automobiles.xml", "devel");
	}
    
    @Test	
	public void testLoadAutombilesV2() throws Exception  {
	     loadXML("resources/lexevs/test-content/valueset/AutomobilesV2.xml", LBConstants.KnownTags.PRODUCTION.toString());
	}

	public void testLoadGermanMadeParts() throws Exception {
        loadXML("resources/testData/German_Made_Parts.xml", LBConstants.KnownTags.PRODUCTION.toString());
    }
	
	private void loadXML(String fileName, String tag) throws Exception {
        LexBIGServiceManager lbsm = getLexBIGService().getServiceManager(null);

        LexGridMultiLoaderImpl loader = (LexGridMultiLoaderImpl) lbsm
                .getLoader("LexGrid_Loader");
        
        // load non-async - this should block
        loader.load(new File(fileName).toURI(), true, false);
        
        while (loader.getStatus().getEndTime() == null) {
            Thread.sleep(2000);
        }
        assertEquals(loader.getStatus().getEndTime(),  null);
        assertTrue(loader.getStatus().getState().equals(ProcessState.COMPLETED));
        assertFalse(loader.getStatus().getErrorsLogged().booleanValue());
        
        lbsm.activateCodingSchemeVersion(loader.getCodingSchemeReferences()[0]);
        
        lbsm.setVersionTag(loader.getCodingSchemeReferences()[0], tag);
	}

	@Test
	public void testLoadObo() throws Exception {
		LexBIGServiceManager lbsm = getLexBIGService().getServiceManager(null);

		OBO_Loader loader = (OBO_Loader) lbsm.getLoader("OBOLoader");

		loader.load(new File(
				"resources/testData/fungal_anatomy.obo").toURI(),
				null, true, true);

		while (loader.getStatus().getEndTime() == null) {
			Thread.sleep(2000);
		}
		assertTrue(loader.getStatus().getState().equals(ProcessState.COMPLETED));
		assertFalse(loader.getStatus().getErrorsLogged().booleanValue());

		lbsm.activateCodingSchemeVersion(loader.getCodingSchemeReferences()[0]);

		lbsm.setVersionTag(loader.getCodingSchemeReferences()[0],
				LBConstants.KnownTags.PRODUCTION.toString());
	}
	
	/**
	 * gForge #24967
	 * Test to determine that ValueSet Services will not throw null pointer exception when there are
	 * no Value Set Definition in the system. Also to remove if any test value set definitions are
	 * present.
	 *  
	 * @throws LBException
	 * @throws URISyntaxException
	 */
	@Test
	public void testCheckValueSetDef() throws LBException, URISyntaxException{
		List<String> uris = getValueSetDefService().listValueSetDefinitions(null);
		
		// check if we missed any test valueSefDefs
		uris = getValueSetDefService().listValueSetDefinitions(null);
		
		for (String uri : uris)
		{
			if (uri.toString().startsWith("SRITEST:"))
				assertFalse("Not all test value domains were deleted.",true);
		}
	}
	
	
	@Test
	public void testLoadValueSetDef() throws Exception {
		getValueSetDefService().loadValueSetDefinition("resources/lexevs/test-content/valueset/vdTestData.xml", true);
	}

	private LexEVSValueSetDefinitionServices getValueSetDefService(){
		if (vds_ == null) {
			vds_ = LexEVSValueSetDefinitionServicesImpl.defaultInstance();
		}
		return vds_;
	}
	
	private LexBIGService getLexBIGService() throws Exception  {
		LocalClasspathLexBigServiceFactory factory= new LocalClasspathLexBigServiceFactory();
		return factory.getObject();
		//return LexBIGServiceImpl.defaultInstance();
	}

}