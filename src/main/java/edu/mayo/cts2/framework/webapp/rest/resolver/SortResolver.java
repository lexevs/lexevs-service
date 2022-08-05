package edu.mayo.cts2.framework.webapp.rest.resolver;

import edu.mayo.cts2.framework.model.core.SortCriteria;
import edu.mayo.cts2.framework.service.profile.BaseQueryService;
import org.springframework.stereotype.Component;

@Component
public class SortResolver {

	//TODO: Sort not yet supported
	public SortCriteria resolveRestSort(String sortNameOrUri, BaseQueryService service){
		return null;
	}
}
