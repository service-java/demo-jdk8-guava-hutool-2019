package _thread.thread2_test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Commnicate extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -4532342445622085716L;
    Thread t1;
    Thread t2;
    private int count = 0;
    final JProgressBar progressBar = new JProgressBar();

    public static void main(String[] args) {
        init(new Commnicate(), 150, 100);

    }

    public Commnicate() {
        super();
        progressBar.setStringPainted(true);
        getContentPane().add(progressBar, BorderLayout.NORTH);
        deValue();
        addValue();
        t1.start();
        t2.start();
    }

    public void addValue() {
        t1 = new Thread(new Runnable() { // 实例化线程t1
            public void run() {
                while (true) {
                    if (count >= 100) {
                        System.out.println("进度条已满,递增线程等待");
                        break;
                    }
                    if (count == 0) {
                        progressBar.setValue(count += 100);
                        System.out.println("进度条的当前值为：" + count);
                        synchronized (t2) { // 定义同步块
                            System.out.println("进度条已有值，可以进行递减操作");
                            t2.notify(); // 在同步块中将线程t2唤醒
                        }
                    }
                    try {
                        Thread.sleep(100); // 使当前线程休眠100毫秒
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public void deValue() {
        t2 = new Thread(new Runnable() { // 定义线程t2
            public void run() {
                while (true) {
                    if (count == 0) {
                        synchronized (this) { // 定义同步块
                            try {
                                wait(); // 使线程t2等待
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    progressBar.setValue(--count); // 将进度条的当前值递减
                    System.out.println("进度条的当前值为：" + count);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public static void init(JFrame frame, int width, int height) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}

