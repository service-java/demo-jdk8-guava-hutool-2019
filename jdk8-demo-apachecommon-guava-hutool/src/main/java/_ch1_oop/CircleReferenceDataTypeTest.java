package _ch1_oop;

import entity.poly.CircleEntity;

public class CircleReferenceDataTypeTest {

    private static CircleEntity transform(CircleEntity circleEntity, int x, int y) {
        circleEntity.setX(x);
        circleEntity.setY(y);
        return circleEntity; // 传入对象,返回对象
    }

    public static void main(String[] args) {
        CircleEntity circleEntity = new CircleEntity();
        System.out.println("transform前：" + circleEntity);
        System.out.println("transform前：" + circleEntity.getX()
                + " " + circleEntity.getY());

        transform(circleEntity, 5, 5); // 移动圆坐?
        System.out.println("transform后：" + circleEntity); // 哈希值没有改?
        System.out.println("transform前：" + circleEntity.getX()
                + " " + circleEntity.getY());
    }
}

