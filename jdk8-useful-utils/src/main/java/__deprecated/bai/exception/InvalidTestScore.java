package __deprecated.bai.exception;

/**
 * 自定义的异常处理?
 *
 * @author Luo_0412
 */
public class InvalidTestScore extends Exception {

    private static final long serialVersionUID = -400794805034166270L;

    public InvalidTestScore(double score) {
        System.out.println("Error: score is out of the range " + score);
    }
}
