package _ch1_oop;

import entity.school.BookEntity;

/**
 * Book类的测试
 *
 * @author Luo_0412
 */
public class BookTest {

    public static void main(String[] args) {
        BookEntity bk = new BookEntity("《乖,摸摸头》", "人民邮电出版?", "123", 100);
        BookEntity bk2 = new BookEntity();
        System.out.println(bk.getTitle());
        System.out.println(bk2.getPrice());

    }

}
