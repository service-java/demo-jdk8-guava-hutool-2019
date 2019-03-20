package _lab.lab2;

/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-3
 */

public class MyInteger {
    private int value;

    public MyInteger(int x) {
        value = x;
    }

    public int getValue() {
        return value;
    }

    public Boolean isEven() {
        if (value % 2 == 0) return true;
        else return false;
    }

    public Boolean isOdd() {
        if (value % 2 == 0) return false;
        else return true;
    }

    public Boolean isPrime() {
        Boolean isPrime = true;  //默认为素?
        if (value <= 1) isPrime = false;
        else if (value == 2) isPrime = true;
        else if (value % 2 == 0) isPrime = false;  //偶数都不是素?
        else {
            int judge = (int) Math.sqrt(value) + 1;  //并不?要全部循环判?
            int i = 3;
            for (i = 3; i <= judge; i = i + 2) {
                if (value % i == 0) {  //注意除以i而不是judge
                    isPrime = false;   //相当于剔?
                    break;
                }
            }
        }
        return isPrime;
    }

    public Boolean isEven(int x) {
        if (x % 2 == 0) return true;
        else return false;
    }

    public Boolean isOdd(int x) {
        if (x % 2 == 0) return false;
        else return true;
    }

    public Boolean isPrime(int x) {
        Boolean isPrime = true;  //默认为素?
        if (x <= 1) isPrime = false;
        else if (x == 2) isPrime = true;
        else if (x % 2 == 0) isPrime = false;  //偶数都不是素?
        else {
            int judge = (int) Math.sqrt(x) + 1;  //并不?要全部循环判?
            int i = 3;
            for (i = 3; i <= judge; i = i + 2) {
                if (x % i == 0) {  //注意除以i而不是judge
                    isPrime = false;   //相当于剔?
                    break;
                }
            }
        }
        return isPrime;
    }

    public Boolean isEven(MyInteger x) {
        if (x.getValue() % 2 == 0) return true;
        else return false;
    }

    public Boolean isOdd(MyInteger x) {
        if (x.getValue() % 2 == 0) return false;
        else return true;
    }

    public Boolean isPrime(MyInteger x) {
        Boolean isPrime = true;  //默认为素?
        if (x.getValue() <= 1) isPrime = false;
        else if (x.getValue() == 2) isPrime = true;
        else if (x.getValue() % 2 == 0) isPrime = false;  //偶数都不是素?
        else {
            int judge = (int) Math.sqrt(x.getValue()) + 1;  //并不?要全部循环判?
            int i = 3;
            for (i = 3; i <= judge; i = i + 2) {
                if (x.getValue() % i == 0) {  //注意除以i而不是judge
                    isPrime = false;   //相当于剔?
                    break;
                }
            }
        }
        return isPrime;
    }

    public Boolean equals(int x) {
        if (value == x) return true;
        else return false;
    }

    public Boolean equals(MyInteger x) {
        if (value == x.getValue()) return true;
        else return false;
    }

    public static int parseInt(char[] x) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < x.length; i++) {
            sb.append(x[i]);
        }
        String newStr = sb.toString();
        Integer i = Integer.parseInt(newStr);
        return i;
    }

    public static int parseInt(String x) {
//		String tmp = x;
        Integer i = Integer.parseInt(x);
        return i;
    }

}
