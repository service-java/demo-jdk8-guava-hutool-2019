package _old.lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-4 CourseGradesInterface的测试程?
 */

public class CourseGradesInterfaceApp {

    public static void main(String[] args) {
        // 声名三个考试
        GradedActivity gradeActivity = new GradedActivity();
        gradeActivity.setScore(80);
        PassFailExam passFailExam = new PassFailExam(10, 3, 70);
        FinalExam finalExam = new FinalExam(50, 2);

        // 保存考试的对?
        CourseGradesInterface cg2 = new CourseGradesInterface();
        cg2.setLab(gradeActivity);
        cg2.setPassFailExam(passFailExam);
        cg2.setFinalExam(finalExam);
        System.out.println(cg2.toString());
    }
}
