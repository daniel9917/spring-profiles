package com.codeusingjava.bootdrools.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("aws")
public class AWSCloudConfig {
//    @Bean
//    public CloudMessagingService cloudMessagingService (){
//        return new SimpleQueuingMessagingService();
//    }
}
