package _oop;

import model.Circle;

public class CircleReferenceDataTypeTest {

    private static Circle transform(Circle circle, int x, int y) {
        circle.setX(x);
        circle.setY(y);
        return circle; // 传入对象,返回对象
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("transform前：" + circle);
        System.out.println("transform前：" + circle.getX()
                + " " + circle.getY());

        transform(circle, 5, 5); // 移动圆坐?
        System.out.println("transform后：" + circle); // 哈希值没有改?
        System.out.println("transform前：" + circle.getX()
                + " " + circle.getY());
    }
}

