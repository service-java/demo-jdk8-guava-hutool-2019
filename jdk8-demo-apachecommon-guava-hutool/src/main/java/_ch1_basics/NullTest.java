package _ch1_basics;

import cn.hutool.core.lang.Console;
import entity.classic.StudentEntity;
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
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setMoney(12d).setHobby("play");

        if ("helllo".equals(studentEntity.getName())) {
            Console.log("asdas");
        }

        if (studentEntity.getMoney() != null && studentEntity.getMoney() != 0) {
            Console.log("null写在前面");
        }

        studentEntity.setMoney(null).setHobby("girlfriend");
        // 这里报错 需要先判空
        if (studentEntity.getMoney() != 0 && studentEntity.getMoney() != null) {
            Console.log("null写在后面");
        }

    }
}
