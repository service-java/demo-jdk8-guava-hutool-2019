package _ch1_thread.thread_test;

import java.awt.BorderLayout;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Commnicate extends JFrame {
    private static final long serialVersionUID = -4532342445622085716L;
    private int count = 0;
    final private int WINDOW_WIDTH = 150;
    final private int WINDOW_HEIGHT = 100;

    private JProgressBar progressBar = new JProgressBar();
    private Object synObject = new Object();

    private Thread t1, t2;

    public Commnicate() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        progressBar.setStringPainted(true);
        add(progressBar, BorderLayout.NORTH);

        setVisible(true);

        t1 = new Thread(new AddValue());
        t2 = new Thread(new DeValue());
        t1.start();
        t2.start();

    }

    public class AddValue implements Runnable {
        //@Override
        public void run() {
            while (true) {
                synchronized (synObject) { // 定义同步块
                    if (count == 0) {
                        progressBar.setValue(count += 100);
                        System.out.println("进度条的当前值为：" + count);

                        System.out.println("进度条已有值，可以进行递减操作");
                        synObject.notify(); // 在同步块中将线程t2唤醒
                    }
                }
                try {
                    Thread.sleep(100); // 使当前线程休眠100毫秒
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class DeValue implements Runnable {
        //@Override
        public void run() {
            while (true) {
                synchronized (synObject) { // 定义同步块
                    if (count == 0) {
                        try {
                            System.out.println("wait");
                            synObject.wait(); // 使线程t2等待
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                progressBar.setValue(--count); // 将进度条的当前值递减
                System.out.println("进度条的当前值为：" + count);
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {
        new Commnicate();
    }
}
