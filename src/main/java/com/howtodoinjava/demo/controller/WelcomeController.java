package com.howtodoinjava.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String message;

    public WelcomeController(
            // Injects the WELCOME_MESSAGE environment variable
            @Value("${welcome.message}") String message
    ) {
        this.message = message;
    }

    @GetMapping("/value")
    public String sayHello() {
        return message;
    }
}
