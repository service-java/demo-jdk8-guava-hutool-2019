package _ch6_swing.event;
/**
 * 带滚动条的文本编辑器
 *
 * @author Luo_0412
 */

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class UIScrollPaneTest extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -5521902656927064225L;

    public UIScrollPaneTest() {
        Container c = getContentPane(); // 创建容器
        JTextArea ta = new JTextArea(20, 50); // 创建文本区域组件
        ta.setText("带滚动条的文字编译器");
        JScrollPane sp = new JScrollPane(ta); // 创建JScrollPane面板对象
        c.add(sp); // 将该面板添加到该容器?

        setTitle("带滚动条的文字编译器");
        setSize(250, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UIScrollPaneTest();

    }

}
