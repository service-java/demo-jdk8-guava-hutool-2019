package _collections.set;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.*;

public class HashTableDemo {

    @Test
    public void main() {
        // Create a hash map
        Hashtable<String, Double> balances = new Hashtable<>();
        balances.put("Zara", new Double(3434.34));
        balances.put("Mahnaz", new Double(123.22));
        balances.put("Ayan", new Double(1378.00));
        balances.put("Daisy", new Double(99.22));
        balances.put("Qadir", new Double(-19.08));


        // Show all balancess in hash table.
        Enumeration<String> names;
        names = balances.keys();
        String str;
        while (names.hasMoreElements()) {
            str = names.nextElement();
            Console.log("{}: {}", str, balances.get(str));
        }

        double bal;
        // Deposit 1,000 into Zara's account
        bal = (balances.get("Zara")).doubleValue();
        balances.put("Zara", new Double(bal + 1000));
        Console.log("Zara's new balances: " + balances.get("Zara"));
    }

}
