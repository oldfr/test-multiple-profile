package com.example.testmultipleprofiles.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"e2"})
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "e2") //, locations = {"classpath:application-wmx.properties", "classpath:myapp-env.properties"})
public class EmployeeTest {

    String param;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
