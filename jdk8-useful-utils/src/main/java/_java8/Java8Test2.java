package _java8;

public class Java8Test2 {
    public static void main(String args[]) {
        Java8Test2 tester = new Java8Test2(); // 类??

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));


        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message); // say message的方法写这??

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

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
}
