package com.DemoApp.demo.configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.demoapp.demo")
public class CustomProperties {
    
    private String apiUrl;
    
}
