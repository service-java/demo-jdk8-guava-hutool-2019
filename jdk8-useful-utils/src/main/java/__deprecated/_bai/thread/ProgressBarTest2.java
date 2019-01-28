package __deprecated._bai.thread;

//import java.awt.Container;

//import javax.swing.Icon;
//import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
//import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class ProgressBarTest2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JProgressBar progressBar; // 声明JLabel对象
    private static Thread t; // 声明线程对象
    private int count = 0; // 声明计数变量
    private JLabel progressLabel;// 显示完成“%”标签

    public ProgressBarTest2() {
        setBounds(300, 200, 320, 150); // 绝对定位窗体大小与位置
        setLayout(null); // 使窗体不使用任何布局管理器
        // 设置窗体的关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // 创建一个进度条
        progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        progressBar.setBounds(50, 30, 200, 30);  // 设置进度条的位置及大小
        progressBar.setString("完成进度");   //  设置进度条中的文字
        progressBar.setStringPainted(true);  // 显示进度条中的文字或百分比

        progressLabel = new JLabel("0%"); // 设置标签的内容
        progressLabel.setBounds(260, 30, 40, 30);  // 设置标签的位置和大小


        add(progressBar); // 将进度条添加到容器
        add(progressLabel); // 将标签添加到容器中

        t = new Thread(new SnowRunThread());
        t.start(); // 启动线程

        setVisible(true); // 使窗体可视

    }

    public class SnowRunThread implements Runnable {
        //@Override
        public void run() {
            try {
                while (count <= 100) { // 设置循环条件
                    Thread.sleep(150); // 使线程休眠150毫秒
                    count += 1;
                    progressBar.setValue(count); // 改变进度条的值
                    progressLabel.setText((int) (progressBar.getPercentComplete() * 100) + "%");
                }
            } catch (InterruptedException e) {
                System.out.println("当前线程被中断");
            }
        }
    }


    public static void main(String[] args) {
        new ProgressBarTest2(); // 实例化一个SwingAndThread对象
    }
}

