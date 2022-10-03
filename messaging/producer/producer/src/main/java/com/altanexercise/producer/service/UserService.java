package com.altanexercise.producer.service;

import com.altanexercise.producer.amqp.QueueSender;
import com.altanexercise.producer.constants.ServiceAction;
import com.altanexercise.producer.constants.User;
import com.altanexercise.producer.dto.UserDtoAmqp;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final QueueSender queueSender;

    public UserService(QueueSender queueSender) {
        this.queueSender = queueSender;
    }

    public void addNewUser(User user) {
        UserDtoAmqp userDtoAmqp = null;
        userDtoAmqp.setUser(user);
        userDtoAmqp.setServiceAction(ServiceAction.USER_IMPORT);
        queueSender.send(userDtoAmqp);
    }
}
