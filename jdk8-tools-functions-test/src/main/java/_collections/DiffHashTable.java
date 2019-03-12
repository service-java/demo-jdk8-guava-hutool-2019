package _collections;

import cn.hutool.core.lang.Console;

import java.util.HashMap;
import java.util.Hashtable;

public class DiffHashTable {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        Hashtable<String, String> ht = new Hashtable<>();

        hm.put(null, "hello");
        Console.log(hm);

        // Exception in thread "main" java.lang.NullPointerException
        ht.put(null, "hello");
        Console.log(ht);
    }
}
