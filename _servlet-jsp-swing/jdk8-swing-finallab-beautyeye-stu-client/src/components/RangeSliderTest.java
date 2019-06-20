package components;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RangeSliderTest extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel rangeSliderValue1;
    private RangeSlider rangeSlider;

    public RangeSliderTest() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Range Slider Demo");
        setBounds(400, 60, 600, 400);
        setLayout(new FlowLayout());

        rangeSlider = new RangeSlider();
        add(rangeSlider);
        rangeSlider.setPreferredSize(new Dimension(240, 100));
        rangeSlider.setMinimum(0);
        rangeSlider.setMaximum(100);
        rangeSlider.setValue(0);
        rangeSlider.setUpperValue(100);
        rangeSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
//                RangeSlider slider = (RangeSlider) e.getSource();
                rangeSliderValue1.setText(rangeSlider.getValue() + "<= grade <=" + rangeSlider.getUpperValue());
            }
        });

        rangeSliderValue1 = new JLabel();
        rangeSliderValue1.setText(rangeSlider.getValue() + "<= grade <=" + rangeSlider.getUpperValue());
        add(rangeSliderValue1);


        setVisible(true);
    }

    public static void main(String[] args) {
        new RangeSliderTest();
    }

}
