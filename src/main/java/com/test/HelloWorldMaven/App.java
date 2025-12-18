
package com.test.HelloWorldMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String hello() {
        return "Hello World from Jenkins + Docker + Kubernetes! /n  This is written by Maithili!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
