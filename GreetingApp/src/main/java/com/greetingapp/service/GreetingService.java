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

    public String getPersonalizedGreeting(String firstName, String lastName) {
        if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
            return "Hello, " + firstName + " " + lastName + "! Nice to meet you.";
        } else if (firstName != null && !firstName.isEmpty()) {
            return "Hello, " + firstName + "!";
        } else if (lastName != null && !lastName.isEmpty()) {
            return "Hello, " + lastName + "!";
        } else {
            return getGreeting();
        }
    }
}

