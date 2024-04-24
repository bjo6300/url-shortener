package com.example.urlshortener.domain.url.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EncodedUrl {

    @Column(name = "encoded_url", unique = true)
    private String encodedUrl;
}
