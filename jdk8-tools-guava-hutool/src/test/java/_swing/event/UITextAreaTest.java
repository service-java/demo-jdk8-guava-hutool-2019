package _swing.event;
/**
 * 可自动换行的文本?
 *
 * @author Luo_0412
 */

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class UITextAreaTest extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 2703904745763545993L;

    public UITextAreaTest() {
        setSize(250, 150);// 设置窗体大小
        setTitle("定义自动换行的文本域");// 设置窗体标题
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);// 单击关闭按钮时关闭窗?
        Container cp = getContentPane();
        JTextArea jt = new JTextArea("文本?", 6, 6);// 创建文本?
        jt.setLineWrap(true);// 可以自动换行
        cp.add(jt);
        setVisible(true);// 显示窗体
    }

    public static void main(String[] args) {
        new UITextAreaTest();
    }
}
