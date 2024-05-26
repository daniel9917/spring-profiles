package com.codeusingjava.bootdrools.cloud.aws;

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
@Profile("aws")
public class SimpleQueuingMessagingService implements CloudMessagingService {
    final Logger messagingLog = LoggerFactory.getLogger(SimpleQueuingMessagingService.class);

    @Override
    public void publishMessage() {
        messagingLog.info("Publishing message to simple queuing messaging service");
    }

    @Override
    public void snitchProvider() {
        messagingLog.info("Provider for SimpleQueuingMessagingService is AWS");
    }

    @Override
    public List<String> retrieveLastMessages() {
        messagingLog.info("Retrieving messages from simple queuing messaging service");
        return new ArrayList<>();
    }

    @PostConstruct
    void postConstruct(){
        messagingLog.info("SimpleQueuingMessagingService bean instantiated using aws profile.");
    }
}
