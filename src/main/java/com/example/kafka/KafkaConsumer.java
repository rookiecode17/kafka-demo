package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "demo-topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("🔥 Received message: " + message);
    }
}