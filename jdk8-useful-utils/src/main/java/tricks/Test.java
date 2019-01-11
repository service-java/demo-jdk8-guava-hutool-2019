package tricks;

import cn.hutool.core.lang.Console;
import org.springframework.beans.BeanUtils;

public class Test {

    public static void main(String[] args) {
        Th th = new Th();

        th.setJob("teacher");
        th.setName("teacher");
        th.setCareer("teach");

        Stu stu = new Stu();
        stu.setJob("student");
        stu.setName("stu");
        stu.setHobby("study");

        Console.log(stu);
        // th copy to -> stu
        BeanUtils.copyProperties(th, stu);
        Console.log(stu);
    }
}
