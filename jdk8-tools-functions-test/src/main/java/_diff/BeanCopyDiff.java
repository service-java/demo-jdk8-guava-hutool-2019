package _diff;


import cn.hutool.core.lang.Console;
import model.Student;
import model.Teacher;
import util.BeanCopyUtil;
import org.springframework.beans.BeanUtils;

public class BeanCopyDiff {

    public static void main(String[] args) {

        Teacher teacher = Teacher.builder().job("teacher").name(null).career("teach").build();
        Student student = new Student().setJob("student").setHobby("study").setName("student");

        Console.log(student);

        // teacher copy to -> student
        // source -> target
        BeanUtils.copyProperties(teacher, student);
        Console.log(student);

        student = new Student().setJob("student").setHobby("study").setName("student");
        BeanCopyUtil.copyNotNullBean(teacher, student);
        Console.log(student);

    }
}
