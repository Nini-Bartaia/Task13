package com.example.testController.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController

public class helloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World";
    }

    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable String name) {
        return "Hello, " + name;
    }
}
