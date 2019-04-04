package _swing.event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * 边界管理?
 *
 * @author Luo_0412
 */
public class ControlWindow extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JFrame jf;
    private JPanel jp1, jp2, jp3;
    private JTextField jt;
    private JButton btn1, btn2;
    private JLabel label;

    public ControlWindow() {
        // 声名窗体
        jf = new JFrame();
        jf.setTitle("边界布局管理?");
        jf.setLayout(new BorderLayout()); // 设置布局
        jf.setSize(350, 150); // 设置窗体大小
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // ??

        // 声名放置元素的面?
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        // 声名元素
        label = new JLabel("Forword:add M, Back: delete M", SwingConstants.CENTER); // 居中
        jt = new JTextField("", 20);
        btn1 = new JButton("Forward");
        btn2 = new JButton("Back");
        // 添加集体性监听，用getSource()判断
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        jp1.add(label);
        jp2.add(jt);
        jp3.add(btn1);
        jp3.add(btn2);

        // 将面板放到窗体上
        jf.add(BorderLayout.NORTH, jp1);
        jf.add(BorderLayout.CENTER, jp2);
        jf.add(BorderLayout.SOUTH, jp3);

        // 之前错误的写?, 采用了flow布局,布局写到?半更换了
//        p.setLayout(new FlowLayout(1,5,5));
//        btn1 = new JButton("Forward");
//        btn2 = new JButton("Back"); // 坑爹啊，不要在这里重定义
//        getContentPane().add("South", p);

        jf.setVisible(true); // 这一步貌似要放到??,不然总出现bug
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = jt.getText();
        Object sourceObj = e.getSource();

        // add M
        if (sourceObj == btn1) {
            jt.setText(str + "M");
        }
        // delete M
        else if (sourceObj == btn2) {
            // 判断字符串长?
            int len = str.length();
            if (len > 0) {
                str = jt.getText().substring(0, len - 1);
            } else {
                JOptionPane.showMessageDialog(null, "长度不足,删无可删");
            }
            jt.setText(str);
        }
    }

    // 启动?
    public static void main(String[] args) {
        new ControlWindow();
    }

}
