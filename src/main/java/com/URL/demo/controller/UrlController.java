package com.URL.demo.controller;

import com.URL.demo.DTOs.shortUrlDTORequet;
import com.URL.demo.repositoy.UrlRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    private UrlRepository repository;

    @PostMapping("/shortURL")
    public ResponseEntity<Void> shortURL(@RequestBody shortUrlDTORequet request){

        String id;
        do {
            id = RandomStringUtils.randomAlphanumeric(5, 10);

        }while (repository.existsById(id));

        return ResponseEntity.ok().build();
    }

}
