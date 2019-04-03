package event;

/**
 * 流式布局
 */

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LayoutFlow extends JFrame {
    private static final long serialVersionUID = 2024942264274135282L;

    public LayoutFlow() {
        setTitle("流布?管理?"); // 设置窗体标题
        Container c = getContentPane();
        setLayout(new FlowLayout(2, 10, 10)); // 右对? + 水平间隔  + 垂直间隔

        // 在容器中循环添加10个按?
        // 尺寸变形
        for (int i = 0; i < 10; i++) {
            c.add(new JButton("button" + i));
        }

        setSize(300, 200); // 设置窗体大小
        setVisible(true); // 设置窗体可见
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new LayoutFlow();
    }
}
