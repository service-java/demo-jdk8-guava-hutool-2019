package mvelTest;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CalculateUtilsTest {

    /**
     * 20 * 100 - ( 30 -20 ) + 20 ^ 3 + 20/2
     */
    @Test
    public void calculateTest4() {

        String formula = "A * B - (C -D) + E.pow(F) + G / H";

        Map<String, Object> variables = new HashMap<>();
        variables.put("A", "20");
        variables.put("B", 100L);
        variables.put("C", 30.0D);
        variables.put("D", 20);
        variables.put("E", new BigDecimal("20"));
        variables.put("F", "3");
        variables.put("G", "20");
        variables.put("H", "2");

        BigDecimal result = CalculateUtils.calculate(formula, variables);
        Assert.assertTrue(new BigDecimal("10000.0").compareTo(result) == 0);
    }

}
