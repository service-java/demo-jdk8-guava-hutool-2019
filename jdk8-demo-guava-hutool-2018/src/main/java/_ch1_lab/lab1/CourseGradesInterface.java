package _ch1_lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-4 CourseGradesInterface?
 */

public class CourseGradesInterface extends CourseGrades implements Analyzable {

    public double getAverage() {
        double avg = (grades[0].getScore()
                + grades[1].getScore()
                + grades[2].getScore()) / 3;
        return avg;
    }

    ;

    public GradedActivity getHighest() {
        int max = 0;
        if (grades[1].getScore() > grades[max].getScore()) max = 1;
        if (grades[2].getScore() > grades[max].getScore()) max = 2;
        return grades[max];
    }

    public GradedActivity getLowest() {
        int min = 0;
        if (grades[1].getScore() < grades[min].getScore()) min = 1;
        if (grades[2].getScore() < grades[min].getScore()) min = 2;
        return grades[min];
    }

    @Override
    public String toString() {
        String str = "The scores and grades of the exams are:\n";
        str += grades[0].getScore() + " : " + grades[0].getGrade() + "\n";
        str += grades[1].getScore() + " : " + grades[1].getGrade() + "\n";
        str += grades[2].getScore() + " : " + grades[2].getGrade() + "\n";
        str += "The average score is: " + this.getAverage() + "\n";
        str += "The highest score is: " + this.getHighest().getScore() + "\n";
        str += "The lowest score is: " + this.getLowest().getScore() + "\n";
        return str;
    }
}
