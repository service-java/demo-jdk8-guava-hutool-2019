package _swing.event;

/**
 * 常用窗口 lab9-1
 *
 * @author Luo_0412 骆金?
 * @date 2016-11-21
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RunnerWindow extends JFrame {

    private static final long serialVersionUID = -8158038730410385624L;
    private JLabel label;
    private JFrame jf;
    private JPanel jp;
    private JTextField jt;
    private JButton jb;

    public RunnerWindow() {
        // 声名窗体
        jf = new JFrame();
        jf.setTitle("RunnerWindow Demo");
        jf.setSize(400, 130);// 设置窗体大小
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 声名面板
        jp = new JPanel();

        // 声名元素
        label = new JLabel("This window display the running letter:");
        jt = new JTextField("", 30);// 创建文本?
        jb = new JButton("Stop the Process");// 创建按钮
        jb.addActionListener(new StopButtonListener());

        // 向面板添加元?
        jp.add(label);
        jp.add(jt);
        jp.add(jb);

        // 自定义对话框,但是看到感叹号就知道不是?...
//        jb.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent arg0) {
//                RunnerWindowDialog dialog = new RunnerWindowDialog();
//                dialog.setVisible(true); // 显示对话?
//            }
//        });

        // 向窗体添加面?
        jf.add(jp);
        jf.setVisible(true); // 设置可见,要写在最后面
    }

    // 内部?,弹出提示信息，终止程?
    public class StopButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "The Program exits.");
            System.exit(0); // ?出程?
        }
    }

    // 启动?
    public static void main(String[] args) {
        new RunnerWindow();
    }

}
