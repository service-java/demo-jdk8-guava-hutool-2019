package com.bee.sample.ch7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public URLTestBean getURLTestBean() {
        return new URLTestBean();
    }
}
