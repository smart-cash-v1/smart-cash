package com.dev.smartcash.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CompanieNotFoundException extends RuntimeException {
    public CompanieNotFoundException(String message) {
        super(message);
    }
}
