package _regex;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.regex.Pattern;

/**
 * regex校验的各种场景
 *
 * @author Luo_0412
 */
public class RegexDemo {

    public static void main(String[] args) {
        // 逐位大小写判断regex
        String caseRegex = "\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d";
        String message1 = "SWJT001";
        String message2 = "Swjt001"; // 需要进行判断的字符串
        System.out.println(message1 + "是合法的数据："
                + message1.matches(caseRegex));
        System.out.println(message2 + "是合法的数据："
                + message2.matches(caseRegex));

        // 统计有多少个中文汉字
        String message = "明日科技 MRSoft";
        String chRegex = "^[\u4e00-\u9fff]$";
        int counter = 0; // 保存汉字个数
        for (int i = 0, len = message.length(); i < len; i++) {
            if (("" + message.charAt(i)).matches(chRegex)) {
                counter++;
            }
        } // 利用加号转化成字符串?
        System.out.println(message + "中包含" + counter + "个汉字！");

        // 校验ip地址
        String ip = "172.283.67.78";
        System.out.println(ip + ": "
                + regexValidate("ip", ip)); // 输出校验结果

        // 校验手机号
        String phoneNum = "75044268138"; // 待验证手机号
        System.out.println(phoneNum + ": "
                + regexValidate("phone", phoneNum)); // 输出校验结果

        // 校验邮件地址
        String email = "mingrisoft@mingrisoft.com"; // 待校验邮件
        System.out.println(email + ": "
                + regexValidate("email", email)); // 输出校验结果

    }

    /**
     * regex校验常用字符串
     *
     * @param vType
     * @param str
     * @return
     */
    public static Boolean regexValidate(String vType, String str) {

        String regex = ""; // 校验规则

        /**
         * ip地址校验
         */
        if (vType == "ip") {
            String number = "((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))"; // 即0-255
            regex = "(" + number + "\\.){3}" + number; // IP地址格式
        }

        /**
         * 手机号校验
         */
        else if (vType == "phone") {
            regex = "^(13\\d|15[036-9]|18[89])\\d{8}$";
        }

        /**
         * 邮件校验
         */
        else if (vType == "email") {
            regex = "(\\w\\.)*\\w+@(\\w+\\.)+[A-Za-z]+";// 定义电子邮件正则表达式
        }

        return str.matches(regex); // 返回校验结果
    }


    @Test
    public void test () {
        Pattern pattern = Pattern.compile("");
        boolean matches = pattern.matcher("12.ss9").matches();
        Console.log(matches);
    }




}

