package com.example.demographQL.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class WebhookController {

    @PostMapping   //http://localhost:8080/api/webhook
    public ResponseEntity<String> print(@RequestBody String requestBody) {
         System.out.print("#####" +requestBody);
        return new ResponseEntity<>(requestBody, HttpStatus.CREATED);
    }
}
