package com.iremnazyolcu.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
- Spring Framework modüler bir yapıdır.
- Bu, istediğimiz teknolojileri ekleyebileceğimiz anlamına gelir.
- Spring Framework'ün içinde Spring Core dediğimiz yapı var.
- Spring Core'un içinde ise Bean dediğimiz yapılar var.

- Peki Bean'ler ne yapıyor? :
- Bir class'ın içinde bir methodumuz vardır.
- Bu methodun Spring tarafında tanıtılmasını istersek yani Spring'in anlayacağı şekilde bir yapı olmasını istersek bu
yapıyı gelip Bean ile işaretlemek zorundayız.
- Bean olarak işaretlediğimiz andan itibaren Spring'in tanıyabileceği bir yapı haline geliyor.
- Bir methoda Bean yazdığımız an onu Spring'in anlayabileceği bir yapı haline getirmiş oluyoruz.

- Peki Configuration ne yapıyor? :
- Spring gelip Configuration'lara bakıyor.
- Configuration bulunduğu yerde Bean'e bakıyor, gerçekten tanıdığı biri mi diye.
- Ve gerçekten tanıdığı birini Bean'den anlıyor.

- Bu ikisi bir araya gelerek Bean yapısını oluşturuyor.
 */

@Configuration
public class ModelMapperBean {

    @Bean
    public ModelMapper modelMapperMethod() {
        return new ModelMapper();
    }
}