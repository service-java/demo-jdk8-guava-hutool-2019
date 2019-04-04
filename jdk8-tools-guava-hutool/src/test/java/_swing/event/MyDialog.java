package _swing.event;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyDialog extends JDialog {

    private static final long serialVersionUID = 5407285452661115798L;
    private final JPanel contentPanel = new JPanel();

    public MyDialog() {
        setBounds(100, 100, 250, 150); // 设置对话框显示位置及大小
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout()); // 设置布局
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5)); // 设置边框
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(new BorderLayout(0, 0));

        JLabel label = new JLabel("\u8FD9\u662F\u4E00\u4E2A\u5BF9\u8BDD\u6846");// 创建标签
        label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        contentPanel.add(label, BorderLayout.CENTER);
    }

}
