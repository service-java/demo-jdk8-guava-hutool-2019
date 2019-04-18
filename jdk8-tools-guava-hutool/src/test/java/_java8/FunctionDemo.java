package _java8;

import _java8.lambda.Lambda2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FunctionDemo {
    @Test
    public void hello() {
        List arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr.forEach(System.out::println);
    }

    @Test
    public void demo () {
        Lambda2.Converter<ArrayList, Object> arrayListObjectConverter = ArrayList::new;
        
    }
}
