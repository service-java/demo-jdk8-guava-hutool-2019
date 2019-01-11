package __deprecated.lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-4 FinalExam? 期末作业
 */

public class FinalExam extends GradedActivity {
    private int numQuestions;  // Number of questions
    private double pointsEach; // Points for each question
    private int numMissed;     // Questions missed

    /**
     * The constructor sets the number of questions on the
     * exam and the number of questions missed.
     *
     * @param questions The number of questions.
     * @param missed    The number of questions missed.
     */

    public FinalExam(int questions, int missed) {
        double numericScore;  // To hold a numeric score

        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}