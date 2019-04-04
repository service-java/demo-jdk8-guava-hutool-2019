package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;

import napkin.NapkinLookAndFeel;
import components.FontHelper;
import util.LoginStatusHelper;
import db.MySQLDBHelper;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private int WINDOW_WIDTH = 810;
    private int WINDOW_HEIGHT = 500; // 窗体长宽

    private JPanel navigatorPanel;
    //	private OperateStuInfoPanel firstPanel;
    private GridBagLayoutTest firstPanel;
    //	private QueryStuInfoPanel secondPanel;
    private GridBagLayoutTest2 secondPanel;

    private ResetPwdPanel resetPwdPanel;
    private JLabel firstLabel, secondLabel, resetPwdLabel;

    private JMenuBar menuBar;
    private JMenu fileMenu, countMenu, styleMenu, gradeItem;
    private JMenuItem exitItem;
    private JMenuItem highestScoreItem, averageScoreItem, lowestScoreItem;
    private JMenuItem stuNumItem;
    private ButtonGroup group;
    private JRadioButtonMenuItem metalItem, motifItem, windowsItem, nimbusItem;
    private JRadioButtonMenuItem napkinItem, beautyEyeItem;


    public MainFrame() {
        this.setTitle("学生管理系统    当前登录用户：" + LoginStatusHelper.getUserName());
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLayout(new BorderLayout(10, 10));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FontHelper.InitGlobalFont(new Font("微软雅黑", Font.BOLD, 14));

        buildMenuBar();
        setJMenuBar(menuBar);

        buildNavigatorPanel(); // 左侧导航区
        buildOtherPanels(); // 右侧操作区

        this.add(navigatorPanel, BorderLayout.WEST);
        this.add(firstPanel, BorderLayout.CENTER);
        this.add(secondPanel, BorderLayout.CENTER);
        this.add(resetPwdPanel, BorderLayout.CENTER);

        this.setVisible(true); // show the window

        // 默认显示第一块面板
        MainFrame.this.add(firstPanel, BorderLayout.CENTER);
        firstPanel.setVisible(true);
        firstLabel.setForeground(Color.red);
    }

    public void buildMenuBar() {
        menuBar = new JMenuBar();
        buildFileMenu();
        buildCountMenu();
        buildStyleMenu();

        menuBar.add(fileMenu);
        menuBar.add(countMenu);
        menuBar.add(styleMenu);
    }

    public void buildFileMenu() {
        fileMenu = new JMenu("文件");
        exitItem = new JMenuItem("退出系统");
        exitItem.addActionListener(new ExitItemListener());

        fileMenu.add(exitItem);
    }

    public void buildCountMenu() {
        countMenu = new JMenu("统计");
        gradeItem = new JMenu("各科成绩");

        averageScoreItem = new JMenuItem("各科平均分");
        highestScoreItem = new JMenuItem("各科最高分");
        lowestScoreItem = new JMenuItem("各科最低分");
        stuNumItem = new JMenuItem("学生人数");
        averageScoreItem.addActionListener(new gradeItemsListener());
        highestScoreItem.addActionListener(new gradeItemsListener());
        lowestScoreItem.addActionListener(new gradeItemsListener());
        stuNumItem.addActionListener(new gradeItemsListener());

        gradeItem.add(averageScoreItem);
        gradeItem.add(highestScoreItem);
        gradeItem.add(lowestScoreItem);

        countMenu.add(gradeItem);
        countMenu.addSeparator(); // 加上分隔线
        countMenu.add(stuNumItem);
    }

    public void buildStyleMenu() {
        styleMenu = new JMenu("换肤");

        metalItem = new JRadioButtonMenuItem("Metal", true);
        motifItem = new JRadioButtonMenuItem("Motif");
        windowsItem = new JRadioButtonMenuItem("Windows");
        nimbusItem = new JRadioButtonMenuItem("Nimbus");
        napkinItem = new JRadioButtonMenuItem("餐巾纸");
        beautyEyeItem = new JRadioButtonMenuItem("beautyEye");

        group = new ButtonGroup();
        group.add(metalItem);
        group.add(motifItem);
        group.add(windowsItem);
        group.add(nimbusItem);
        group.add(napkinItem);
        group.add(beautyEyeItem);

        styleMenu.add(metalItem);
        styleMenu.add(motifItem);
        styleMenu.add(windowsItem);
        styleMenu.add(nimbusItem);
        styleMenu.add(napkinItem);
        styleMenu.add(beautyEyeItem);


        motifItem.addActionListener(new styleItemsListener());
        windowsItem.addActionListener(new styleItemsListener());
        nimbusItem.addActionListener(new styleItemsListener());
        napkinItem.addActionListener(new styleItemsListener());
        beautyEyeItem.addActionListener(new styleItemsListener());
    }


    public void buildNavigatorPanel() {
        navigatorPanel = new JPanel();

        Border insideBorder = BorderFactory.createEmptyBorder(20, 0, 0, 0); // 设置边框来控制外观以及上下左右边距
        Border outsideBorder = BorderFactory.createLoweredBevelBorder();

        navigatorPanel.setBorder(BorderFactory.createCompoundBorder(
                outsideBorder, insideBorder));
        navigatorPanel.setPreferredSize(new Dimension(150, 500));

        // create label objects for navigator
        firstLabel = new JLabel("操作", SwingConstants.CENTER);
        firstLabel.setPreferredSize(new Dimension(150, 30));
        firstLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 当鼠标移到标签上时显示手型图标

        secondLabel = new JLabel("查询", SwingConstants.CENTER);
        secondLabel.setPreferredSize(new Dimension(150, 30));
        secondLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        resetPwdLabel = new JLabel("重置密码", SwingConstants.CENTER);
        resetPwdLabel.setPreferredSize(new Dimension(150, 30));
        resetPwdLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // add the labels to the panel
        navigatorPanel.add(firstLabel);
        navigatorPanel.add(secondLabel);
        navigatorPanel.add(resetPwdLabel);

        // register action listener for the navigator labels
        firstLabel.addMouseListener(new LabelClick());
        secondLabel.addMouseListener(new LabelClick());
        resetPwdLabel.addMouseListener(new LabelClick());
    }

    public void buildOtherPanels() {
        // 下面创建两个面板对象，它们将会显示在同一个区域，但同一时刻只有一个可见
//		firstPanel = new OperateStuInfoPanel();
        firstPanel = new GridBagLayoutTest();
        firstPanel.setVisible(true);

//		secondPanel = new QueryStuInfoPanel();
        secondPanel = new GridBagLayoutTest2();
        secondPanel.setVisible(false);

        resetPwdPanel = new ResetPwdPanel();
        resetPwdPanel.setVisible(false);
    }

    public class LabelClick extends MouseAdapter {
        //@Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == firstLabel) {
                firstLabel.setForeground(Color.red);
                secondLabel.setForeground(Color.black);
                resetPwdLabel.setForeground(Color.black);

                // show the first panel
                if (!firstPanel.isVisible()) {
                    MainFrame.this.add(firstPanel, BorderLayout.CENTER);
                    firstPanel.setVisible(true);
                }

                secondPanel.setVisible(false);
                resetPwdPanel.setVisible(false);
            } else if (e.getSource() == secondLabel) {
                // the label clicked is set to red, other labels are black
                secondLabel.setForeground(Color.red);
                firstLabel.setForeground(Color.black);
                resetPwdLabel.setForeground(Color.black);

                // show the second panel
                if (!secondPanel.isVisible()) {
                    MainFrame.this.add(secondPanel, BorderLayout.CENTER);
                    secondPanel.setVisible(true);
                }
                firstPanel.setVisible(false);
                resetPwdPanel.setVisible(false);
            } else if (e.getSource() == resetPwdLabel) {
                secondLabel.setForeground(Color.black);
                firstLabel.setForeground(Color.black);
                resetPwdLabel.setForeground(Color.red);

                // show the second panel
                if (!resetPwdPanel.isVisible()) {
                    MainFrame.this.add(resetPwdPanel, BorderLayout.CENTER);
                    resetPwdPanel.setVisible(true);
                }
                firstPanel.setVisible(false);
                secondPanel.setVisible(false);
            }
        }
    }

    /**
     * 外观 https://my.oschina.net/muffe/blog/181726
     * 餐巾纸 http://www.programgo.com/article/3033578008/
     *
     * @author Luo_0412
     */
    public class styleItemsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == metalItem) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(MainFrame.this); // 注意上下文环境
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
                    System.exit(0);
                }
            } else if (e.getSource() == motifItem) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(MainFrame.this); // 注意上下文环境
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
                    System.exit(0);
                }
            } else if (e.getSource() == windowsItem) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(MainFrame.this); // 注意上下文环境
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
                    System.exit(0);
                }
            } else if (e.getSource() == nimbusItem) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(MainFrame.this); // 注意上下文环境
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
                    System.exit(0);
                }
            } else if (e.getSource() == napkinItem) {
                try {
//			    	UIManager.setLookAndFeel("net.sourceforge.napkinlaf.NapkinLookAndFeel");
                    UIManager.setLookAndFeel(new NapkinLookAndFeel());
                    SwingUtilities.updateComponentTreeUI(MainFrame.this);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (e.getSource() == beautyEyeItem) {
                try {
                    org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
                    SwingUtilities.updateComponentTreeUI(MainFrame.this);
                } catch (Exception e2) {

                }
            }
        }
    }

    public class gradeItemsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = "";
            if (e.getSource() == averageScoreItem) {
                MySQLDBHelper mysqlHelper = new MySQLDBHelper();
                mysqlHelper.queryDB("select avg(chinese),avg(math),avg(english) from stu_info");
                output += "语文平均分：" + mysqlHelper.getTableData()[0][0] + "\n";
                output += "数学平均分：" + mysqlHelper.getTableData()[0][1] + "\n";
                output += "英语平均分：" + mysqlHelper.getTableData()[0][1] + "\n";

                JOptionPane.showMessageDialog(null, output);
            } else if (e.getSource() == highestScoreItem) {
                MySQLDBHelper mysqlHelper = new MySQLDBHelper();
                mysqlHelper.queryDB("select max(chinese),max(math),max(english) from stu_info");
                output += "语文最高分：" + mysqlHelper.getTableData()[0][0] + "\n";
                output += "数学最高分：" + mysqlHelper.getTableData()[0][1] + "\n";
                output += "英语最高分：" + mysqlHelper.getTableData()[0][1] + "\n";

                JOptionPane.showMessageDialog(null, output);
            } else if (e.getSource() == lowestScoreItem) {
                MySQLDBHelper mysqlHelper = new MySQLDBHelper();
                mysqlHelper.queryDB("select min(chinese),min(math),min(english) from stu_info");
                output += "语文最低分：" + mysqlHelper.getTableData()[0][0] + "\n";
                output += "数学最低分：" + mysqlHelper.getTableData()[0][1] + "\n";
                output += "英语最低分：" + mysqlHelper.getTableData()[0][1] + "\n";
                JOptionPane.showMessageDialog(null, output);
            } else if (e.getSource() == stuNumItem) {
                MySQLDBHelper mysqlHelper = new MySQLDBHelper();
                mysqlHelper.queryDB("select count(stu_id) from stu_info");
                output += "学生总人数：" + mysqlHelper.getTableData()[0][0] + "\n";

                JOptionPane.showMessageDialog(null, output);
            }
        }
    }

    public class ExitItemListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            System.exit(0);
        }
    }

//	public static void main(String[] args) {
//		new MainFrame();
//	}

}
