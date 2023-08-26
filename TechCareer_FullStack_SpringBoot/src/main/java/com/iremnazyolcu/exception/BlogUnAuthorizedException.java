package com.iremnazyolcu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 401 ile alakalı hata mekanizmalarını yakalayacak yapı: HttpStatus.UNAUTHORIZED
// 401: Unauthorized Access
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class BlogUnAuthorizedException extends RuntimeException {
    public BlogUnAuthorizedException(String message) {
        super(message);
    }
}