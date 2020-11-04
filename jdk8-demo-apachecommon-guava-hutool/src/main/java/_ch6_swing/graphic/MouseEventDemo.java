package _ch6_swing.graphic;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo extends JFrame { // 继承窗体类JFrame
    private static final long serialVersionUID = -2953655633515616460L;

    public static void main(String args[]) {
        MouseEventDemo frame = new MouseEventDemo();
        frame.setVisible(true); // 设置窗体可见，默认为不可?
    }

    public MouseEventDemo() {
        super(); // 继承父类的构造方?
        setTitle("鼠标事件示例"); // 设置窗体的标?
        setBounds(100, 100, 500, 375); // 设置窗体的显示位置及大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体关闭按钮的动作为??

        final JLabel label = new JLabel();
        label.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent e) {// 光标移入组件时被触发
                System.out.println("光标移入组件");
            }

            public void mousePressed(MouseEvent e) {// 鼠标按键被按下时被触?
                System.out.print("鼠标按键被按下，");
                int i = e.getButton(); // 通过该?可以判断按下的是哪个键
                if (i == MouseEvent.BUTTON1)
                    System.out.println("按下的是鼠标左键");
                if (i == MouseEvent.BUTTON2)
                    System.out.println("按下的是鼠标滚轮");
                if (i == MouseEvent.BUTTON3)
                    System.out.println("按下的是鼠标右键");
            }

            public void mouseReleased(MouseEvent e) {// 鼠标按键被释放时被触?
                System.out.print("鼠标按键被释放，");
                int i = e.getButton(); // 通过该?可以判断释放的是哪个键
                if (i == MouseEvent.BUTTON1)
                    System.out.println("释放的是鼠标左键");
                if (i == MouseEvent.BUTTON2)
                    System.out.println("释放的是鼠标滚轮");
                if (i == MouseEvent.BUTTON3)
                    System.out.println("释放的是鼠标右键");
            }

            public void mouseClicked(MouseEvent e) {// 发生单击事件时被触发
                System.out.print("单击了鼠标按键，");
                int i = e.getButton(); // 通过该?可以判断单击的是哪个键
                if (i == MouseEvent.BUTTON1)
                    System.out.print("单击的是鼠标左键?");
                if (i == MouseEvent.BUTTON2)
                    System.out.print("单击的是鼠标滚轮?");
                if (i == MouseEvent.BUTTON3)
                    System.out.print("单击的是鼠标右键?");
                int clickCount = e.getClickCount();
                System.out.println("单击次数?" + clickCount + "?");
            }

            public void mouseExited(MouseEvent e) {// 光标移出组件时被触发
                System.out.println("光标移出组件");
            }
        });
        getContentPane().add(label, BorderLayout.CENTER);
    }

}
