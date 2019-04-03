package event;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {

    private static final long serialVersionUID = -8158038730410385624L;
    private JPanel contentPane;

    // 启动?
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyFrame frame = new MyFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 150);// 设置窗体显示位置及大?
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// 为面板设置边?
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));// 设置面板布局

        JButton button = new JButton("\u5F39\u51FA\u5BF9\u8BDD\u6846");
        // 为按钮增加动作事件监听器
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyDialog dialog = new MyDialog();
                dialog.setVisible(true); // 显示对话?
            }
        });
        button.setFont(new Font("微软雅黑", Font.PLAIN, 15));
        contentPane.add(button);
    }

}
