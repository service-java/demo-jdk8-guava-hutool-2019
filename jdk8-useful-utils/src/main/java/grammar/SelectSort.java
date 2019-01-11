package grammar;

public class SelectSort {
    /*
     * 方法：?择排序
     * 思想：每次取出剩下的?值放在最前面
     * 本题：从小到大排?
     */
    public static void selectSort(double[] a) {
        int n = a.length;  // 获取数组长度
        for (int k = 0; k < n - 1; k++) {
            int min = k;  // ?小?的下标
            for (int i = k + 1; i < n; i++) {
                // 如果能找到最值，替换?值下?
                if (a[i] < a[min]) {
                    min = i;
                }
            }
            // 如果?值下标发生变化，替换数组元素
            if (k != min) {
                double temp = a[k];
                a[k] = a[min];
                a[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // 定义数组
        double[] doubleArr = {1, 9, 3.6, 4.8, -3.8};

        // 调用选择排序方法
        selectSort(doubleArr);
        for (double arrItem : doubleArr) {
            System.out.print(arrItem + ",");
        }
    }

}
