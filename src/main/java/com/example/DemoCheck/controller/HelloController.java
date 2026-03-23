package com.example.DemoCheck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello1")
    public String hello() {
        return "Hello World from Tanishq Sawarkar";
    }

    @GetMapping("/hello3")
    public String hello3() {
        return "Hello World from atharva";
    }
}
