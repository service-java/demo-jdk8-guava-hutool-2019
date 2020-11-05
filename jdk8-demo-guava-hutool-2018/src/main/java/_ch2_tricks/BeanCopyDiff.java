package _ch2_tricks;


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

        // 创建方法1
        TeacherEntity teacherEntity = TeacherEntity.builder().job("teacher").name(null).career("teach").build();
        teacherEntity = teacherEntity.toBuilder().career("teach-long").build();

        // 创建方法2
        StudentEntity studentEntity = new StudentEntity().setJob("student").setHobby("study").setName("student");

        Console.log(teacherEntity);
        Console.log(studentEntity);

        // 注意下赋值的方向
        // teacher copy to -> student
        // source -> target
        BeanUtils.copyProperties(teacherEntity, studentEntity);
        Console.log(studentEntity);

        // 再来复制一遍, 用自己封装的方法
        studentEntity = new StudentEntity().setJob("student").setHobby("study").setName("student");
        BeanCopyUtils.copyNotNullBean(teacherEntity, studentEntity);
        Console.log(studentEntity);

    }


    @Test
    public void copy2MapIsNotOk() {
        // 直接赋值给Map好像会唧唧... @todo
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setAge(12).setHobby("123");

        HashMap<String, Object> map = new HashMap<>();
        BeanUtils.copyProperties(studentEntity, map);
        Console.log(map);
        // 输出 {}
    }


    @Test
    public void test() {
        TeacherEntity th1 = TeacherEntity.builder().name("Tony").build();
        TeacherEntity th2 = TeacherEntity.builder().job("理发").build();

        // 为null的字段居然也覆盖了, 用下自己封装的方法
        // BeanUtils.copyProperties(th1, th2);
//      输出:  TeacherEntity(name=Tony, job=null, career=null)

        BeanCopyUtils.copyNotNullBean(th1, th2);
//      输出:  TeacherEntity(name=Tony, job=理发, career=null)
        Console.log(th2);



    }


}
