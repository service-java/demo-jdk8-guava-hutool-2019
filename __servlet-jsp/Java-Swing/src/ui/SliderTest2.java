package ui;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

/**
 * This class displays a window with a slider component. The user can convert
 * Celsius temperatures from 0 through 100 to Fahrenheit by moving the slider.
 */

public class SliderTest2 extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JLabel fLabel, cLabel; // Message labels
    private JTextField fTextField, cTextField; // textFields containing
    // temperatures
    private JSlider slider; // Temperature adjuster

    private JPanel fPanel, cPanel; // panels containing labels and textFields
    private JPanel sliderPanel; // Slider panel


    /**
     * Constructor
     */
    public SliderTest2() {

        // Set the title.
        setTitle("Temperature Converter");

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a GridLayout manager.
        setLayout(new GridLayout(3, 1));

        // create a slider panel to contain a slider
        buildSliderPanel();

        // Create a Fahrenheit panel to contain the fLabel and fTextField
        buildFPanel();

        // Create a Celsius panel to contain the cLabel and cTextField
        buildCPanel();

        // Add the panels to the content pane.
        add(fPanel);
        add(cPanel);
        add(sliderPanel);

        // Pack and display the frame.
        pack();
        setVisible(true);
    }

    public void buildFPanel() {
        // Create the message label.
        fLabel = new JLabel("Fahrenheit: ");
        fLabel.setFont(new Font("", Font.PLAIN, 24));

        // create textField containing a Fahrenheit temperature;
        fTextField = new JTextField("32", 10);
        fTextField.setEditable(false);
        fTextField.setFont(new Font("", Font.PLAIN, 24));

        // create a panel and put the label in it
        fPanel = new JPanel();
        fPanel.add(fLabel);
        fPanel.add(fTextField);
    }

    public void buildCPanel() {
        // Create the message label.
        cLabel = new JLabel("Celsius: ");
        cLabel.setFont(new Font("", Font.PLAIN, 24));

        // create textField containing a Celsius temperature;
        cTextField = new JTextField("0", 10);
        cTextField.setEditable(false);
        cTextField.setFont(new Font("", Font.PLAIN, 24));

        // create a panel and put the label in it
        cPanel = new JPanel();
        cPanel.add(cLabel);
        cPanel.add(cTextField);
    }

    public void buildSliderPanel() {
        // Create the slider.
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);

        // set the size of the slider
        //slider.setPreferredSize(new Dimension(400, 80));
        slider.setMajorTickSpacing(20); // Major tick every 20
        slider.setMinorTickSpacing(5); // Minor tick every 5
        slider.setPaintTicks(true); // Display tick marks
        slider.setPaintLabels(true); // Display numbers
        slider.setFont(new Font("", Font.PLAIN, 20)); // Change the font size
        // of the major tick
        // label
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
    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            double celsius, fahrenheit;

            // Get the slider value.
            celsius = slider.getValue();

            // calculate the fahrenheit based on the celsius
            fahrenheit = 32 + celsius * 9 / 5;

            // Store the sliderValue in the label.
            cTextField.setText(String.valueOf(celsius));
            fTextField.setText(String.valueOf(fahrenheit));
        }
    }

    /*
     * The main method creates an instance of the class, which displays a window
     * with a slider.
     */
    public static void main(String[] args) {
        new SliderTest2();
    }
}