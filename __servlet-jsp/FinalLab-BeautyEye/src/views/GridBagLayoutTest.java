package views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import util.FormatCheckHelper;
import db.MySQLDBHelper;

public class GridBagLayoutTest extends JPanel {

    private JTextField stuId, stuName, stuGender, stuBornDate, chinese, math, english;
    private JButton updateBtn, delBtn, addBtn;

    private DefaultTableModel tableModel; // 定义表格模型对象
    private JTable table; // 定义表格对象
    private String[] columnNames; // 定义表格列名数组
    private String[][] tableValues; // 定义表格数据数组
    private ResultSet rs;

    private static final long serialVersionUID = 1L;
//	public static void main(String args[]) {
//        new GridBagLayoutTest();
//    }

    public GridBagLayoutTest() {
        super();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
        JPanel p9 = new JPanel();
        JPanel p10 = new JPanel();
        JPanel p11 = new JPanel();

        updateBtn = new JButton("保存修改");
        updateBtn.setPreferredSize(new Dimension(60, 23));
        delBtn = new JButton("删除");
        updateBtn.setPreferredSize(new Dimension(60, 23));
        addBtn = new JButton("新增");
        updateBtn.setPreferredSize(new Dimension(60, 23));

        JLabel lupdateBtn = new JLabel("学号    ", SwingConstants.RIGHT);
        lupdateBtn.setPreferredSize(new Dimension(60, 23));
        JLabel ldelBtn = new JLabel("姓名    ", SwingConstants.RIGHT);
        ldelBtn.setPreferredSize(new Dimension(60, 25));
        JLabel laddBtn = new JLabel("性别    ", SwingConstants.RIGHT);
        laddBtn.setPreferredSize(new Dimension(60, 25));
        JLabel lb4 = new JLabel("出生日期    ", SwingConstants.RIGHT);
        lb4.setPreferredSize(new Dimension(60, 25));
        JLabel lb5 = new JLabel("语文    ", SwingConstants.RIGHT);
        lb5.setPreferredSize(new Dimension(60, 25));
        JLabel lb6 = new JLabel("数学    ", SwingConstants.RIGHT);
        lb6.setPreferredSize(new Dimension(60, 25));
        JLabel lb7 = new JLabel("英语    ", SwingConstants.RIGHT);
        lb7.setPreferredSize(new Dimension(60, 25));

        stuId = new JTextField(10);
        stuName = new JTextField(10);
        stuGender = new JTextField(10);
        stuBornDate = new JTextField(10);
        chinese = new JTextField(10);
        math = new JTextField(10);
        english = new JTextField(10);

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints s = new GridBagConstraints();
        s.fill = GridBagConstraints.BOTH; // 大于组件的时候充满


        final JScrollPane scrollPane = new JScrollPane();
//	    add(scrollPane, BorderLayout.CENTER);

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
//	    		Object o0 = tableModel.getValueAt(tableModelRow, 0); 
                Object o1 = tableModel.getValueAt(tableModelRow, 1);
                Object o2 = tableModel.getValueAt(tableModelRow, 2);
                Object o3 = tableModel.getValueAt(tableModelRow, 3);
                Object o4 = tableModel.getValueAt(tableModelRow, 4);
                Object o5 = tableModel.getValueAt(tableModelRow, 5);
                Object o6 = tableModel.getValueAt(tableModelRow, 6);

//	    		stuId.setText(o0.toString()); 
                stuName.setText(o1.toString());
                stuGender.setText(o2.toString());
                stuBornDate.setText(o3.toString());
                chinese.setText(o4.toString());
                math.setText(o5.toString());
                english.setText(o6.toString());
            }
        });

//	    final JButton addBtn = new JButton("添加");
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 创建表格行数?
                String[] rowValues = {stuId.getText()
                        , stuName.getText()
                        , stuGender.getText()
                        , stuBornDate.getText()
                        , chinese.getText()
                        , math.getText()
                        , english.getText()};

                String genderType = stuGender.getText();
                if (FormatCheckHelper.isStrToIntOK(stuId.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "新增失败,注意学号为int,最好不要重复");
                } else if (!(genderType.equals("1")
                        || genderType.equals("2")
                        || genderType.equals("0"))) {
                    JOptionPane.showMessageDialog(null, "新增失败,性别只能为 0/1");
                } else if (FormatCheckHelper.isScoreInRange(chinese.getText(), 0f, 100f) == false) {
                    JOptionPane.showMessageDialog(null, "新增失败,请注意 语文 项");
                } else if (FormatCheckHelper.isScoreInRange(math.getText(), 0f, 100f) == false) {
                    JOptionPane.showMessageDialog(null, "新增失败,请注意 数学 项");
                } else if (FormatCheckHelper.isScoreInRange(english.getText(), 0f, 100f) == false) {
                    JOptionPane.showMessageDialog(null, "新增失败,请注意 英语 项");
                } else if (FormatCheckHelper.isDateType(stuBornDate.getText()) == false) {
                    JOptionPane.showMessageDialog(null, "新增失败,请注意出生日期格式");
                } else {
                    // 数据库和table新增一行
                    tableModel.addRow(rowValues);
                    try {
                        rs.moveToInsertRow();
                        for (int i = 0; i < tableModel.getColumnCount(); i++) {
                            rs.updateString(i + 2, rowValues[i]);
                        }
                        rs.insertRow();
                        JOptionPane.showMessageDialog(null, "成功插入记录");

                    } catch (SQLException e1) {
                        JOptionPane.showMessageDialog(null, "新增失败,其他异常,例如分数为float为浮点数等");
                    }

                }

            }
        });

        updateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow(); // 获得被选中行的索引 (table，table
                // model索引从0开始)

                if (selectedRow != -1) { // 判断是否存在被选中行

                    String genderType = stuGender.getText();
                    // 这里存在一个bug, 有时会更新失败
                    // 现已修复, 学号应该来自table,而不是文本框，其他的因为已经选中，可以读取来判断
                    if (FormatCheckHelper.isStrToIntOK((String) tableModel.getValueAt(selectedRow, 0)) == false) {
                        JOptionPane.showMessageDialog(null, "更新失败,注意学号为int等信息");
                        updateTable();
                    } else if (!(genderType.equals("1")
                            || genderType.equals("2")
                            || genderType.equals("0"))) {
                        JOptionPane.showMessageDialog(null, "更新失败,性别只能为 0/1");
                        updateTable();
                    } else if (FormatCheckHelper.isScoreInRange(chinese.getText(), 0f, 100f) == false) {
                        JOptionPane.showMessageDialog(null, "更新失败,请注意 语文 项");
                        updateTable();
                    } else if (FormatCheckHelper.isScoreInRange(math.getText(), 0f, 100f) == false) {
                        JOptionPane.showMessageDialog(null, "更新失败,请注意 数学 项");
                        updateTable();
                    } else if (FormatCheckHelper.isScoreInRange(english.getText(), 0f, 100f) == false) {
                        JOptionPane.showMessageDialog(null, "更新失败,请注意 英语 项");
                        updateTable();
                    } else if (FormatCheckHelper.isDateType(stuBornDate.getText()) == false) {
                        JOptionPane.showMessageDialog(null, "更新失败,请注意出生日期格式");
                        updateTable();
                    } else {

                        // 更新数据
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
                            JOptionPane.showMessageDialog(null, "更新失败,其他异常, 例如分数为float为浮点数等");
                        }
                    }


                }
            }
        });

//	    final JButton delBtn = new JButton("删除");
        delBtn.addActionListener(new ActionListener() {
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
                    JOptionPane.showMessageDialog(null, "删除失败,其他异常,请不要作死！");
                }
            }
        });


        scrollPane.setViewportView(table);
        s.gridwidth = 5;
        s.gridheight = 15;
        s.weightx = 0.7;
        s.weighty = 1.0;
        scrollPane.setPreferredSize(new Dimension(460, 500));
        layout.setConstraints(scrollPane, s);
        this.add(scrollPane);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p2, s);
        this.add(p2);

        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(lupdateBtn, s);
        this.add(lupdateBtn);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(stuId, s);
        this.add(stuId);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p3, s);
        this.add(p3);

        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(ldelBtn, s);
        this.add(ldelBtn);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(stuName, s);
        this.add(stuName);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p4, s);
        this.add(p4);

        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(laddBtn, s);
        this.add(laddBtn);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(stuGender, s);
        this.add(stuGender);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p5, s);
        this.add(p5);

        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(lb4, s);
        this.add(lb4);


        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(stuBornDate, s);
        this.add(stuBornDate);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p6, s);
        this.add(p6);

        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(lb5, s);
        this.add(lb5);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(chinese, s);
        this.add(chinese);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p7, s);
        this.add(p7);

        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(lb6, s);
        this.add(lb6);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(math, s);
        this.add(math);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p8, s);
        this.add(p8);

        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(lb7, s);
        this.add(lb7);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(english, s);
        this.add(english);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.3;
        layout.setConstraints(p9, s);
        this.add(p9);

        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0;
        layout.setConstraints(p10, s);
        this.add(p10);

        s.gridwidth = 2;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(updateBtn, s);
        this.add(updateBtn);

        s.gridwidth = 2;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(delBtn, s);
        this.add(delBtn);

        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(p11, s);
        this.add(p11);

        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(addBtn, s);
        this.add(addBtn);
        this.setVisible(true);
    }

    // 更新失败以后刷新table 
    public void updateTable() {
        MySQLDBHelper mysqlHelper = new MySQLDBHelper();
        mysqlHelper.queryDB("select * from stu_info");
        rs = mysqlHelper.getResultSet();

        mysqlHelper.queryDB("select stu_id,name,gender,born_date,chinese,math,english from stu_info");
        columnNames = mysqlHelper.getColsName();
        tableValues = mysqlHelper.getTableData();
        tableModel.setDataVector(tableValues, columnNames); // 创建表格模型

        stuId.setText("");
        stuName.setText("");
        stuGender.setText("");
        stuBornDate.setText("");
        chinese.setText("");
        math.setText("");
        english.setText("");
    }


}