package __deprecated._lab.lab2;


/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-2
 * arraylist写的时?出bug?
 * 貌似是长度出了问?
 */

public class CourseTest {

    public static void main(String[] args) {
        // 声名对象
        // 默认?多添?10名学?
        Course course1 = new Course("语文");
        Course course2 = new Course("数学");

        // 增删学生
        // 显示学生和学生数
        course1.addStudent("张三");
        course1.addStudent("李四");
        course1.addStudent("王五");
        course1.getStudent();
        System.out.println(course1.getStudentNum());

        course1.dropStudent("李四");
        course1.dropStudent("张三");
        course1.getStudent();
        System.out.println(course1.getStudentNum() + "\n");

        // 再创建一个数学对?
        course2.addStudent("林冲");
        course2.getStudent();
        System.out.println(course2.getStudentNum() + "\n");
    }

}
