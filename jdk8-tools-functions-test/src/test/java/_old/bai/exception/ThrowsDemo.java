package _old.bai.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    private FileReader read = null; // 声明FileReader对象read

    public void createFile() throws FileNotFoundException { // 定义方法，使用throws抛出Exception异常
        // 创建FileReader对象read
        read = new FileReader("src/_03_exception/ThrowsDemo2.java");
        System.out.println("分配内存资源?");
    }

    public void test() {
        try {
            createFile();
        } catch (Exception ex) {
            ex.printStackTrace(); // 输出践踪?
            System.out.println("创建IO对象异常?");
        } finally {
            // 如果找的到文?
            if (read != null) {
                try {
                    read.close(); // 关闭IO?
                    System.out.println("释放内存资源?");
                } catch (IOException e) {
                    e.printStackTrace(); // 输出践踪?
                    System.out.println("关闭IO对象异常?");
                }
            }
        }
    }

    public static void main(String[] args) {
        ThrowsDemo ex = new ThrowsDemo(); // 创建对象
        ex.test(); // 调用test()方法
    }

}
