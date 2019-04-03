package graphic;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RotateImage extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1377679910184197623L;
    private Image img;
    private MyCanvas canvasPanel = null;

    public RotateImage() {
        initialize(); // 调用初始化方?
    }

    // 界面初始化方?
    private void initialize() {
        URL imgUrl = RotateImage.class.getResource("../images/cow.jpg");// 获取图片资源的路?
        img = Toolkit.getDefaultToolkit().getImage(imgUrl); // 获取图片资源
        canvasPanel = new MyCanvas();
        this.setBounds(100, 100, 400, 350); // 设置窗体大小和位?
        add(canvasPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
        this.setTitle("图片旋转"); // 设置窗体标题
    }

    // 主方?
    public static void main(String[] args) {
        new RotateImage().setVisible(true);
    }

    // 画板
    class MyCanvas extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = -4388641572936881613L;

        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.rotate(Math.toRadians(5));
            g2.drawImage(img, 70, 10, 300, 200, this);// 绘制指定大小的图?
            g2.rotate(Math.toRadians(5));
            g2.drawImage(img, 70, 10, 300, 200, this);// 绘制指定大小的图?
            g2.rotate(Math.toRadians(5));
            g2.drawImage(img, 70, 10, 300, 200, this);// 绘制指定大小的图?
        }
    }
}

