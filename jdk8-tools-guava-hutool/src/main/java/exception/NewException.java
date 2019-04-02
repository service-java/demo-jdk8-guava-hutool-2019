package exception;

public class NewException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = -400794805034166270L;

    // 创建自定义异常类
    public NewException(Double r) { // 有一个Double类型形参的构造方?
        System.out.println("发生异常? 圆的半径不能小于20");
        System.out.println("圆的半径?: " + r);
    }
}
