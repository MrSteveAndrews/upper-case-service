package com.blueagility.strings.uppercase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UpperCaseServiceApplication {


    @Autowired
    private UpperCaseServiceController upperCaseServiceController;

    public static void main(String[] args) {
        SpringApplication.run(UpperCaseServiceApplication.class, args);
    }

    public UpperCaseServiceController uppercaseServiceController() {
        return upperCaseServiceController;
    }
}