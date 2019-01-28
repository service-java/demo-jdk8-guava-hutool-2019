package _collections.set;

import java.util.*;

public class DemoProperties {

    public static void main(String args[]) {
        java.util.Properties capitals = new java.util.Properties();
        Set<Object> states;
        String str;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        // Show all states and capitals in hashtable.
        states = capitals.keySet(); // get datatype.set-view of keys
        Iterator<Object> itr = states.iterator();
        while (itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("The capital of " +
                    str + " is " + capitals.getProperty(str) + ".");
        }
        System.out.println();

        // look for state not in list -- specify default
        str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of Florida is "
                + str + ".");
    }
}
