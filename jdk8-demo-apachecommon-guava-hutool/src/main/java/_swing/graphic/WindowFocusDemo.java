package _swing.graphic;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class WindowFocusDemo extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -761940036093776390L;

    public static void main(String args[]) {
        WindowFocusDemo frame = new WindowFocusDemo();
        frame.setVisible(true);
    }

    public WindowFocusDemo() {
        addWindowFocusListener(new MyWindowFocusListener());// 为窗体添加焦点事件监听器
        setTitle("捕获窗体焦点事件");
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private class MyWindowFocusListener implements WindowFocusListener {
        public void windowGainedFocus(WindowEvent e) {// 窗口获得焦点时被触发
            System.out.println("窗口获得了焦点！");
        }

        public void windowLostFocus(WindowEvent e) {// 窗口失去焦点时被触发
            System.out.println("窗口失去了焦点！");
        }
    }
}

