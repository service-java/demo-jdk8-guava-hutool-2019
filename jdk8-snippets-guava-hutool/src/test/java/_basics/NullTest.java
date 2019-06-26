package _basics;

import cn.hutool.core.lang.Console;
import model.Student;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class NullTest {
    @Test
    public void main() {
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


    @Test
    public void hello2() {
//        if (null == 0) {
//
//        }
    }


    @Test
    public void test() {
        Student student = new Student();
        if ("helllo".equals(student.getName())) {
            Console.log("asdas");
        }

        if (student.getMoney() != null && student.getMoney() != 0) {
            Console.log("null写在前面");
        }

        // 这里报错
        if (student.getMoney() != 0 && student.getMoney() != null) {
            Console.log("null写在后面");
        }

    }
}
