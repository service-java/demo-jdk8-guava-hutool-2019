package __deprecated.lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-3 CourseGrades?
 */

public class CourseGrades {
    GradedActivity[] grades = new GradedActivity[3];

    public void setLab(GradedActivity ga) {
        grades[0] = ga;
    }

    public void setPassFailExam(PassFailExam pfe) {
        grades[1] = pfe;
    }

    public void setFinalExam(FinalExam fe) {
        grades[2] = fe;
    }

    @Override
    public String toString() {
        String str = "The scores and grades of the exams are:\n";
        str += grades[0].getScore() + " : " + grades[0].getGrade() + "\n";
        str += grades[1].getScore() + " : " + grades[1].getGrade() + "\n";
        str += grades[2].getScore() + " : " + grades[2].getGrade() + "\n";
        return str;
    }

}
