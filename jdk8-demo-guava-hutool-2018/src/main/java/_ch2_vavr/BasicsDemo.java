package _ch2_vavr;

import _ch2_vavr.entity.VavrUser;
import cn.hutool.core.lang.Console;
import com.google.common.collect.Lists;
import io.vavr.Tuple;
import io.vavr.Tuple1;
import io.vavr.Tuple2;
import io.vavr.Tuple5;
import io.vavr.collection.List;
import io.vavr.control.Option;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Description: 模块功能描述
 * https://juejin.im/post/6854573219467411470
 * <p>
 * User: luo0412
 * Date: 2020-11-05 13:25
 */
public class BasicsDemo {
    public static void main(String[] args) {

        List.of(1, 2, 3, 4, 5)
                .filter(i -> i > 3)
                .map(i -> i * 2);
    }

    @Test
    public void append() {
        List list = List.of(1, 2);
        List list2 = list
                .append(List.of(3, 4))
                .append(List.of(5, 6))
                .append(7);

        Console.log(list2);
//        System.out.println(list2);
    }

    @Test
    public void diff() {

        ArrayList<VavrUser> users = Lists.newArrayList();
        users.add(VavrUser.builder().age(11).id(1L).name("jack").build());
        users.add(VavrUser.builder().age(29).id(2L).name("mary").build());
        users.add(VavrUser.builder().age(29).id(2L).name("leo").build());

        // 1) JDK8的实现方法
        Map<Integer, java.util.List<String>> collect = users.stream()
                .filter(u -> u.getAge() >= 18)
                .collect(Collectors.groupingBy(VavrUser::getAge, Collectors.mapping(VavrUser::getName, Collectors.toList())));
        Console.log(collect);

        // 2) vavr的实现方法, 略简洁
        io.vavr.collection.Map<Integer, List<String>> tuple2s = List.ofAll(users)
                .filter(u -> u.getAge() >= 18)
                .groupBy(VavrUser::getAge)
                .mapValues(usersGroup -> usersGroup.map(VavrUser::getName));
        Console.log(tuple2s);

    }

    @Test
    public void testTuple() {
        // 一元组
        Tuple1<String> oneTuple = Tuple.of("string");
        String oneTuple_1 = oneTuple._1;

        // 二元组
        Tuple2<String, Integer> twoTuple  = Tuple.of("string", 1);
        String twoTuple_1 = twoTuple._1;
        Integer twoTuple_2 = twoTuple._2;

        // 五元组
        Tuple5<String, Integer, Float, Double, Character> threeTuple = Tuple.of("string", 2, 1.2F, 2.4D, 'c');
        String threeTuple_1 = threeTuple._1;
        Integer threeTuple_2 = threeTuple._2;
        Float threeTuple_3 = threeTuple._3;
        Double threeTuple_4 = threeTuple._4;
        Character threeTuple_5 = threeTuple._5;
        Console.log(threeTuple_5);
    }

    @Test
    public void testOptional() {
        Assert.assertTrue(Optional.ofNullable(null) instanceof Optional);
        Assert.assertTrue(Optional.of(1) instanceof Optional);
        Assert.assertTrue(Optional.empty() instanceof Optional);
        Assert.assertTrue(Optional.ofNullable(1) instanceof Optional);
    }

    @Test
    public void testWithJavaOptional() {
        // Java Optional
        String result = Optional.of("hello")
                .map(str -> (String) null)
                .orElseGet(() -> "world");

        // result = "world"
        Assert.assertEquals("word", result);
    }

    @Test
    public void testWithVavrOption() {
        // Vavr Option
        String result = Option.of("hello")
                .map(str -> (String) null)
                .getOrElse(() -> "world");

        // result = null
        Assert.assertNull(result);
    }




}
