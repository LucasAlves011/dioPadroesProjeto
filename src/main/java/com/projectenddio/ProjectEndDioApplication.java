package com.projectenddio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//http://localhost:8080/api-docs/

@EnableFeignClients
@SpringBootApplication
public class ProjectEndDioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectEndDioApplication.class, args);
    }

}
