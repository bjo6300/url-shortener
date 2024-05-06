package com.example.urlshortener.global.exception;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

public class BadRequestException extends BusinessException {

    public BadRequestException(
        final String message
    ) {
        super(message, BAD_REQUEST);
    }
}
