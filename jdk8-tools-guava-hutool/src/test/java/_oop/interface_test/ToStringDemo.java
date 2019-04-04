package _oop.interface_test;

public class ToStringDemo {

    @Override
    public String toString() { // 重写toString()方法
        return "ToStringDemo?";
    }

    public static void main(String[] args) {
        System.out.println(new ToStringDemo()); // 自动调用
    }
}
