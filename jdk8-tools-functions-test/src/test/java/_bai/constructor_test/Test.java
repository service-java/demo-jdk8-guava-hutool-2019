package _bai.constructor_test;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        Class<Employee> clazz = Employee.class;// 获得Class对象
        Method[] methods = clazz.getDeclaredMethods();// 获得Employee类中定义的方?
        System.out.println("Employee类中定义的方法：");
        for (Method method : methods) {// 输出方法名称
            System.out.println(method.getName());
        }
    }
}
