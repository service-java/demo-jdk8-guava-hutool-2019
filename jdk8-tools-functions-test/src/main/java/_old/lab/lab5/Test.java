package _old.lab.lab5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Class<Employee> clazz = Employee.class;// 获得Class对象
        Constructor<Employee> c1 = clazz.getDeclaredConstructor((Class<Employee>[]) null);// 获得private类型构造方法
        System.out.println(Modifier.toString(c1.getModifiers()));// 输出构造方法修饰符
        Constructor<Employee> c2 = clazz.getConstructor(int.class, String.class);// 获得public类型构造方法
        System.out.println(Modifier.toString(c2.getModifiers()));// 输出构造方法修饰符
    }
}
