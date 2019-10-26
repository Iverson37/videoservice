package com.krupnov.videoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {

    @GetMapping
    public String sayHello() {
        return "Hello";
    }
}
