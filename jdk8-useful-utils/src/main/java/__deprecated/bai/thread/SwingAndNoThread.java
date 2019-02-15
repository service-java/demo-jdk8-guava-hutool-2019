package __deprecated.bai.thread;

//import java.awt.Container;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingAndNoThread extends JFrame {
    private static final long serialVersionUID = 3072610150688336300L;
    private JLabel jl = new JLabel(); // 声明JLabel对象
    private int count = 0; // 声明计数变量

    public SwingAndNoThread() {
        setBounds(300, 200, 250, 100); // 绝对定位窗体大小与位置
        setLayout(null); // 使窗体不使用任何布局管理器
        // 设置窗体的关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Icon icon = new ImageIcon("1.gif"); // 实例化一个Icon
        jl.setIcon(icon); // 将图标放置在标签中
        jl.setHorizontalAlignment(SwingConstants.LEFT); // 设置图片在标签的最左方
        jl.setBounds(10, 10, 200, 50); // 设置标签的位置与大小
        jl.setOpaque(true);

        while (count <= 200) { // 设置循环条件
            jl.setBounds(count, 10, 200, 50); // 将标签的横坐标用变量表示
            try {
                Thread.sleep(1000); // 使线程休眠1000毫秒
            } catch (Exception e) {
                e.printStackTrace();
            }
            count += 4; // 使横坐标每次增加4
            if (count == 200) {
                // 当图标到达标签的最右边，使其回到标签最左边
                count = 10;
            }
        }

        add(jl); // 将标签添加到容器中
        setVisible(true); // 使窗体可视

    }

    public static void main(String[] args) {
        new SwingAndNoThread(); // 实例化一个SwingAndThread对象
    }
}
