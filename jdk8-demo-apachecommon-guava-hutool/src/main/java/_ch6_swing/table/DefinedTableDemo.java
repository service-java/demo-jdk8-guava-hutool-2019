package _ch6_swing.table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class DefinedTableDemo extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 2261131570553903421L;
    private JTable table;

    public static void main(String args[]) {
        DefinedTableDemo frame = new DefinedTableDemo(); // 创建窗体
        frame.setVisible(true); // 显示窗体
    }

    public DefinedTableDemo() {
        setTitle("定制表格窗体"); // 设置窗体标题
        setBounds(100, 100, 250, 200); // 设置窗体的位置和大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体的默认关闭模?
        final JScrollPane scrollPane = new JScrollPane(); // 创建滚动面板
        getContentPane().add(scrollPane, BorderLayout.CENTER); // 在窗体中央添加滚动面?
        // 创建表格列名数组
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("A");
        columnNames.add("B");
        columnNames.add("C");
        columnNames.add("D");
        Vector<Vector<String>> rowValues = new Vector<Vector<String>>();
        for (int i = 1; i < 6; i++) {
            Vector<String> rowValue = new Vector<String>();
            rowValue.add("A" + i);
            rowValue.add("B" + i);
            rowValue.add("C" + i);
            rowValue.add("D" + i);
            rowValues.add(rowValue);
        }

        table = new MTable(rowValues, columnNames);
        // 关闭表格列的自动调整功能，这样就能产生水平滚动条了，否则只能产生垂直滚动?
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // 选择模式设置为可以连续?择多行
        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        table.setSelectionBackground(Color.YELLOW); // 被?择行的背景色为黄色
        table.setSelectionForeground(Color.RED); // 被?择行的前景色为红色
        table.setRowHeight(30); // 表格的行高为30像素
        scrollPane.setViewportView(table); // 把表格添加到滚动面板?
    }

    /**
     * 创建内部类，该内部类继承自JTable类成为表?
     *
     * @author zhang zhen kun
     */
    private class MTable extends JTable {
        /**
         *
         */
        private static final long serialVersionUID = 2213676529544788264L;

        // 实现自己的表格类
        // 重写JTable类的构?方?
        public MTable(Vector<Vector<String>> rowData, Vector<String> columnNames) {
            super(rowData, columnNames); // 调用父类的构造方?
        }

        // 重写JTable类的getTableHeader()方法
        public JTableHeader getTableHeader() { // 定义表格?
            JTableHeader tableHeader = super.getTableHeader(); // 获得表格头对?
            tableHeader.setReorderingAllowed(false); // 设置表格列不可重?
            DefaultTableCellRenderer hr = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer(); // 获得表格头的单元格对?
            hr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER); // 设置列名居中显示
            return tableHeader;
        }

        // 重写JTable类的getDefaultRenderer(Class<?> columnClass)方法
        public TableCellRenderer getDefaultRenderer(Class<?> columnClass) { // 定义单元?
            DefaultTableCellRenderer cr = (DefaultTableCellRenderer) super.getDefaultRenderer(columnClass); // 获得表格的单元格对象
            cr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER); // 设置单元格内容居?
            return cr;
        }

        // 重写JTable类的isCellEditable(int row, int column)方法
        public boolean isCellEditable(int row, int column) { // 表格不可编辑
            return false;
        }
    }
}

