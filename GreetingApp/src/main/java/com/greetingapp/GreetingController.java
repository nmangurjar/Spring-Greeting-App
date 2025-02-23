package com.greetingapp;


import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String getMapping() {
        return "{\"message\": \"Hello, this is a GET request\"}";
    }

    @PostMapping("/greet")
    public String postMapping() {
        return "{\"message\": \"Hello, this is a POST request\"}";
    }

    @PutMapping("/greet")
    public String putGreeting() {
        return "{\"message\": \"Hello, this is a PUT request\"}";
    }

    @DeleteMapping("/greet")
    public String deleteGreeting() {
        return "{\"message\": \"Hello, this is a DELETE request\"}";
    }
}

