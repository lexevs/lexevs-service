package edu.mayo.cts2.framework.service.lexevs.service.metadata;

import edu.mayo.cts2.framework.model.service.core.DocumentedNamespaceReference;
import edu.mayo.cts2.framework.service.lexevs.service.AbstractLexEvsService;
import org.LexGrid.LexBIG.LexBIGService.LexBIGService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component public class LexEVSBuildInfo {
    String buildVersion;
    String buildTimestamp;


    @Resource
    LexBIGService lexBigService;
    public void queryVersionInfo(){
        buildVersion = lexBigService.getLexEVSBuildVersion();
        buildTimestamp = lexBigService.getLexEVSBuildTimestamp();
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public String getBuildTimestamp() {
        return buildTimestamp;
    }


}
