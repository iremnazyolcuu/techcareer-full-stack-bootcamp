package com.iremnazyolcu.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


@Configuration
// Lombok kütüphanesine gelen loglama için kullanacağımız bir yapı: @Log4j2
@Log4j2
public class CommandLineRunnerBean {
    public CommandLineRunner commandLineRunnerMethod() {
        return args -> {
            // bazen programın başındayken verilerin otomatik olarak oluşmasını istiyorsak bu yapıyı kullanıyoruz:
            // sout'da kesinlikle kullanılabilir
            // log.info sadece daha güzel gösteriyor
            log.info("Data set has been created.");

        }; //end return
    } //end CommandLineRunnerMethod
} // end class