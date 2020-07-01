package _lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-2 circle的测试程?
 */

public class CircleTest {
    public static void main(String[] args) {
        // 定义三个圆对?
        Circle c1 = new Circle(5.3);
        Circle c2 = new Circle(4.3);
        Circle c3 = new Circle(5.3);

        // 用重写的equals比较是否相同
        System.out.println(c1.equals(c2)); // 返回false
        System.out.println(c1.equals(c3)); // 返回true

        // 用重写的compareTo比较大小
        System.out.println(c1.compareTo(c2)); // 返回1, 圆c1比圆c2
        System.out.println(c1.compareTo(c3)); // 返回0, 圆c1和圆c3?样大
    }
}
