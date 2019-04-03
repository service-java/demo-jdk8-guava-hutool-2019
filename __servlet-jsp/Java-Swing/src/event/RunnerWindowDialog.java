package event;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunnerWindowDialog extends JDialog {

    private static final long serialVersionUID = 5407285452661115798L;
    private final JPanel contentPanel = new JPanel();

    public RunnerWindowDialog() {
        setBounds(100, 100, 200, 120); // 设置对话框显示位置及大小
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout()); // 设置布局
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5)); // 设置边框
        getContentPane().add(contentPanel, BorderLayout.CENTER);
//        contentPanel.setLayout(new BorderLayout(0, 0));

        JLabel label = new JLabel("The Program exits");// 创建标签
        label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        contentPanel.add(label, BorderLayout.CENTER);

        JButton jb = new JButton("确定");// 创建按钮
        contentPanel.add(jb, BorderLayout.CENTER); // 应用按钮
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
    }

}
