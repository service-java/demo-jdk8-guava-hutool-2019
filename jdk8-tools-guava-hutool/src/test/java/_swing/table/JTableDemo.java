package _swing.table;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class JTableDemo extends JFrame {

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
                    JTableDemo frame = new JTableDemo();
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
    public JTableDemo() {
        setTitle("使用数组创建表格");// 设置窗体的标?
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体?出时操作
        setBounds(100, 100, 250, 150);// 设置窗体位置和大?
        contentPane = new JPanel();// 创建内容面板
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// 设置面板的边?
        contentPane.setLayout(new BorderLayout(0, 0));// 使用边界布局
        setContentPane(contentPane);// 应用内容面板

        JScrollPane scrollPane = new JScrollPane();// 创建滚动面板
        contentPane.add(scrollPane, BorderLayout.CENTER);// 应用滚动面板
        String[] columnNames = {"A", "B"}; // 定义表格列名数组
        String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}, {"A4", "B4"}, {"A5", "B5"}}; // 定义表格数据数组
        table = new JTable(tableValues, columnNames); // 创建表格
        scrollPane.setViewportView(table);
    }

}

