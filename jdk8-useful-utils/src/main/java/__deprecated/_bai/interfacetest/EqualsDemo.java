package __deprecated._bai.interfacetest;

public class EqualsDemo {

    public static void main(String[] args) {
        String s1 = new String("mrsoft");// 创建新字符串
        String s2 = new String("mrsoft");// 创建新字符串
        System.out.println(s1 + "?" + s2 + "指向同一对象?" + (s1 == s2)); // 地址不同
        System.out.println(s1 + "?" + s2 + "内容相同?" + (s1.equals(s2)));
    }
}

