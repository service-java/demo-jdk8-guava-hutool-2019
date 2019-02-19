package _situation;

import java.util.Random;

/**
 * Math方法测试
 * 随机数的产生
 *
 * @author Luo_0412
 */
public class MathMethodTest {

    public static void main(String[] args) {
        System.out.println("ceil(5.2)：" + Math.ceil(5.2)); // 天花板
        System.out.println("floor(2.5)：" + Math.floor(2.5)); // 地板
        System.out.println("rint(2.7)：" + Math.rint(2.7));
        System.out.println("rint(2.5)：" + Math.rint(2.5)); // 四舍五入

        System.out.println("round(3.4f)：" + Math.round(3.4f));// 将参数加上0.5后返回最接近的整数
        System.out.println("round(2.5)：" + Math.round(2.5)); // 强制转化成long

        System.out.println("max(4, 8): " + Math.max(4, 8));
        System.out.println("min(4.4, 4): " + Math.min(4.4, 4));
        System.out.println("abs(-7): " + Math.abs(-7));

        System.out.println("任意一个2～32之间的偶数：" + GetEvenNum(2, 32));
        System.out.println("任意小写字符：" + GetRandomChar('a', 'z'));
        System.out.println("任意大写字符：" + GetRandomChar('A', 'Z'));
        System.out.println("0到9任意数字字符：" + GetRandomChar('0', '9'));

        Random r = new Random(); // 实例化一个Random类
        System.out.println("随机产生一个整数:" + r.nextInt());
        System.out.println("随机产生一个大于等于0小于10的整数：" + r.nextInt(10));
        System.out.println("随机产生一个布尔值：" + r.nextBoolean());
        System.out.println("随机产生一个双精度值：" + r.nextDouble());
        System.out.println("随机产生一个浮点值：" + r.nextFloat());
        System.out.println("随机产生一个概率密度为高斯分布的双精度值：" + r.nextGaussian());

        // ExponentFunction
        System.out.println("e的平方值：" + Math.exp(2));
        System.out.println("以e为底2的对数值：" + Math.log(2));
        System.out.println("以10为底2的对数值：" + Math.log10(2));
        System.out.println("4的平方根值：" + Math.sqrt(4));
        System.out.println("8的立方根值：" + Math.cbrt(8));
        System.out.println("2的2次方值：" + Math.pow(2, 2));

        // TrigonometricFunction
        System.out.println("90度的正弦值：" + Math.sin(Math.PI / 2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI / 3));
        System.out.println("2的平方根与2商的反正切值：" + Math.asin(Math.sqrt(2) / 2));
        System.out.println("2的平方根与2商的反余切值：" + Math.acos(Math.sqrt(2) / 2));
        System.out.println("1的反正切值：" + Math.atan(1));
        System.out.println("120度的弧度值：" + Math.toRadians(120.0));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI / 2));

    }

    /**
     * 获取一定范围内的偶数
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int GetEvenNum(double num1, double num2) {
        int s = (int) num1 + (int) (Math.random() * (num2 - num1)); // 产生num1～num2之间的随机数
        if (s % 2 == 0) {
            return s;
        } else {
            return s + 1;
        }

    }

    /**
     * 获取任意字符之间的随机字符 ASCII
     *
     * @param cha1
     * @param cha2
     * @return
     */
    public static char GetRandomChar(char cha1, char cha2) {
        return (char) (cha1 + Math.random() * (cha2 - cha1 + 1));
    }

}
