package com.altanexercise.producer.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue producerQueue() {
        return new Queue("producer-queue",true);
    }

    @Bean
    DirectExchange directExchange() {
        return new DirectExchange("producer-direct-exchange");
    }

    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("producer-fanout-exchange");
    }
}
