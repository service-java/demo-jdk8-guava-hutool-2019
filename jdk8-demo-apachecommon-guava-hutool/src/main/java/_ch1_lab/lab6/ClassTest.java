package _ch1_lab.lab6;

/*
 * class类和java反射
 * 使用不同的方式来获得class对象
 */

import java.util.Date;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // Object.getClass()方法 =================
        Class<? extends Date> c1 = new Date().getClass();
        System.out.println(c1.getName());

        // .class语法 ============================
        Class<Boolean> c2 = boolean.class;
        System.out.println(c2.getName());

        // Class.forName() =====================
        Class<?> c3 = Class.forName("java.lang.String");
        System.out.println(c3.getName());

        // 包装类的TYPE域 方法 =========================
        Class<Double> c4 = Double.TYPE;
        System.out.println(c4.getName());
    }
}
