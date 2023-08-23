package com.iremnazyolcu.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.Map;

// http://localhost:4444/error
// 4444 portundan sonra hata ile ilgili bir şey geliyorsa
// biz bu hatayı error ile yakalamaya çalışırız
// Spring kendine ait hata yakalama mesajında basit bir NullPointException için bile satırlarca kod yazıyor
// bu sebeple kendimize göre uyarlayıp ApiResult yapısını yazıyoruz

// LOMBOK
@Data

// JSON
// Eğer bu fieldlarda null değer varsa backend kısmına gitmesin anlamında
// ApiResult'da null olan değerler backend'e gitmesin yani
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ApiResult {
    // ApiResult'un belli başlı attributeları vardır
    // bunlar bizim Api'da genel olarak döndüreceğimiz yapılardır
    private int status;
    private String message;
    private String error;
    private String path;
    private Map<String, String> validationErrors;
    private Date systemDate;

    // Parametresiz Constructor
    public ApiResult() {
    }

    // Parametreli Constructor
    public ApiResult(String path, String message, int status) {
        this.path = path;
        this.message = message;
        this.status = status;
    }
}