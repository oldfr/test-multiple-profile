package com.example.testmultipleprofiles.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"e1"})
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "e1") //, locations = {"classpath:application-wmx.properties", "classpath:myapp-env.properties"})
public class EmployeeDev {

    String param;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
