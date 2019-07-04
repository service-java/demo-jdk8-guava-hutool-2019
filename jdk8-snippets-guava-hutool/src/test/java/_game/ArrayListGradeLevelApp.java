package _game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 使用ArrayList来存储学生成绩并评级
 *
 * @author Luo_0412
 */
public class ArrayListGradeLevelApp {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner kb = new Scanner(System.in);
        String name;
        double grade; // 单科成绩
        double totalGrade = 0D; // 总分

        final int PERSON_NUM = 5;
        final int CLASS_NUM = 4;
        double[][] grades = new double[PERSON_NUM][CLASS_NUM];
        char[] levels = new char[PERSON_NUM];

        // 输入参数存储并计算平均分评级
        for (int i = 0; i < PERSON_NUM; i++) {
            totalGrade = 0D;  // 个人总成绩初始化
            System.out.println("Enter a student's name:");
            name = kb.next();
            list.add(name); // 新增

            System.out.println("Enter the scores of the student:");
            for (int j = 0; j < CLASS_NUM; j++) {
                grade = kb.nextDouble();
                grades[i][j] = grade;
                totalGrade += grade;
            }

            switch ((int) (totalGrade / CLASS_NUM / 10)) {
                case 10:
                case 9:
                    levels[i] = 'A';
                    break;  // 千万不要忘写break;
                case 8:
                    levels[i] = 'B';
                    break;
                case 7:
                    levels[i] = 'C';
                    break;
                case 6:
                    levels[i] = 'D';
                    break;
                default:
                    levels[i] = 'F';
                    break;
            }
        }

        // 输出结果
        System.out.println("The students’ grades are:");
        for (int i = 0; i < PERSON_NUM; i++) {
            System.out.println(list.get(i) + "\t\t" + levels[i]);
        }

        kb.close();

    }

}

