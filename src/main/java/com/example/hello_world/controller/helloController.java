package com.example.hello_world.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/hello-print")
    public ResponseEntity<String> getvalue() {
        return new ResponseEntity("Hello World", HttpStatus.OK);
    }
}
