package _ch1_basics;

/**
 * 此程序显示从操作系统C传递给它的参数
 *
 * @author Luo_0412
 */
public class CommandLine {


    // @todo 暂时啥也显示不了
    public static void main(String[] args) {
        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }
    }

}
