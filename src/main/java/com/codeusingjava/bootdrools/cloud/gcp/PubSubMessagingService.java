package com.codeusingjava.bootdrools.cloud.gcp;

import com.codeusingjava.bootdrools.cloud.CloudMessagingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Profile("gcp")
public class PubSubMessagingService implements CloudMessagingService {
    final Logger messagingLog = LoggerFactory.getLogger(PubSubMessagingService.class);


    @Override
    public void publishMessage() {
        messagingLog.info("Publishing message to pub/sub");
    }

    @Override
    public void snitchProvider() {
        messagingLog.info("Provider for PubSubMessagingService is GCP");
    }

    @Override
    public List<String> retrieveLastMessages() {
        messagingLog.info("Retrieving messages from pub/sub");
        return new ArrayList<>();
    }

    @PostConstruct
    void postConstruct(){
        messagingLog.info("PubSubMessagingService bean instantiated using gcp profile.");
    }
}
