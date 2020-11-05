package _ch1_collections.old;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.*;

public class PropertiesDemo {

    @Test
    public void hello() {
        Properties capitals = new Properties();
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        Set<Object> states;
        // 注意 keySet
        // get datatype.set-view of keys
        states = capitals.keySet();
        Iterator<Object> itr = states.iterator();

        String str;
        while (itr.hasNext()) {
            str = (String) itr.next();
            Console.log("The capital of " + str + " is " + capitals.getProperty(str));
        }

        str = capitals.getProperty("Florida", "Not Found");
        Console.log("The capital of Florida is " + str);
    }
}
