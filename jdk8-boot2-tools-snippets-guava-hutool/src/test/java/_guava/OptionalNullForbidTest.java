package _guava;

import cn.hutool.core.lang.Console;
import com.google.common.base.Optional;
import model.Student;

public class OptionalNullForbidTest {

    public static void main(String[] args) {

        Student student = new Student();
        Optional<Student> stu = Optional.fromNullable(student);
        if (stu.isPresent()) {
            Console.log("Ok");
        }
    }
}
