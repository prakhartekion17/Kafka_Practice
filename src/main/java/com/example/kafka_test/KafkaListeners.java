package com.example.kafka_test;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics="testTopic", groupId="groupId")
    void listener(String data)
    {
        System.out.println("Listener received message="+ data);
    }
}
