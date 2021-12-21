package com.duynt.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test {

    @RequestMapping("/test")
    public ResponseEntity helloWorld() {
        return ResponseEntity.ok("hello world!");
    }
}
