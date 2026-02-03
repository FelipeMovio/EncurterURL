package com.URL.demo.controller;

import com.URL.demo.DTOs.shortUrlDTORequet;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    @PostMapping("/shortURL")
    public ResponseEntity<Void> shortURL(@RequestBody shortUrlDTORequet request){

        var id = RandomStringUtils.randomAlphanumeric(5, 10);

        return ResponseEntity.ok().build();
    }

}
