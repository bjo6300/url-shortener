package com.example.urlshortener.domain.url.repository;

import com.example.urlshortener.domain.url.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, Long> {

}
