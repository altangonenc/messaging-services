package com.altanexercise.consumer.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue consumerQueue() {
        return new Queue("consumer-queue", true);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("consumer-topic-exchange");
    }

    @Bean
    Binding serviceBinding() {
        return BindingBuilder
                .bind(consumerQueue())
                .to(exchange())
                .with("${consumer.routing.key}");
    }

}
