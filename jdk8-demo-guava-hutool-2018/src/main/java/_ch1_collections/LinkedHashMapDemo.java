package _ch1_collections;

import _ch1_lab.lab1.Student;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-05-07 17:01
 */
public class LinkedHashMapDemo {

    @Test
    public  void test() {
        Map<Integer, Student> map  = new LinkedHashMap();

        Student student = new Student("zzz", "yyy", "xxx", "1095@qq.com");
        map.put(1, student);
        map.put(2, student);
        map.put(3, student);

    }

}
