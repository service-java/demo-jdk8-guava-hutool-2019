package _swing.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonTest extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 100;
    JLabel label;
    JRadioButton male;
    JRadioButton female;
    JPanel panel;

    public JRadioButtonTest() {
        // set the title of the window
        // this.setTitle("Gender");

        // set the size of the window
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLocation(300, 300);
//		this.setBounds(300, 300, WINDOW_WIDTH, WINDOW_HEIGHT);

        // specify an action for the close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // build a panel
        buildPanel();

        // add the panel to the Frame(content panel)
        add(panel);

        // display the window
        this.setVisible(true);

    }

    public void buildPanel() {
        // create a panel
        panel = new JPanel();

        // create a label
        label = new JLabel("hello");
        label.setFont(new Font("consolas", Font.BOLD, 24));

        // create RadioButtons
        male = new JRadioButton("male");
        female = new JRadioButton("female");
        male.setFont(new Font("consolas", Font.PLAIN, 24));
        female.setFont(new Font("consolas", Font.PLAIN, 24));

        // add label and radioButtons to the panel
        panel.add(label);
        panel.add(male);
        panel.add(female);

        // set button group
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        // add action listener to the radioButtons
        male.addActionListener(new RadioButtonListener());
        female.addActionListener(new RadioButtonListener());
    }

    public class RadioButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == male) {
                JOptionPane.showMessageDialog(panel, "?");
            } else if (e.getSource() == female) {
                JOptionPane.showMessageDialog(panel, "?");
            }
        }
    }

    public static void main(String[] args) {
        new JRadioButtonTest();

    }

}
