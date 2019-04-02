package _java8;

import cn.hutool.core.lang.Console;
import com.google.common.base.Optional;
import org.junit.Test;

public class OptionalTest {

    @Test
    public void test1() {
        Integer value1 = null;
        Integer value2 = 10;

       /*
         创建指定引用的Optional实例，若引用为null则快速失败返回absent()
         absent()创建引用缺失的Optional实例
        */
        Optional<Integer> a = Optional.fromNullable(value1);

        // 返回包含给定的非空引用Optional实例
        Optional<Integer> b = Optional.of(value2);
        Console.log("a -> {} b -> {}", a, b);

        System.out.println(sum(a, b));
    }


    private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        // isPresent()
        // 如果Optional包含非null的引用（引用存在），返回true
//        Console.log("参数1 -> {} 参数2 -> {}" , a.isPresent(), b.isPresent());

        // 返回Optional所包含的引用,
        // 若引用缺失,返回指定的值
        Integer value1 = a.or(0);

        // 返回所包含的实例,它必须存在,
        // 通常在调用该方法时会调用isPresent()判断是否为null
        Integer value2 = b.get();
        Console.log("value -> {} value2 -> {}", value1, value2);

        return value1 + value2;
    }

}
