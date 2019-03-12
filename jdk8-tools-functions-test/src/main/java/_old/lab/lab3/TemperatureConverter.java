package _old.lab.lab3;

import java.util.Scanner;

public class TemperatureConverter {
    public double toFahrenheit(double centigrade) {
        double fahrenheit = 1.8 * centigrade + 32;// 计算华氏温度
        return fahrenheit;// 返回华氏温度
    }

    public static void main(String[] args) {
        System.out.println("请输入要转换的温度（单位：摄氏度?");
        Scanner in = new Scanner(System.in);// 创建Scanner对象来获得控制台输入
        double centigrade = in.nextDouble();// 获得用户输入的摄氏温?
        TemperatureConverter tc = new TemperatureConverter(); // 创建类的对象
        double fahrenheit = tc.toFahrenheit(centigrade); // 转换温度为华氏度
        System.out.println("转换完成的温度（单位：华氏度）：" + fahrenheit);// 输出转换结果

        in.close();
    }
}
