package com.example.springeventsexample;

import com.example.springeventsexample.UserEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserEventPublisher eventPublisher;

    public UserController(UserEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @GetMapping("/createUser")
//    http://localhost:8080/createUser?name=Saya
    public String createUser(@RequestParam String name) {
        eventPublisher.publishUserCreatedEvent(name);
        return "User created and event published for user: " + name;
    }
}
