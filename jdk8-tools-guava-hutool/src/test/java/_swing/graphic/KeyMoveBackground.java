package _swing.graphic;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyMoveBackground extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -4152939803706413827L;
    private JLabel label; // 背景图片的标?
    private ImageIcon icon;
    private ImageIcon glassImg;

    /**
     * Launch the application
     *
     * @param args
     */
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    KeyMoveBackground frame = new KeyMoveBackground();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame
     */
    public KeyMoveBackground() {
        super();
        setResizable(false); // 禁止调整窗体大小
        getContentPane().setLayout(null); // 设置空布?
        setTitle("方向键移动背?"); // 设置窗体标题
        setBounds(100, 100, 500, 375);// 设置窗体位置和大?
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体?出时操作
        label = new JLabel(); // 创建标签组件
        icon = new ImageIcon("src/images/background.jpg");
        glassImg = new ImageIcon("src/images/glass.png");
        // 要填绝对路径？？
        label.setIcon(icon); // 设置标签使用背景图像
        label.setSize(icon.getIconWidth(), icon.getIconHeight());// 使标签与图像同步大小
        label.setLocation(0, 0);// 设置标签默认位置
        addKeyListener(new KeyAdapter() { // 为窗体添加按键事件监听?配?
            public void keyPressed(final KeyEvent e) {
                do_label_keyPressed(e); // 调用事件处理方法
            }
        });
        getContentPane().add(label); // 添加背景标签到窗?
        JLabel glassLabel = new JLabel(glassImg); // 创建取景框标?
        JPanel glassPane = new JPanel(new BorderLayout());
        glassPane.add(glassLabel, BorderLayout.CENTER); // 添加取景框标签到玻璃面板
        glassPane.setOpaque(false); // 使面板?明
        setGlassPane(glassPane); // 设置窗体使用玻璃面板
        getGlassPane().setVisible(true); // 显示玻璃面板

    }

    /**
     * 背景标签组件的按键输入事件处理方?
     *
     * @param e
     */
    protected void do_label_keyPressed(final KeyEvent e) {
        int code = e.getKeyCode(); // 获取按键代码
        Point location = label.getLocation(); // 获取标签组件位置
        int step = 30; // 移动速度
        switch (code) {
            case KeyEvent.VK_RIGHT: // 如果按键代码是右方向?
                if (location.x > (getWidth() - label.getWidth())) // 在不超出屏幕情况?
                    label.setLocation(location.x - step, location.y); // 向左移动标签
                break;
            case KeyEvent.VK_LEFT: // 如果是按键代码是左方向键
                if (location.x < 0) // 在不超出屏幕情况?
                    label.setLocation(location.x + step, location.y); // 向右移动标签
                break;
            case KeyEvent.VK_DOWN: // 如果是按键代码是下方向键
                if (location.y > (getHeight() - label.getHeight())) // 在不超出屏幕情况?
                    label.setLocation(location.x, location.y - step); // 向上移动标签
                break;
            case KeyEvent.VK_UP: // 如果是按键代码是上方向键
                if (location.y < 0) { // 在不超出屏幕情况?
                    label.setLocation(location.x, location.y + step); // 向下移动标签
                }
                break;
            default:
                break;
        }
    }
}
