package _basic;

import cn.hutool.core.lang.Console;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class HelloTest {
    public static void main(String[] args) {


        String a = null;
        String b = "";
        String c = " ";
        Console.log("{} {} \n{} {} ",
                StringUtils.isNotEmpty(a),
                StringUtils.isNotEmpty(b),
                StringUtils.isNotEmpty(c), StringUtils.isNotBlank(c));
    }


    @Test
    public void hello() {
        boolean notEmpty = StringUtils.isNotBlank("");
        Console.log(notEmpty);
    }
}
