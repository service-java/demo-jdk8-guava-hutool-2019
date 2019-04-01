package com.bee.sample.ch11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 如果在servlet2.5 容器上部署，请参考 http://ibeetl.com/sb2/#more
 *
 * @author xiandafu
 */
@SpringBootApplication
public class Ch8Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Ch8Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch8Application.class, args);
    }

}
