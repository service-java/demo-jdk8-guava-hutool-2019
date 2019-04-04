package _swing.graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class ColorfulTextDemo extends JFrame {

    private static final long serialVersionUID = -4173805622489352908L; // 版本
    private JPanel contentPane;
    private JLabel label;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ColorfulTextDemo frame = new ColorfulTextDemo();
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
    public ColorfulTextDemo() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                do_this_windowActivated(e);
            }
        });
        setTitle("\u591A\u5F69\u7684\u5B57\u7B26\u4E32");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 100);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        label = new JLabel("");
        contentPane.add(label, BorderLayout.CENTER);
    }

    protected void do_this_windowActivated(WindowEvent e) {
        Image image = createImage(200, 100);// 创建新图片并指定其大?
        Graphics2D g = (Graphics2D) image.getGraphics();// 获得图片的Graphics对象并转换其类型
        g.setColor(Color.WHITE);// 设置画笔为白?
        g.fillRect(0, 0, 200, 100);// 将图片的背景填充成白?
        g.setFont(new Font("微软雅黑", Font.BOLD, 30));// 设置文本的字?
        String text = "明日科技";// 创建要绘制的字符?
        Color[] colors = {Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE,
                Color.CYAN};// 创建颜色数组
        for (int i = 0; i < text.length(); i++) {
            g.setColor(colors[i % 5]);// 选择颜色
            g.drawString(text.charAt(i) + "", 30 + i * 30, 60);// 绘制文本信息
        }

        label.setIcon(new ImageIcon(image));// 在标签上显示绘制的图?
    }
}
