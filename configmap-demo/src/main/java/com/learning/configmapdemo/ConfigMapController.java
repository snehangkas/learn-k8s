package com.learning.configmapdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigMapController {
    @Value("${application.name}")
    private String applicationName;

    @Value("${application.logging.level}")
    private String loggingLevel;

    @Value("${retry.enabled:false}")
    private boolean retryEnabled;

    @GetMapping("/")
    boolean getConfigValue(){
        return retryEnabled;
    }

}
