package event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UITextFieldTest extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -3114469452326313888L;

    public UITextFieldTest() {
        setSize(250, 150);// 设置窗体大小
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);// 单击关闭按钮时关闭窗?
        Container cp = getContentPane();
        getContentPane().setLayout(new FlowLayout());// 设置布局
        final JTextField jt = new JTextField("aaa", 20);// 创建文本?
        final JButton jb = new JButton("清除");// 创建按钮
        cp.add(jt);// 应用文本?
        cp.add(jb);// 应用按钮
        jt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jt.setText("触发事件");// 设置文本域内?
            }
        });
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jt.setText("");// 清空文本域内?
                jt.requestFocus();// 让文本域获得焦点
            }
        });
        setVisible(true);// 设置窗体可见
    }

    public static void main(String[] args) {
        new UITextFieldTest();
    }
}
