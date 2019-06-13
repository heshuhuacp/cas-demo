package com.example.casclient;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient
public class CasClientDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(CasClientDemo2Application.class, args);
    }

}
