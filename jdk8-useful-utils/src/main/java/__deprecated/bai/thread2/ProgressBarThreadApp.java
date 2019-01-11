package __deprecated.bai.thread2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBarThreadApp extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JLabel label;
    private JProgressBar progressBar; // 声明JLabel对象
    private JButton btn1, btn2;
    private Thread t; // 声明线程对象
    private JPanel progressBarPanel, btnPanel;
    private int count = 0; // 声明计数变量

    public ProgressBarThreadApp() {
        super("Progress Bar");
        setBounds(300, 100, 320, 120); // 绝对定位窗体大小与位置
        setLayout(new BorderLayout());
        // 设置窗体的关闭方式
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        progressBarPanel = new JPanel();

        btnPanel = new JPanel();

        label = new JLabel(" 0%");

        // 创建一个进度条
        progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 20000);
        progressBar.setString("完成进度");
        progressBar.setBounds(50, 30, 200, 30); // 设置进度条的位置及大小
        progressBar.setStringPainted(true); // 显示进度条中的文字或百分比

        btn1 = new JButton("线程运行");
        btn2 = new JButton("非线程运行");
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        progressBarPanel.add(progressBar); // 将进度条添加到容器
        progressBarPanel.add(label);
        btnPanel.add(btn1);
        btnPanel.add(btn2);

        add(progressBarPanel, BorderLayout.NORTH);
        add(btnPanel, BorderLayout.SOUTH);
        setVisible(true); // 使窗体可视
    }

    public class SnowRunThread implements Runnable {
        //@Override
        public void run() {
            count = 0;
            while (count < 20000) { // 设置循环条件
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("当前线程被中断");
                }
                count += 1;
                progressBar.setValue(count); // 改变进度条的值
                label.setText((int) (progressBar.getPercentComplete() * 100) + "%");
//				label.setText( (count*100/20000) + "%");
            }
        }
    }

    public void showRunNoneThread() {
        count = 0;
        while (count < 20000) { // 设置循环条件
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count += 1;
            progressBar.setValue(count); // 改变进度条的值
            label.setText((int) (progressBar.getPercentComplete() * 100) + "%");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sourceObj = e.getSource();

        if (sourceObj == btn1) {
            t = new Thread(new SnowRunThread());
            t.start(); // 启动线程
        } else if (sourceObj == btn2) {
            showRunNoneThread();
        }
    }

    public static void main(String[] args) {
        new ProgressBarThreadApp();
    }

}
