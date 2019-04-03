package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class HistogramDemo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -5617292057607157293L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HistogramDemo frame = new HistogramDemo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public HistogramDemo() {
        setTitle("\u81EA\u5B9A\u4E49\u76F4\u65B9\u56FE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);// 将画笔颜色设置成白色
        g.fillRect(0, 0, getWidth(), getHeight());// 使用白色填充整个面板
        Insets inset = getInsets();// 获得可用的绘图区?
        g.setColor(Color.LIGHT_GRAY);// 将画笔颜色设置成浅灰?
        int usefulWidth = getWidth() - inset.right;// 可用宽度
        int usefulHeight = getHeight() - inset.top - inset.bottom;// 可用高度
        int lineHeight = usefulHeight / 10;// 计算百分比线间距?
        for (int i = 1; i < 11; i++) {
            Point start = new Point(inset.left, inset.top + lineHeight * i);// 计算百分比线起点
            Point end = new Point(usefulWidth, inset.top + i * lineHeight);// 计算百分比终?
            g.drawString(100 - i * 10 + "%", start.x, start.y);// 绘制字符?
            g.drawLine(start.x, start.y, end.x, end.y);// 绘制百分比线
        }
        g.setColor(Color.BLUE);// 将画笔颜色设置成蓝色
        g.drawString("产品1的销?", 100, 90);// 绘制字符?
        g.drawRect(100, 100, 70, usefulHeight - 70);// 绘制矩形
        g.fillRect(100, 100, 70, usefulHeight - 70);// 为矩形填充颜?
        g.drawString("产品2的销?", 250, 60);// 绘制字符?
        g.drawRect(250, 70, 70, usefulHeight - 40);// 绘制矩形
        g.fillRect(250, 70, 70, usefulHeight - 40);// 为矩形填充颜?
    }

}
