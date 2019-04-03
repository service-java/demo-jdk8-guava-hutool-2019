package table;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import tree.FenseRenderer;

public class FenseTable extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 4035732390683420335L;
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
                    FenseTable frame = new FenseTable();
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
    public FenseTable() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                do_this_windowActivated(e);
            }
        });
        setTitle("\u81EA\u5B9A\u4E49\u6805\u680F\u6548\u679C\u7684\u8868\u683C");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        table.setRowHeight(30);
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        header.setPreferredSize(new Dimension(header.getWidth(), 35));
        scrollPane.setViewportView(table);
    }

    protected void do_this_windowActivated(WindowEvent e) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();// 获得表格模型
        model.setRowCount(0);// 清空表格中的数据
        model.setColumnIdentifiers(new Object[]{"书名", "出版?", "出版时间", "丛书类别", "定价"});// 增加?行数?
        model.addRow(new Object[]{"Java从入门到精?（?2版）", "清华大学出版?", "2010-07-01", "软件工程师入门丛?", "59.8?"});// 增加?行数?
        model.addRow(new Object[]{"PHP从入门到精?（?2版）", "清华大学出版?", "2010-07-01", "软件工程师入门丛?", "69.8?"});// 增加?行数?
        model.addRow(new Object[]{"Visual Basic从入门到精?（?2版）", "清华大学出版?", "2010-07-01", "软件工程师入门丛?", "69.8?"});// 增加?行数?
        model.addRow(new Object[]{"Visual C++从入门到精?（?2版）", "清华大学出版?", "2010-07-01", "软件工程师入门丛?", "69.8?"});// 增加?行数?
        table.setModel(model);// 设置表格模型
        table.setDefaultRenderer(Object.class, new FenseRenderer());// 设置新的渲染?
    }

}

