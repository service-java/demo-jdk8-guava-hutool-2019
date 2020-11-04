package _ch6_swing.table;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TableModelEventFrame extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -1439361565492730724L;
    private DefaultTableModel tableModel; // 定义表格模型对象
    private JTable table; // 定义表格对象

    public TableModelEventFrame() {
        super();
        setTitle("表格模型事件"); // 设置窗体标题
        setBounds(100, 100, 300, 160); // 设置窗体的位置和大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体的默认关闭模?
        final JScrollPane scrollPane = new JScrollPane(); // 创建滚动面板
        getContentPane().add(scrollPane, BorderLayout.CENTER); // 在窗体中央添加滚动面?
        String[] columnNames = {"A", "B"}; // 定义表格列名数组
        String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}}; // 定义表格数据数组
        tableModel = new DefaultTableModel(tableValues, columnNames); // 创建表格模型
        tableModel.addTableModelListener(new TableModelListener() { // 为表格添加模型事件监听器
            public void tableChanged(TableModelEvent e) { // 表格内容改变执行模型事件
                // 判断是否在表格模型中添加了新行或新列
                if (e.getType() == TableModelEvent.INSERT) {
                    // 如果添加了新行或新列，则输出信息
                    System.out.println("你单击的是?添加?按?");
                }
                // 判断是否对表格模型中的行或列进行了编辑修?
                if (e.getType() == TableModelEvent.UPDATE) {
                    // 如果对表格模型中的行或列进行了编辑修改，则输出信?
                    System.out.println("你单击的是?编辑?按钮或“修改?按?");
                }
                // 判断是否删除了表格模型中的行或列
                if (e.getType() == TableModelEvent.DELETE) {
                    // 如果删除了表格模型中的行或列，则输出信息
                    System.out.println("你单击的是?删除?按?");
                }
            }
        });
        table = new JTable(tableModel); // 创建指定表格模型的表?
        table.setRowSorter(new TableRowSorter<DefaultTableModel>(tableModel)); // 设置表格的排序器
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 设置表格的?择模式为单?
        scrollPane.setViewportView(table); // 表表格添加到滚动面板视图
        final JPanel panel = new JPanel(); // 创建面板
        getContentPane().add(panel, BorderLayout.SOUTH); // 把面板添加到窗体下面
        final JButton editButton = new JButton("编辑"); // 创建编辑按钮
        editButton.addActionListener(new ActionListener() { // 为编辑按钮添加动作监听器
            public void actionPerformed(ActionEvent e) { // 单击按钮执行动作事件
                int selectedRow = table.getSelectedRow(); // 获得被?中行的索引
                int selectedColumn = table.getSelectedColumn(); // 获得选中列的索引
                if (selectedRow != -1 && selectedColumn != -1) { // 判断是否存在被?中?
                    // 通知?有监听器对?择的单元格进行了编辑操?
                    tableModel.fireTableCellUpdated(selectedRow, selectedColumn);
                }
            }
        });
        panel.add(editButton); // 把编辑按钮添加到面板?
        final JButton addButton = new JButton("添加"); // 创建添加按钮
        addButton.addActionListener(new ActionListener() { // 为添加按钮添加动作监听器
            public void actionPerformed(ActionEvent e) { // 单击按钮执行动作事件
                int selectedRow = table.getSelectedRow(); // 获得被?中行的索引
                if (selectedRow != -1) { // 判断是否存在被?中?
                    // 通知?有监听器在?择行的索引位置添加了数据行
                    tableModel.fireTableRowsInserted(selectedRow, selectedRow);
                }
            }
        });
        panel.add(addButton); // 把添加按钮添加到面板?
        final JButton updButton = new JButton("修改"); // 创建修改按钮
        updButton.addActionListener(new ActionListener() { // 为修改按钮添加动作监听器
            public void actionPerformed(ActionEvent e) { // 单击按钮执行动作事件
                int selectedRow = table.getSelectedRow(); // 获得被?中行的索引
                if (selectedRow != -1) { // 判断是否存在被?中?
                    // 通知?有监听器修改了?择行索引位置的数据?
                    tableModel.fireTableRowsUpdated(selectedRow, selectedRow);
                }
            }
        });
        panel.add(updButton); // 把修改按钮添加到面板?
        final JButton delButton = new JButton("删除"); // 创建删除按钮
        delButton.addActionListener(new ActionListener() { // 为删除按钮添加动作监听器
            public void actionPerformed(ActionEvent e) { // 单击按钮执行动作事件
                int selectedRow = table.getSelectedRow(); // 获得被?中行的索引
                if (selectedRow != -1) { // 判断是否存在被?中?
                    // 通知?有监听器删除了?择行索引位置的数据?
                    tableModel.fireTableRowsDeleted(selectedRow, selectedRow);
                }
            }
        });
        panel.add(delButton); // 把删除按钮添加到面板?
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        TableModelEventFrame frame = new TableModelEventFrame(); // 创建窗体
        frame.setVisible(true); // 显示窗体
    }
}

