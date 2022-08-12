package com.itachay.producer.controller;

import com.itachay.producer.service.ProducerService;
import com.itachay.producer.service.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping("publish")
    public ResponseEntity publishUserInformation (@RequestBody UserDTO userDTO){
        producerService.publishUserInformation(userDTO);
        return ResponseEntity.ok().body(userDTO);
    }
}
