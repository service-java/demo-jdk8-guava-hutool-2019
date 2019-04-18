package _java8;

import cn.hutool.core.lang.Console;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-18
 * Time: 11:05
 */
public class ReflectByteCodeParametersDemo {

    public String simpleMethod(String canUGetMyName, Object yesICan) {
        return "9527";
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> clazz = ReflectByteCodeParametersDemo.class;
        Method simple = clazz.getDeclaredMethod("simpleMethod", String.class, Object.class);
        Parameter[] parameters = simple.getParameters();
        for (Parameter p : parameters) {
            System.out.println(p.getName());
        }

        Console.log(parameters);

        // -parameters
        // canUGetMyName
        // yesICan
    }
}
