package com.example.oenskeseddel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Frontpage {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the frontpage";
    }
}
