package _java8;

import org.junit.Test;

public class Java8InterfaceTest {
    // 定义接口
    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    @Test
    public void main() {
        Java8InterfaceTest tester = new Java8InterfaceTest();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> a * b;
        MathOperation division = (int a, int b) -> a / b;


        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

    }

    @Test
    public void test() {
        GreetingService greetService1 = message ->
                System.out.println("HibernateValidateTest " + message);
        GreetingService greetService2 = (message) ->
                System.out.println("我还能说啥 ~~ " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }


}
