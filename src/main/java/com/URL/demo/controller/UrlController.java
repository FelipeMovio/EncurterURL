package com.URL.demo.controller;

import com.URL.demo.DTOs.ShortUrlDTOResponse;
import com.URL.demo.DTOs.ShortUrlDTORequest;
import com.URL.demo.entities.Url;
import com.URL.demo.repository.UrlRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class UrlController {

    private final UrlRepository repository;

    public UrlController(UrlRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/shortURL")
    public ResponseEntity<ShortUrlDTOResponse> shortURL(@RequestBody ShortUrlDTORequest request, HttpServletRequest servletRequest){

        // Gera um identificador aleatório alfanumérico (5 a 10 caracteres)
        // e repete a geração enquanto o ID já existir no banco,
        // garantindo que a URL curta seja única.

        String id;
        do {
            id = RandomStringUtils.randomAlphanumeric(5, 10);

        }while (repository.existsById(id));

        repository.save(new Url(id,request.url()));

        String baseUrl = servletRequest.getRequestURL()
                .toString()
                .replace(servletRequest.getRequestURI(), "");

        String redirectUrl = baseUrl + "/" + id;


        return ResponseEntity.ok(new ShortUrlDTOResponse(redirectUrl));
    }

}
