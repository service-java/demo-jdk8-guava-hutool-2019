package _swing.event;
/**
 * 单?按?
 */

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class UIRadioBtnTest extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -6340489969273108056L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIRadioBtnTest frame = new UIRadioBtnTest();// 创建窗体
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
    public UIRadioBtnTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 单击关闭按钮时关闭窗?
        setBounds(100, 100, 250, 150);// 设置窗体显示位置及大?
        contentPane = new JPanel();// 创建面板
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// 设置面板边框
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));// 设置面板布局

        JLabel genderLabel = new JLabel("\u6027\u522B\uFF1A");// 创建标签
        genderLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));// 设置标签字体
        contentPane.add(genderLabel);// 应用标签

        JRadioButton maleRadioButton = new JRadioButton("\u7537");// 创建单?按?
        maleRadioButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));// 设置单?按钮字?
        contentPane.add(maleRadioButton);// 应用单?按?

        JRadioButton femaleRadioButton = new JRadioButton("\u5973");// 创建单?按?
        femaleRadioButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));// 设置单?按?
        contentPane.add(femaleRadioButton);// 应用单?按?

        ButtonGroup group = new ButtonGroup();// 创建按钮?
        group.add(maleRadioButton);// 向按钮组增加单?按?
        group.add(femaleRadioButton);// 向按钮组增加单?按?
    }

}
