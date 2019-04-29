package views;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import db.MySQLDBHelper;


//@SuppressWarnings("serial")
public class QueryStuInfoPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JPanel jp;
    private JTextArea jt;
    private JButton btn1;

    private DefaultTableModel tableModel; // 定义表格模型对象
    private JTable table; // 定义表格对象
//    private JTextField aTextField;
//    private JTextField bTextField;

    private String[] columnNames; // 定义表格列名数组
    private String[][] tableValues; // 定义表格数据数组

    public QueryStuInfoPanel() {
        // 声名元素
        jp = new JPanel();
        jp.setBounds(41, 34, 613, 194);
        jp.setBorder(BorderFactory.createTitledBorder("查询:"));
        jp.setLayout(null);
        jp.setPreferredSize(new Dimension(400, 300));


        jt = new JTextArea("");
        jt.setBounds(44, 52, 160, 220);
        jt.setLineWrap(true);

        btn1 = new JButton("select");
        btn1.setBounds(244, 180, 100, 25);
//        btn1.addActionListener(this);
        btn1.addActionListener(new SelectBtnListener());

        jp.add(jt);
        jp.add(btn1);

        add(jp);

        final JScrollPane scrollPane = new JScrollPane();
        add(scrollPane, BorderLayout.CENTER);

        MySQLDBHelper mysqlHelper = new MySQLDBHelper();
        mysqlHelper.queryDB("select * from stu_info");
        columnNames = mysqlHelper.getColsName();
        tableValues = mysqlHelper.getTableData();

        tableModel = new DefaultTableModel(tableValues, columnNames); // 创建表格模型
        table = new JTable(tableModel);
        table.setRowSorter(new TableRowSorter<DefaultTableModel>(tableModel)); // 设置表格的排序器
        scrollPane.setViewportView(table);

        setVisible(true); // 这一步貌似要放到??,不然总出现bug
    }

    public class SelectBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {

            MySQLDBHelper mysqlHelper = new MySQLDBHelper();
            mysqlHelper.queryDB(jt.getText());
            columnNames = mysqlHelper.getColsName();
            tableValues = mysqlHelper.getTableData();
            tableModel.setDataVector(tableValues, columnNames); // 创建表格模型
        }
    }

}

