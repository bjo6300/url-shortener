package com.example.urlshortener.domain.url.controller;

import com.example.urlshortener.domain.url.service.UrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UrlController {

    private final UrlService urlService;


}
