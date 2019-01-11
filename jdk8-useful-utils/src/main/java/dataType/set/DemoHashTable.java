package dataType.set;

import cn.hutool.core.lang.Console;

import java.util.*;

public class DemoHashTable {

    public static void main(String args[]) {
        // Create a hash map
        Hashtable<String, Double> balances = new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;

        balances.put("Zara", new Double(3434.34));
        balances.put("Mahnaz", new Double(123.22));
        balances.put("Ayan", new Double(1378.00));
        balances.put("Daisy", new Double(99.22));
        balances.put("Qadir", new Double(-19.08));

        // Show all balancess in hash table.
        names = balances.keys();

        while (names.hasMoreElements()) {
            str = names.nextElement();
            Console.log("{}: {}",str, balances.get(str));
        }

        // Deposit 1,000 into Zara's account
        bal = (balances.get("Zara")).doubleValue();
        balances.put("Zara", new Double(bal + 1000));
        System.out.println("Zara's new balances: " + balances.get("Zara"));
    }
}