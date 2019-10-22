package _java8;

import cn.hutool.core.lang.Console;

import java.util.Arrays;
import java.util.List;

/**
 * Description: asList
 * User: luo0412
 * Date: 2019-06-26
 * Time: 17:18
 */
public class ArrayAsListUnsupported {
    public static void main(String[] args) {
        String[] str = new String[] { "you", "wu" };
        List list = Arrays.asList(str);

        Console.log(list);

        // UnsupportedOperationException
        list.add("hello");

    }
}

