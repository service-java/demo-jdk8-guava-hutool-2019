package views;

import sqlservertest.BatchDelete;
import entity.LocalTableModel;
import entity.Stu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStuFrame extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -7206921053995440945L;
    private JPanel contentPane;
    private LocalTableModel model = new LocalTableModel();
    private BatchDelete batchDelete = new BatchDelete();
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    DeleteStuFrame frame = new DeleteStuFrame();
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
    public DeleteStuFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 434, 262);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel messageLabel = new JLabel("批量删除学生表数?");
        messageLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        messageLabel.setBounds(135, 26, 149, 15);
        panel.add(messageLabel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(36, 71, 352, 111);
        panel.add(scrollPane);

        table = new JTable(model);
        scrollPane.setViewportView(table);

        JButton deleteButton = new JButton("删除");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                do_deleteButton_actionPerformed(arg0);
            }
        });
        deleteButton.setBounds(97, 214, 80, 23);
        panel.add(deleteButton);

        JButton closeButton = new JButton("关闭");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                do_closeButton_actionPerformed(arg0);
            }
        });
        closeButton.setBounds(232, 214, 80, 23);
        panel.add(closeButton);

        List<Stu> list = batchDelete.executeStu();
        for (int i = 0; i < list.size(); i++) {
            Stu stu = list.get(i);
            model.addRow(new Object[]{stu.getId(), stu.getName(), stu.getSex(), stu.getSpecialty()});
        }
    }

    // 删除按钮的单击处理事?
    protected void do_deleteButton_actionPerformed(ActionEvent arg0) {
        int[] ids = table.getSelectedRows(); // 返回选定行的索引
        Integer values[] = new Integer[ids.length];
        for (int i = 0; i < ids.length; i++) { // 遍历选定行的数组
            values[i] = new Integer(table.getValueAt(ids[i], 0).toString()); // 获取用户选择某单元格的内?
        }
        batchDelete.deleteBatch(values); // 调用批处理方?
        JOptionPane.showMessageDialog(getContentPane(), "数据删除成功?", "信息提示?", JOptionPane.WARNING_MESSAGE);
    }

    // 关闭按钮的单击处理事?
    protected void do_closeButton_actionPerformed(ActionEvent arg0) {
        System.exit(0);
    }
}
