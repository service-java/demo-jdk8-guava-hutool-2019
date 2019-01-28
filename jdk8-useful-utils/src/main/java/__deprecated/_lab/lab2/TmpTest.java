package __deprecated._lab.lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TmpTest {

    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("HH时mm分ss?").format(
                new Date(System.currentTimeMillis())));
        System.out.println(System.currentTimeMillis());
    }

}
