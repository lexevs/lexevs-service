package edu.mayo.cts2.framework.controller;

import java.util.Map;


public interface UrlTemplateBinder<R> {

	public Map<String,String> getPathValues(R resource);
	
}
