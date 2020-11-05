package _ch6_swing.event;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class SimpleFrame extends JFrame {

    private static final long serialVersionUID = -8158038730410385624L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SimpleFrame frame = new SimpleFrame();
                    frame.setVisible(true);// 设置窗体可见
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public SimpleFrame() {
        // 设置窗体
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 150);// 设置窗体显示位置及大?

        // 创建面板与设置面?
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // 设置面板边框
        contentPane.setLayout(new BorderLayout(0, 0));// 设置面板布局
        setContentPane(contentPane);// 应用面板

        // 创建标签
        JLabel label = new JLabel("\u8FD9\u662F\u4E00\u4E2AJFrame\u7A97\u4F53");
        label.setFont(new Font("微软雅黑", Font.PLAIN, 15));// 设置标签文本字体
        contentPane.add(label, BorderLayout.CENTER);// 应用标签
    }

}
