package event;
/**
 * 按钮演示
 */

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UIBtnTest extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -4157799103787685703L;

    public UIBtnTest() {
        URL url = UIBtnTest.class.getResource("../images/imageButtoo.jpg");
        Icon icon = new ImageIcon(url);
        setLayout(new GridLayout(3, 2, 5, 5)); // 设置网格布局管理?
        Container c = getContentPane(); // 创建容器
        for (int i = 1; i <= 5; i++) {
            // 创建按钮，同时设置按钮文字与图标
            JButton J = new JButton("按钮" + i, icon);
            c.add(J); // 在容器中添加按钮
            if (i % 2 == 0) {
                J.setEnabled(false); // 设置其中?些按钮不可用
            }
        }
        JButton jb = new JButton(); // 实例化一个没有文字与图片的按?
        jb.setMaximumSize(new Dimension(90, 30)); // 设置按钮与图片相同大?
        jb.setIcon(icon); // 为按钮设置图?
        jb.setHideActionText(true);
        jb.setToolTipText("图片按钮"); // 设置按钮提示为文?
        jb.setBorderPainted(false); // 设置按钮边界不显?
        c.add(jb); // 将按钮添加到容器?
        setTitle("创建带文字与图片的按?");
        setSize(350, 150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String args[]) {
        new UIBtnTest();
    }
}
