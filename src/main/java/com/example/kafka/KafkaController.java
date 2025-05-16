package com.example.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer producer;

    @PostMapping("/send")
    public String send(@RequestParam String message) {
        producer.sendMessage("demo-topic", message);
        return "✅ Sent: " + message;
    }
}