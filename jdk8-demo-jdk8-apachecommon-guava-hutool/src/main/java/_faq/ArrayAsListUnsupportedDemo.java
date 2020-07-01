package _faq;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Description: asList
 * User: luo0412
 * Date: 2019-06-26
 * Time: 17:18
 */
public class ArrayAsListUnsupportedDemo {

    @Test
    public void demo() {
        String[] str = new String[] { "you", "wu" };
        List list = Arrays.asList(str);

        Console.log(list);

        // UnsupportedOperationException
        // 这个list只是像list 假的???
        list.add("hello");

    }
}

