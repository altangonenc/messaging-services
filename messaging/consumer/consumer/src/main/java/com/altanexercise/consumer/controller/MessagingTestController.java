package com.altanexercise.consumer.controller;

import com.altanexercise.consumer.amqp.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MessagingTestController {
    @Autowired
    private QueueSender queueSender;

    @GetMapping
    public String send() {
        queueSender.send("test message for now. .... . .");
        return "ok. done...";
    }

}
