package _ch6_swing.event;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LayoutBorder extends JFrame {

    private static final long serialVersionUID = 1022352632223273293L;

    // 定义组件摆放位置的数?
    String[] border = {
            BorderLayout.CENTER,
            BorderLayout.NORTH,
            BorderLayout.SOUTH,
            BorderLayout.WEST,
            BorderLayout.EAST};

    String[] buttonName = {
            "center button",
            "north button",
            "south button",
            "west button",
            "east button"};

    public LayoutBorder() {
        setTitle("边界布局管理?");
        Container c = getContentPane();
        setLayout(new BorderLayout()); // 设置布局

        // 在容器中添加按钮，并设置按钮布局
        for (int i = 0, len = border.length; i < len; i++) {
            c.add(border[i], new JButton(buttonName[i]));
        }

        setSize(550, 200); // 设置窗体大小
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LayoutBorder();
    }
}
