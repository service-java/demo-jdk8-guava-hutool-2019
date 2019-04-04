package _swing.ui;
//import java.awt.Frame;
//import java.awt.Toolkit;

import javax.swing.*;   // Needed for Swing classes

/**
 * This program displays a simple window with a title. The
 * application exits when the user clicks the close button.
 */

public class ShowWindow {
    public static void main(String[] args) {

        // Create a window.
        JFrame window = new JFrame();

        // Set the title.
        window.setTitle("A Simple Window");

        // Set the size of the window.
        window.setSize(350, 250);

        // Specify what happens when the close button is clicked.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window.
        window.setVisible(true);

    }
}
