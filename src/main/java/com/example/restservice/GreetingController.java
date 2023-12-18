package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //how HTTP requests are handled
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") //this ensures that the HTTP GET requests to /greeting are mapped to specific method
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        //requestparam binds the value of the query string parameter name to the name parameter of the greeting() method
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}