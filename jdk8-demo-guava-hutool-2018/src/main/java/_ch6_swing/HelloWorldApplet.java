package _ch6_swing;

import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        g.drawString("HibernateValidateTest World", 25, 50);
    }
}
