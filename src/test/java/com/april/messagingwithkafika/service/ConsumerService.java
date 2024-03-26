package com.april.messagingwithkafika.service;

import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
