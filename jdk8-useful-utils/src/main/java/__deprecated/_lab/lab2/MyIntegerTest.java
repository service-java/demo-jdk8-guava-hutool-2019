package __deprecated._lab.lab2;

/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-3
 */


public class MyIntegerTest {

    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(100);
        String str = "109";
        char[] charArr = {'1', '0', '1'};
        System.out.println(myInteger1.getValue());
        System.out.println("奇数? " + myInteger1.isOdd());
        System.out.println("偶数: " + myInteger1.isEven());
        System.out.println("素数? " + myInteger1.isPrime());
        System.out.println("等于" + myInteger1.getValue() + ": "
                + myInteger1.equals(MyInteger.parseInt(str)));
        System.out.println("等于" + myInteger1.getValue() + ": "
                + myInteger1.equals(MyInteger.parseInt(charArr)) + "\n");
        System.out.println(MyInteger.parseInt(str));


        MyInteger myInteger2 = new MyInteger(101);
        System.out.println(myInteger2.getValue());
        System.out.println("奇数? " + myInteger2.isOdd(myInteger2));
        System.out.println("偶数: " + myInteger2.isEven(myInteger2));
        System.out.println("素数? " + myInteger2.isPrime(myInteger2));
        System.out.println("等于101: " + myInteger2.equals(myInteger2));
    }

}
