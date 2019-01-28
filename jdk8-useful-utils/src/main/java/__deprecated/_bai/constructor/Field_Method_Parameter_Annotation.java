package __deprecated._bai.constructor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//用于字段、方法和参数
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
// 在运行时加载Annotation到JVM?
public @interface Field_Method_Parameter_Annotation {
    String describe(); // 定义?个没有默认?的String型成?

    Class<?> type() default void.class; // 定义?个具有默认?的Class型成?
}
