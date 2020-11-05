package _ch6_swing.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;


public class MenuTest1 extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final int WINDOW_WIDTH = 500;
    final int WINDOW_HEIGHT = 200;

    private JMenuBar menuBar;
    private JMenu fileMenu, textMenu;
    private JMenuItem exitItem;
    private JMenuItem blackItem;
    private JMenuItem redItem;
    private JMenuItem blueItem;
    private JLabel label;

    public MenuTest1() {
        // set title for the window
        setTitle("Menu Test");

        // set size and location for the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // specify the action for the close button
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // build a menu bar
        buildMenuBar();

        // add the menu bar to the window
        setJMenuBar(menuBar);

        // add a label
        label = new JLabel("Give me some color see see", SwingConstants.CENTER);
        label.setFont(new Font("", Font.BOLD, 24));
        add(label);

        // show the window
        setVisible(true);
    }

    public void buildMenuBar() {
        // create a menu bar
        menuBar = new JMenuBar();

        // create a File menu
        buildFileMenu();

        // create a Text menu
        buildTextMenu();

        // add the file menu and text menu to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(textMenu);
    }

    public void buildFileMenu() {
        // create file menu
        fileMenu = new JMenu("File");

        // create exit menu item
        exitItem = new JMenuItem("exit");

        // add the exit menu item to the file menu
        fileMenu.add(exitItem);

        // add register action listener for exitItem
        exitItem.addActionListener(new ExitItemListener());
    }

    public void buildTextMenu() {
        // create text menu
        textMenu = new JMenu("Text");
        exitItem = new JMenuItem("exit");
        // create the black, red, and blue menu items
        blackItem = new JMenuItem("black");
        redItem = new JMenuItem("red");
        blueItem = new JMenuItem("blue");

        // put the menu items in the text menu
        textMenu.add(blackItem);
        textMenu.add(redItem);
        textMenu.add(blueItem);
        textMenu.add(exitItem);
        // register action listener for the items
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
        //@Override
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

    public static void main(String[] args) {
        new MenuTest1();

    }

}
