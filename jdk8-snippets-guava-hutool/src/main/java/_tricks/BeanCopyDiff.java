package _tricks;


import cn.hutool.core.lang.Console;
import entity.classic.Student;
import entity.classic.Teacher;
import util.BeanCopyUtils;
import org.springframework.beans.BeanUtils;

public class BeanCopyDiff {


    public static void main(String[] args) {

        // java~lombok里的Builder注解
        // https://www.cnblogs.com/lori/archive/2018/05/11/9024933.html
        Teacher teacher = Teacher.builder().job("teacher").name(null).career("teach").build();
        teacher = teacher.toBuilder().career("teach-long").build();
        Student student = new Student().setJob("student").setHobby("study").setName("student");

        Console.log(teacher);
        Console.log(student);

        // teacher copy to -> student
        // source -> target
        BeanUtils.copyProperties(teacher, student);
        Console.log(student);

        student = new Student().setJob("student").setHobby("study").setName("student");
        BeanCopyUtils.copyNotNullBean(teacher, student);
        Console.log(student);

    }
}
