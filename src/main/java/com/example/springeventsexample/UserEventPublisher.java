package com.example.springeventsexample;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserEventPublisher {

    private final ApplicationEventPublisher publisher;

    public UserEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishUserCreatedEvent(String userName) {
        UserCreatedEvent event = new UserCreatedEvent(this, userName);
        publisher.publishEvent(event);
        System.out.println("Published UserCreatedEvent for user: " + userName);
    }
}
