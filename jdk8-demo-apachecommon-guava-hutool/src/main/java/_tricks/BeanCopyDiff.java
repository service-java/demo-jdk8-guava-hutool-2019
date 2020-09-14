package _tricks;


import cn.hutool.core.lang.Console;
import entity.classic.StudentEntity;
import entity.classic.TeacherEntity;
import org.junit.Test;
import util.BeanCopyUtils;
import org.springframework.beans.BeanUtils;

import java.util.HashMap;

public class BeanCopyDiff {


    public static void main(String[] args) {

        // java~lombok里的Builder注解
        // https://www.cnblogs.com/lori/archive/2018/05/11/9024933.html
        TeacherEntity teacherEntity = TeacherEntity.builder().job("teacher").name(null).career("teach").build();
        teacherEntity = teacherEntity.toBuilder().career("teach-long").build();
        StudentEntity studentEntity = new StudentEntity().setJob("student").setHobby("study").setName("student");

        Console.log(teacherEntity);
        Console.log(studentEntity);

        // teacher copy to -> student
        // source -> target
        BeanUtils.copyProperties(teacherEntity, studentEntity);
        Console.log(studentEntity);

        studentEntity = new StudentEntity().setJob("student").setHobby("study").setName("student");
        BeanCopyUtils.copyNotNullBean(teacherEntity, studentEntity);
        Console.log(studentEntity);

    }


    @Test
    public  void demo() {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setAge(12).setHobby("123");
        HashMap<String, Object> map = new HashMap<>();
        BeanUtils.copyProperties(studentEntity, map);
        Console.log(map);
    }

}