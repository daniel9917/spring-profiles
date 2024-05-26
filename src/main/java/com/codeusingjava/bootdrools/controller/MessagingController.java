package com.codeusingjava.bootdrools.controller;

import com.codeusingjava.bootdrools.service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingController {
    private final MessagingService messagingService;

    @Autowired
    public MessagingController(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @GetMapping("/cloud-messaging")
    public String testMessaging (){
        messagingService.testMessagingService();
        return "OK";
    }
}
