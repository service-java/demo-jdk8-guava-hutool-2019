package _ch2_hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.PageUtil;

public class PageUtilDemo {
    public static void main(String[] args) {

        // 参数意义分别为：当前页、总页数、每屏展示的页数
        int[] rainbow = PageUtil.rainbow(5, 20, 6);

        // 结果：[3, 4, 5, 6, 7, 8]
        Console.log(rainbow);

        int[] startEnd1 = PageUtil.transToStartEnd(1, 10); // [0, 10]
        int[] startEnd2 = PageUtil.transToStartEnd(2, 10); // [10, 20]
        Console.log("{} {}", startEnd1, startEnd2);
    }
}
