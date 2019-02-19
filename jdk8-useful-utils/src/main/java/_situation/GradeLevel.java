package _situation;

/**
 * switch方法
 */

import java.util.Scanner;

public class GradeLevel {

    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // 定义输入变量
        Scanner gradeInput = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int grade = gradeInput.nextInt();

        // 异常判断和评level
        if (grade > 100 || grade < 0) {
            System.out.println("别逗我！！");
        } else {
            switch ((int) (grade / 10)) {
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
            }
        }

        gradeInput.close(); // 及时关闭
    }

}
