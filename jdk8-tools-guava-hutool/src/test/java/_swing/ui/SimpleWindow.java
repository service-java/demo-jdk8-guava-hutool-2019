package _swing.ui;

import javax.swing.*; // Needed for Swing classes

/**
 * This class extends the JFrame class. Its constructor displays a simple window
 * with a title. The application exits when the user clicks the close button.
 */

public class SimpleWindow extends JFrame {
    /**
     * Constructor
     */
    final private int WINDOW_WIDTH = 350;
    final private int WINDOW_HEIGHT = 250;

    public SimpleWindow() {

        // Set the title.
        this.setTitle("A Simple Window");

        // Set the size of the window.
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify what happens when the close button is clicked.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window.
        this.setVisible(true);
    }

}
