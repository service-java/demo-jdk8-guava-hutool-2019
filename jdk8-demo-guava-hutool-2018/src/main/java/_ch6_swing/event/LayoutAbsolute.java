package _ch6_swing.event;

/**
 * 绝对布局
 */

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LayoutAbsolute extends JFrame {
    private static final long serialVersionUID = -497864517686172493L;

    public LayoutAbsolute() {
        setTitle("绝对布局演示");
        setLayout(null); // 取消布局管理器设?
        setBounds(0, 0, 250, 150); // 绝对定位窗体的位置与大小

        // 创建容器对象
        Container c = getContentPane();
        JButton b1 = new JButton("按钮1");
        JButton b2 = new JButton("按钮2");
        b1.setBounds(10, 30, 80, 30);
        b2.setBounds(60, 70, 100, 20);// 设置按钮的位置与大小
        c.add(b1);
        c.add(b2);
        setVisible(true); // 使窗体可?

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 不写的话红点不会消失
    }

    // 启动?
    public static void main(String[] args) {
        new LayoutAbsolute();
    }
}
