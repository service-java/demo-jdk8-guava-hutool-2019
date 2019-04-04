package _swing.event;

import javax.swing.JFrame;

public class SimpleWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    private final int WINDOW_WIDTH = 450;
    private final int WINDOW_HEIGHT = 350;

    public SimpleWindow() {
        this.setTitle("hello swing!!");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
//		new SimpleWindow();
//		MyDialog dialog = new MyDialog();
//        dialog.setVisible(true); // 显示对话?
    }

}
