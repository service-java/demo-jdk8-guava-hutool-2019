package _situation;

import java.util.Random;
import java.util.Scanner;

/**
 * 计算时间
 *
 * @author Luo_0412
 */
public class QuestionTiming {

    private static Scanner numInput;

    public static void main(String[] args) {
        // 定义变量
        String[] typeArray = new String[]{"+", "-", "*"};
        Random rand = new Random();
        int type = 0;
        final int TIMES = 5;
        int num1 = 0, num2 = 0;
        int[] result = new int[5];
        int[] yourAnswer = new int[5];
        int count = 0;
        int[] tip = {1, 1, 1, 1, 1}; // 0表示答错题目
        numInput = new Scanner(System.in);

        // 开始计时，包括打印题目的时间
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TIMES; i++) {
            type = rand.nextInt(3);
            num1 = rand.nextInt(90) + 10;
            num2 = rand.nextInt(90) + 10;
            if (type == 0) {
                result[i] = num1 + num2;
            } else if (type == 1) {
                result[i] = num1 - num2;
            } else {
                result[i] = num1 * num2;
            }
            System.out.print(num1 + " " + typeArray[type] + " " + num2 + " = ");
            yourAnswer[i] = numInput.nextInt();
            if (yourAnswer[i] == result[i]) {
                count++;
            } else {
                tip[i] = 0;
            }
        }

        // 结束计时，并且转化为秒数，统计算对的题目，给出打错题目的正确答案
        long endTime = System.currentTimeMillis();
        float seconds = (endTime - startTime) / 1000F;
        System.out.println("一共用时" + Float.toString(seconds) + " seconds.");
        System.out.println("你一共答对 " + count + " 道题.");
        for (int i = 0; i < TIMES; i++) {
            if (tip[i] == 0) {
                System.out.println("第" + (i + 1) + "道题的正确答案是 " + result[i]);
            }
        }

    }

}

