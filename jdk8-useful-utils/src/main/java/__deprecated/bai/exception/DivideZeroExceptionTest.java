package __deprecated.bai.exception;

import java.util.Arrays;

public class DivideZeroExceptionTest {

    public static void main(String[] args) {
        int[] array = new int[5];// 定义长度?5的数?
        Arrays.fill(array, 5); // 将数组中的元素赋值为5
        for (int i = 4; i > -1; i--) {// 遍历整个数组
            if (i == 0) {// 如果?0
                throw new DivideZeroException("除零异常");// 如果除零就抛出有异常信息的构造方?
            }// 如果不是除零就输出结?
            System.out.println("array[" + i + "] / " + i + " = " + array[i] / i);
        }
    }

}
