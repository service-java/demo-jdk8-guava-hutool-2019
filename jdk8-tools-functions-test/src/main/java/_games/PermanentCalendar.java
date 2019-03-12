package _games;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class PermanentCalendar extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -5939002611918837793L;
    private JPanel contentPane;
    private JTable table;
    private JLabel currentMonthLabel;
    private Calendar calendar = new GregorianCalendar();

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
                    PermanentCalendar frame = new PermanentCalendar();
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
    public PermanentCalendar() {
        setTitle("\u516C\u5386\u4E07\u5E74\u5386");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 282);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel YMPanel = new JPanel();
        contentPane.add(YMPanel, BorderLayout.NORTH);
        YMPanel.setLayout(new GridLayout(1, 3, 5, 10));

        JPanel lastMonthPanel = new JPanel();
        YMPanel.add(lastMonthPanel);

        JButton lastMonthButton = new JButton("\u4E0A\u4E2A\u6708");
        lastMonthButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        lastMonthButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_lastMonthButton_actionPerformed(e);
            }
        });
        lastMonthPanel.add(lastMonthButton);

        JPanel currentMonthPanel = new JPanel();
        YMPanel.add(currentMonthPanel);
        currentMonthPanel.setLayout(new BoxLayout(currentMonthPanel, BoxLayout.X_AXIS));

        currentMonthLabel = new JLabel("");
        currentMonthLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        currentMonthLabel.setHorizontalAlignment(SwingConstants.CENTER);
        currentMonthPanel.add(currentMonthLabel);

        JPanel nextMonthPanel = new JPanel();
        YMPanel.add(nextMonthPanel);

        JButton nextMonthButton = new JButton("\u4E0B\u4E2A\u6708");
        nextMonthButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        nextMonthButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_nextMonthButton_actionPerformed(e);
            }
        });
        nextMonthPanel.add(nextMonthButton);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        table.getTableHeader().setFont(new Font("微软雅黑", Font.PLAIN, 20));
        table.setRowHeight(25);
        table.setCellSelectionEnabled(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(table);

        currentMonthLabel.setText(updateLabel(0));
        updateTable(calendar);
    }

    private void updateTable(Calendar calendar) {
        String[] weeks = new DateFormatSymbols().getShortWeekdays();// 获得表示星期的字符串数组
        String[] realWeeks = new String[7];// 新建一个数组来保存截取后的字符串
        for (int i = 1; i < weeks.length; i++) {// weeks数组第一个元素是空字符串，因此从1开始循环
            realWeeks[i - 1] = weeks[i].substring(2, 3);// 获得字符串的最后一个字符
        }
        int today = calendar.get(Calendar.DATE);// 获得当前日期
        int monthDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);// 获得当前月的天数
        calendar.set(Calendar.DAY_OF_MONTH, 1); // 将时间设置为本月第一天
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);// 获得本月第一天是星期几
        int firstDay = calendar.getFirstDayOfWeek(); // 获得当前地区星期的起始日
        int whiteDay = weekday - firstDay; // 这个月第一个星期有几天被上个月占用
        Object[][] days = new Object[6][7];// 新建一个二维数组来保存当前月的各天
        for (int i = 1; i <= monthDays; i++) {// 遍历当前月的所有天并将其添加的二维数组中
            days[(i - 1 + whiteDay) / 7][(i - 1 + whiteDay) % 7] = i;
        }// 数组的第一维表示一个月中各个星期，第二位表示一个星期中各个天
        DefaultTableModel model = (DefaultTableModel) table.getModel();// 获得当前表格的模型
        model.setDataVector(days, realWeeks);// 给表格模型设置表头和表体
        table.setModel(model);// 更新表格模型
        table.setRowSelectionInterval(0, (today - 1 + whiteDay) / 7);// 设置选择的行
        table.setColumnSelectionInterval(0, (today - 1 + whiteDay) % 7);// 设置选择的列
    }

    private String updateLabel(int increment) {
        calendar.add(Calendar.MONTH, increment);// 将当前月份增加increment月
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月");// 设置字符串格式
        return formatter.format(calendar.getTime());// 获得指定格式的字符串
    }

    protected void do_lastMonthButton_actionPerformed(ActionEvent e) {
        currentMonthLabel.setText(updateLabel(-1));
        updateTable(calendar);
    }

    protected void do_nextMonthButton_actionPerformed(ActionEvent e) {
        currentMonthLabel.setText(updateLabel(1));
        updateTable(calendar);
    }
}

