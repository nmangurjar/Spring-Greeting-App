package com.greetingapp.service;

import com.greetingapp.model.Greeting;
import com.greetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

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

    public String getGreetingById(Long id) {
        Optional<Greeting> greeting = greetingRepository.findById(id);
        return greeting.map(Greeting::getMessage).orElse("Greeting not found!");
    }
}
