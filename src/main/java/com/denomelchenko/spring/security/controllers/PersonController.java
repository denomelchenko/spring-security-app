package com.denomelchenko.spring.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
    @GetMapping("/hello")
    public String hello() {
        return "/hello";
    }
}
