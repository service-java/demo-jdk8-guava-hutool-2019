package __deprecated._lab.lab2;

//import java.util.ArrayList;

/*
 * < 骆金? >
 * Java programing Autumn 2016
 * Lab 5-2
 *
 */

public class Course {

    private String courseName;
    private int studentNum = 0;
    private String[] studentList = new String[10];

    // 构?函?
    public Course(String x) {
        courseName = x;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        for (int i = 0, len = studentList.length; i < len; ++i) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public void dropStudent(String student) {
        // 遍历删除，看是否有符合条件的学生
        for (int i = 0, len = studentList.length; i < len; ++i) {
            if (studentList[i] == student) {
                studentList[i] = null;
                break;
            }
        }
    }

    public void getStudent() {
        studentNum = 0;
        for (int i = 0, len = studentList.length; i < len; ++i) {
            if (studentList[i] != null) {
                System.out.println(studentList[i]);
                studentNum++;
            }
        }
    }

    public int getStudentNum() {
        studentNum = 0;
        for (int i = 0, len = studentList.length; i < len; ++i) {
            if (studentList[i] != null) {
                studentNum++;
            }
        }
        return studentNum;
    }

}
