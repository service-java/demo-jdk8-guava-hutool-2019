package _ch1_basics;

import cn.hutool.core.lang.Console;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-04 19:35
 */
public class StrTest {

    public static void main(String[] args) {

        String str = " A  , 21; Mike , 9  ";
        String output = "";

        String[] s = str.replace(" ", "").split(";");
        for (String s1 : s) {
            String[] split = s1.split(",");
            output += split[0] + ":" + split[1] + "\n";
        }

        Console.log(output);


    }
}
