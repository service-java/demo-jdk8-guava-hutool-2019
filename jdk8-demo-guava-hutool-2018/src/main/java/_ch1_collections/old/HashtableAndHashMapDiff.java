package _ch1_collections.old;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableAndHashMapDiff {

    @Test
    public void main() {
        HashMap<String, String> hm = new HashMap<>();
        Hashtable<String, String> ht = new Hashtable<>();

        hm.put(null, "hello");
        Console.log(hm);

        // Exception in thread "main" java.lang.NullPointerException
        ht.put(null, "hello");
        Console.log(ht);
    }
}
