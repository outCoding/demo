package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test")
    public String test() {
        String env = System.getenv("env");
        return "env is :" + env;
    }


    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
