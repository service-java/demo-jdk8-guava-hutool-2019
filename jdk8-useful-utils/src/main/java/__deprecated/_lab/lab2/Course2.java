package __deprecated._lab.lab2;

import java.util.ArrayList;

/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-3
 */

public class Course2 {

    private String courseName;
    private ArrayList<String> studentList = new ArrayList<String>();

    // 构?函?
    public Course2(String x) {
        courseName = x;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        studentList.add(student);
    }

    public void dropStudent(String student) {
        // 遍历删除，看是否有符合条件的学生
        for (int i = 0, len = studentList.size(); i < len; ++i) {
            if (studentList.get(i) == student) {
                studentList.remove(i);
                break;
            }
        }
    }

    public void getStudent() {
        for (int i = 0, len = studentList.size(); i < len; ++i) {
            System.out.println(studentList.get(i));
        }
    }

    public int getStudentNum() {
        return studentList.size();
    }

}
