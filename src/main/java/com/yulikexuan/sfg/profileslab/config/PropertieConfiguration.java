//: com.yulikexuan.sfg.profileslab.config.PropertieConfiguration.java


package com.yulikexuan.sfg.profileslab.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PropertieConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "sfg.author", ignoreUnknownFields = false)
    public AuthorConfigProperties authorConfigProperties() {
        return new AuthorConfigProperties();
    }

}///:~