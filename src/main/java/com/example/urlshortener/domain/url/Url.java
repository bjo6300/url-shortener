package com.example.urlshortener.domain.url;

import com.example.urlshortener.domain.common.BaseTimeEntity;
import com.example.urlshortener.domain.url.vo.EncodedUrl;
import com.example.urlshortener.domain.url.vo.OriginalUrl;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Url extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Embedded
    private EncodedUrl encodedUrl;

    @Embedded
    private OriginalUrl originalUrl;
}
