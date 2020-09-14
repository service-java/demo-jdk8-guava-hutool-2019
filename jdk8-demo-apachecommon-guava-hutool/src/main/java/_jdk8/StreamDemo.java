package _jdk8;

import cn.hutool.core.lang.Console;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import entity.classic.StudentEntity;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import vo.CodePriceVo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    /**
     * list --> set
     */
    @Test
    public void setStreamTest() {
        List<Integer> idsList = new ArrayList();
        idsList.add(10);
        idsList.add(11);
        idsList.add(11);
        idsList.add(12);

        Set<Integer> ids = idsList.stream()
                .collect(Collectors.toSet());
        Console.log(ids);
    }

    /**
     * 字母长度统计
     */
    @Test
    public void strLength () {
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        Console.log(wordLengths);
    }

    /**
     * filter过滤
     */
    @Test
    public void filter() {
        // 数组转list Arrays.asList
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream()
                .filter(string -> StringUtils.isNotEmpty(string))
//                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());

        Console.log("{} 个数: {}", filtered, filtered.size());

    }

    /**
     * list去重
     */
    @Test
    public void distinctDoubleList() {
        ArrayList<Double> list = new ArrayList<>();
        list.add(11d);
        list.add(12d);
        list.add(13d);
        list.add(12d);
        list.add(13d);

        List<Double> collect = list.stream().distinct().collect(Collectors.toList());
        Console.log(collect);
    }

    /**
     * 能够过滤掉 `张三`
     */
    @Test
    public void distinctStudentList() {
        ArrayList<StudentEntity> list = new ArrayList<>();
        list.add(new StudentEntity("张三", 10));
        list.add(new StudentEntity("李四", 12));
        list.add(new StudentEntity("张三", 13));
        list.add(new StudentEntity("张三", 10));
        list.add(new StudentEntity("王五", 12));

        List<StudentEntity> collect = list.stream()
                .distinct()
                // 降序排序
                .sorted((stu1,stu2) -> Integer.compare(stu2.getAge(), stu1.getAge()))
                .limit(10)
                .collect(Collectors.toList());
        Console.log(collect);
    }



    /**
     * 字符串转list(Stream)并去重
     */
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

    @Test
    public void sortSet() {
        Set<CodePriceVo> set = Sets.newTreeSet(Comparator.comparing(CodePriceVo::getFillinCode));
        set.add(new CodePriceVo("202012", 2100d));
        set.add(new CodePriceVo("201805", null));
        set.add(new CodePriceVo("201605", 0d));
        set.add(new CodePriceVo("201702", 2100d));
//        System.out.println(set);

//        for (CodePriceVo codePriceVo : set) {
//            System.out.println(codePriceVo);
//        }

        ArrayList<CodePriceVo> codePriceVos = new ArrayList<>(set);
        for (CodePriceVo codePriceVo : codePriceVos) {
            System.out.println(codePriceVo);
        }

        double sum = codePriceVos.stream().filter(p -> p.getPrice() != null).mapToDouble(CodePriceVo::getPrice).sum();
        double avg = codePriceVos.stream().filter(p -> p.getPrice() != null).collect(Collectors.averagingDouble(CodePriceVo::getPrice));

        System.out.println(sum);
        System.out.println(avg);
    }


    @Test
    public void streamDemo() {
        List<StudentEntity> list = Lists.newArrayList();
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName("luo0412");
        studentEntity.setAge(null);

        list.add(studentEntity);
        Map<String, Integer> collect = list.stream().collect(Collectors.toMap(StudentEntity::getName, StudentEntity::getAge));
        System.out.println(collect);

    }



}
