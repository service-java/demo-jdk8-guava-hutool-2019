package _ch6_swing.table;

import java.awt.BorderLayout;
import java.util.Vector;
import javax.swing.JFrame;

/**
 * 创建窗体?
 *
 * @author zhang zhen kun
 */
public class RowTitleTableFrame extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -8272741793330300492L;

    /**
     * 构?方法，用于初始化组?
     */
    public RowTitleTableFrame() {
        super();
        setTitle("带行标题栏的表格"); // 设置窗体的标?
        setBounds(100, 100, 400, 230); // 设置窗体的位置和大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体的默认关闭模?
        Vector<String> columnNameV = new Vector<String>(); // 创建列名向量
        columnNameV.add("日期");
        for (int i = 1; i < 21; i++) {
            columnNameV.add("商品" + i);
        }
        Vector<Vector<Object>> tableValueV = new Vector<Vector<Object>>(); // 创建数据向量
        for (int row = 1; row < 31; row++) {
            Vector<Object> rowV = new Vector<Object>(); // 创建行向?
            rowV.add(row);
            for (int col = 0; col < 20; col++) {
                rowV.add((int) (Math.random() * 1000)); // 向行向量添加随机整数
            }
            tableValueV.add(rowV); // 把行向量添加到数据向?
        }
        // 创建面板，在该面板中实现了带行标题栏的表?
        final MFixedColumnTable panel = new MFixedColumnTable(columnNameV, tableValueV, 1);
        getContentPane().add(panel, BorderLayout.CENTER); // 把面板添加到窗体中央

    }

    /**
     * 主方?
     *
     * @param args 字符串数?
     */
    public static void main(String[] args) {
        RowTitleTableFrame frame = new RowTitleTableFrame(); // 创建窗体
        frame.setVisible(true); // 显示窗体
    }
}

