package com.iremnazyolcu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 401 ile alakalı hata mekanizmalarını yakalayacak yapı: HttpStatus.UNAUTHORIZED
// 401: Unauthorized Access
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnAuthorizedException extends RuntimeException {
    public UnAuthorizedException(String message) {
        super(message);
    }
}