/*
* Copyright: (c) Mayo Foundation for Medical Education and
* Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
* triple-shield Mayo logo are trademarks and service marks of MFMER.
*
* Distributed under the OSI-approved BSD 3-Clause License.
* See http://ncip.github.com/lexevs-service/LICENSE.txt for details.
*/
package edu.mayo.cts2.framework.service.lexevs.service.entity;

import edu.mayo.cts2.framework.service.lexevs.service.entity.DelegatingEntityQueryService.QueryType;
import edu.mayo.cts2.framework.service.profile.entitydescription.EntityDescriptionQuery;
import edu.mayo.cts2.framework.service.profile.entitydescription.EntityDescriptionQueryService;
import org.springframework.core.Ordered;

/**
 * The Interface DelegateEntityQueryService.
 *
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public interface DelegateEntityQueryService extends EntityDescriptionQueryService, Ordered {

	/**
	 * Can handle.
	 *
	 * @param query the query
	 * @return true, if successful
	 */
	public boolean canHandle(EntityDescriptionQuery query, QueryType queryType);
	
}
