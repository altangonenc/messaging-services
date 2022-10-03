package com.altanexercise.consumer.dto;

import com.altanexercise.consumer.constants.ServiceAction;
import com.altanexercise.consumer.constants.User;
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
