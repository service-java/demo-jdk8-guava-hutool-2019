package _swing.event;

import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyImageIcon extends JFrame {
    private static final long serialVersionUID = 1947151270513185151L;

    public MyImageIcon() {
        Container container = getContentPane();
        // 创建?个标?
        JLabel jl = new JLabel("这是?个JFrame窗体", JLabel.CENTER);
        // 获取图片?在的URL
        URL url = MyImageIcon.class.getResource("../images/imageButton.jpg");
        Icon icon = new ImageIcon(url); // 实例化Icon对象
        jl.setIcon(icon); // 为标签设置图?
        // 设置文字放置在标签中?
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setOpaque(true); // 设置标签为不透明状??
        container.add(jl); // 将标签添加到容器?
        setSize(250, 150); // 设置窗体大小
        setVisible(true); // 使窗体可?
        // 设置窗体关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new MyImageIcon(); // 实例化MyImageIcon对象
    }
}
