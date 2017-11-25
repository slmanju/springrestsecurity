package com.manjula.springrestsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by manjula on 11/25/17.
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @GetMapping(value = "/admin", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAdmin() {
        return ResponseEntity.ok(new Message("Welcome, Admin"));
    }

    @GetMapping(value = "/user", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok(new Message("Welcome, User"));
    }

    @GetMapping(value = "/free", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getFree() {
        return ResponseEntity.ok(new Message("Welcome, Anonymous"));
    }

}
