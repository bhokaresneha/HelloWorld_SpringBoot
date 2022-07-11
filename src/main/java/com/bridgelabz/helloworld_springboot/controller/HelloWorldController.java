package com.bridgelabz.helloworld_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("/web")
    public String Hello(){
        return "hello";
    }
    @GetMapping("/webs/message")
    public String message(Model model){
        model.addAttribute("message","This is a custom message");
        return "message";
    }
}
