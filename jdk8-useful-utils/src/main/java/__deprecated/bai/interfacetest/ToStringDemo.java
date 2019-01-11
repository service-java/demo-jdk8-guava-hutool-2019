package __deprecated.bai.interfacetest;

public class ToStringDemo {

    @Override
    public String toString() { // 重写toString()方法
        return "ToStringDemo?";
    }

    public static void main(String[] args) {
        System.out.println(new ToStringDemo()); // 自动调用
    }
}
