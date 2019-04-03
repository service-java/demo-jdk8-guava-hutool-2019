package event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class TipOfDay extends JDialog {

    /**
     *
     */
    private static final long serialVersionUID = -6493879146336970741L;
    private final JPanel contentPanel = new JPanel();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        try {
            TipOfDay dialog = new TipOfDay();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public TipOfDay() {
        setTitle("\u4ECA\u65E5\u63D0\u793A");// 设置对话框的标题
        setBounds(100, 100, 450, 300);// 设置对话框的大小和位?
        getContentPane().setLayout(new BorderLayout()); // 设置对话框的布局是边框布?
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));// 设置边框是空边框，宽度是5
        getContentPane().add(contentPanel, BorderLayout.CENTER);// 在中央增加面板contentPanel
        contentPanel.setLayout(new BorderLayout(0, 0));// 设置中央面板中空白大小是0
        {
            JPanel panel = new JPanel();// 创建新的panel面板
            contentPanel.add(panel, BorderLayout.NORTH);// 在contentPanel中增加panel
            {
                JLabel label = new JLabel("\u4ECA\u65E5\u63D0\u793A");// 创建标签
                panel.add(label);// 在panel中增加标?
            }
        }
        {
            JPanel panel = new JPanel();// 创建新的panel面板
            contentPanel.add(panel, BorderLayout.SOUTH);// 在南方增加一个?择?
            panel.setLayout(new BorderLayout(0, 0));
            {
                JCheckBox checkBox = new JCheckBox("\u4E0D\u518D\u663E\u793A");
                panel.add(checkBox);
            }
        }
        {
            JPanel panel = new JPanel();// 创建新的panel面板
            contentPanel.add(panel, BorderLayout.WEST);// 在西方增加一个空面板占位
        }
        {
            JPanel panel = new JPanel();// 创建新的panel面板
            contentPanel.add(panel, BorderLayout.EAST);// 在东方增加一个空面板占位
        }
        {
            JScrollPane scrollPane = new JScrollPane();
            contentPanel.add(scrollPane, BorderLayout.CENTER);
            {
                JTextArea textArea = new JTextArea();// 利用文本域来显示主要的信?
                textArea.setFont(new Font("微软雅黑", Font.PLAIN, 14));
                textArea.setLineWrap(true);
                textArea.setText("公司?介：吉林省明日科?有限公司是一家以计算机软件技术为核心的高科技型企业，公司创建?1999?12月，是专业的应用软件?发商和服务提供商。多年来始终致力于行业管理软件开发?数字化出版物开发制作?行业电子商务网站开发等，先后成功开发了涉及生产、管理?物流?营?、服务等领域的多种企业管理应用软件和应用平台?");
                scrollPane.setViewportView(textArea);
            }
        }
        {
            JPanel buttonPane = new JPanel();// 创建新的panel面板
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);// 增加按钮面板buttonPane
            {
                JButton okButton = new JButton("\u4E0B\u6761\u4FE1\u606F");
                okButton.setActionCommand("OK");
                buttonPane.add(okButton); // 增加“下?条?按?
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton cancelButton = new JButton("\u5173\u95ED\u7A97\u4F53");
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);// 增加“关闭?按?
            }
        }
    }

}
