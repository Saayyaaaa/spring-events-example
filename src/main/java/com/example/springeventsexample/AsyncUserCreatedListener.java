package com.example.springeventsexample;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncUserCreatedListener {

    @Async
    @EventListener
    public void handleUserCreatedEventAsync(UserCreatedEvent event) {
        System.out.println("Asynchronously handling UserCreatedEvent for user: " + event.getUserName());
        // Additional async handling logic
    }
}
