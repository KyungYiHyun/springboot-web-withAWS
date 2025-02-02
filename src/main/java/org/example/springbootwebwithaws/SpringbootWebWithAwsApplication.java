package org.example.springbootwebwithaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootWebWithAwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebWithAwsApplication.class, args);
    }

}
