package com.altanexercise.producer.controller;

import com.altanexercise.producer.constants.User;
import com.altanexercise.producer.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/import")
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }
}
