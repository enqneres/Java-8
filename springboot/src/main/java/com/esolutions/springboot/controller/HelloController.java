package com.esolutions.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloMessage(){
        return "Ola Java 8 - Bem vindo !!!";
    }
}
