package com.example.springsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSmsApplication.class, args);
    }

}
