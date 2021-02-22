package _ch1_jdk8.lambda;

import lombok.Data;

/**
 * @author Benjamin Winterberg
 */
@Data
public class Person {
    public String firstName;
    public String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
