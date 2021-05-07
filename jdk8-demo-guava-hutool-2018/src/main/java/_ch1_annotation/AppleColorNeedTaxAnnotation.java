package _ch1_annotation;

import java.lang.annotation.*;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-02-22 11:10
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AppleColorNeedTaxAnnotation {
    public String color() default "";
}
