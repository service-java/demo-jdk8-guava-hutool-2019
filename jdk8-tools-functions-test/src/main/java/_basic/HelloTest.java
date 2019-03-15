package _basic;

import _old.lab.lab5.StringUtil;
import cn.hutool.core.lang.Console;
import org.apache.commons.lang.StringUtils;

public class HelloTest {
    public static void main(String[] args) {

//        Console.log(System.nanoTime());
        Console.log(String.format("%.2f", 200.229d));

        String a = null;
        String b = "";
        String c = " ";
        Console.log("{} {} \n{} {} ",
                StringUtils.isNotEmpty(a), StringUtils.isNotEmpty(b),
                StringUtils.isNotEmpty(c), StringUtils.isNotBlank(c));
    }
}
