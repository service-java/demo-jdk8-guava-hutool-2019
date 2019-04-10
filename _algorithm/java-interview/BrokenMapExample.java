package com.wiley.javainterviewsexposed.chapter08;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class BrokenMapExample {

    @Test
    public void wrongSetBehavior() {
        final Set<Person> people = new HashSet<Person>();

        final Person person1 = new Person("Alice", 28);
        final Person person2 = new Person("Bob", 30);
        final Person person3 = new Person("Charlie", 22);

        final boolean person1Added = people.add(person1);
        final boolean person2Added = people.add(person2);
        final boolean person3Added = people.add(person3);

        assertTrue(person1Added && person2Added && person3Added);

        // logically equal to person1
        final Person person1Again = new Person("Alice", 28);

        // should return false, as the person is already in the set
        final boolean person1AgainAdded = people.add(person1Again);

        // But will return true as the equals method has not been implemented
        assertTrue(person1AgainAdded);
        assertEquals(4, people.size());
    }
}

class Person {

    private final String name;
    private final int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * age;
    }

}