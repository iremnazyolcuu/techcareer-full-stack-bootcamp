package com.iremnazyolcu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 404 ile alakalı hata mekanizmalarını yakalayacak yapı: HttpStatus.NOT_FOUND
// 404: Not Found
@ResponseStatus(HttpStatus.NOT_FOUND)
public class BlogNotFoundException extends RuntimeException {
    public BlogNotFoundException(String message) {
        super(message);
    }
}
