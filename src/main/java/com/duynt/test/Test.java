package com.duynt.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/test")
    public ResponseEntity helloWorld() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
