package _ch2_tricks;

import cn.hutool.core.lang.Console;
import entity.classic.TeacherEntity;
import org.springframework.beans.BeanUtils;

public class CopyDemoDiff {
    public static void main(String[] args) {

        TeacherEntity th1 = TeacherEntity.builder().name("Tony").build();
        TeacherEntity th2 = TeacherEntity.builder().job("理发").build();
        BeanUtils.copyProperties(th1, th2);
        Console.log(th2);

    }


}
