package com.example.springeventsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringEventsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEventsExampleApplication.class, args);
    }
}
