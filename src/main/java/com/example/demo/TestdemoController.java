package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class TestdemoController {
    @Autowired
    private Testdemo testdemo;

    @RequestMapping("/hi")
    String show(@RequestParam("a") String a,
                @RequestParam("b") String b) {
        return testdemo.plus(a, b);
    }
}