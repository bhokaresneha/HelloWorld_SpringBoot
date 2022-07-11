package com.bridgelabz.helloworld_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String hello(){
        return "Hello From Bridgelabz";
    }
}
