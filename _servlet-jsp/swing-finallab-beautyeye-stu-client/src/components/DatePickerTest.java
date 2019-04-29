package components;

import javax.swing.JFrame;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


public class DatePickerTest extends JFrame {

    private static final long serialVersionUID = 1L;

    public DatePickerTest() {
        setBounds(0, 0, 400, 200);

        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

        add(datePicker);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DatePickerTest();
    }

}
