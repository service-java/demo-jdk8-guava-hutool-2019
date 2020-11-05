package _ch1_jdk8;

import org.junit.Test;

public class Java8InterfaceTest {
    // 定义接口Math
    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    // 定义接口Greeting
    interface GreetingService {
        void sayMessage(String message);
    }

    // 定义接口Formula
    interface Formula{

        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(a);
        }

    }

    @Test
    public void mathInterfaceDemo() {
        Java8InterfaceTest tester = new Java8InterfaceTest();

        // 类型声明
        MathOperation addition = (a, b) -> a + b;
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
                System.out.println("简单说几句:  " + message);
        GreetingService greetService2 = (message) ->
                System.out.println("我还能说啥~~ " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }


    @Test
    public void formula() {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100) + 2;
            }
        };

        System.out.println(formula.calculate(100));     // 102.0
        System.out.println(formula.sqrt(16));           // 4.0
    }


}
