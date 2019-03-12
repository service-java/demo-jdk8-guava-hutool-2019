package _collections;

import java.util.ArrayList;

/**
 * ArrayList方法测试
 *
 * @author Luo_0412
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();

        // 新增
        list.add("Yao Zhengwei");
        list.add("Hu Bin");
        list.add(1, "Tao Limin");
        displayArrayList(list);

        // 替换
        list.set(0, "Liang Xikun");
        displayArrayList(list);

        // 移除
        list.remove(2);
        displayArrayList(list);
    }

    // 遍历输出
    public static void displayArrayList(ArrayList<?> aList) {
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i) + " ");
        }
        System.out.println();
    }

}
