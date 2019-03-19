package com.bee.sample.ch7.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ConditionalOnJava(range = Range.EQUAL_OR_NEWER, value = JavaVersion.EIGHT)
public class EnvConfig implements BeanPostProcessor {
    @Autowired
    private Environment env;

    public int getServerPort() {
        return env.getProperty("server.port", Integer.class);
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof URLTestBean) {
            System.out.println("=========== " + beanName);
        }
        return bean;
    }
}
