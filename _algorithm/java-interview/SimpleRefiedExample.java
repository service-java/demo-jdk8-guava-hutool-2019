package com.wiley.javainterviewsexposed.chapter08;

import java.util.ArrayList;
import java.util.List;

public class SimpleRefiedExample {

    public void genericTypesCheck() {
        List<String> strings = new ArrayList<String>();
        strings.add("Die Hard 4.0");
        strings.add("Terminator 3");
        strings.add("Under Siege 2");

        System.out.println(strings.get(2) instanceof String);
    }
}
