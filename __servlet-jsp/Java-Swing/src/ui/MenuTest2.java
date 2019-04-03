package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;

public class MenuTest2 extends JFrame {
    private static final long serialVersionUID = 1L;
    final int WINDOW_WIDTH = 500;
    final int WINDOW_HEIGHT = 200;

    private JMenuBar menuBar;
    private JMenu fileMenu, textMenu;
    private JMenuItem exitItem;
    private JRadioButtonMenuItem blackItem;
    private JRadioButtonMenuItem redItem;
    private JRadioButtonMenuItem blueItem;
    private JLabel label;
    private JCheckBoxMenuItem visible;

    private ButtonGroup group;

    public MenuTest2() {
        setTitle("Menu Test");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // build a menu bar
        buildMenuBar();

        // add the menu bar to the window
        setJMenuBar(menuBar);

        // add a label
        label = new JLabel("Give me some color see see", SwingConstants.CENTER);
        label.setFont(new Font("微软雅黑", Font.BOLD, 24));
        add(label);

        // show the window
        setVisible(true);
    }

    public void buildMenuBar() {
        menuBar = new JMenuBar();
        buildFileMenu();
        buildTextMenu();

        menuBar.add(fileMenu);
        menuBar.add(textMenu);
    }

    public void buildFileMenu() {
        fileMenu = new JMenu("File");
        exitItem = new JMenuItem("exit");

        fileMenu.add(exitItem);
        exitItem.addActionListener(new ExitItemListener());
    }

    public void buildTextMenu() {
        textMenu = new JMenu("Text");

        blackItem = new JRadioButtonMenuItem("black", true);
        redItem = new JRadioButtonMenuItem("red");
        blueItem = new JRadioButtonMenuItem("blue");

        group = new ButtonGroup();
        group.add(blackItem);
        group.add(redItem);
        group.add(blueItem);

        visible = new JCheckBoxMenuItem("visible", true);
        visible.addActionListener(new VisibleItemListener());

        textMenu.add(blackItem);
        textMenu.add(redItem);
        textMenu.add(blueItem);
        textMenu.addSeparator(); // 加上分隔线
        textMenu.add(visible);

        blackItem.addActionListener(new ColorItemsListener());
        redItem.addActionListener(new ColorItemsListener());
        blueItem.addActionListener(new ColorItemsListener());
    }

    public class ExitItemListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            System.exit(0);
        }
    }

    public class ColorItemsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == blackItem) {
                label.setForeground(Color.BLACK);
            } else if (e.getSource() == redItem) {
                label.setForeground(Color.RED);
            } else if (e.getSource() == blueItem) {
                label.setForeground(Color.BLUE);
            }
        }
    }

    public class VisibleItemListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            if (visible.isSelected()) {
                label.setVisible(true);
            } else {
                label.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        new MenuTest2();
    }

}
