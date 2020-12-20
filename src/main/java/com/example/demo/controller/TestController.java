package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class TestController {

    @RequestMapping("test")
    public String test() {
        Map<String, String> map = System.getenv();
        for (String key : map.keySet()) {
            log.info(key + "=" + map.get(key));
        }
        return "test";
    }


    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
