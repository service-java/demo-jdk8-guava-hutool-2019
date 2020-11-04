package _ch6_swing.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChooser extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final int WINDOW_WIDTH = 300;
    final int WINDOW_HEIGHT = 200;

    JPanel panel;
    JButton button;

    public ColorChooser() {
        // set the title of the window
        setTitle("Color Chooser");

        // set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // specify an action for the close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a panel
        panel = new JPanel();

        // not use the layout manager for the panel
        panel.setLayout(null);

        // create a button
        button = new JButton("Change Color");

        // set the location and size of the button
        button.setBounds(85, 60, 120, 30);

        // register the Action Listener
        button.addActionListener(new ChangeColor());

        // put the button in the panel
        panel.add(button);

        // put the panel in the window
        add(panel);

        // show the window
        setVisible(true);
    }

    /**
     * The class handles the event when
     * the user click the change color button.
     */
    public class ChangeColor implements ActionListener {
        //@Override
        public void actionPerformed(ActionEvent arg0) {
            Color selectedColor = JColorChooser.showDialog(null,
                    "Select a Background Color", Color.BLUE);
            panel.setBackground(selectedColor);
            //button.setForeground(selectedColor);
        }
    }

    public static void main(String[] args) {
        new ColorChooser();

    }

}
