package __deprecated._lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-2 Circle?
 */

public class Circle extends GeometricObject implements Comparable<Object> {
    double PI = 3.14159; // 定义π的常?
    private double radius;

    // 无参构?函?
    Circle() {
        this.radius = 1.0;
    }

    // 有参构?函?
    Circle(double r) {
        this.radius = r;
    }

    // 获取半径
    public double getRadius() {
        return radius;
    }

    // 获取面积
    public double getArea() {
        return PI * radius * radius;
    }

    ;

    // 获取周长
    public double getPerimeter() {
        return 2 * radius * PI;
    }

    ;

    @Override
    // 重写equals函数 判断圆半径是否相?
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (o instanceof Circle) {
            double radius2 = ((Circle) o).getRadius();
            return radius2 == this.radius;
        }
        return false; // 默认是不相同?
    }

    @Override
    // 重写compareTo函数 判断半径大小
    public int compareTo(Object o) {
        if (o instanceof Circle) {
            double radius2 = ((Circle) o).getRadius();
            return (int) (this.radius - radius2);  // 类型转换
        }
        return -1; // 默认返回-1这个负数
    }
}
