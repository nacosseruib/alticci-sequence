package com.example.alticcisequence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class AlticciSequenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlticciSequenceApplication.class, args);
    }

}
