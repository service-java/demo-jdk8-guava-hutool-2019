package event;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class RegistDemo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -7774133711807576073L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegistDemo frame = new RegistDemo();// 创建窗体
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
    public RegistDemo() {
        setTitle("\u7528\u6237\u6CE8\u518C");// 设置窗体标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 单击关闭按钮时关闭窗?
        setBounds(100, 100, 350, 250);// 设置窗体大小及显示位?
        contentPane = new JPanel();// 创建面板
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// 设置边框
        setContentPane(contentPane);// 应用面板
        contentPane.setLayout(new GridLayout(5, 1, 5, 5));// 设置布局管理?

        JPanel panel1 = new JPanel();// 创建面板
        contentPane.add(panel1);

        JLabel label1 = new JLabel("\u65B0\u7528\u6237\u6CE8\u518C");
        panel1.add(label1);

        JPanel panel2 = new JPanel();// 创建面板
        FlowLayout flowLayout = (FlowLayout) panel2.getLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);
        contentPane.add(panel2);

        JLabel label2 = new JLabel("\u7528  \u6237  \u540D\uFF1A");
        panel2.add(label2);

        textField = new JTextField();
        panel2.add(textField);
        textField.setColumns(18);

        JPanel panel3 = new JPanel();// 创建面板
        FlowLayout flowLayout_1 = (FlowLayout) panel3.getLayout();
        flowLayout_1.setAlignment(FlowLayout.LEFT);
        contentPane.add(panel3);

        JLabel label3 = new JLabel("\u5BC6        \u7801\uFF1A");
        panel3.add(label3);

        passwordField1 = new JPasswordField();
        passwordField1.setColumns(18);
        panel3.add(passwordField1);

        JPanel panel4 = new JPanel();// 创建面板
        FlowLayout flowLayout_2 = (FlowLayout) panel4.getLayout();
        flowLayout_2.setAlignment(FlowLayout.LEFT);
        contentPane.add(panel4);

        JLabel label4 = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
        panel4.add(label4);

        passwordField2 = new JPasswordField();
        passwordField2.setColumns(18);
        panel4.add(passwordField2);

        JPanel panel5 = new JPanel();// 创建面板
        contentPane.add(panel5);

        JButton button = new JButton("\u63D0\u4EA4");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {// 处理用户单击按钮事件
                do_button_actionPerformed(e);
            }
        });
        panel5.add(button);
    }

    protected void do_button_actionPerformed(ActionEvent e) {
        char[] password1 = passwordField1.getPassword();// 获得密码?1中的密码
        char[] password2 = passwordField2.getPassword();// 获得密码?2中的密码
        boolean equals = Arrays.equals(password1, password2);// 判断两个密码框中密码是否相同
        if (equals) {// 如果密码相同则提示注册成?
            JOptionPane.showMessageDialog(this, "用户注册成功?", null, JOptionPane.INFORMATION_MESSAGE);
        } else {// 如果密码不同则提示密码不?
            JOptionPane.showMessageDialog(this, "两次密码不同?", null, JOptionPane.WARNING_MESSAGE);
        }
        Arrays.fill(password1, '0');// 清空密码
        Arrays.fill(password2, '0');// 清空密码
    }
}

