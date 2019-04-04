package _swing.event;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LayoutGrid extends JFrame {

    private static final long serialVersionUID = -3949337159286513592L;

    public LayoutGrid() {
        Container c = getContentPane();
        setLayout(new GridLayout(7, 3, 0, 10)); // 7?3?

        // 循环添加按钮
        for (int i = 0; i < 20; i++) {
            c.add(new JButton("button" + i));
        }

        setSize(300, 300);
        setTitle("网格布局管理?");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // 启动?
    public static void main(String[] args) {
        new LayoutGrid();
    }
}
