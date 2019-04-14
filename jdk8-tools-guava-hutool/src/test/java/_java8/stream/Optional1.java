package _java8.stream;

import org.junit.Test;

import java.util.Optional;

/**
 * @author Benjamin Winterberg
 */
public class Optional1 {

    @Test
    public void demo1() {
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));  // "b"
    }

}
