package com.ochwada.dockerstringbootdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *******************************************************
 * Package: com.ochwada.dockerstringbootdemo
 * File: HelloController.java
 * Author: Ochwada
 * Date: Wednesday, 16.Jul.2025, 11:49 AM
 * Description:
 * Objective:
 * *******************************************************
 */

@RestController
public class HelloController {
    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello World, from Dockerized Spring Boot !";
    }
}
