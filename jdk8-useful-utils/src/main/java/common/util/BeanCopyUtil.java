package common.util;

import cn.hutool.core.lang.Console;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import common.model.Student;
import common.model.Teacher;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhuxiaomeng
 * @date 2017/12/18.
 * @email 154040976@qq.com
 * 对象操作
 */
public class BeanCopyUtil {

    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for (PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) {
                emptyNames.add(pd.getName());
            }
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

    /**
     * 非空拷贝
     *
     * @param source
     * @param target
     */
    public static void copyNotNullBean(Object source, Object target) {
        BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
    }

    public static void main(String[] args) {

        Student student = new Student().setJob("student").setHobby("study").setName(null);
        Teacher teacher = Teacher.builder().build();

        Console.log("无业游民: {}", teacher);

        // student -> teacher
        BeanUtils.copyProperties(student, teacher);
        Console.log(teacher);


        teacher = Teacher.builder().build();
        Console.log("失业: {}", teacher);
        // @attention student -> teacher
        copyNotNullBean(student, teacher);
        Console.log(teacher);

    }
}
