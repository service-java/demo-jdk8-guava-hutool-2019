package _ch6_swing.event;
/**
 * 单?按钮演?
 *
 * @author Luo_0412
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class UICheckBoxTest extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -7369314238433639843L;
    private JPanel panel1 = new JPanel();// 创建面板
    private JPanel panel2 = new JPanel();// 创建面板
    private JTextArea jt = new JTextArea(3, 10);// 创建文本?
    private JCheckBox jc1 = new JCheckBox("1");// 创建复?框
    private JCheckBox jc2 = new JCheckBox("2");// 创建复?框
    private JCheckBox jc3 = new JCheckBox("3");// 创建复?框

    public UICheckBoxTest() {
        Container c = getContentPane();
        setSize(250, 150);
        setVisible(true);
        setTitle("复?框的使?");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c.setLayout(new BorderLayout());

        c.add(panel1, BorderLayout.NORTH);
        final JScrollPane scrollPane = new JScrollPane(jt);
        panel1.add(scrollPane);

        c.add(panel2, BorderLayout.SOUTH);
        panel2.add(jc1);
        jc1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jc1.isSelected())// 如果选择复?框
                    jt.append("复?框1被?中\n");// 向文本区中增加文?
            }
        });

        panel2.add(jc2);
        jc2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jc2.isSelected()) {// 如果选择复?框
                    jt.append("复?框2被?中\n");// 向文本区中增加文?
                }
            }
        });

        panel2.add(jc3);
        jc3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jc3.isSelected()) {// 如果选择复?框
                    jt.append("复?框3被?中\n");// 向文本区中增加文?
                }
            }
        });
    }

    public static void main(String[] args) {
        new UICheckBoxTest();

    }

}
