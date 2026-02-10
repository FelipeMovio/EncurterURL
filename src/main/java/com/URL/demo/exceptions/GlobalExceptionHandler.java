package com.URL.demo.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler  {

    @ExceptionHandler(RecursoNaoEncontradoException.class)
    public ResponseEntity<?> HandleRecursoNaoEncontrado(RecursoNaoEncontradoException ex){

    }
}
