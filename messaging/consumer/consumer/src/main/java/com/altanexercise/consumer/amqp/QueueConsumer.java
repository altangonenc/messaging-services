package com.altanexercise.consumer.amqp;

import com.altanexercise.consumer.entity.User;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class QueueConsumer {

    Logger logger = (Logger) LoggerFactory.getLogger(QueueConsumer.class);

    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload User user) {
        logger.info("incoming message: "+ user);
    }
}
