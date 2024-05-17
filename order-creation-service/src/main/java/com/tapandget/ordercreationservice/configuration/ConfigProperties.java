package com.tapandget.ordercreationservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "order-creation-servicetap")
public class ConfigProperties {

    private String maximumTimeCreation;

    public String getMaximumTimeCreation() {
        return maximumTimeCreation;
    }

    public void setMaximumTimeCreation(String maximumTimeCreation) {
        this.maximumTimeCreation = maximumTimeCreation;
    }
}
