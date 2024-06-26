package com.april.messagingwithkafika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.april.messagingwithkafika.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageController {
    
    @Autowired
    private MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping("/send/{name}")
    public String sendMessage(@PathVariable String name) {
        messageService.sendMessage(name);
        return "Message sent successfully";
    }
}
