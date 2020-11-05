package _ch1_lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-3 CourseGrades的测试程?
 */

public class CourseGradesApp {
    public static void main(String[] args) {
        // 声名对象
        GradedActivity gradeActivity = new GradedActivity();
        gradeActivity.setScore(80);
        PassFailExam passFailExam = new PassFailExam(10, 3, 70);
        FinalExam finalExam = new FinalExam(50, 2);

        // 声名保存成绩的对?
        CourseGrades courseGrade = new CourseGrades();
        courseGrade.setLab(gradeActivity);
        courseGrade.setPassFailExam(passFailExam);
        courseGrade.setFinalExam(finalExam);
        System.out.println(courseGrade.toString());
    }
}
