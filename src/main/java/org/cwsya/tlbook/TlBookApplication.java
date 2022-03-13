package org.cwsya.tlbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("org.cwsya.tlbook.mapper")
public class TlBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(TlBookApplication.class, args);
    }

}
