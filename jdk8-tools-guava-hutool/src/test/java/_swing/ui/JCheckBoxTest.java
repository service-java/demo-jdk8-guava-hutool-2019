package _swing.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//import javax.swing.BorderFactory;
//import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JCheckBoxTest extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final int WINDOW_WIDTH = 700;
    final int WINDOW_HEIGHT = 130;
    JTextField textField;
    JCheckBox checkBox1, checkBox2, checkBox3;
    JPanel panelNorth;
    JPanel panelCenter;

    public JCheckBoxTest() {
        // set the title of the window
        this.setTitle("Using checkbox");

        // set the size of the window
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // specify an action for the close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set layout for the content panel
        this.setLayout(new BorderLayout());

        // build panels
        buildPanel();

        // add the panels to the Frame
        add(panelNorth, BorderLayout.NORTH);
        add(panelCenter, BorderLayout.SOUTH);

        // pack();
        // display the window
        this.setVisible(true);

    }

    public void buildPanel() {
        // create panels
        panelNorth = new JPanel();
        panelCenter = new JPanel();

        // create a label of 50 characters width
        textField = new JTextField(50);
        textField.setFont(new Font("consolas", Font.BOLD, 24));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLUE);
        textField.setEditable(false);

        //panelNorth.setBackground(Color.red);

        // create checkBoxs
        checkBox1 = new JCheckBox("1");
        checkBox2 = new JCheckBox("2");
        checkBox3 = new JCheckBox("3");
        checkBox1.setFont(new Font("consolas", Font.PLAIN, 24));
        checkBox2.setFont(new Font("consolas", Font.PLAIN, 24));
        checkBox3.setFont(new Font("consolas", Font.PLAIN, 24));

        // add the label to the panelNorth
        panelNorth.add(textField);

        // add label and radioButton to the panelCenter
        panelCenter.add(checkBox1);
        panelCenter.add(checkBox2);
        panelCenter.add(checkBox3);
        //panelCenter.setBackground(Color.BLUE);
        //panelCenter.setBorder(BorderFactory.createLineBorder(Color.red,2));

        // add ItemListener to the checkBoxs
        checkBox1.addItemListener(new CheckBoxListener());
        checkBox2.addItemListener(new CheckBoxListener());
        checkBox3.addItemListener(new CheckBoxListener());

        // click checkBox1 by codes
        checkBox2.doClick();


    }

    public class CheckBoxListener implements ItemListener {

        //@Override
        public void itemStateChanged(ItemEvent arg0) {
            // declare a String variable to contain the checkBoxs infromation
            String str = "";

            // determine if the checkBoxs are checked
            if (checkBox1.isSelected()) {
                str += " select 1";
            }
            if (checkBox2.isSelected()) {
                str += " select 2 ";
            }
            if (checkBox3.isSelected()) {
                str += " select 3 ";
            }
            // put the checkBoxs information in the textField
            textField.setText(str.trim());
        }

    }

    public static void main(String[] args) {
        new JCheckBoxTest();

    }

}
