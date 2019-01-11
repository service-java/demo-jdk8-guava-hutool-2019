package dataType.str;

public class DemoStringMethod2 {

    public static void main(String[] args) {
        // 定义字符串
        String message = " So say we all! ";
        String message1 = " So say we all! ";
//		String message2 = " so say we all! ";
        String message3 = new String(" So say we all! ");

        // 类似缓存机制演示
        System.out.println(message == message1); // 输出true
        System.out.println(message == message3); // 输出false
        System.out.println(message.compareTo(message1)); // 输出0

        // 定义字符串
        String str = "joe@gaddisBooks.com";
        String[] tokens = str.split("[@.]"); // 字符串拆成数组
        for (String val : tokens) {
            System.out.println(val);
        }

        // 声名数组
        String fullName = "Cynthia Susan Smith";
        char[] nameArray = new char[5];
        fullName.getChars(8, 13, nameArray, 0); // 字符串提取方法
        nameArray = fullName.substring(8, 13).toCharArray(); //字符串转化成数组

        // 输出字符串和数组
        System.out.println("The string is: " + fullName);
        System.out.println("The values in the nameArray are: ");
        for (char val : nameArray) {
            System.out.print(val + " ");
        }

    }

}
