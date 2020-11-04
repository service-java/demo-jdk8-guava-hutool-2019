package _ch6_swing.event;

import java.awt.*;
import java.awt.event.*;

class MyWindow extends Frame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    TextField text1, text2, text3;

    MyWindow() {
        setLayout(new FlowLayout());
        text1 = new TextField(8);
        text2 = new TextField(8);
        text3 = new TextField(15);
        add(text1);
        add(text2);
        add(text3);
        text1.addActionListener(this);//这里两个this是指win??为什么不能写win?不用this还可以?么??
        text2.addActionListener(this);
        setBounds(100, 100, 150, 150);
        setVisible(true);
        validate();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == text1) {
            String word = text1.getText();
            if (word.equals("boy")) {
                text3.setText("男孩");
            } else if (word.equals("女孩")) {
                text3.setText("girl");
            } else if (word.equals("太阳")) {
                text3.setText("sun");
            } else {
                text3.setText("没有该单?");
            }
        } else if (e.getSource() == text2) {
            String word = text2.getText();
            if (word.equals("男孩")) {
                text3.setText("boy");
            } else if (word.equals("女孩")) {
                text3.setText("girl");
            } else if (word.equals("太阳")) {
                text3.setText("sun");
            } else {
                text3.setText("没有该单?");
            }
        }
    }
}

public class MyWindowExample {
    public static void main(String args[]) {
        new MyWindow();
    }
}
