package com.example.urlshortener.domain.url.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OriginalUrl {

    @Column(name = "original_url", nullable = false, length = 2000)
    private String originalUrl;
}
