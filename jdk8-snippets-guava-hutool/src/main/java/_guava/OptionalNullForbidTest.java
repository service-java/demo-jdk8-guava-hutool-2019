package _guava;

import cn.hutool.core.lang.Console;
import com.google.common.base.Optional;
import entity.classic.StudentEntity;

public class OptionalNullForbidTest {

    public static void main(String[] args) {

        StudentEntity studentEntity = new StudentEntity();
        Optional<StudentEntity> stu = Optional.fromNullable(studentEntity);
        if (stu.isPresent()) {
            Console.log("Ok");
        }

    }
}
