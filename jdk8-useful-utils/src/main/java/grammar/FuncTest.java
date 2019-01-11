package grammar;

/**
 * 函数测试
 * 值传递和指针传递
 *
 * @author Luo_0412
 */
public class FuncTest {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        int i = 5, j = 2;
        int k = max(i, j); // 调用max函数
        System.out.println("max(" + i + "," + j + ") = " + k);

        double i2 = 7D, j2 = 9D;
        double k2 = max(i2, j2); // 调用重载函数
        System.out.println("max(" + i2 + "," + j2 + ") = " + k2);

        // 交换两个数，但并未真正交换
        int num1 = 1, num2 = 2;
        System.out.println("Before num1:" + num1
                + " num2:" + num2);
        swap(num1, num2);   // 调用swap方法
        System.out.println("Outside,however, num1:" + num1
                + " num2:" + num2);

        // 函数重载
        FuncTest o = new FuncTest();  // 直接这个文件的类名?

        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1, "test3"));
        System.out.println(o.test("test4", 1));
    }

    /**
     * 返回较大值
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int max(int num1, int num2) {
        if (num1 > num2) return num1;
        else return num2;
    }

    public static double max(double num1, double num2) {
        if (num1 > num2) return num1;
        else return num2;
    }

    /**
     * 交换值
     *
     * @param n1
     * @param n2
     */
    public static void swap(int n1, int n2) {
        // 交换 n1 与 n2的值
//	      int temp = n1;
//	      n1 = n2;
//	      n2 = temp;

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("Inside,After swapping n1: " + n1
                + " n2: " + n2);
    }

    // 仅仅返回类型不同是不行的
    public int test() {
        System.out.println("test1：");
        return 1;
    }

    public void test(int a) {
        System.out.println("test2：");
    }

    // 以下两个参数类型顺序不同
    public String test(int a, String s) {
        System.out.println("test3：");
        return "return test3";
    }

    public String test(String s, int a) {
        System.out.println("test4：");
        return "return test4";
    }

}


