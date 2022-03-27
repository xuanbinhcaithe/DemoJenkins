package com.example.springelasticsearch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/say")
    public String sayHello() {
        return "Hello Xuan Binh";
    }

    @GetMapping("/sayHello/{name}")
    public String sayName(@PathVariable("name") String name) {
        return "Hello" + name;
    }
}
