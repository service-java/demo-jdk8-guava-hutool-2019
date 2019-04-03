package event;
/**
 * 画icon
 */

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

// 实现Icon接口
public class DrawIcon implements Icon {
    // 图标长宽
    private int width;
    private int height;

    // 定义构?方?
    public DrawIcon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
        arg1.fillOval(x, y, width, height); // 绘制?个圆?
    }

    public static void main(String[] args) {
        DrawIcon icon = new DrawIcon(150, 150);

        // 创建?个标签，并设置标签上的文字在标签正中?
        JLabel j = new JLabel("测试", icon, SwingConstants.CENTER);
        JFrame jf = new JFrame();
        Container c = jf.getContentPane();
        c.add(j);

        jf.setSize(250, 250);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
