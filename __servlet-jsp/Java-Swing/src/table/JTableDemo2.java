package table;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class JTableDemo2 extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -3450208259420253198L;
    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JTableDemo2 frame = new JTableDemo2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public JTableDemo2() {
        setTitle("使用向量 创建表格");// 设置窗体的标?
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体?出时操作
        setBounds(100, 100, 250, 150);// 设置窗体位置和大?
        contentPane = new JPanel();// 创建内容面板
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// 设置面板的边?
        contentPane.setLayout(new BorderLayout(0, 0));// 使用边界布局
        setContentPane(contentPane);// 应用内容面板
        JScrollPane scrollPane = new JScrollPane();// 创建滚动面板
        contentPane.add(scrollPane, BorderLayout.CENTER);// 应用滚动面板
        Vector<String> columnNameV = new Vector<String>(); // 定义表格列名向量
        columnNameV.add("A"); // 添加列名
        columnNameV.add("B"); // 添加列名
        Vector<Vector<String>> tableValueV = new Vector<Vector<String>>(); // 定义表格数据向量
        for (int row = 1; row < 6; row++) {
            Vector<String> rowV = new Vector<String>(); // 定义表格行向?
            rowV.add("A" + row); // 添加单元格数?
            rowV.add("B" + row); // 添加单元格数?
            tableValueV.add(rowV); // 将表格行向量添加到表格数据向?
        }
        table = new JTable(tableValueV, columnNameV); // 创建指定列名和数据的表格
        scrollPane.setViewportView(table);
    }

}
