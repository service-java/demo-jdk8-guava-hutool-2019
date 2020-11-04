package _ch6_game;

import java.util.Scanner;

/**
 * 基因片段
 * 存在bug没补
 *
 * @author Luo_0412
 */

public class GenomeTest {

    // 找基因片段的方法
    public static void findGene(String genome) {
        String tmp = genome.toUpperCase();
        String tmp2 = "";
        int start = tmp.indexOf("ATG");
        int end1 = tmp.indexOf("TAG");
        int end2 = tmp.indexOf("TAA");
        int end3 = tmp.indexOf("TGA");
        if (start == -1) {
            System.out.println("No gene is found");
        } else if (end1 != -1) {
            tmp2 = tmp.substring(start + 3, end1);
            if (tmp2.length() % 3 == 0) {
                System.out.println(tmp2);
            }
        } else if (end2 != -1) {
            tmp2 = tmp.substring(start + 3, end2);
            if (tmp2.length() % 3 == 0) {
                System.out.println(tmp2);
            }
        } else if (end3 != -1) {
            tmp2 = tmp.substring(start + 3, end3);
            if (tmp2.length() % 3 == 0) {
                System.out.println(tmp2);
            }
        } else {
            System.out.println("No gene is found");
        }
    }

    // 主方法
    public static void main(String[] args) {
        // 定义变量
        Scanner kb = new Scanner(System.in);
        String genome = "";
        int times = 10;

        // 找基因片段
        System.out.println("Enter a genome string");
        while (times > 0) {
            genome = kb.next();
            findGene(genome);
            times--;
        }

        // 清场工作
        kb.close();

    }

}
