package _oop;

import entity.school.Book;

/**
 * Book类的测试
 *
 * @author Luo_0412
 */
public class BookTest {

    public static void main(String[] args) {
        Book bk = new Book("《乖,摸摸头》", "人民邮电出版?", "123", 100);
        Book bk2 = new Book();
        System.out.println(bk.getTitle());
        System.out.println(bk2.getPrice());

    }

}
