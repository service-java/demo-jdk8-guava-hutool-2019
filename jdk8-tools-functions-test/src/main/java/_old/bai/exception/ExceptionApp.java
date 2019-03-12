package _old.bai.exception;

/**
 * 各种异常的演?
 *
 * @author Luo_0412
 */
public class ExceptionApp {
    private static final double PI = 3.14; // 圆周?

    public void printExceptionInfo() { // 定义成员方法
        try {
            int x = 100; // 定义?部变量x
            int y = 0; // 定义?部变量y
            int z = x / y; // 计算x除以y的商
            // 输出计算结果
            System.out.println(x + "除以" + y + "的商是：" + z);
        } catch (Exception ex) {
            ex.printStackTrace(); // 输出异常到标准错误流
            // 使用getMessage方法输出异常信息
            System.out.println("getMessage方法?   " + ex.getMessage());
            // 使用getLocalizedMessage方法输出异常信息
            System.out.println("getLocalizedMessage方法?   " + ex.getLocalizedMessage());
            // 使用toString方法输出异常信息
            System.out.println("toString方法?   " + ex.toString());
        }
    }

    public void computeArea(double r) throws Exception { // 根据半径计算圆面积的方法
        if (r <= 20.0) {
            // 使用throw语句抛出异常
            throw new Exception("程序异常：\n半径? ?" + r + "\n半径不能小于20?");
        } else {
            double circleArea = PI * r * r; // 计算圆的面积
            System.out.println("半径?" + r + "的圆面积是：" + circleArea);
        }
    }

    public static void main(String[] args) {
        /**
         * ArrayIndexOutOfBoundsException
         * 超出数组范围
         */
//	    try{
//	        int a[] = new int[2];
//	        System.out.println("Access element two :" + a[1]);
//	        System.out.println("Access element three :" + a[2]);
//	    } catch(ArrayIndexOutOfBoundsException e){
//	        System.out.println("Exception thrown  :" + e);
//	    }
//	    System.out.println("Out of the block");

        /**
         * ClassNotFoundException
         * 类找不到
         */
//        try {
//            Class.forName("com.mysql.jdbc.Driver");//加载类文?
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        /**
         * 空指针异?
         */
        String str = null;
        str = "HeLLo";
        System.out.println(str.toLowerCase());// 将字符串转换成小?

        /**
         * 输出错误信息
         */
        ExceptionApp ex = new ExceptionApp(); // 创建类的实例
        ex.printExceptionInfo(); // 调用方法

        /**
         * throw抛出异常
         */
        ExceptionApp area = new ExceptionApp(); // 创建对象
        try {
            area.computeArea(10); // 调用方法
        } catch (Exception e) {
            System.out.println(e.getMessage()); // 输出异常信息
        }


    }

}
