package com.example.DemoCheck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Dhruv")
public class DhruvController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello From Dhruv";
    }
    @GetMapping("/Namaste")
    public String Namaste() {
        return "Namaste From Dhruv";
    }

}
