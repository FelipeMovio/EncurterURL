package com.URL.demo.controller;

import com.URL.demo.DTOs.shortUrlDTOResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    @PostMapping("/shortURL")
    public ResponseEntity<Void> shortURL(@RequestBody shortUrlDTOResponse request){

        return ResponseEntity.ok().build();
    }

}
