package _old.lab.lab7;

/**
 * Cylinder类  继承自Circle类
 *
 * @author Luo_0412 骆金参
 */
public class Cylinder extends Circle {
    private double doubleheight;

    // super(radius);

    /**
     * 创建Circle对象时将半径初始化为r
     *
     * @param r
     * @param h
     */

    Cylinder(double r, double h) {
        super(r); // 调用父类的
        this.doubleheight = h;
    }

    /**
     * 获取圆柱体的体积
     *
     * @return
     */
    double getVolume() {
        return getArea() * this.doubleheight;
    }

    /**
     * 将圆柱体的体积输出到屏幕
     */
    void showVolume() {
        System.out.println(getVolume());
    }

}
