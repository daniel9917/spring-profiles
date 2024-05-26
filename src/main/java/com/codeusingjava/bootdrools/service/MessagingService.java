package com.codeusingjava.bootdrools.service;

import com.codeusingjava.bootdrools.cloud.CloudMessagingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessagingService {
    final Logger LOG = LoggerFactory.getLogger(MessagingService.class);
    @Autowired
    private CloudMessagingService cloudMessagingService;

    public void testMessagingService (){
        cloudMessagingService.publishMessage();
        cloudMessagingService.retrieveLastMessages();
    }

    @PostConstruct
    void postConstruct (){
        cloudMessagingService.snitchProvider();
    }


}
