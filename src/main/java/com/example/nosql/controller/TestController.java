package com.example.nosql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/test")
public class TestController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "NGUYỄN TIẾN NGHĨA";
    }
}