package grammar;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 计算BMI值
 *
 * @author Luo_0412
 */
public class ComputeBMI {

    private static Scanner weightInput;
    private static Scanner heightInput;

    public static void main(String[] args) {
        // 声名变量
        double w = 1.0;
        double h = 1.0;
        double BMI_value = 1.0;
        weightInput = new Scanner(System.in);
        heightInput = new Scanner(System.in);

        // 输入身高体重
        System.out.print("Enter weight:  ");
        w = weightInput.nextDouble();
        System.out.print("Enter height:  ");
        h = heightInput.nextDouble();

        // 输出BMI值
        BMI_value = w / (h * h);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.print("BMI is:  ");
        System.out.println(df.format(BMI_value));

        // 根据BMI值判断胖瘦标准
        if (BMI_value < 16) {
            System.out.println("严重偏瘦");
        } else if (BMI_value < 18) {
            System.out.println("偏瘦");
        } else if (BMI_value < 24) {
            System.out.println("正常");
        } else if (BMI_value < 29) {
            System.out.println("偏胖");
        } else if (BMI_value < 35) {
            System.out.println("严重偏胖");
        } else {
            System.out.println("极度偏胖");
        }
    }

}
