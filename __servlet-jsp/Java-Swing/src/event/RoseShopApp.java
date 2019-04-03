package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


/**
 * 玫瑰花店
 *
 * @author Luo_0412 骆金?
 */
public class RoseShopApp extends JFrame {
    private static final long serialVersionUID = 1L; // 版本号，与流有关
    final int WINDOW_WIDTH = 600;
    final int WINDOW_HEIGHT = 300; // 窗体长宽
    private int deliverType = 0; // 邮?方?
    private int[] productChoice = {0, 0, 0}; // 选择的产?, 1为被选择?
    private JFrame jf; // 窗体
    private JRadioButton express, mail, pickup; // 邮?方?
    private ButtonGroup group; // 单?按钮组
    private JCheckBox checkBox1, checkBox2, checkBox3; // 复?按?
    private JButton submitBtn, resetBtn; // 提交与重置按?

    /**
     * 窗体绘制
     */
    public RoseShopApp() {
        jf = new JFrame(); // 创建窗体

        initFrame(jf); // 初始化窗?
        buildTitlePanel(jf, "N", "我们为您提供?优质的服?"); // 初始化title
        buildDeliverPanel(jf, "W"); // 初始化邮递方?
        buildProductPanel(jf, "C"); // 初始化产品服?
        buildPricePanel(jf, "E");   // 初始化价格标?
        buildSubmitPanel(jf, "S");  // 字母表示边界布局位置? N -> NORTH

        jf.setVisible(true); // 设置可见
    }

    /**
     * 初始化窗?
     *
     * @param jf
     */
    public void initFrame(JFrame jf) {
        jf.setTitle("玫瑰花店");
        jf.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        jf.setResizable(false); // 不可调整宽度
        jf.setLayout(new BorderLayout());
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * 根据传参判断位置
     *
     * @param jf
     * @param jp
     * @param posType
     */
    public void addPos(JFrame jf, JPanel jp, String posType) {
        switch (posType) {
            case "N":
            case "n":
            case "NORTH":
                jf.add(BorderLayout.NORTH, jp);
                break;
            case "S":
            case "s":
            case "SOUTH":
                jf.add(BorderLayout.SOUTH, jp);
                break;
            case "W":
            case "w":
            case "WEST":
                jf.add(BorderLayout.WEST, jp);
                break;
            case "E":
            case "e":
            case "EAST":
                jf.add(BorderLayout.EAST, jp);
                break;
            case "C":
            case "c":
            case "CENTER":
                jf.add(BorderLayout.CENTER, jp);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Something mistake about your layout!!");
                break;
        }
    }

    /**
     * buildTitlePanel
     *
     * @param jf
     * @param posType
     * @param title
     */
    public void buildTitlePanel(JFrame jf, String posType, String title) {
        JPanel jp = new JPanel();
        JLabel label = new JLabel(title, SwingConstants.CENTER); // 居中

        label.setFont(new Font("微软雅黑", Font.BOLD, 18));
        jp.add(label);

        addPos(jf, jp, posType);
    }

    /**
     * buildDeliverPanel()
     *
     * @param jf
     * @param posType
     */
    public void buildDeliverPanel(JFrame jf, String posType) {
        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(150, 100));
        jp.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        jp.setLayout(new GridLayout(4, 1, 0, 2));

        JLabel label = new JLabel("选择您的邮?方式：", SwingConstants.CENTER);
        label.setFont(new Font("微软雅黑", Font.BOLD, 12));

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JLabel label1 = new JLabel("10?");
        JLabel label2 = new JLabel("  5?");
        JLabel label3 = new JLabel("  0?");

        express = new JRadioButton("快??");
        express.setForeground(Color.blue);
        express.setFont(new Font("微软雅黑", Font.PLAIN, 10));

        mail = new JRadioButton("普邮");
        mail.setForeground(Color.blue);
        mail.setFont(new Font("微软雅黑", Font.PLAIN, 10));

        pickup = new JRadioButton("自提");
        pickup.setForeground(Color.blue);
        pickup.setFont(new Font("微软雅黑", Font.PLAIN, 10));

        jp1.add(express);
        jp1.add(label1);
        jp2.add(mail);
        jp2.add(label2);
        jp3.add(pickup);
        jp3.add(label3);

        // set button group
        group = new ButtonGroup();
        group.add(express);
        group.add(mail);
        group.add(pickup);

        // add action listener to the radioButtons
        express.addActionListener(new RadioButtonListener());
        mail.addActionListener(new RadioButtonListener());
        pickup.addActionListener(new RadioButtonListener());

        express.setSelected(true); // 默认选项

        jp.add(label);
        jp.add(jp1);
        jp.add(jp2);
        jp.add(jp3);

        addPos(jf, jp, posType);
    }

    // 调用自定义的方法 buildProductPanel()
    public void buildProductPanel(JFrame jf, String posType) {
        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(150, 100));
        jp.setLayout(new GridLayout(4, 1, 0, 2));
        jp.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        jp.setBackground(Color.yellow);
        JLabel label = new JLabel("请?择您需要的服务", SwingConstants.CENTER); // 居中
        label.setFont(new Font("微软雅黑", Font.BOLD, 12));

        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.yellow);
        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.yellow);
        JPanel jp3 = new JPanel();
        jp3.setBackground(Color.yellow);

        checkBox1 = new JCheckBox("11朵玫? ------------>");
        checkBox2 = new JCheckBox("精美包装? ---------->");
        checkBox3 = new JCheckBox("贺卡 ----------------->");
        checkBox1.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        checkBox1.setBackground(Color.yellow);
        checkBox2.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        checkBox2.setBackground(Color.yellow);
        checkBox3.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        checkBox3.setBackground(Color.yellow);

        checkBox1.addItemListener(new CheckBoxListener());
        checkBox2.addItemListener(new CheckBoxListener());
        checkBox3.addItemListener(new CheckBoxListener());

        jp1.add(checkBox1);
        jp2.add(checkBox2);
        jp3.add(checkBox3);

        jp.add(label);
        jp.add(jp1);
        jp.add(jp2);
        jp.add(jp3);
        addPos(jf, jp, posType);
    }

    // 调用自定义的方法 buildPricePanel()
    public void buildPricePanel(JFrame jf, String posType) {
        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(150, 100));
        jp.setLayout(new GridLayout(4, 1, 0, 2));
        jp.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        jp.setBackground(Color.green);

        JLabel label = new JLabel("商品价格", SwingConstants.CENTER); // 居中
        label.setFont(new Font("微软雅黑", Font.BOLD, 12));

        JLabel label1 = new JLabel("108?");
        JLabel label2 = new JLabel("28?");
        JLabel label3 = new JLabel("8?");

        jp.add(label);
        jp.add(label1);
        jp.add(label2);
        jp.add(label3);
        addPos(jf, jp, posType);
    }

    // 调用自定义的方法 buildSubmitPanel()
    public void buildSubmitPanel(JFrame jf, String posType) {
        JPanel jp = new JPanel();
        submitBtn = new JButton("提交");
        resetBtn = new JButton("重置");

        jp.add(submitBtn);
        jp.add(resetBtn);

        submitBtn.addActionListener(new CalButtonListener());
        resetBtn.addActionListener(new ResetButtonListener());

        addPos(jf, jp, posType);
    }

    /**
     * 单?按钮监听器
     */
    public class RadioButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == express) {
                deliverType = 0;
            } else if (e.getSource() == mail) {
                deliverType = 1;
            } else {
                deliverType = 2;
            }

            System.out.println(deliverType);
        }
    }

    /**
     * 复?按钮监听器
     */
    public class CheckBoxListener implements ItemListener {

        //@Override
        public void itemStateChanged(ItemEvent arg0) {
            if (checkBox1.isSelected()) {
                productChoice[0] = 1;
            } else {
                productChoice[0] = 0;
            }

            if (checkBox2.isSelected()) {
                productChoice[1] = 1;
            } else {
                productChoice[1] = 0;
            }

            if (checkBox3.isSelected()) {
                productChoice[2] = 1;
            } else {
                productChoice[2] = 0;
            }
        }

    }

    /**
     * 计算按钮监听?
     */
    public class CalButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (productChoice[0] + productChoice[1] + productChoice[2] == 0) {
                JOptionPane.showMessageDialog(null, "抱歉，请问您?要什么服???");
            } else {
                int sum = 0;
                if (deliverType == 0) {
                    sum += 10;
                } else if (deliverType == 1) {
                    sum += 5;
                }

                sum += productChoice[0] * 108
                        + productChoice[1] * 28
                        + productChoice[2] * 8;
                JOptionPane.showMessageDialog(null, "?支付" + sum + "?");
            }
        }
    }

    /**
     * 重置按钮监听?
     */
    public class ResetButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            express.setSelected(true);
            mail.setSelected(false);
            pickup.setSelected(false);

            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
        }
    }


    /**
     * main方法
     *
     * @param args
     */
    public static void main(String[] args) {
        new RoseShopApp(); // 启动窗口
    }

}
