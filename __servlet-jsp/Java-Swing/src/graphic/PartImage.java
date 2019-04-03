package graphic;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PartImage extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1570658656511946130L;
    private Image img;
    private int dx1, dy1, dx2, dy2;
    private int sx1, sy1, sx2, sy2;
    private JPanel jPanel = null;
    private JPanel jPanel1 = null;
    private JButton jButton = null;
    private JButton jButton1 = null;
    private MyCanvas canvasPanel = null;

    public PartImage() {
        dx2 = sx2 = 300; // 初始化图像大?
        dy2 = sy2 = 200;
        initialize(); // 调用初始化方?
    }

    // 界面初始化方?
    private void initialize() {
        URL imgUrl = PartImage.class.getResource("../images/cow.jpg");// 获取图片资源的路?
        img = Toolkit.getDefaultToolkit().getImage(imgUrl); // 获取图片资源
        this.setBounds(100, 100, 300, 260); // 设置窗体大小和位?
        this.setContentPane(getJPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭模式
        this.setTitle("图片翻转"); // 设置窗体标题
    }

    // 获取内容面板的方?
    private JPanel getJPanel() {
        if (jPanel == null) {
            jPanel = new JPanel();
            jPanel.setLayout(new BorderLayout());
            jPanel.add(getControlPanel(), BorderLayout.SOUTH);
            jPanel.add(getMyCanvas1(), BorderLayout.CENTER);
        }
        return jPanel;
    }

    // 获取按钮控制面板的方?
    private JPanel getControlPanel() {
        if (jPanel1 == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            jPanel1 = new JPanel();
            jPanel1.setLayout(new GridBagLayout());
            jPanel1.add(getJButton(), new GridBagConstraints());
            jPanel1.add(getJButton1(), gridBagConstraints);
        }
        return jPanel1;
    }

    // 获取水平翻转按钮
    private JButton getJButton() {
        if (jButton == null) {
            jButton = new JButton();
            jButton.setText("水平翻转");
            jButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    sx1 = Math.abs(sx1 - 300);
                    sx2 = Math.abs(sx2 - 300);
                    canvasPanel.repaint();
                }
            });
        }
        return jButton;
    }

    // 获取垂直翻转按钮
    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton();
            jButton1.setText("垂直翻转");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    sy1 = Math.abs(sy1 - 200);
                    sy2 = Math.abs(sy2 - 200);
                    canvasPanel.repaint();
                }
            });
        }
        return jButton1;
    }

    // 获取画板面板
    private MyCanvas getMyCanvas1() {
        if (canvasPanel == null) {
            canvasPanel = new MyCanvas();
        }
        return canvasPanel;
    }

    // 主方?
    public static void main(String[] args) {
        new PartImage().setVisible(true);
    }

    // 画板
    class MyCanvas extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = -9000556665445315872L;

        public void paint(Graphics g) {
            g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, this);// 绘制指定大小的图?
        }
    }
}
