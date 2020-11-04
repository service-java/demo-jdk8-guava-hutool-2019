package _ch1_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo2 {
    private FileReader read = null; // 声明FileReader对象read

    public void readFileInfo() { // 定义方法
        try {
            try {
                read = new FileReader("src/_03_exception/ThrowsDemo2.java");// 创建FileReader对象read
                System.out.println("找到指定的文件，创建IO对象成功?");
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // 输出践踪?
            }
        } finally {
            if (read != null) {
                try {
                    read.close(); // 关闭FileReader对象read，释放资?
                    System.out.println("关闭IO对象?");
                } catch (IOException ioe) {
                    ioe.printStackTrace(); // 输出践踪?
                    System.out.println("关闭IO对象发生异常?");
                }
            }
        }
    }

    public static void main(String[] args) {
        ThrowsDemo2 ex = new ThrowsDemo2(); // 创建对象
        ex.readFileInfo(); // 调用readFileInfo()方法
    }
}
