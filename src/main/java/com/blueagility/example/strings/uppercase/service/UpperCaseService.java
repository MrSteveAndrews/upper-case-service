package com.blueagility.example.strings.uppercase.service;

import org.springframework.stereotype.Component;

/**
 * The upperCase service core business logic
 */
@Component
public class UpperCaseService {

    /**
     * Returns the upper case of the input
     * @param value
     * @return
     */
    public String upperCase(String value) {
        return value.toUpperCase();
    }

}
