package exception;

public class DivideZeroException extends ArithmeticException {// 自定义异常类
    private static final long serialVersionUID = 1563874058117161205L;

    public DivideZeroException() {
    }// 实现默认构?方?

    public DivideZeroException(String msg) {
        super(msg);
    }// 实现有输出信息的构?方?
}
