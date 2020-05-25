package com.example.demo;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello/{name}")
    public Map<String, String> hello(@PathVariable("name") String name) {
        return Collections.singletonMap("name", name);
    }
}