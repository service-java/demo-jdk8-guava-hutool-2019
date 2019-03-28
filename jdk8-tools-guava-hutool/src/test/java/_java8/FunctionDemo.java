package _java8;

import java.util.ArrayList;
import java.util.List;

public class FunctionDemo {
    public static void main(String[] args) {

        List arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        //
        arr.forEach(System.out::println);
    }
}
