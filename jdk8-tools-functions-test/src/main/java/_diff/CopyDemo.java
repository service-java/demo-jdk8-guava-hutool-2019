package _diff;

import cn.hutool.core.lang.Console;
import model.Teacher;
import org.springframework.beans.BeanUtils;

public class CopyDemo {
    public static void main(String[] args) {

        Teacher th1 = Teacher.builder().name("Tony").build();
        Teacher th2 = Teacher.builder().job("理发").build();
        BeanUtils.copyProperties(th1, th2);
        Console.log(th2);
    }
}
