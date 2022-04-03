package com.company.enroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(App.class, args);
    }
}