package _ch2_regex;

import java.util.Scanner;

/**
 * 用正则表达式判断密码的合法性
 *
 * @author Luo_0412
 */

public class PwdRegexDemo {

    /**
     * 判断方法1
     *
     * @param pwd
     */
    public static Boolean judge(String pwd) {
        String pwdRegex = "(\\p{Alnum}){8,}"; // 至少8位,仅包含字母和数字
        int count = 0; // 计数器

        // 不满足第一个条件 ：至少8位,仅包含字母和数字
        if (pwd.matches(pwdRegex) == false) {
            return false;
        }

        // 判断至少两位数字
        for (int i = 0; i < pwd.length(); i++) {
//			if(47<=pwd.charAt(i) && pwd.charAt(i)<=57) { count++; } // 至少两位数字
            if (Character.isDigit(pwd.charAt(i))) count++;
        }

        if (count >= 2) {
            return true;
        } // 至少两位数字
        else {
            return false;
        } // 默认返回false
    }

    /**
     * 纯正则表达式判断
     *
     * @param pwd
     */
    public static Boolean pureRegexJudge(String pwd) {
        if ((pwd.matches("[a-zA-Z\\d]{8,}")
                && (pwd.matches(".*\\d.*\\d.*")))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 函数表达式判断
     *
     * @param pwd
     */
    public static Boolean pureFuncJudge(String pwd) {
        int number = 0; //记录数字个数
        if (pwd.length() < 8) return false;  //长度少于8

        for (int i = 0; i < pwd.length(); i++) {
            if (!Character.isLetterOrDigit(pwd.charAt(i))) return false;  //存在有字母或者数字之外
            if (Character.isDigit(pwd.charAt(i))) number++;
        }
        if (number < 2) return false; // 数字少于两个则返回fasle
        return true; // 默认是正确的
    }

    /**
     * 展示输出结果
     *
     * @param isV
     */
    public static void showJudgeRes(Boolean isV) {
        if (isV == true) System.out.println("Valid  pwd");
        else System.out.println("InValid  pwd");
        System.out.println(); // 换行
    }

    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // 输入密码
        Scanner kb = new Scanner(System.in);
        String pwd = "";

        // 正则表达式数判断
        System.out.println("请输入密码：");
        pwd = kb.next();
        showJudgeRes(judge(pwd));
        showJudgeRes(pureRegexJudge(pwd));
        showJudgeRes(pureFuncJudge(pwd));

        kb.close();  // 清场工作
    }

}
