package com.bee.sample.ch17.conf;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSource")
    public DataSource datasource(Environment env) {

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(env.getProperty("spring.datasource.url"));
        config.setUsername(env.getProperty("spring.datasource.username"));
        config.setPassword(env.getProperty("spring.datasource.password"));
        config.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        config.setMaximumPoolSize(5);
        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }


}