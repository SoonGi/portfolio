package com.yoon.portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloConrtroller
 */
@RestController("/api")
public class HelloConrtroller {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "helloWorld";
    }
}