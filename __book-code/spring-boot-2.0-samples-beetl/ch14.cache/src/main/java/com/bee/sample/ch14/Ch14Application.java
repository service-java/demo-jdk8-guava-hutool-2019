package com.bee.sample.ch14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Ch14Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch14Application.class, args);
    }
}
