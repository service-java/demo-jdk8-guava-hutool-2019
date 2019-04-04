package _java8;

import cn.hutool.core.lang.Console;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    @Test
    public void setStreamTest() {
        List<Integer> idsList = new ArrayList();
        idsList.add(10);
        idsList.add(11);
        idsList.add(11);
        idsList.add(12);

        Set<Integer> ids = idsList.stream().collect(Collectors.toSet());
        Console.log(ids);
    }

    @Test
    public void hello() {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream()
                .filter(string -> StringUtils.isNotEmpty(string))
//                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        Console.log("{} 个数: {}", filtered, filtered.size());

    }

    @Test
    public void distinct() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(12);

        Set<Object> collect = list.stream().collect(Collectors.toSet());
        Console.log(collect);

//        List<Object> distinct = list.stream().distinct().collect();
//        Console.log(list);
//        Console.log(distinct);
    }

}
