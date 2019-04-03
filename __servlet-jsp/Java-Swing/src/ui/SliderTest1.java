package ui;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;

/**
 * This class displays a window with a slider component.
 * The user can choose a value from 0 through 100 by moving the
 * slider.
 */

public class SliderTest1 extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JLabel label; // Message labels
    private JPanel labelPanel; // label panel
    private JPanel sliderPanel; // Slider panel
    private JSlider slider; // Temperature adjuster

    /**
     * Constructor
     */
    public SliderTest1() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error setting the look and feel.");
            System.exit(0);
        }

        // Set the title.
        setTitle("Slider Test");

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a GridLayout manager.
        setLayout(new GridLayout(2, 1));

        // Create a label panel to contain a label
        buildSliderPanel();

        // create a slider panel to contain a slider
        buildLabelPanel();

        // Add the panels to the content pane.
        add(labelPanel);
        add(sliderPanel);

        // Pack and display the frame.
        pack();
        setVisible(true);
    }

    public void buildLabelPanel() {
        // Create the message labels.
        label = new JLabel(String.valueOf(slider.getValue()));
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        label.setFont(new Font("", Font.PLAIN, 24));

        // create a panel and put the label in it
        labelPanel = new JPanel();
        labelPanel.add(label);
    }

    public void buildSliderPanel() {
        // Create the slider.
        slider = new JSlider(JSlider.VERTICAL, 0, 100, 30);
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(false);
        slider.setPaintLabels(false);

        // create a panel and put the slider in it
        sliderPanel = new JPanel();
        sliderPanel.add(slider);

        // register the change listener to the slider
        slider.addChangeListener(new SliderListener());
    }

    /**
     * Private inner class to handle the change events that are generated when
     * the slider is moved.
     */
    public class SliderListener implements ChangeListener {
        //@Override
        public void stateChanged(ChangeEvent arg0) {
            double sliderValue = 0;
            sliderValue = slider.getValue();
            label.setText(Double.toString(sliderValue));
        }

    }


    /*
     * The main method creates an instance of the class, which displays a window
     * with a slider.
     */
    public static void main(String[] args) {
        new SliderTest1();
    }
}