package _jdk8;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * Examples how to avoid null checks with Optional:
 * <p>
 * http://winterbe.com/posts/2015/03/15/avoid-null-checks-in-java/
 *
 * @author Benjamin Winterberg
 */
public class OptionalDemo {

    // 三层
    static class Outer {
        Nested nested = new Nested();
        public Nested getNested() {
            return nested;
        }
    }

    static class Nested {
        Inner inner = new Inner();
        public Inner getInner() {
            return inner;
        }
    }

    static class Inner {
        String foo = "boo";
        public String getFoo() {
            return foo;
        }
    }



    // 如果没有则允许为空
    public static <T> Optional<T> resolve(Supplier<T> resolver) {
        try {
            T result = resolver.get();
            return Optional.ofNullable(result);
        } catch (NullPointerException e) {
            return Optional.empty();
        }
    }


/*    @Test
    public void demo() {
        Optional<String> optional = Optional.of("bam");

        Console.log("{} {} {}",
                optional.isPresent(),           // true
                optional.get(),                 // "bam"
                optional.orElse("fallback"));   // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));  // "b"
    }*/


    @Test
    public void test1() {
        Optional.of(new Outer())
                .flatMap(o -> Optional.ofNullable(o.nested))
                .flatMap(n -> Optional.ofNullable(n.inner))
                .flatMap(i -> Optional.ofNullable(i.foo))
                .ifPresent(System.out::println); // boo
    }

    @Test
    public void test2() {
        Optional.of(new Outer())
                .map(Outer::getNested)
                .map(Nested::getInner)
                .map(Inner::getFoo)
                .ifPresent(System.out::println); // boo
    }

    @Test
    public void test3() {
        Outer outer = new Outer();
        resolve(() -> outer.getNested().getInner().getFoo())
                .ifPresent(System.out::println); // boo
    }


}
