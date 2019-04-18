package _basic;

/**
 * 此程序显示从操作系统C传递给它的参数
 *
 * @author Luo_0412
 */
public class CommandLine {
    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }
    }

}
