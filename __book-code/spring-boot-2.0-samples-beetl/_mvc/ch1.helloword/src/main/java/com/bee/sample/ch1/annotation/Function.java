package com.bee.sample.ch1.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface Function {
    public String value() default "";
}