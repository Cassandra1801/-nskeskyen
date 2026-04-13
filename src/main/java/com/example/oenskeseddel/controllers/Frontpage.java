package com.example.oenskeseddel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Frontpage {

    @GetMapping("/")
    public String welcome() {
        return "index";
    }
}
