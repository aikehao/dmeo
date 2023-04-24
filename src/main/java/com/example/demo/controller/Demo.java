package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("/demo1")
    public String demo1(){
        return "hello2";
    }


}
