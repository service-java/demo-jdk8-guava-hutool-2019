package _str;

import java.util.StringTokenizer;

/**
 * String扩展类型 对象??的使用方法
 *
 * @author Luo_0412
 */
public class StringTypeDemo {

    /**
     * 主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * StringTokenizer的用法
         */
        StringTokenizer sTokenizer = new StringTokenizer("1-2-3-4-5", "-");
        int number = sTokenizer.countTokens(); // 获取长度

        // 遍历输出
        for (int i = 0; i < number; i++) {
            System.out.println(sTokenizer.nextToken() + " ");
        }

        // 另一种遍历输出方式
//		while(sTokenizer.hasMoreTokens()){
//			System.out.println(sTokenizer.nextToken()+ " ");
//		}

        /**
         * StringBuilder PK String
         */
        String s = "";
        System.gc(); // 回收系统内存??
        long currentTime = System.currentTimeMillis();// 获得当前时间
        for (int i = 0; i < 999; i++) {
            s = s + i;
        }
        System.out.println("String耗时： "
                + (System.currentTimeMillis() - currentTime) + "毫秒");
        System.gc();// 回收系统内存

        currentTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();// 创建StringBuilder类型对象
        for (int i = 0; i < 999; i++) {
            sb.append(i);
        }
        System.out.println("StringBuilder消时："
                + (System.currentTimeMillis() - currentTime) + "毫秒");

        /**
         * StringBuilder的用法
         */
        StringBuilder sBuilder = new StringBuilder();

        sBuilder.append("I sold 12 doughnuts");  // 新增
        sBuilder.append(" for $15.");
        sBuilder.insert(7, 1);                   // 插入
        sBuilder.replace(2, 6, "bought");        // 替换
        sBuilder.delete(22, sBuilder.length());  // 删除

        System.out.println(sBuilder);

        // 定义
        sBuilder = new StringBuilder("I ate 100 blueberries!");
        System.out.println(sBuilder);

        // 删除
        sBuilder.deleteCharAt(8);   // Delete the '0'.
        sBuilder.delete(9, 13);    // Delete "blue".
        System.out.println(sBuilder);

        // 插入
        sBuilder.insert(2, "is fun");
        System.out.println(sBuilder);

        // 替换
        System.out.println("CharAt：" + sBuilder.charAt(2));
        sBuilder.setCharAt(6, '5');    // Change the '1' to '5'
        System.out.println(sBuilder);
        sBuilder.replace(6, 8, "23");
        System.out.println(sBuilder);

        // reverse
        System.out.println("Reverse：" + sBuilder.reverse());

        // substring
        sBuilder = new StringBuilder("java");
        System.out.println("Substring：" + sBuilder.substring(1, 3));
        sBuilder = new StringBuilder("java");
        System.out.println("Substring：" + sBuilder.substring(2));

        /**
         * StringBuilder类相较于StringBuffer有速度优势
         * 在应用程序要求线程安全的情况下，则必须使用StringBuffer类
         */
        StringBuffer sBuffer = new StringBuffer(" test");
        sBuffer.append(" String Buffer");
        System.out.println(sBuffer + "\n");

        sBuilder = new StringBuilder(" h e l l o");
        sBuilder.append(" w o r l d");
        System.out.println(sBuilder + "\n");


    }

}
