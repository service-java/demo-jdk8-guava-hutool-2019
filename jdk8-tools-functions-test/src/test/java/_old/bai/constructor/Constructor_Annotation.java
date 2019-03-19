package _old.bai.constructor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)
// 用于构?方?
@Retention(RetentionPolicy.RUNTIME)
// 在运行时加载Annotation到JVM?
public @interface Constructor_Annotation {
    String value() default "默认构?方?"; // 定义?个具有默认?的String型成?
}
