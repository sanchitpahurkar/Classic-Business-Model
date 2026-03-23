package com.example.DemoCheck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJController {

    @GetMapping("/hello-j")
    public String getMessageFromJ(){
        return "Hello This is Jatin from Group 4";
    }
}
