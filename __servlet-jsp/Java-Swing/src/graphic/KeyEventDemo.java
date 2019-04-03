package graphic;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class KeyEventDemo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 7408181574918173831L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    KeyEventDemo frame = new KeyEventDemo();// 创建窗体对象
                    frame.setVisible(true);// 设置窗体可见
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public KeyEventDemo() {
        setTitle("\u76D1\u542C\u952E\u76D8\u4E8B\u4EF6");// 设置窗体标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 单击关闭按钮时关闭窗?
        setBounds(100, 100, 450, 300);// 设置窗体显示位置及大?
        contentPane = new JPanel();// 创建面板
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// 设置面板边框
        contentPane.setLayout(new BorderLayout(0, 0));// 设置边界
        setContentPane(contentPane);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        final JTextArea textArea = new JTextArea();// 创建文本?
        textArea.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) { // 按键被按下时被触?
                String keyText = KeyEvent.getKeyText(e.getKeyCode()); // 获得描述keyCode的标?
                if (e.isActionKey()) { // 判断按下的是否为动作?
                    System.out.println("您按下的是动作键?" + keyText + "?");
                } else {
                    System.out.print("您按下的是非动作键??" + keyText + "?");
                    int keyCode = e.getKeyCode(); // 获得与此事件中的键相关联的字?
                    switch (keyCode) {
                        case KeyEvent.VK_CONTROL: // 判断按下的是否为Ctrl?
                            System.out.print("，Ctrl键被按下");
                            break;
                        case KeyEvent.VK_ALT: // 判断按下的是否为Alt?
                            System.out.print("，Alt键被按下");
                            break;
                        case KeyEvent.VK_SHIFT: // 判断按下的是否为Shift?
                            System.out.print("，Shift键被按下");
                            break;
                    }
                    System.out.println();
                }
            }

            public void keyTyped(KeyEvent e) { // 发生击键事件时被触发
                System.out.println("此次输入的是?" + e.getKeyChar() + "?");// 获得输入的字?
            }

            public void keyReleased(KeyEvent e) { // 按键被释放时被触?
                String keyText = KeyEvent.getKeyText(e.getKeyCode()); // 获得描述keyCode的标?
                System.out.println("您释放的是??" + keyText + "”键");
            }
        });
        textArea.setFont(new Font("微软雅黑", Font.PLAIN, 20));// 设置文本区字?
        scrollPane.setViewportView(textArea);
    }

}

