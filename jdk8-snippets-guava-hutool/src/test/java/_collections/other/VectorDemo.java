package _collections.other;

import java.util.*;

public class VectorDemo {

    public static void main(String args[]) {
        // initial size is 3,
        // increment is 2 增长
        java.util.Vector<Number> v = new java.util.Vector<>(3, 2);

        System.out.println("Initial size: " + v.size() +
                " Initial capacity: " + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));


        System.out.println("Capacity after four additions: " + v.capacity());

        v.addElement(new Double(5.45));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: " + v.capacity());


        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element: " + (Integer) v.firstElement());
        System.out.println("Last element: " + (Integer) v.lastElement());
        if (v.contains(new Integer(3))) {
            System.out.println("VectorDemo contains 3.");
        }

        System.out.println("\nElements in vector:");
        Enumeration<Number> vEnum = v.elements();
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
