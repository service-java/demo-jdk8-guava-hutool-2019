package _ch1_oop.interfaceTest;

public class Customer {

    public static void main(String[] args) {
        Car bmw = CarFactory.getCar("BMW");
        System.out.println("提取汽车?" + bmw.getInfo());
        Car benz = CarFactory.getCar("Benz");
        System.out.println("提取汽车?" + benz.getInfo());
    }
}
