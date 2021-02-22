package _ch1_string;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-11-04 19:35
 */
public class StrTest {

    public static void main(String[] args) {

        String str = " A  , 21; Mike , 9  ";
        String output = "";

        String[] s = str.replace(" ", "").split(";");
        for (String s1 : s) {
            String[] split = s1.split(",");
            output += split[0] + ":" + split[1] + "\n";
        }

        Console.log(output);


    }

    @Test
    public  void hello() {
        String a = "2020-01";
        String b = "2019-08";
        String c = "2020-08";
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));


    }

    @Test
    public  void hello1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("2020-9");
        list.add("2020-7");
        list.add("2020-12");
        list.add("2020-11");

        Comparator<String> comparator = (s1, s2) -> {
            return s1.compareTo(s2);
        };
        Collections.sort(list,comparator);
        System.out.println(list.get(0));
    }

}
