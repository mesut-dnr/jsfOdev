package com.jesefe.asdasdas.Kontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Kontroller {
    @GetMapping("/hello")
    public ResponseEntity<String> getAllBooks() {
        return ResponseEntity.ok("hello");
    }
}

