package com.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello World";
    }

    public String postGreeting(String name) {
        return "Hello, " + name + "! Nice to meet you.";
    }

    public String putGreeting(String newMessage) {
        return "Updated greeting: " + newMessage;
    }

    public String deleteGreeting() {
        return "Greeting deleted successfully.";
    }
}