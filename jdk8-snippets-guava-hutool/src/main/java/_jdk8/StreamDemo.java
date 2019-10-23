package _jdk8;

import cn.hutool.core.lang.Console;
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

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
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

        List<Object> collect = list.stream().distinct().collect(Collectors.toList());
        Console.log(collect);

    }

    @Test
    public void distinctHashMapByKey() {
//        HashMap<Integer, String> map = new HashMap<>();

    }

    @Test
    public void h () {
        List a = Arrays.asList("a", "b", "c");
        Console.log(a);
    }


    @Test
    public void strLength () {
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        Console.log(wordLengths);
    }

    @Test
    public void flattern () {
        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> words = Arrays.stream(arrayOfWords);

        List<String> uniqueCharacters =
                words.map(word -> word.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .collect(Collectors.toList());


        Console.log(uniqueCharacters);
    }

}
