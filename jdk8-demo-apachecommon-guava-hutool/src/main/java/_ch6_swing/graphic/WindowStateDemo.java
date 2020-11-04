package _ch6_swing.graphic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class WindowStateDemo extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1444570547531302408L;

    public static void main(String args[]) {
        WindowStateDemo frame = new WindowStateDemo();
        frame.setVisible(true);
    }

    public WindowStateDemo() {
        addWindowStateListener(new MyWindowStateListener()); // 为窗体添加状态事件监听器
        setTitle("捕获窗体状?事?");
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private class MyWindowStateListener implements WindowStateListener {
        public void windowStateChanged(WindowEvent e) {
            int oldState = e.getOldState(); // 获得窗体以前的状?
            int newState = e.getNewState(); // 获得窗体现在的状?
            String from = ""; // 标识窗体以前状?的中文字符?
            String to = ""; // 标识窗体现在状?的中文字符?
            switch (oldState) { // 判断窗体以前的状?
                case Frame.NORMAL: // 窗体处于正常?
                    from = "正常?";
                    break;
                case Frame.MAXIMIZED_BOTH: // 窗体处于?大化
                    from = "?大化";
                    break;
                default: // 窗体处于图标?
                    from = "图标?";
            }
            switch (newState) { // 判断窗体现在的状?
                case Frame.NORMAL: // 窗体处于正常?
                    to = "正常?";
                    break;
                case Frame.MAXIMIZED_BOTH: // 窗体处于?大化
                    to = "?大化";
                    break;
                default: // 窗体处于图标?
                    to = "图标?";
            }
            System.out.println(from + "―??>" + to);
        }
    }
}
