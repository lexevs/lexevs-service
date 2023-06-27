package edu.mayo.cts2.framework.controller;

import edu.mayo.cts2.framework.service.lexevs.service.metadata.LexEVSBuildInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LexEVSMetadataController extends AbstractMessageWrappingController {

    @Cts2Service
    private LexEVSBuildInfo lexEVSBuildInfo;

    @RequestMapping(value = "/lexevs/buildVersion", method = RequestMethod.GET)
    public Object getLexEVSBuildVersion() {
        this.lexEVSBuildInfo.queryVersionInfo();
        return lexEVSBuildInfo.getBuildVersion();
    }

    @RequestMapping(value = "/lexevs/buildTimestamp", method = RequestMethod.GET)
    public Object getLexEVSBuildTime() {
        this.lexEVSBuildInfo.queryVersionInfo();
        return lexEVSBuildInfo.getBuildTimestamp();
    }
}
