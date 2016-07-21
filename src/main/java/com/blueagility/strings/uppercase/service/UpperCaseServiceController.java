package com.blueagility.strings.uppercase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UpperCaseServiceController {

    private static final String UPPERCASE = "/upperCase/{value}";

    @Autowired
    private UpperCaseService upperCaseService;

    @RequestMapping(method= RequestMethod.GET, value = UPPERCASE)
    public String upperCase(@PathVariable String value) {
        return upperCaseService.upperCase(value);
    }

}

