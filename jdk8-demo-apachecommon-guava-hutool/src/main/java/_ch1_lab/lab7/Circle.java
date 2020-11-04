package _ch1_lab.lab7;

/**
 * Circle类
 *
 * @author Luo_0412
 */
public class Circle {
    private double radius;
    private final double PI = 3.14159;

    /**
     * 无参构造函数
     * 将半径设为0
     */
    Circle() {
        this.radius = 0;
    }

    /**
     * 有参构造函数
     * 创建Circle对象时将半径初始化为r
     *
     * @param r
     */
    Circle(double r) {
        this.radius = r;
    }

    /**
     * 获取半径
     *
     * @return
     */
    double getRadius() {
        return this.radius;
    }

    /**
     * 获取圆的面积
     *
     * @return
     */
    double getArea() {
        return PI * radius * radius;
    }

    /**
     * 获取圆的周长
     *
     * @return
     */
    double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * 将圆的半径、周长、面积输出到屏幕
     */
    void show() {
        System.out.println(this.radius);
        System.out.println(this.getArea());
        System.out.println(this.getPerimeter());
    }

}
