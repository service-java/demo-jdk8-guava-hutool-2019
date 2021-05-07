package _ch1_annotation;

import cn.hutool.core.lang.Console;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-02-22 11:49
 */
@Aspect
@Component
public class AppleColorNeedTaxAspect {
    // 配置织入点
    @Pointcut("@annotation(_ch1_annotation.AppleColorNeedTaxAnnotation)")
    public void logPointCut() {
    }

    @AfterReturning(pointcut = "logPointCut()", returning = "jsonResult")
    public void doAfterReturning(JoinPoint joinPoint, Object jsonResult) {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();

        if (method != null) {
            AppleColorNeedTaxAnnotation annotation = method.getAnnotation(AppleColorNeedTaxAnnotation.class);
            Console.log("收税 {}", annotation);
        }
    }


}
