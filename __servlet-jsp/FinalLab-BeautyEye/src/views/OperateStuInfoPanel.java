package views;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


import db.MySQLDBHelper;


public class OperateStuInfoPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private DefaultTableModel tableModel; // 定义表格模型对象
    private JTable table; // 定义表格对象
    private JPanel jtPanel;
    private JTextField stuId, stuName, stuGender, stuBornDate, chinese, english, math;

    private String[] columnNames; // 定义表格列名数组
    private String[][] tableValues; // 定义表格数据数组
    private ResultSet rs;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public OperateStuInfoPanel() {
        super();

        final JScrollPane scrollPane = new JScrollPane();
        add(scrollPane, BorderLayout.CENTER);

        MySQLDBHelper mysqlHelper = new MySQLDBHelper();
        mysqlHelper.queryDB("select * from stu_info");
        rs = mysqlHelper.getResultSet();

        mysqlHelper.queryDB("select stu_id,name,gender,born_date,chinese,math,english from stu_info");
        columnNames = mysqlHelper.getColsName();
        tableValues = mysqlHelper.getTableData();

        tableModel = new DefaultTableModel(tableValues, columnNames); // 创建表格模型
        table = new JTable(tableModel); // 创建指定表格模型的表?

//	    table.setRowSorter(new TableRowSorter<DefaultTableModel>(tableModel)); // 设置表格的排序器

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// 设置表格的?择模式为单?
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                int tableModelRow = table.convertRowIndexToModel(selectedRow);
                Object o0 = tableModel.getValueAt(tableModelRow, 0);
                Object o1 = tableModel.getValueAt(tableModelRow, 1);
                Object o2 = tableModel.getValueAt(tableModelRow, 2);
                Object o3 = tableModel.getValueAt(tableModelRow, 3);
                Object o4 = tableModel.getValueAt(tableModelRow, 4);
                Object o5 = tableModel.getValueAt(tableModelRow, 5);
                Object o6 = tableModel.getValueAt(tableModelRow, 6);


                stuId.setText(o0.toString());
                stuName.setText(o1.toString());
                stuGender.setText(o2.toString());
                stuBornDate.setText(o3.toString());
                chinese.setText(o4.toString());
                math.setText(o5.toString());
                english.setText(o6.toString());
            }
        });


        scrollPane.setViewportView(table);

        final JPanel panel = new JPanel();
        add(panel, BorderLayout.SOUTH); // 把面板添加到窗体下面

        jtPanel = new JPanel();

        jtPanel.add(new JLabel("学号"));
        stuId = new JTextField("", 5);
        jtPanel.add(stuId);

        jtPanel.add(new JLabel("姓名"));
        stuName = new JTextField("", 5);
        jtPanel.add(stuName);

        jtPanel.add(new JLabel("性别"));
        stuGender = new JTextField("", 5);
        jtPanel.add(stuGender);

        jtPanel.add(new JLabel("生日"));
        stuBornDate = new JTextField("", 5);
        jtPanel.add(stuBornDate);

        jtPanel.add(new JLabel("语文"));
        chinese = new JTextField("", 5);
        jtPanel.add(chinese);

        jtPanel.add(new JLabel("数学"));
        math = new JTextField("", 5);
        jtPanel.add(math);

        jtPanel.add(new JLabel("英语"));
        english = new JTextField("", 5);
        jtPanel.add(english);

        add(jtPanel, BorderLayout.SOUTH);


        final JButton addButton = new JButton("添加");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 创建表格行数?
                String[] rowValues = {stuId.getText()
                        , stuName.getText()
                        , stuGender.getText()
                        , stuBornDate.getText()
                        , chinese.getText()
                        , math.getText()
                        , english.getText()};
                tableModel.addRow(rowValues);

                try {
                    rs.moveToInsertRow();
                    for (int i = 0; i < tableModel.getColumnCount(); i++) {
                        rs.updateString(i + 2, rowValues[i]);
                    }
                    rs.insertRow();
                    JOptionPane.showMessageDialog(null, "成功插入记录");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        });
        panel.add(addButton);

        final JButton updButton = new JButton("修改");
        updButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // 获得被选中行的索引 (table，table
                // model索引从0开始)

                if (selectedRow != -1) { // 判断是否存在被选中行
                    try {
                        rs.absolute(selectedRow + 1);

                        // 修改结果集数据
                        rs.updateInt("stu_id", Integer.parseInt((String) tableModel.getValueAt(selectedRow, 0))); // 学号
                        rs.updateString("name", (String) tableModel.getValueAt(selectedRow, 1));  // 姓名
                        rs.updateInt("gender", Integer.parseInt((String) tableModel.getValueAt(selectedRow, 2))); // 性别
                        rs.updateDate("born_date", java.sql.Date.valueOf((String) tableModel.getValueAt(selectedRow, 3)));
                        rs.updateFloat("chinese", Float.parseFloat((String) tableModel.getValueAt(selectedRow, 4))); // 语文
                        rs.updateFloat("math", Float.parseFloat((String) tableModel.getValueAt(selectedRow, 5))); // 数学
                        rs.updateFloat("english", Float.parseFloat((String) tableModel.getValueAt(selectedRow, 6))); // 英语
                        rs.updateRow();

                        // 更新textField
                        stuId.setText((String) tableModel.getValueAt(selectedRow, 0));
                        stuName.setText((String) tableModel.getValueAt(selectedRow, 1));
                        stuGender.setText((String) tableModel.getValueAt(selectedRow, 2));
                        stuBornDate.setText((String) tableModel.getValueAt(selectedRow, 3));
                        chinese.setText((String) tableModel.getValueAt(selectedRow, 4));
                        math.setText((String) tableModel.getValueAt(selectedRow, 5));
                        english.setText((String) tableModel.getValueAt(selectedRow, 6));
                        JOptionPane.showMessageDialog(null, "更新成功");

                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        panel.add(updButton);

        final JButton delButton = new JButton("删除");
        delButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // 获得被?中行的索引

                try {
                    rs.absolute(selectedRow + 1);
                    if (selectedRow != -1) { // 判断是否存在被选中行
                        tableModel.removeRow(selectedRow); // 从表格模型当中删除指定行
                    }
                    rs.deleteRow();
                    JOptionPane.showMessageDialog(null, "记录成功删除");
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(delButton);
    }
}
