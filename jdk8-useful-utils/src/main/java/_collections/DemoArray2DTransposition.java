package _collections;

/**
 * 矩阵转置
 *
 * @author Luo_0412
 */
public class DemoArray2DTransposition {

    public static void main(String[] args) {
        int[][] array = new int[3][2];
        int[][] arrayT = new int[2][3];

        System.out.println("二维数组中的元素：");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("转置后的数组元素：");
        for (int i = 0; i < arrayT.length; i++) {
            for (int j = 0; j < arrayT[i].length; j++) {
                arrayT[i][j] = array[j][i];
                System.out.print(arrayT[i][j] + " ");
            }
            System.out.println();
        }

    }
}
