package _ch6_swing.table;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class JTableDemo3 extends JFrame {

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
                    JTableDemo3 frame = new JTableDemo3();
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
    public JTableDemo3() {
        setTitle("\u652F\u6301\u6392\u5E8F\u7684\u8868\u683C");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 160);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        String[] columnNames = {"A", "B"}; // 定义表格模型的列名数?
        String[][] values = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}, {"A4", "B4"}, {"A5", "B5"}}; // 定义表格模型的数据数?
        // 按照数组values指定的数据和数组columnNames指定的列名创建一个表格模?
        DefaultTableModel tableModel = new DefaultTableModel(values, columnNames);
        table = new JTable(tableModel); // 创建表格
        table.setRowSorter(new TableRowSorter<DefaultTableModel>(tableModel)); // 设置表格排序?

        scrollPane.setViewportView(table);
    }

}

