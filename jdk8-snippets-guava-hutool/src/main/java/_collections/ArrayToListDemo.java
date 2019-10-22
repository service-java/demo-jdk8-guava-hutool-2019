package _collections;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: 模块功能
 * User: luo0412
 * Date: 2019-04-18
 * Time: 10:45
 */
public class ArrayToListDemo {
    List<String> arrayList = new ArrayList<String>();

    {
        arrayList.add("s");
        arrayList.add("e");
        arrayList.add("n");
    }

    @Test
    public void demo() {

    }

    @Test
    public void simple() {
        // declare an array
        int size = arrayList.size();
        String[] a = arrayList.toArray(new String[size]);
        Console.log(a);

        // array -> list
        List<String> list = Arrays.asList(a);

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.addAll(list);
        Console.log(list);
    }

    @Test
    public void asListDemo() {
//        int size = arrayList.size();
//        String[] a = arrayList.toArray(new String[size]);
    }


}
