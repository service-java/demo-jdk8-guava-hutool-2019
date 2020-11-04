package _ch1_lab.lab2;

/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-3
 * 再写?遍arraylist莫名其妙就好?
 */

public class Course2Test {

    public static void main(String[] args) {
        // 声名对象
        Course2 course = new Course2("物理");

        // 增删学生
        // 显示学生和学生数
        course.addStudent("张三");
        course.getStudent();
        System.out.println(course.getStudentNum());

        course.addStudent("李四");
        course.addStudent("王五");
        course.addStudent("赵斌");
        course.addStudent("李师?");
        course.dropStudent("李四");
        course.getStudent();
        System.out.println(course.getStudentNum());
    }

}
