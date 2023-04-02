package com.example.annotationtest.controller;

import com.example.annotationtest.annotation.Mlog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("logtest")
    @Mlog
    public String logtest(){
        System.out.println("The message is in logtest function");
        return "This is longtest";
    }
}
