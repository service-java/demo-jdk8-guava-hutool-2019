package _basic;


import cn.hutool.core.lang.Console;
import org.apache.commons.lang.StringUtils;

public class CommonLangStringUtilsTest {

    public static void main(String[] args) {

        // 判空
        Console.log("{} {} {} {}",
                StringUtils.isBlank("hello"),
                StringUtils.isBlank(""),
                StringUtils.isBlank(" "),
                StringUtils.isBlank(null));

    }
}
