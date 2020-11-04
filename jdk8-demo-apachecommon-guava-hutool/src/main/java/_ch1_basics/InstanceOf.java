package _ch1_basics;


class Vehicle {
}

public class InstanceOf extends Vehicle {

    public static void main(String[] args) {
        Vehicle a = new InstanceOf();
        boolean result = a instanceof InstanceOf;
        System.out.println(result);
    }

}

