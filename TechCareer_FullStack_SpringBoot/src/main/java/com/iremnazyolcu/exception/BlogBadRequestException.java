package com.iremnazyolcu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 400 ile alakalı hata mekanizmalarını yakalayacak yapı: HttpStatus.BAD_REQUEST
// 400: Bad Request
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BlogBadRequestException extends RuntimeException {
    public BlogBadRequestException(String message) {
        super(message);
    }
}