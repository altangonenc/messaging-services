package com.altanexercise.producer.dto;

import com.altanexercise.producer.constants.ServiceAction;
import com.altanexercise.producer.constants.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserDtoAmqp {
    User user;
    ServiceAction serviceAction;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceAction getServiceAction() {
        return serviceAction;
    }

    public void setServiceAction(ServiceAction serviceAction) {
        this.serviceAction = serviceAction;
    }
}
