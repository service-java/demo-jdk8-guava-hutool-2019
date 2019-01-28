package __deprecated._lab.lab7;

/**
 * 编写Cylinder测试类，创建圆柱体类的对象
 * 分别设置圆的半径、圆柱体的高
 * 计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。
 *
 * @author Luo_0412
 */
public class CylinderTest {

    public static void main(String[] args) {
        // 创建圆柱体类的对象
        Cylinder cl = new Cylinder(1.0, 4.0);
//		c1.setRadius();
//		c2.setDoubleHeight();
        System.out.println("圆半径" + cl.getRadius());
        System.out.println("圆面积" + cl.getArea());
        System.out.println("圆周长" + cl.getPerimeter());
        cl.show();
        System.out.println("圆柱体体积" + cl.getVolume());
        cl.showVolume();

    }

}
