package com.altanexercise.producer.amqp;

import com.altanexercise.producer.dto.UserDtoAmqp;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(UserDtoAmqp order) {
        rabbitTemplate.convertAndSend(this.queue.getName(), order);
    }
}
