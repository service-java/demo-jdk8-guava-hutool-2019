package _swing.graphic;

/**
 * 画五?
 */

import java.awt.Graphics; // 绘图
import javax.swing.JFrame; // 窗体
import javax.swing.JPanel; // 画板

public class GrDrawFiveCircle extends JFrame {

    // 序列化有关的版本?
    private static final long serialVersionUID = 1L;

    // 圆形长宽, 定义成长?
    private final int OVAL_WIDTH = 80;
    private final int OVAL_HEIGHT = 80;

    // 构?函?
    public GrDrawFiveCircle() {
        super();
        initialize(); // 初始?
    }

    // 初始化方?
    private void initialize() {
        this.setSize(300, 200); // 设置窗体大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
        setContentPane(new DrawPanel()); // 设置窗体面板为绘图面板对?
        this.setTitle("画五?"); // 设置窗体标题
    }

    // 创建绘图面板
    class DrawPanel extends JPanel {

        private static final long serialVersionUID = -4636946496682683380L;

        public void paint(Graphics g) {
            super.paint(g); // 继承自父?

            // 绘图操作 画五个圆
            g.drawOval(-40, -40, OVAL_WIDTH, OVAL_HEIGHT);
            g.drawOval(80, 10, OVAL_WIDTH, OVAL_HEIGHT);
            g.drawOval(150, 10, OVAL_WIDTH, OVAL_HEIGHT);
            g.drawOval(50, 70, OVAL_WIDTH, OVAL_HEIGHT);
            g.drawOval(117, 70, OVAL_WIDTH, OVAL_HEIGHT);
        }
    }

    // 主方?
    public static void main(String[] args) {
        new GrDrawFiveCircle().setVisible(true); // 创建窗体
    }
}
