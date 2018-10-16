package com.adeveloperdiary.springbootibm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloSpringBootIBMController {

    @GetMapping
    public String hello() {
        return "<H1>Spring Boot Application from Adevloperdiary.com</H1>";
    }
}
