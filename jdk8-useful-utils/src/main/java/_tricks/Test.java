package _tricks;


import cn.hutool.core.lang.Console;
import model.Student;
import model.Teacher;
import org.springframework.beans.BeanUtils;

public class Test {

    public static void main(String[] args) {

        Teacher teacher = Teacher.builder().job("teacher").name("teacher").career("teach").build();
        Student student = new Student().setJob("student").setHobby("study").setName("student");

        Console.log(student);

        // teacher copy to -> student
        // source -> target
        BeanUtils.copyProperties(teacher, student);
        Console.log(student);


    }
}
