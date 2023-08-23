package com.iremnazyolcu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 201 ile alakalı hata mekanizmalarını yakalayacak yapı: HttpStatus.CREATED
// 201: Created
@ResponseStatus(HttpStatus.CREATED)
public class CreatedException extends RuntimeException {
    public CreatedException(String message) {
        super(message);
    }
}
