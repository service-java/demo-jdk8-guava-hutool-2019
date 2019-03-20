package _lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-3 GradeActivity?  平时实验
 */

public class GradedActivity {
    private double score;  // Numeric score

    protected void setScore(double s) {
        score = s;
    }

    public double getScore() {
        return score;
    }

    // 评级
    public char getGrade() {
        char letterGrade;

        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}
