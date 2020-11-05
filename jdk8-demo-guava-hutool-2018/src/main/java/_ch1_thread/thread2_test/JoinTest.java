package _ch1_thread.thread2_test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JoinTest extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -3932617039236435411L;
    private Thread threadA; // 定义两个线程
    private Thread threadB;
    final JProgressBar progressBar = new JProgressBar(); // 定义两个进度条组件
    final JProgressBar progressBar2 = new JProgressBar();
    int count = 0;

    public static void main(String[] args) {
        init(new JoinTest(), 250, 150);
    }

    public JoinTest() {
        super();
        getContentPane().add(progressBar, BorderLayout.NORTH); // 将进度条设置在窗体最北面
        getContentPane().add(progressBar2, BorderLayout.SOUTH); // 将进度条设置在窗体最南面
        progressBar.setStringPainted(true); // 设置进度条显示数字字符
        progressBar2.setStringPainted(true);
        // 使用匿名内部类形式初始化Thread实例子
        threadA = new Thread(new Runnable() {
            int count = 0;

            public void run() { // 重写run()方法
                while (true) {
                    progressBar.setValue(++count); // 设置进度条的当前值
                    try {
                        Thread.sleep(100); // 使线程A休眠100毫秒
                        threadB.join(); // 使线程B调用join()方法
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start(); // 启动线程A
        threadB = new Thread(new Runnable() {
            int count = 0;

            public void run() {
                while (true) {
                    progressBar2.setValue(++count); // 设置进度条的当前值
                    try {
                        Thread.sleep(100); // 使线程B休眠100毫秒
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (count == 100) // 当count变量增长为100时
                        break; // 跳出循环
                }
            }
        });
        threadB.start(); // 启动线程B
    }

    public static void init(JFrame frame, int width, int height) { // 设置窗体各种属性方法
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }

}
