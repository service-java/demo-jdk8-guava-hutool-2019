package __deprecated._lab.lab1;

/*
 * 骆金?
 * Java programming Autumn 2016
 * Lab 6-3 PassFailExam?  期中考试
 */


public class PassFailExam extends FinalExam {
    private double minPassing;

    public PassFailExam(int questions, int missed, double minPassing) {
        super(questions, missed); // 使用父类?
        this.minPassing = minPassing;
    }

    public char getGrade() {
        char letterGrade;

        if (super.getScore() >= minPassing)
            letterGrade = 'P';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}
