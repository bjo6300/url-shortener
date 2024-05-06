package com.example.urlshortener.global.exception;

import static org.springframework.http.HttpStatus.NOT_FOUND;

public class NotFoundException extends BusinessException {

    public NotFoundException(
        final String message
    ) {
        super(message, NOT_FOUND);
    }
}
