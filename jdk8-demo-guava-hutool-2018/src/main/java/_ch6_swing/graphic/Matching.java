package _ch6_swing.graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Matching extends JFrame implements MouseListener, MouseMotionListener {
    /**
     *
     */
    private static final long serialVersionUID = -1022682672826819395L;
    private JLabel img[] = new JLabel[5];
    private JLabel targets[] = new JLabel[5];
    private Point pressPoint; // 鼠标按住时的坐标

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Matching frame = new Matching();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Matching() {
        super();
        getContentPane().setLayout(new BorderLayout());// 将内容面板设置成边界布局
        setBounds(100, 100, 550, 300);// 设置窗体位置和大?
        setTitle("?易配对游?");// 设置窗体的标?
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体?出时操作
        final JPanel imagePanel = new JPanel();// 创建面板来保存图?
        imagePanel.setLayout(null);// 将面板设置成绝对布局
        imagePanel.setOpaque(false);// 将面板设置成可见
        setGlassPane(imagePanel);// 将面板应用到玻璃窗格
        getGlassPane().setVisible(true);// 设置玻璃窗格可见
        ImageIcon icon[] = new ImageIcon[5];// 创建图标数组
        icon[0] = new ImageIcon(getClass().getResource("../images/kafei.png"));// 为图标数组指定图?
        icon[1] = new ImageIcon(getClass().getResource("../images/xianshiqi.png"));// 为图标数组指定图?
        icon[2] = new ImageIcon(getClass().getResource("../images/xiyiji.png"));// 为图标数组指定图?
        icon[3] = new ImageIcon(getClass().getResource("../images/yifu.png"));// 为图标数组指定图?
        icon[4] = new ImageIcon(getClass().getResource("../images/zixingche.png"));// 为图标数组指定图?
        final JPanel bottomPanel = new JPanel();// 新建面板保存标签
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));// 将面板设置成流式布局
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);// 将面板放置在内容面板南部
        for (int i = 0; i < 5; i++) {
            img[i] = new JLabel(icon[i]); // 创建图像标签
            img[i].setSize(50, 50); // 设置标签大小
            img[i].setBorder(new LineBorder(Color.GRAY)); // 设置线?边?
            int x = (int) (Math.random() * (getWidth() - 50)); // 生成随机坐标
            int y = (int) (Math.random() * (getHeight() - 150));// 生成随机坐标
            img[i].setLocation(x, y); // 设置随机坐标
            img[i].addMouseListener(this); // 为每个图像标签添加鼠标事件监听器
            img[i].addMouseMotionListener(this);
            imagePanel.add(img[i]); // 添加图像标签到图像面?
            targets[i] = new JLabel(); // 创建匹配位置标签
            targets[i].setOpaque(true); // 使标签不透明，以设置背景?
            targets[i].setBackground(Color.ORANGE); // 设置标签背景?
            targets[i].setHorizontalTextPosition(SwingConstants.CENTER); // 设置文本与图像水平居?
            targets[i].setVerticalTextPosition(SwingConstants.BOTTOM); // 设置文本显示在图像下?
            targets[i].setPreferredSize(new Dimension(80, 80)); // 设置标签首先大小
            targets[i].setHorizontalAlignment(SwingConstants.CENTER); // 文字居中对齐
            bottomPanel.add(targets[i]); // 添加标签到底部面?
        }
        targets[0].setText("咖啡"); // 设置匹配位置的文?
        targets[1].setText("显示?");// 设置匹配位置的文?
        targets[2].setText("洗衣?");// 设置匹配位置的文?
        targets[3].setText("衣服");// 设置匹配位置的文?
        targets[4].setText("自行?");// 设置匹配位置的文?
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        pressPoint = e.getPoint(); // 保存拖放图片标签时的起始坐标
    }

    public void mouseReleased(MouseEvent e) {
        if (check()) { // 如果配对正确
            getGlassPane().setVisible(false);
            for (int i = 0; i < 5; i++) { // 遍历?有匹配位置的标签
                targets[i].setText("配对成功"); // 设置正确提示
                targets[i].setIcon(img[i].getIcon()); // 设置匹配的图?
            }
        }
    }

    private boolean check() {
        boolean result = true;
        for (int i = 0; i < 5; i++) {
            Point location = img[i].getLocationOnScreen(); // 获取每个图像标签的位?
            Point seat = targets[i].getLocationOnScreen(); // 获取每个对应位置的坐?
            targets[i].setBackground(Color.GREEN); // 设置匹配后的颜色
            // 如果配对错误
            if (location.x < seat.x || location.y < seat.y || location.x > seat.x + 80 || location.y > seat.y + 80) {
                targets[i].setBackground(Color.ORANGE); // 回复对应位置的颜?
                result = false; // ?测结果为false
            }
        }
        return result; // 返回?测结?
    }

    /**
     * 鼠标拖动组件时的事件处理方法
     */
    public void mouseDragged(MouseEvent e) {
        JLabel source = (JLabel) e.getSource(); // 获取事件源组?
        Point imgPoint = source.getLocation(); // 获取组件坐标
        Point point = e.getPoint(); // 获取鼠标坐标
        source.setLocation(imgPoint.x + point.x - pressPoint.x, imgPoint.y + point.y - pressPoint.y); // 设置组件新坐?
    }

    public void mouseMoved(MouseEvent e) {
    }
}
