package com.codeusingjava.bootdrools.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("gcp")
public class GCPCloudConfig {

//    @Bean
//    public CloudMessagingService cloudMessagingService (){
//        return new PubSubMessagingService();
//    }
}
