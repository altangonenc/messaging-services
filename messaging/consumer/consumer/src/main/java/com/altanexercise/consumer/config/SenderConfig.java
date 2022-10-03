package com.altanexercise.consumer.config;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {

    @Value("${producer.queue.name}")
    private String sendingLocation;

    @Bean
    public Queue queue() {
        return new Queue(sendingLocation, true);
    }
}
