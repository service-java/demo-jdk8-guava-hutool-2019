package __deprecated.bai.thread;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JoinTest extends JFrame {

    private static final long serialVersionUID = 1L;
    final private int WIDTH = 250;
    final private int HEIGHT = 150;
    // 定义两个线程
    private Thread threadA;
    private Thread threadB;
    // 定义两个进度条组件
    final JProgressBar progressBar = new JProgressBar();
    final JProgressBar progressBar2 = new JProgressBar();
    int count = 0;

    public JoinTest() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);

        setLayout(new BorderLayout());
        add(progressBar, BorderLayout.NORTH); // 将进度条设置在窗体最北面
        add(progressBar2, BorderLayout.SOUTH); // 将进度条设置在窗体最南面

        // 设置进度条显示数字字符
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);

        // 使用内部类形式初始化Thread实例子
        threadA = new Thread(new MainBarThread());
        threadA.start(); // 启动线程A
        threadB = new Thread(new SubBarThread());
        threadB.start(); // 启动线程B

        setVisible(true);
    }

    public class MainBarThread implements Runnable {
        //@Override
        public void run() {
            int count = 0;
            while (count < 100) {
                progressBar.setValue(++count); // 设置进度条的当前值
                try {
                    Thread.sleep(100); // 使线程A休眠100毫秒
                    //threadB.join(); // 使线程B调用join()方法
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class SubBarThread implements Runnable {
        //@Override
        public void run() {
            int count = 0;
            while (count < 100) {
                progressBar2.setValue(++count); // 设置进度条的当前值
                try {
                    Thread.sleep(100); // 使线程B休眠100毫秒
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new JoinTest();
    }
}

