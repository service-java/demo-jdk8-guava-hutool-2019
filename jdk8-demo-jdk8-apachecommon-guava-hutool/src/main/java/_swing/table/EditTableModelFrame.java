package _swing.table;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * 创建窗体?
 */
public class EditTableModelFrame extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -6462158531496637367L;
    private DefaultTableModel tableModel; // 定义表格模型对象
    private JTable table; // 定义表格对象
    private JTextField aTextField;
    private JTextField bTextField;

    /**
     * 主方?
     *
     * @param args 字符串数?
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EditTableModelFrame frame = new EditTableModelFrame();
        frame.setVisible(true);
    }

    /**
     * 构?方法，用于初始化组?
     */
    public EditTableModelFrame() {
        super();
        setTitle("维护表格模型");
        setBounds(100, 100, 400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体的默认关闭模?
        final JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        String[] columnNames = {"A", "B"}; // 定义表格列名数组
        String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}}; // 定义表格数据数组
        tableModel = new DefaultTableModel(tableValues, columnNames); // 创建表格模型
        table = new JTable(tableModel); // 创建指定表格模型的表?
        table.setRowSorter(new TableRowSorter<DefaultTableModel>(tableModel)); // 设置表格的排序器
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// 设置表格的?择模式为单?
        table.addMouseListener(new MouseAdapter() { // 为表格添加鼠标事件监听器
            public void mouseClicked(MouseEvent e) { // 发生了点击事?
                int selectedRow = table.getSelectedRow(); // 获得被?中行的索引
                Object oa = tableModel.getValueAt(selectedRow, 0); // 从表格模型中获得指定?
                Object ob = tableModel.getValueAt(selectedRow, 1); // 从表格模型中获得指定?
                aTextField.setText(oa.toString()); // 将获得的值赋值给文本?
                bTextField.setText(ob.toString()); // 将获得的值赋值给文本?
            }
        });
        scrollPane.setViewportView(table);
        final JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.SOUTH); // 把面板添加到窗体下面
        panel.add(new JLabel("A1"));
        aTextField = new JTextField("A4", 5);
        panel.add(aTextField);
        panel.add(new JLabel("B1"));
        bTextField = new JTextField("B4", 5);
        panel.add(bTextField);
        final JButton addButton = new JButton("添加");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 创建表格行数?
                String[] rowValues = {aTextField.getText(), bTextField.getText()};
                tableModel.addRow(rowValues); // 向表格模型中添加??
                int rowCount = table.getRowCount() + 1; // 把表格的总行数加1
                // 文本框设置?为A连接总行数加1的??
                aTextField.setText("A" + rowCount);
                // 文本框设置?为B连接总行数加1的??
                bTextField.setText("B" + rowCount);
            }
        });
        panel.add(addButton);
        final JButton updButton = new JButton("修改");
        updButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // 获得被?中行的索引
                if (selectedRow != -1) { // 判断是否存在被?中?
                    // 修改表格模型当中的指定??
                    tableModel.setValueAt(aTextField.getText(), selectedRow, 0);
                    tableModel.setValueAt(bTextField.getText(), selectedRow, 1);
                }
            }
        });
        panel.add(updButton);
        final JButton delButton = new JButton("删除");
        delButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // 获得被?中行的索引
                if (selectedRow != -1) // 判断是否存在被?中?
                    tableModel.removeRow(selectedRow); // 从表格模型当中删除指定行
            }
        });
        panel.add(delButton);
    }
}

