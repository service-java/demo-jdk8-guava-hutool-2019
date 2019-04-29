package views;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import db.MySQLDBHelper;
import components.RangeSlider;

public class GridBagLayoutTest2 extends JPanel {
    private static final long serialVersionUID = 1L;

    private JTextField stuId, stuName;
    private RangeSlider chineseSlider, mathSlider, englishSlider;
    private JButton selectBtn, resetBtn;
    private JLabel chineseTip, mathTip, englishTip;
    private ButtonGroup group;
    private JRadioButton bothGender, male, female;
    private int selectedGender = 2;

    public UtilDateModel model;
    public JDatePanelImpl datePanel;
    public JDatePickerImpl datePicker;

    private DefaultTableModel tableModel; // 定义表格模型对象
    private JTable table; // 定义表格对象
    private String[] columnNames; // 定义表格列名数组
    private String[][] tableValues; // 定义表格数据数组

    public GridBagLayoutTest2() {
        super();

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints s = new GridBagConstraints();
        s.fill = GridBagConstraints.BOTH; // 大于组件的时候充满

        // 查询结果
        JScrollPane scrollPane = new JScrollPane();
        MySQLDBHelper mysqlHelper = new MySQLDBHelper();
        mysqlHelper.queryDB("select * from stu_info");
        columnNames = mysqlHelper.getColsName();
        tableValues = mysqlHelper.getTableData();

        tableModel = new DefaultTableModel(tableValues, columnNames); // 创建表格模型
        table = new JTable(tableModel);
        table.setRowSorter(new TableRowSorter<DefaultTableModel>(tableModel)); // 设置表格的排序器
        scrollPane.setViewportView(table);

        setVisible(true);

        s.gridwidth = 17;
        s.gridheight = 16;
        s.weightx = 0.7;
        s.weighty = 1;
        layout.setConstraints(scrollPane, s);
        scrollPane.setPreferredSize(new Dimension(560, 500));
        this.add(scrollPane);


        // 学号
        JPanel p2 = new JPanel();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p2, s);
        this.add(p2);

        JLabel lb1 = new JLabel("  学号    ", SwingConstants.RIGHT);
        lb1.setPreferredSize(new Dimension(40, 23));
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(lb1, s);
        this.add(lb1);

        stuId = new JTextField(10);
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0;
        layout.setConstraints(stuId, s);
        this.add(stuId);

        // 姓名
        JPanel p3 = new JPanel();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p3, s);
        this.add(p3);

        JLabel lb2 = new JLabel("  姓名    ", SwingConstants.RIGHT);
        lb1.setPreferredSize(new Dimension(40, 23));
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(lb2, s);
        this.add(lb2);

        stuName = new JTextField(10);
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0;
        layout.setConstraints(stuName, s);
        this.add(stuName);

        // 性别
        JPanel p4 = new JPanel();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p4, s);
        this.add(p4);

        JLabel lb3 = new JLabel("  性别    ", SwingConstants.RIGHT);
        lb1.setPreferredSize(new Dimension(40, 23));
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(lb3, s);
        this.add(lb3);

//        stuGender = new JTextField(10);
//        s.gridwidth = 0;
//        s.gridheight = 1;
//        s.weightx = 0.3; 
//        s.weighty = 0;
//        layout.setConstraints(stuGender, s);
//        this.add(stuGender);

        bothGender = new JRadioButton("不限");
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(bothGender, s);
        this.add(bothGender);

        male = new JRadioButton("男");
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(male, s);
        this.add(male);

        female = new JRadioButton("女");
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(female, s);
        this.add(female);

        group = new ButtonGroup();
        group.add(bothGender);
        group.add(male);
        group.add(female);
        bothGender.addActionListener(new RadioButtonListener());
        male.addActionListener(new RadioButtonListener());
        female.addActionListener(new RadioButtonListener());
        bothGender.setSelected(true);

        // 出生日期
        // come from https://sourceforge.net/projects/jdatepicker/
        // https://github.com/JDatePicker/JDatePicker
        // 用法： http://www.codejava.net/java-se/swing/how-to-use-jdatepicker-to-display-calendar-component
        JPanel p5 = new JPanel();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p5, s);
        this.add(p5);

        JLabel lb4 = new JLabel("  生日    ", SwingConstants.RIGHT);
        lb4.setPreferredSize(new Dimension(40, 23));
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(lb4, s);
        this.add(lb4);

        model = new UtilDateModel();
        datePanel = new JDatePanelImpl(model);
        datePicker = new JDatePickerImpl(datePanel);
//        model.setDate(1990, 8, 24); // 初始化
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0;
        layout.setConstraints(datePicker, s);
        this.add((JComponent) datePicker);


//        stuBornDate = new JTextField(10);
//        s.gridwidth = 0;
//        s.gridheight = 1;
//        s.weightx = 0.3; 
//        s.weighty = 0;
//        layout.setConstraints(stuBornDate, s);
//        this.add(stuBornDate);

        // 语文
        JPanel p6 = new JPanel();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p6, s);
        this.add(p6);

        JLabel lb5 = new JLabel("  语文    ", SwingConstants.RIGHT);
        lb5.setPreferredSize(new Dimension(40, 23));
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(lb5, s);
        this.add(lb5);

        chineseTip = new JLabel("0<=g<=100");
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(chineseTip, s);
        this.add(chineseTip);


        chineseSlider = new RangeSlider();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(chineseSlider, s);
        add(chineseSlider);
        chineseSlider.setPreferredSize(new Dimension(240, 40));
        chineseSlider.setMinimum(0);
        chineseSlider.setMaximum(100);
        chineseSlider.setValue(0);
        chineseSlider.setUpperValue(100);
        chineseSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                chineseTip.setText(chineseSlider.getValue() + "<=g<=" + chineseSlider.getUpperValue());
            }
        });


        // 数学
        JPanel p7 = new JPanel();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p7, s);
        this.add(p7);

        JLabel lb6 = new JLabel("  数学    ", SwingConstants.RIGHT);
        lb6.setPreferredSize(new Dimension(40, 23));
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(lb6, s);
        this.add(lb6);

        mathTip = new JLabel("0<=g<=100");
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(mathTip, s);
        this.add(mathTip);

        mathSlider = new RangeSlider();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(mathSlider, s);
        add(mathSlider);
        mathSlider.setPreferredSize(new Dimension(240, 40));
        mathSlider.setMinimum(0);
        mathSlider.setMaximum(100);
        mathSlider.setValue(0);
        mathSlider.setUpperValue(100);
        mathSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                mathTip.setText(mathSlider.getValue() + "<=g<=" + mathSlider.getUpperValue());
            }
        });

        // 英语
        JPanel p8 = new JPanel();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.1;
        layout.setConstraints(p8, s);
        this.add(p8);

        JLabel lb7 = new JLabel("  英语    ", SwingConstants.RIGHT);
        lb7.setPreferredSize(new Dimension(40, 23));
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(lb7, s);
        this.add(lb7);

        englishTip = new JLabel("0<=g<=100");
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(englishTip, s);
        this.add(englishTip);

        englishSlider = new RangeSlider();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.2;
        s.weighty = 0;
        layout.setConstraints(englishSlider, s);
        this.add(englishSlider);
        englishSlider.setPreferredSize(new Dimension(240, 40));
        englishSlider.setMinimum(0);
        englishSlider.setMaximum(100);
        englishSlider.setValue(0);
        englishSlider.setUpperValue(100);
        englishSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                englishTip.setText(englishSlider.getValue() + "<=g<=" + englishSlider.getUpperValue());
            }
        });

        // 按钮
        JPanel p9 = new JPanel();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.3;
        s.weighty = 0.3;
        layout.setConstraints(p9, s);
        this.add(p9);

        JPanel p10 = new JPanel();
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0;
        s.weighty = 0;
        layout.setConstraints(p10, s);
        this.add(p10);

        selectBtn = new JButton("查找");
        selectBtn.setPreferredSize(new Dimension(60, 33));
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(selectBtn, s);
        this.add(selectBtn);
        selectBtn.addActionListener(new BtnListener());

        resetBtn = new JButton("重置");
        resetBtn.setPreferredSize(new Dimension(60, 33));
        s.gridwidth = 1;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(resetBtn, s);
        this.add(resetBtn);
        resetBtn.addActionListener(new BtnListener());

        JPanel p11 = new JPanel();
        s.gridwidth = 0;
        s.gridheight = 1;
        s.weightx = 0.1;
        s.weighty = 0;
        layout.setConstraints(p11, s);
        this.add(p11);

    }

    public class RadioButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == male) {
                selectedGender = 1;
            } else if (e.getSource() == female) {
                selectedGender = 0;
            } else if (e.getSource() == bothGender) {
                selectedGender = 2;
            }
        }
    }

    public class BtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == selectBtn) {
                MySQLDBHelper mysqlHelper = new MySQLDBHelper();
                String sql = "select * from stu_info where gender != 9 "; // 为了and

                // 如果不是
                if (!stuId.getText().trim().equals("")) {
                    sql += "and stu_id like '" + stuId.getText() + "%' ";
                }

                if (!stuName.getText().trim().equals("")) {
                    sql += " and name like '" + stuName.getText() + "%' ";
                }

                if (selectedGender != 2) {
                    sql += " and gender = " + selectedGender + " ";
                }

                try {
                    Date selectedDate = (Date) datePicker.getModel().getValue();
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String reportDate = df.format(selectedDate);
                    sql += " and born_date = '" + reportDate + "' ";
                } catch (Exception e1) {
                    // 一般是未初始化
                    sql += " ";
                }

                sql += " and chinese >= " + chineseSlider.getValue() + " ";
                sql += " and chinese <= " + chineseSlider.getUpperValue() + " ";
                sql += " and math >= " + mathSlider.getValue() + " ";
                sql += " and math <= " + mathSlider.getUpperValue() + " ";
                sql += " and english >= " + englishSlider.getValue() + " ";
                sql += " and english <= " + englishSlider.getUpperValue() + " ";

//				columnNames = null;
//				tableValues = null;

                mysqlHelper.queryDB(sql);
                columnNames = mysqlHelper.getColsName();
                tableValues = mysqlHelper.getTableData();

                // 判断查询结果是否为空集
                if (mysqlHelper.getTableData().length == 0 || tableValues == null) {
                    JOptionPane.showMessageDialog(null, "查询结果为空");
                } else {
                    tableModel.setDataVector(tableValues, columnNames); // 创建表格模型
                }

                mysqlHelper.closeConnection();

            } else if (e.getSource() == resetBtn) {
                stuName.setText("");
                stuId.setText("");
                bothGender.setSelected(true);

                selectedGender = 2; // 记得值的初始化

                chineseSlider.setValue(0);
                chineseSlider.setUpperValue(100);
                chineseTip.setText("0<=g<=100");
                mathSlider.setValue(0);
                mathSlider.setUpperValue(100);
                mathTip.setText("0<=g<=100");
                englishSlider.setValue(0);
                englishSlider.setUpperValue(100);
                englishTip.setText("0<=g<=100");
            }


        }
    }

}
