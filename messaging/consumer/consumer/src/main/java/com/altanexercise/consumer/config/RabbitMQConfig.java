package com.altanexercise.consumer.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue consumerQueue() {
        return new Queue("consumer-queue", true);
    }

    @Bean
    DirectExchange exchange() {
        return new DirectExchange("consumer-direct-exchange");
    }

}
