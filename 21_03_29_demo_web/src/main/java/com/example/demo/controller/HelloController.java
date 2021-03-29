package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Contorller
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello";
    }
}
