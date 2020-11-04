package _ch1_thread.thread2_test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RandomThreadApp extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JPanel charWestPanel, charCenterPanel, charEastPanel, btnSouthPanel;
    private JTextField westTextField, centerTextField, eastTextField;
    private JLabel westLabel, centerLabel, eastLabel;
    private JButton btn;
    private Boolean isStoped = false;
    private Thread t; // 声明线程对象

    public RandomThreadApp() {
        setBounds(300, 300, 260, 180); // 绝对定位窗体大小与位置
        setLayout(new BorderLayout());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体的关闭方式

        charWestPanel = new JPanel();
//		charWestPanel.setBounds(100, 10, 80, 80); // 设置进度条的位置及大小
        charWestPanel.setPreferredSize(new Dimension(80, 150));
        charCenterPanel = new JPanel();
        charCenterPanel.setPreferredSize(new Dimension(80, 150));
        charEastPanel = new JPanel();
        charEastPanel.setPreferredSize(new Dimension(80, 150));
        btnSouthPanel = new JPanel();
        btnSouthPanel.setPreferredSize(new Dimension(260, 30));

        westLabel = new JLabel("线程1");
        centerLabel = new JLabel("线程2");
        eastLabel = new JLabel("线程3");

        westTextField = new JTextField();
        westTextField.setPreferredSize(new Dimension(80, 60));
        centerTextField = new JTextField();
        centerTextField.setPreferredSize(new Dimension(80, 60));
        eastTextField = new JTextField();
        eastTextField.setPreferredSize(new Dimension(80, 60));

        charWestPanel.add(BorderLayout.NORTH, westLabel);
        charWestPanel.add(BorderLayout.CENTER, westTextField);
        charCenterPanel.add(BorderLayout.NORTH, centerLabel);
        charCenterPanel.add(BorderLayout.CENTER, centerTextField);
        charEastPanel.add(BorderLayout.NORTH, eastLabel);
        charEastPanel.add(BorderLayout.CENTER, eastTextField);

        btn = new JButton("开始");
        btnSouthPanel.add(btn);
        btn.addActionListener(this);

        add(BorderLayout.WEST, charWestPanel);
        add(BorderLayout.CENTER, charCenterPanel);
        add(BorderLayout.EAST, charEastPanel);
        add(BorderLayout.SOUTH, btnSouthPanel);

        setVisible(true); // 使窗体可视

    }

    public class ShowRunThread implements Runnable {
        //@Override
        public void run() {
            while (true) { // 设置循环条件
                if (isStoped == true) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("当前线程被中断");
                }

                char randNum1 = (char) ((int) (Math.random() * 26 + 65));
                char randNum2 = (char) ((int) (Math.random() * 26 + 65));
                char randNum3 = (char) ((int) (Math.random() * 26 + 65));
                westTextField.setText(randNum1 + "");
                centerTextField.setText(randNum2 + "");
                eastTextField.setText(randNum3 + "");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = btn.getActionCommand();
        if (str.equals("开始")) {
            isStoped = false;
            btn.setText("停止");

            t = new Thread(new ShowRunThread());
            t.start(); // 启动线程
        } else {
            isStoped = true;
            btn.setText("开始");
        }

    }

    public static void main(String[] args) {
        new RandomThreadApp();
    }

}
