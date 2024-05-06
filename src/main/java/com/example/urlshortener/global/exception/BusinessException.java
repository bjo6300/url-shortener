package com.example.urlshortener.global.exception;

import lombok.Getter;
import org.springframework.http.HttpStatusCode;

@Getter
public abstract class BusinessException extends RuntimeException {

    private final HttpStatusCode statusCode;

    protected BusinessException(
        final String message,
        final HttpStatusCode statusCode
    ) {
        super(message);
        this.statusCode = statusCode;
    }
}
